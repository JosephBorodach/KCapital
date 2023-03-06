
package net.jacobpeterson.alpaca.model.endpoint.account.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/account/">Account</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum AccountStatus {


    /**
     * The account is onboarding.
     * 
     */
    @SerializedName("ONBOARDING")
    ONBOARDING("ONBOARDING"),

    /**
     * The account application submission failed for some reason.
     * 
     */
    @SerializedName("SUBMISSION_FAILED")
    SUBMISSION_FAILED("SUBMISSION_FAILED"),

    /**
     * The account application has been submitted for review.
     * 
     */
    @SerializedName("SUBMITTED")
    SUBMITTED("SUBMITTED"),

    /**
     * The account information is being updated.
     * 
     */
    @SerializedName("ACCOUNT_UPDATED")
    ACCOUNT_UPDATED("ACCOUNT_UPDATED"),

    /**
     * The final account approval is pending.
     * 
     */
    @SerializedName("APPROVAL_PENDING")
    APPROVAL_PENDING("APPROVAL_PENDING"),

    /**
     * The account is active for trading.
     * 
     */
    @SerializedName("ACTIVE")
    ACTIVE("ACTIVE"),

    /**
     * The account application has been rejected.
     * 
     */
    @SerializedName("REJECTED")
    REJECTED("REJECTED"),

    /**
     * The account has been disabled.
     * 
     */
    @SerializedName("DISABLED")
    DISABLED("DISABLED"),

    /**
     * The account requires manual attention.
     * 
     */
    @SerializedName("ACTION_REQUIRED")
    ACTION_REQUIRED("ACTION_REQUIRED");
    private final String value;
    private final static Map<String, AccountStatus> CONSTANTS = new HashMap<String, AccountStatus>();

    static {
        for (AccountStatus c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    AccountStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static AccountStatus fromValue(String value) {
        AccountStatus constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
