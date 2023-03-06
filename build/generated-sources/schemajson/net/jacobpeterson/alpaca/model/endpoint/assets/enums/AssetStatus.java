
package net.jacobpeterson.alpaca.model.endpoint.assets.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/assets/">Assets</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum AssetStatus {

    @SerializedName("active")
    ACTIVE("active"),
    @SerializedName("inactive")
    INACTIVE("inactive");
    private final String value;
    private final static Map<String, AssetStatus> CONSTANTS = new HashMap<String, AssetStatus>();

    static {
        for (AssetStatus c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AssetStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static AssetStatus fromValue(String value) {
        AssetStatus constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
