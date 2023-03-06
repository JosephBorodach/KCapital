
package net.jacobpeterson.alpaca.model.endpoint.streaming.trade.enums;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/orders/">Orders</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum TradeUpdateEvent {


    /**
     * Sent when an order has been routed to exchanges for execution.
     * 
     */
    @SerializedName("new")
    NEW("new"),

    /**
     * Sent when your order has been completely filled.
     * 
     */
    @SerializedName("fill")
    FILL("fill"),

    /**
     * Sent when a number of shares less than the total remaining quantity on your order has been filled.
     * 
     */
    @SerializedName("partial_fill")
    PARTIAL_FILL("partial_fill"),

    /**
     * Sent when your requested cancelation of an order is processed.
     * 
     */
    @SerializedName("canceled")
    CANCELED("canceled"),

    /**
     * Sent when an order has reached the end of its lifespan, as determined by the order’s time in force value.
     * 
     */
    @SerializedName("expired")
    EXPIRED("expired"),

    /**
     * Sent when the order is done executing for the day, and will not receive further updates until the next trading day.
     * 
     */
    @SerializedName("done_for_day")
    DONE_FOR_DAY("done_for_day"),

    /**
     * Sent when your requested replacement of an order is processed.
     * 
     */
    @SerializedName("replaced")
    REPLACED("replaced"),

    /**
     * Sent when your order has been rejected.
     * 
     */
    @SerializedName("rejected")
    REJECTED("rejected"),

    /**
     * Sent when the order has been received by Alpaca and routed to the exchanges, but has not yet been accepted for execution.
     * 
     */
    @SerializedName("pending_new")
    PENDING_NEW("pending_new"),

    /**
     * Sent when your order has been stopped, and a trade is guaranteed for the order, usually at a stated price or better, but has not yet occurred.
     * 
     */
    @SerializedName("stopped")
    STOPPED("stopped"),

    /**
     * Sent when the order is awaiting cancelation. Most cancelations will occur without the order entering this state.
     * 
     */
    @SerializedName("pending_cancel")
    PENDING_CANCEL("pending_cancel"),

    /**
     * Sent when the order is awaiting replacement.
     * 
     */
    @SerializedName("pending_replace")
    PENDING_REPLACE("pending_replace"),

    /**
     * Sent when the order has been completed for the day - it is either "filled" or Z"done_for_day" - but remaining settlement calculations are still pending.
     * 
     */
    @SerializedName("calculated")
    CALCULATED("calculated"),

    /**
     * Sent when the order has been suspended and is not eligible for trading.
     * 
     */
    @SerializedName("suspended")
    SUSPENDED("suspended"),

    /**
     * Sent when the order replace has been rejected.
     * 
     */
    @SerializedName("order_replace_rejected")
    ORDER_REPLACE_REJECTED("order_replace_rejected"),

    /**
     * Sent when the order cancel has been rejected.
     * 
     */
    @SerializedName("order_cancel_rejected")
    ORDER_CANCEL_REJECTED("order_cancel_rejected");
    private final String value;
    private final static Map<String, TradeUpdateEvent> CONSTANTS = new HashMap<String, TradeUpdateEvent>();

    static {
        for (TradeUpdateEvent c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    TradeUpdateEvent(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static TradeUpdateEvent fromValue(String value) {
        TradeUpdateEvent constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
