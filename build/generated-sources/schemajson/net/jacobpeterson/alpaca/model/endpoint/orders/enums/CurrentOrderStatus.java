
package net.jacobpeterson.alpaca.model.endpoint.orders.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/orders/">Orders</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum CurrentOrderStatus {

    @SerializedName("open")
    OPEN("open"),
    @SerializedName("closed")
    CLOSED("closed"),
    @SerializedName("all")
    ALL("all");
    private final String value;
    private final static Map<String, CurrentOrderStatus> CONSTANTS = new HashMap<String, CurrentOrderStatus>();

    static {
        for (CurrentOrderStatus c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    CurrentOrderStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static CurrentOrderStatus fromValue(String value) {
        CurrentOrderStatus constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
