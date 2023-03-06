
package net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.bar;

import java.io.Serializable;
import java.util.ArrayList;
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
public class CryptoBarsResponse implements Serializable
{

    /**
     * The {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.bar.CryptoBar}s.
     * <p>
     * 
     * 
     */
    @SerializedName("bars")
    @Expose
    private ArrayList<CryptoBar> bars;
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
    private final static long serialVersionUID = 7883783301817936861L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CryptoBarsResponse() {
    }

    /**
     * 
     * @param source
     */
    public CryptoBarsResponse(CryptoBarsResponse source) {
        super();
        this.bars = source.bars;
        this.symbol = source.symbol;
        this.nextPageToken = source.nextPageToken;
    }

    /**
     * 
     * @param symbol
     * @param nextPageToken
     * @param bars
     */
    public CryptoBarsResponse(ArrayList<CryptoBar> bars, String symbol, String nextPageToken) {
        super();
        this.bars = bars;
        this.symbol = symbol;
        this.nextPageToken = nextPageToken;
    }

    /**
     * The {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.bar.CryptoBar}s.
     * <p>
     * 
     * 
     */
    public ArrayList<CryptoBar> getBars() {
        return bars;
    }

    /**
     * The {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.crypto.historical.bar.CryptoBar}s.
     * <p>
     * 
     * 
     */
    public void setBars(ArrayList<CryptoBar> bars) {
        this.bars = bars;
    }

    public CryptoBarsResponse withBars(ArrayList<CryptoBar> bars) {
        this.bars = bars;
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

    public CryptoBarsResponse withSymbol(String symbol) {
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

    public CryptoBarsResponse withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CryptoBarsResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bars");
        sb.append('=');
        sb.append(((this.bars == null)?"<null>":this.bars));
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
        result = ((result* 31)+((this.bars == null)? 0 :this.bars.hashCode()));
        result = ((result* 31)+((this.nextPageToken == null)? 0 :this.nextPageToken.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CryptoBarsResponse) == false) {
            return false;
        }
        CryptoBarsResponse rhs = ((CryptoBarsResponse) other);
        return ((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.bars == rhs.bars)||((this.bars!= null)&&this.bars.equals(rhs.bars))))&&((this.nextPageToken == rhs.nextPageToken)||((this.nextPageToken!= null)&&this.nextPageToken.equals(rhs.nextPageToken))));
    }

}
