
package net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/account-activities/">Account Activities</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum ActivityType {


    /**
     * Order fills (both partial and full fills).
     * 
     */
    @SerializedName("FILL")
    FILL("FILL"),

    /**
     * Cash transactions (both CSD and CSW).
     * 
     */
    @SerializedName("TRANS")
    TRANS("TRANS"),

    /**
     * Miscellaneous or rarely used activity types (All types except those in TRANS, DIV, or FILL).
     * 
     */
    @SerializedName("MISC")
    MISC("MISC"),

    /**
     * ACATS IN/OUT (Cash).
     * 
     */
    @SerializedName("ACATC")
    ACATC("ACATC"),

    /**
     * ACATS IN/OUT (Securities).
     * 
     */
    @SerializedName("ACATS")
    ACATS("ACATS"),

    /**
     * Cash deposit(+).
     * 
     */
    @SerializedName("CSD")
    CSD("CSD"),

    /**
     * Cash receipt(-).
     * 
     */
    @SerializedName("CSR")
    CSR("CSR"),

    /**
     * Cash withdrawal(-).
     * 
     */
    @SerializedName("CSW")
    CSW("CSW"),

    /**
     * Dividends.
     * 
     */
    @SerializedName("DIV")
    DIV("DIV"),

    /**
     * Dividend (capital gain long term).
     * 
     */
    @SerializedName("DIVCGL")
    DIVCGL("DIVCGL"),

    /**
     * Dividend (capital gain short term).
     * 
     */
    @SerializedName("DIVCGS")
    DIVCGS("DIVCGS"),

    /**
     * Dividend fee.
     * 
     */
    @SerializedName("DIVFEE")
    DIVFEE("DIVFEE"),

    /**
     * Dividend adjusted (Foreign Tax Withheld).
     * 
     */
    @SerializedName("DIVFT")
    DIVFT("DIVFT"),

    /**
     * Dividend adjusted (NRA Withheld).
     * 
     */
    @SerializedName("DIVNRA")
    DIVNRA("DIVNRA"),

    /**
     * Dividend return of capital.
     * 
     */
    @SerializedName("DIVROC")
    DIVROC("DIVROC"),

    /**
     * Dividend adjusted (Tefra Withheld).
     * 
     */
    @SerializedName("DIVTW")
    DIVTW("DIVTW"),

    /**
     * Dividend (tax exempt).
     * 
     */
    @SerializedName("DIVTXEX")
    DIVTXEX("DIVTXEX"),

    /**
     * Interest (credit/margin).
     * 
     */
    @SerializedName("INT")
    INT("INT"),

    /**
     * Interest adjusted (NRA Withheld).
     * 
     */
    @SerializedName("INTNRA")
    INTNRA("INTNRA"),

    /**
     * Interest adjusted (Tefra Withheld).
     * 
     */
    @SerializedName("INTTW")
    INTTW("INTTW"),

    /**
     * Journal entry.
     * 
     */
    @SerializedName("JNL")
    JNL("JNL"),

    /**
     * Journal entry (cash).
     * 
     */
    @SerializedName("JNLC")
    JNLC("JNLC"),

    /**
     * Journal entry (stock).
     * 
     */
    @SerializedName("JNLS")
    JNLS("JNLS"),

    /**
     * Merger/Acquisition.
     * 
     */
    @SerializedName("MA")
    MA("MA"),

    /**
     * Name change.
     * 
     */
    @SerializedName("NC")
    NC("NC"),

    /**
     * Option assignment.
     * 
     */
    @SerializedName("OPASN")
    OPASN("OPASN"),

    /**
     * Option expiration.
     * 
     */
    @SerializedName("OPEXP")
    OPEXP("OPEXP"),

    /**
     * Option exercise.
     * 
     */
    @SerializedName("OPXRC")
    OPXRC("OPXRC"),

    /**
     * Pass Thru Charge.
     * 
     */
    @SerializedName("PTC")
    PTC("PTC"),

    /**
     * Pass Thru Rebate.
     * 
     */
    @SerializedName("PTR")
    PTR("PTR"),

    /**
     * REG/TAF fees.
     * 
     */
    @SerializedName("FEE")
    FEE("FEE"),

    /**
     * Reorg CA.
     * 
     */
    @SerializedName("REORG")
    REORG("REORG"),

    /**
     * Symbol change.
     * 
     */
    @SerializedName("SC")
    SC("SC"),

    /**
     * Stock spinoff.
     * 
     */
    @SerializedName("SSO")
    SSO("SSO"),

    /**
     * Stock split.
     * 
     */
    @SerializedName("SSP")
    SSP("SSP"),

    /**
     * Stock split.
     * 
     */
    @SerializedName("SPLIT")
    SPLIT("SPLIT");
    private final String value;
    private final static Map<String, ActivityType> CONSTANTS = new HashMap<String, ActivityType>();

    static {
        for (ActivityType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    ActivityType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static ActivityType fromValue(String value) {
        ActivityType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
