
package net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.quote;

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
public class QuoteMessage
    extends SymbolMessage
    implements Serializable
{

    /**
     * Ask price.
     * <p>
     * 
     * Corresponds to the "ap" property.
     * 
     */
    @SerializedName("ap")
    @Expose
    private Double askPrice;
    /**
     * Bid price.
     * <p>
     * 
     * Corresponds to the "bp" property.
     * 
     */
    @SerializedName("bp")
    @Expose
    private Double bidPrice;
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
    private final static long serialVersionUID = 6625126542174259877L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public QuoteMessage() {
    }

    /**
     * 
     * @param source
     */
    public QuoteMessage(QuoteMessage source) {
        super();
        this.askPrice = source.askPrice;
        this.bidPrice = source.bidPrice;
        this.timestamp = source.timestamp;
    }

    /**
     * 
     * @param askPrice
     * @param bidPrice
     * @param timestamp
     */
    public QuoteMessage(Double askPrice, Double bidPrice, ZonedDateTime timestamp) {
        super();
        this.askPrice = askPrice;
        this.bidPrice = bidPrice;
        this.timestamp = timestamp;
    }

    /**
     * Ask price.
     * <p>
     * 
     * Corresponds to the "ap" property.
     * 
     */
    public Double getAskPrice() {
        return askPrice;
    }

    /**
     * Ask price.
     * <p>
     * 
     * Corresponds to the "ap" property.
     * 
     */
    public void setAskPrice(Double askPrice) {
        this.askPrice = askPrice;
    }

    public QuoteMessage withAskPrice(Double askPrice) {
        this.askPrice = askPrice;
        return this;
    }

    /**
     * Bid price.
     * <p>
     * 
     * Corresponds to the "bp" property.
     * 
     */
    public Double getBidPrice() {
        return bidPrice;
    }

    /**
     * Bid price.
     * <p>
     * 
     * Corresponds to the "bp" property.
     * 
     */
    public void setBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public QuoteMessage withBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
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

    public QuoteMessage withTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(QuoteMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("askPrice");
        sb.append('=');
        sb.append(((this.askPrice == null)?"<null>":this.askPrice));
        sb.append(',');
        sb.append("bidPrice");
        sb.append('=');
        sb.append(((this.bidPrice == null)?"<null>":this.bidPrice));
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
        result = ((result* 31)+((this.askPrice == null)? 0 :this.askPrice.hashCode()));
        result = ((result* 31)+((this.bidPrice == null)? 0 :this.bidPrice.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuoteMessage) == false) {
            return false;
        }
        QuoteMessage rhs = ((QuoteMessage) other);
        return (((super.equals(rhs)&&((this.askPrice == rhs.askPrice)||((this.askPrice!= null)&&this.askPrice.equals(rhs.askPrice))))&&((this.bidPrice == rhs.bidPrice)||((this.bidPrice!= null)&&this.bidPrice.equals(rhs.bidPrice))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
