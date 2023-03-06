
package net.jacobpeterson.alpaca.model.endpoint.positions;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/positions/">Positions</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Position implements Serializable
{

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
     * Symbol name of the asset.
     * <p>
     * 
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    /**
     * Exchange name of the asset ("ErisX" for crypto).
     * <p>
     * 
     * 
     */
    @SerializedName("exchange")
    @Expose
    private String exchange;
    /**
     * Asset class name.
     * <p>
     * 
     * 
     */
    @SerializedName("asset_class")
    @Expose
    private String assetClass;
    /**
     * Average entry price of the position.
     * <p>
     * 
     * Corresponds to the "avg_entry_price" property.
     * 
     */
    @SerializedName("avg_entry_price")
    @Expose
    private String averageEntryPrice;
    /**
     * The number of shares.
     * <p>
     * 
     * Corresponds to the "qty" property.
     * 
     */
    @SerializedName("qty")
    @Expose
    private String quantity;
    /**
     * "long".
     * <p>
     * 
     * 
     */
    @SerializedName("side")
    @Expose
    private String side;
    /**
     * Total dollar amount of the position.
     * <p>
     * 
     * 
     */
    @SerializedName("market_value")
    @Expose
    private String marketValue;
    /**
     * Total cost basis in dollar.
     * <p>
     * 
     * 
     */
    @SerializedName("cost_basis")
    @Expose
    private String costBasis;
    /**
     * Unrealized profit/loss in dollars.
     * <p>
     * 
     * Corresponds to the "unrealized_pl" property.
     * 
     */
    @SerializedName("unrealized_pl")
    @Expose
    private String unrealizedProfitLoss;
    /**
     * Unrealized profit/loss percent (by a factor of 1).
     * <p>
     * 
     * Corresponds to the "unrealized_plpc" property.
     * 
     */
    @SerializedName("unrealized_plpc")
    @Expose
    private String unrealizedProfitLossPercent;
    /**
     * Unrealized profit/loss in dollars for the day.
     * <p>
     * 
     * Corresponds to the "unrealized_intraday_pl" property.
     * 
     */
    @SerializedName("unrealized_intraday_pl")
    @Expose
    private String unrealizedIntradayProfitLoss;
    /**
     * Unrealized profit/loss percent (by a factor of 1).
     * <p>
     * 
     * Corresponds to the "unrealized_intraday_plpc" property.
     * 
     */
    @SerializedName("unrealized_intraday_plpc")
    @Expose
    private String unrealizedIntradayProfitLossPercent;
    /**
     * Current asset price per share.
     * <p>
     * 
     * 
     */
    @SerializedName("current_price")
    @Expose
    private String currentPrice;
    /**
     * Last day’s asset price per share based on the closing value of the last trading day.
     * <p>
     * 
     * 
     */
    @SerializedName("lastday_price")
    @Expose
    private String lastdayPrice;
    /**
     * Percent change from last day price (by a factor of 1).
     * <p>
     * 
     * 
     */
    @SerializedName("change_today")
    @Expose
    private String changeToday;
    private final static long serialVersionUID = -8867897457147062083L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Position() {
    }

    /**
     * 
     * @param source
     */
    public Position(Position source) {
        super();
        this.assetId = source.assetId;
        this.symbol = source.symbol;
        this.exchange = source.exchange;
        this.assetClass = source.assetClass;
        this.averageEntryPrice = source.averageEntryPrice;
        this.quantity = source.quantity;
        this.side = source.side;
        this.marketValue = source.marketValue;
        this.costBasis = source.costBasis;
        this.unrealizedProfitLoss = source.unrealizedProfitLoss;
        this.unrealizedProfitLossPercent = source.unrealizedProfitLossPercent;
        this.unrealizedIntradayProfitLoss = source.unrealizedIntradayProfitLoss;
        this.unrealizedIntradayProfitLossPercent = source.unrealizedIntradayProfitLossPercent;
        this.currentPrice = source.currentPrice;
        this.lastdayPrice = source.lastdayPrice;
        this.changeToday = source.changeToday;
    }

    /**
     * 
     * @param symbol
     * @param lastdayPrice
     * @param side
     * @param quantity
     * @param marketValue
     * @param currentPrice
     * @param assetClass
     * @param unrealizedIntradayProfitLossPercent
     * @param unrealizedIntradayProfitLoss
     * @param averageEntryPrice
     * @param changeToday
     * @param assetId
     * @param unrealizedProfitLossPercent
     * @param costBasis
     * @param exchange
     * @param unrealizedProfitLoss
     */
    public Position(String assetId, String symbol, String exchange, String assetClass, String averageEntryPrice, String quantity, String side, String marketValue, String costBasis, String unrealizedProfitLoss, String unrealizedProfitLossPercent, String unrealizedIntradayProfitLoss, String unrealizedIntradayProfitLossPercent, String currentPrice, String lastdayPrice, String changeToday) {
        super();
        this.assetId = assetId;
        this.symbol = symbol;
        this.exchange = exchange;
        this.assetClass = assetClass;
        this.averageEntryPrice = averageEntryPrice;
        this.quantity = quantity;
        this.side = side;
        this.marketValue = marketValue;
        this.costBasis = costBasis;
        this.unrealizedProfitLoss = unrealizedProfitLoss;
        this.unrealizedProfitLossPercent = unrealizedProfitLossPercent;
        this.unrealizedIntradayProfitLoss = unrealizedIntradayProfitLoss;
        this.unrealizedIntradayProfitLossPercent = unrealizedIntradayProfitLossPercent;
        this.currentPrice = currentPrice;
        this.lastdayPrice = lastdayPrice;
        this.changeToday = changeToday;
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

    public Position withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     * Symbol name of the asset.
     * <p>
     * 
     * 
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Symbol name of the asset.
     * <p>
     * 
     * 
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Position withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Exchange name of the asset ("ErisX" for crypto).
     * <p>
     * 
     * 
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * Exchange name of the asset ("ErisX" for crypto).
     * <p>
     * 
     * 
     */
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public Position withExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Asset class name.
     * <p>
     * 
     * 
     */
    public String getAssetClass() {
        return assetClass;
    }

    /**
     * Asset class name.
     * <p>
     * 
     * 
     */
    public void setAssetClass(String assetClass) {
        this.assetClass = assetClass;
    }

    public Position withAssetClass(String assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    /**
     * Average entry price of the position.
     * <p>
     * 
     * Corresponds to the "avg_entry_price" property.
     * 
     */
    public String getAverageEntryPrice() {
        return averageEntryPrice;
    }

    /**
     * Average entry price of the position.
     * <p>
     * 
     * Corresponds to the "avg_entry_price" property.
     * 
     */
    public void setAverageEntryPrice(String averageEntryPrice) {
        this.averageEntryPrice = averageEntryPrice;
    }

    public Position withAverageEntryPrice(String averageEntryPrice) {
        this.averageEntryPrice = averageEntryPrice;
        return this;
    }

    /**
     * The number of shares.
     * <p>
     * 
     * Corresponds to the "qty" property.
     * 
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * The number of shares.
     * <p>
     * 
     * Corresponds to the "qty" property.
     * 
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Position withQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * "long".
     * <p>
     * 
     * 
     */
    public String getSide() {
        return side;
    }

    /**
     * "long".
     * <p>
     * 
     * 
     */
    public void setSide(String side) {
        this.side = side;
    }

    public Position withSide(String side) {
        this.side = side;
        return this;
    }

    /**
     * Total dollar amount of the position.
     * <p>
     * 
     * 
     */
    public String getMarketValue() {
        return marketValue;
    }

    /**
     * Total dollar amount of the position.
     * <p>
     * 
     * 
     */
    public void setMarketValue(String marketValue) {
        this.marketValue = marketValue;
    }

    public Position withMarketValue(String marketValue) {
        this.marketValue = marketValue;
        return this;
    }

    /**
     * Total cost basis in dollar.
     * <p>
     * 
     * 
     */
    public String getCostBasis() {
        return costBasis;
    }

    /**
     * Total cost basis in dollar.
     * <p>
     * 
     * 
     */
    public void setCostBasis(String costBasis) {
        this.costBasis = costBasis;
    }

    public Position withCostBasis(String costBasis) {
        this.costBasis = costBasis;
        return this;
    }

    /**
     * Unrealized profit/loss in dollars.
     * <p>
     * 
     * Corresponds to the "unrealized_pl" property.
     * 
     */
    public String getUnrealizedProfitLoss() {
        return unrealizedProfitLoss;
    }

    /**
     * Unrealized profit/loss in dollars.
     * <p>
     * 
     * Corresponds to the "unrealized_pl" property.
     * 
     */
    public void setUnrealizedProfitLoss(String unrealizedProfitLoss) {
        this.unrealizedProfitLoss = unrealizedProfitLoss;
    }

    public Position withUnrealizedProfitLoss(String unrealizedProfitLoss) {
        this.unrealizedProfitLoss = unrealizedProfitLoss;
        return this;
    }

    /**
     * Unrealized profit/loss percent (by a factor of 1).
     * <p>
     * 
     * Corresponds to the "unrealized_plpc" property.
     * 
     */
    public String getUnrealizedProfitLossPercent() {
        return unrealizedProfitLossPercent;
    }

    /**
     * Unrealized profit/loss percent (by a factor of 1).
     * <p>
     * 
     * Corresponds to the "unrealized_plpc" property.
     * 
     */
    public void setUnrealizedProfitLossPercent(String unrealizedProfitLossPercent) {
        this.unrealizedProfitLossPercent = unrealizedProfitLossPercent;
    }

    public Position withUnrealizedProfitLossPercent(String unrealizedProfitLossPercent) {
        this.unrealizedProfitLossPercent = unrealizedProfitLossPercent;
        return this;
    }

    /**
     * Unrealized profit/loss in dollars for the day.
     * <p>
     * 
     * Corresponds to the "unrealized_intraday_pl" property.
     * 
     */
    public String getUnrealizedIntradayProfitLoss() {
        return unrealizedIntradayProfitLoss;
    }

    /**
     * Unrealized profit/loss in dollars for the day.
     * <p>
     * 
     * Corresponds to the "unrealized_intraday_pl" property.
     * 
     */
    public void setUnrealizedIntradayProfitLoss(String unrealizedIntradayProfitLoss) {
        this.unrealizedIntradayProfitLoss = unrealizedIntradayProfitLoss;
    }

    public Position withUnrealizedIntradayProfitLoss(String unrealizedIntradayProfitLoss) {
        this.unrealizedIntradayProfitLoss = unrealizedIntradayProfitLoss;
        return this;
    }

    /**
     * Unrealized profit/loss percent (by a factor of 1).
     * <p>
     * 
     * Corresponds to the "unrealized_intraday_plpc" property.
     * 
     */
    public String getUnrealizedIntradayProfitLossPercent() {
        return unrealizedIntradayProfitLossPercent;
    }

    /**
     * Unrealized profit/loss percent (by a factor of 1).
     * <p>
     * 
     * Corresponds to the "unrealized_intraday_plpc" property.
     * 
     */
    public void setUnrealizedIntradayProfitLossPercent(String unrealizedIntradayProfitLossPercent) {
        this.unrealizedIntradayProfitLossPercent = unrealizedIntradayProfitLossPercent;
    }

    public Position withUnrealizedIntradayProfitLossPercent(String unrealizedIntradayProfitLossPercent) {
        this.unrealizedIntradayProfitLossPercent = unrealizedIntradayProfitLossPercent;
        return this;
    }

    /**
     * Current asset price per share.
     * <p>
     * 
     * 
     */
    public String getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Current asset price per share.
     * <p>
     * 
     * 
     */
    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Position withCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }

    /**
     * Last day’s asset price per share based on the closing value of the last trading day.
     * <p>
     * 
     * 
     */
    public String getLastdayPrice() {
        return lastdayPrice;
    }

    /**
     * Last day’s asset price per share based on the closing value of the last trading day.
     * <p>
     * 
     * 
     */
    public void setLastdayPrice(String lastdayPrice) {
        this.lastdayPrice = lastdayPrice;
    }

    public Position withLastdayPrice(String lastdayPrice) {
        this.lastdayPrice = lastdayPrice;
        return this;
    }

    /**
     * Percent change from last day price (by a factor of 1).
     * <p>
     * 
     * 
     */
    public String getChangeToday() {
        return changeToday;
    }

    /**
     * Percent change from last day price (by a factor of 1).
     * <p>
     * 
     * 
     */
    public void setChangeToday(String changeToday) {
        this.changeToday = changeToday;
    }

    public Position withChangeToday(String changeToday) {
        this.changeToday = changeToday;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Position.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("assetId");
        sb.append('=');
        sb.append(((this.assetId == null)?"<null>":this.assetId));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("exchange");
        sb.append('=');
        sb.append(((this.exchange == null)?"<null>":this.exchange));
        sb.append(',');
        sb.append("assetClass");
        sb.append('=');
        sb.append(((this.assetClass == null)?"<null>":this.assetClass));
        sb.append(',');
        sb.append("averageEntryPrice");
        sb.append('=');
        sb.append(((this.averageEntryPrice == null)?"<null>":this.averageEntryPrice));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("side");
        sb.append('=');
        sb.append(((this.side == null)?"<null>":this.side));
        sb.append(',');
        sb.append("marketValue");
        sb.append('=');
        sb.append(((this.marketValue == null)?"<null>":this.marketValue));
        sb.append(',');
        sb.append("costBasis");
        sb.append('=');
        sb.append(((this.costBasis == null)?"<null>":this.costBasis));
        sb.append(',');
        sb.append("unrealizedProfitLoss");
        sb.append('=');
        sb.append(((this.unrealizedProfitLoss == null)?"<null>":this.unrealizedProfitLoss));
        sb.append(',');
        sb.append("unrealizedProfitLossPercent");
        sb.append('=');
        sb.append(((this.unrealizedProfitLossPercent == null)?"<null>":this.unrealizedProfitLossPercent));
        sb.append(',');
        sb.append("unrealizedIntradayProfitLoss");
        sb.append('=');
        sb.append(((this.unrealizedIntradayProfitLoss == null)?"<null>":this.unrealizedIntradayProfitLoss));
        sb.append(',');
        sb.append("unrealizedIntradayProfitLossPercent");
        sb.append('=');
        sb.append(((this.unrealizedIntradayProfitLossPercent == null)?"<null>":this.unrealizedIntradayProfitLossPercent));
        sb.append(',');
        sb.append("currentPrice");
        sb.append('=');
        sb.append(((this.currentPrice == null)?"<null>":this.currentPrice));
        sb.append(',');
        sb.append("lastdayPrice");
        sb.append('=');
        sb.append(((this.lastdayPrice == null)?"<null>":this.lastdayPrice));
        sb.append(',');
        sb.append("changeToday");
        sb.append('=');
        sb.append(((this.changeToday == null)?"<null>":this.changeToday));
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
        result = ((result* 31)+((this.lastdayPrice == null)? 0 :this.lastdayPrice.hashCode()));
        result = ((result* 31)+((this.side == null)? 0 :this.side.hashCode()));
        result = ((result* 31)+((this.quantity == null)? 0 :this.quantity.hashCode()));
        result = ((result* 31)+((this.marketValue == null)? 0 :this.marketValue.hashCode()));
        result = ((result* 31)+((this.currentPrice == null)? 0 :this.currentPrice.hashCode()));
        result = ((result* 31)+((this.assetClass == null)? 0 :this.assetClass.hashCode()));
        result = ((result* 31)+((this.unrealizedIntradayProfitLossPercent == null)? 0 :this.unrealizedIntradayProfitLossPercent.hashCode()));
        result = ((result* 31)+((this.unrealizedIntradayProfitLoss == null)? 0 :this.unrealizedIntradayProfitLoss.hashCode()));
        result = ((result* 31)+((this.averageEntryPrice == null)? 0 :this.averageEntryPrice.hashCode()));
        result = ((result* 31)+((this.changeToday == null)? 0 :this.changeToday.hashCode()));
        result = ((result* 31)+((this.assetId == null)? 0 :this.assetId.hashCode()));
        result = ((result* 31)+((this.unrealizedProfitLossPercent == null)? 0 :this.unrealizedProfitLossPercent.hashCode()));
        result = ((result* 31)+((this.costBasis == null)? 0 :this.costBasis.hashCode()));
        result = ((result* 31)+((this.exchange == null)? 0 :this.exchange.hashCode()));
        result = ((result* 31)+((this.unrealizedProfitLoss == null)? 0 :this.unrealizedProfitLoss.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Position) == false) {
            return false;
        }
        Position rhs = ((Position) other);
        return (((((((((((((((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.lastdayPrice == rhs.lastdayPrice)||((this.lastdayPrice!= null)&&this.lastdayPrice.equals(rhs.lastdayPrice))))&&((this.side == rhs.side)||((this.side!= null)&&this.side.equals(rhs.side))))&&((this.quantity == rhs.quantity)||((this.quantity!= null)&&this.quantity.equals(rhs.quantity))))&&((this.marketValue == rhs.marketValue)||((this.marketValue!= null)&&this.marketValue.equals(rhs.marketValue))))&&((this.currentPrice == rhs.currentPrice)||((this.currentPrice!= null)&&this.currentPrice.equals(rhs.currentPrice))))&&((this.assetClass == rhs.assetClass)||((this.assetClass!= null)&&this.assetClass.equals(rhs.assetClass))))&&((this.unrealizedIntradayProfitLossPercent == rhs.unrealizedIntradayProfitLossPercent)||((this.unrealizedIntradayProfitLossPercent!= null)&&this.unrealizedIntradayProfitLossPercent.equals(rhs.unrealizedIntradayProfitLossPercent))))&&((this.unrealizedIntradayProfitLoss == rhs.unrealizedIntradayProfitLoss)||((this.unrealizedIntradayProfitLoss!= null)&&this.unrealizedIntradayProfitLoss.equals(rhs.unrealizedIntradayProfitLoss))))&&((this.averageEntryPrice == rhs.averageEntryPrice)||((this.averageEntryPrice!= null)&&this.averageEntryPrice.equals(rhs.averageEntryPrice))))&&((this.changeToday == rhs.changeToday)||((this.changeToday!= null)&&this.changeToday.equals(rhs.changeToday))))&&((this.assetId == rhs.assetId)||((this.assetId!= null)&&this.assetId.equals(rhs.assetId))))&&((this.unrealizedProfitLossPercent == rhs.unrealizedProfitLossPercent)||((this.unrealizedProfitLossPercent!= null)&&this.unrealizedProfitLossPercent.equals(rhs.unrealizedProfitLossPercent))))&&((this.costBasis == rhs.costBasis)||((this.costBasis!= null)&&this.costBasis.equals(rhs.costBasis))))&&((this.exchange == rhs.exchange)||((this.exchange!= null)&&this.exchange.equals(rhs.exchange))))&&((this.unrealizedProfitLoss == rhs.unrealizedProfitLoss)||((this.unrealizedProfitLoss!= null)&&this.unrealizedProfitLoss.equals(rhs.unrealizedProfitLoss))));
    }

}
