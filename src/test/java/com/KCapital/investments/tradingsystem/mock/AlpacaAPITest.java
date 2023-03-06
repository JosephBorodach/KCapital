package com.KCapital.investments.tradingsystem.mock;

import com.KCapital.investments.tradingsystem.AlpacaAPI;
import net.jacobpeterson.alpaca.model.properties.DataAPIType;
import net.jacobpeterson.alpaca.model.properties.EndpointAPIType;
import okhttp3.OkHttpClient;
import org.junit.jupiter.api.Test;

/**
 * {@link AlpacaAPITest} tests {@link AlpacaAPI} using mocked objects with Mockito.
 */
public class AlpacaAPITest {

    static {
        System.setProperty("org.slf4j.simpleLogger.log.net.jacobpeterson.alpaca", "trace");
    }

    /**
     * Tests {@link AlpacaAPI#AlpacaAPI()}.
     */
    @Test
    public void testAlpacaAPIConstructor_Default() {
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
        String keyID = "ABCDEFGHIJKLM";
        String secret = "NOPQURSTUVWXYZ";

        new AlpacaAPI(keyID, secret, EndpointAPIType.PAPER, DataAPIType.IEX);
        new AlpacaAPI(keyID, secret, EndpointAPIType.LIVE, DataAPIType.SIP);
    }

    /**
     * Tests {@link AlpacaAPI#AlpacaAPI(String)}.
     */
    @Test
    public void testAlpacaAPIConstructor_oAuthToken() {
        String oAuthToken = "ABCDEFGHIJKLMNOPQURSTUVWXYZ";

        new AlpacaAPI(oAuthToken);
    }

    /**
     * Tests {@link AlpacaAPI#AlpacaAPI(OkHttpClient, String, String, String, EndpointAPIType, DataAPIType)}.
     */
    @Test
    public void testAlpacaAPIConstructor_okHttpClient_keyID_secret_oAuthToken_endpointAPIType_dataAPIType() {
        OkHttpClient okHttpClient = new OkHttpClient();
        String keyID = "ABCDEFGHIJKLM";
        String secret = "NOPQURSTUVWXYZ";
        String oAuthToken = "ABCDEFGHIJKLMNOPQURSTUVWXYZ";

        new AlpacaAPI(okHttpClient, null, null, oAuthToken, EndpointAPIType.PAPER, DataAPIType.IEX);
        new AlpacaAPI(okHttpClient, keyID, secret, null, EndpointAPIType.LIVE, DataAPIType.SIP);
        new AlpacaAPI(okHttpClient, null, null, oAuthToken, EndpointAPIType.PAPER, DataAPIType.IEX);
        new AlpacaAPI(okHttpClient, keyID, secret, null, EndpointAPIType.LIVE, DataAPIType.SIP);
    }
}
