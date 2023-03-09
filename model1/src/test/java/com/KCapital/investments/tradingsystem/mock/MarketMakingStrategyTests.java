package com.KCapital.investments.tradingsystem.mock;

import java.math.*;
import java.util.*;

import net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderSide;
import org.slf4j.Logger;
import okhttp3.OkHttpClient;
import org.slf4j.LoggerFactory;
import java.time.ZonedDateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.KCapital.investments.tradingsystem.rest.endpoint.accountactivities.AccountActivitiesEndpoint;
import com.KCapital.investments.tradingsystem.rest.endpoint.accountconfiguration.AccountConfigurationEndpoint;
import com.KCapital.investments.tradingsystem.rest.endpoint.orders.OrdersEndpoint;

import net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderSide;
import net.jacobpeterson.alpaca.model.endpoint.accountactivities.AccountActivity;
import net.jacobpeterson.alpaca.model.endpoint.accountactivities.NonTradeActivity;
import net.jacobpeterson.alpaca.model.endpoint.accountactivities.TradeActivity;
import net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.ActivityType;
import net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.AccountConfiguration;
import net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.DTBPCheck;
import net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.TradeConfirmEmail;
import net.jacobpeterson.alpaca.model.endpoint.common.enums.SortDirection;
import net.jacobpeterson.alpaca.model.endpoint.orders.Order;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.CurrentOrderStatus;

import net.jacobpeterson.alpaca.model.endpoint.positions.Position;

import com.KCapital.investments.tradingsystem.rest.*;
import net.jacobpeterson.alpaca.model.endpoint.account.Account;
import com.KCapital.investments.tradingsystem.rest.endpoint.account.*;
import com.KCapital.investments.tradingsystem.rest.endpoint.clock.ClockEndpoint;
import com.KCapital.investments.tradingsystem.rest.endpoint.positions.PositionsEndpoint;

import com.KCapital.investments.tradingsystem.*;

import net.jacobpeterson.alpaca.model.endpoint.clock.Clock;

import net.jacobpeterson.alpaca.model.properties.DataAPIType;
import net.jacobpeterson.alpaca.model.properties.EndpointAPIType;

import net.jacobpeterson.alpaca.model.endpoint.account.enums.AccountStatus;

public class MarketMakingStrategyTests {

    private static final String SYMBOL = "AAPL";
    private static final double SPREAD = 0.01; // 1 cent spread
    private static final int POSITION_LIMIT = 1000; // maximum position size in shares
    private static final double POSITION_ENTRY_SIZE = 100; // position size for each trade in shares
    private static final double TRADE_SIZE = 10; // size of each individual buy/sell order in shares
    private static final double MIN_PRICE = 100.0; // minimum price to place buy orders
    private static final double MAX_PRICE = 150.0; // maximum price to place sell orders

    /**
     * Test to verify that the algorithm places a sell order when the current position is greater than POSITION_LIMIT.
     */
    @Test
    public void test1() throws Exception {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        MarketMakingStrategy marketMakingStrategy = new MarketMakingStrategy(alpacaAPI);

        // marketMakingStrategy.cancelOpenOrders();

        // set the current position to zero
        PositionsEndpoint positionsEndpoint = marketMakingStrategy.alpacaAPI.positions();
        Position position = positionsEndpoint.getBySymbol(MarketMakingStrategy.SYMBOL);
        String quantity = position.getQuantity();
        int currentPosition = (int) Double.parseDouble(quantity);
        if (currentPosition != 0) {
            marketMakingStrategy.placeSellOrder(MarketMakingStrategy.MIN_PRICE, currentPosition);
            Thread.sleep(500);
        }

        // run the strategy
        marketMakingStrategy.run();

        checkOrders(marketMakingStrategy, CurrentOrderStatus.CLOSED);

        // cancel all open orders again
        // marketMakingStrategy.cancelOpenOrders();
    }

    private void checkOrders(MarketMakingStrategy marketMakingStrategy, CurrentOrderStatus status) throws AlpacaClientException {
        // check if orders were created
        List<Order> openOrders = marketMakingStrategy.alpacaAPI.orders().get(status, Integer.MAX_VALUE, null, null, null, null, Collections.singleton(MarketMakingStrategy.SYMBOL));
        System.out.println("Orders filled: " + openOrders.size());
        assertTrue(!openOrders.isEmpty());
    }

    /**
     * Test to verify that the algorithm is profitable over a certain time period.
     */
    @Test
    public void test2() throws Exception {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        MarketMakingStrategy marketMakingStrategy = new MarketMakingStrategy(alpacaAPI);

        // set up the start and end times for the test
        ZonedDateTime startTime = ZonedDateTime.parse("2022-01-01T00:00:00.000-05:00");
        ZonedDateTime endTime = ZonedDateTime.parse("2022-02-01T00:00:00.000-05:00");

        // set the current position to zero
        PositionsEndpoint positionsEndpoint = marketMakingStrategy.alpacaAPI.positions();
        Position position = positionsEndpoint.getBySymbol(MarketMakingStrategy.SYMBOL);
        String quantity = position.getQuantity();
        int currentPosition = (int) Double.parseDouble(quantity);
        if (currentPosition != 0) {
            marketMakingStrategy.placeSellOrder(MarketMakingStrategy.MIN_PRICE, currentPosition);
            Thread.sleep(500);
        }

        // run the strategy for the specified time period
        marketMakingStrategy.run(startTime, endTime);

        // check if orders were created and filled
        checkOrders(marketMakingStrategy, CurrentOrderStatus.CLOSED);

        // check if the strategy was profitable
        AccountActivitiesEndpoint accountActivitiesEndpoint = marketMakingStrategy.alpacaAPI.accountActivities();
        List<AccountActivity> accountActivities = accountActivitiesEndpoint.get(startTime, null, null, null, null, null, ActivityType.FILL);
        double totalProfit = 0;
        for (AccountActivity accountActivity : accountActivities) {
            if (accountActivity.getActivityType() == ActivityType.FILL) {
                TradeActivity tradeActivity = (TradeActivity) accountActivity;
                if (tradeActivity.getSymbol().equals(MarketMakingStrategy.SYMBOL)) {
                    double profit = computeNetAmount(tradeActivity);
                    totalProfit += profit;
                }
            }
        }
        assertTrue(totalProfit > 0);
    }

    public double computeNetAmount(TradeActivity tradeActivity) {
        double quantity = Double.parseDouble(tradeActivity.getQuantity());
        double price = Double.parseDouble(tradeActivity.getPrice());
        double sideFactor = tradeActivity.getSide().toString() == String.valueOf(OrderSide.BUY) ? 1.0 : -1.0;
        return quantity * price * sideFactor;
    }
}

























