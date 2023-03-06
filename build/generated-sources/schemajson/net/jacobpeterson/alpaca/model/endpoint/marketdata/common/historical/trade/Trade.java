
package net.jacobpeterson.alpaca.model.endpoint.marketdata.common.historical.trade;

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
public class Trade implements Serializable
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
     * Trade ID.
     * <p>
     * 
     * Corresponds to the "i" property.
     * 
     */
    @SerializedName("i")
    @Expose
    private Long tradeID;
    private final static long serialVersionUID = 8195106981249142234L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Trade() {
    }

    /**
     * 
     * @param source
     */
    public Trade(Trade source) {
        super();
        this.timestamp = source.timestamp;
        this.price = source.price;
        this.tradeID = source.tradeID;
    }

    /**
     * 
     * @param price
     * @param tradeID
     * @param timestamp
     */
    public Trade(ZonedDateTime timestamp, Double price, Long tradeID) {
        super();
        this.timestamp = timestamp;
        this.price = price;
        this.tradeID = tradeID;
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

    public Trade withTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
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

    public Trade withPrice(Double price) {
        this.price = price;
        return this;
    }

    /**
     * Trade ID.
     * <p>
     * 
     * Corresponds to the "i" property.
     * 
     */
    public Long getTradeID() {
        return tradeID;
    }

    /**
     * Trade ID.
     * <p>
     * 
     * Corresponds to the "i" property.
     * 
     */
    public void setTradeID(Long tradeID) {
        this.tradeID = tradeID;
    }

    public Trade withTradeID(Long tradeID) {
        this.tradeID = tradeID;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Trade.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("tradeID");
        sb.append('=');
        sb.append(((this.tradeID == null)?"<null>":this.tradeID));
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
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.tradeID == null)? 0 :this.tradeID.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Trade) == false) {
            return false;
        }
        Trade rhs = ((Trade) other);
        return ((((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price)))&&((this.tradeID == rhs.tradeID)||((this.tradeID!= null)&&this.tradeID.equals(rhs.tradeID))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
