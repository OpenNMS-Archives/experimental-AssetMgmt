package org.opennms.web.assets;

import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class Event implements Serializable {

    /** identifier field */
    private java.lang.Integer eventid;

    /** persistent field */
    private java.lang.String eventuei;

    /** persistent field */
    private java.util.Date eventtime;

    /** nullable persistent field */
    private java.lang.String eventhost;

    /** persistent field */
    private java.lang.String eventsource;

    /** nullable persistent field */
    private java.lang.String ipaddr;

    /** persistent field */
    private java.lang.String eventdpname;

    /** nullable persistent field */
    private java.lang.String eventsnmphost;

    /** nullable persistent field */
    private int serviceid;

    /** nullable persistent field */
    private java.lang.String eventsnmp;

    /** nullable persistent field */
    private java.lang.String eventparms;

    /** persistent field */
    private java.util.Date eventcreatetime;

    /** nullable persistent field */
    private java.lang.String eventdescr;

    /** nullable persistent field */
    private java.lang.String eventloggroup;

    /** nullable persistent field */
    private java.lang.String eventlogmsg;

    /** persistent field */
    private int eventseverity;

    /** nullable persistent field */
    private java.lang.String eventpathoutage;

    /** nullable persistent field */
    private java.lang.String eventcorrelation;

    /** nullable persistent field */
    private int eventsuppressedcount;

    /** nullable persistent field */
    private java.lang.String eventoperinstruct;

    /** nullable persistent field */
    private java.lang.String eventautoaction;

    /** nullable persistent field */
    private java.lang.String eventoperaction;

    /** nullable persistent field */
    private java.lang.String eventoperactionmenutext;

    /** nullable persistent field */
    private java.lang.String eventnotification;

    /** nullable persistent field */
    private java.lang.String eventtticket;

    /** nullable persistent field */
    private int eventtticketstate;

    /** nullable persistent field */
    private java.lang.String eventforward;

    /** nullable persistent field */
    private java.lang.String eventmouseovertext;

    /** persistent field */
    private java.lang.String eventlog;

    /** persistent field */
    private java.lang.String eventdisplay;

    /** nullable persistent field */
    private java.lang.String eventackuser;

    /** nullable persistent field */
    private java.util.Date eventacktime;

    /** persistent field */
    private org.opennms.web.assets.Node node;

    /** persistent field */
    private Set notifications;

    /** persistent field */
    private Set outagsBySvcregainedeventid;

    /** persistent field */
    private Set outagsBySvclosteventid;

    /** full constructor */
    public Event(java.lang.Integer eventid, java.lang.String eventuei, java.util.Date eventtime, java.lang.String eventhost, java.lang.String eventsource, java.lang.String ipaddr, java.lang.String eventdpname, java.lang.String eventsnmphost, int serviceid, java.lang.String eventsnmp, java.lang.String eventparms, java.util.Date eventcreatetime, java.lang.String eventdescr, java.lang.String eventloggroup, java.lang.String eventlogmsg, int eventseverity, java.lang.String eventpathoutage, java.lang.String eventcorrelation, int eventsuppressedcount, java.lang.String eventoperinstruct, java.lang.String eventautoaction, java.lang.String eventoperaction, java.lang.String eventoperactionmenutext, java.lang.String eventnotification, java.lang.String eventtticket, int eventtticketstate, java.lang.String eventforward, java.lang.String eventmouseovertext, java.lang.String eventlog, java.lang.String eventdisplay, java.lang.String eventackuser, java.util.Date eventacktime, org.opennms.web.assets.Node node, Set notifications, Set outagsBySvcregainedeventid, Set outagsBySvclosteventid) {
        this.eventid = eventid;
        this.eventuei = eventuei;
        this.eventtime = eventtime;
        this.eventhost = eventhost;
        this.eventsource = eventsource;
        this.ipaddr = ipaddr;
        this.eventdpname = eventdpname;
        this.eventsnmphost = eventsnmphost;
        this.serviceid = serviceid;
        this.eventsnmp = eventsnmp;
        this.eventparms = eventparms;
        this.eventcreatetime = eventcreatetime;
        this.eventdescr = eventdescr;
        this.eventloggroup = eventloggroup;
        this.eventlogmsg = eventlogmsg;
        this.eventseverity = eventseverity;
        this.eventpathoutage = eventpathoutage;
        this.eventcorrelation = eventcorrelation;
        this.eventsuppressedcount = eventsuppressedcount;
        this.eventoperinstruct = eventoperinstruct;
        this.eventautoaction = eventautoaction;
        this.eventoperaction = eventoperaction;
        this.eventoperactionmenutext = eventoperactionmenutext;
        this.eventnotification = eventnotification;
        this.eventtticket = eventtticket;
        this.eventtticketstate = eventtticketstate;
        this.eventforward = eventforward;
        this.eventmouseovertext = eventmouseovertext;
        this.eventlog = eventlog;
        this.eventdisplay = eventdisplay;
        this.eventackuser = eventackuser;
        this.eventacktime = eventacktime;
        this.node = node;
        this.notifications = notifications;
        this.outagsBySvcregainedeventid = outagsBySvcregainedeventid;
        this.outagsBySvclosteventid = outagsBySvclosteventid;
    }

    /** default constructor */
    public Event() {
    }

    /** minimal constructor */
    public Event(java.lang.Integer eventid, java.lang.String eventuei, java.util.Date eventtime, java.lang.String eventsource, java.lang.String eventdpname, java.util.Date eventcreatetime, int eventseverity, java.lang.String eventlog, java.lang.String eventdisplay, org.opennms.web.assets.Node node, Set notifications, Set outagsBySvcregainedeventid, Set outagsBySvclosteventid) {
        this.eventid = eventid;
        this.eventuei = eventuei;
        this.eventtime = eventtime;
        this.eventsource = eventsource;
        this.eventdpname = eventdpname;
        this.eventcreatetime = eventcreatetime;
        this.eventseverity = eventseverity;
        this.eventlog = eventlog;
        this.eventdisplay = eventdisplay;
        this.node = node;
        this.notifications = notifications;
        this.outagsBySvcregainedeventid = outagsBySvcregainedeventid;
        this.outagsBySvclosteventid = outagsBySvclosteventid;
    }

    public java.lang.Integer getEventid() {
        return this.eventid;
    }

    public void setEventid(java.lang.Integer eventid) {
        this.eventid = eventid;
    }

    public java.lang.String getEventuei() {
        return this.eventuei;
    }

    public void setEventuei(java.lang.String eventuei) {
        this.eventuei = eventuei;
    }

    public java.util.Date getEventtime() {
        return this.eventtime;
    }

    public void setEventtime(java.util.Date eventtime) {
        this.eventtime = eventtime;
    }

    public java.lang.String getEventhost() {
        return this.eventhost;
    }

    public void setEventhost(java.lang.String eventhost) {
        this.eventhost = eventhost;
    }

    public java.lang.String getEventsource() {
        return this.eventsource;
    }

    public void setEventsource(java.lang.String eventsource) {
        this.eventsource = eventsource;
    }

    public java.lang.String getIpaddr() {
        return this.ipaddr;
    }

    public void setIpaddr(java.lang.String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public java.lang.String getEventdpname() {
        return this.eventdpname;
    }

    public void setEventdpname(java.lang.String eventdpname) {
        this.eventdpname = eventdpname;
    }

    public java.lang.String getEventsnmphost() {
        return this.eventsnmphost;
    }

    public void setEventsnmphost(java.lang.String eventsnmphost) {
        this.eventsnmphost = eventsnmphost;
    }

    public int getServiceid() {
        return this.serviceid;
    }

    public void setServiceid(int serviceid) {
        this.serviceid = serviceid;
    }

    public java.lang.String getEventsnmp() {
        return this.eventsnmp;
    }

    public void setEventsnmp(java.lang.String eventsnmp) {
        this.eventsnmp = eventsnmp;
    }

    public java.lang.String getEventparms() {
        return this.eventparms;
    }

    public void setEventparms(java.lang.String eventparms) {
        this.eventparms = eventparms;
    }

    public java.util.Date getEventcreatetime() {
        return this.eventcreatetime;
    }

    public void setEventcreatetime(java.util.Date eventcreatetime) {
        this.eventcreatetime = eventcreatetime;
    }

    public java.lang.String getEventdescr() {
        return this.eventdescr;
    }

    public void setEventdescr(java.lang.String eventdescr) {
        this.eventdescr = eventdescr;
    }

    public java.lang.String getEventloggroup() {
        return this.eventloggroup;
    }

    public void setEventloggroup(java.lang.String eventloggroup) {
        this.eventloggroup = eventloggroup;
    }

    public java.lang.String getEventlogmsg() {
        return this.eventlogmsg;
    }

    public void setEventlogmsg(java.lang.String eventlogmsg) {
        this.eventlogmsg = eventlogmsg;
    }

    public int getEventseverity() {
        return this.eventseverity;
    }

    public void setEventseverity(int eventseverity) {
        this.eventseverity = eventseverity;
    }

    public java.lang.String getEventpathoutage() {
        return this.eventpathoutage;
    }

    public void setEventpathoutage(java.lang.String eventpathoutage) {
        this.eventpathoutage = eventpathoutage;
    }

    public java.lang.String getEventcorrelation() {
        return this.eventcorrelation;
    }

    public void setEventcorrelation(java.lang.String eventcorrelation) {
        this.eventcorrelation = eventcorrelation;
    }

    public int getEventsuppressedcount() {
        return this.eventsuppressedcount;
    }

    public void setEventsuppressedcount(int eventsuppressedcount) {
        this.eventsuppressedcount = eventsuppressedcount;
    }

    public java.lang.String getEventoperinstruct() {
        return this.eventoperinstruct;
    }

    public void setEventoperinstruct(java.lang.String eventoperinstruct) {
        this.eventoperinstruct = eventoperinstruct;
    }

    public java.lang.String getEventautoaction() {
        return this.eventautoaction;
    }

    public void setEventautoaction(java.lang.String eventautoaction) {
        this.eventautoaction = eventautoaction;
    }

    public java.lang.String getEventoperaction() {
        return this.eventoperaction;
    }

    public void setEventoperaction(java.lang.String eventoperaction) {
        this.eventoperaction = eventoperaction;
    }

    public java.lang.String getEventoperactionmenutext() {
        return this.eventoperactionmenutext;
    }

    public void setEventoperactionmenutext(java.lang.String eventoperactionmenutext) {
        this.eventoperactionmenutext = eventoperactionmenutext;
    }

    public java.lang.String getEventnotification() {
        return this.eventnotification;
    }

    public void setEventnotification(java.lang.String eventnotification) {
        this.eventnotification = eventnotification;
    }

    public java.lang.String getEventtticket() {
        return this.eventtticket;
    }

    public void setEventtticket(java.lang.String eventtticket) {
        this.eventtticket = eventtticket;
    }

    public int getEventtticketstate() {
        return this.eventtticketstate;
    }

    public void setEventtticketstate(int eventtticketstate) {
        this.eventtticketstate = eventtticketstate;
    }

    public java.lang.String getEventforward() {
        return this.eventforward;
    }

    public void setEventforward(java.lang.String eventforward) {
        this.eventforward = eventforward;
    }

    public java.lang.String getEventmouseovertext() {
        return this.eventmouseovertext;
    }

    public void setEventmouseovertext(java.lang.String eventmouseovertext) {
        this.eventmouseovertext = eventmouseovertext;
    }

    public java.lang.String getEventlog() {
        return this.eventlog;
    }

    public void setEventlog(java.lang.String eventlog) {
        this.eventlog = eventlog;
    }

    public java.lang.String getEventdisplay() {
        return this.eventdisplay;
    }

    public void setEventdisplay(java.lang.String eventdisplay) {
        this.eventdisplay = eventdisplay;
    }

    public java.lang.String getEventackuser() {
        return this.eventackuser;
    }

    public void setEventackuser(java.lang.String eventackuser) {
        this.eventackuser = eventackuser;
    }

    public java.util.Date getEventacktime() {
        return this.eventacktime;
    }

    public void setEventacktime(java.util.Date eventacktime) {
        this.eventacktime = eventacktime;
    }

    public org.opennms.web.assets.Node getNode() {
        return this.node;
    }

    public void setNode(org.opennms.web.assets.Node node) {
        this.node = node;
    }

    public java.util.Set getNotifications() {
        return this.notifications;
    }

    public void setNotifications(java.util.Set notifications) {
        this.notifications = notifications;
    }

    public java.util.Set getOutagsBySvcregainedeventid() {
        return this.outagsBySvcregainedeventid;
    }

    public void setOutagsBySvcregainedeventid(java.util.Set outagsBySvcregainedeventid) {
        this.outagsBySvcregainedeventid = outagsBySvcregainedeventid;
    }

    public java.util.Set getOutagsBySvclosteventid() {
        return this.outagsBySvclosteventid;
    }

    public void setOutagsBySvclosteventid(java.util.Set outagsBySvclosteventid) {
        this.outagsBySvclosteventid = outagsBySvclosteventid;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("eventid", getEventid())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof Event) ) return false;
        Event castOther = (Event) other;
        return new EqualsBuilder()
            .append(this.getEventid(), castOther.getEventid())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getEventid())
            .toHashCode();
    }

}
