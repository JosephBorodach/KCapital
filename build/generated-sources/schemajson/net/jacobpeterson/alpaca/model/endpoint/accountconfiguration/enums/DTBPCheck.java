
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
public enum DTBPCheck {

    @SerializedName("both")
    BOTH("both"),
    @SerializedName("entry")
    ENTRY("entry"),
    @SerializedName("exit")
    EXIT("exit");
    private final String value;
    private final static Map<String, DTBPCheck> CONSTANTS = new HashMap<String, DTBPCheck>();

    static {
        for (DTBPCheck c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DTBPCheck(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static DTBPCheck fromValue(String value) {
        DTBPCheck constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
