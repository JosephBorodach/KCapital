
package net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-crypto-data/">Crypto Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum TakerSide {

    @SerializedName("B")
    BUY("B"),
    @SerializedName("S")
    SELL("S");
    private final String value;
    private final static Map<String, TakerSide> CONSTANTS = new HashMap<String, TakerSide>();

    static {
        for (TakerSide c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TakerSide(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TakerSide fromValue(String value) {
        TakerSide constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
