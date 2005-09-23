package org.opennms.web.assets;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class Ipinterface implements Serializable {

    /** identifier field */
    private java.lang.String ipaddr;

    /** identifier field */
    private int ifindex;

    /** identifier field */
    private java.lang.String iphostname;

    /** identifier field */
    private java.lang.String ismanaged;

    /** identifier field */
    private int ipstatus;

    /** identifier field */
    private java.util.Date iplastcapsdpoll;

    /** identifier field */
    private java.lang.String issnmpprimary;

    /** persistent field */
    private org.opennms.web.assets.Node node;

    /** full constructor */
    public Ipinterface(java.lang.String ipaddr, int ifindex, java.lang.String iphostname, java.lang.String ismanaged, int ipstatus, java.util.Date iplastcapsdpoll, java.lang.String issnmpprimary, org.opennms.web.assets.Node node) {
        this.ipaddr = ipaddr;
        this.ifindex = ifindex;
        this.iphostname = iphostname;
        this.ismanaged = ismanaged;
        this.ipstatus = ipstatus;
        this.iplastcapsdpoll = iplastcapsdpoll;
        this.issnmpprimary = issnmpprimary;
        this.node = node;
    }

    /** default constructor */
    public Ipinterface() {
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

    public java.lang.String getIphostname() {
        return this.iphostname;
    }

    public void setIphostname(java.lang.String iphostname) {
        this.iphostname = iphostname;
    }

    public java.lang.String getIsmanaged() {
        return this.ismanaged;
    }

    public void setIsmanaged(java.lang.String ismanaged) {
        this.ismanaged = ismanaged;
    }

    public int getIpstatus() {
        return this.ipstatus;
    }

    public void setIpstatus(int ipstatus) {
        this.ipstatus = ipstatus;
    }

    public java.util.Date getIplastcapsdpoll() {
        return this.iplastcapsdpoll;
    }

    public void setIplastcapsdpoll(java.util.Date iplastcapsdpoll) {
        this.iplastcapsdpoll = iplastcapsdpoll;
    }

    public java.lang.String getIssnmpprimary() {
        return this.issnmpprimary;
    }

    public void setIssnmpprimary(java.lang.String issnmpprimary) {
        this.issnmpprimary = issnmpprimary;
    }

    public org.opennms.web.assets.Node getNode() {
        return this.node;
    }

    public void setNode(org.opennms.web.assets.Node node) {
        this.node = node;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("ipaddr", getIpaddr())
            .append("ifindex", getIfindex())
            .append("iphostname", getIphostname())
            .append("ismanaged", getIsmanaged())
            .append("ipstatus", getIpstatus())
            .append("iplastcapsdpoll", getIplastcapsdpoll())
            .append("issnmpprimary", getIssnmpprimary())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof Ipinterface) ) return false;
        Ipinterface castOther = (Ipinterface) other;
        return new EqualsBuilder()
            .append(this.getIpaddr(), castOther.getIpaddr())
            .append(this.getIfindex(), castOther.getIfindex())
            .append(this.getIphostname(), castOther.getIphostname())
            .append(this.getIsmanaged(), castOther.getIsmanaged())
            .append(this.getIpstatus(), castOther.getIpstatus())
            .append(this.getIplastcapsdpoll(), castOther.getIplastcapsdpoll())
            .append(this.getIssnmpprimary(), castOther.getIssnmpprimary())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getIpaddr())
            .append(getIfindex())
            .append(getIphostname())
            .append(getIsmanaged())
            .append(getIpstatus())
            .append(getIplastcapsdpoll())
            .append(getIssnmpprimary())
            .toHashCode();
    }

}
