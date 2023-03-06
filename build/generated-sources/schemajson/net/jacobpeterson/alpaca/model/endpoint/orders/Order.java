
package net.jacobpeterson.alpaca.model.endpoint.orders;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderClass;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderSide;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderStatus;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderTimeInForce;
import net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderType;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/orders/">Orders</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Order implements Serializable
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
     * Client unique order ID.
     * <p>
     * 
     * 
     */
    @SerializedName("client_order_id")
    @Expose
    private String clientOrderId;
    /**
     * Created at.
     * <p>
     * 
     * 
     */
    @SerializedName("created_at")
    @Expose
    private ZonedDateTime createdAt;
    /**
     * Updated at.
     * <p>
     * 
     * 
     */
    @SerializedName("updated_at")
    @Expose
    private ZonedDateTime updatedAt;
    /**
     * Submitted at.
     * <p>
     * 
     * 
     */
    @SerializedName("submitted_at")
    @Expose
    private ZonedDateTime submittedAt;
    /**
     * Filled at.
     * <p>
     * 
     * 
     */
    @SerializedName("filled_at")
    @Expose
    private ZonedDateTime filledAt;
    /**
     * Expired at.
     * <p>
     * 
     * 
     */
    @SerializedName("expired_at")
    @Expose
    private ZonedDateTime expiredAt;
    /**
     * Canceled at.
     * <p>
     * 
     * 
     */
    @SerializedName("canceled_at")
    @Expose
    private ZonedDateTime canceledAt;
    /**
     * Failed at.
     * <p>
     * 
     * 
     */
    @SerializedName("failed_at")
    @Expose
    private ZonedDateTime failedAt;
    /**
     * Replaced at.
     * <p>
     * 
     * 
     */
    @SerializedName("replaced_at")
    @Expose
    private ZonedDateTime replacedAt;
    /**
     * The order ID that this order was replaced by.
     * <p>
     * 
     * 
     */
    @SerializedName("replaced_by")
    @Expose
    private String replacedBy;
    /**
     * The order ID that this order replaces.
     * <p>
     * 
     * 
     */
    @SerializedName("replaces")
    @Expose
    private String replaces;
    /**
     * Asset ID.
     * <p>
     * 
     * 
     */
    @SerializedName("asset_id")
    @Expose
    private String assetId;
    /**
     * Asset symbol.
     * <p>
     * 
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    /**
     * Asset class.
     * <p>
     * 
     * 
     */
    @SerializedName("asset_class")
    @Expose
    private String assetClass;
    /**
     * Ordered notional amount. If entered, qty will be null. Can take up to 9 decimal points.
     * <p>
     * 
     * 
     */
    @SerializedName("notional")
    @Expose
    private String notional;
    /**
     * Ordered quantity. If entered, notional will be null. Can take up to 9 decimal points.
     * <p>
     * 
     * Corresponds to the "qty" property.
     * 
     */
    @SerializedName("qty")
    @Expose
    private String quantity;
    /**
     * Filled quantity.
     * <p>
     * 
     * Corresponds to the "filled_qty" property.
     * 
     */
    @SerializedName("filled_qty")
    @Expose
    private String filledQuantity;
    /**
     * Filled average price.
     * <p>
     * 
     * Corresponds to the "filled_avg_price" property.
     * 
     */
    @SerializedName("filled_avg_price")
    @Expose
    private String averageFillPrice;
    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderClass}. For details of non-simple order classes, please see Bracket Order Overview.
     * <p>
     * 
     * 
     */
    @SerializedName("order_class")
    @Expose
    private OrderClass orderClass;
    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderType}.
     * <p>
     * 
     * 
     */
    @SerializedName("type")
    @Expose
    private OrderType type;
    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderSide}.
     * <p>
     * 
     * 
     */
    @SerializedName("side")
    @Expose
    private OrderSide side;
    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderTimeInForce}.
     * <p>
     * 
     * 
     */
    @SerializedName("time_in_force")
    @Expose
    private OrderTimeInForce timeInForce;
    /**
     * Limit price.
     * <p>
     * 
     * 
     */
    @SerializedName("limit_price")
    @Expose
    private String limitPrice;
    /**
     * Stop price.
     * <p>
     * 
     * 
     */
    @SerializedName("stop_price")
    @Expose
    private String stopPrice;
    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderStatus}.
     * <p>
     * 
     * 
     */
    @SerializedName("status")
    @Expose
    private OrderStatus status;
    /**
     * If true, eligible for execution outside regular trading hours.
     * <p>
     * 
     * 
     */
    @SerializedName("extended_hours")
    @Expose
    private Boolean extendedHours;
    /**
     * When querying non-simple order_class orders in a nested style, an {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.orders.Order} entities associated with this order. Otherwise, null.
     * <p>
     * 
     * 
     */
    @SerializedName("legs")
    @Expose
    private ArrayList<net.jacobpeterson.alpaca.model.endpoint.orders.Order> legs;
    /**
     * The percent value away from the high water mark for trailing stop orders.
     * <p>
     * 
     * 
     */
    @SerializedName("trail_percent")
    @Expose
    private String trailPercent;
    /**
     * The dollar value away from the high water mark for trailing stop orders.
     * <p>
     * 
     * 
     */
    @SerializedName("trail_price")
    @Expose
    private String trailPrice;
    /**
     * High Water Mark - The highest (lowest) market price seen since the trailing stop order was submitted.
     * <p>
     * 
     * Corresponds to the "hwm" property.
     * 
     */
    @SerializedName("hwm")
    @Expose
    private String highWaterMark;
    private final static long serialVersionUID = -8004572385762560659L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Order() {
    }

    /**
     * 
     * @param source
     */
    public Order(Order source) {
        super();
        this.id = source.id;
        this.clientOrderId = source.clientOrderId;
        this.createdAt = source.createdAt;
        this.updatedAt = source.updatedAt;
        this.submittedAt = source.submittedAt;
        this.filledAt = source.filledAt;
        this.expiredAt = source.expiredAt;
        this.canceledAt = source.canceledAt;
        this.failedAt = source.failedAt;
        this.replacedAt = source.replacedAt;
        this.replacedBy = source.replacedBy;
        this.replaces = source.replaces;
        this.assetId = source.assetId;
        this.symbol = source.symbol;
        this.assetClass = source.assetClass;
        this.notional = source.notional;
        this.quantity = source.quantity;
        this.filledQuantity = source.filledQuantity;
        this.averageFillPrice = source.averageFillPrice;
        this.orderClass = source.orderClass;
        this.type = source.type;
        this.side = source.side;
        this.timeInForce = source.timeInForce;
        this.limitPrice = source.limitPrice;
        this.stopPrice = source.stopPrice;
        this.status = source.status;
        this.extendedHours = source.extendedHours;
        this.legs = source.legs;
        this.trailPercent = source.trailPercent;
        this.trailPrice = source.trailPrice;
        this.highWaterMark = source.highWaterMark;
    }

    /**
     * 
     * @param averageFillPrice
     * @param symbol
     * @param replacedAt
     * @param notional
     * @param extendedHours
     * @param trailPrice
     * @param assetClass
     * @param type
     * @param filledQuantity
     * @param orderClass
     * @param createdAt
     * @param expiredAt
     * @param failedAt
     * @param assetId
     * @param legs
     * @param id
     * @param submittedAt
     * @param timeInForce
     * @param highWaterMark
     * @param updatedAt
     * @param side
     * @param quantity
     * @param limitPrice
     * @param trailPercent
     * @param replacedBy
     * @param replaces
     * @param clientOrderId
     * @param filledAt
     * @param stopPrice
     * @param canceledAt
     * @param status
     */
    public Order(String id, String clientOrderId, ZonedDateTime createdAt, ZonedDateTime updatedAt, ZonedDateTime submittedAt, ZonedDateTime filledAt, ZonedDateTime expiredAt, ZonedDateTime canceledAt, ZonedDateTime failedAt, ZonedDateTime replacedAt, String replacedBy, String replaces, String assetId, String symbol, String assetClass, String notional, String quantity, String filledQuantity, String averageFillPrice, OrderClass orderClass, OrderType type, OrderSide side, OrderTimeInForce timeInForce, String limitPrice, String stopPrice, OrderStatus status, Boolean extendedHours, ArrayList<net.jacobpeterson.alpaca.model.endpoint.orders.Order> legs, String trailPercent, String trailPrice, String highWaterMark) {
        super();
        this.id = id;
        this.clientOrderId = clientOrderId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.submittedAt = submittedAt;
        this.filledAt = filledAt;
        this.expiredAt = expiredAt;
        this.canceledAt = canceledAt;
        this.failedAt = failedAt;
        this.replacedAt = replacedAt;
        this.replacedBy = replacedBy;
        this.replaces = replaces;
        this.assetId = assetId;
        this.symbol = symbol;
        this.assetClass = assetClass;
        this.notional = notional;
        this.quantity = quantity;
        this.filledQuantity = filledQuantity;
        this.averageFillPrice = averageFillPrice;
        this.orderClass = orderClass;
        this.type = type;
        this.side = side;
        this.timeInForce = timeInForce;
        this.limitPrice = limitPrice;
        this.stopPrice = stopPrice;
        this.status = status;
        this.extendedHours = extendedHours;
        this.legs = legs;
        this.trailPercent = trailPercent;
        this.trailPrice = trailPrice;
        this.highWaterMark = highWaterMark;
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

    public Order withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Client unique order ID.
     * <p>
     * 
     * 
     */
    public String getClientOrderId() {
        return clientOrderId;
    }

    /**
     * Client unique order ID.
     * <p>
     * 
     * 
     */
    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public Order withClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
        return this;
    }

    /**
     * Created at.
     * <p>
     * 
     * 
     */
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Created at.
     * <p>
     * 
     * 
     */
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Order withCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Updated at.
     * <p>
     * 
     * 
     */
    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Updated at.
     * <p>
     * 
     * 
     */
    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Order withUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Submitted at.
     * <p>
     * 
     * 
     */
    public ZonedDateTime getSubmittedAt() {
        return submittedAt;
    }

    /**
     * Submitted at.
     * <p>
     * 
     * 
     */
    public void setSubmittedAt(ZonedDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }

    public Order withSubmittedAt(ZonedDateTime submittedAt) {
        this.submittedAt = submittedAt;
        return this;
    }

    /**
     * Filled at.
     * <p>
     * 
     * 
     */
    public ZonedDateTime getFilledAt() {
        return filledAt;
    }

    /**
     * Filled at.
     * <p>
     * 
     * 
     */
    public void setFilledAt(ZonedDateTime filledAt) {
        this.filledAt = filledAt;
    }

    public Order withFilledAt(ZonedDateTime filledAt) {
        this.filledAt = filledAt;
        return this;
    }

    /**
     * Expired at.
     * <p>
     * 
     * 
     */
    public ZonedDateTime getExpiredAt() {
        return expiredAt;
    }

    /**
     * Expired at.
     * <p>
     * 
     * 
     */
    public void setExpiredAt(ZonedDateTime expiredAt) {
        this.expiredAt = expiredAt;
    }

    public Order withExpiredAt(ZonedDateTime expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    /**
     * Canceled at.
     * <p>
     * 
     * 
     */
    public ZonedDateTime getCanceledAt() {
        return canceledAt;
    }

    /**
     * Canceled at.
     * <p>
     * 
     * 
     */
    public void setCanceledAt(ZonedDateTime canceledAt) {
        this.canceledAt = canceledAt;
    }

    public Order withCanceledAt(ZonedDateTime canceledAt) {
        this.canceledAt = canceledAt;
        return this;
    }

    /**
     * Failed at.
     * <p>
     * 
     * 
     */
    public ZonedDateTime getFailedAt() {
        return failedAt;
    }

    /**
     * Failed at.
     * <p>
     * 
     * 
     */
    public void setFailedAt(ZonedDateTime failedAt) {
        this.failedAt = failedAt;
    }

    public Order withFailedAt(ZonedDateTime failedAt) {
        this.failedAt = failedAt;
        return this;
    }

    /**
     * Replaced at.
     * <p>
     * 
     * 
     */
    public ZonedDateTime getReplacedAt() {
        return replacedAt;
    }

    /**
     * Replaced at.
     * <p>
     * 
     * 
     */
    public void setReplacedAt(ZonedDateTime replacedAt) {
        this.replacedAt = replacedAt;
    }

    public Order withReplacedAt(ZonedDateTime replacedAt) {
        this.replacedAt = replacedAt;
        return this;
    }

    /**
     * The order ID that this order was replaced by.
     * <p>
     * 
     * 
     */
    public String getReplacedBy() {
        return replacedBy;
    }

    /**
     * The order ID that this order was replaced by.
     * <p>
     * 
     * 
     */
    public void setReplacedBy(String replacedBy) {
        this.replacedBy = replacedBy;
    }

    public Order withReplacedBy(String replacedBy) {
        this.replacedBy = replacedBy;
        return this;
    }

    /**
     * The order ID that this order replaces.
     * <p>
     * 
     * 
     */
    public String getReplaces() {
        return replaces;
    }

    /**
     * The order ID that this order replaces.
     * <p>
     * 
     * 
     */
    public void setReplaces(String replaces) {
        this.replaces = replaces;
    }

    public Order withReplaces(String replaces) {
        this.replaces = replaces;
        return this;
    }

    /**
     * Asset ID.
     * <p>
     * 
     * 
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * Asset ID.
     * <p>
     * 
     * 
     */
    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public Order withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * Asset symbol.
     * <p>
     * 
     * 
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Asset symbol.
     * <p>
     * 
     * 
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Order withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Asset class.
     * <p>
     * 
     * 
     */
    public String getAssetClass() {
        return assetClass;
    }

    /**
     * Asset class.
     * <p>
     * 
     * 
     */
    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    public Order withAssetClass(String assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    /**
     * Ordered notional amount. If entered, qty will be null. Can take up to 9 decimal points.
     * <p>
     * 
     * 
     */
    public String getNotional() {
        return notional;
    }

    /**
     * Ordered notional amount. If entered, qty will be null. Can take up to 9 decimal points.
     * <p>
     * 
     * 
     */
    public void setNotional(String notional) {
        this.notional = notional;
    }

    public Order withNotional(String notional) {
        this.notional = notional;
        return this;
    }

    /**
     * Ordered quantity. If entered, notional will be null. Can take up to 9 decimal points.
     * <p>
     * 
     * Corresponds to the "qty" property.
     * 
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Ordered quantity. If entered, notional will be null. Can take up to 9 decimal points.
     * <p>
     * 
     * Corresponds to the "qty" property.
     * 
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Order withQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Filled quantity.
     * <p>
     * 
     * Corresponds to the "filled_qty" property.
     * 
     */
    public String getFilledQuantity() {
        return filledQuantity;
    }

    /**
     * Filled quantity.
     * <p>
     * 
     * Corresponds to the "filled_qty" property.
     * 
     */
    public void setFilledQuantity(String filledQuantity) {
        this.filledQuantity = filledQuantity;
    }

    public Order withFilledQuantity(String filledQuantity) {
        this.filledQuantity = filledQuantity;
        return this;
    }

    /**
     * Filled average price.
     * <p>
     * 
     * Corresponds to the "filled_avg_price" property.
     * 
     */
    public String getAverageFillPrice() {
        return averageFillPrice;
    }

    /**
     * Filled average price.
     * <p>
     * 
     * Corresponds to the "filled_avg_price" property.
     * 
     */
    public void setAverageFillPrice(String averageFillPrice) {
        this.averageFillPrice = averageFillPrice;
    }

    public Order withAverageFillPrice(String averageFillPrice) {
        this.averageFillPrice = averageFillPrice;
        return this;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderClass}. For details of non-simple order classes, please see Bracket Order Overview.
     * <p>
     * 
     * 
     */
    public OrderClass getOrderClass() {
        return orderClass;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderClass}. For details of non-simple order classes, please see Bracket Order Overview.
     * <p>
     * 
     * 
     */
    public void setOrderClass(OrderClass orderClass) {
        this.orderClass = orderClass;
    }

    public Order withOrderClass(OrderClass orderClass) {
        this.orderClass = orderClass;
        return this;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderType}.
     * <p>
     * 
     * 
     */
    public OrderType getType() {
        return type;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderType}.
     * <p>
     * 
     * 
     */
    public void setType(OrderType type) {
        this.type = type;
    }

    public Order withType(OrderType type) {
        this.type = type;
        return this;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderSide}.
     * <p>
     * 
     * 
     */
    public OrderSide getSide() {
        return side;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderSide}.
     * <p>
     * 
     * 
     */
    public void setSide(OrderSide side) {
        this.side = side;
    }

    public Order withSide(OrderSide side) {
        this.side = side;
        return this;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderTimeInForce}.
     * <p>
     * 
     * 
     */
    public OrderTimeInForce getTimeInForce() {
        return timeInForce;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderTimeInForce}.
     * <p>
     * 
     * 
     */
    public void setTimeInForce(OrderTimeInForce timeInForce) {
        this.timeInForce = timeInForce;
    }

    public Order withTimeInForce(OrderTimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    /**
     * Limit price.
     * <p>
     * 
     * 
     */
    public String getLimitPrice() {
        return limitPrice;
    }

    /**
     * Limit price.
     * <p>
     * 
     * 
     */
    public void setLimitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
    }

    public Order withLimitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
        return this;
    }

    /**
     * Stop price.
     * <p>
     * 
     * 
     */
    public String getStopPrice() {
        return stopPrice;
    }

    /**
     * Stop price.
     * <p>
     * 
     * 
     */
    public void setStopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
    }

    public Order withStopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
        return this;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderStatus}.
     * <p>
     * 
     * 
     */
    public OrderStatus getStatus() {
        return status;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.orders.enums.OrderStatus}.
     * <p>
     * 
     * 
     */
    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Order withStatus(OrderStatus status) {
        this.status = status;
        return this;
    }

    /**
     * If true, eligible for execution outside regular trading hours.
     * <p>
     * 
     * 
     */
    public Boolean getExtendedHours() {
        return extendedHours;
    }

    /**
     * If true, eligible for execution outside regular trading hours.
     * <p>
     * 
     * 
     */
    public void setExtendedHours(Boolean extendedHours) {
        this.extendedHours = extendedHours;
    }

    public Order withExtendedHours(Boolean extendedHours) {
        this.extendedHours = extendedHours;
        return this;
    }

    /**
     * When querying non-simple order_class orders in a nested style, an {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.orders.Order} entities associated with this order. Otherwise, null.
     * <p>
     * 
     * 
     */
    public ArrayList<net.jacobpeterson.alpaca.model.endpoint.orders.Order> getLegs() {
        return legs;
    }

    /**
     * When querying non-simple order_class orders in a nested style, an {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.orders.Order} entities associated with this order. Otherwise, null.
     * <p>
     * 
     * 
     */
    public void setLegs(ArrayList<net.jacobpeterson.alpaca.model.endpoint.orders.Order> legs) {
        this.legs = legs;
    }

    public Order withLegs(ArrayList<net.jacobpeterson.alpaca.model.endpoint.orders.Order> legs) {
        this.legs = legs;
        return this;
    }

    /**
     * The percent value away from the high water mark for trailing stop orders.
     * <p>
     * 
     * 
     */
    public String getTrailPercent() {
        return trailPercent;
    }

    /**
     * The percent value away from the high water mark for trailing stop orders.
     * <p>
     * 
     * 
     */
    public void setTrailPercent(String trailPercent) {
        this.trailPercent = trailPercent;
    }

    public Order withTrailPercent(String trailPercent) {
        this.trailPercent = trailPercent;
        return this;
    }

    /**
     * The dollar value away from the high water mark for trailing stop orders.
     * <p>
     * 
     * 
     */
    public String getTrailPrice() {
        return trailPrice;
    }

    /**
     * The dollar value away from the high water mark for trailing stop orders.
     * <p>
     * 
     * 
     */
    public void setTrailPrice(String trailPrice) {
        this.trailPrice = trailPrice;
    }

    public Order withTrailPrice(String trailPrice) {
        this.trailPrice = trailPrice;
        return this;
    }

    /**
     * High Water Mark - The highest (lowest) market price seen since the trailing stop order was submitted.
     * <p>
     * 
     * Corresponds to the "hwm" property.
     * 
     */
    public String getHighWaterMark() {
        return highWaterMark;
    }

    /**
     * High Water Mark - The highest (lowest) market price seen since the trailing stop order was submitted.
     * <p>
     * 
     * Corresponds to the "hwm" property.
     * 
     */
    public void setHighWaterMark(String highWaterMark) {
        this.highWaterMark = highWaterMark;
    }

    public Order withHighWaterMark(String highWaterMark) {
        this.highWaterMark = highWaterMark;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Order.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("clientOrderId");
        sb.append('=');
        sb.append(((this.clientOrderId == null)?"<null>":this.clientOrderId));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("submittedAt");
        sb.append('=');
        sb.append(((this.submittedAt == null)?"<null>":this.submittedAt));
        sb.append(',');
        sb.append("filledAt");
        sb.append('=');
        sb.append(((this.filledAt == null)?"<null>":this.filledAt));
        sb.append(',');
        sb.append("expiredAt");
        sb.append('=');
        sb.append(((this.expiredAt == null)?"<null>":this.expiredAt));
        sb.append(',');
        sb.append("canceledAt");
        sb.append('=');
        sb.append(((this.canceledAt == null)?"<null>":this.canceledAt));
        sb.append(',');
        sb.append("failedAt");
        sb.append('=');
        sb.append(((this.failedAt == null)?"<null>":this.failedAt));
        sb.append(',');
        sb.append("replacedAt");
        sb.append('=');
        sb.append(((this.replacedAt == null)?"<null>":this.replacedAt));
        sb.append(',');
        sb.append("replacedBy");
        sb.append('=');
        sb.append(((this.replacedBy == null)?"<null>":this.replacedBy));
        sb.append(',');
        sb.append("replaces");
        sb.append('=');
        sb.append(((this.replaces == null)?"<null>":this.replaces));
        sb.append(',');
        sb.append("assetId");
        sb.append('=');
        sb.append(((this.assetId == null)?"<null>":this.assetId));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("assetClass");
        sb.append('=');
        sb.append(((this.assetClass == null)?"<null>":this.assetClass));
        sb.append(',');
        sb.append("notional");
        sb.append('=');
        sb.append(((this.notional == null)?"<null>":this.notional));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("filledQuantity");
        sb.append('=');
        sb.append(((this.filledQuantity == null)?"<null>":this.filledQuantity));
        sb.append(',');
        sb.append("averageFillPrice");
        sb.append('=');
        sb.append(((this.averageFillPrice == null)?"<null>":this.averageFillPrice));
        sb.append(',');
        sb.append("orderClass");
        sb.append('=');
        sb.append(((this.orderClass == null)?"<null>":this.orderClass));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("side");
        sb.append('=');
        sb.append(((this.side == null)?"<null>":this.side));
        sb.append(',');
        sb.append("timeInForce");
        sb.append('=');
        sb.append(((this.timeInForce == null)?"<null>":this.timeInForce));
        sb.append(',');
        sb.append("limitPrice");
        sb.append('=');
        sb.append(((this.limitPrice == null)?"<null>":this.limitPrice));
        sb.append(',');
        sb.append("stopPrice");
        sb.append('=');
        sb.append(((this.stopPrice == null)?"<null>":this.stopPrice));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("extendedHours");
        sb.append('=');
        sb.append(((this.extendedHours == null)?"<null>":this.extendedHours));
        sb.append(',');
        sb.append("legs");
        sb.append('=');
        sb.append(((this.legs == null)?"<null>":this.legs));
        sb.append(',');
        sb.append("trailPercent");
        sb.append('=');
        sb.append(((this.trailPercent == null)?"<null>":this.trailPercent));
        sb.append(',');
        sb.append("trailPrice");
        sb.append('=');
        sb.append(((this.trailPrice == null)?"<null>":this.trailPrice));
        sb.append(',');
        sb.append("highWaterMark");
        sb.append('=');
        sb.append(((this.highWaterMark == null)?"<null>":this.highWaterMark));
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
        result = ((result* 31)+((this.averageFillPrice == null)? 0 :this.averageFillPrice.hashCode()));
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.replacedAt == null)? 0 :this.replacedAt.hashCode()));
        result = ((result* 31)+((this.notional == null)? 0 :this.notional.hashCode()));
        result = ((result* 31)+((this.extendedHours == null)? 0 :this.extendedHours.hashCode()));
        result = ((result* 31)+((this.trailPrice == null)? 0 :this.trailPrice.hashCode()));
        result = ((result* 31)+((this.assetClass == null)? 0 :this.assetClass.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.filledQuantity == null)? 0 :this.filledQuantity.hashCode()));
        result = ((result* 31)+((this.orderClass == null)? 0 :this.orderClass.hashCode()));
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.expiredAt == null)? 0 :this.expiredAt.hashCode()));
        result = ((result* 31)+((this.failedAt == null)? 0 :this.failedAt.hashCode()));
        result = ((result* 31)+((this.assetId == null)? 0 :this.assetId.hashCode()));
        result = ((result* 31)+((this.legs == null)? 0 :this.legs.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.submittedAt == null)? 0 :this.submittedAt.hashCode()));
        result = ((result* 31)+((this.timeInForce == null)? 0 :this.timeInForce.hashCode()));
        result = ((result* 31)+((this.highWaterMark == null)? 0 :this.highWaterMark.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        result = ((result* 31)+((this.side == null)? 0 :this.side.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.limitPrice == null)? 0 :this.limitPrice.hashCode()));
        result = ((result* 31)+((this.trailPercent == null)? 0 :this.trailPercent.hashCode()));
        result = ((result* 31)+((this.replacedBy == null)? 0 :this.replacedBy.hashCode()));
        result = ((result* 31)+((this.replaces == null)? 0 :this.replaces.hashCode()));
        result = ((result* 31)+((this.clientOrderId == null)? 0 :this.clientOrderId.hashCode()));
        result = ((result* 31)+((this.filledAt == null)? 0 :this.filledAt.hashCode()));
        result = ((result* 31)+((this.stopPrice == null)? 0 :this.stopPrice.hashCode()));
        result = ((result* 31)+((this.canceledAt == null)? 0 :this.canceledAt.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Order) == false) {
            return false;
        }
        Order rhs = ((Order) other);
        return ((((((((((((((((((((((((((((((((this.averageFillPrice == rhs.averageFillPrice)||((this.averageFillPrice!= null)&&this.averageFillPrice.equals(rhs.averageFillPrice)))&&((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol))))&&((this.replacedAt == rhs.replacedAt)||((this.replacedAt!= null)&&this.replacedAt.equals(rhs.replacedAt))))&&((this.notional == rhs.notional)||((this.notional!= null)&&this.notional.equals(rhs.notional))))&&((this.extendedHours == rhs.extendedHours)||((this.extendedHours!= null)&&this.extendedHours.equals(rhs.extendedHours))))&&((this.trailPrice == rhs.trailPrice)||((this.trailPrice!= null)&&this.trailPrice.equals(rhs.trailPrice))))&&((this.assetClass == rhs.assetClass)||((this.assetClass!= null)&&this.assetClass.equals(rhs.assetClass))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.filledQuantity == rhs.filledQuantity)||((this.filledQuantity!= null)&&this.filledQuantity.equals(rhs.filledQuantity))))&&((this.orderClass == rhs.orderClass)||((this.orderClass!= null)&&this.orderClass.equals(rhs.orderClass))))&&((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt))))&&((this.expiredAt == rhs.expiredAt)||((this.expiredAt!= null)&&this.expiredAt.equals(rhs.expiredAt))))&&((this.failedAt == rhs.failedAt)||((this.failedAt!= null)&&this.failedAt.equals(rhs.failedAt))))&&((this.assetId == rhs.assetId)||((this.assetId!= null)&&this.assetId.equals(rhs.assetId))))&&((this.legs == rhs.legs)||((this.legs!= null)&&this.legs.equals(rhs.legs))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.submittedAt == rhs.submittedAt)||((this.submittedAt!= null)&&this.submittedAt.equals(rhs.submittedAt))))&&((this.timeInForce == rhs.timeInForce)||((this.timeInForce!= null)&&this.timeInForce.equals(rhs.timeInForce))))&&((this.highWaterMark == rhs.highWaterMark)||((this.highWaterMark!= null)&&this.highWaterMark.equals(rhs.highWaterMark))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))))&&((this.side == rhs.side)||((this.side!= null)&&this.side.equals(rhs.side))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.limitPrice == rhs.limitPrice)||((this.limitPrice!= null)&&this.limitPrice.equals(rhs.limitPrice))))&&((this.trailPercent == rhs.trailPercent)||((this.trailPercent!= null)&&this.trailPercent.equals(rhs.trailPercent))))&&((this.replacedBy == rhs.replacedBy)||((this.replacedBy!= null)&&this.replacedBy.equals(rhs.replacedBy))))&&((this.replaces == rhs.replaces)||((this.replaces!= null)&&this.replaces.equals(rhs.replaces))))&&((this.clientOrderId == rhs.clientOrderId)||((this.clientOrderId!= null)&&this.clientOrderId.equals(rhs.clientOrderId))))&&((this.filledAt == rhs.filledAt)||((this.filledAt!= null)&&this.filledAt.equals(rhs.filledAt))))&&((this.stopPrice == rhs.stopPrice)||((this.stopPrice!= null)&&this.stopPrice.equals(rhs.stopPrice))))&&((this.canceledAt == rhs.canceledAt)||((this.canceledAt!= null)&&this.canceledAt.equals(rhs.canceledAt))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
