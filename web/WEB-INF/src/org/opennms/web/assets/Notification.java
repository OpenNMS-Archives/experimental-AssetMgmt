package org.opennms.web.assets;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class Notification implements Serializable {

    /** identifier field */
    private java.lang.Integer notifyid;

    /** nullable persistent field */
    private java.lang.String textmsg;

    /** nullable persistent field */
    private java.lang.String numericmsg;

    /** nullable persistent field */
    private java.util.Date pagetime;

    /** nullable persistent field */
    private java.util.Date respondtime;

    /** nullable persistent field */
    private java.lang.String answeredby;

    /** nullable persistent field */
    private int nodeid;

    /** nullable persistent field */
    private java.lang.String interfaceid;

    /** nullable persistent field */
    private int serviceid;

    /** persistent field */
    private java.lang.String eventuei;

    /** persistent field */
    private org.opennms.web.assets.Event event;

    /** persistent field */
    private Set usersnotifieds;

    /** full constructor */
    public Notification(java.lang.Integer notifyid, java.lang.String textmsg, java.lang.String numericmsg, java.util.Date pagetime, java.util.Date respondtime, java.lang.String answeredby, int nodeid, java.lang.String interfaceid, int serviceid, java.lang.String eventuei, org.opennms.web.assets.Event event, Set usersnotifieds) {
        this.notifyid = notifyid;
        this.textmsg = textmsg;
        this.numericmsg = numericmsg;
        this.pagetime = pagetime;
        this.respondtime = respondtime;
        this.answeredby = answeredby;
        this.nodeid = nodeid;
        this.interfaceid = interfaceid;
        this.serviceid = serviceid;
        this.eventuei = eventuei;
        this.event = event;
        this.usersnotifieds = usersnotifieds;
    }

    /** default constructor */
    public Notification() {
    }

    /** minimal constructor */
    public Notification(java.lang.Integer notifyid, java.lang.String eventuei, org.opennms.web.assets.Event event, Set usersnotifieds) {
        this.notifyid = notifyid;
        this.eventuei = eventuei;
        this.event = event;
        this.usersnotifieds = usersnotifieds;
    }

    public java.lang.Integer getNotifyid() {
        return this.notifyid;
    }

    public void setNotifyid(java.lang.Integer notifyid) {
        this.notifyid = notifyid;
    }

    public java.lang.String getTextmsg() {
        return this.textmsg;
    }

    public void setTextmsg(java.lang.String textmsg) {
        this.textmsg = textmsg;
    }

    public java.lang.String getNumericmsg() {
        return this.numericmsg;
    }

    public void setNumericmsg(java.lang.String numericmsg) {
        this.numericmsg = numericmsg;
    }

    public java.util.Date getPagetime() {
        return this.pagetime;
    }

    public void setPagetime(java.util.Date pagetime) {
        this.pagetime = pagetime;
    }

    public java.util.Date getRespondtime() {
        return this.respondtime;
    }

    public void setRespondtime(java.util.Date respondtime) {
        this.respondtime = respondtime;
    }

    public java.lang.String getAnsweredby() {
        return this.answeredby;
    }

    public void setAnsweredby(java.lang.String answeredby) {
        this.answeredby = answeredby;
    }

    public int getNodeid() {
        return this.nodeid;
    }

    public void setNodeid(int nodeid) {
        this.nodeid = nodeid;
    }

    public java.lang.String getInterfaceid() {
        return this.interfaceid;
    }

    public void setInterfaceid(java.lang.String interfaceid) {
        this.interfaceid = interfaceid;
    }

    public int getServiceid() {
        return this.serviceid;
    }

    public void setServiceid(int serviceid) {
        this.serviceid = serviceid;
    }

    public java.lang.String getEventuei() {
        return this.eventuei;
    }

    public void setEventuei(java.lang.String eventuei) {
        this.eventuei = eventuei;
    }

    public org.opennms.web.assets.Event getEvent() {
        return this.event;
    }

    public void setEvent(org.opennms.web.assets.Event event) {
        this.event = event;
    }

    public java.util.Set getUsersnotifieds() {
        return this.usersnotifieds;
    }

    public void setUsersnotifieds(java.util.Set usersnotifieds) {
        this.usersnotifieds = usersnotifieds;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("notifyid", getNotifyid())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof Notification) ) return false;
        Notification castOther = (Notification) other;
        return new EqualsBuilder()
            .append(this.getNotifyid(), castOther.getNotifyid())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getNotifyid())
            .toHashCode();
    }

}
