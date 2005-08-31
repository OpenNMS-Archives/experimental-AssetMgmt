package org.opennms.web.assets;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.faces.context.FacesContext;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;
import net.sf.hibernate.Transaction;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/** @author Hibernate CodeGenerator */
public class Node extends AssetSelector implements Serializable {
	
    public static final String TYPE_NAME = "Node";

    /** identifier field */
    private java.lang.Integer nodeid;

    /** persistent field */
    private java.util.Date nodecreatetime;

    /** nullable persistent field */
    private Integer nodeparentid;

    /** nullable persistent field */
    private java.lang.String nodetype;

    /** nullable persistent field */
    private java.lang.String nodesysoid;

    /** nullable persistent field */
    private java.lang.String nodesysname;

    /** nullable persistent field */
    private java.lang.String nodesysdescription;

    /** nullable persistent field */
    private java.lang.String nodesyslocation;

    /** nullable persistent field */
    private java.lang.String nodesyscontact;

    /** nullable persistent field */
    private java.lang.String nodelabel;

    /** nullable persistent field */
    private java.lang.String nodelabelsource;

    /** nullable persistent field */
    private java.lang.String nodenetbiosname;

    /** nullable persistent field */
    private java.lang.String nodedomainname;

    /** nullable persistent field */
    private java.lang.String operatingsystem;

    /** nullable persistent field */
    private java.util.Date lastcapsdpoll;

    /** persistent field */
    private org.opennms.web.assets.Distpoller distpoller;

    /** persistent field */
    private Set events;

    /** persistent field */
    private Set ipinterfaces;

    /** persistent field */
    private Set outags;

    /** persistent field */
    private Set ifservics;

    /** persistent field */
    private Set assets;

    /** persistent field */
    private Set snmpinterfaces;

    /** full constructor */
    public Node(java.lang.Integer nodeid, java.util.Date nodecreatetime, Integer nodeparentid, java.lang.String nodetype, java.lang.String nodesysoid, java.lang.String nodesysname, java.lang.String nodesysdescription, java.lang.String nodesyslocation, java.lang.String nodesyscontact, java.lang.String nodelabel, java.lang.String nodelabelsource, java.lang.String nodenetbiosname, java.lang.String nodedomainname, java.lang.String operatingsystem, java.util.Date lastcapsdpoll, org.opennms.web.assets.Distpoller distpoller, Set events, Set ipinterfaces, Set outags, Set ifservics, Set assets, Set snmpinterfaces) {
    		this();
        this.nodeid = nodeid;
        this.nodecreatetime = nodecreatetime;
        this.nodeparentid = nodeparentid;
        this.nodetype = nodetype;
        this.nodesysoid = nodesysoid;
        this.nodesysname = nodesysname;
        this.nodesysdescription = nodesysdescription;
        this.nodesyslocation = nodesyslocation;
        this.nodesyscontact = nodesyscontact;
        this.nodelabel = nodelabel;
        this.nodelabelsource = nodelabelsource;
        this.nodenetbiosname = nodenetbiosname;
        this.nodedomainname = nodedomainname;
        this.operatingsystem = operatingsystem;
        this.lastcapsdpoll = lastcapsdpoll;
        this.distpoller = distpoller;
        this.events = events;
        this.ipinterfaces = ipinterfaces;
        this.outags = outags;
        this.ifservics = ifservics;
        this.assets = assets;
        this.snmpinterfaces = snmpinterfaces;
    }

    /** default constructor */
    public Node() {
    		super(Node.TYPE_NAME, "node");
    }

    /** minimal constructor */
    public Node(java.lang.Integer nodeid, java.util.Date nodecreatetime, org.opennms.web.assets.Distpoller distpoller, Set events, Set ipinterfaces, Set outags, Set ifservics, Set assets, Set snmpinterfaces) {
    		this();
        this.nodeid = nodeid;
        this.nodecreatetime = nodecreatetime;
        this.distpoller = distpoller;
        this.events = events;
        this.ipinterfaces = ipinterfaces;
        this.outags = outags;
        this.ifservics = ifservics;
        this.assets = assets;
        this.snmpinterfaces = snmpinterfaces;
    }

    public java.lang.Integer getNodeid() {
        return this.nodeid;
    }

    public void setNodeid(java.lang.Integer nodeid) {
        this.nodeid = nodeid;
    }

    public java.util.Date getNodecreatetime() {
        return this.nodecreatetime;
    }

    public void setNodecreatetime(java.util.Date nodecreatetime) {
        this.nodecreatetime = nodecreatetime;
    }

    public Integer getNodeparentid() {
        return this.nodeparentid;
    }

    public void setNodeparentid(Integer nodeparentid) {
        this.nodeparentid = nodeparentid;
    }

    public java.lang.String getNodetype() {
        return this.nodetype;
    }

    public void setNodetype(java.lang.String nodetype) {
        this.nodetype = nodetype;
    }

    public java.lang.String getNodesysoid() {
        return this.nodesysoid;
    }

    public void setNodesysoid(java.lang.String nodesysoid) {
        this.nodesysoid = nodesysoid;
    }

    public java.lang.String getNodesysname() {
        return this.nodesysname;
    }

    public void setNodesysname(java.lang.String nodesysname) {
        this.nodesysname = nodesysname;
    }

    public java.lang.String getNodesysdescription() {
        return this.nodesysdescription;
    }

    public void setNodesysdescription(java.lang.String nodesysdescription) {
        this.nodesysdescription = nodesysdescription;
    }

    public java.lang.String getNodesyslocation() {
        return this.nodesyslocation;
    }

    public void setNodesyslocation(java.lang.String nodesyslocation) {
        this.nodesyslocation = nodesyslocation;
    }

    public java.lang.String getNodesyscontact() {
        return this.nodesyscontact;
    }

    public void setNodesyscontact(java.lang.String nodesyscontact) {
        this.nodesyscontact = nodesyscontact;
    }

    public java.lang.String getNodelabel() {
        return this.nodelabel;
    }

    public void setNodelabel(java.lang.String nodelabel) {
        this.nodelabel = nodelabel;
    }

    public java.lang.String getNodelabelsource() {
        return this.nodelabelsource;
    }

    public void setNodelabelsource(java.lang.String nodelabelsource) {
        this.nodelabelsource = nodelabelsource;
    }

    public java.lang.String getNodenetbiosname() {
        return this.nodenetbiosname;
    }

    public void setNodenetbiosname(java.lang.String nodenetbiosname) {
        this.nodenetbiosname = nodenetbiosname;
    }

    public java.lang.String getNodedomainname() {
        return this.nodedomainname;
    }

    public void setNodedomainname(java.lang.String nodedomainname) {
        this.nodedomainname = nodedomainname;
    }

    public java.lang.String getOperatingsystem() {
        return this.operatingsystem;
    }

    public void setOperatingsystem(java.lang.String operatingsystem) {
        this.operatingsystem = operatingsystem;
    }

    public java.util.Date getLastcapsdpoll() {
        return this.lastcapsdpoll;
    }

    public void setLastcapsdpoll(java.util.Date lastcapsdpoll) {
        this.lastcapsdpoll = lastcapsdpoll;
    }

    public org.opennms.web.assets.Distpoller getDistpoller() {
        return this.distpoller;
    }

    public void setDistpoller(org.opennms.web.assets.Distpoller distpoller) {
        this.distpoller = distpoller;
    }

    public java.util.Set getEvents() {
        return this.events;
    }

    public void setEvents(java.util.Set events) {
        this.events = events;
    }

    public java.util.Set getIpinterfaces() {
        return this.ipinterfaces;
    }

    public void setIpinterfaces(java.util.Set ipinterfaces) {
        this.ipinterfaces = ipinterfaces;
    }

    public java.util.Set getOutags() {
        return this.outags;
    }

    public void setOutags(java.util.Set outags) {
        this.outags = outags;
    }

    public java.util.Set getIfservics() {
        return this.ifservics;
    }

    public void setIfservics(java.util.Set ifservics) {
        this.ifservics = ifservics;
    }

    public java.util.Set getAssets() {
        return this.assets;
    }

    public void setAssets(java.util.Set assets) {
        this.assets = assets;
    }

    public java.util.Set getSnmpinterfaces() {
        return this.snmpinterfaces;
    }

    public void setSnmpinterfaces(java.util.Set snmpinterfaces) {
        this.snmpinterfaces = snmpinterfaces;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("nodeid", getNodeid())
            .toString();
    }

    public boolean equals(Object other) {
        if ( !(other instanceof Node) ) return false;
        Node castOther = (Node) other;
        return new EqualsBuilder()
            .append(this.getNodeid(), castOther.getNodeid())
            .isEquals();
    }

    public int hashCode() {
        return new HashCodeBuilder()
            .append(getNodeid())
            .toHashCode();
    }
    
	public String edit() {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("currentNode", this);
		String result = "editNode";
		return result;
	}

    public String save() throws HibernateException {
        
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.currentSession();
    
            tx= session.beginTransaction();
    
            session.saveOrUpdate(this);
        
            tx.commit();
            
            removeSessionVariable("currentNode");
            String result = ""; // empty string means show same page
            return result;
        
        }
        catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            throw e;
        }
        finally {
            if (session != null) HibernateUtil.closeSession();
        }
    }

	public String done() throws HibernateException {
		save();
		String result = "success";
		return result;
	}

	public String cancel() {
		String result = "success";
		cancelAllEdits();
		return result;
	}

	public boolean isSelected() {
		Set selectedNodes = (Set) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("_selectedNodes");
		if (selectedNodes == null)
			return false;

		return (selectedNodes.contains(this));
	}

	public void setSelected(boolean selected) {
		System.err.println("(" + this + ").setSelected(" + selected + ")");
		if (selected) {
			Set selectedNodes = (Set) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("_selectedNodes");
			if (selectedNodes == null) {
				selectedNodes = new HashSet();
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("_selectedNodes", selectedNodes);
			}
			selectedNodes.add(this);
		} else {
			Set selectedNodes = (Set) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("_selectedNodes");
			if (selectedNodes != null) {
				selectedNodes.remove(this);
				if (selectedNodes.isEmpty()) {
					FacesContext.getCurrentInstance().getExternalContext()
							.getSessionMap().remove("_selectedNodes");
				}
			}
		}
	}

	private void cancelAllEdits() {
/*
		setEditingCategory(false);
		setEditingManufacturer(false);
		setEditingOperatingSystem(false);
		setEditingVendor(false);
*/
		}

    private void removeSessionVariable(String key) {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove(key);
    }
    
    public String getName() {
    		return this.nodelabel;
    }

    public void setName(String name) {
    		this.nodelabel = name;
    }
}
