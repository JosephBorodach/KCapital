
package net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.bar;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.historical.bar.Bar;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.common.enums.Exchange;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-crypto-data/historical/">Historical Crypto Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class CryptoBar
    extends Bar
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
     * Volume.
     * <p>
     * 
     * Corresponds to the "v" property.
     * 
     */
    @SerializedName("v")
    @Expose
    private Double volume;
    private final static long serialVersionUID = 5168032267655250329L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CryptoBar() {
    }

    /**
     * 
     * @param source
     */
    public CryptoBar(CryptoBar source) {
        super();
        this.exchange = source.exchange;
        this.volume = source.volume;
    }

    /**
     * 
     * @param volume
     * @param exchange
     */
    public CryptoBar(Exchange exchange, Double volume) {
        super();
        this.exchange = exchange;
        this.volume = volume;
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

    public CryptoBar withExchange(Exchange exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Volume.
     * <p>
     * 
     * Corresponds to the "v" property.
     * 
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * Volume.
     * <p>
     * 
     * Corresponds to the "v" property.
     * 
     */
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public CryptoBar withVolume(Double volume) {
        this.volume = volume;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CryptoBar.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
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
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.exchange == null)? 0 :this.exchange.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CryptoBar) == false) {
            return false;
        }
        CryptoBar rhs = ((CryptoBar) other);
        return ((super.equals(rhs)&&((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume))))&&((this.exchange == rhs.exchange)||((this.exchange!= null)&&this.exchange.equals(rhs.exchange))));
    }

}
