package org.opennms.web.assets;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class Servermap implements Serializable {

    /** identifier field */
    private java.lang.String ipaddr;

    /** identifier field */
    private java.lang.String servername;

    /** full constructor */
    public Servermap(java.lang.String ipaddr, java.lang.String servername) {
        this.ipaddr = ipaddr;
        this.servername = servername;
    }

    /** default constructor */
    public Servermap() {
    }

    public java.lang.String getIpaddr() {
        return this.ipaddr;
    }

    public void setIpaddr(java.lang.String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public java.lang.String getServername() {
        return this.servername;
    }

    public void setServername(java.lang.String servername) {
        this.servername = servername;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("ipaddr", getIpaddr())
            .append("servername", getServername())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof Servermap) ) return false;
        Servermap castOther = (Servermap) other;
        return new EqualsBuilder()
            .append(this.getIpaddr(), castOther.getIpaddr())
            .append(this.getServername(), castOther.getServername())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getIpaddr())
            .append(getServername())
            .toHashCode();
    }

}
