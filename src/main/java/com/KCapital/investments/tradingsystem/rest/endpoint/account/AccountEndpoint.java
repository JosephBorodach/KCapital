package com.KCapital.investments.tradingsystem.rest.endpoint.account;

import okhttp3.HttpUrl;
import okhttp3.Request;
import net.jacobpeterson.alpaca.model.endpoint.account.Account;
import com.KCapital.investments.tradingsystem.rest.AlpacaClient;
import com.KCapital.investments.tradingsystem.rest.AlpacaClientException;
import com.KCapital.investments.tradingsystem.rest.endpoint.AlpacaEndpoint;

/**
 * {@link AlpacaEndpoint} for <a href="https://docs.alpaca.markets/api-documentation/api-v2/account/">Account</a>.
 */
public class AccountEndpoint extends AlpacaEndpoint {

    /**
     * Instantiates a new {@link AccountEndpoint}.
     * @param alpacaClient the {@link AlpacaClient}
     */
    public AccountEndpoint(AlpacaClient alpacaClient) {
        super(alpacaClient, "account");
    }

    /**
     * Returns the {@link Account}.
     * @return the {@link Account}
     * @throws AlpacaClientException thrown for {@link AlpacaClientException}s
     */
    public Account get() throws AlpacaClientException {
        HttpUrl.Builder urlBuilder = alpacaClient.urlBuilder().addPathSegment(endpointPathSegment);
        Request request = alpacaClient.requestBuilder(urlBuilder.build()).get().build();
        return alpacaClient.requestObject(request, Account.class);
    }
}
