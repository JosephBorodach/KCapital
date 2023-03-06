
package net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.quote;

import java.io.Serializable;
import java.util.ArrayList;
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
public class CryptoQuotesResponse implements Serializable
{

    /**
     * The {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.quote.CryptoQuote}s.
     * <p>
     * 
     * 
     */
    @SerializedName("quotes")
    @Expose
    private ArrayList<CryptoQuote> quotes;
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
     * Token that can be used to query the next page.
     * <p>
     * 
     * 
     */
    @SerializedName("next_page_token")
    @Expose
    private String nextPageToken;
    private final static long serialVersionUID = -4629190072754487150L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CryptoQuotesResponse() {
    }

    /**
     * 
     * @param source
     */
    public CryptoQuotesResponse(CryptoQuotesResponse source) {
        super();
        this.quotes = source.quotes;
        this.symbol = source.symbol;
        this.nextPageToken = source.nextPageToken;
    }

    /**
     * 
     * @param symbol
     * @param nextPageToken
     * @param quotes
     */
    public CryptoQuotesResponse(ArrayList<CryptoQuote> quotes, String symbol, String nextPageToken) {
        super();
        this.quotes = quotes;
        this.symbol = symbol;
        this.nextPageToken = nextPageToken;
    }

    /**
     * The {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.quote.CryptoQuote}s.
     * <p>
     * 
     * 
     */
    public ArrayList<CryptoQuote> getQuotes() {
        return quotes;
    }

    /**
     * The {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.quote.CryptoQuote}s.
     * <p>
     * 
     * 
     */
    public void setQuotes(ArrayList<CryptoQuote> quotes) {
        this.quotes = quotes;
    }

    public CryptoQuotesResponse withQuotes(ArrayList<CryptoQuote> quotes) {
        this.quotes = quotes;
        return this;
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

    public CryptoQuotesResponse withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Token that can be used to query the next page.
     * <p>
     * 
     * 
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * Token that can be used to query the next page.
     * <p>
     * 
     * 
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public CryptoQuotesResponse withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CryptoQuotesResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("quotes");
        sb.append('=');
        sb.append(((this.quotes == null)?"<null>":this.quotes));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("nextPageToken");
        sb.append('=');
        sb.append(((this.nextPageToken == null)?"<null>":this.nextPageToken));
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
        result = ((result* 31)+((this.nextPageToken == null)? 0 :this.nextPageToken.hashCode()));
        result = ((result* 31)+((this.quotes == null)? 0 :this.quotes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CryptoQuotesResponse) == false) {
            return false;
        }
        CryptoQuotesResponse rhs = ((CryptoQuotesResponse) other);
        return ((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.nextPageToken == rhs.nextPageToken)||((this.nextPageToken!= null)&&this.nextPageToken.equals(rhs.nextPageToken))))&&((this.quotes == rhs.quotes)||((this.quotes!= null)&&this.quotes.equals(rhs.quotes))));
    }

}
