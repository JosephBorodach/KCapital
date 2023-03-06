
package net.jacobpeterson.alpaca.model.endpoint.marketdata.common.historical.bar;

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
public class Bar implements Serializable
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
     * Open price.
     * <p>
     * 
     * Corresponds to the "o" property.
     * 
     */
    @SerializedName("o")
    @Expose
    private Double open;
    /**
     * High price.
     * <p>
     * 
     * Corresponds to the "h" property.
     * 
     */
    @SerializedName("h")
    @Expose
    private Double high;
    /**
     * Low price.
     * <p>
     * 
     * Corresponds to the "l" property.
     * 
     */
    @SerializedName("l")
    @Expose
    private Double low;
    /**
     * Close price.
     * <p>
     * 
     * Corresponds to the "c" property.
     * 
     */
    @SerializedName("c")
    @Expose
    private Double close;
    /**
     * Trade count.
     * <p>
     * 
     * Corresponds to the "n" property.
     * 
     */
    @SerializedName("n")
    @Expose
    private Long tradeCount;
    /**
     * VWAP (Volume Weighted Average Price).
     * <p>
     * 
     * Corresponds to the "vw" property.
     * 
     */
    @SerializedName("vw")
    @Expose
    private Double vwap;
    private final static long serialVersionUID = -6579479233143619673L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Bar() {
    }

    /**
     * 
     * @param source
     */
    public Bar(Bar source) {
        super();
        this.timestamp = source.timestamp;
        this.open = source.open;
        this.high = source.high;
        this.low = source.low;
        this.close = source.close;
        this.tradeCount = source.tradeCount;
        this.vwap = source.vwap;
    }

    /**
     * 
     * @param high
     * @param tradeCount
     * @param low
     * @param vwap
     * @param close
     * @param open
     * @param timestamp
     */
    public Bar(ZonedDateTime timestamp, Double open, Double high, Double low, Double close, Long tradeCount, Double vwap) {
        super();
        this.timestamp = timestamp;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.tradeCount = tradeCount;
        this.vwap = vwap;
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

    public Bar withTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Open price.
     * <p>
     * 
     * Corresponds to the "o" property.
     * 
     */
    public Double getOpen() {
        return open;
    }

    /**
     * Open price.
     * <p>
     * 
     * Corresponds to the "o" property.
     * 
     */
    public void setOpen(Double open) {
        this.open = open;
    }

    public Bar withOpen(Double open) {
        this.open = open;
        return this;
    }

    /**
     * High price.
     * <p>
     * 
     * Corresponds to the "h" property.
     * 
     */
    public Double getHigh() {
        return high;
    }

    /**
     * High price.
     * <p>
     * 
     * Corresponds to the "h" property.
     * 
     */
    public void setHigh(Double high) {
        this.high = high;
    }

    public Bar withHigh(Double high) {
        this.high = high;
        return this;
    }

    /**
     * Low price.
     * <p>
     * 
     * Corresponds to the "l" property.
     * 
     */
    public Double getLow() {
        return low;
    }

    /**
     * Low price.
     * <p>
     * 
     * Corresponds to the "l" property.
     * 
     */
    public void setLow(Double low) {
        this.low = low;
    }

    public Bar withLow(Double low) {
        this.low = low;
        return this;
    }

    /**
     * Close price.
     * <p>
     * 
     * Corresponds to the "c" property.
     * 
     */
    public Double getClose() {
        return close;
    }

    /**
     * Close price.
     * <p>
     * 
     * Corresponds to the "c" property.
     * 
     */
    public void setClose(Double close) {
        this.close = close;
    }

    public Bar withClose(Double close) {
        this.close = close;
        return this;
    }

    /**
     * Trade count.
     * <p>
     * 
     * Corresponds to the "n" property.
     * 
     */
    public Long getTradeCount() {
        return tradeCount;
    }

    /**
     * Trade count.
     * <p>
     * 
     * Corresponds to the "n" property.
     * 
     */
    public void setTradeCount(Long tradeCount) {
        this.tradeCount = tradeCount;
    }

    public Bar withTradeCount(Long tradeCount) {
        this.tradeCount = tradeCount;
        return this;
    }

    /**
     * VWAP (Volume Weighted Average Price).
     * <p>
     * 
     * Corresponds to the "vw" property.
     * 
     */
    public Double getVwap() {
        return vwap;
    }

    /**
     * VWAP (Volume Weighted Average Price).
     * <p>
     * 
     * Corresponds to the "vw" property.
     * 
     */
    public void setVwap(Double vwap) {
        this.vwap = vwap;
    }

    public Bar withVwap(Double vwap) {
        this.vwap = vwap;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Bar.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("open");
        sb.append('=');
        sb.append(((this.open == null)?"<null>":this.open));
        sb.append(',');
        sb.append("high");
        sb.append('=');
        sb.append(((this.high == null)?"<null>":this.high));
        sb.append(',');
        sb.append("low");
        sb.append('=');
        sb.append(((this.low == null)?"<null>":this.low));
        sb.append(',');
        sb.append("close");
        sb.append('=');
        sb.append(((this.close == null)?"<null>":this.close));
        sb.append(',');
        sb.append("tradeCount");
        sb.append('=');
        sb.append(((this.tradeCount == null)?"<null>":this.tradeCount));
        sb.append(',');
        sb.append("vwap");
        sb.append('=');
        sb.append(((this.vwap == null)?"<null>":this.vwap));
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
        result = ((result* 31)+((this.high == null)? 0 :this.high.hashCode()));
        result = ((result* 31)+((this.tradeCount == null)? 0 :this.tradeCount.hashCode()));
        result = ((result* 31)+((this.low == null)? 0 :this.low.hashCode()));
        result = ((result* 31)+((this.vwap == null)? 0 :this.vwap.hashCode()));
        result = ((result* 31)+((this.close == null)? 0 :this.close.hashCode()));
        result = ((result* 31)+((this.open == null)? 0 :this.open.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Bar) == false) {
            return false;
        }
        Bar rhs = ((Bar) other);
        return ((((((((this.high == rhs.high)||((this.high!= null)&&this.high.equals(rhs.high)))&&((this.tradeCount == rhs.tradeCount)||((this.tradeCount!= null)&&this.tradeCount.equals(rhs.tradeCount))))&&((this.low == rhs.low)||((this.low!= null)&&this.low.equals(rhs.low))))&&((this.vwap == rhs.vwap)||((this.vwap!= null)&&this.vwap.equals(rhs.vwap))))&&((this.close == rhs.close)||((this.close!= null)&&this.close.equals(rhs.close))))&&((this.open == rhs.open)||((this.open!= null)&&this.open.equals(rhs.open))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
