
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
public enum PortfolioPeriodUnit {

    @SerializedName("D")
    DAY("D"),
    @SerializedName("W")
    WEEK("W"),
    @SerializedName("M")
    MONTH("M"),
    @SerializedName("A")
    YEAR("A");
    private final String value;
    private final static Map<String, PortfolioPeriodUnit> CONSTANTS = new HashMap<String, PortfolioPeriodUnit>();

    static {
        for (PortfolioPeriodUnit c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    PortfolioPeriodUnit(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static PortfolioPeriodUnit fromValue(String value) {
        PortfolioPeriodUnit constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
