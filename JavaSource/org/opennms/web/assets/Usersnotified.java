package org.opennms.web.assets;

import java.io.Serializable;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class Usersnotified implements Serializable {

    /** identifier field */
    private java.lang.String userid;

    /** identifier field */
    private java.util.Date notifytime;

    /** identifier field */
    private java.lang.String media;

    /** identifier field */
    private java.lang.String contactinfo;

    /** persistent field */
    private org.opennms.web.assets.Notification notification;

    /** full constructor */
    public Usersnotified(java.lang.String userid, java.util.Date notifytime, java.lang.String media, java.lang.String contactinfo, org.opennms.web.assets.Notification notification) {
        this.userid = userid;
        this.notifytime = notifytime;
        this.media = media;
        this.contactinfo = contactinfo;
        this.notification = notification;
    }

    /** default constructor */
    public Usersnotified() {
    }

    public java.lang.String getUserid() {
        return this.userid;
    }

    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }

    public java.util.Date getNotifytime() {
        return this.notifytime;
    }

    public void setNotifytime(java.util.Date notifytime) {
        this.notifytime = notifytime;
    }

    public java.lang.String getMedia() {
        return this.media;
    }

    public void setMedia(java.lang.String media) {
        this.media = media;
    }

    public java.lang.String getContactinfo() {
        return this.contactinfo;
    }

    public void setContactinfo(java.lang.String contactinfo) {
        this.contactinfo = contactinfo;
    }

    public org.opennms.web.assets.Notification getNotification() {
        return this.notification;
    }

    public void setNotification(org.opennms.web.assets.Notification notification) {
        this.notification = notification;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("userid", getUserid())
            .append("notifytime", getNotifytime())
            .append("media", getMedia())
            .append("contactinfo", getContactinfo())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof Usersnotified) ) return false;
        Usersnotified castOther = (Usersnotified) other;
        return new EqualsBuilder()
            .append(this.getUserid(), castOther.getUserid())
            .append(this.getNotifytime(), castOther.getNotifytime())
            .append(this.getMedia(), castOther.getMedia())
            .append(this.getContactinfo(), castOther.getContactinfo())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getUserid())
            .append(getNotifytime())
            .append(getMedia())
            .append(getContactinfo())
            .toHashCode();
    }

}
