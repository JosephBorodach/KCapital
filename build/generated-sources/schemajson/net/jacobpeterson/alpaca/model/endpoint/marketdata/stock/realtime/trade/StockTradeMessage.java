
package net.jacobpeterson.alpaca.model.endpoint.marketdata.stock.realtime.trade;

import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.trade.TradeMessage;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/alpaca-data-api-v2/real-time/">Realtime Stock Market Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class StockTradeMessage
    extends TradeMessage
    implements Serializable
{

    /**
     * Exchange code where the trade occurred.
     * <p>
     * 
     * Corresponds to the "x" property.
     * 
     */
    @SerializedName("x")
    @Expose
    private java.lang.String exchange;
    /**
     * Trade size.
     * <p>
     * 
     * Corresponds to the "s" property.
     * 
     */
    @SerializedName("s")
    @Expose
    private Integer size;
    /**
     * The {@link java.util.ArrayList} of trade conditions.
     * <p>
     * 
     * Corresponds to the "c" property.
     * 
     */
    @SerializedName("c")
    @Expose
    private ArrayList<String> conditions;
    /**
     * Tape.
     * <p>
     * 
     * Corresponds to the "z" property.
     * 
     */
    @SerializedName("z")
    @Expose
    private java.lang.String tape;
    private final static long serialVersionUID = 2111432705800290639L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StockTradeMessage() {
    }

    /**
     * 
     * @param source
     */
    public StockTradeMessage(StockTradeMessage source) {
        super();
        this.exchange = source.exchange;
        this.size = source.size;
        this.conditions = source.conditions;
        this.tape = source.tape;
    }

    /**
     * 
     * @param size
     * @param tape
     * @param exchange
     * @param conditions
     */
    public StockTradeMessage(java.lang.String exchange, Integer size, ArrayList<String> conditions, java.lang.String tape) {
        super();
        this.exchange = exchange;
        this.size = size;
        this.conditions = conditions;
        this.tape = tape;
    }

    /**
     * Exchange code where the trade occurred.
     * <p>
     * 
     * Corresponds to the "x" property.
     * 
     */
    public java.lang.String getExchange() {
        return exchange;
    }

    /**
     * Exchange code where the trade occurred.
     * <p>
     * 
     * Corresponds to the "x" property.
     * 
     */
    public void setExchange(java.lang.String exchange) {
        this.exchange = exchange;
    }

    public StockTradeMessage withExchange(java.lang.String exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Trade size.
     * <p>
     * 
     * Corresponds to the "s" property.
     * 
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Trade size.
     * <p>
     * 
     * Corresponds to the "s" property.
     * 
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    public StockTradeMessage withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * The {@link java.util.ArrayList} of trade conditions.
     * <p>
     * 
     * Corresponds to the "c" property.
     * 
     */
    public ArrayList<String> getConditions() {
        return conditions;
    }

    /**
     * The {@link java.util.ArrayList} of trade conditions.
     * <p>
     * 
     * Corresponds to the "c" property.
     * 
     */
    public void setConditions(ArrayList<String> conditions) {
        this.conditions = conditions;
    }

    public StockTradeMessage withConditions(ArrayList<String> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Tape.
     * <p>
     * 
     * Corresponds to the "z" property.
     * 
     */
    public java.lang.String getTape() {
        return tape;
    }

    /**
     * Tape.
     * <p>
     * 
     * Corresponds to the "z" property.
     * 
     */
    public void setTape(java.lang.String tape) {
        this.tape = tape;
    }

    public StockTradeMessage withTape(java.lang.String tape) {
        this.tape = tape;
        return this;
    }

    @Override
    public java.lang.String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StockTradeMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("exchange");
        sb.append('=');
        sb.append(((this.exchange == null)?"<null>":this.exchange));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null)?"<null>":this.size));
        sb.append(',');
        sb.append("conditions");
        sb.append('=');
        sb.append(((this.conditions == null)?"<null>":this.conditions));
        sb.append(',');
        sb.append("tape");
        sb.append('=');
        sb.append(((this.tape == null)?"<null>":this.tape));
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
        result = ((result* 31)+((this.exchange == null)? 0 :this.exchange.hashCode()));
        result = ((result* 31)+((this.size == null)? 0 :this.size.hashCode()));
        result = ((result* 31)+((this.conditions == null)? 0 :this.conditions.hashCode()));
        result = ((result* 31)+((this.tape == null)? 0 :this.tape.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StockTradeMessage) == false) {
            return false;
        }
        StockTradeMessage rhs = ((StockTradeMessage) other);
        return ((((super.equals(rhs)&&((this.exchange == rhs.exchange)||((this.exchange!= null)&&this.exchange.equals(rhs.exchange))))&&((this.size == rhs.size)||((this.size!= null)&&this.size.equals(rhs.size))))&&((this.conditions == rhs.conditions)||((this.conditions!= null)&&this.conditions.equals(rhs.conditions))))&&((this.tape == rhs.tape)||((this.tape!= null)&&this.tape.equals(rhs.tape))));
    }

}
