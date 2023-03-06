
package net.jacobpeterson.alpaca.model.endpoint.common.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * Defines enums for sort directions.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum SortDirection {

    @SerializedName("asc")
    ASCENDING("asc"),
    @SerializedName("desc")
    DESCENDING("desc");
    private final String value;
    private final static Map<String, SortDirection> CONSTANTS = new HashMap<String, SortDirection>();

    static {
        for (SortDirection c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    SortDirection(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static SortDirection fromValue(String value) {
        SortDirection constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
