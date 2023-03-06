
package net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.enums.MarketDataMessageType;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/">Market Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class MarketDataMessage implements Serializable
{

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.enums.MarketDataMessageType}.
     * <p>
     * 
     * Corresponds to the "T" property.
     * 
     */
    @SerializedName("T")
    @Expose
    private MarketDataMessageType messageType;
    private final static long serialVersionUID = -3340964029858423759L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MarketDataMessage() {
    }

    /**
     * 
     * @param source
     */
    public MarketDataMessage(MarketDataMessage source) {
        super();
        this.messageType = source.messageType;
    }

    /**
     * 
     * @param messageType
     */
    public MarketDataMessage(MarketDataMessageType messageType) {
        super();
        this.messageType = messageType;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.enums.MarketDataMessageType}.
     * <p>
     * 
     * Corresponds to the "T" property.
     * 
     */
    public MarketDataMessageType getMessageType() {
        return messageType;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.enums.MarketDataMessageType}.
     * <p>
     * 
     * Corresponds to the "T" property.
     * 
     */
    public void setMessageType(MarketDataMessageType messageType) {
        this.messageType = messageType;
    }

    public MarketDataMessage withMessageType(MarketDataMessageType messageType) {
        this.messageType = messageType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MarketDataMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("messageType");
        sb.append('=');
        sb.append(((this.messageType == null)?"<null>":this.messageType));
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
        result = ((result* 31)+((this.messageType == null)? 0 :this.messageType.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MarketDataMessage) == false) {
            return false;
        }
        MarketDataMessage rhs = ((MarketDataMessage) other);
        return ((this.messageType == rhs.messageType)||((this.messageType!= null)&&this.messageType.equals(rhs.messageType)));
    }

}
