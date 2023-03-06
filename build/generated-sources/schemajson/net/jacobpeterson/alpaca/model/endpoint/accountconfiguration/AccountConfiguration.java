
package net.jacobpeterson.alpaca.model.endpoint.accountconfiguration;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.DTBPCheck;
import net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.TradeConfirmEmail;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/account-configuration/">Account Configuration</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class AccountConfiguration implements Serializable
{

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.DTBPCheck}. Controls Day Trading Margin Call (DTMC) checks.
     * <p>
     * 
     * 
     */
    @SerializedName("dtbp_check")
    @Expose
    private DTBPCheck dtbpCheck;
    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.TradeConfirmEmail}. If {@link net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.TradeConfirmEmail#NONE}, emails for order fills are not sent.
     * <p>
     * 
     * 
     */
    @SerializedName("trade_confirm_email")
    @Expose
    private TradeConfirmEmail tradeConfirmEmail;
    /**
     * If true, new orders are blocked.
     * <p>
     * 
     * 
     */
    @SerializedName("suspend_trade")
    @Expose
    private Boolean suspendTrade;
    /**
     * If true, account becomes long-only mode.
     * <p>
     * 
     * 
     */
    @SerializedName("no_shorting")
    @Expose
    private Boolean noShorting;
    private final static long serialVersionUID = -7728507095584141136L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AccountConfiguration() {
    }

    /**
     * 
     * @param source
     */
    public AccountConfiguration(AccountConfiguration source) {
        super();
        this.dtbpCheck = source.dtbpCheck;
        this.tradeConfirmEmail = source.tradeConfirmEmail;
        this.suspendTrade = source.suspendTrade;
        this.noShorting = source.noShorting;
    }

    /**
     * 
     * @param tradeConfirmEmail
     * @param suspendTrade
     * @param dtbpCheck
     * @param noShorting
     */
    public AccountConfiguration(DTBPCheck dtbpCheck, TradeConfirmEmail tradeConfirmEmail, Boolean suspendTrade, Boolean noShorting) {
        super();
        this.dtbpCheck = dtbpCheck;
        this.tradeConfirmEmail = tradeConfirmEmail;
        this.suspendTrade = suspendTrade;
        this.noShorting = noShorting;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.DTBPCheck}. Controls Day Trading Margin Call (DTMC) checks.
     * <p>
     * 
     * 
     */
    public DTBPCheck getDtbpCheck() {
        return dtbpCheck;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.DTBPCheck}. Controls Day Trading Margin Call (DTMC) checks.
     * <p>
     * 
     * 
     */
    public void setDtbpCheck(DTBPCheck dtbpCheck) {
        this.dtbpCheck = dtbpCheck;
    }

    public AccountConfiguration withDtbpCheck(DTBPCheck dtbpCheck) {
        this.dtbpCheck = dtbpCheck;
        return this;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.TradeConfirmEmail}. If {@link net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.TradeConfirmEmail#NONE}, emails for order fills are not sent.
     * <p>
     * 
     * 
     */
    public TradeConfirmEmail getTradeConfirmEmail() {
        return tradeConfirmEmail;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.TradeConfirmEmail}. If {@link net.jacobpeterson.alpaca.model.endpoint.accountconfiguration.enums.TradeConfirmEmail#NONE}, emails for order fills are not sent.
     * <p>
     * 
     * 
     */
    public void setTradeConfirmEmail(TradeConfirmEmail tradeConfirmEmail) {
        this.tradeConfirmEmail = tradeConfirmEmail;
    }

    public AccountConfiguration withTradeConfirmEmail(TradeConfirmEmail tradeConfirmEmail) {
        this.tradeConfirmEmail = tradeConfirmEmail;
        return this;
    }

    /**
     * If true, new orders are blocked.
     * <p>
     * 
     * 
     */
    public Boolean getSuspendTrade() {
        return suspendTrade;
    }

    /**
     * If true, new orders are blocked.
     * <p>
     * 
     * 
     */
    public void setSuspendTrade(Boolean suspendTrade) {
        this.suspendTrade = suspendTrade;
    }

    public AccountConfiguration withSuspendTrade(Boolean suspendTrade) {
        this.suspendTrade = suspendTrade;
        return this;
    }

    /**
     * If true, account becomes long-only mode.
     * <p>
     * 
     * 
     */
    public Boolean getNoShorting() {
        return noShorting;
    }

    /**
     * If true, account becomes long-only mode.
     * <p>
     * 
     * 
     */
    public void setNoShorting(Boolean noShorting) {
        this.noShorting = noShorting;
    }

    public AccountConfiguration withNoShorting(Boolean noShorting) {
        this.noShorting = noShorting;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountConfiguration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dtbpCheck");
        sb.append('=');
        sb.append(((this.dtbpCheck == null)?"<null>":this.dtbpCheck));
        sb.append(',');
        sb.append("tradeConfirmEmail");
        sb.append('=');
        sb.append(((this.tradeConfirmEmail == null)?"<null>":this.tradeConfirmEmail));
        sb.append(',');
        sb.append("suspendTrade");
        sb.append('=');
        sb.append(((this.suspendTrade == null)?"<null>":this.suspendTrade));
        sb.append(',');
        sb.append("noShorting");
        sb.append('=');
        sb.append(((this.noShorting == null)?"<null>":this.noShorting));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.tradeConfirmEmail == null)? 0 :this.tradeConfirmEmail.hashCode()));
        result = ((result* 31)+((this.dtbpCheck == null)? 0 :this.dtbpCheck.hashCode()));
        result = ((result* 31)+((this.noShorting == null)? 0 :this.noShorting.hashCode()));
        result = ((result* 31)+((this.suspendTrade == null)? 0 :this.suspendTrade.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountConfiguration) == false) {
            return false;
        }
        AccountConfiguration rhs = ((AccountConfiguration) other);
        return (((((this.tradeConfirmEmail == rhs.tradeConfirmEmail)||((this.tradeConfirmEmail!= null)&&this.tradeConfirmEmail.equals(rhs.tradeConfirmEmail)))&&((this.dtbpCheck == rhs.dtbpCheck)||((this.dtbpCheck!= null)&&this.dtbpCheck.equals(rhs.dtbpCheck))))&&((this.noShorting == rhs.noShorting)||((this.noShorting!= null)&&this.noShorting.equals(rhs.noShorting))))&&((this.suspendTrade == rhs.suspendTrade)||((this.suspendTrade!= null)&&this.suspendTrade.equals(rhs.suspendTrade))));
    }

}
