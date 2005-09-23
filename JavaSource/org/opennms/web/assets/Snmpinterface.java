package org.opennms.web.assets;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class Snmpinterface implements Serializable {

    /** identifier field */
    private java.lang.String ipaddr;

    /** identifier field */
    private java.lang.String snmpipadentnetmask;

    /** identifier field */
    private java.lang.String snmpphysaddr;

    /** identifier field */
    private int snmpifindex;

    /** identifier field */
    private java.lang.String snmpifdescr;

    /** identifier field */
    private int snmpiftype;

    /** identifier field */
    private java.lang.String snmpifname;

    /** identifier field */
    private int snmpifspeed;

    /** identifier field */
    private int snmpifadminstatus;

    /** identifier field */
    private int snmpifoperstatus;

    /** persistent field */
    private org.opennms.web.assets.Node node;

    /** full constructor */
    public Snmpinterface(java.lang.String ipaddr, java.lang.String snmpipadentnetmask, java.lang.String snmpphysaddr, int snmpifindex, java.lang.String snmpifdescr, int snmpiftype, java.lang.String snmpifname, int snmpifspeed, int snmpifadminstatus, int snmpifoperstatus, org.opennms.web.assets.Node node) {
        this.ipaddr = ipaddr;
        this.snmpipadentnetmask = snmpipadentnetmask;
        this.snmpphysaddr = snmpphysaddr;
        this.snmpifindex = snmpifindex;
        this.snmpifdescr = snmpifdescr;
        this.snmpiftype = snmpiftype;
        this.snmpifname = snmpifname;
        this.snmpifspeed = snmpifspeed;
        this.snmpifadminstatus = snmpifadminstatus;
        this.snmpifoperstatus = snmpifoperstatus;
        this.node = node;
    }

    /** default constructor */
    public Snmpinterface() {
    }

    public java.lang.String getIpaddr() {
        return this.ipaddr;
    }

    public void setIpaddr(java.lang.String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public java.lang.String getSnmpipadentnetmask() {
        return this.snmpipadentnetmask;
    }

    public void setSnmpipadentnetmask(java.lang.String snmpipadentnetmask) {
        this.snmpipadentnetmask = snmpipadentnetmask;
    }

    public java.lang.String getSnmpphysaddr() {
        return this.snmpphysaddr;
    }

    public void setSnmpphysaddr(java.lang.String snmpphysaddr) {
        this.snmpphysaddr = snmpphysaddr;
    }

    public int getSnmpifindex() {
        return this.snmpifindex;
    }

    public void setSnmpifindex(int snmpifindex) {
        this.snmpifindex = snmpifindex;
    }

    public java.lang.String getSnmpifdescr() {
        return this.snmpifdescr;
    }

    public void setSnmpifdescr(java.lang.String snmpifdescr) {
        this.snmpifdescr = snmpifdescr;
    }

    public int getSnmpiftype() {
        return this.snmpiftype;
    }

    public void setSnmpiftype(int snmpiftype) {
        this.snmpiftype = snmpiftype;
    }

    public java.lang.String getSnmpifname() {
        return this.snmpifname;
    }

    public void setSnmpifname(java.lang.String snmpifname) {
        this.snmpifname = snmpifname;
    }

    public int getSnmpifspeed() {
        return this.snmpifspeed;
    }

    public void setSnmpifspeed(int snmpifspeed) {
        this.snmpifspeed = snmpifspeed;
    }

    public int getSnmpifadminstatus() {
        return this.snmpifadminstatus;
    }

    public void setSnmpifadminstatus(int snmpifadminstatus) {
        this.snmpifadminstatus = snmpifadminstatus;
    }

    public int getSnmpifoperstatus() {
        return this.snmpifoperstatus;
    }

    public void setSnmpifoperstatus(int snmpifoperstatus) {
        this.snmpifoperstatus = snmpifoperstatus;
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
            .append("snmpipadentnetmask", getSnmpipadentnetmask())
            .append("snmpphysaddr", getSnmpphysaddr())
            .append("snmpifindex", getSnmpifindex())
            .append("snmpifdescr", getSnmpifdescr())
            .append("snmpiftype", getSnmpiftype())
            .append("snmpifname", getSnmpifname())
            .append("snmpifspeed", getSnmpifspeed())
            .append("snmpifadminstatus", getSnmpifadminstatus())
            .append("snmpifoperstatus", getSnmpifoperstatus())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof Snmpinterface) ) return false;
        Snmpinterface castOther = (Snmpinterface) other;
        return new EqualsBuilder()
            .append(this.getIpaddr(), castOther.getIpaddr())
            .append(this.getSnmpipadentnetmask(), castOther.getSnmpipadentnetmask())
            .append(this.getSnmpphysaddr(), castOther.getSnmpphysaddr())
            .append(this.getSnmpifindex(), castOther.getSnmpifindex())
            .append(this.getSnmpifdescr(), castOther.getSnmpifdescr())
            .append(this.getSnmpiftype(), castOther.getSnmpiftype())
            .append(this.getSnmpifname(), castOther.getSnmpifname())
            .append(this.getSnmpifspeed(), castOther.getSnmpifspeed())
            .append(this.getSnmpifadminstatus(), castOther.getSnmpifadminstatus())
            .append(this.getSnmpifoperstatus(), castOther.getSnmpifoperstatus())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getIpaddr())
            .append(getSnmpipadentnetmask())
            .append(getSnmpphysaddr())
            .append(getSnmpifindex())
            .append(getSnmpifdescr())
            .append(getSnmpiftype())
            .append(getSnmpifname())
            .append(getSnmpifspeed())
            .append(getSnmpifadminstatus())
            .append(getSnmpifoperstatus())
            .toHashCode();
    }

}
