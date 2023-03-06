
package net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.realtime.quote;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.quote.QuoteMessage;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.Exchange;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-crypto-data/real-time/">Realtime Crypto Market Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class CryptoQuoteMessage
    extends QuoteMessage
    implements Serializable
{

    /**
     * Exchange.
     * <p>
     * 
     * Corresponds to the "x" property.
     * 
     */
    @SerializedName("x")
    @Expose
    private Exchange exchange;
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
     * Bid size.
     * <p>
     * 
     * Corresponds to the "bs" property.
     * 
     */
    @SerializedName("bs")
    @Expose
    private Double bidSize;
    private final static long serialVersionUID = -5480013702396468577L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CryptoQuoteMessage() {
    }

    /**
     * 
     * @param source
     */
    public CryptoQuoteMessage(CryptoQuoteMessage source) {
        super();
        this.exchange = source.exchange;
        this.askSize = source.askSize;
        this.bidSize = source.bidSize;
    }

    /**
     * 
     * @param bidSize
     * @param exchange
     * @param askSize
     */
    public CryptoQuoteMessage(Exchange exchange, Double askSize, Double bidSize) {
        super();
        this.exchange = exchange;
        this.askSize = askSize;
        this.bidSize = bidSize;
    }

    /**
     * Exchange.
     * <p>
     * 
     * Corresponds to the "x" property.
     * 
     */
    public Exchange getExchange() {
        return exchange;
    }

    /**
     * Exchange.
     * <p>
     * 
     * Corresponds to the "x" property.
     * 
     */
    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    public CryptoQuoteMessage withExchange(Exchange exchange) {
        this.exchange = exchange;
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

    public CryptoQuoteMessage withAskSize(Double askSize) {
        this.askSize = askSize;
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

    public CryptoQuoteMessage withBidSize(Double bidSize) {
        this.bidSize = bidSize;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CryptoQuoteMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("exchange");
        sb.append('=');
        sb.append(((this.exchange == null)?"<null>":this.exchange));
        sb.append(',');
        sb.append("askSize");
        sb.append('=');
        sb.append(((this.askSize == null)?"<null>":this.askSize));
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
        result = ((result* 31)+((this.exchange == null)? 0 :this.exchange.hashCode()));
        result = ((result* 31)+((this.askSize == null)? 0 :this.askSize.hashCode()));
        result = ((result* 31)+((this.bidSize == null)? 0 :this.bidSize.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CryptoQuoteMessage) == false) {
            return false;
        }
        CryptoQuoteMessage rhs = ((CryptoQuoteMessage) other);
        return (((super.equals(rhs)&&((this.exchange == rhs.exchange)||((this.exchange!= null)&&this.exchange.equals(rhs.exchange))))&&((this.askSize == rhs.askSize)||((this.askSize!= null)&&this.askSize.equals(rhs.askSize))))&&((this.bidSize == rhs.bidSize)||((this.bidSize!= null)&&this.bidSize.equals(rhs.bidSize))));
    }

}
