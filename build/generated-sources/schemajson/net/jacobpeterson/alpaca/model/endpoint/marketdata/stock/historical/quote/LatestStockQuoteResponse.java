
package net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.quote;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-data-api-v2/historical/">Historical Stock Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class LatestStockQuoteResponse implements Serializable
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
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.quote.StockQuote}.
     * <p>
     * 
     * 
     */
    @SerializedName("quote")
    @Expose
    private StockQuote quote;
    private final static long serialVersionUID = 684799153540243918L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LatestStockQuoteResponse() {
    }

    /**
     * 
     * @param source
     */
    public LatestStockQuoteResponse(LatestStockQuoteResponse source) {
        super();
        this.symbol = source.symbol;
        this.quote = source.quote;
    }

    /**
     * 
     * @param symbol
     * @param quote
     */
    public LatestStockQuoteResponse(String symbol, StockQuote quote) {
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

    public LatestStockQuoteResponse withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.quote.StockQuote}.
     * <p>
     * 
     * 
     */
    public StockQuote getQuote() {
        return quote;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.quote.StockQuote}.
     * <p>
     * 
     * 
     */
    public void setQuote(StockQuote quote) {
        this.quote = quote;
    }

    public LatestStockQuoteResponse withQuote(StockQuote quote) {
        this.quote = quote;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LatestStockQuoteResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof LatestStockQuoteResponse) == false) {
            return false;
        }
        LatestStockQuoteResponse rhs = ((LatestStockQuoteResponse) other);
        return (((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.quote == rhs.quote)||((this.quote!= null)&&this.quote.equals(rhs.quote))));
    }

}
