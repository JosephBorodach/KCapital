
package net.jacobpeterson.alpaca.model.endpoint.streaming;

import java.io.Serializable;
import javax.annotation.processing.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.streaming.enums.StreamingMessageType;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/streaming/">Streaming</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class StreamingMessage implements Serializable
{

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.streaming.enums.StreamingMessageType}.
     * <p>
     * 
     * 
     */
    @SerializedName("stream")
    @Expose
    private StreamingMessageType stream;
    private final static long serialVersionUID = 4249798787417920877L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StreamingMessage() {
    }

    /**
     * 
     * @param source
     */
    public StreamingMessage(StreamingMessage source) {
        super();
        this.stream = source.stream;
    }

    /**
     * 
     * @param stream
     */
    public StreamingMessage(StreamingMessageType stream) {
        super();
        this.stream = stream;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.streaming.enums.StreamingMessageType}.
     * <p>
     * 
     * 
     */
    public StreamingMessageType getStream() {
        return stream;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.streaming.enums.StreamingMessageType}.
     * <p>
     * 
     * 
     */
    public void setStream(StreamingMessageType stream) {
        this.stream = stream;
    }

    public StreamingMessage withStream(StreamingMessageType stream) {
        this.stream = stream;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StreamingMessage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("stream");
        sb.append('=');
        sb.append(((this.stream == null)?"<null>":this.stream));
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
        result = ((result* 31)+((this.stream == null)? 0 :this.stream.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StreamingMessage) == false) {
            return false;
        }
        StreamingMessage rhs = ((StreamingMessage) other);
        return ((this.stream == rhs.stream)||((this.stream!= null)&&this.stream.equals(rhs.stream)));
    }

}
