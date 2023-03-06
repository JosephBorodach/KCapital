
package net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-data-api-v2/historical/">Historical Stock Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum BarAdjustment {

    @SerializedName("raw")
    RAW("raw"),
    @SerializedName("split")
    SPLIT("split"),
    @SerializedName("dividend")
    DIVIDEND("dividend"),
    @SerializedName("all")
    ALL("all");
    private final String value;
    private final static Map<String, BarAdjustment> CONSTANTS = new HashMap<String, BarAdjustment>();

    static {
        for (BarAdjustment c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    BarAdjustment(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static BarAdjustment fromValue(String value) {
        BarAdjustment constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
