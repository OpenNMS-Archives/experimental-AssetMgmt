package org.opennms.web.assets;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class Ifservic implements Serializable {

    /** identifier field */
    private java.lang.String ipaddr;

    /** identifier field */
    private int ifindex;

    /** identifier field */
    private java.util.Date lastgood;

    /** identifier field */
    private java.util.Date lastfail;

    /** identifier field */
    private java.lang.String qualifier;

    /** identifier field */
    private java.lang.String status;

    /** identifier field */
    private java.lang.String source;

    /** identifier field */
    private java.lang.String notify;

    /** persistent field */
    private org.opennms.web.assets.Node node;

    /** persistent field */
    private org.opennms.web.assets.Service service;

    /** full constructor */
    public Ifservic(java.lang.String ipaddr, int ifindex, java.util.Date lastgood, java.util.Date lastfail, java.lang.String qualifier, java.lang.String status, java.lang.String source, java.lang.String notify, org.opennms.web.assets.Node node, org.opennms.web.assets.Service service) {
        this.ipaddr = ipaddr;
        this.ifindex = ifindex;
        this.lastgood = lastgood;
        this.lastfail = lastfail;
        this.qualifier = qualifier;
        this.status = status;
        this.source = source;
        this.notify = notify;
        this.node = node;
        this.service = service;
    }

    /** default constructor */
    public Ifservic() {
    }

    public java.lang.String getIpaddr() {
        return this.ipaddr;
    }

    public void setIpaddr(java.lang.String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public int getIfindex() {
        return this.ifindex;
    }

    public void setIfindex(int ifindex) {
        this.ifindex = ifindex;
    }

    public java.util.Date getLastgood() {
        return this.lastgood;
    }

    public void setLastgood(java.util.Date lastgood) {
        this.lastgood = lastgood;
    }

    public java.util.Date getLastfail() {
        return this.lastfail;
    }

    public void setLastfail(java.util.Date lastfail) {
        this.lastfail = lastfail;
    }

    public java.lang.String getQualifier() {
        return this.qualifier;
    }

    public void setQualifier(java.lang.String qualifier) {
        this.qualifier = qualifier;
    }

    public java.lang.String getStatus() {
        return this.status;
    }

    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    public java.lang.String getSource() {
        return this.source;
    }

    public void setSource(java.lang.String source) {
        this.source = source;
    }

    public java.lang.String getNotify() {
        return this.notify;
    }

    public void setNotify(java.lang.String notify) {
        this.notify = notify;
    }

    public org.opennms.web.assets.Node getNode() {
        return this.node;
    }

    public void setNode(org.opennms.web.assets.Node node) {
        this.node = node;
    }

    public org.opennms.web.assets.Service getService() {
        return this.service;
    }

    public void setService(org.opennms.web.assets.Service service) {
        this.service = service;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("ipaddr", getIpaddr())
            .append("ifindex", getIfindex())
            .append("lastgood", getLastgood())
            .append("lastfail", getLastfail())
            .append("qualifier", getQualifier())
            .append("status", getStatus())
            .append("source", getSource())
            .append("notify", getNotify())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof Ifservic) ) return false;
        Ifservic castOther = (Ifservic) other;
        return new EqualsBuilder()
            .append(this.getIpaddr(), castOther.getIpaddr())
            .append(this.getIfindex(), castOther.getIfindex())
            .append(this.getLastgood(), castOther.getLastgood())
            .append(this.getLastfail(), castOther.getLastfail())
            .append(this.getQualifier(), castOther.getQualifier())
            .append(this.getStatus(), castOther.getStatus())
            .append(this.getSource(), castOther.getSource())
            .append(this.getNotify(), castOther.getNotify())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getIpaddr())
            .append(getIfindex())
            .append(getLastgood())
            .append(getLastfail())
            .append(getQualifier())
            .append(getStatus())
            .append(getSource())
            .append(getNotify())
            .toHashCode();
    }

}
