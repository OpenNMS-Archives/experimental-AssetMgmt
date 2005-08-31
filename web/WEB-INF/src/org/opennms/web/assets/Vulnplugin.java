package org.opennms.web.assets;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class Vulnplugin implements Serializable {

    /** identifier field */
    private org.opennms.web.assets.VulnpluginPK comp_id;

    /** nullable persistent field */
    private java.lang.String name;

    /** nullable persistent field */
    private java.lang.String category;

    /** nullable persistent field */
    private java.lang.String copyright;

    /** nullable persistent field */
    private java.lang.String descr;

    /** nullable persistent field */
    private java.lang.String summary;

    /** nullable persistent field */
    private java.lang.String family;

    /** nullable persistent field */
    private java.lang.String version;

    /** nullable persistent field */
    private java.lang.String cveentry;

    /** nullable persistent field */
    private java.lang.String md5;

    /** full constructor */
    public Vulnplugin(org.opennms.web.assets.VulnpluginPK comp_id, java.lang.String name, java.lang.String category, java.lang.String copyright, java.lang.String descr, java.lang.String summary, java.lang.String family, java.lang.String version, java.lang.String cveentry, java.lang.String md5) {
        this.comp_id = comp_id;
        this.name = name;
        this.category = category;
        this.copyright = copyright;
        this.descr = descr;
        this.summary = summary;
        this.family = family;
        this.version = version;
        this.cveentry = cveentry;
        this.md5 = md5;
    }

    /** default constructor */
    public Vulnplugin() {
    }

    /** minimal constructor */
    public Vulnplugin(org.opennms.web.assets.VulnpluginPK comp_id) {
        this.comp_id = comp_id;
    }

    public org.opennms.web.assets.VulnpluginPK getComp_id() {
        return this.comp_id;
    }

    public void setComp_id(org.opennms.web.assets.VulnpluginPK comp_id) {
        this.comp_id = comp_id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getCategory() {
        return this.category;
    }

    public void setCategory(java.lang.String category) {
        this.category = category;
    }

    public java.lang.String getCopyright() {
        return this.copyright;
    }

    public void setCopyright(java.lang.String copyright) {
        this.copyright = copyright;
    }

    public java.lang.String getDescr() {
        return this.descr;
    }

    public void setDescr(java.lang.String descr) {
        this.descr = descr;
    }

    public java.lang.String getSummary() {
        return this.summary;
    }

    public void setSummary(java.lang.String summary) {
        this.summary = summary;
    }

    public java.lang.String getFamily() {
        return this.family;
    }

    public void setFamily(java.lang.String family) {
        this.family = family;
    }

    public java.lang.String getVersion() {
        return this.version;
    }

    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    public java.lang.String getCveentry() {
        return this.cveentry;
    }

    public void setCveentry(java.lang.String cveentry) {
        this.cveentry = cveentry;
    }

    public java.lang.String getMd5() {
        return this.md5;
    }

    public void setMd5(java.lang.String md5) {
        this.md5 = md5;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("comp_id", getComp_id())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof Vulnplugin) ) return false;
        Vulnplugin castOther = (Vulnplugin) other;
        return new EqualsBuilder()
            .append(this.getComp_id(), castOther.getComp_id())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getComp_id())
            .toHashCode();
    }

}
