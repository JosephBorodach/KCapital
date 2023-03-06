
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
public enum OrderSide {

    @SerializedName("buy")
    BUY("buy"),
    @SerializedName("sell")
    SELL("sell");
    private final String value;
    private final static Map<String, OrderSide> CONSTANTS = new HashMap<String, OrderSide>();

    static {
        for (OrderSide c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    OrderSide(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static OrderSide fromValue(String value) {
        OrderSide constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
