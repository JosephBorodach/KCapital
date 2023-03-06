
package net.jacobpeterson.alpaca.model.endpoint.marketdata.common.historical.bar.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/">Market Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum BarTimePeriod {

    @SerializedName("Min")
    MINUTE("Min"),
    @SerializedName("Hour")
    HOUR("Hour"),
    @SerializedName("Day")
    DAY("Day");
    private final String value;
    private final static Map<String, BarTimePeriod> CONSTANTS = new HashMap<String, BarTimePeriod>();

    static {
        for (BarTimePeriod c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    BarTimePeriod(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static BarTimePeriod fromValue(String value) {
        BarTimePeriod constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
