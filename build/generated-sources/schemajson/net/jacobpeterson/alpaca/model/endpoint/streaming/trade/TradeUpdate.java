
package net.jacobpeterson.alpaca.model.endpoint.streaming.trade;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.orders.Order;
import net.jacobpeterson.alpaca.model.endpoint.streaming.trade.enums.TradeUpdateEvent;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/streaming/">Streaming</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class TradeUpdate implements Serializable
{

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.streaming.trade.enums.TradeUpdateEvent}.
     * <p>
     * 
     * 
     */
    @SerializedName("event")
    @Expose
    private TradeUpdateEvent event;
    /**
     * The price.
     * <p>
     * 
     * 
     */
    @SerializedName("price")
    @Expose
    private String price;
    /**
     * The timestamp.
     * <p>
     * 
     * 
     */
    @SerializedName("timestamp")
    @Expose
    private ZonedDateTime timestamp;
    /**
     * The position quantity.
     * <p>
     * 
     * Corresponds to the "position_qty" property.
     * 
     */
    @SerializedName("position_qty")
    @Expose
    private String positionQuantity;
    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.Order}.
     * <p>
     * 
     * 
     */
    @SerializedName("order")
    @Expose
    private Order order;
    private final static long serialVersionUID = -3601482162927018058L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TradeUpdate() {
    }

    /**
     * 
     * @param source
     */
    public TradeUpdate(TradeUpdate source) {
        super();
        this.event = source.event;
        this.price = source.price;
        this.timestamp = source.timestamp;
        this.positionQuantity = source.positionQuantity;
        this.order = source.order;
    }

    /**
     * 
     * @param price
     * @param positionQuantity
     * @param event
     * @param timestamp
     * @param order
     */
    public TradeUpdate(TradeUpdateEvent event, String price, ZonedDateTime timestamp, String positionQuantity, Order order) {
        super();
        this.event = event;
        this.price = price;
        this.timestamp = timestamp;
        this.positionQuantity = positionQuantity;
        this.order = order;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.streaming.trade.enums.TradeUpdateEvent}.
     * <p>
     * 
     * 
     */
    public TradeUpdateEvent getEvent() {
        return event;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.streaming.trade.enums.TradeUpdateEvent}.
     * <p>
     * 
     * 
     */
    public void setEvent(TradeUpdateEvent event) {
        this.event = event;
    }

    public TradeUpdate withEvent(TradeUpdateEvent event) {
        this.event = event;
        return this;
    }

    /**
     * The price.
     * <p>
     * 
     * 
     */
    public String getPrice() {
        return price;
    }

    /**
     * The price.
     * <p>
     * 
     * 
     */
    public void setPrice(String price) {
        this.price = price;
    }

    public TradeUpdate withPrice(String price) {
        this.price = price;
        return this;
    }

    /**
     * The timestamp.
     * <p>
     * 
     * 
     */
    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * The timestamp.
     * <p>
     * 
     * 
     */
    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public TradeUpdate withTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * The position quantity.
     * <p>
     * 
     * Corresponds to the "position_qty" property.
     * 
     */
    public String getPositionQuantity() {
        return positionQuantity;
    }

    /**
     * The position quantity.
     * <p>
     * 
     * Corresponds to the "position_qty" property.
     * 
     */
    public void setPositionQuantity(String positionQuantity) {
        this.positionQuantity = positionQuantity;
    }

    public TradeUpdate withPositionQuantity(String positionQuantity) {
        this.positionQuantity = positionQuantity;
        return this;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.Order}.
     * <p>
     * 
     * 
     */
    public Order getOrder() {
        return order;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.Order}.
     * <p>
     * 
     * 
     */
    public void setOrder(Order order) {
        this.order = order;
    }

    public TradeUpdate withOrder(Order order) {
        this.order = order;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TradeUpdate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("event");
        sb.append('=');
        sb.append(((this.event == null)?"<null>":this.event));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("positionQuantity");
        sb.append('=');
        sb.append(((this.positionQuantity == null)?"<null>":this.positionQuantity));
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
        result = ((result* 31)+((this.event == null)? 0 :this.event.hashCode()));
        result = ((result* 31)+((this.price == null)? 0 :this.price.hashCode()));
        result = ((result* 31)+((this.positionQuantity == null)? 0 :this.positionQuantity.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        result = ((result* 31)+((this.order == null)? 0 :this.order.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradeUpdate) == false) {
            return false;
        }
        TradeUpdate rhs = ((TradeUpdate) other);
        return ((((((this.event == rhs.event)||((this.event!= null)&&this.event.equals(rhs.event)))&&((this.price == rhs.price)||((this.price!= null)&&this.price.equals(rhs.price))))&&((this.positionQuantity == rhs.positionQuantity)||((this.positionQuantity!= null)&&this.positionQuantity.equals(rhs.positionQuantity))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))))&&((this.order == rhs.order)||((this.order!= null)&&this.order.equals(rhs.order))));
    }

}
