
package net.jacobpeterson.alpaca.model.endpoint.calendar;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/calendar/">Calendar</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Calendar implements Serializable
{

    /**
     * Date string in "%Y-%m-%d" format.
     * <p>
     * 
     * 
     */
    @SerializedName("date")
    @Expose
    private LocalDate date;
    /**
     * The time the market opens at on this date in "%H:%M" format.
     * <p>
     * 
     * 
     */
    @SerializedName("open")
    @Expose
    private LocalTime open;
    /**
     * The time the market closes at on this date in "%H:%M" format.
     * <p>
     * 
     * 
     */
    @SerializedName("close")
    @Expose
    private LocalTime close;
    private final static long serialVersionUID = -4139299829711238947L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Calendar() {
    }

    /**
     * 
     * @param source
     */
    public Calendar(Calendar source) {
        super();
        this.date = source.date;
        this.open = source.open;
        this.close = source.close;
    }

    /**
     * 
     * @param date
     * @param close
     * @param open
     */
    public Calendar(LocalDate date, LocalTime open, LocalTime close) {
        super();
        this.date = date;
        this.open = open;
        this.close = close;
    }

    /**
     * Date string in "%Y-%m-%d" format.
     * <p>
     * 
     * 
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Date string in "%Y-%m-%d" format.
     * <p>
     * 
     * 
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Calendar withDate(LocalDate date) {
        this.date = date;
        return this;
    }

    /**
     * The time the market opens at on this date in "%H:%M" format.
     * <p>
     * 
     * 
     */
    public LocalTime getOpen() {
        return open;
    }

    /**
     * The time the market opens at on this date in "%H:%M" format.
     * <p>
     * 
     * 
     */
    public void setOpen(LocalTime open) {
        this.open = open;
    }

    public Calendar withOpen(LocalTime open) {
        this.open = open;
        return this;
    }

    /**
     * The time the market closes at on this date in "%H:%M" format.
     * <p>
     * 
     * 
     */
    public LocalTime getClose() {
        return close;
    }

    /**
     * The time the market closes at on this date in "%H:%M" format.
     * <p>
     * 
     * 
     */
    public void setClose(LocalTime close) {
        this.close = close;
    }

    public Calendar withClose(LocalTime close) {
        this.close = close;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Calendar.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("open");
        sb.append('=');
        sb.append(((this.open == null)?"<null>":this.open));
        sb.append(',');
        sb.append("close");
        sb.append('=');
        sb.append(((this.close == null)?"<null>":this.close));
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
        result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
        result = ((result* 31)+((this.close == null)? 0 :this.close.hashCode()));
        result = ((result* 31)+((this.open == null)? 0 :this.open.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Calendar) == false) {
            return false;
        }
        Calendar rhs = ((Calendar) other);
        return ((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.close == rhs.close)||((this.close!= null)&&this.close.equals(rhs.close))))&&((this.open == rhs.open)||((this.open!= null)&&this.open.equals(rhs.open))));
    }

}
