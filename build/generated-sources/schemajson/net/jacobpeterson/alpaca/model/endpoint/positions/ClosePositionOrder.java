
package net.jacobpeterson.alpaca.model.endpoint.positions;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.orders.Order;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/positions/">https://alpaca.markets/docs/api-documentation/api-v2/positions/</a>
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class ClosePositionOrder implements Serializable
{

    /**
     * The symbol.
     * <p>
     * 
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    /**
     * The HTTP status code of the position-closing order.
     * <p>
     * 
     * 
     */
    @SerializedName("status")
    @Expose
    private Integer status;
    /**
     * The position-closing {@link net.jacobpeterson.alpaca.model.endpoint.orders.Order}.
     * <p>
     * 
     * Corresponds to the "body" property.
     * 
     */
    @SerializedName("body")
    @Expose
    private Order order;
    private final static long serialVersionUID = 416776880851751316L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClosePositionOrder() {
    }

    /**
     * 
     * @param source
     */
    public ClosePositionOrder(ClosePositionOrder source) {
        super();
        this.symbol = source.symbol;
        this.status = source.status;
        this.order = source.order;
    }

    /**
     * 
     * @param symbol
     * @param status
     * @param order
     */
    public ClosePositionOrder(String symbol, Integer status, Order order) {
        super();
        this.symbol = symbol;
        this.status = status;
        this.order = order;
    }

    /**
     * The symbol.
     * <p>
     * 
     * 
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * The symbol.
     * <p>
     * 
     * 
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public ClosePositionOrder withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * The HTTP status code of the position-closing order.
     * <p>
     * 
     * 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * The HTTP status code of the position-closing order.
     * <p>
     * 
     * 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public ClosePositionOrder withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * The position-closing {@link net.jacobpeterson.alpaca.model.endpoint.orders.Order}.
     * <p>
     * 
     * Corresponds to the "body" property.
     * 
     */
    public Order getOrder() {
        return order;
    }

    /**
     * The position-closing {@link net.jacobpeterson.alpaca.model.endpoint.orders.Order}.
     * <p>
     * 
     * Corresponds to the "body" property.
     * 
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    public ClosePositionOrder withOrder(Order order) {
        this.order = order;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ClosePositionOrder.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("order");
        sb.append('=');
        sb.append(((this.order == null)?"<null>":this.order));
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
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.order == null)? 0 :this.order.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClosePositionOrder) == false) {
            return false;
        }
        ClosePositionOrder rhs = ((ClosePositionOrder) other);
        return ((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.order == rhs.order)||((this.order!= null)&&this.order.equals(rhs.order))));
    }

}
