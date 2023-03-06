package com.KCapital.investments.tradingsystem.rest.endpoint.positions;

import com.google.gson.reflect.TypeToken;
import net.jacobpeterson.alpaca.model.endpoint.assets.Asset;
import net.jacobpeterson.alpaca.model.endpoint.orders.Order;
import net.jacobpeterson.alpaca.model.endpoint.positions.ClosePositionOrder;
import net.jacobpeterson.alpaca.model.endpoint.positions.Position;
import com.KCapital.investments.tradingsystem.rest.AlpacaClient;
import com.KCapital.investments.tradingsystem.rest.AlpacaClientException;
import com.KCapital.investments.tradingsystem.rest.endpoint.AlpacaEndpoint;
import okhttp3.HttpUrl;
import okhttp3.Request;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.KCapital.investments.tradingsystem.rest.AlpacaClient.STATUS_CODE_200_OR_207;

/**
 * {@link AlpacaEndpoint} for <a href="https://alpaca.markets/docs/api-documentation/api-v2/positions/">Positions</a>.
 */
public class PositionsEndpoint extends AlpacaEndpoint {

    private static final Type POSITION_ARRAYLIST_TYPE = new TypeToken<ArrayList<Position>>() {}.getType();
    private static final Type CLOSED_POSITION_ORDER_ARRAYLIST_TYPE =
            new TypeToken<ArrayList<ClosePositionOrder>>() {}.getType();

    /**
     * Instantiates a new {@link PositionsEndpoint}.
     *
     * @param alpacaClient the {@link AlpacaClient}
     */
    public PositionsEndpoint(AlpacaClient alpacaClient) {
        super(alpacaClient, "positions");
    }

    /**
     * Retrieves a list of the account's open {@link Position}s.
     *
     * @return a {@link List} of open {@link Position}s
     *
     * @throws AlpacaClientException thrown for {@link AlpacaClientException}s
     */
    public List<Position> get() throws AlpacaClientException {
        HttpUrl.Builder urlBuilder = alpacaClient.urlBuilder()
                .addPathSegment(endpointPathSegment);
        Request request = alpacaClient.requestBuilder(urlBuilder.build())
                .get()
                .build();
        return alpacaClient.requestObject(request, POSITION_ARRAYLIST_TYPE);
    }

    /**
     * Retrieves the account's open {@link Position}s for the given symbol or {@link Asset#getId()}.
     *
     * @param symbolOrAssetID the symbol or {@link Asset#getId()} (required)
     *
     * @return the open {@link Position}
     *
     * @throws AlpacaClientException thrown for {@link AlpacaClientException}s
     */
    public Position getBySymbol(String symbolOrAssetID) throws AlpacaClientException {
        checkNotNull(symbolOrAssetID);

        HttpUrl.Builder urlBuilder = alpacaClient.urlBuilder()
                .addPathSegment(endpointPathSegment)
                .addPathSegment(symbolOrAssetID);
        Request request = alpacaClient.requestBuilder(urlBuilder.build())
                .get()
                .build();
        return alpacaClient.requestObject(request, Position.class);
    }

    /**
     * Closes (liquidates) all of the account’s open long and short {@link Position}s. A response will be provided for
     * each order that is attempted to be cancelled. If an order is no longer cancelable, the server will respond with
     * status 500 and reject the request.
     *
     * @param cancelOrders if true is specified, cancel all open orders before liquidating all positions
     *
     * @return a {@link List} of open {@link ClosePositionOrder}s
     *
     * @throws AlpacaClientException thrown for {@link AlpacaClientException}s
     */
    public List<ClosePositionOrder> closeAll(Boolean cancelOrders) throws AlpacaClientException {
        HttpUrl.Builder urlBuilder = alpacaClient.urlBuilder()
                .addPathSegment(endpointPathSegment);

        if (cancelOrders != null) {
            urlBuilder.addQueryParameter("cancel_orders", cancelOrders.toString());
        }

        Request request = alpacaClient.requestBuilder(urlBuilder.build())
                .delete()
                .build();
        return alpacaClient.requestObject(request, STATUS_CODE_200_OR_207, CLOSED_POSITION_ORDER_ARRAYLIST_TYPE);
    }

    /**
     * Closes (liquidates) the account’s open position for the given <code>symbol</code>. Works for both long and short
     * positions.
     *
     * @param symbolOrAssetID the symbol or {@link Asset#getId()}
     * @param quantity        the number of shares to liquidate. Can accept up to <code>9</code> decimal points. Cannot
     *                        work with <code>percentage</code>.
     * @param percentage      the percentage of the position to liquidate. Must be between <code>0</code> and
     *                        <code>100</code>. Would only sell fractional if position is originally fractional. Can
     *                        accept up to <code>9</code> decimal points. Cannot work with <code>quantity</code>.
     *
     * @return a closing {@link Position} {@link Order}
     *
     * @throws AlpacaClientException thrown for {@link AlpacaClientException}s
     */
    public Order close(String symbolOrAssetID, Double quantity, Double percentage) throws AlpacaClientException {
        checkNotNull(symbolOrAssetID);

        HttpUrl.Builder urlBuilder = alpacaClient.urlBuilder()
                .addPathSegment(endpointPathSegment)
                .addPathSegment(symbolOrAssetID);

        if (quantity != null) {
            urlBuilder.addQueryParameter("qty", quantity.toString());
        }

        if (percentage != null) {
            urlBuilder.addQueryParameter("percentage", percentage.toString());
        }

        Request request = alpacaClient.requestBuilder(urlBuilder.build())
                .delete()
                .build();
        return alpacaClient.requestObject(request, Order.class);
    }
}
