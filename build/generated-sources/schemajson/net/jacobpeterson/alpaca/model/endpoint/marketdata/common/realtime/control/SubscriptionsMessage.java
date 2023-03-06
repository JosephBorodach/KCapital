
package net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.control;

import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.MarketDataMessage;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/">Market Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class SubscriptionsMessage
    extends MarketDataMessage
    implements Serializable
{

    /**
     * The {@link java.util.ArrayList} of subscribed trades.
     * <p>
     * 
     * 
     */
    @SerializedName("trades")
    @Expose
    private ArrayList<String> trades;
    /**
     * The {@link java.util.ArrayList} of subscribed quotes.
     * <p>
     * 
     * 
     */
    @SerializedName("quotes")
    @Expose
    private ArrayList<String> quotes;
    /**
     * The {@link java.util.ArrayList} of subscribed bars.
     * <p>
     * 
     * 
     */
    @SerializedName("bars")
    @Expose
    private ArrayList<String> bars;
    private final static long serialVersionUID = 7716370069198281273L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SubscriptionsMessage() {
    }

    /**
     * 
     * @param source
     */
    public SubscriptionsMessage(SubscriptionsMessage source) {
        super();
        this.trades = source.trades;
        this.quotes = source.quotes;
        this.bars = source.bars;
    }

    /**
     * 
     * @param trades
     * @param bars
     * @param quotes
     */
    public SubscriptionsMessage(ArrayList<String> trades, ArrayList<String> quotes, ArrayList<String> bars) {
        super();
        this.trades = trades;
        this.quotes = quotes;
        this.bars = bars;
    }

    /**
     * The {@link java.util.ArrayList} of subscribed trades.
     * <p>
     * 
     * 
     */
    public ArrayList<String> getTrades() {
        return trades;
    }

    /**
     * The {@link java.util.ArrayList} of subscribed trades.
     * <p>
     * 
     * 
     */
    public void setTrades(ArrayList<String> trades) {
        this.trades = trades;
    }

    public SubscriptionsMessage withTrades(ArrayList<String> trades) {
        this.trades = trades;
        return this;
    }

    /**
     * The {@link java.util.ArrayList} of subscribed quotes.
     * <p>
     * 
     * 
     */
    public ArrayList<String> getQuotes() {
        return quotes;
    }

    /**
     * The {@link java.util.ArrayList} of subscribed quotes.
     * <p>
     * 
     * 
     */
    public void setQuotes(ArrayList<String> quotes) {
        this.quotes = quotes;
    }

    public SubscriptionsMessage withQuotes(ArrayList<String> quotes) {
        this.quotes = quotes;
        return this;
    }

    /**
     * The {@link java.util.ArrayList} of subscribed bars.
     * <p>
     * 
     * 
     */
    public ArrayList<String> getBars() {
        return bars;
    }

    /**
     * The {@link java.util.ArrayList} of subscribed bars.
     * <p>
     * 
     * 
     */
    public void setBars(ArrayList<String> bars) {
        this.bars = bars;
    }

    public SubscriptionsMessage withBars(ArrayList<String> bars) {
        this.bars = bars;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SubscriptionsMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("trades");
        sb.append('=');
        sb.append(((this.trades == null)?"<null>":this.trades));
        sb.append(',');
        sb.append("quotes");
        sb.append('=');
        sb.append(((this.quotes == null)?"<null>":this.quotes));
        sb.append(',');
        sb.append("bars");
        sb.append('=');
        sb.append(((this.bars == null)?"<null>":this.bars));
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
        result = ((result* 31)+((this.trades == null)? 0 :this.trades.hashCode()));
        result = ((result* 31)+((this.bars == null)? 0 :this.bars.hashCode()));
        result = ((result* 31)+((this.quotes == null)? 0 :this.quotes.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubscriptionsMessage) == false) {
            return false;
        }
        SubscriptionsMessage rhs = ((SubscriptionsMessage) other);
        return (((super.equals(rhs)&&((this.trades == rhs.trades)||((this.trades!= null)&&this.trades.equals(rhs.trades))))&&((this.bars == rhs.bars)||((this.bars!= null)&&this.bars.equals(rhs.bars))))&&((this.quotes == rhs.quotes)||((this.quotes!= null)&&this.quotes.equals(rhs.quotes))));
    }

}
