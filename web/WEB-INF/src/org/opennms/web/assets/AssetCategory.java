package org.opennms.web.assets;

import java.io.Serializable;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class AssetCategory extends AssetSelector implements Named, Serializable {

    public static final String TYPE_NAME = "Category";
    /** identifier field */
    private java.lang.Integer id;

    /** persistent field */
    private java.lang.String name;

    /** persistent field */
    private Set assets;

    /** full constructor */
    public AssetCategory(java.lang.String category, Set assets) {
        this();
        this.name = category;
        this.assets = assets;
    }

    /** default constructor */
    public AssetCategory() {
        super(AssetCategory.TYPE_NAME, "assetCategory");
    }

    public java.lang.Integer getId() {
        return this.id;
    }

    public void setId(java.lang.Integer id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String category) {
        this.name = category;
    }

    public java.util.Set getAssets() {
        return this.assets;
    }

    public void setAssets(java.util.Set assets) {
        this.assets = assets;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("id", getId())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof AssetCategory) ) return false;
        AssetCategory castOther = (AssetCategory) other;
        return new EqualsBuilder()
            .append(this.getId(), castOther.getId())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getId())
            .toHashCode();
    }
}
