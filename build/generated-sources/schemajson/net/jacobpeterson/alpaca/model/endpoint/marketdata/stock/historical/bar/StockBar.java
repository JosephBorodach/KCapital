
package net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.historical.bar.Bar;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-data-api-v2/historical/">Historical Stock Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class StockBar
    extends Bar
    implements Serializable
{

    /**
     * Volume.
     * <p>
     * 
     * Corresponds to the "v" property.
     * 
     */
    @SerializedName("v")
    @Expose
    private Long volume;
    private final static long serialVersionUID = -431442397727173250L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StockBar() {
    }

    /**
     * 
     * @param source
     */
    public StockBar(StockBar source) {
        super();
        this.volume = source.volume;
    }

    /**
     * 
     * @param volume
     */
    public StockBar(Long volume) {
        super();
        this.volume = volume;
    }

    /**
     * Volume.
     * <p>
     * 
     * Corresponds to the "v" property.
     * 
     */
    public Long getVolume() {
        return volume;
    }

    /**
     * Volume.
     * <p>
     * 
     * Corresponds to the "v" property.
     * 
     */
    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public StockBar withVolume(Long volume) {
        this.volume = volume;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StockBar.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StockBar) == false) {
            return false;
        }
        StockBar rhs = ((StockBar) other);
        return (super.equals(rhs)&&((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume))));
    }

}
