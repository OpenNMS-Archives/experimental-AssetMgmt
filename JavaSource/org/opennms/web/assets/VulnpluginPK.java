package org.opennms.web.assets;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class VulnpluginPK implements Serializable {

    /** identifier field */
    private int pluginid;

    /** identifier field */
    private int pluginsubid;

    /** full constructor */
    public VulnpluginPK(int pluginid, int pluginsubid) {
        this.pluginid = pluginid;
        this.pluginsubid = pluginsubid;
    }

    /** default constructor */
    public VulnpluginPK() {
    }

    public int getPluginid() {
        return this.pluginid;
    }

    public void setPluginid(int pluginid) {
        this.pluginid = pluginid;
    }

    public int getPluginsubid() {
        return this.pluginsubid;
    }

    public void setPluginsubid(int pluginsubid) {
        this.pluginsubid = pluginsubid;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("pluginid", getPluginid())
            .append("pluginsubid", getPluginsubid())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof VulnpluginPK) ) return false;
        VulnpluginPK castOther = (VulnpluginPK) other;
        return new EqualsBuilder()
            .append(this.getPluginid(), castOther.getPluginid())
            .append(this.getPluginsubid(), castOther.getPluginsubid())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getPluginid())
            .append(getPluginsubid())
            .toHashCode();
    }

}
