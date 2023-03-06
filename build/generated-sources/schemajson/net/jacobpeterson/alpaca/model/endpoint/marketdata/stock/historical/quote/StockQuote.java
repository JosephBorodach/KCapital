
package net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.historical.quote;

import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.historical.quote.Quote;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-data-api-v2/historical/">Historical Stock Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class StockQuote
    extends Quote
    implements Serializable
{

    /**
     * Ask exchange.
     * <p>
     * 
     * Corresponds to the "ax" property.
     * 
     */
    @SerializedName("ax")
    @Expose
    private java.lang.String askExchange;
    /**
     * Ask size.
     * <p>
     * 
     * Corresponds to the "as" property.
     * 
     */
    @SerializedName("as")
    @Expose
    private Integer askSize;
    /**
     * Bid exchange.
     * <p>
     * 
     * Corresponds to the "bx" property.
     * 
     */
    @SerializedName("bx")
    @Expose
    private java.lang.String bidExchange;
    /**
     * Bid size.
     * <p>
     * 
     * Corresponds to the "bs" property.
     * 
     */
    @SerializedName("bs")
    @Expose
    private Integer bidSize;
    /**
     * The {@link java.util.ArrayList} of quote conditions.
     * <p>
     * 
     * Corresponds to the "c" property.
     * 
     */
    @SerializedName("c")
    @Expose
    private ArrayList<String> conditions;
    private final static long serialVersionUID = 1326525851539476818L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StockQuote() {
    }

    /**
     * 
     * @param source
     */
    public StockQuote(StockQuote source) {
        super();
        this.askExchange = source.askExchange;
        this.askSize = source.askSize;
        this.bidExchange = source.bidExchange;
        this.bidSize = source.bidSize;
        this.conditions = source.conditions;
    }

    /**
     * 
     * @param bidSize
     * @param bidExchange
     * @param conditions
     * @param askSize
     * @param askExchange
     */
    public StockQuote(java.lang.String askExchange, Integer askSize, java.lang.String bidExchange, Integer bidSize, ArrayList<String> conditions) {
        super();
        this.askExchange = askExchange;
        this.askSize = askSize;
        this.bidExchange = bidExchange;
        this.bidSize = bidSize;
        this.conditions = conditions;
    }

    /**
     * Ask exchange.
     * <p>
     * 
     * Corresponds to the "ax" property.
     * 
     */
    public java.lang.String getAskExchange() {
        return askExchange;
    }

    /**
     * Ask exchange.
     * <p>
     * 
     * Corresponds to the "ax" property.
     * 
     */
    public void setAskExchange(java.lang.String askExchange) {
        this.askExchange = askExchange;
    }

    public StockQuote withAskExchange(java.lang.String askExchange) {
        this.askExchange = askExchange;
        return this;
    }

    /**
     * Ask size.
     * <p>
     * 
     * Corresponds to the "as" property.
     * 
     */
    public Integer getAskSize() {
        return askSize;
    }

    /**
     * Ask size.
     * <p>
     * 
     * Corresponds to the "as" property.
     * 
     */
    public void setAskSize(Integer askSize) {
        this.askSize = askSize;
    }

    public StockQuote withAskSize(Integer askSize) {
        this.askSize = askSize;
        return this;
    }

    /**
     * Bid exchange.
     * <p>
     * 
     * Corresponds to the "bx" property.
     * 
     */
    public java.lang.String getBidExchange() {
        return bidExchange;
    }

    /**
     * Bid exchange.
     * <p>
     * 
     * Corresponds to the "bx" property.
     * 
     */
    public void setBidExchange(java.lang.String bidExchange) {
        this.bidExchange = bidExchange;
    }

    public StockQuote withBidExchange(java.lang.String bidExchange) {
        this.bidExchange = bidExchange;
        return this;
    }

    /**
     * Bid size.
     * <p>
     * 
     * Corresponds to the "bs" property.
     * 
     */
    public Integer getBidSize() {
        return bidSize;
    }

    /**
     * Bid size.
     * <p>
     * 
     * Corresponds to the "bs" property.
     * 
     */
    public void setBidSize(Integer bidSize) {
        this.bidSize = bidSize;
    }

    public StockQuote withBidSize(Integer bidSize) {
        this.bidSize = bidSize;
        return this;
    }

    /**
     * The {@link java.util.ArrayList} of quote conditions.
     * <p>
     * 
     * Corresponds to the "c" property.
     * 
     */
    public ArrayList<String> getConditions() {
        return conditions;
    }

    /**
     * The {@link java.util.ArrayList} of quote conditions.
     * <p>
     * 
     * Corresponds to the "c" property.
     * 
     */
    public void setConditions(ArrayList<String> conditions) {
        this.conditions = conditions;
    }

    public StockQuote withConditions(ArrayList<String> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public java.lang.String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StockQuote.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        java.lang.String superString = super.toString();
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
        sb.append("askExchange");
        sb.append('=');
        sb.append(((this.askExchange == null)?"<null>":this.askExchange));
        sb.append(',');
        sb.append("askSize");
        sb.append('=');
        sb.append(((this.askSize == null)?"<null>":this.askSize));
        sb.append(',');
        sb.append("bidExchange");
        sb.append('=');
        sb.append(((this.bidExchange == null)?"<null>":this.bidExchange));
        sb.append(',');
        sb.append("bidSize");
        sb.append('=');
        sb.append(((this.bidSize == null)?"<null>":this.bidSize));
        sb.append(',');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null)?"<null>":this.conditions));
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
        result = ((result* 31)+((this.bidExchange == null)? 0 :this.bidExchange.hashCode()));
        result = ((result* 31)+((this.conditions == null)? 0 :this.conditions.hashCode()));
        result = ((result* 31)+((this.askSize == null)? 0 :this.askSize.hashCode()));
        result = ((result* 31)+((this.bidSize == null)? 0 :this.bidSize.hashCode()));
        result = ((result* 31)+((this.askExchange == null)? 0 :this.askExchange.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StockQuote) == false) {
            return false;
        }
        StockQuote rhs = ((StockQuote) other);
        return (((((super.equals(rhs)&&((this.bidExchange == rhs.bidExchange)||((this.bidExchange!= null)&&this.bidExchange.equals(rhs.bidExchange))))&&((this.conditions == rhs.conditions)||((this.conditions!= null)&&this.conditions.equals(rhs.conditions))))&&((this.askSize == rhs.askSize)||((this.askSize!= null)&&this.askSize.equals(rhs.askSize))))&&((this.bidSize == rhs.bidSize)||((this.bidSize!= null)&&this.bidSize.equals(rhs.bidSize))))&&((this.askExchange == rhs.askExchange)||((this.askExchange!= null)&&this.askExchange.equals(rhs.askExchange))));
    }

}
