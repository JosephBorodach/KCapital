package com.KCapital.investments.tradingsystem;

import java.time.*;
import java.util.*;

import net.jacobpeterson.alpaca.model.endpoint.orders.Order;

import net.jacobpeterson.alpaca.model.endpoint.orders.enums.CurrentOrderStatus;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderSide;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderTimeInForce;

import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.quote.StockQuote;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.historical.quote.Quote;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.quote.StockQuotesResponse;


public class MarketMakingStrategy {
    public static final String SYMBOL = "AAPL";
    private static final double SPREAD = 0.01; // 1 cent spread
    private static final int POSITION_LIMIT = 1000; // maximum position size in shares
    private static final double POSITION_ENTRY_SIZE = 100; // position size for each trade in shares
    private static final double TRADE_SIZE = 10.0; // size of each individual buy/sell order in shares
    public static final double MIN_PRICE = 100.0; // minimum price to place buy orders
    public static final double MAX_PRICE = 150.0; // maximum price to place sell orders

    public AlpacaAPI alpacaAPI;
    private List<Order> openOrders;
    private double bidPrice, askPrice;

    public MarketMakingStrategy(AlpacaAPI alpacaAPI) {
        this.alpacaAPI = alpacaAPI;
        bidPrice = 0.0;
        askPrice = 0.0;
    }

    public void run() throws Exception {
        ZoneId zoneId = ZoneId.of("America/New_York");
        StockQuotesResponse stockQuotesResponse = alpacaAPI.stockMarketData().getQuotes(SYMBOL,
                ZonedDateTime.of(2021, 3, 1, 9, 30, 0, 0, zoneId),
                ZonedDateTime.of(2021, 3, 1, 9, 31, 0, 0, zoneId),
                100, null);
        getAverage(stockQuotesResponse.getQuotes());
        double midPrice = (bidPrice + askPrice) / 2.0;
        // cancelOpenOrders();
        double currentPosition = currentPosition();
        if (currentPosition > POSITION_LIMIT) {
            int sellSize = (int) (currentPosition - POSITION_LIMIT);
            double sellPrice = midPrice - (SPREAD / 2.0);
            placeSellOrder(sellPrice, sellSize);
        } else if (currentPosition < -POSITION_LIMIT) {
            int buySize = (int) (-currentPosition - POSITION_LIMIT);
            double buyPrice = midPrice + (SPREAD / 2.0);
            placeBuyOrder(buyPrice, buySize);
        }
        // Place bid and ask orders around the mid price
        double bidPriceTarget = midPrice - (SPREAD / 2.0);
        double askPriceTarget = midPrice + (SPREAD / 2.0);
        placeBidOrder(bidPriceTarget);
        placeAskOrder(askPriceTarget);
    }

    public void run(ZonedDateTime startTime, ZonedDateTime endTime) throws Exception {
        ZoneId zoneId = ZoneId.of("America/New_York");
        StockQuotesResponse stockQuotesResponse = alpacaAPI.stockMarketData().getQuotes(SYMBOL, startTime, endTime, 100, null);
        getAverage(stockQuotesResponse.getQuotes());
        double midPrice = (bidPrice + askPrice) / 2.0;
        // cancelOpenOrders();
        double currentPosition = currentPosition();
        if (currentPosition > POSITION_LIMIT) {
            int sellSize = (int) (currentPosition - POSITION_LIMIT);
            double sellPrice = midPrice - (SPREAD / 2.0);
            placeSellOrder(sellPrice, sellSize);
        } else if (currentPosition < -POSITION_LIMIT) {
            int buySize = (int) (-currentPosition - POSITION_LIMIT);
            double buyPrice = midPrice + (SPREAD / 2.0);
            placeBuyOrder(buyPrice, buySize);
        }
        // Place bid and ask orders around the mid price
        double bidPriceTarget = midPrice - (SPREAD / 2.0);
        double askPriceTarget = midPrice + (SPREAD / 2.0);
        placeBidOrder(bidPriceTarget);
        placeAskOrder(askPriceTarget);
    }

    private double currentPosition() throws Exception {
        return Double.parseDouble(alpacaAPI.positions().getBySymbol(SYMBOL).getQuantity());
    }

    private int getCurrentPosition() throws Exception {
        return (int) Double.parseDouble(alpacaAPI.positions().getBySymbol(SYMBOL).getQuantity());
    }

    private double getPositionAvailable(CurrentOrderStatus type) throws Exception {
        double currentPosition = currentPosition();
        System.out.println("Current position: " + currentPosition);
        double ordersInFlight = 0.0;
        List<Order> openOrders = alpacaAPI.orders().get(CurrentOrderStatus.OPEN, Integer.MAX_VALUE, null, null, null, null, Collections.singleton(SYMBOL));
        for (Order order : openOrders) {
            if (order.getSymbol().equals(SYMBOL)) {
                if (order.getQuantity() == null) {
                    continue;
                }
                if (order.getSide() == OrderSide.BUY) {
                    ordersInFlight += Double.parseDouble(order.getQuantity());
                } else if (order.getSide() == OrderSide.SELL) {
                    ordersInFlight -= Double.parseDouble(order.getQuantity());
                }
            }
        }
        System.out.println("ordersInFlight: " + ordersInFlight);
        double positionAvailable = POSITION_LIMIT - currentPosition - ordersInFlight;
        if (positionAvailable > POSITION_ENTRY_SIZE) {
            positionAvailable = POSITION_ENTRY_SIZE;
        }
        System.out.println("Positions available: " + positionAvailable);
        return positionAvailable;
    }

    private void getAverage(ArrayList<StockQuote> list) {
        bidPrice = 0.0;
        askPrice = 0.0;
        for (Quote quote : list) {
            bidPrice += quote.getBidPrice();
            askPrice += quote.getAskPrice();
        }
        bidPrice /= list.size();
        askPrice /= list.size();
    }

    public void placeSellOrder(double price, int size) throws Exception {
        price = Math.round(price * 100.0) / 100.0;
        if (price < MIN_PRICE) {
            price = MIN_PRICE;
        }
        if (size > POSITION_ENTRY_SIZE) {
            size = (int) POSITION_ENTRY_SIZE;
        }
        if (size > getPositionAvailable(CurrentOrderStatus.CLOSED)) {
            size = (int) getPositionAvailable(CurrentOrderStatus.CLOSED);
        }
        alpacaAPI.orders().requestLimitOrder(SYMBOL, (double) size, OrderSide.SELL, OrderTimeInForce.DAY, price, false);
    }

    private void placeAskOrder(double price) throws Exception {
        if (getCurrentPosition() == 0.0) {
            return;
        }
        price = Math.round(price * 100.0) / 100.0;
        if (price > MAX_PRICE) {
            price = MAX_PRICE;
        }
        Double positionAvailable = getPositionAvailable(CurrentOrderStatus.CLOSED);
        System.out.println("getPositionAvailable: " + positionAvailable);
        if (positionAvailable == null || positionAvailable < TRADE_SIZE) {
            return;
        }
        alpacaAPI.orders().requestLimitOrder(SYMBOL, TRADE_SIZE, OrderSide.SELL, OrderTimeInForce.DAY, price, false);
    }

    private void placeBidOrder(double price) throws Exception {
        if (price < MIN_PRICE || price > MAX_PRICE) {
            return;
        }
        double positionAvailable = getPositionAvailable(CurrentOrderStatus.OPEN);
        double bidSize = Math.min(TRADE_SIZE, positionAvailable);
        price = Math.round(price * 100.0) / 100.0;
        alpacaAPI.orders().requestLimitOrder(SYMBOL, bidSize, OrderSide.BUY, OrderTimeInForce.DAY, price, false);
    }

    private void placeBuyOrder(double price, int size) throws Exception {
        if (price > MAX_PRICE) {
            price = MAX_PRICE;
        }
        if (size > POSITION_ENTRY_SIZE) {
            size = (int) POSITION_ENTRY_SIZE;
        }
        if (size > getPositionAvailable(CurrentOrderStatus.OPEN)) {
            size = (int) getPositionAvailable(CurrentOrderStatus.OPEN);
        }
        price = Math.round(price * 100.0) / 100.0;
        alpacaAPI.orders().requestLimitOrder(SYMBOL, (double) size, OrderSide.BUY, OrderTimeInForce.DAY, price, false);
    }

    public void cancelOpenOrders() throws Exception {
        alpacaAPI.orders().cancelAll();
    }
}
