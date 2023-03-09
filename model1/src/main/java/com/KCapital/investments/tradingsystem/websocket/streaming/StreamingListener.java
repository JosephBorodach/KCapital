package com.KCapital.investments.tradingsystem.websocket.streaming;

import net.jacobpeterson.alpaca.model.endpoint.streaming.StreamingMessage;
import net.jacobpeterson.alpaca.model.endpoint.streaming.enums.StreamingMessageType;
import com.KCapital.investments.tradingsystem.websocket.AlpacaWebsocketMessageListener;

/**
 * {@link StreamingListener} defines a listener interface for {@link StreamingWebsocket} messages.
 */
public interface StreamingListener extends AlpacaWebsocketMessageListener<StreamingMessageType, StreamingMessage> {
}
