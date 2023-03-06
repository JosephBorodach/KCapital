
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
public enum OrderType {


    /**
     * A market order is a request to buy or sell a security at the currently available market price. It provides the most likely method of filling an order. Market orders fill nearly instantaneously.
     * 
     */
    @SerializedName("market")
    MARKET("market"),

    /**
     * A limit order is an order to buy or sell at a specified price or better. A buy limit order (a limit order to buy) is executed at the specified limit price or lower (i.e., better). Conversely, a sell limit order (a limit order to sell) is executed at the specified limit price or higher (better). Unlike a market order, you have to specify the limit price parameter when submitting your order.
     * 
     */
    @SerializedName("limit")
    LIMIT("limit"),

    /**
     * A stop (market) order is an order to buy or sell a security when its price moves past a particular point, ensuring a higher probability of achieving a predetermined entry or exit price. Once the market price crosses the specified stop price, the stop order becomes a market order. Alpaca converts buy stop orders into stop limit orders with a limit price that is 4% higher than a stop price &lt; $50 (or 2.5% higher than a stop price &gt;= $50). Sell stop orders are not converted into stop limit orders.
     * 
     */
    @SerializedName("stop")
    STOP("stop"),

    /**
     * A stop-limit order is a conditional trade over a set time frame that combines the features of a stop order with those of a limit order and is used to mitigate risk. The stop-limit order will be executed at a specified limit price, or better, after a given stop price has been reached. Once the stop price is reached, the stop-limit order becomes a limit order to buy or sell at the limit price or better
     * 
     */
    @SerializedName("stop_limit")
    STOP_LIMIT("stop_limit"),

    /**
     * Trailing stop orders allow you to continuously and automatically keep updating the stop price threshold based on the stock price movement. You request a single order with a dollar offset value or percentage value as the trail and the actual stop price for this order changes as the stock price moves in your favorable way, or stay at the last level otherwise. This way, you don’t need to monitor the price movement and keep sending replace requests to update the stop price close to the latest market movement.
     * 
     */
    @SerializedName("trailing_stop")
    TRAILING_STOP("trailing_stop");
    private final String value;
    private final static Map<String, OrderType> CONSTANTS = new HashMap<String, OrderType>();

    static {
        for (OrderType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    OrderType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    public static OrderType fromValue(String value) {
        OrderType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
