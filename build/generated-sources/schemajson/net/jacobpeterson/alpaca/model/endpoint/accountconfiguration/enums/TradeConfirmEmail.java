
package net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/account-configuration/">Account Configuration</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum TradeConfirmEmail {

    @SerializedName("all")
    ALL("all"),
    @SerializedName("none")
    NONE("none");
    private final String value;
    private final static Map<String, TradeConfirmEmail> CONSTANTS = new HashMap<String, TradeConfirmEmail>();

    static {
        for (TradeConfirmEmail c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TradeConfirmEmail(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TradeConfirmEmail fromValue(String value) {
        TradeConfirmEmail constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
