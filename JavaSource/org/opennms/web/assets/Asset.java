package org.opennms.web.assets;

import java.io.Serializable;
import java.util.Date;
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
public class Asset implements Serializable {

	/** identifier field */
	private java.lang.Integer id;

	/** nullable persistent field */
	private java.lang.String modelNumber;

	/** nullable persistent field */
	private java.lang.String serialNumber;

	/** nullable persistent field */
	private java.lang.String description;

	/** nullable persistent field */
	private java.lang.String circuitId;

	/** nullable persistent field */
	private java.lang.String assetNumber;

	/** nullable persistent field */
	private java.lang.String rack;

	/** nullable persistent field */
	private java.lang.String slot;

	/** nullable persistent field */
	private java.lang.String port;

	/** nullable persistent field */
	private java.lang.String region;

	/** nullable persistent field */
	private java.lang.String division;

	/** nullable persistent field */
	private java.lang.String department;

	/** nullable persistent field */
	private java.lang.String address1;

	/** nullable persistent field */
	private java.lang.String address2;

	/** nullable persistent field */
	private java.lang.String city;

	/** nullable persistent field */
	private java.lang.String state;

	/** nullable persistent field */
	private java.lang.String zip;

	/** nullable persistent field */
	private java.lang.String building;

	/** nullable persistent field */
	private java.lang.String floor;

	/** nullable persistent field */
	private java.lang.String room;

	/** persistent field */
	private java.lang.String userLastModified;

	/** persistent field */
	private java.util.Date lastModifiedDate;

	/** nullable persistent field */
	private java.lang.String dateInstalled;

	/** nullable persistent field */
	private java.lang.String lease;

	/** nullable persistent field */
	private java.lang.String leaseExpires;

	/** nullable persistent field */
	private java.lang.String supportPhone;

	/** nullable persistent field */
	private java.lang.String maintenanceContract;

	/** nullable persistent field */
	private java.lang.String maintenanceContractExpires;

	/** nullable persistent field */
	private java.lang.String displayCategory;

	/** nullable persistent field */
	private java.lang.String notifyCategory;

	/** nullable persistent field */
	private java.lang.String pollerCategory;

	/** nullable persistent field */
	private java.lang.String thresholdCategory;

	/** nullable persistent field */
	private java.lang.String comment;
	
	/** nullable persistent field */
	private java.lang.String administrator;
	
	/** nullable persistent field */
	private java.lang.Boolean netHealth;
	
	/** nullable persistent field */
	private java.lang.Boolean endPoint;
	
	/** nullable persistent field */
	private java.lang.String logHost;
	
	/** nullable persistent field */
	private java.lang.String watchGroup;
	
	/** nullable persistent field */
	private java.lang.String terminalServer;
	
	/** nullable persistent field */
	private java.lang.Boolean backup;
	
	/** nullable persistent field */
	private Boolean retired;
	
	/** nullable persistent field */
	private Boolean ciscoworks;
	
	/** nullable persistent field */
	private Boolean ntp;
	
	/** nullable persistent field */
	private Boolean syslog;
	
	/**
	 * @return Returns the ciscoworks.
	 */
	public Boolean isCiscoworks() {
		return ciscoworks;
	}
	
	public Boolean getCiscoworks() {
		return ciscoworks;
	}
	/**
	 * @param ciscoworks The ciscoworks to set.
	 */
	public void setCiscoworks(Boolean ciscoworks) {
		this.ciscoworks = ciscoworks;
	}
	/**
	 * @return Returns the ntp.
	 */
	public Boolean isNtp() {
		return ntp;
	}
	
	/**
	 * @param ntp The ntp to set.
	 */
	public void setNtp(Boolean ntp) {
		this.ntp = ntp;
	}
	
	public Boolean getNtp() {
		return ntp;
	}
	
	/**
	 * @return Returns the retired.
	 */
	public Boolean isRetired() {
		return retired;
	}
	
	public Boolean getRetired() {
		return retired;
	}
	/**
	 * @param retired The retired to set.
	 */
	public void setRetired(Boolean retired) {
		this.retired = retired;
	}
	/**
	 * @return Returns the syslog.
	 */
	public Boolean isSyslog() {
		return syslog;
	}
	
	public Boolean getSyslog() {
		return syslog;
	}
	
	/**
	 * @param syslog The syslog to set.
	 */
	public void setSyslog(Boolean syslog) {
		this.syslog = syslog;
	}
	/** persistent field */
	private org.opennms.web.assets.AssetCategory assetCategory;

	/** persistent field */
	private org.opennms.web.assets.Node node;

	/** persistent field */
	private org.opennms.web.assets.Manufacturer manufacturer;

	/** persistent field */
	private org.opennms.web.assets.Vendor vendor;

	/** persistent field */
	private org.opennms.web.assets.OperatingSystem operatingSystem;

	/** persistent field */
	private org.opennms.web.assets.Agent agent;

	/** track editing state of lookup fields **/
	private boolean editingCategory = false;

	private boolean editingManufacturer = false;

	private boolean editingOperatingSystem = false;

	private boolean editingVendor = false;
	
	private boolean editingNode = false;
	
	private boolean editingAgent = false;

	/** full constructor */
	public Asset(java.lang.String modelNumber, java.lang.String serialNumber,
			java.lang.String description, java.lang.String circuitId,
			java.lang.String assetNumber, java.lang.String rack,
			java.lang.String slot, java.lang.String port,
			java.lang.String region, java.lang.String division,
			java.lang.String department, java.lang.String address1,
			java.lang.String address2, java.lang.String city,
			java.lang.String state, java.lang.String zip,
			java.lang.String building, java.lang.String floor,
			java.lang.String room, java.lang.String userLastModified,
			java.util.Date lastModifiedDate, java.lang.String dateInstalled,
			java.lang.String lease, java.lang.String leaseExpires,
			java.lang.String supportPhone,
			java.lang.String maintenanceContract,
			java.lang.String maintenanceContractExpires,
			java.lang.String displayCategory, java.lang.String notifyCategory,
			java.lang.String pollerCategory,
			java.lang.String thresholdCategory, java.lang.String comment,
			org.opennms.web.assets.AssetCategory assetCategory,
			org.opennms.web.assets.Node node,
			org.opennms.web.assets.Manufacturer manufacturer,
			org.opennms.web.assets.Vendor vendor,
			org.opennms.web.assets.OperatingSystem operatingSystem,
			org.opennms.web.assets.Agent agent) {
		this.modelNumber = modelNumber;
		this.serialNumber = serialNumber;
		this.description = description;
		this.circuitId = circuitId;
		this.assetNumber = assetNumber;
		this.rack = rack;
		this.slot = slot;
		this.port = port;
		this.region = region;
		this.division = division;
		this.department = department;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.building = building;
		this.floor = floor;
		this.room = room;
		this.userLastModified = userLastModified;
		this.lastModifiedDate = lastModifiedDate;
		this.dateInstalled = dateInstalled;
		this.lease = lease;
		this.leaseExpires = leaseExpires;
		this.supportPhone = supportPhone;
		this.maintenanceContract = maintenanceContract;
		this.maintenanceContractExpires = maintenanceContractExpires;
		this.displayCategory = displayCategory;
		this.notifyCategory = notifyCategory;
		this.pollerCategory = pollerCategory;
		this.thresholdCategory = thresholdCategory;
		this.comment = comment;
		this.assetCategory = assetCategory;
		this.node = node;
		this.manufacturer = manufacturer;
		this.vendor = vendor;
		this.operatingSystem = operatingSystem;
		this.agent = agent;
	}

	/** default constructor */
	public Asset() {
	}

	/** minimal constructor */
	public Asset(java.lang.String userLastModified,
			java.util.Date lastModifiedDate,
			org.opennms.web.assets.AssetCategory assetCategory,
			org.opennms.web.assets.Node node,
			org.opennms.web.assets.Manufacturer manufacturer,
			org.opennms.web.assets.Vendor vendor,
			org.opennms.web.assets.OperatingSystem operatingSystem) {
		this.userLastModified = userLastModified;
		this.lastModifiedDate = lastModifiedDate;
		this.assetCategory = assetCategory;
		this.node = node;
		this.manufacturer = manufacturer;
		this.vendor = vendor;
		this.operatingSystem = operatingSystem;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.lang.String getModelNumber() {
		return this.modelNumber;
	}

	public void setModelNumber(java.lang.String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public java.lang.String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(java.lang.String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getCircuitId() {
		return this.circuitId;
	}

	public void setCircuitId(java.lang.String circuitId) {
		this.circuitId = circuitId;
	}

	public java.lang.String getAssetNumber() {
		return this.assetNumber;
	}

	public void setAssetNumber(java.lang.String assetNumber) {
		this.assetNumber = assetNumber;
	}

	public java.lang.String getRack() {
		return this.rack;
	}

	public void setRack(java.lang.String rack) {
		this.rack = rack;
	}

	public java.lang.String getSlot() {
		return this.slot;
	}

	public void setSlot(java.lang.String slot) {
		this.slot = slot;
	}

	public java.lang.String getPort() {
		return this.port;
	}

	public void setPort(java.lang.String port) {
		this.port = port;
	}

	public java.lang.String getRegion() {
		return this.region;
	}

	public void setRegion(java.lang.String region) {
		this.region = region;
	}

	public java.lang.String getDivision() {
		return this.division;
	}

	public void setDivision(java.lang.String division) {
		this.division = division;
	}

	public java.lang.String getDepartment() {
		return this.department;
	}

	public void setDepartment(java.lang.String department) {
		this.department = department;
	}

	public java.lang.String getAddress1() {
		return this.address1;
	}

	public void setAddress1(java.lang.String address1) {
		this.address1 = address1;
	}

	public java.lang.String getAddress2() {
		return this.address2;
	}

	public void setAddress2(java.lang.String address2) {
		this.address2 = address2;
	}

	public java.lang.String getCity() {
		return this.city;
	}

	public void setCity(java.lang.String city) {
		this.city = city;
	}

	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	public java.lang.String getZip() {
		return this.zip;
	}

	public void setZip(java.lang.String zip) {
		this.zip = zip;
	}

	public java.lang.String getBuilding() {
		return this.building;
	}

	public void setBuilding(java.lang.String building) {
		this.building = building;
	}

	public java.lang.String getFloor() {
		return this.floor;
	}

	public void setFloor(java.lang.String floor) {
		this.floor = floor;
	}

	public java.lang.String getRoom() {
		return this.room;
	}

	public void setRoom(java.lang.String room) {
		this.room = room;
	}

	public java.lang.String getUserLastModified() {
		return this.userLastModified;
	}

	public void setUserLastModified(java.lang.String userLastModified) {
		this.userLastModified = userLastModified;
	}

	public java.util.Date getLastModifiedDate() {
		return this.lastModifiedDate;
	}

	public void setLastModifiedDate(java.util.Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public java.lang.String getDateInstalled() {
		return this.dateInstalled;
	}

	public void setDateInstalled(java.lang.String dateInstalled) {
		this.dateInstalled = dateInstalled;
	}

	public java.lang.String getLease() {
		return this.lease;
	}

	public void setLease(java.lang.String lease) {
		this.lease = lease;
	}

	public java.lang.String getLeaseExpires() {
		return this.leaseExpires;
	}

	public void setLeaseExpires(java.lang.String leaseExpires) {
		this.leaseExpires = leaseExpires;
	}

	public java.lang.String getSupportPhone() {
		return this.supportPhone;
	}

	public void setSupportPhone(java.lang.String supportPhone) {
		this.supportPhone = supportPhone;
	}

	public java.lang.String getMaintenanceContract() {
		return this.maintenanceContract;
	}

	public void setMaintenanceContract(java.lang.String maintenanceContract) {
		this.maintenanceContract = maintenanceContract;
	}

	public java.lang.String getMaintenanceContractExpires() {
		return this.maintenanceContractExpires;
	}

	public void setMaintenanceContractExpires(
			java.lang.String maintenanceContractExpires) {
		this.maintenanceContractExpires = maintenanceContractExpires;
	}

	public java.lang.String getDisplayCategory() {
		return this.displayCategory;
	}

	public void setDisplayCategory(java.lang.String displayCategory) {
		this.displayCategory = displayCategory;
	}

	public java.lang.String getNotifyCategory() {
		return this.notifyCategory;
	}

	public void setNotifyCategory(java.lang.String notifyCategory) {
		this.notifyCategory = notifyCategory;
	}

	public java.lang.String getPollerCategory() {
		return this.pollerCategory;
	}

	public void setPollerCategory(java.lang.String pollerCategory) {
		this.pollerCategory = pollerCategory;
	}

	public java.lang.String getThresholdCategory() {
		return this.thresholdCategory;
	}

	public void setThresholdCategory(java.lang.String thresholdCategory) {
		this.thresholdCategory = thresholdCategory;
	}

	public java.lang.String getComment() {
		return this.comment;
	}

	public void setComment(java.lang.String comment) {
		this.comment = comment;
	}

	/**
	 * @return Returns the administrator.
	 */
	public java.lang.String getAdministrator() {
		return administrator;
	}
	/**
	 * @param administrator The administrator to set.
	 */
	public void setAdministrator(java.lang.String administrator) {
		this.administrator = administrator;
	}
	/**
	 * @return Returns the backukp.
	 */
	public java.lang.Boolean getBackup() {
		return backup;
	}
	/**
	 * @param backukp The backukp to set.
	 */
	public void setBackup(java.lang.Boolean backup) {
		this.backup = backup;
	}
	/**
	 * @return Returns the endPoint.
	 */
	public java.lang.Boolean getEndPoint() {
		return endPoint;
	}
	/**
	 * @param endPoint The endPoint to set.
	 */
	public void setEndPoint(java.lang.Boolean endPoint) {
		this.endPoint = endPoint;
	}
	/**
	 * @return Returns the logHost.
	 */
	public java.lang.String getLogHost() {
		return logHost;
	}
	/**
	 * @param logHost The logHost to set.
	 */
	public void setLogHost(java.lang.String logHost) {
		this.logHost = logHost;
	}
	/**
	 * @return Returns the netHealth.
	 */
	public java.lang.Boolean getNetHealth() {
		return netHealth;
	}
	/**
	 * @param netHealth The netHealth to set.
	 */
	public void setNetHealth(java.lang.Boolean netHealth) {
		this.netHealth = netHealth;
	}
	/**
	 * @return Returns the terminalServer.
	 */
	public java.lang.String getTerminalServer() {
		return terminalServer;
	}
	/**
	 * @param terminalServer The terminalServer to set.
	 */
	public void setTerminalServer(java.lang.String terminalServer) {
		this.terminalServer = terminalServer;
	}
	/**
	 * @return Returns the watchGroup.
	 */
	public java.lang.String getWatchGroup() {
		return watchGroup;
	}
	/**
	 * @param watchGroup The watchGroup to set.
	 */
	public void setWatchGroup(java.lang.String watchGroup) {
		this.watchGroup = watchGroup;
	}
	public org.opennms.web.assets.AssetCategory getAssetCategory() {
		return this.assetCategory;
	}

	public void setAssetCategory(
			org.opennms.web.assets.AssetCategory assetCategory) {
		this.assetCategory = assetCategory;
	}

	public org.opennms.web.assets.Node getNode() {
		return this.node;
	}

	public void setNode(org.opennms.web.assets.Node node) {
		this.node = node;
	}

	public org.opennms.web.assets.Manufacturer getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(org.opennms.web.assets.Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public org.opennms.web.assets.Vendor getVendor() {
		return this.vendor;
	}

	public void setVendor(org.opennms.web.assets.Vendor vendor) {
		this.vendor = vendor;
	}

	public org.opennms.web.assets.OperatingSystem getOperatingSystem() {
		return this.operatingSystem;
	}

	public void setOperatingSystem(
			org.opennms.web.assets.OperatingSystem operatingSystem) {
		this.operatingSystem = operatingSystem;
	}


	/*
	 * These are the Agent properties
	 */

	/**
	 * @return Returns the agent.
	 */
	public org.opennms.web.assets.Agent getAgent() {
		return agent;
	}
	/**
	 * @param agent The agent to set.
	 */
	public void setAgent(org.opennms.web.assets.Agent agent) {
		this.agent = agent;
	}
	/**
	 * @return Returns the editingAgent.
	 */
	public boolean isEditingAgent() {
		return editingAgent;
	}
	/**
	 * @param editingAgent The editingAgent to set.
	 */
	public void setEditingAgent(boolean editingAgent) {
		this.editingAgent = editingAgent;
	}
	
	public String createAgent() {
		Agent newAgent = new Agent();
		setAgent(newAgent);
		setEditingAgent(true);
		return "showAsset";
	}

	
	public String edit() {
		System.err.println("Enter (" + this + ").edit");
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.put("currentAsset", this);
		String result = "editAsset";
		System.err.println("Exit (" + this + ").edit: result: " + result);
		return result;
	}

	public String apply() throws HibernateException {
		System.err.println("Enter (" + this + ").save");

		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.currentSession();

			tx = session.beginTransaction();

			System.err.println("Updating asset (" + this + ") " + new Date());
             setUserLastModified(FacesContext.getCurrentInstance().getExternalContext().getRemoteUser());
			setLastModifiedDate(new Date());
			session.saveOrUpdate(this);

			tx.commit();
			cancelAllEdits();

			System.err.println("Done creating asset (" + this + ") "
					+ new Date());
			String result = ""; // empty string means show same page
			System.err.println("Exit (" + this + ").save: result: " + result);
			return result;

		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (session != null)
				HibernateUtil.closeSession();
		}
	}

	public String done() throws HibernateException {
		System.err.println("Enter (" + this + ").done");
		apply();
		String result = "success";
		System.err.println("Exit (" + this + ").done: result: " + result);
		return result;
	}

	public String cancel() {
		System.err.println("Enter (" + this + ").cancel");
		String result = "success";
		cancelAllEdits();
		System.err.println("Exit (" + this + ").cancel: result: " + result);
		return result;
	}

	public boolean isSelected() {
		Set selectedAssets = (Set) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get("_selectedAssets");
		if (selectedAssets == null)
			return false;

		return (selectedAssets.contains(this));
	}

	public void setSelected(boolean selected) {
		System.err.println("(" + this + ").setSelected(" + selected + ")");
		if (selected) {
			Set selectedAssets = (Set) FacesContext.getCurrentInstance()
					.getExternalContext().getSessionMap()
					.get("_selectedAssets");
			if (selectedAssets == null) {
				selectedAssets = new HashSet();
				FacesContext.getCurrentInstance().getExternalContext()
						.getSessionMap().put("_selectedAssets", selectedAssets);
			}
			selectedAssets.add(this);
		} else {
			Set selectedAssets = (Set) FacesContext.getCurrentInstance()
					.getExternalContext().getSessionMap()
					.get("_selectedAssets");
			if (selectedAssets != null) {
				selectedAssets.remove(this);
				if (selectedAssets.isEmpty()) {
					FacesContext.getCurrentInstance().getExternalContext()
							.getSessionMap().remove("_selectedAssets");
				}
			}
		}
	}

	private void cancelAllEdits() {
		setEditingCategory(false);
		setEditingManufacturer(false);
		setEditingOperatingSystem(false);
		setEditingVendor(false);
		setEditingNode(false);
	}

	public boolean isEditingNode() {
		return editingNode;
	}
	
	public void setEditingNode(boolean newVal) {
		this.editingNode = newVal;
	}
	
	public boolean isEditingCategory() {
		return editingCategory;
	}
	
	public String createNode() {
		Node newNode = new Node();
		setNode(newNode);
		setEditingNode(true);
		return "showNode";
	}

	private void setEditingCategory(boolean newVal) {
		editingCategory = newVal;
	}

	public String createCategory() {
		AssetCategory newCat = new AssetCategory();
		setAssetCategory(newCat);
		setEditingCategory(true);
		return "showAsset";
	}

	public boolean isEditingManufacturer() {
		return editingManufacturer;
	}

	private void setEditingManufacturer(boolean newVal) {
		editingManufacturer = newVal;
	}

	public String createManufacturer() {
		Manufacturer newManf = new Manufacturer();
		setManufacturer(newManf);
		setEditingManufacturer(true);
		return "showAsset";
	}

	/**
	 * @return Returns the editingOperatingSystem.
	 */
	public boolean isEditingOperatingSystem() {
		return editingOperatingSystem;
	}

	/**
	 * @param editingOperatingSystem The editingOperatingSystem to set.
	 */
	private void setEditingOperatingSystem(boolean editingOperatingSystem) {
		this.editingOperatingSystem = editingOperatingSystem;
	}

	
	public String createOperatingSystem() {
		OperatingSystem newOperatingSystem = new OperatingSystem();
		setOperatingSystem(newOperatingSystem);
		setEditingOperatingSystem(true);
		return "showAsset";
	}

	/**
	 * @return Returns the editingVendor.
	 */
	public boolean isEditingVendor() {
		return editingVendor;
	}

	/**
	 * @param editingVendor The editingVendor to set.
	 */
	private void setEditingVendor(boolean editingVendor) {
		this.editingVendor = editingVendor;
	}

	
	public String createVendor() {
		Vendor newVendor = new Vendor();
		setVendor(newVendor);
		setEditingVendor(true);
		return "showAsset";
	}

	public String toString() {
		return new ToStringBuilder(this).append("id", getId()).toString();
	}

	public boolean equals(Object other) {
		if (!(other instanceof Asset))
			return false;
		Asset castOther = (Asset) other;
		return new EqualsBuilder().append(this.getId(), castOther.getId())
				.isEquals();
	}

	public int hashCode() {
		return new HashCodeBuilder().append(getId()).toHashCode();
	}

}