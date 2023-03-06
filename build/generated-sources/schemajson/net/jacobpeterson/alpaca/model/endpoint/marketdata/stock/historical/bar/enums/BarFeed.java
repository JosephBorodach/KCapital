
package net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-data-api-v2/historical/">Historical Stock Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum BarFeed {

    @SerializedName("IEX")
    IEX("IEX"),
    @SerializedName("SIP")
    SIP("SIP");
    private final String value;
    private final static Map<String, BarFeed> CONSTANTS = new HashMap<String, BarFeed>();

    static {
        for (BarFeed c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    BarFeed(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static BarFeed fromValue(String value) {
        BarFeed constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
