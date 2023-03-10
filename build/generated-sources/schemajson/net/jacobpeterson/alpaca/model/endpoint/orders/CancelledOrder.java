
package net.jacobpeterson.alpaca.model.endpoint.orders;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/orders/">Orders</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class CancelledOrder implements Serializable
{

    /**
     * Order ID.
     * <p>
     * 
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    /**
     * The HTTP status code of the cancelled order.
     * <p>
     * 
     * 
     */
    @SerializedName("status")
    @Expose
    private Integer status;
    /**
     * The cancelled {@link net.jacobpeterson.alpaca.model.endpoint.orders.Order}.
     * <p>
     * 
     * Corresponds to the "body" property.
     * 
     */
    @SerializedName("body")
    @Expose
    private Order order;
    private final static long serialVersionUID = 2560446247507309702L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CancelledOrder() {
    }

    /**
     * 
     * @param source
     */
    public CancelledOrder(CancelledOrder source) {
        super();
        this.id = source.id;
        this.status = source.status;
        this.order = source.order;
    }

    /**
     * 
     * @param id
     * @param status
     * @param order
     */
    public CancelledOrder(String id, Integer status, Order order) {
        super();
        this.id = id;
        this.status = status;
        this.order = order;
    }

    /**
     * Order ID.
     * <p>
     * 
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * Order ID.
     * <p>
     * 
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    public CancelledOrder withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The HTTP status code of the cancelled order.
     * <p>
     * 
     * 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * The HTTP status code of the cancelled order.
     * <p>
     * 
     * 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    public CancelledOrder withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * The cancelled {@link net.jacobpeterson.alpaca.model.endpoint.orders.Order}.
     * <p>
     * 
     * Corresponds to the "body" property.
     * 
     */
    public Order getOrder() {
        return order;
    }

    /**
     * The cancelled {@link net.jacobpeterson.alpaca.model.endpoint.orders.Order}.
     * <p>
     * 
     * Corresponds to the "body" property.
     * 
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    public CancelledOrder withOrder(Order order) {
        this.order = order;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CancelledOrder.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.order == null)? 0 :this.order.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CancelledOrder) == false) {
            return false;
        }
        CancelledOrder rhs = ((CancelledOrder) other);
        return ((((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id)))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.order == rhs.order)||((this.order!= null)&&this.order.equals(rhs.order))));
    }

}
