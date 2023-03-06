
package net.jacobpeterson.alpaca.model.endpoint.streaming.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/streaming/">Streaming</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum StreamingMessageType {

    @SerializedName("listening")
    LISTENING("listening"),
    @SerializedName("authorization")
    AUTHORIZATION("authorization"),
    @SerializedName("trade_updates")
    TRADE_UPDATES("trade_updates");
    private final String value;
    private final static Map<String, StreamingMessageType> CONSTANTS = new HashMap<String, StreamingMessageType>();

    static {
        for (StreamingMessageType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    StreamingMessageType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static StreamingMessageType fromValue(String value) {
        StreamingMessageType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
