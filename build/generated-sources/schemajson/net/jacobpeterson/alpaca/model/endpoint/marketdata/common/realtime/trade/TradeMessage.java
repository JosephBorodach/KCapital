
package net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.trade;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.SymbolMessage;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/">Market Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class TradeMessage
    extends SymbolMessage
    implements Serializable
{

    /**
     * Trade ID.
     * <p>
     * 
     * Corresponds to the "i" property.
     * 
     */
    @SerializedName("i")
    @Expose
    private Integer tradeID;
    /**
     * Trade price.
     * <p>
     * 
     * Corresponds to the "p" property.
     * 
     */
    @SerializedName("p")
    @Expose
    private Double price;
    /**
     * Timestamp with nanosecond precision.
     * <p>
     * 
     * Corresponds to the "t" property.
     * 
     */
    @SerializedName("t")
    @Expose
    private ZonedDateTime timestamp;
    private final static long serialVersionUID = 4831182630350236563L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TradeMessage() {
    }

    /**
     * 
     * @param source
     */
    public TradeMessage(TradeMessage source) {
        super();
        this.tradeID = source.tradeID;
        this.price = source.price;
        this.timestamp = source.timestamp;
    }

    /**
     * 
     * @param price
     * @param tradeID
     * @param timestamp
     */
    public TradeMessage(Integer tradeID, Double price, ZonedDateTime timestamp) {
        super();
        this.tradeID = tradeID;
        this.price = price;
        this.timestamp = timestamp;
    }

    /**
     * Trade ID.
     * <p>
     * 
     * Corresponds to the "i" property.
     * 
     */
    public Integer getTradeID() {
        return tradeID;
    }

    /**
     * Trade ID.
     * <p>
     * 
     * Corresponds to the "i" property.
     * 
     */
    public void setTradeID(Integer tradeID) {
        this.tradeID = tradeID;
    }

    public TradeMessage withTradeID(Integer tradeID) {
        this.tradeID = tradeID;
        return this;
    }

    /**
     * Trade price.
     * <p>
     * 
     * Corresponds to the "p" property.
     * 
     */
    public Double getPrice() {
        return price;
    }

    /**
     * Trade price.
     * <p>
     * 
     * Corresponds to the "p" property.
     * 
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    public TradeMessage withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Timestamp with nanosecond precision.
     * <p>
     * 
     * Corresponds to the "t" property.
     * 
     */
    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp with nanosecond precision.
     * <p>
     * 
     * Corresponds to the "t" property.
     * 
     */
    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public TradeMessage withTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TradeMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("tradeID");
        sb.append('=');
        sb.append(((this.tradeID == null)?"<null>":this.tradeID));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
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
        result = ((result* 31)+((this.tradeID == null)? 0 :this.tradeID.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradeMessage) == false) {
            return false;
        }
        TradeMessage rhs = ((TradeMessage) other);
        return (((super.equals(rhs)&&((this.tradeID == rhs.tradeID)||((this.tradeID!= null)&&this.tradeID.equals(rhs.tradeID))))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
