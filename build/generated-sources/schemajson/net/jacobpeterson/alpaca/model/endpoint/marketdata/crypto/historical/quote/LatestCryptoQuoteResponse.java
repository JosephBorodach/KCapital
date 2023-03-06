
package net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.quote;

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
public class LatestCryptoQuoteResponse implements Serializable
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
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.quote.CryptoQuote}.
     * <p>
     * 
     * 
     */
    @SerializedName("quote")
    @Expose
    private CryptoQuote quote;
    private final static long serialVersionUID = 2186699270044518427L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LatestCryptoQuoteResponse() {
    }

    /**
     * 
     * @param source
     */
    public LatestCryptoQuoteResponse(LatestCryptoQuoteResponse source) {
        super();
        this.symbol = source.symbol;
        this.quote = source.quote;
    }

    /**
     * 
     * @param symbol
     * @param quote
     */
    public LatestCryptoQuoteResponse(String symbol, CryptoQuote quote) {
        super();
        this.symbol = symbol;
        this.quote = quote;
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

    public LatestCryptoQuoteResponse withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.quote.CryptoQuote}.
     * <p>
     * 
     * 
     */
    public CryptoQuote getQuote() {
        return quote;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.quote.CryptoQuote}.
     * <p>
     * 
     * 
     */
    public void setQuote(CryptoQuote quote) {
        this.quote = quote;
    }

    public LatestCryptoQuoteResponse withQuote(CryptoQuote quote) {
        this.quote = quote;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LatestCryptoQuoteResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("quote");
        sb.append('=');
        sb.append(((this.quote == null)?"<null>":this.quote));
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
        result = ((result* 31)+((this.quote == null)? 0 :this.quote.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LatestCryptoQuoteResponse) == false) {
            return false;
        }
        LatestCryptoQuoteResponse rhs = ((LatestCryptoQuoteResponse) other);
        return (((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.quote == rhs.quote)||((this.quote!= null)&&this.quote.equals(rhs.quote))));
    }

}
