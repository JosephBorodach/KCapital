
package net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.control;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.marketdata.common.realtime.MarketDataMessage;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/market-data/">Market Data</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class SuccessMessage
    extends MarketDataMessage
    implements Serializable
{

    /**
     * The success message.
     * <p>
     * 
     * Corresponds to the "msg" property.
     * 
     */
    @SerializedName("msg")
    @Expose
    private String message;
    private final static long serialVersionUID = 5047136564340982352L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SuccessMessage() {
    }

    /**
     * 
     * @param source
     */
    public SuccessMessage(SuccessMessage source) {
        super();
        this.message = source.message;
    }

    /**
     * 
     * @param message
     */
    public SuccessMessage(String message) {
        super();
        this.message = message;
    }

    /**
     * The success message.
     * <p>
     * 
     * Corresponds to the "msg" property.
     * 
     */
    public String getMessage() {
        return message;
    }

    /**
     * The success message.
     * <p>
     * 
     * Corresponds to the "msg" property.
     * 
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public SuccessMessage withMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SuccessMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
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
        result = ((result* 31)+((this.message == null)? 0 :this.message.hashCode()));
        result = ((result* 31)+ super.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SuccessMessage) == false) {
            return false;
        }
        SuccessMessage rhs = ((SuccessMessage) other);
        return (super.equals(rhs)&&((this.message == rhs.message)||((this.message!= null)&&this.message.equals(rhs.message))));
    }

}
