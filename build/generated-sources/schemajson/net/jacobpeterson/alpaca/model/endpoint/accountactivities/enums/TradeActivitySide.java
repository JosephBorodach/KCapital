
package net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/account-activities/">Account Activities</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum TradeActivitySide {

    @SerializedName("buy")
    BUY("buy"),
    @SerializedName("sell")
    SELL("sell");
    private final String value;
    private final static Map<String, TradeActivitySide> CONSTANTS = new HashMap<String, TradeActivitySide>();

    static {
        for (TradeActivitySide c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TradeActivitySide(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TradeActivitySide fromValue(String value) {
        TradeActivitySide constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
