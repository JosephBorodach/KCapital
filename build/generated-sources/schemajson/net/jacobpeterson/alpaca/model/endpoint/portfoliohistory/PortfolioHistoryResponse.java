
package net.jacobpeterson.alpaca.model.endpoint.portfoliohistory;

import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.portfoliohistory.enums.PortfolioTimeFrame;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/portfolio-history/">Portfolio History</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class PortfolioHistoryResponse implements Serializable
{

    /**
     * Time of each data element, left-labeled (the beginning of time window).
     * <p>
     * 
     * 
     */
    @SerializedName("timestamp")
    @Expose
    private ArrayList<Long> timestamp;
    /**
     * Equity value of the account in dollar amount as of the end of each time window.
     * <p>
     * 
     * 
     */
    @SerializedName("equity")
    @Expose
    private ArrayList<Double> equity;
    /**
     * Profit/loss in dollar from the base value.
     * <p>
     * 
     * 
     */
    @SerializedName("profit_loss")
    @Expose
    private ArrayList<Double> profitLoss;
    /**
     * Profit/loss in percentage from the base value.
     * <p>
     * 
     * Corresponds to the "profit_loss_pct" property.
     * 
     */
    @SerializedName("profit_loss_pct")
    @Expose
    private ArrayList<Double> profitLossPercent;
    /**
     * Basis in dollar of the profit loss calculation.
     * <p>
     * 
     * 
     */
    @SerializedName("base_value")
    @Expose
    private Double baseValue;
    /**
     * Time window size of each data element.
     * <p>
     * 
     * 
     */
    @SerializedName("timeframe")
    @Expose
    private PortfolioTimeFrame timeframe;
    private final static long serialVersionUID = -6393860767068088948L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PortfolioHistoryResponse() {
    }

    /**
     * 
     * @param source
     */
    public PortfolioHistoryResponse(PortfolioHistoryResponse source) {
        super();
        this.timestamp = source.timestamp;
        this.equity = source.equity;
        this.profitLoss = source.profitLoss;
        this.profitLossPercent = source.profitLossPercent;
        this.baseValue = source.baseValue;
        this.timeframe = source.timeframe;
    }

    /**
     * 
     * @param timeframe
     * @param baseValue
     * @param profitLossPercent
     * @param profitLoss
     * @param equity
     * @param timestamp
     */
    public PortfolioHistoryResponse(ArrayList<Long> timestamp, ArrayList<Double> equity, ArrayList<Double> profitLoss, ArrayList<Double> profitLossPercent, Double baseValue, PortfolioTimeFrame timeframe) {
        super();
        this.timestamp = timestamp;
        this.equity = equity;
        this.profitLoss = profitLoss;
        this.profitLossPercent = profitLossPercent;
        this.baseValue = baseValue;
        this.timeframe = timeframe;
    }

    /**
     * Time of each data element, left-labeled (the beginning of time window).
     * <p>
     * 
     * 
     */
    public ArrayList<Long> getTimestamp() {
        return timestamp;
    }

    /**
     * Time of each data element, left-labeled (the beginning of time window).
     * <p>
     * 
     * 
     */
    public void setTimestamp(ArrayList<Long> timestamp) {
        this.timestamp = timestamp;
    }

    public PortfolioHistoryResponse withTimestamp(ArrayList<Long> timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Equity value of the account in dollar amount as of the end of each time window.
     * <p>
     * 
     * 
     */
    public ArrayList<Double> getEquity() {
        return equity;
    }

    /**
     * Equity value of the account in dollar amount as of the end of each time window.
     * <p>
     * 
     * 
     */
    public void setEquity(ArrayList<Double> equity) {
        this.equity = equity;
    }

    public PortfolioHistoryResponse withEquity(ArrayList<Double> equity) {
        this.equity = equity;
        return this;
    }

    /**
     * Profit/loss in dollar from the base value.
     * <p>
     * 
     * 
     */
    public ArrayList<Double> getProfitLoss() {
        return profitLoss;
    }

    /**
     * Profit/loss in dollar from the base value.
     * <p>
     * 
     * 
     */
    public void setProfitLoss(ArrayList<Double> profitLoss) {
        this.profitLoss = profitLoss;
    }

    public PortfolioHistoryResponse withProfitLoss(ArrayList<Double> profitLoss) {
        this.profitLoss = profitLoss;
        return this;
    }

    /**
     * Profit/loss in percentage from the base value.
     * <p>
     * 
     * Corresponds to the "profit_loss_pct" property.
     * 
     */
    public ArrayList<Double> getProfitLossPercent() {
        return profitLossPercent;
    }

    /**
     * Profit/loss in percentage from the base value.
     * <p>
     * 
     * Corresponds to the "profit_loss_pct" property.
     * 
     */
    public void setProfitLossPercent(ArrayList<Double> profitLossPercent) {
        this.profitLossPercent = profitLossPercent;
    }

    public PortfolioHistoryResponse withProfitLossPercent(ArrayList<Double> profitLossPercent) {
        this.profitLossPercent = profitLossPercent;
        return this;
    }

    /**
     * Basis in dollar of the profit loss calculation.
     * <p>
     * 
     * 
     */
    public Double getBaseValue() {
        return baseValue;
    }

    /**
     * Basis in dollar of the profit loss calculation.
     * <p>
     * 
     * 
     */
    public void setBaseValue(Double baseValue) {
        this.baseValue = baseValue;
    }

    public PortfolioHistoryResponse withBaseValue(Double baseValue) {
        this.baseValue = baseValue;
        return this;
    }

    /**
     * Time window size of each data element.
     * <p>
     * 
     * 
     */
    public PortfolioTimeFrame getTimeframe() {
        return timeframe;
    }

    /**
     * Time window size of each data element.
     * <p>
     * 
     * 
     */
    public void setTimeframe(PortfolioTimeFrame timeframe) {
        this.timeframe = timeframe;
    }

    public PortfolioHistoryResponse withTimeframe(PortfolioTimeFrame timeframe) {
        this.timeframe = timeframe;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PortfolioHistoryResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("timestamp");
        sb.append('=');
        sb.append(((this.timestamp == null)?"<null>":this.timestamp));
        sb.append(',');
        sb.append("equity");
        sb.append('=');
        sb.append(((this.equity == null)?"<null>":this.equity));
        sb.append(',');
        sb.append("profitLoss");
        sb.append('=');
        sb.append(((this.profitLoss == null)?"<null>":this.profitLoss));
        sb.append(',');
        sb.append("profitLossPercent");
        sb.append('=');
        sb.append(((this.profitLossPercent == null)?"<null>":this.profitLossPercent));
        sb.append(',');
        sb.append("baseValue");
        sb.append('=');
        sb.append(((this.baseValue == null)?"<null>":this.baseValue));
        sb.append(',');
        sb.append("timeframe");
        sb.append('=');
        sb.append(((this.timeframe == null)?"<null>":this.timeframe));
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
        result = ((result* 31)+((this.timeframe == null)? 0 :this.timeframe.hashCode()));
        result = ((result* 31)+((this.baseValue == null)? 0 :this.baseValue.hashCode()));
        result = ((result* 31)+((this.profitLossPercent == null)? 0 :this.profitLossPercent.hashCode()));
        result = ((result* 31)+((this.profitLoss == null)? 0 :this.profitLoss.hashCode()));
        result = ((result* 31)+((this.equity == null)? 0 :this.equity.hashCode()));
        result = ((result* 31)+((this.timestamp == null)? 0 :this.timestamp.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PortfolioHistoryResponse) == false) {
            return false;
        }
        PortfolioHistoryResponse rhs = ((PortfolioHistoryResponse) other);
        return (((((((this.timeframe == rhs.timeframe)||((this.timeframe!= null)&&this.timeframe.equals(rhs.timeframe)))&&((this.baseValue == rhs.baseValue)||((this.baseValue!= null)&&this.baseValue.equals(rhs.baseValue))))&&((this.profitLossPercent == rhs.profitLossPercent)||((this.profitLossPercent!= null)&&this.profitLossPercent.equals(rhs.profitLossPercent))))&&((this.profitLoss == rhs.profitLoss)||((this.profitLoss!= null)&&this.profitLoss.equals(rhs.profitLoss))))&&((this.equity == rhs.equity)||((this.equity!= null)&&this.equity.equals(rhs.equity))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
