
package net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/account-activities/">Account Activities</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum TradeActivityType {

    @SerializedName("fill")
    FILL("fill"),
    @SerializedName("partial_fill")
    PARTIAL_FILL("partial_fill");
    private final String value;
    private final static Map<String, TradeActivityType> CONSTANTS = new HashMap<String, TradeActivityType>();

    static {
        for (TradeActivityType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TradeActivityType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TradeActivityType fromValue(String value) {
        TradeActivityType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
