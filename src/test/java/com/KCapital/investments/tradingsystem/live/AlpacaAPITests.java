package com.KCapital.investments.tradingsystem.live;

import com.KCapital.investments.tradingsystem.AlpacaAPI;
import com.KCapital.investments.tradingsystem.rest.AlpacaClientException;
import com.KCapital.investments.tradingsystem.rest.endpoint.account.AccountEndpoint;
import com.KCapital.investments.tradingsystem.rest.endpoint.accountactivities.AccountActivitiesEndpoint;
import com.KCapital.investments.tradingsystem.rest.endpoint.accountconfiguration.AccountConfigurationEndpoint;
import com.KCapital.investments.tradingsystem.rest.endpoint.clock.ClockEndpoint;
import com.KCapital.investments.tradingsystem.rest.endpoint.orders.OrdersEndpoint;
import net.jacobpeterson.alpaca.model.endpoint.account.Account;
import net.jacobpeterson.alpaca.model.endpoint.accountactivities.AccountActivity;
import net.jacobpeterson.alpaca.model.endpoint.accountactivities.NonTradeActivity;
import net.jacobpeterson.alpaca.model.endpoint.accountactivities.TradeActivity;
import net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.ActivityType;
import net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.AccountConfiguration;
import net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.DTBPCheck;
import net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.TradeConfirmEmail;
import net.jacobpeterson.alpaca.model.endpoint.clock.Clock;
import net.jacobpeterson.alpaca.model.endpoint.common.enums.SortDirection;
import net.jacobpeterson.alpaca.model.endpoint.orders.Order;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.CurrentOrderStatus;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AlpacaAPITests {
    @Test
    public void t1() { // throws AlpacaClientException
        System.out.println("Run me.");
        // AlpacaAPI alpacaAPI = new AlpacaAPI();
        // Clock clock = alpacaAPI.clock().get();
        // assertNotNull(clock);
    }
}
