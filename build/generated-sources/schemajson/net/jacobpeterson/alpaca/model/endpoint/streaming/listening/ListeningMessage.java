
package net.jacobpeterson.alpaca.model.endpoint.streaming.listening;

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
public class ListeningMessage
    extends StreamingMessage
    implements Serializable
{

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.streaming.listening.ListeningData}.
     * <p>
     * 
     * 
     */
    @SerializedName("data")
    @Expose
    private ListeningData data;
    private final static long serialVersionUID = -37236763591260522L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListeningMessage() {
    }

    /**
     * 
     * @param source
     */
    public ListeningMessage(ListeningMessage source) {
        super();
        this.data = source.data;
    }

    /**
     * 
     * @param data
     */
    public ListeningMessage(ListeningData data) {
        super();
        this.data = data;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.streaming.listening.ListeningData}.
     * <p>
     * 
     * 
     */
    public ListeningData getData() {
        return data;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.streaming.listening.ListeningData}.
     * <p>
     * 
     * 
     */
    public void setData(ListeningData data) {
        this.data = data;
    }

    public ListeningMessage withData(ListeningData data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListeningMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof ListeningMessage) == false) {
            return false;
        }
        ListeningMessage rhs = ((ListeningMessage) other);
        return (super.equals(rhs)&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))));
    }

}
