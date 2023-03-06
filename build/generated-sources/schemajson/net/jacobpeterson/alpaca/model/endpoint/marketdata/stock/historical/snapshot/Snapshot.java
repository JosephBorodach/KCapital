
package net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.snapshot;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.quote.StockQuote;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.trade.StockTrade;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-data-api-v2/historical/">Historical Stock Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Snapshot implements Serializable
{

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.trade.StockTrade}.
     * <p>
     * 
     * 
     */
    @SerializedName("latestTrade")
    @Expose
    private StockTrade latestTrade;
    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.quote.StockQuote}.
     * <p>
     * 
     * 
     */
    @SerializedName("latestQuote")
    @Expose
    private StockQuote latestQuote;
    /**
     * The minute {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar}.
     * <p>
     * 
     * 
     */
    @SerializedName("minuteBar")
    @Expose
    private net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar minuteBar;
    /**
     * The daily {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar}.
     * <p>
     * 
     * 
     */
    @SerializedName("dailyBar")
    @Expose
    private net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar dailyBar;
    /**
     * The previous daily {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar}.
     * <p>
     * 
     * 
     */
    @SerializedName("prevDailyBar")
    @Expose
    private net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar prevDailyBar;
    private final static long serialVersionUID = 8707038401858541845L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Snapshot() {
    }

    /**
     * 
     * @param source
     */
    public Snapshot(Snapshot source) {
        super();
        this.latestTrade = source.latestTrade;
        this.latestQuote = source.latestQuote;
        this.minuteBar = source.minuteBar;
        this.dailyBar = source.dailyBar;
        this.prevDailyBar = source.prevDailyBar;
    }

    /**
     * 
     * @param latestTrade
     * @param dailyBar
     * @param latestQuote
     * @param prevDailyBar
     * @param minuteBar
     */
    public Snapshot(StockTrade latestTrade, StockQuote latestQuote, net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar minuteBar, net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar dailyBar, net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar prevDailyBar) {
        super();
        this.latestTrade = latestTrade;
        this.latestQuote = latestQuote;
        this.minuteBar = minuteBar;
        this.dailyBar = dailyBar;
        this.prevDailyBar = prevDailyBar;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.trade.StockTrade}.
     * <p>
     * 
     * 
     */
    public StockTrade getLatestTrade() {
        return latestTrade;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.trade.StockTrade}.
     * <p>
     * 
     * 
     */
    public void setLatestTrade(StockTrade latestTrade) {
        this.latestTrade = latestTrade;
    }

    public Snapshot withLatestTrade(StockTrade latestTrade) {
        this.latestTrade = latestTrade;
        return this;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.quote.StockQuote}.
     * <p>
     * 
     * 
     */
    public StockQuote getLatestQuote() {
        return latestQuote;
    }

    /**
     * The latest {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.quote.StockQuote}.
     * <p>
     * 
     * 
     */
    public void setLatestQuote(StockQuote latestQuote) {
        this.latestQuote = latestQuote;
    }

    public Snapshot withLatestQuote(StockQuote latestQuote) {
        this.latestQuote = latestQuote;
        return this;
    }

    /**
     * The minute {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar}.
     * <p>
     * 
     * 
     */
    public net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar getMinuteBar() {
        return minuteBar;
    }

    /**
     * The minute {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar}.
     * <p>
     * 
     * 
     */
    public void setMinuteBar(net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar minuteBar) {
        this.minuteBar = minuteBar;
    }

    public Snapshot withMinuteBar(net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar minuteBar) {
        this.minuteBar = minuteBar;
        return this;
    }

    /**
     * The daily {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar}.
     * <p>
     * 
     * 
     */
    public net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar getDailyBar() {
        return dailyBar;
    }

    /**
     * The daily {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar}.
     * <p>
     * 
     * 
     */
    public void setDailyBar(net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar dailyBar) {
        this.dailyBar = dailyBar;
    }

    public Snapshot withDailyBar(net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar dailyBar) {
        this.dailyBar = dailyBar;
        return this;
    }

    /**
     * The previous daily {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar}.
     * <p>
     * 
     * 
     */
    public net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar getPrevDailyBar() {
        return prevDailyBar;
    }

    /**
     * The previous daily {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar}.
     * <p>
     * 
     * 
     */
    public void setPrevDailyBar(net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar prevDailyBar) {
        this.prevDailyBar = prevDailyBar;
    }

    public Snapshot withPrevDailyBar(net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.bar.StockBar prevDailyBar) {
        this.prevDailyBar = prevDailyBar;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Snapshot.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("latestTrade");
        sb.append('=');
        sb.append(((this.latestTrade == null)?"<null>":this.latestTrade));
        sb.append(',');
        sb.append("latestQuote");
        sb.append('=');
        sb.append(((this.latestQuote == null)?"<null>":this.latestQuote));
        sb.append(',');
        sb.append("minuteBar");
        sb.append('=');
        sb.append(((this.minuteBar == null)?"<null>":this.minuteBar));
        sb.append(',');
        sb.append("dailyBar");
        sb.append('=');
        sb.append(((this.dailyBar == null)?"<null>":this.dailyBar));
        sb.append(',');
        sb.append("prevDailyBar");
        sb.append('=');
        sb.append(((this.prevDailyBar == null)?"<null>":this.prevDailyBar));
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
        result = ((result* 31)+((this.latestTrade == null)? 0 :this.latestTrade.hashCode()));
        result = ((result* 31)+((this.dailyBar == null)? 0 :this.dailyBar.hashCode()));
        result = ((result* 31)+((this.prevDailyBar == null)? 0 :this.prevDailyBar.hashCode()));
        result = ((result* 31)+((this.minuteBar == null)? 0 :this.minuteBar.hashCode()));
        result = ((result* 31)+((this.latestQuote == null)? 0 :this.latestQuote.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Snapshot) == false) {
            return false;
        }
        Snapshot rhs = ((Snapshot) other);
        return ((((((this.latestTrade == rhs.latestTrade)||((this.latestTrade!= null)&&this.latestTrade.equals(rhs.latestTrade)))&&((this.dailyBar == rhs.dailyBar)||((this.dailyBar!= null)&&this.dailyBar.equals(rhs.dailyBar))))&&((this.prevDailyBar == rhs.prevDailyBar)||((this.prevDailyBar!= null)&&this.prevDailyBar.equals(rhs.prevDailyBar))))&&((this.minuteBar == rhs.minuteBar)||((this.minuteBar!= null)&&this.minuteBar.equals(rhs.minuteBar))))&&((this.latestQuote == rhs.latestQuote)||((this.latestQuote!= null)&&this.latestQuote.equals(rhs.latestQuote))));
    }

}
