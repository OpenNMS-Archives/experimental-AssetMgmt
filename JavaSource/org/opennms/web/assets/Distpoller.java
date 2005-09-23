package org.opennms.web.assets;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class Distpoller implements Serializable {

    /** identifier field */
    private java.lang.String dpname;

    /** persistent field */
    private java.lang.String dpip;

    /** nullable persistent field */
    private java.lang.String dpcomment;

    /** nullable persistent field */
    private java.math.BigDecimal dpdisclimit;

    /** nullable persistent field */
    private java.util.Date dplastnodepull;

    /** nullable persistent field */
    private java.util.Date dplasteventpull;

    /** nullable persistent field */
    private java.util.Date dplastpackagepush;

    /** nullable persistent field */
    private int dpadminstate;

    /** nullable persistent field */
    private int dprunstate;

    /** persistent field */
    private Set nodes;

    /** full constructor */
    public Distpoller(java.lang.String dpname, java.lang.String dpip, java.lang.String dpcomment, java.math.BigDecimal dpdisclimit, java.util.Date dplastnodepull, java.util.Date dplasteventpull, java.util.Date dplastpackagepush, int dpadminstate, int dprunstate, Set nodes) {
        this.dpname = dpname;
        this.dpip = dpip;
        this.dpcomment = dpcomment;
        this.dpdisclimit = dpdisclimit;
        this.dplastnodepull = dplastnodepull;
        this.dplasteventpull = dplasteventpull;
        this.dplastpackagepush = dplastpackagepush;
        this.dpadminstate = dpadminstate;
        this.dprunstate = dprunstate;
        this.nodes = nodes;
    }

    /** default constructor */
    public Distpoller() {
    }

    /** minimal constructor */
    public Distpoller(java.lang.String dpname, java.lang.String dpip, Set nodes) {
        this.dpname = dpname;
        this.dpip = dpip;
        this.nodes = nodes;
    }

    public java.lang.String getDpname() {
        return this.dpname;
    }

    public void setDpname(java.lang.String dpname) {
        this.dpname = dpname;
    }

    public java.lang.String getDpip() {
        return this.dpip;
    }

    public void setDpip(java.lang.String dpip) {
        this.dpip = dpip;
    }

    public java.lang.String getDpcomment() {
        return this.dpcomment;
    }

    public void setDpcomment(java.lang.String dpcomment) {
        this.dpcomment = dpcomment;
    }

    public java.math.BigDecimal getDpdisclimit() {
        return this.dpdisclimit;
    }

    public void setDpdisclimit(java.math.BigDecimal dpdisclimit) {
        this.dpdisclimit = dpdisclimit;
    }

    public java.util.Date getDplastnodepull() {
        return this.dplastnodepull;
    }

    public void setDplastnodepull(java.util.Date dplastnodepull) {
        this.dplastnodepull = dplastnodepull;
    }

    public java.util.Date getDplasteventpull() {
        return this.dplasteventpull;
    }

    public void setDplasteventpull(java.util.Date dplasteventpull) {
        this.dplasteventpull = dplasteventpull;
    }

    public java.util.Date getDplastpackagepush() {
        return this.dplastpackagepush;
    }

    public void setDplastpackagepush(java.util.Date dplastpackagepush) {
        this.dplastpackagepush = dplastpackagepush;
    }

    public int getDpadminstate() {
        return this.dpadminstate;
    }

    public void setDpadminstate(int dpadminstate) {
        this.dpadminstate = dpadminstate;
    }

    public int getDprunstate() {
        return this.dprunstate;
    }

    public void setDprunstate(int dprunstate) {
        this.dprunstate = dprunstate;
    }

    public java.util.Set getNodes() {
        return this.nodes;
    }

    public void setNodes(java.util.Set nodes) {
        this.nodes = nodes;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("dpname", getDpname())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof Distpoller) ) return false;
        Distpoller castOther = (Distpoller) other;
        return new EqualsBuilder()
            .append(this.getDpname(), castOther.getDpname())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getDpname())
            .toHashCode();
    }

}
