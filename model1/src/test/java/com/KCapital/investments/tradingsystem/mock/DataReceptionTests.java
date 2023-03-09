package com.KCapital.investments.tradingsystem.mock;

import java.util.Map;
import java.util.Arrays;

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
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.historical.trade.Trade;
import net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.AccountConfiguration;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.snapshot.Snapshot;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.enums.BarFeed;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBarsResponse;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.enums.BarAdjustment;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.historical.bar.enums.BarTimePeriod;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.trade.StockTradesResponse;

public class DataReceptionTests {
    static {System.setProperty("org.slf4j.simpleLogger.log.net.jacobpeterson.alpaca", "trace");}

    private static AccountConfiguration accountConfiguration;
    private static final Logger LOGGER = LoggerFactory.getLogger(com.KCapital.investments.tradingsystem.live.AlpacaAPITest.class);

    @Test
    public void StockMarketDataEndpoint() {
        AlpacaAPI alpacaAPI = new AlpacaAPI();
        assertNotNull(alpacaAPI);
        try {
            // Get AAPL one hour, split-adjusted bars from 7/6/2021 market open to 7/8/2021 market close from the SIP feed and print them out
            String location = "America/New_York";
            StockBarsResponse aaplBarsResponse = alpacaAPI.stockMarketData().getBars(
                    "AAPL",
                    ZonedDateTime.of(2021, 7, 6, 9, 30, 0, 0, ZoneId.of(location)),
                    ZonedDateTime.of(2021, 7, 8, 12 + 4, 0, 0, 0, ZoneId.of(location)),
                    null,
                    null,
                    1,
                    BarTimePeriod.HOUR, BarAdjustment.SPLIT, BarFeed.SIP);
            aaplBarsResponse.getBars().forEach(System.out::println);

            // Get AAPL first 10 trades on 7/8/2021 at market open and print them out
            StockTradesResponse aaplTradesResponse = alpacaAPI.stockMarketData().getTrades(
                    "AAPL",
                    ZonedDateTime.of(2021, 7, 8, 9, 30, 0, 0, ZoneId.of(location)),
                    ZonedDateTime.of(2021, 7, 8, 9, 31, 0, 0, ZoneId.of(location)),
                    10,
                    null);
            aaplTradesResponse.getTrades().forEach(System.out::println);

            Trade latestAAPLTrade = alpacaAPI.stockMarketData().getLatestTrade("AAPL").getTrade();
            System.out.printf("Latest AAPL Trade: %s\n", latestAAPLTrade);

            Map<String, Snapshot> snapshots = alpacaAPI.stockMarketData().getSnapshots(Arrays.asList("AAPL", "GME", "TSLA"));
            snapshots.forEach((symbol, snapshot) -> System.out.printf("Symbol: %s\nSnapshot: %s\n\n", symbol, snapshot));
        } catch (AlpacaClientException exception) {exception.printStackTrace();}
    }
}
