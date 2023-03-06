
package net.jacobpeterson.alpaca.model.endpoint.orders.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/orders/">Orders</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum OrderStatus {


    /**
     * The order has been received by Alpaca, and routed to exchanges for execution. This is the usual initial state of an order.
     * 
     */
    @SerializedName("new")
    NEW("new"),

    /**
     * The order has been partially filled.
     * 
     */
    @SerializedName("partially_filled")
    PARTIALLY_FILLED("partially_filled"),

    /**
     * The order has been filled, and no further updates will occur for the order.
     * 
     */
    @SerializedName("filled")
    FILLED("filled"),

    /**
     * The order is done executing for the day, and will not receive further updates until the next trading day.
     * 
     */
    @SerializedName("done_for_day")
    DONE_FOR_DAY("done_for_day"),

    /**
     * The order has been canceled, and no further updates will occur for the order. This can be either due to a cancel request by the user, or the order has been canceled by the exchanges due to its time-in-force.
     * 
     */
    @SerializedName("canceled")
    CANCELED("canceled"),

    /**
     * The order has expired, and no further updates will occur for the order.
     * 
     */
    @SerializedName("expired")
    EXPIRED("expired"),

    /**
     * The order was replaced by another order, or was updated due to a market event such as corporate action.
     * 
     */
    @SerializedName("replaced")
    REPLACED("replaced"),

    /**
     * The order is waiting to be canceled.
     * 
     */
    @SerializedName("pending_cancel")
    PENDING_CANCEL("pending_cancel"),

    /**
     * The order is waiting to be replaced by another order. The order will reject cancel request while in this state.
     * 
     */
    @SerializedName("pending_replace")
    PENDING_REPLACE("pending_replace"),

    /**
     * The order has been received by Alpaca, but hasn’t yet been routed to the execution venue. This could be seen often out side of trading session hours.
     * 
     */
    @SerializedName("accepted")
    ACCEPTED("accepted"),

    /**
     * The order has been received by Alpaca, and routed to the exchanges, but has not yet been accepted for execution. This state only occurs on rare occasions.
     * 
     */
    @SerializedName("pending_new")
    PENDING_NEW("pending_new"),

    /**
     * The order has been received by exchanges, and is evaluated for pricing. This state only occurs on rare occasions.
     * 
     */
    @SerializedName("accepted_for_bidding")
    ACCEPTED_FOR_BIDDING("accepted_for_bidding"),

    /**
     * The order has been stopped, and a trade is guaranteed for the order, usually at a stated price or better, but has not yet occurred. This state only occurs on rare occasions.
     * 
     */
    @SerializedName("stopped")
    STOPPED("stopped"),

    /**
     * The order has been rejected, and no further updates will occur for the order. This state occurs on rare occasions and may occur based on various conditions decided by the exchanges.
     * 
     */
    @SerializedName("rejected")
    REJECTED("rejected"),

    /**
     * The order has been suspended, and is not eligible for trading. This state only occurs on rare occasions.
     * 
     */
    @SerializedName("suspended")
    SUSPENDED("suspended"),

    /**
     * The order has been completed for the day (either filled or done for day), but remaining settlement calculations are still pending. This state only occurs on rare occasions.
     * 
     */
    @SerializedName("calculated")
    CALCULATED("calculated"),

    /**
     * The order is part of a bracket leg that is waiting for the initial order to be filled.
     * 
     */
    @SerializedName("held")
    HELD("held");
    private final String value;
    private final static Map<String, OrderStatus> CONSTANTS = new HashMap<String, OrderStatus>();

    static {
        for (OrderStatus c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    OrderStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static OrderStatus fromValue(String value) {
        OrderStatus constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
