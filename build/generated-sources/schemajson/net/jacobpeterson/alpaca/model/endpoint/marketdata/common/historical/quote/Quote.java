
package net.jacobpeterson.alpaca.model.endpoint.marketdata.common.historical.quote;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/">Market Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Quote implements Serializable
{

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
    private final static long serialVersionUID = 1616929938656366380L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Quote() {
    }

    /**
     * 
     * @param source
     */
    public Quote(Quote source) {
        super();
        this.timestamp = source.timestamp;
        this.askPrice = source.askPrice;
        this.bidPrice = source.bidPrice;
    }

    /**
     * 
     * @param askPrice
     * @param bidPrice
     * @param timestamp
     */
    public Quote(ZonedDateTime timestamp, Double askPrice, Double bidPrice) {
        super();
        this.timestamp = timestamp;
        this.askPrice = askPrice;
        this.bidPrice = bidPrice;
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

    public Quote withTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
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

    public Quote withAskPrice(Double askPrice) {
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

    public Quote withBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Quote.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("askPrice");
        sb.append('=');
        sb.append(((this.askPrice == null)?"<null>":this.askPrice));
        sb.append(',');
        sb.append("bidPrice");
        sb.append('=');
        sb.append(((this.bidPrice == null)?"<null>":this.bidPrice));
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Quote) == false) {
            return false;
        }
        Quote rhs = ((Quote) other);
        return ((((this.askPrice == rhs.askPrice)||((this.askPrice!= null)&&this.askPrice.equals(rhs.askPrice)))&&((this.bidPrice == rhs.bidPrice)||((this.bidPrice!= null)&&this.bidPrice.equals(rhs.bidPrice))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
