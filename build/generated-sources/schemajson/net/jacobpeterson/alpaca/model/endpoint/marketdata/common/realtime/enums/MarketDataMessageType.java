
package net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/">Market Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum MarketDataMessageType {

    @SerializedName("success")
    SUCCESS("success"),
    @SerializedName("error")
    ERROR("error"),
    @SerializedName("subscription")
    SUBSCRIPTION("subscription"),
    @SerializedName("t")
    TRADE("t"),
    @SerializedName("q")
    QUOTE("q"),
    @SerializedName("b")
    BAR("b");
    private final String value;
    private final static Map<String, MarketDataMessageType> CONSTANTS = new HashMap<String, MarketDataMessageType>();

    static {
        for (MarketDataMessageType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    MarketDataMessageType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static MarketDataMessageType fromValue(String value) {
        MarketDataMessageType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
