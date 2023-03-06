
package net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.realtime.trade;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.trade.TradeMessage;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.Exchange;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.TakerSide;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-crypto-data/real-time/">Realtime Crypto Market Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class CryptoTradeMessage
    extends TradeMessage
    implements Serializable
{

    /**
     * Exchange where the trade happened.
     * <p>
     * 
     * Corresponds to the "x" property.
     * 
     */
    @SerializedName("x")
    @Expose
    private Exchange exchange;
    /**
     * Trade size.
     * <p>
     * 
     * Corresponds to the "s" property.
     * 
     */
    @SerializedName("s")
    @Expose
    private Double size;
    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.TakerSide} of the trade.
     * <p>
     * 
     * Corresponds to the "tks" property.
     * 
     */
    @SerializedName("tks")
    @Expose
    private TakerSide takerSide;
    private final static long serialVersionUID = -5809245606164255076L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CryptoTradeMessage() {
    }

    /**
     * 
     * @param source
     */
    public CryptoTradeMessage(CryptoTradeMessage source) {
        super();
        this.exchange = source.exchange;
        this.size = source.size;
        this.takerSide = source.takerSide;
    }

    /**
     * 
     * @param size
     * @param takerSide
     * @param exchange
     */
    public CryptoTradeMessage(Exchange exchange, Double size, TakerSide takerSide) {
        super();
        this.exchange = exchange;
        this.size = size;
        this.takerSide = takerSide;
    }

    /**
     * Exchange where the trade happened.
     * <p>
     * 
     * Corresponds to the "x" property.
     * 
     */
    public Exchange getExchange() {
        return exchange;
    }

    /**
     * Exchange where the trade happened.
     * <p>
     * 
     * Corresponds to the "x" property.
     * 
     */
    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    public CryptoTradeMessage withExchange(Exchange exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Trade size.
     * <p>
     * 
     * Corresponds to the "s" property.
     * 
     */
    public Double getSize() {
        return size;
    }

    /**
     * Trade size.
     * <p>
     * 
     * Corresponds to the "s" property.
     * 
     */
    public void setSize(Double size) {
        this.size = size;
    }

    public CryptoTradeMessage withSize(Double size) {
        this.size = size;
        return this;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.TakerSide} of the trade.
     * <p>
     * 
     * Corresponds to the "tks" property.
     * 
     */
    public TakerSide getTakerSide() {
        return takerSide;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.TakerSide} of the trade.
     * <p>
     * 
     * Corresponds to the "tks" property.
     * 
     */
    public void setTakerSide(TakerSide takerSide) {
        this.takerSide = takerSide;
    }

    public CryptoTradeMessage withTakerSide(TakerSide takerSide) {
        this.takerSide = takerSide;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CryptoTradeMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("takerSide");
        sb.append('=');
        sb.append(((this.takerSide == null)?"<null>":this.takerSide));
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
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this.takerSide == null)? 0 :this.takerSide.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CryptoTradeMessage) == false) {
            return false;
        }
        CryptoTradeMessage rhs = ((CryptoTradeMessage) other);
        return (((super.equals(rhs)&&((this.exchange == rhs.exchange)||((this.exchange!= null)&&this.exchange.equals(rhs.exchange))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this.takerSide == rhs.takerSide)||((this.takerSide!= null)&&this.takerSide.equals(rhs.takerSide))));
    }

}
