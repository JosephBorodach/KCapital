package com.KCapital.investments.tradingsystem.websocket.streaming;

import net.jacobpeterson.alpaca.model.endpoint.streaming.enums.StreamingMessageType;
import com.KCapital.investments.tradingsystem.websocket.AlpacaWebsocketInterface;

import java.util.Collection;

/**
 * {@link StreamingWebsocketInterface} is an {@link AlpacaWebsocketInterface} for a {@link StreamingWebsocket}.
 */
public interface StreamingWebsocketInterface extends AlpacaWebsocketInterface<StreamingListener> {

    /**
     * Sets the {@link StreamingMessageType}s for this stream to the given <code>streamingMessageTypes</code>.
     *
     * @param streamingMessageTypes the {@link StreamingMessageType}s
     */
    void streams(StreamingMessageType... streamingMessageTypes);

    /**
     * Gets all the currently subscribed {@link StreamingMessageType}s.
     *
     * @return a {@link Collection} of {@link StreamingMessageType}
     */
    Collection<StreamingMessageType> streams();
}
