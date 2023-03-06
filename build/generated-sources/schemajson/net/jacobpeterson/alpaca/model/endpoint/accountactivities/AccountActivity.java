
package net.jacobpeterson.alpaca.model.endpoint.accountactivities;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.ActivityType;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/account-activities/">Account Activities</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class AccountActivity implements Serializable
{

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.ActivityType}.
     * <p>
     * 
     * 
     */
    @SerializedName("activity_type")
    @Expose
    private ActivityType activityType;
    /**
     * An ID for the activity, always in "::" format. Can be sent as page_token in requests to facilitate the paging of results.
     * <p>
     * 
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    private final static long serialVersionUID = 5643846236759247458L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AccountActivity() {
    }

    /**
     * 
     * @param source
     */
    public AccountActivity(AccountActivity source) {
        super();
        this.activityType = source.activityType;
        this.id = source.id;
    }

    /**
     * 
     * @param id
     * @param activityType
     */
    public AccountActivity(ActivityType activityType, String id) {
        super();
        this.activityType = activityType;
        this.id = id;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.ActivityType}.
     * <p>
     * 
     * 
     */
    public ActivityType getActivityType() {
        return activityType;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.accountactivities.enums.ActivityType}.
     * <p>
     * 
     * 
     */
    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    public AccountActivity withActivityType(ActivityType activityType) {
        this.activityType = activityType;
        return this;
    }

    /**
     * An ID for the activity, always in "::" format. Can be sent as page_token in requests to facilitate the paging of results.
     * <p>
     * 
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * An ID for the activity, always in "::" format. Can be sent as page_token in requests to facilitate the paging of results.
     * <p>
     * 
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    public AccountActivity withId(String id) {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountActivity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("activityType");
        sb.append('=');
        sb.append(((this.activityType == null)?"<null>":this.activityType));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
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
        result = ((result* 31)+((this.activityType == null)? 0 :this.activityType.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccountActivity) == false) {
            return false;
        }
        AccountActivity rhs = ((AccountActivity) other);
        return (((this.activityType == rhs.activityType)||((this.activityType!= null)&&this.activityType.equals(rhs.activityType)))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))));
    }

}
