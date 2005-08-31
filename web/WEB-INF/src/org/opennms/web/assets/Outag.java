package org.opennms.web.assets;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class Outag implements Serializable {

    /** identifier field */
    private java.lang.Integer outageid;

    /** persistent field */
    private java.lang.String ipaddr;

    /** persistent field */
    private java.util.Date iflostservice;

    /** nullable persistent field */
    private java.util.Date ifregainedservice;

    /** persistent field */
    private org.opennms.web.assets.Event eventBySvcregainedeventid;

    /** persistent field */
    private org.opennms.web.assets.Event eventBySvclosteventid;

    /** persistent field */
    private org.opennms.web.assets.Node node;

    /** persistent field */
    private org.opennms.web.assets.Service service;

    /** full constructor */
    public Outag(java.lang.Integer outageid, java.lang.String ipaddr, java.util.Date iflostservice, java.util.Date ifregainedservice, org.opennms.web.assets.Event eventBySvcregainedeventid, org.opennms.web.assets.Event eventBySvclosteventid, org.opennms.web.assets.Node node, org.opennms.web.assets.Service service) {
        this.outageid = outageid;
        this.ipaddr = ipaddr;
        this.iflostservice = iflostservice;
        this.ifregainedservice = ifregainedservice;
        this.eventBySvcregainedeventid = eventBySvcregainedeventid;
        this.eventBySvclosteventid = eventBySvclosteventid;
        this.node = node;
        this.service = service;
    }

    /** default constructor */
    public Outag() {
    }

    /** minimal constructor */
    public Outag(java.lang.Integer outageid, java.lang.String ipaddr, java.util.Date iflostservice, org.opennms.web.assets.Event eventBySvcregainedeventid, org.opennms.web.assets.Event eventBySvclosteventid, org.opennms.web.assets.Node node, org.opennms.web.assets.Service service) {
        this.outageid = outageid;
        this.ipaddr = ipaddr;
        this.iflostservice = iflostservice;
        this.eventBySvcregainedeventid = eventBySvcregainedeventid;
        this.eventBySvclosteventid = eventBySvclosteventid;
        this.node = node;
        this.service = service;
    }

    public java.lang.Integer getOutageid() {
        return this.outageid;
    }

    public void setOutageid(java.lang.Integer outageid) {
        this.outageid = outageid;
    }

    public java.lang.String getIpaddr() {
        return this.ipaddr;
    }

    public void setIpaddr(java.lang.String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public java.util.Date getIflostservice() {
        return this.iflostservice;
    }

    public void setIflostservice(java.util.Date iflostservice) {
        this.iflostservice = iflostservice;
    }

    public java.util.Date getIfregainedservice() {
        return this.ifregainedservice;
    }

    public void setIfregainedservice(java.util.Date ifregainedservice) {
        this.ifregainedservice = ifregainedservice;
    }

    public org.opennms.web.assets.Event getEventBySvcregainedeventid() {
        return this.eventBySvcregainedeventid;
    }

    public void setEventBySvcregainedeventid(org.opennms.web.assets.Event eventBySvcregainedeventid) {
        this.eventBySvcregainedeventid = eventBySvcregainedeventid;
    }

    public org.opennms.web.assets.Event getEventBySvclosteventid() {
        return this.eventBySvclosteventid;
    }

    public void setEventBySvclosteventid(org.opennms.web.assets.Event eventBySvclosteventid) {
        this.eventBySvclosteventid = eventBySvclosteventid;
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
            .append("outageid", getOutageid())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof Outag) ) return false;
        Outag castOther = (Outag) other;
        return new EqualsBuilder()
            .append(this.getOutageid(), castOther.getOutageid())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getOutageid())
            .toHashCode();
    }

}
