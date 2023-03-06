
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
public class PortfolioHistory implements Serializable
{

    /**
     * The {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.portfoliohistory.PortfolioHistoryDataPoint}s.
     * <p>
     * 
     * 
     */
    @SerializedName("data_points")
    @Expose
    private ArrayList<PortfolioHistoryDataPoint> dataPoints;
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
    private final static long serialVersionUID = 7216005695744573169L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PortfolioHistory() {
    }

    /**
     * 
     * @param source
     */
    public PortfolioHistory(PortfolioHistory source) {
        super();
        this.dataPoints = source.dataPoints;
        this.baseValue = source.baseValue;
        this.timeframe = source.timeframe;
    }

    /**
     * 
     * @param timeframe
     * @param baseValue
     * @param dataPoints
     */
    public PortfolioHistory(ArrayList<PortfolioHistoryDataPoint> dataPoints, Double baseValue, PortfolioTimeFrame timeframe) {
        super();
        this.dataPoints = dataPoints;
        this.baseValue = baseValue;
        this.timeframe = timeframe;
    }

    /**
     * The {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.portfoliohistory.PortfolioHistoryDataPoint}s.
     * <p>
     * 
     * 
     */
    public ArrayList<PortfolioHistoryDataPoint> getDataPoints() {
        return dataPoints;
    }

    /**
     * The {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.portfoliohistory.PortfolioHistoryDataPoint}s.
     * <p>
     * 
     * 
     */
    public void setDataPoints(ArrayList<PortfolioHistoryDataPoint> dataPoints) {
        this.dataPoints = dataPoints;
    }

    public PortfolioHistory withDataPoints(ArrayList<PortfolioHistoryDataPoint> dataPoints) {
        this.dataPoints = dataPoints;
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

    public PortfolioHistory withBaseValue(Double baseValue) {
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

    public PortfolioHistory withTimeframe(PortfolioTimeFrame timeframe) {
        this.timeframe = timeframe;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PortfolioHistory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dataPoints");
        sb.append('=');
        sb.append(((this.dataPoints == null)?"<null>":this.dataPoints));
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
        result = ((result* 31)+((this.dataPoints == null)? 0 :this.dataPoints.hashCode()));
        result = ((result* 31)+((this.timeframe == null)? 0 :this.timeframe.hashCode()));
        result = ((result* 31)+((this.baseValue == null)? 0 :this.baseValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PortfolioHistory) == false) {
            return false;
        }
        PortfolioHistory rhs = ((PortfolioHistory) other);
        return ((((this.dataPoints == rhs.dataPoints)||((this.dataPoints!= null)&&this.dataPoints.equals(rhs.dataPoints)))&&((this.timeframe == rhs.timeframe)||((this.timeframe!= null)&&this.timeframe.equals(rhs.timeframe))))&&((this.baseValue == rhs.baseValue)||((this.baseValue!= null)&&this.baseValue.equals(rhs.baseValue))));
    }

}
