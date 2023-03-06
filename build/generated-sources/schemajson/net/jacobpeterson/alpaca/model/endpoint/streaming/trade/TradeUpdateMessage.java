
package net.jacobpeterson.alpaca.model.endpoint.streaming.trade;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.streaming.StreamingMessage;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/streaming/">Streaming</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class TradeUpdateMessage
    extends StreamingMessage
    implements Serializable
{

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.streaming.trade.TradeUpdate}.
     * <p>
     * 
     * 
     */
    @SerializedName("data")
    @Expose
    private TradeUpdate data;
    private final static long serialVersionUID = -1995837669737342699L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TradeUpdateMessage() {
    }

    /**
     * 
     * @param source
     */
    public TradeUpdateMessage(TradeUpdateMessage source) {
        super();
        this.data = source.data;
    }

    /**
     * 
     * @param data
     */
    public TradeUpdateMessage(TradeUpdate data) {
        super();
        this.data = data;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.streaming.trade.TradeUpdate}.
     * <p>
     * 
     * 
     */
    public TradeUpdate getData() {
        return data;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.streaming.trade.TradeUpdate}.
     * <p>
     * 
     * 
     */
    public void setData(TradeUpdate data) {
        this.data = data;
    }

    public TradeUpdateMessage withData(TradeUpdate data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TradeUpdateMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        int baseLength = sb.length();
        String superString = super.toString();
        if (superString!= null) {
            int contentStart = superString.indexOf('[');
            int contentEnd = superString.lastIndexOf(']');
            if ((contentStart >= 0)&&(contentEnd >contentStart)) {
                sb.append(superString, (contentStart + 1), contentEnd);
            } else {
                sb.append(superString);
            }
        }
        if (sb.length()>baseLength) {
            sb.append(',');
        }
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
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
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradeUpdateMessage) == false) {
            return false;
        }
        TradeUpdateMessage rhs = ((TradeUpdateMessage) other);
        return (super.equals(rhs)&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))));
    }

}
