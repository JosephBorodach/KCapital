
package net.jacobpeterson.alpaca.model.endpoint.assets;

import java.io.Serializable;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import net.jacobpeterson.alpaca.model.endpoint.assets.enums.AssetClass;
import net.jacobpeterson.alpaca.model.endpoint.assets.enums.AssetStatus;


/**
 * See <a href="https://alpaca.markets/docs/api-documentation/api-v2/assets/">Assets</a>.
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public class Asset implements Serializable
{

    /**
     * Asset ID.
     * <p>
     * 
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.assets.enums.AssetClass}.
     * <p>
     * 
     * Corresponds to the "class" property.
     * 
     */
    @SerializedName("class")
    @Expose
    private AssetClass assetClass;
    /**
     * AMEX, ARCA, BATS, NYSE, NASDAQ or NYSEARCA.
     * <p>
     * 
     * 
     */
    @SerializedName("exchange")
    @Expose
    private String exchange;
    /**
     * The symbol.
     * <p>
     * 
     * 
     */
    @SerializedName("symbol")
    @Expose
    private String symbol;
    /**
     * The official name of the asset.
     * <p>
     * 
     * 
     */
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.assets.enums.AssetStatus}.
     * <p>
     * 
     * 
     */
    @SerializedName("status")
    @Expose
    private AssetStatus status;
    /**
     * Asset is tradable on Alpaca or not.
     * <p>
     * 
     * 
     */
    @SerializedName("tradable")
    @Expose
    private Boolean tradable;
    /**
     * Asset is marginable or not.
     * <p>
     * 
     * 
     */
    @SerializedName("marginable")
    @Expose
    private Boolean marginable;
    /**
     * Asset is shortable or not.
     * <p>
     * 
     * 
     */
    @SerializedName("shortable")
    @Expose
    private Boolean shortable;
    /**
     * Asset is easy-to-borrow or not (filtering for easy_to_borrow = True is the best way to check whether the name is currently available to short at Alpaca).
     * <p>
     * 
     * 
     */
    @SerializedName("easy_to_borrow")
    @Expose
    private Boolean easyToBorrow;
    /**
     * Asset is fractionable or not.
     * <p>
     * 
     * 
     */
    @SerializedName("fractionable")
    @Expose
    private Boolean fractionable;
    private final static long serialVersionUID = 2017457879466049854L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Asset() {
    }

    /**
     * 
     * @param source
     */
    public Asset(Asset source) {
        super();
        this.id = source.id;
        this.assetClass = source.assetClass;
        this.exchange = source.exchange;
        this.symbol = source.symbol;
        this.name = source.name;
        this.status = source.status;
        this.tradable = source.tradable;
        this.marginable = source.marginable;
        this.shortable = source.shortable;
        this.easyToBorrow = source.easyToBorrow;
        this.fractionable = source.fractionable;
    }

    /**
     * 
     * @param symbol
     * @param shortable
     * @param name
     * @param tradable
     * @param exchange
     * @param fractionable
     * @param id
     * @param assetClass
     * @param marginable
     * @param easyToBorrow
     * @param status
     */
    public Asset(String id, AssetClass assetClass, String exchange, String symbol, String name, AssetStatus status, Boolean tradable, Boolean marginable, Boolean shortable, Boolean easyToBorrow, Boolean fractionable) {
        super();
        this.id = id;
        this.assetClass = assetClass;
        this.exchange = exchange;
        this.symbol = symbol;
        this.name = name;
        this.status = status;
        this.tradable = tradable;
        this.marginable = marginable;
        this.shortable = shortable;
        this.easyToBorrow = easyToBorrow;
        this.fractionable = fractionable;
    }

    /**
     * Asset ID.
     * <p>
     * 
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * Asset ID.
     * <p>
     * 
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    public Asset withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.assets.enums.AssetClass}.
     * <p>
     * 
     * Corresponds to the "class" property.
     * 
     */
    public AssetClass getAssetClass() {
        return assetClass;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.assets.enums.AssetClass}.
     * <p>
     * 
     * Corresponds to the "class" property.
     * 
     */
    public void setAssetClass(AssetClass assetClass) {
        this.assetClass = assetClass;
    }

    public Asset withAssetClass(AssetClass assetClass) {
        this.assetClass = assetClass;
        return this;
    }

    /**
     * AMEX, ARCA, BATS, NYSE, NASDAQ or NYSEARCA.
     * <p>
     * 
     * 
     */
    public String getExchange() {
        return exchange;
    }

    /**
     * AMEX, ARCA, BATS, NYSE, NASDAQ or NYSEARCA.
     * <p>
     * 
     * 
     */
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public Asset withExchange(String exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * The symbol.
     * <p>
     * 
     * 
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * The symbol.
     * <p>
     * 
     * 
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Asset withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * The official name of the asset.
     * <p>
     * 
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * The official name of the asset.
     * <p>
     * 
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    public Asset withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.assets.enums.AssetStatus}.
     * <p>
     * 
     * 
     */
    public AssetStatus getStatus() {
        return status;
    }

    /**
     * The {@link net.jacobpeterson.alpaca.model.endpoint.assets.enums.AssetStatus}.
     * <p>
     * 
     * 
     */
    public void setStatus(AssetStatus status) {
        this.status = status;
    }

    public Asset withStatus(AssetStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Asset is tradable on Alpaca or not.
     * <p>
     * 
     * 
     */
    public Boolean getTradable() {
        return tradable;
    }

    /**
     * Asset is tradable on Alpaca or not.
     * <p>
     * 
     * 
     */
    public void setTradable(Boolean tradable) {
        this.tradable = tradable;
    }

    public Asset withTradable(Boolean tradable) {
        this.tradable = tradable;
        return this;
    }

    /**
     * Asset is marginable or not.
     * <p>
     * 
     * 
     */
    public Boolean getMarginable() {
        return marginable;
    }

    /**
     * Asset is marginable or not.
     * <p>
     * 
     * 
     */
    public void setMarginable(Boolean marginable) {
        this.marginable = marginable;
    }

    public Asset withMarginable(Boolean marginable) {
        this.marginable = marginable;
        return this;
    }

    /**
     * Asset is shortable or not.
     * <p>
     * 
     * 
     */
    public Boolean getShortable() {
        return shortable;
    }

    /**
     * Asset is shortable or not.
     * <p>
     * 
     * 
     */
    public void setShortable(Boolean shortable) {
        this.shortable = shortable;
    }

    public Asset withShortable(Boolean shortable) {
        this.shortable = shortable;
        return this;
    }

    /**
     * Asset is easy-to-borrow or not (filtering for easy_to_borrow = True is the best way to check whether the name is currently available to short at Alpaca).
     * <p>
     * 
     * 
     */
    public Boolean getEasyToBorrow() {
        return easyToBorrow;
    }

    /**
     * Asset is easy-to-borrow or not (filtering for easy_to_borrow = True is the best way to check whether the name is currently available to short at Alpaca).
     * <p>
     * 
     * 
     */
    public void setEasyToBorrow(Boolean easyToBorrow) {
        this.easyToBorrow = easyToBorrow;
    }

    public Asset withEasyToBorrow(Boolean easyToBorrow) {
        this.easyToBorrow = easyToBorrow;
        return this;
    }

    /**
     * Asset is fractionable or not.
     * <p>
     * 
     * 
     */
    public Boolean getFractionable() {
        return fractionable;
    }

    /**
     * Asset is fractionable or not.
     * <p>
     * 
     * 
     */
    public void setFractionable(Boolean fractionable) {
        this.fractionable = fractionable;
    }

    public Asset withFractionable(Boolean fractionable) {
        this.fractionable = fractionable;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Asset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("assetClass");
        sb.append('=');
        sb.append(((this.assetClass == null)?"<null>":this.assetClass));
        sb.append(',');
        sb.append("exchange");
        sb.append('=');
        sb.append(((this.exchange == null)?"<null>":this.exchange));
        sb.append(',');
        sb.append("symbol");
        sb.append('=');
        sb.append(((this.symbol == null)?"<null>":this.symbol));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("tradable");
        sb.append('=');
        sb.append(((this.tradable == null)?"<null>":this.tradable));
        sb.append(',');
        sb.append("marginable");
        sb.append('=');
        sb.append(((this.marginable == null)?"<null>":this.marginable));
        sb.append(',');
        sb.append("shortable");
        sb.append('=');
        sb.append(((this.shortable == null)?"<null>":this.shortable));
        sb.append(',');
        sb.append("easyToBorrow");
        sb.append('=');
        sb.append(((this.easyToBorrow == null)?"<null>":this.easyToBorrow));
        sb.append(',');
        sb.append("fractionable");
        sb.append('=');
        sb.append(((this.fractionable == null)?"<null>":this.fractionable));
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
        result = ((result* 31)+((this.symbol == null)? 0 :this.symbol.hashCode()));
        result = ((result* 31)+((this.shortable == null)? 0 :this.shortable.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.tradable == null)? 0 :this.tradable.hashCode()));
        result = ((result* 31)+((this.exchange == null)? 0 :this.exchange.hashCode()));
        result = ((result* 31)+((this.fractionable == null)? 0 :this.fractionable.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.assetClass == null)? 0 :this.assetClass.hashCode()));
        result = ((result* 31)+((this.marginable == null)? 0 :this.marginable.hashCode()));
        result = ((result* 31)+((this.easyToBorrow == null)? 0 :this.easyToBorrow.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Asset) == false) {
            return false;
        }
        Asset rhs = ((Asset) other);
        return ((((((((((((this.symbol == rhs.symbol)||((this.symbol!= null)&&this.symbol.equals(rhs.symbol)))&&((this.shortable == rhs.shortable)||((this.shortable!= null)&&this.shortable.equals(rhs.shortable))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.tradable == rhs.tradable)||((this.tradable!= null)&&this.tradable.equals(rhs.tradable))))&&((this.exchange == rhs.exchange)||((this.exchange!= null)&&this.exchange.equals(rhs.exchange))))&&((this.fractionable == rhs.fractionable)||((this.fractionable!= null)&&this.fractionable.equals(rhs.fractionable))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.assetClass == rhs.assetClass)||((this.assetClass!= null)&&this.assetClass.equals(rhs.assetClass))))&&((this.marginable == rhs.marginable)||((this.marginable!= null)&&this.marginable.equals(rhs.marginable))))&&((this.easyToBorrow == rhs.easyToBorrow)||((this.easyToBorrow!= null)&&this.easyToBorrow.equals(rhs.easyToBorrow))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
