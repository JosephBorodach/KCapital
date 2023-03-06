
package net.jacobpeterson.alpaca.model.endpoint.accountactivities;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.TradeActivitySide;
import net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.TradeActivityType;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/account-activities/">Account Activities</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class TradeActivity
    extends AccountActivity
    implements Serializable
{

    /**
     * The cumulative quantity of shares involved in the execution.
     * <p>
     * 
     * Corresponds to the "cum_qty" property.
     * 
     */
    @SerializedName("cum_qty")
    @Expose
    private String cumulativeQuantity;
    /**
     * For partially_filled orders, the quantity of shares that are left to be filled.
     * <p>
     * 
     * Corresponds to the "leaves_qty" property.
     * 
     */
    @SerializedName("leaves_qty")
    @Expose
    private String remainingQuantity;
    /**
     * The per-share price that the trade was executed at.
     * <p>
     * 
     * 
     */
    @SerializedName("price")
    @Expose
    private String price;
    /**
     * The number of shares involved in the trade execution.
     * <p>
     * 
     * Corresponds to the "qty" property.
     * 
     */
    @SerializedName("qty")
    @Expose
    private String quantity;
    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.TradeActivitySide}.
     * <p>
     * 
     * 
     */
    @SerializedName("side")
    @Expose
    private TradeActivitySide side;
    /**
     * The symbol of the security being traded.
     * <p>
     * 
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    /**
     * The time at which the execution occurred.
     * <p>
     * 
     * 
     */
    @SerializedName("transaction_time")
    @Expose
    private ZonedDateTime transactionTime;
    /**
     * The id for the order that filled. Always in GUID format.
     * <p>
     * 
     * 
     */
    @SerializedName("order_id")
    @Expose
    private String orderId;
    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.TradeActivityType}.
     * <p>
     * 
     * 
     */
    @SerializedName("type")
    @Expose
    private TradeActivityType type;
    private final static long serialVersionUID = -7611495578783214044L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TradeActivity() {
    }

    /**
     * 
     * @param source
     */
    public TradeActivity(TradeActivity source) {
        super();
        this.cumulativeQuantity = source.cumulativeQuantity;
        this.remainingQuantity = source.remainingQuantity;
        this.price = source.price;
        this.quantity = source.quantity;
        this.side = source.side;
        this.symbol = source.symbol;
        this.transactionTime = source.transactionTime;
        this.orderId = source.orderId;
        this.type = source.type;
    }

    /**
     * 
     * @param remainingQuantity
     * @param cumulativeQuantity
     * @param symbol
     * @param side
     * @param quantity
     * @param orderId
     * @param price
     * @param transactionTime
     * @param type
     */
    public TradeActivity(String cumulativeQuantity, String remainingQuantity, String price, String quantity, TradeActivitySide side, String symbol, ZonedDateTime transactionTime, String orderId, TradeActivityType type) {
        super();
        this.cumulativeQuantity = cumulativeQuantity;
        this.remainingQuantity = remainingQuantity;
        this.price = price;
        this.quantity = quantity;
        this.side = side;
        this.symbol = symbol;
        this.transactionTime = transactionTime;
        this.orderId = orderId;
        this.type = type;
    }

    /**
     * The cumulative quantity of shares involved in the execution.
     * <p>
     * 
     * Corresponds to the "cum_qty" property.
     * 
     */
    public String getCumulativeQuantity() {
        return cumulativeQuantity;
    }

    /**
     * The cumulative quantity of shares involved in the execution.
     * <p>
     * 
     * Corresponds to the "cum_qty" property.
     * 
     */
    public void setCumulativeQuantity(String cumulativeQuantity) {
        this.cumulativeQuantity = cumulativeQuantity;
    }

    public TradeActivity withCumulativeQuantity(String cumulativeQuantity) {
        this.cumulativeQuantity = cumulativeQuantity;
        return this;
    }

    /**
     * For partially_filled orders, the quantity of shares that are left to be filled.
     * <p>
     * 
     * Corresponds to the "leaves_qty" property.
     * 
     */
    public String getRemainingQuantity() {
        return remainingQuantity;
    }

    /**
     * For partially_filled orders, the quantity of shares that are left to be filled.
     * <p>
     * 
     * Corresponds to the "leaves_qty" property.
     * 
     */
    public void setRemainingQuantity(String remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    public TradeActivity withRemainingQuantity(String remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
        return this;
    }

    /**
     * The per-share price that the trade was executed at.
     * <p>
     * 
     * 
     */
    public String getPrice() {
        return price;
    }

    /**
     * The per-share price that the trade was executed at.
     * <p>
     * 
     * 
     */
    public void setPrice(String price) {
        this.price = price;
    }

    public TradeActivity withPrice(String price) {
        this.price = price;
        return this;
    }

    /**
     * The number of shares involved in the trade execution.
     * <p>
     * 
     * Corresponds to the "qty" property.
     * 
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * The number of shares involved in the trade execution.
     * <p>
     * 
     * Corresponds to the "qty" property.
     * 
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public TradeActivity withQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.TradeActivitySide}.
     * <p>
     * 
     * 
     */
    public TradeActivitySide getSide() {
        return side;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.TradeActivitySide}.
     * <p>
     * 
     * 
     */
    public void setSide(TradeActivitySide side) {
        this.side = side;
    }

    public TradeActivity withSide(TradeActivitySide side) {
        this.side = side;
        return this;
    }

    /**
     * The symbol of the security being traded.
     * <p>
     * 
     * 
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * The symbol of the security being traded.
     * <p>
     * 
     * 
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public TradeActivity withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * The time at which the execution occurred.
     * <p>
     * 
     * 
     */
    public ZonedDateTime getTransactionTime() {
        return transactionTime;
    }

    /**
     * The time at which the execution occurred.
     * <p>
     * 
     * 
     */
    public void setTransactionTime(ZonedDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    public TradeActivity withTransactionTime(ZonedDateTime transactionTime) {
        this.transactionTime = transactionTime;
        return this;
    }

    /**
     * The id for the order that filled. Always in GUID format.
     * <p>
     * 
     * 
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * The id for the order that filled. Always in GUID format.
     * <p>
     * 
     * 
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public TradeActivity withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.TradeActivityType}.
     * <p>
     * 
     * 
     */
    public TradeActivityType getType() {
        return type;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.TradeActivityType}.
     * <p>
     * 
     * 
     */
    public void setType(TradeActivityType type) {
        this.type = type;
    }

    public TradeActivity withType(TradeActivityType type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TradeActivity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("cumulativeQuantity");
        sb.append('=');
        sb.append(((this.cumulativeQuantity == null)?"<null>":this.cumulativeQuantity));
        sb.append(',');
        sb.append("remainingQuantity");
        sb.append('=');
        sb.append(((this.remainingQuantity == null)?"<null>":this.remainingQuantity));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("side");
        sb.append('=');
        sb.append(((this.side == null)?"<null>":this.side));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("transactionTime");
        sb.append('=');
        sb.append(((this.transactionTime == null)?"<null>":this.transactionTime));
        sb.append(',');
        sb.append("orderId");
        sb.append('=');
        sb.append(((this.orderId == null)?"<null>":this.orderId));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
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
        result = ((result* 31)+((this.remainingQuantity == null)? 0 :this.remainingQuantity.hashCode()));
        result = ((result* 31)+((this.cumulativeQuantity == null)? 0 :this.cumulativeQuantity.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.side == null)? 0 :this.side.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.orderId == null)? 0 :this.orderId.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.transactionTime == null)? 0 :this.transactionTime.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradeActivity) == false) {
            return false;
        }
        TradeActivity rhs = ((TradeActivity) other);
        return (((((((((super.equals(rhs)&&((this.remainingQuantity == rhs.remainingQuantity)||((this.remainingQuantity!= null)&&this.remainingQuantity.equals(rhs.remainingQuantity))))&&((this.cumulativeQuantity == rhs.cumulativeQuantity)||((this.cumulativeQuantity!= null)&&this.cumulativeQuantity.equals(rhs.cumulativeQuantity))))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.side == rhs.side)||((this.side!= null)&&this.side.equals(rhs.side))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.orderId == rhs.orderId)||((this.orderId!= null)&&this.orderId.equals(rhs.orderId))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.transactionTime == rhs.transactionTime)||((this.transactionTime!= null)&&this.transactionTime.equals(rhs.transactionTime))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))));
    }

}
