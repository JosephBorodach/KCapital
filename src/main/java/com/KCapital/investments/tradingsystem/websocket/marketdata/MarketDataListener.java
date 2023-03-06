package com.KCapital.investments.tradingsystem.websocket.marketdata;

import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.MarketDataMessage;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.enums.MarketDataMessageType;
import com.KCapital.investments.tradingsystem.websocket.AlpacaWebsocketMessageListener;

/**
 * {@link MarketDataListener} defines a listener interface for {@link MarketDataWebsocket} messages.
 */
public interface MarketDataListener extends AlpacaWebsocketMessageListener<MarketDataMessageType, MarketDataMessage> {
}
