package org.opennms.web.assets;

import java.io.Serializable;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class Manufacturer extends AssetSelector implements Named, Serializable {

    public static final String TYPE_NAME = "Manufacturer";
    /** identifier field */
    private java.lang.Integer id;

    /** persistent field */
    private java.lang.String name;

    /** persistent field */
    private Set assets;

    /** full constructor */
    public Manufacturer(java.lang.String manufacturer, Set assets) {
        this();
        this.name = manufacturer;
        this.assets = assets;
    }

    /** default constructor */
    public Manufacturer() {
        super(Manufacturer.TYPE_NAME, "manufacturer");
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

    public void setName(java.lang.String manufacturer) {
        this.name = manufacturer;
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
        if ( !(other instanceof Manufacturer) ) return false;
        Manufacturer castOther = (Manufacturer) other;
        return new EqualsBuilder().append(this.getId(), castOther.getId()).isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(getId()).toHashCode();
    }
    

}
