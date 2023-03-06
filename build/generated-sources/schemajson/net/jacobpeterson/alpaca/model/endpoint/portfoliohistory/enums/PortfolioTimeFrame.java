
package net.jacobpeterson.alpaca.model.endpoint.portfoliohistory.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/portfolio-history/">Portfolio History</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum PortfolioTimeFrame {

    @SerializedName("1Min")
    ONE_MIN("1Min"),
    @SerializedName("5Min")
    FIVE_MINUTE("5Min"),
    @SerializedName("15Min")
    FIFTEEN_MINUTE("15Min"),
    @SerializedName("1H")
    ONE_HOUR("1H"),
    @SerializedName("1D")
    ONE_DAY("1D");
    private final String value;
    private final static Map<String, PortfolioTimeFrame> CONSTANTS = new HashMap<String, PortfolioTimeFrame>();

    static {
        for (PortfolioTimeFrame c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PortfolioTimeFrame(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static PortfolioTimeFrame fromValue(String value) {
        PortfolioTimeFrame constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
