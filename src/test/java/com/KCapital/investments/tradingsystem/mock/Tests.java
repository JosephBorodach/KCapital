package com.KCapital.investments.tradingsystem.mock;

import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;

import com.KCapital.investments.tradingsystem.rest.*;
import net.jacobpeterson.alpaca.model.endpoint.account.Account;
import com.KCapital.investments.tradingsystem.rest.endpoint.account.*;
import com.KCapital.investments.tradingsystem.rest.endpoint.clock.ClockEndpoint;

import net.jacobpeterson.alpaca.model.endpoint.common.enums.SortDirection;
import net.jacobpeterson.alpaca.model.endpoint.orders.Order;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.CurrentOrderStatus;

import com.KCapital.investments.tradingsystem.AlpacaAPI;

import net.jacobpeterson.alpaca.model.endpoint.clock.Clock;

import net.jacobpeterson.alpaca.model.properties.DataAPIType;
import net.jacobpeterson.alpaca.model.properties.EndpointAPIType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZonedDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * {@link AlpacaAPITest} tests {@link AlpacaAPI} using mocked objects with Mockito.
 */
public class Tests {
    static {System.setProperty("org.slf4j.simpleLogger.log.net.jacobpeterson.alpaca", "trace");}

    private static final Logger LOGGER = LoggerFactory.getLogger(com.KCapital.investments.tradingsystem.live.AlpacaAPITest.class);

    /**
     * Tests {@link AlpacaAPI#AlpacaAPI()}.
     */
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

    /**
     * Tests {@link AccountEndpoint#get()}.
     * @throws AlpacaClientException thrown for {@link AlpacaClientException}s
     * @throws NumberFormatException thrown for {@link NumberFormatException}s
     */
    @Test
    public void testAccountEndpointGet() throws AlpacaClientException, NumberFormatException {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        assertNotNull(alpacaAPI);

        AccountEndpoint accountEndpoint = alpacaAPI.account();
        assertNotNull(accountEndpoint);

        Account account = accountEndpoint.get();
        assertNotNull(account);

        LOGGER.debug("Account{}", account);

        // Assert basic data integrity and not null
        Double.parseDouble(account.getCash());
        Double.parseDouble(account.getPortfolioValue());
        Double.parseDouble(account.getLongMarketValue());
        Double.parseDouble(account.getShortMarketValue());
        Double.parseDouble(account.getEquity());
        Double.parseDouble(account.getLastEquity());
        Double.parseDouble(account.getBuyingPower());
        Double.parseDouble(account.getInitialMargin());
        Double.parseDouble(account.getMaintenanceMargin());
        Double.parseDouble(account.getLastMaintenanceMargin());
        Double.parseDouble(account.getDaytradingBuyingPower());
        Double.parseDouble(account.getRegtBuyingPower());

        // Assert other data exists
        assertNotNull(account.getId());
        assertNotNull(account.getAccountNumber());
        assertNotNull(account.getStatus());
        assertNotNull(account.getCurrency());
        assertNotNull(account.getPatternDayTrader());
        assertNotNull(account.getTradeSuspendedByUser());
        assertNotNull(account.getTradingBlocked());
        assertNotNull(account.getTransfersBlocked());
        assertNotNull(account.getAccountBlocked());
        assertNotNull(account.getCreatedAt());
        assertNotNull(account.getShortingEnabled());
        assertNotNull(account.getMultiplier());
        assertNotNull(account.getSma());
        assertNotNull(account.getDaytradeCount());
    }

    /**
     * Tests {@link AlpacaAPI#AlpacaAPI(String, String, EndpointAPIType, DataAPIType)}.
     */
    @Test
    public void testAlpacaAPIConstructor_keyID_secret_endpointAPIType_dataAPIType() {
        final String keyID = "ABCDEFGHIJKLM";
        final String secret = "NOPQURSTUVWXYZ";
        new AlpacaAPI(keyID, secret, EndpointAPIType.PAPER, DataAPIType.IEX);
        new AlpacaAPI(keyID, secret, EndpointAPIType.LIVE, DataAPIType.SIP);
    }

    /**
     * Tests {@link AlpacaAPI#AlpacaAPI(String)}.
     */
    @Test
    public void testAlpacaAPIConstructor_oAuthToken() {
        final String oAuthToken = "ABCDEFGHIJKLMNOPQURSTUVWXYZ";
        new AlpacaAPI(oAuthToken);
    }

    /**
     * Tests {@link AlpacaAPI#AlpacaAPI(OkHttpClient, String, String, String, EndpointAPIType, DataAPIType)}.
     */
    @Test
    public void testAlpacaAPIConstructor_okHttpClient_keyID_secret_oAuthToken_endpointAPIType_dataAPIType() {
        OkHttpClient okHttpClient = new OkHttpClient();
        final String keyID = "ABCDEFGHIJKLM";
        final String secret = "NOPQURSTUVWXYZ";
        final String oAuthToken = "ABCDEFGHIJKLMNOPQURSTUVWXYZ";
        new AlpacaAPI(okHttpClient, null, null, oAuthToken, EndpointAPIType.PAPER, DataAPIType.IEX);
        new AlpacaAPI(okHttpClient, keyID, secret, null, EndpointAPIType.LIVE, DataAPIType.SIP);
        new AlpacaAPI(okHttpClient, null, null, oAuthToken, EndpointAPIType.PAPER, DataAPIType.IEX);
        new AlpacaAPI(okHttpClient, keyID, secret, null, EndpointAPIType.LIVE, DataAPIType.SIP);
    }

    @Test
    public void t6() {
        OkHttpClient okHttpClient = new OkHttpClient();
        final String oAuthToken = "ABCDEFGHIJKLMNOPQURSTUVWXYZ";
        new AlpacaAPI(okHttpClient, null, null, oAuthToken, EndpointAPIType.PAPER, DataAPIType.IEX);
    }

    @Test
    public void t7() {
        OkHttpClient okHttpClient = new OkHttpClient();
        final String keyID = "ABCDEFGHIJKLM", secret = "NOPQURSTUVWXYZ";
        new AlpacaAPI(okHttpClient, keyID, secret, null, EndpointAPIType.PAPER, DataAPIType.IEX);
    }
}
