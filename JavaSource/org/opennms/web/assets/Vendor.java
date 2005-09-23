package org.opennms.web.assets;

import java.io.Serializable;
import java.util.Set;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class Vendor extends AssetSelector implements Named, Serializable {

    public static final String TYPE_NAME = "Vendor";
    /** identifier field */
    private java.lang.Integer id;

    /** persistent field */
    private java.lang.String name;

    /** persistent field */
    private java.lang.String vendorPhone;

    /** persistent field */
    private java.lang.String vendorFax;

    /** persistent field */
    private java.lang.String vendorAssetNumber;

    /** persistent field */
    private Set assets;

    /** full constructor */
    public Vendor(java.lang.String vendor, Set assets) {
        this();
        this.name = vendor;
        this.assets = assets;
    }

    /** default constructor */
    public Vendor() {
        super(Vendor.TYPE_NAME, "vendor");
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

    public void setName(java.lang.String vendor) {
        this.name = vendor;
    }

	/**
	 * @return Returns the vendorAssetNumber.
	 */
	public java.lang.String getVendorAssetNumber() {
		return vendorAssetNumber;
	}
	/**
	 * @param vendorAssetNumber The vendorAssetNumber to set.
	 */
	public void setVendorAssetNumber(java.lang.String vendorAssetNumber) {
		this.vendorAssetNumber = vendorAssetNumber;
	}
	
	/**
	 * @return Returns the vendorFax.
	 */
	public java.lang.String getVendorFax() {
		return vendorFax;
	}
	
	/**
	 * @param vendorFax The vendorFax to set.
	 */
	public void setVendorFax(java.lang.String vendorFax) {
		this.vendorFax = vendorFax;
	}
	
	/**
	 * @param vendorPhone The vendorPhone to set.
	 */
	public void setVendorPhone(java.lang.String vendorPhone) {
		this.vendorPhone = vendorPhone;
	}
	
    public java.lang.String getVendorPhone() {
        return this.vendorPhone;
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
        if ( !(other instanceof Vendor) ) return false;
        Vendor castOther = (Vendor) other;
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
