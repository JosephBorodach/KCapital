
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
public enum OrderClass {

    @SerializedName("simple")
    SIMPLE("simple"),
    @SerializedName("bracket")
    BRACKET("bracket"),
    @SerializedName("oco")
    ONE_CANCELS_OTHER("oco"),
    @SerializedName("oto")
    ONE_TRIGGERS_OTHER("oto");
    private final String value;
    private final static Map<String, OrderClass> CONSTANTS = new HashMap<String, OrderClass>();

    static {
        for (OrderClass c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    OrderClass(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static OrderClass fromValue(String value) {
        OrderClass constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
