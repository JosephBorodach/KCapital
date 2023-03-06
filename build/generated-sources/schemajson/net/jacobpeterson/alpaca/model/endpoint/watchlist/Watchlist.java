
package net.jacobpeterson.alpaca.model.endpoint.watchlist;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.assets.Asset;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/watchlist/">Watchlist</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Watchlist implements Serializable
{

    /**
     * Watchlist ID.
     * <p>
     * 
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    /**
     * Created at.
     * <p>
     * 
     * 
     */
    @SerializedName("created_at")
    @Expose
    private ZonedDateTime createdAt;
    /**
     * Updated at.
     * <p>
     * 
     * 
     */
    @SerializedName("updated_at")
    @Expose
    private ZonedDateTime updatedAt;
    /**
     * User-defined watchlist name (up to 64 characters).
     * <p>
     * 
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * Account ID.
     * <p>
     * 
     * 
     */
    @SerializedName("account_id")
    @Expose
    private String accountId;
    /**
     * The content of this watchlist, in the order as registered by the client.
     * <p>
     * 
     * 
     */
    @SerializedName("assets")
    @Expose
    private ArrayList<Asset> assets;
    private final static long serialVersionUID = 1990851656449593589L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Watchlist() {
    }

    /**
     * 
     * @param source
     */
    public Watchlist(Watchlist source) {
        super();
        this.id = source.id;
        this.createdAt = source.createdAt;
        this.updatedAt = source.updatedAt;
        this.name = source.name;
        this.accountId = source.accountId;
        this.assets = source.assets;
    }

    /**
     * 
     * @param createdAt
     * @param accountId
     * @param assets
     * @param name
     * @param id
     * @param updatedAt
     */
    public Watchlist(String id, ZonedDateTime createdAt, ZonedDateTime updatedAt, String name, String accountId, ArrayList<Asset> assets) {
        super();
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.name = name;
        this.accountId = accountId;
        this.assets = assets;
    }

    /**
     * Watchlist ID.
     * <p>
     * 
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * Watchlist ID.
     * <p>
     * 
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    public Watchlist withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Created at.
     * <p>
     * 
     * 
     */
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Created at.
     * <p>
     * 
     * 
     */
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Watchlist withCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Updated at.
     * <p>
     * 
     * 
     */
    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Updated at.
     * <p>
     * 
     * 
     */
    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Watchlist withUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * User-defined watchlist name (up to 64 characters).
     * <p>
     * 
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * User-defined watchlist name (up to 64 characters).
     * <p>
     * 
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    public Watchlist withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Account ID.
     * <p>
     * 
     * 
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * Account ID.
     * <p>
     * 
     * 
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Watchlist withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * The content of this watchlist, in the order as registered by the client.
     * <p>
     * 
     * 
     */
    public ArrayList<Asset> getAssets() {
        return assets;
    }

    /**
     * The content of this watchlist, in the order as registered by the client.
     * <p>
     * 
     * 
     */
    public void setAssets(ArrayList<Asset> assets) {
        this.assets = assets;
    }

    public Watchlist withAssets(ArrayList<Asset> assets) {
        this.assets = assets;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Watchlist.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("accountId");
        sb.append('=');
        sb.append(((this.accountId == null)?"<null>":this.accountId));
        sb.append(',');
        sb.append("assets");
        sb.append('=');
        sb.append(((this.assets == null)?"<null>":this.assets));
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
        result = ((result* 31)+((this.createdAt == null)? 0 :this.createdAt.hashCode()));
        result = ((result* 31)+((this.accountId == null)? 0 :this.accountId.hashCode()));
        result = ((result* 31)+((this.assets == null)? 0 :this.assets.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.updatedAt == null)? 0 :this.updatedAt.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Watchlist) == false) {
            return false;
        }
        Watchlist rhs = ((Watchlist) other);
        return (((((((this.createdAt == rhs.createdAt)||((this.createdAt!= null)&&this.createdAt.equals(rhs.createdAt)))&&((this.accountId == rhs.accountId)||((this.accountId!= null)&&this.accountId.equals(rhs.accountId))))&&((this.assets == rhs.assets)||((this.assets!= null)&&this.assets.equals(rhs.assets))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.updatedAt == rhs.updatedAt)||((this.updatedAt!= null)&&this.updatedAt.equals(rhs.updatedAt))));
    }

}
