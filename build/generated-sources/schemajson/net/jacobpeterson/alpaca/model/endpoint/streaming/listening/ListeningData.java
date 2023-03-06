
package net.jacobpeterson.alpaca.model.endpoint.streaming.listening;

import java.io.Serializable;
import java.util.ArrayList;
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
public class ListeningData implements Serializable
{

    /**
     * The {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.streaming.enums.StreamingMessageType}s.
     * <p>
     * 
     * 
     */
    @SerializedName("streams")
    @Expose
    private ArrayList<StreamingMessageType> streams;
    private final static long serialVersionUID = -2332120193651380547L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ListeningData() {
    }

    /**
     * 
     * @param source
     */
    public ListeningData(ListeningData source) {
        super();
        this.streams = source.streams;
    }

    /**
     * 
     * @param streams
     */
    public ListeningData(ArrayList<StreamingMessageType> streams) {
        super();
        this.streams = streams;
    }

    /**
     * The {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.streaming.enums.StreamingMessageType}s.
     * <p>
     * 
     * 
     */
    public ArrayList<StreamingMessageType> getStreams() {
        return streams;
    }

    /**
     * The {@link java.util.ArrayList} of {@link net.jacobpeterson.alpaca.model.endpoint.streaming.enums.StreamingMessageType}s.
     * <p>
     * 
     * 
     */
    public void setStreams(ArrayList<StreamingMessageType> streams) {
        this.streams = streams;
    }

    public ListeningData withStreams(ArrayList<StreamingMessageType> streams) {
        this.streams = streams;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ListeningData.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("streams");
        sb.append('=');
        sb.append(((this.streams == null)?"<null>":this.streams));
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
        result = ((result* 31)+((this.streams == null)? 0 :this.streams.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ListeningData) == false) {
            return false;
        }
        ListeningData rhs = ((ListeningData) other);
        return ((this.streams == rhs.streams)||((this.streams!= null)&&this.streams.equals(rhs.streams)));
    }

}
