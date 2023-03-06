
package net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.trade;

import java.io.Serializable;
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
public class LatestStockTradeResponse implements Serializable
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
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.trade.StockTrade}.
     * <p>
     * 
     * 
     */
    @SerializedName("trade")
    @Expose
    private StockTrade trade;
    private final static long serialVersionUID = -7965132860634101577L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LatestStockTradeResponse() {
    }

    /**
     * 
     * @param source
     */
    public LatestStockTradeResponse(LatestStockTradeResponse source) {
        super();
        this.symbol = source.symbol;
        this.trade = source.trade;
    }

    /**
     * 
     * @param symbol
     * @param trade
     */
    public LatestStockTradeResponse(String symbol, StockTrade trade) {
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

    public LatestStockTradeResponse withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.trade.StockTrade}.
     * <p>
     * 
     * 
     */
    public StockTrade getTrade() {
        return trade;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.trade.StockTrade}.
     * <p>
     * 
     * 
     */
    public void setTrade(StockTrade trade) {
        this.trade = trade;
    }

    public LatestStockTradeResponse withTrade(StockTrade trade) {
        this.trade = trade;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LatestStockTradeResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof LatestStockTradeResponse) == false) {
            return false;
        }
        LatestStockTradeResponse rhs = ((LatestStockTradeResponse) other);
        return (((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.trade == rhs.trade)||((this.trade!= null)&&this.trade.equals(rhs.trade))));
    }

}
