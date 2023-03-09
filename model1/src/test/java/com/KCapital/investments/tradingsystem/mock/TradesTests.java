package com.KCapital.investments.tradingsystem.mock;

import java.util.*;

import com.KCapital.investments.tradingsystem.rest.endpoint.orders.OrdersEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.KCapital.investments.tradingsystem.AlpacaAPI;
import com.KCapital.investments.tradingsystem.rest.AlpacaClientException;
import com.KCapital.investments.tradingsystem.rest.endpoint.clock.ClockEndpoint;

import net.jacobpeterson.alpaca.model.endpoint.clock.Clock;
import net.jacobpeterson.alpaca.model.endpoint.orders.Order;
import net.jacobpeterson.alpaca.model.endpoint.orders.CancelledOrder;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderSide;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderStatus;
import net.jacobpeterson.alpaca.model.endpoint.common.enums.SortDirection;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderTimeInForce;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.CurrentOrderStatus;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.historical.trade.Trade;
import net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.AccountConfiguration;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.snapshot.Snapshot;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.enums.BarFeed;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBarsResponse;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.enums.BarAdjustment;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.historical.bar.enums.BarTimePeriod;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.trade.StockTradesResponse;

/**
 * {@link AlpacaAPITest} tests {@link AlpacaAPI} using mocked objects with Mockito.
 */
public class TradesTests {
    /**
     * requestLimitOrder
     * @throws AlpacaClientException
     */
    @Test
    public void purchase_tesla() throws AlpacaClientException {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        OrdersEndpoint ordersEndpoint = alpacaAPI.orders();
        List<Order> orders = ordersEndpoint.get(CurrentOrderStatus.ALL, null, null,
                ZonedDateTime.of(2021, 7, 6, 0, 0, 0, 0, ZoneId.of("America/New_York")),
                SortDirection.ASCENDING, true, Arrays.asList("AAPL", "TSLA"));
        orders.forEach(System.out::println);
        ordersEndpoint = alpacaAPI.orders();
        Order tslaLimitOrder = ordersEndpoint.requestLimitOrder("TSLA", 100.0, OrderSide.BUY, OrderTimeInForce.DAY, 653.00, false);
        System.out.println(tslaLimitOrder.getId());
        System.out.printf("Requested %s %s order at %s\n", tslaLimitOrder.getSymbol(), tslaLimitOrder.getType(), tslaLimitOrder.getSubmittedAt());
    }

    @Test
    public void cancel_tesla() throws AlpacaClientException {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        OrdersEndpoint ordersEndpoint = alpacaAPI.orders();
        ordersEndpoint.cancel("69473386-bb9f-400b-855f-c27a313f935c");
        // cancelledOrders.forEach((cancelledOrder) -> System.out.printf("Cancelled: %s\n", cancelledOrder));
    }

    @Test
    public void cancel_all_orders() throws AlpacaClientException {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        OrdersEndpoint ordersEndpoint = alpacaAPI.orders();
        List<CancelledOrder> cancelledOrders = ordersEndpoint.cancelAll();
        cancelledOrders.forEach((cancelledOrder) -> System.out.printf("Cancelled: %s\n", cancelledOrder));
    }


    @Test
    public void OrdersEndpoint()  {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        assertNotNull(alpacaAPI);
        try {
            // Print all the 'Order's of AAPL and TSLA until 7/6/2021 in ascending (oldest to newest) order
            List<Order> orders = alpacaAPI.orders().get(
                    CurrentOrderStatus.ALL, null, null,
                    ZonedDateTime.of(2021, 7, 6, 0, 0, 0, 0, ZoneId.of("America/New_York")),
                    SortDirection.ASCENDING,
                    true, Arrays.asList("AAPL", "TSLA"));
            orders.forEach(System.out::println);

            // Request a new limit order for TSLA for 100 shares at a limit price of $653.00 and TIF of DAY.
            Order tslaLimitOrder = alpacaAPI.orders().requestLimitOrder("TSLA", 100.0, OrderSide.BUY, OrderTimeInForce.DAY, 653.00, false);
            System.out.printf("Requested %s %s order at %s\n",
                    tslaLimitOrder.getSymbol(),
                    tslaLimitOrder.getType(),
                    tslaLimitOrder.getSubmittedAt());

            // Check if TSLA limit order has filled 5 seconds later and if it hasn't replace it with a higher limit order so it fills!
            Thread.sleep(5000);
            tslaLimitOrder = alpacaAPI.orders().get(tslaLimitOrder.getId(), false);
            if (tslaLimitOrder.getFilledAt() == null && tslaLimitOrder.getStatus().equals(OrderStatus.NEW)) {
                Order replacedOrder = alpacaAPI.orders().replace(tslaLimitOrder.getId(), 100, OrderTimeInForce.DAY, 655.00, null, null, null);
                System.out.printf("Replaced TSLA order: %s\n", replacedOrder);
            }

            // Cancel all open orders after 2 seconds
            Thread.sleep(2000);
            List<CancelledOrder> cancelledOrders = alpacaAPI.orders().cancelAll();
            cancelledOrders.forEach((cancelledOrder) -> System.out.printf("Cancelled: %s\n", cancelledOrder));

            // Request a new fractional market order for 0.5 shares of GME
            alpacaAPI.orders().requestFractionalMarketOrder("GME", 0.5, OrderSide.BUY);
            // Request a new notional market order for $25 worth of GME shares
            alpacaAPI.orders().requestNotionalMarketOrder("GME", 25d, OrderSide.BUY);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
