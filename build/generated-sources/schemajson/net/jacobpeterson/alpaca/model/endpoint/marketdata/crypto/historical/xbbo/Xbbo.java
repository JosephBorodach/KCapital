
package net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.xbbo;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-crypto-data/historical/">Historical Crypto Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Xbbo implements Serializable
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
     * Ask Exchange.
     * <p>
     * 
     * Corresponds to the "ax" property.
     * 
     */
    @SerializedName("ax")
    @Expose
    private net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.Exchange askExchange;
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
     * Ask size.
     * <p>
     * 
     * Corresponds to the "as" property.
     * 
     */
    @SerializedName("as")
    @Expose
    private Double askSize;
    /**
     * Bid Exchange.
     * <p>
     * 
     * Corresponds to the "bx" property.
     * 
     */
    @SerializedName("bx")
    @Expose
    private net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.Exchange bidExchange;
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
     * Bid size.
     * <p>
     * 
     * Corresponds to the "bs" property.
     * 
     */
    @SerializedName("bs")
    @Expose
    private Double bidSize;
    private final static long serialVersionUID = 8005782852344401811L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Xbbo() {
    }

    /**
     * 
     * @param source
     */
    public Xbbo(Xbbo source) {
        super();
        this.timestamp = source.timestamp;
        this.askExchange = source.askExchange;
        this.askPrice = source.askPrice;
        this.askSize = source.askSize;
        this.bidExchange = source.bidExchange;
        this.bidPrice = source.bidPrice;
        this.bidSize = source.bidSize;
    }

    /**
     * 
     * @param askPrice
     * @param bidSize
     * @param bidExchange
     * @param askSize
     * @param bidPrice
     * @param timestamp
     * @param askExchange
     */
    public Xbbo(ZonedDateTime timestamp, net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.Exchange askExchange, Double askPrice, Double askSize, net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.Exchange bidExchange, Double bidPrice, Double bidSize) {
        super();
        this.timestamp = timestamp;
        this.askExchange = askExchange;
        this.askPrice = askPrice;
        this.askSize = askSize;
        this.bidExchange = bidExchange;
        this.bidPrice = bidPrice;
        this.bidSize = bidSize;
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

    public Xbbo withTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Ask Exchange.
     * <p>
     * 
     * Corresponds to the "ax" property.
     * 
     */
    public net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.Exchange getAskExchange() {
        return askExchange;
    }

    /**
     * Ask Exchange.
     * <p>
     * 
     * Corresponds to the "ax" property.
     * 
     */
    public void setAskExchange(net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.Exchange askExchange) {
        this.askExchange = askExchange;
    }

    public Xbbo withAskExchange(net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.Exchange askExchange) {
        this.askExchange = askExchange;
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

    public Xbbo withAskPrice(Double askPrice) {
        this.askPrice = askPrice;
        return this;
    }

    /**
     * Ask size.
     * <p>
     * 
     * Corresponds to the "as" property.
     * 
     */
    public Double getAskSize() {
        return askSize;
    }

    /**
     * Ask size.
     * <p>
     * 
     * Corresponds to the "as" property.
     * 
     */
    public void setAskSize(Double askSize) {
        this.askSize = askSize;
    }

    public Xbbo withAskSize(Double askSize) {
        this.askSize = askSize;
        return this;
    }

    /**
     * Bid Exchange.
     * <p>
     * 
     * Corresponds to the "bx" property.
     * 
     */
    public net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.Exchange getBidExchange() {
        return bidExchange;
    }

    /**
     * Bid Exchange.
     * <p>
     * 
     * Corresponds to the "bx" property.
     * 
     */
    public void setBidExchange(net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.Exchange bidExchange) {
        this.bidExchange = bidExchange;
    }

    public Xbbo withBidExchange(net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.Exchange bidExchange) {
        this.bidExchange = bidExchange;
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

    public Xbbo withBidPrice(Double bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    /**
     * Bid size.
     * <p>
     * 
     * Corresponds to the "bs" property.
     * 
     */
    public Double getBidSize() {
        return bidSize;
    }

    /**
     * Bid size.
     * <p>
     * 
     * Corresponds to the "bs" property.
     * 
     */
    public void setBidSize(Double bidSize) {
        this.bidSize = bidSize;
    }

    public Xbbo withBidSize(Double bidSize) {
        this.bidSize = bidSize;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Xbbo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("askExchange");
        sb.append('=');
        sb.append(((this.askExchange == null)?"<null>":this.askExchange));
        sb.append(',');
        sb.append("askPrice");
        sb.append('=');
        sb.append(((this.askPrice == null)?"<null>":this.askPrice));
        sb.append(',');
        sb.append("askSize");
        sb.append('=');
        sb.append(((this.askSize == null)?"<null>":this.askSize));
        sb.append(',');
        sb.append("bidExchange");
        sb.append('=');
        sb.append(((this.bidExchange == null)?"<null>":this.bidExchange));
        sb.append(',');
        sb.append("bidPrice");
        sb.append('=');
        sb.append(((this.bidPrice == null)?"<null>":this.bidPrice));
        sb.append(',');
        sb.append("bidSize");
        sb.append('=');
        sb.append(((this.bidSize == null)?"<null>":this.bidSize));
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
        result = ((result* 31)+((this.bidSize == null)? 0 :this.bidSize.hashCode()));
        result = ((result* 31)+((this.bidExchange == null)? 0 :this.bidExchange.hashCode()));
        result = ((result* 31)+((this.askSize == null)? 0 :this.askSize.hashCode()));
        result = ((result* 31)+((this.bidPrice == null)? 0 :this.bidPrice.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.askExchange == null)? 0 :this.askExchange.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Xbbo) == false) {
            return false;
        }
        Xbbo rhs = ((Xbbo) other);
        return ((((((((this.askPrice == rhs.askPrice)||((this.askPrice!= null)&&this.askPrice.equals(rhs.askPrice)))&&((this.bidSize == rhs.bidSize)||((this.bidSize!= null)&&this.bidSize.equals(rhs.bidSize))))&&((this.bidExchange == rhs.bidExchange)||((this.bidExchange!= null)&&this.bidExchange.equals(rhs.bidExchange))))&&((this.askSize == rhs.askSize)||((this.askSize!= null)&&this.askSize.equals(rhs.askSize))))&&((this.bidPrice == rhs.bidPrice)||((this.bidPrice!= null)&&this.bidPrice.equals(rhs.bidPrice))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.askExchange == rhs.askExchange)||((this.askExchange!= null)&&this.askExchange.equals(rhs.askExchange))));
    }

}
