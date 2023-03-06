package com.KCapital.investments.tradingsystem.mock;

import com.KCapital.investments.tradingsystem.rest.AlpacaClientException;
import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;

import com.KCapital.investments.tradingsystem.AlpacaAPI;

import net.jacobpeterson.alpaca.model.properties.DataAPIType;
import net.jacobpeterson.alpaca.model.properties.EndpointAPIType;

/**
 * {@link AlpacaAPITest} tests {@link AlpacaAPI} using mocked objects with Mockito.
 */
public class AlpacaAPITest {
    /**
     * Tests {@link AlpacaAPI#AlpacaAPI()}.
     */
    @Test
    public void testAlpacaAPIConstructor_Default() throws AlpacaClientException {
         new AlpacaAPI();
    }

    /**
     * Tests {@link AlpacaAPI#AlpacaAPI(String, String)}.
     */
    @Test
    public void testAlpacaAPIConstructor_keyID_secret() {
        String keyID = "ABCDEFGHIJKLM";
        String secret = "NOPQURSTUVWXYZ";
        new AlpacaAPI(keyID, secret);
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
