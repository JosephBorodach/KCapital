
package net.jacobpeterson.alpaca.model.endpoint.accountactivities;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/account-activities/">Account Activities</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class NonTradeActivity
    extends AccountActivity
    implements Serializable
{

    /**
     * The date on which the activity occurred or on which the transaction associated with the activity settled.
     * <p>
     * 
     * 
     */
    @SerializedName("date")
    @Expose
    private String date;
    /**
     * The net amount of money (positive or negative) associated with the activity.
     * <p>
     * 
     * 
     */
    @SerializedName("net_amount")
    @Expose
    private String netAmount;
    /**
     * The symbol of the security involved with the activity. Not present for all activity types.
     * <p>
     * 
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    /**
     * For dividend activities, the number of shares that contributed to the payment. Not present for other activity types.
     * <p>
     * 
     * Corresponds to the "qty" property.
     * 
     */
    @SerializedName("qty")
    @Expose
    private String quantity;
    /**
     * For dividend activities, the average amount paid per share. Not present for other activity types.
     * <p>
     * 
     * 
     */
    @SerializedName("per_share_amount")
    @Expose
    private String perShareAmount;
    /**
     * Description field for transaction records (TRANS, CSR, CSD).
     * <p>
     * 
     * 
     */
    @SerializedName("description")
    @Expose
    private String description;
    /**
     * The status.
     * <p>
     * 
     * 
     */
    @SerializedName("status")
    @Expose
    private String status;
    private final static long serialVersionUID = 5305856461228403472L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public NonTradeActivity() {
    }

    /**
     * 
     * @param source
     */
    public NonTradeActivity(NonTradeActivity source) {
        super();
        this.date = source.date;
        this.netAmount = source.netAmount;
        this.symbol = source.symbol;
        this.quantity = source.quantity;
        this.perShareAmount = source.perShareAmount;
        this.description = source.description;
        this.status = source.status;
    }

    /**
     * 
     * @param date
     * @param symbol
     * @param quantity
     * @param perShareAmount
     * @param netAmount
     * @param description
     * @param status
     */
    public NonTradeActivity(String date, String netAmount, String symbol, String quantity, String perShareAmount, String description, String status) {
        super();
        this.date = date;
        this.netAmount = netAmount;
        this.symbol = symbol;
        this.quantity = quantity;
        this.perShareAmount = perShareAmount;
        this.description = description;
        this.status = status;
    }

    /**
     * The date on which the activity occurred or on which the transaction associated with the activity settled.
     * <p>
     * 
     * 
     */
    public String getDate() {
        return date;
    }

    /**
     * The date on which the activity occurred or on which the transaction associated with the activity settled.
     * <p>
     * 
     * 
     */
    public void setDate(String date) {
        this.date = date;
    }

    public NonTradeActivity withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * The net amount of money (positive or negative) associated with the activity.
     * <p>
     * 
     * 
     */
    public String getNetAmount() {
        return netAmount;
    }

    /**
     * The net amount of money (positive or negative) associated with the activity.
     * <p>
     * 
     * 
     */
    public void setNetAmount(String netAmount) {
        this.netAmount = netAmount;
    }

    public NonTradeActivity withNetAmount(String netAmount) {
        this.netAmount = netAmount;
        return this;
    }

    /**
     * The symbol of the security involved with the activity. Not present for all activity types.
     * <p>
     * 
     * 
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * The symbol of the security involved with the activity. Not present for all activity types.
     * <p>
     * 
     * 
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public NonTradeActivity withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * For dividend activities, the number of shares that contributed to the payment. Not present for other activity types.
     * <p>
     * 
     * Corresponds to the "qty" property.
     * 
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * For dividend activities, the number of shares that contributed to the payment. Not present for other activity types.
     * <p>
     * 
     * Corresponds to the "qty" property.
     * 
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public NonTradeActivity withQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * For dividend activities, the average amount paid per share. Not present for other activity types.
     * <p>
     * 
     * 
     */
    public String getPerShareAmount() {
        return perShareAmount;
    }

    /**
     * For dividend activities, the average amount paid per share. Not present for other activity types.
     * <p>
     * 
     * 
     */
    public void setPerShareAmount(String perShareAmount) {
        this.perShareAmount = perShareAmount;
    }

    public NonTradeActivity withPerShareAmount(String perShareAmount) {
        this.perShareAmount = perShareAmount;
        return this;
    }

    /**
     * Description field for transaction records (TRANS, CSR, CSD).
     * <p>
     * 
     * 
     */
    public String getDescription() {
        return description;
    }

    /**
     * Description field for transaction records (TRANS, CSR, CSD).
     * <p>
     * 
     * 
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public NonTradeActivity withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The status.
     * <p>
     * 
     * 
     */
    public String getStatus() {
        return status;
    }

    /**
     * The status.
     * <p>
     * 
     * 
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public NonTradeActivity withStatus(String status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NonTradeActivity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString!= null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0)&&(contentEnd >contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length()>baseLength) {
            sb.append(',');
        }
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("netAmount");
        sb.append('=');
        sb.append(((this.netAmount == null)?"<null>":this.netAmount));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("perShareAmount");
        sb.append('=');
        sb.append(((this.perShareAmount == null)?"<null>":this.perShareAmount));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.perShareAmount == null)? 0 :this.perShareAmount.hashCode()));
        result = ((result* 31)+((this.netAmount == null)? 0 :this.netAmount.hashCode()));
        result = ((result* 31)+((this.description == null)? 0 :this.description.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NonTradeActivity) == false) {
            return false;
        }
        NonTradeActivity rhs = ((NonTradeActivity) other);
        return (((((((super.equals(rhs)&&((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date))))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.perShareAmount == rhs.perShareAmount)||((this.perShareAmount!= null)&&this.perShareAmount.equals(rhs.perShareAmount))))&&((this.netAmount == rhs.netAmount)||((this.netAmount!= null)&&this.netAmount.equals(rhs.netAmount))))&&((this.description == rhs.description)||((this.description!= null)&&this.description.equals(rhs.description))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
