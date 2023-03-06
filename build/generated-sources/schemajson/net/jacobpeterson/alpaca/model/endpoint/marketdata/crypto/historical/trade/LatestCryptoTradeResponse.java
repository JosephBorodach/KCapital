
package net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.trade;

import java.io.Serializable;
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
public class LatestCryptoTradeResponse implements Serializable
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
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.trade.CryptoTrade}.
     * <p>
     * 
     * 
     */
    @SerializedName("trade")
    @Expose
    private CryptoTrade trade;
    private final static long serialVersionUID = 61788624233028468L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LatestCryptoTradeResponse() {
    }

    /**
     * 
     * @param source
     */
    public LatestCryptoTradeResponse(LatestCryptoTradeResponse source) {
        super();
        this.symbol = source.symbol;
        this.trade = source.trade;
    }

    /**
     * 
     * @param symbol
     * @param trade
     */
    public LatestCryptoTradeResponse(String symbol, CryptoTrade trade) {
        super();
        this.symbol = symbol;
        this.trade = trade;
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

    public LatestCryptoTradeResponse withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.trade.CryptoTrade}.
     * <p>
     * 
     * 
     */
    public CryptoTrade getTrade() {
        return trade;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.trade.CryptoTrade}.
     * <p>
     * 
     * 
     */
    public void setTrade(CryptoTrade trade) {
        this.trade = trade;
    }

    public LatestCryptoTradeResponse withTrade(CryptoTrade trade) {
        this.trade = trade;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LatestCryptoTradeResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("trade");
        sb.append('=');
        sb.append(((this.trade == null)?"<null>":this.trade));
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
        result = ((result* 31)+((this.trade == null)? 0 :this.trade.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LatestCryptoTradeResponse) == false) {
            return false;
        }
        LatestCryptoTradeResponse rhs = ((LatestCryptoTradeResponse) other);
        return (((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.trade == rhs.trade)||((this.trade!= null)&&this.trade.equals(rhs.trade))));
    }

}
