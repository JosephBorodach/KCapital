
package net.jacobpeterson.alpaca.model.properties;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * Defines the data APIs to use with Alpaca.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum DataAPIType {

    @SerializedName("iex")
    IEX("iex"),
    @SerializedName("sip")
    SIP("sip");
    private final String value;
    private final static Map<String, DataAPIType> CONSTANTS = new HashMap<String, DataAPIType>();

    static {
        for (DataAPIType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    DataAPIType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static DataAPIType fromValue(String value) {
        DataAPIType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
