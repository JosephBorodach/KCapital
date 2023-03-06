
package net.jacobpeterson.alpaca.model.endpoint.portfoliohistory;

import java.io.Serializable;
import java.time.ZonedDateTime;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/portfolio-history/">Portfolio History</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class PortfolioHistoryDataPoint implements Serializable
{

    /**
     * {@link java.time.ZonedDateTime} of this data element.
     * <p>
     * 
     * 
     */
    @SerializedName("timestamp")
    @Expose
    private ZonedDateTime timestamp;
    /**
     * Equity value of the account in dollar amount as of the end of this time window.
     * <p>
     * 
     * 
     */
    @SerializedName("equity")
    @Expose
    private Double equity;
    /**
     * Profit/loss in dollar from the base value.
     * <p>
     * 
     * 
     */
    @SerializedName("profit_loss")
    @Expose
    private Double profitLoss;
    /**
     * Profit/loss in percentage from the base value.
     * <p>
     * 
     * 
     */
    @SerializedName("profit_loss_percent")
    @Expose
    private Double profitLossPercent;
    private final static long serialVersionUID = -7048653441275470210L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PortfolioHistoryDataPoint() {
    }

    /**
     * 
     * @param source
     */
    public PortfolioHistoryDataPoint(PortfolioHistoryDataPoint source) {
        super();
        this.timestamp = source.timestamp;
        this.equity = source.equity;
        this.profitLoss = source.profitLoss;
        this.profitLossPercent = source.profitLossPercent;
    }

    /**
     * 
     * @param profitLossPercent
     * @param profitLoss
     * @param equity
     * @param timestamp
     */
    public PortfolioHistoryDataPoint(ZonedDateTime timestamp, Double equity, Double profitLoss, Double profitLossPercent) {
        super();
        this.timestamp = timestamp;
        this.equity = equity;
        this.profitLoss = profitLoss;
        this.profitLossPercent = profitLossPercent;
    }

    /**
     * {@link java.time.ZonedDateTime} of this data element.
     * <p>
     * 
     * 
     */
    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * {@link java.time.ZonedDateTime} of this data element.
     * <p>
     * 
     * 
     */
    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public PortfolioHistoryDataPoint withTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Equity value of the account in dollar amount as of the end of this time window.
     * <p>
     * 
     * 
     */
    public Double getEquity() {
        return equity;
    }

    /**
     * Equity value of the account in dollar amount as of the end of this time window.
     * <p>
     * 
     * 
     */
    public void setEquity(Double equity) {
        this.equity = equity;
    }

    public PortfolioHistoryDataPoint withEquity(Double equity) {
        this.equity = equity;
        return this;
    }

    /**
     * Profit/loss in dollar from the base value.
     * <p>
     * 
     * 
     */
    public Double getProfitLoss() {
        return profitLoss;
    }

    /**
     * Profit/loss in dollar from the base value.
     * <p>
     * 
     * 
     */
    public void setProfitLoss(Double profitLoss) {
        this.profitLoss = profitLoss;
    }

    public PortfolioHistoryDataPoint withProfitLoss(Double profitLoss) {
        this.profitLoss = profitLoss;
        return this;
    }

    /**
     * Profit/loss in percentage from the base value.
     * <p>
     * 
     * 
     */
    public Double getProfitLossPercent() {
        return profitLossPercent;
    }

    /**
     * Profit/loss in percentage from the base value.
     * <p>
     * 
     * 
     */
    public void setProfitLossPercent(Double profitLossPercent) {
        this.profitLossPercent = profitLossPercent;
    }

    public PortfolioHistoryDataPoint withProfitLossPercent(Double profitLossPercent) {
        this.profitLossPercent = profitLossPercent;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PortfolioHistoryDataPoint.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof PortfolioHistoryDataPoint) == false) {
            return false;
        }
        PortfolioHistoryDataPoint rhs = ((PortfolioHistoryDataPoint) other);
        return (((((this.profitLossPercent == rhs.profitLossPercent)||((this.profitLossPercent!= null)&&this.profitLossPercent.equals(rhs.profitLossPercent)))&&((this.profitLoss == rhs.profitLoss)||((this.profitLoss!= null)&&this.profitLoss.equals(rhs.profitLoss))))&&((this.equity == rhs.equity)||((this.equity!= null)&&this.equity.equals(rhs.equity))))&&((this.timestamp == rhs.timestamp)||((this.timestamp!= null)&&this.timestamp.equals(rhs.timestamp))));
    }

}
