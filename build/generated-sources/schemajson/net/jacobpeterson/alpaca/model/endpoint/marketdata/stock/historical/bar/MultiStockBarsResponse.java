
package net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-data-api-v2/historical/">Historical Stock Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class MultiStockBarsResponse implements Serializable
{

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar}s of {@link java.lang.String} symbols {@link java.util.HashMap}.
     * <p>
     * 
     * 
     */
    @SerializedName("bars")
    @Expose
    private HashMap<String, ArrayList<StockBar>> bars;
    /**
     * Token that can be used to query the next page.
     * <p>
     * 
     * 
     */
    @SerializedName("next_page_token")
    @Expose
    private String nextPageToken;
    private final static long serialVersionUID = 2531593498111669984L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MultiStockBarsResponse() {
    }

    /**
     * 
     * @param source
     */
    public MultiStockBarsResponse(MultiStockBarsResponse source) {
        super();
        this.bars = source.bars;
        this.nextPageToken = source.nextPageToken;
    }

    /**
     * 
     * @param nextPageToken
     * @param bars
     */
    public MultiStockBarsResponse(HashMap<String, ArrayList<StockBar>> bars, String nextPageToken) {
        super();
        this.bars = bars;
        this.nextPageToken = nextPageToken;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar}s of {@link java.lang.String} symbols {@link java.util.HashMap}.
     * <p>
     * 
     * 
     */
    public HashMap<String, ArrayList<StockBar>> getBars() {
        return bars;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar}s of {@link java.lang.String} symbols {@link java.util.HashMap}.
     * <p>
     * 
     * 
     */
    public void setBars(HashMap<String, ArrayList<StockBar>> bars) {
        this.bars = bars;
    }

    public MultiStockBarsResponse withBars(HashMap<String, ArrayList<StockBar>> bars) {
        this.bars = bars;
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

    public MultiStockBarsResponse withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MultiStockBarsResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bars");
        sb.append('=');
        sb.append(((this.bars == null)?"<null>":this.bars));
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
        result = ((result* 31)+((this.bars == null)? 0 :this.bars.hashCode()));
        result = ((result* 31)+((this.nextPageToken == null)? 0 :this.nextPageToken.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MultiStockBarsResponse) == false) {
            return false;
        }
        MultiStockBarsResponse rhs = ((MultiStockBarsResponse) other);
        return (((this.bars == rhs.bars)||((this.bars!= null)&&this.bars.equals(rhs.bars)))&&((this.nextPageToken == rhs.nextPageToken)||((this.nextPageToken!= null)&&this.nextPageToken.equals(rhs.nextPageToken))));
    }

}
