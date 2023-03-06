
package net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.xbbo;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-crypto-data/historical/">Historical Crypto Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class XbboResponse implements Serializable
{

    /**
     * Symbol that was queried.
     * <p>
     * 
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.xbbo.Xbbo}.
     * <p>
     * 
     * 
     */
    @SerializedName("xbbo")
    @Expose
    private Xbbo xbbo;
    private final static long serialVersionUID = -6183906071384168587L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public XbboResponse() {
    }

    /**
     * 
     * @param source
     */
    public XbboResponse(XbboResponse source) {
        super();
        this.symbol = source.symbol;
        this.xbbo = source.xbbo;
    }

    /**
     * 
     * @param symbol
     * @param xbbo
     */
    public XbboResponse(String symbol, Xbbo xbbo) {
        super();
        this.symbol = symbol;
        this.xbbo = xbbo;
    }

    /**
     * Symbol that was queried.
     * <p>
     * 
     * 
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Symbol that was queried.
     * <p>
     * 
     * 
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public XbboResponse withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.xbbo.Xbbo}.
     * <p>
     * 
     * 
     */
    public Xbbo getXbbo() {
        return xbbo;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.xbbo.Xbbo}.
     * <p>
     * 
     * 
     */
    public void setXbbo(Xbbo xbbo) {
        this.xbbo = xbbo;
    }

    public XbboResponse withXbbo(Xbbo xbbo) {
        this.xbbo = xbbo;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(XbboResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("xbbo");
        sb.append('=');
        sb.append(((this.xbbo == null)?"<null>":this.xbbo));
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
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.xbbo == null)? 0 :this.xbbo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof XbboResponse) == false) {
            return false;
        }
        XbboResponse rhs = ((XbboResponse) other);
        return (((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.xbbo == rhs.xbbo)||((this.xbbo!= null)&&this.xbbo.equals(rhs.xbbo))));
    }

}
