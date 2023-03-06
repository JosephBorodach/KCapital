
package net.jacobpeterson.alpaca.model.endpoint.assets.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/assets/">Assets</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum AssetClass {

    @SerializedName("us_equity")
    US_EQUITY("us_equity"),
    @SerializedName("crypto")
    CRYPTO("crypto");
    private final String value;
    private final static Map<String, AssetClass> CONSTANTS = new HashMap<String, AssetClass>();

    static {
        for (AssetClass c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AssetClass(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static AssetClass fromValue(String value) {
        AssetClass constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
