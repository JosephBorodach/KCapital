package com.KCapital.investments.tradingsystem.mock;

import com.KCapital.investments.tradingsystem.rest.endpoint.accountactivities.AccountActivitiesEndpoint;
import com.KCapital.investments.tradingsystem.rest.endpoint.accountconfiguration.AccountConfigurationEndpoint;
import com.KCapital.investments.tradingsystem.rest.endpoint.orders.OrdersEndpoint;
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
import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;

import com.KCapital.investments.tradingsystem.rest.*;
import net.jacobpeterson.alpaca.model.endpoint.account.Account;
import com.KCapital.investments.tradingsystem.rest.endpoint.account.*;
import com.KCapital.investments.tradingsystem.rest.endpoint.clock.ClockEndpoint;

import com.KCapital.investments.tradingsystem.AlpacaAPI;

import net.jacobpeterson.alpaca.model.endpoint.clock.Clock;

import net.jacobpeterson.alpaca.model.properties.DataAPIType;
import net.jacobpeterson.alpaca.model.properties.EndpointAPIType;

import net.jacobpeterson.alpaca.model.endpoint.account.enums.AccountStatus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * {@link AlpacaAPITest} tests {@link AlpacaAPI} using mocked objects with Mockito.
 */
public class Tests {
    static {System.setProperty("org.slf4j.simpleLogger.log.net.jacobpeterson.alpaca", "trace");}

    private static AccountConfiguration accountConfiguration;
    private static final Logger LOGGER = LoggerFactory.getLogger(com.KCapital.investments.tradingsystem.live.AlpacaAPITest.class);

    @Test
    public void testClockEndpointGet() throws AlpacaClientException {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        assertNotNull(alpacaAPI);

        ClockEndpoint clockEndpoint = alpacaAPI.clock();
        assertNotNull(clockEndpoint);

        Clock clock = clockEndpoint.get();
        assertNotNull(clock);

        LOGGER.debug("{}", clock);

        boolean isOpen = clock.getIsOpen();
        ZonedDateTime timestamp = clock.getTimestamp();
        ZonedDateTime nextOpen = clock.getNextOpen();
        ZonedDateTime nextClose = clock.getNextClose();

        assertNotNull(timestamp);
        assertNotNull(isOpen);
        assertNotNull(nextOpen);
        assertNotNull(nextClose);

        if (isOpen) {
            LOGGER.info("Market is currently open! All live endpoints will be tested.");
        } else {
            LOGGER.info("Market is currently closed! Only some live endpoints will be tested.");
        }

        StringBuilder sb = new StringBuilder();
        sb.append("\nMarket is: " + (isOpen ? "open" : "closed"));
        sb.append("\nTimestamp: " + timestamp);
        sb.append("\nNext open: " + nextOpen);
        sb.append("\nNext close: " + nextClose);
        LOGGER.info(sb.toString());
    }

    @Test
    public void testAccountEndpointGet() throws AlpacaClientException, NumberFormatException {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        assertNotNull(alpacaAPI);

        AccountEndpoint accountEndpoint = alpacaAPI.account();
        assertNotNull(accountEndpoint);

        Account account = accountEndpoint.get();
        assertNotNull(account);

        LOGGER.debug("Account{}", account);

        StringBuilder sb = new StringBuilder();

        String currency = account.getCurrency();
        String id = account.getId();
        String account_number = account.getAccountNumber();
        AccountStatus status = account.getStatus();
        boolean PatternDayTrader = account.getPatternDayTrader();
        boolean TradeSuspendedByUser = account.getTradeSuspendedByUser();
        boolean TradingBlocked = account.getTradingBlocked();
        boolean TransfersBlocked = account.getTransfersBlocked();
        boolean AccountBlocked = account.getAccountBlocked();
        ZonedDateTime CreatedAt = account.getCreatedAt();
        boolean ShortingEnabled = account.getShortingEnabled();
        String Multiplier = account.getMultiplier();
        String sma = account.getSma();
        int DaytradeCount = account.getDaytradeCount();

        assertNotNull(currency);
        assertNotNull(id);
        assertNotNull(account_number);
        assertNotNull(status);
        assertNotNull(PatternDayTrader);
        assertNotNull(TradeSuspendedByUser);
        assertNotNull(TradingBlocked);
        assertNotNull(TransfersBlocked);
        assertNotNull(AccountBlocked);
        assertNotNull(CreatedAt);
        assertNotNull(ShortingEnabled);
        assertNotNull(Multiplier);
        assertNotNull(sma);
        assertNotNull(DaytradeCount);

        sb.append("\nCurrency:                " + currency);
        sb.append("\nId:                      " + id);
        sb.append("\nAccount Number:          " + account_number);
        sb.append("\nStatus:                  " + status);
        sb.append("\nPattern Day Trader:      " + PatternDayTrader);
        sb.append("\nTrade Suspended By User: " + TradeSuspendedByUser);
        sb.append("\nTrading Blocked:         " + TradingBlocked);
        sb.append("\nTransfers Blocked:       " + TransfersBlocked);
        sb.append("\nTrade Suspended By User: " + TradeSuspendedByUser);
        sb.append("\nAccount Blocked:         " + AccountBlocked);
        sb.append("\nCreated At:              " + CreatedAt);
        sb.append("\nShorting Enabled:        " + ShortingEnabled);
        sb.append("\nMultiplier:              " + Multiplier);
        sb.append("\nSma:                     " + sma);
        sb.append("\nDaytrade Count:          " + DaytradeCount);

        double cash = Double.parseDouble(account.getCash());
        double portfolio = Double.parseDouble(account.getPortfolioValue());
        double long_market_value = Double.parseDouble(account.getLongMarketValue());
        double short_market_value = Double.parseDouble(account.getShortMarketValue());
        double equity = Double.parseDouble(account.getEquity());
        double last_equity = Double.parseDouble(account.getLastEquity());
        double buying_power = Double.parseDouble(account.getBuyingPower());
        double initial_margin = Double.parseDouble(account.getInitialMargin());
        double maintenance_margin = Double.parseDouble(account.getMaintenanceMargin());
        double last_maintenance_margin = Double.parseDouble(account.getLastMaintenanceMargin());
        double daytrading_buying_power = Double.parseDouble(account.getDaytradingBuyingPower());
        double regt_buying_power = Double.parseDouble(account.getRegtBuyingPower());

        sb.append("\nCash:                    " + cash);
        sb.append("\nPortfolio value:         " + portfolio);
        sb.append("\nLong Market value:       " + long_market_value);
        sb.append("\nShort Market value:      " + short_market_value);
        sb.append("\nEquity:                  " + equity);
        sb.append("\nLast Equity:             " + last_equity);
        sb.append("\nBuying Power:            " + buying_power);
        sb.append("\nInitial Margin:          " + initial_margin);
        sb.append("\nMaintenance Margin:      " + maintenance_margin);
        sb.append("\nLast Maintenance Margin: " + last_maintenance_margin);
        sb.append("\nDaytrading Buying Power: " + daytrading_buying_power);
        sb.append("\nRegt Buying Power:       " + regt_buying_power);
        LOGGER.info(sb.toString());
    }

    @Test
    public void testAccountActivitiesEndpointGetOneActivityExistsUntilNow() throws AlpacaClientException {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        assertNotNull(alpacaAPI);

        List<AccountActivity> accountActivities = alpacaAPI.accountActivities().get(
                null,
                ZonedDateTime.now(),
                null,
                SortDirection.ASCENDING,
                1,
                null,
                (ActivityType[]) null);
        assertNotNull(accountActivities);

        /*
        assertFalse(accountActivities.isEmpty());

        accountActivities.forEach(accountActivity -> LOGGER.debug(accountActivity.toString()));

        AccountActivity accountActivity = accountActivities.get(0);
        if (accountActivity instanceof TradeActivity) {
            TradeActivity tradeActivity = (TradeActivity) accountActivity;
            assertNotNull(tradeActivity.getActivityType());
            assertNotNull(tradeActivity.getId());
            assertNotNull(tradeActivity.getCumulativeQuantity());
            assertNotNull(tradeActivity.getRemainingQuantity());
            assertNotNull(tradeActivity.getPrice());
            assertNotNull(tradeActivity.getQuantity());
            assertNotNull(tradeActivity.getSide());
            assertNotNull(tradeActivity.getSymbol());
            assertNotNull(tradeActivity.getTransactionTime());
            assertNotNull(tradeActivity.getOrderId());
            assertNotNull(tradeActivity.getType());
        } else if (accountActivity instanceof NonTradeActivity) {
            NonTradeActivity nonTradeActivity = (NonTradeActivity) accountActivity;
            assertNotNull(nonTradeActivity.getActivityType());
            assertNotNull(nonTradeActivity.getId());
            assertNotNull(nonTradeActivity.getDate());
            assertNotNull(nonTradeActivity.getNetAmount());
            assertNotNull(nonTradeActivity.getSymbol());
            assertNotNull(nonTradeActivity.getQuantity());
            assertNotNull(nonTradeActivity.getPerShareAmount());
            assertNotNull(nonTradeActivity.getDescription());
        }
        */
    }

    @Test
    @org.junit.jupiter.api.Order(1)
    public void testAccountConfigurationEndpointGet() throws AlpacaClientException {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        assertNotNull(alpacaAPI);

        AccountConfiguration accountConfiguration = alpacaAPI.accountConfiguration().get();
        assertNotNull(accountConfiguration);

        LOGGER.debug("{}", accountConfiguration);

        assertNotNull(accountConfiguration.getDtbpCheck());
        assertNotNull(accountConfiguration.getTradeConfirmEmail());
        assertNotNull(accountConfiguration.getSuspendTrade());
        assertNotNull(accountConfiguration.getNoShorting());

        this.accountConfiguration = accountConfiguration;
    }

    @Test
    @org.junit.jupiter.api.Order(2)
    public void testAccountConfigurationEndpointSet() throws AlpacaClientException {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        assertNotNull(alpacaAPI);

        if (accountConfiguration == null) {
            AccountConfiguration newAccountConfiguration = new AccountConfiguration(
                    DTBPCheck.BOTH,
                    TradeConfirmEmail.NONE,
                    false,
                    false);
            LOGGER.info("Settings Account Configuration to: {}", newAccountConfiguration);
            alpacaAPI.accountConfiguration().set(newAccountConfiguration);
        } else {
            alpacaAPI.accountConfiguration().set(accountConfiguration);
        }
    }

    @Test
    public void testOrdersEndpointGetOneOrderExistsUntilNow() throws AlpacaClientException {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        assertNotNull(alpacaAPI);

        List<Order> orders = alpacaAPI.orders().get(
                CurrentOrderStatus.ALL,
                1,
                null,
                ZonedDateTime.now(),
                SortDirection.ASCENDING,
                true,
                null);

        assertNotNull(orders);

        /*
        assertFalse(orders.isEmpty());

        orders.forEach(order -> LOGGER.debug("{}", order));

        // Assert required fields are present
        Order order = orders.get(0);
        assertNotNull(order.getId());
        assertNotNull(order.getClientOrderId());
        assertNotNull(order.getCreatedAt());
        assertNotNull(order.getUpdatedAt());
        assertNotNull(order.getSubmittedAt());
        assertNotNull(order.getAssetId());
        assertNotNull(order.getSymbol());
        assertNotNull(order.getAssetClass());
        assertNotNull(order.getQuantity());
        assertNotNull(order.getFilledQuantity());
        assertNotNull(order.getType());
        assertNotNull(order.getSide());
        assertNotNull(order.getTimeInForce());
        assertNotNull(order.getStatus());
        assertNotNull(order.getExtendedHours());

        */
    }


}
