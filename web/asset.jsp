<html>
	<head>
		<title>Assets</title>
		<link rel="stylesheet" type="text/css" href="styles/styleSheet.css">
	</head>
	<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
	<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
	<body bgcolor="white">
		
		<jsp:include page="styles/header.html" />
		
		<f:view >
			<h:form id="assetform">
				
				<h:panelGrid id = "buttons" columns = "3" >
					<h:commandButton value="Apply"  action="#{currentAsset.apply}"/>
					<h:commandButton value="Done"   action="#{currentAsset.done}"/>
					<h:commandButton value="Cancel" action="#{currentAsset.cancel}"/>
				</h:panelGrid>
				
				<hr><p>
				
				
				<h:panelGrid id="toplinegrid" columns="3" styleClass="outerLayoutTable">
					<h:panelGroup id="idgroup">
						<h:outputLabel for = "id" value="Asset ID: "/>
						<h:outputText id = "id" value="#{empty currentAsset.id ? '<NEW>' : currentAsset.id}"/>
					</h:panelGroup>
					
					
					<h:panelGroup id="commentgrp">
						<h:outputText value="Comment: "/>
						<h:inputText styleClass="layoutField layoutField" size = "50" maxlength = "1024" value="#{currentAsset.comment}"/>
					</h:panelGroup>
					
					<h:panelGroup id="retgrp" >
						<h:outputLabel value = "Retired: " />
						<h:selectBooleanCheckbox value = "#{currentAsset.retired}" />
					</h:panelGroup >
				</h:panelGrid>
				
				<p>
				
				<h:panelGrid columns = "2" styleClass="outerLayoutTable" >
					
					<h:panelGroup id = "nodegroup" >
						<h:outputLabel styleClass="layoutLabel" for = "node" value = "Node: " />
						<h:selectOneListbox id = "node" size="4" styleClass="layoutSelectOne layoutField" rendered="#{! currentAsset.editingNode}" value="#{currentAsset.node}">
							<f:selectItems value="#{nodeManager.selections}" />
						</h:selectOneListbox>
						<h:commandButton rendered="#{! currentAsset.editingNode}" value="New"  action="#{currentAsset.createNode}"/>
						<h:inputText styleClass="layoutField layoutSelectOne" rendered="#{currentAsset.editingNode}" value="#{currentAsset.node.nodelabel}" />
					</h:panelGroup>
					
					
					<h:panelGrid columns = "4" styleClass = "innerLayoutTable layoutLabel" >
						<h:outputLabel for = "categorygroup" value="Category: "/>
						<h:panelGroup id = "categorygroup" >
							<h:selectOneMenu styleClass="layoutSelectOne layoutField" rendered="#{! currentAsset.editingCategory}" value="#{currentAsset.assetCategory}">
								<f:selectItems value="#{categoryManager.selections}" />
							</h:selectOneMenu>
							<h:commandButton rendered="#{! currentAsset.editingCategory}" value="New"  action="#{currentAsset.createCategory}"/>
							<h:inputText styleClass="layoutField layoutSelectOne" rendered="#{currentAsset.editingCategory}" value="#{currentAsset.assetCategory.name}" />
						</h:panelGroup>
						
						<h:outputLabel for = "manufacturergroup" value = "Manufacturer: " />
						<h:panelGroup id = "manufacturergroup" >
							<h:selectOneMenu styleClass="layoutSelectOne layoutField" rendered="#{! currentAsset.editingManufacturer}" value="#{currentAsset.manufacturer}">
								<f:selectItems value="#{manufacturerManager.selections}" />
							</h:selectOneMenu>
							<h:commandButton rendered="#{! currentAsset.editingManufacturer}" value="New"  action="#{currentAsset.createManufacturer}"/>
							<h:inputText styleClass="layoutField layoutSelectOne" rendered="#{currentAsset.editingManufacturer}" value="#{currentAsset.manufacturer.name}" />
						</h:panelGroup>
						
						<h:outputLabel for = "osgroup" value="Operating System: "/>
						<h:panelGroup id = "osgroup" >
							<h:selectOneMenu styleClass="layoutSelectOne layoutField" rendered="#{! currentAsset.editingOperatingSystem}" value="#{currentAsset.operatingSystem}">
								<f:selectItems value="#{operatingSystemManager.selections}" />
							</h:selectOneMenu>
							<h:commandButton rendered="#{! currentAsset.editingOperatingSystem}" value="New"  action="#{currentAsset.createOperatingSystem}"/>
							<h:inputText styleClass="layoutField layoutSelectOne" rendered="#{currentAsset.editingOperatingSystem}" value="#{currentAsset.operatingSystem.name}" />
						</h:panelGroup>
						
						<h:outputLabel for = "vendorgroup" value = "Vendor: " />
						<h:panelGroup id = "vendorgroup" >
							<h:selectOneMenu styleClass="layoutSelectOne layoutField" rendered="#{! currentAsset.editingVendor}" value="#{currentAsset.vendor}">
								<f:selectItems value="#{vendorManager.selections}" />
							</h:selectOneMenu>
							<h:commandButton rendered="#{! currentAsset.editingVendor}" value="New"  action="#{currentAsset.createVendor}"/>
							<h:inputText styleClass="layoutField layoutSelectOne" rendered="#{currentAsset.editingVendor}" value="#{currentAsset.vendor.name}" />
						</h:panelGroup>
						
						<h:outputLabel for = "agentgroup" value = "Agent: " />
						<h:panelGroup id = "agentgroup" >
							<h:selectOneMenu styleClass="layoutSelectOne layoutField" rendered="#{! currentAsset.editingAgent}" value="#{currentAsset.agent}">
								<f:selectItems value="#{agentManager.selections}" />
							</h:selectOneMenu>
							<h:commandButton rendered="#{! currentAsset.editingAgent}" value="New"  action="#{currentAsset.createAgent}"/>
							<h:inputText styleClass="layoutField layoutSelectOne" rendered="#{currentAsset.editingAgent}" value="#{currentAsset.agent.name}" />
						</h:panelGroup>
						
					</h:panelGrid>
				</h:panelGrid>
				
				<p>
				
				<h:panelGrid id = "grid2" columns = "2" styleClass="outerLayoutTable layoutLabel" >
					
					<h:panelGroup id = "identificationgroup" >
						<h:panelGrid id = "identificationpanel" columns = "2" styleClass="innerLayoutTable layoutLabel">
							<%--
							
														<f:facet name = "header">
															<h:panelGroup>
																<h:outputText value = "Identification Information" styleClass="layoutHeader" />
															</h:panelGroup>
														</f:facet >
							--%>
							
							<h:outputLabel for = "description" value = "Description: " />
							<h:inputTextarea styleClass="layoutField" id = "description" cols = "34" rows = "4" title = "Asset Description" value="#{currentAsset.description}" />
							
							<h:outputLabel for = "modelnumber" value = "Model Number: " />
							<h:inputText styleClass="layoutField" id = "modelnumber" title = "Model Number" size = "35" value="#{currentAsset.modelNumber}" />
							
							<h:outputLabel for = "serialnumber" value = "Serial Number: " />
							<h:inputText styleClass="layoutField" id = "serialnumber" title = "Serial Number" size = "35" value="#{currentAsset.serialNumber}" />
							
							<h:outputLabel for = "assetnumber" value = "Asset Number: " />
							<h:inputText styleClass="layoutField" id = "assetnumber" title = "Asset Number" size = "35" value = "#{currentAsset.assetNumber}" />
							
						</h:panelGrid>
					</h:panelGroup >
					
					<h:panelGroup id = "contractgroup" >
						<h:panelGrid id = "contractinfo" columns = "2" styleClass="innerLayoutTable layoutLabel" >
							<%--
														<f:facet name = "header">
															<h:panelGroup>
																<h:outputText value = "Contractual Information" styleClass="layoutHeader" />
															</h:panelGroup>
														</f:facet >
							--%>
							<h:outputLabel for = "installed" value = "Installed: " />
							<h:inputText styleClass="layoutField" id = "installed" title = "Installation Date" value = "#{currentAsset.dateInstalled}" />
							
							<h:outputLabel for = "lease" value = "Lease: " />
							<h:inputText styleClass="layoutField" id = "lease" title = "Lease" value = "#{currentAsset.lease}" />
							
							<h:outputLabel for = "leaseexpires" value = "Lease Expires: " />
							<h:inputText styleClass="layoutField" id = "leaseexpires" title = "Lease Expiration Date" value = "#{currentAsset.leaseExpires}" />
							
							<h:outputLabel for = "supportphone" value = "Support Phone #: " />
							<h:inputText styleClass="layoutField" id = "supportphone" title = "Support Phone Number" value = "#{currentAsset.supportPhone}" />
							
							<h:outputLabel for = "contract" value = "Maintenance Contract #: " />
							<h:inputText styleClass="layoutField" id = "contract" title = "Maintenance Contract Number" value = "#{currentAsset.maintenanceContract}" />
							
							<h:outputLabel for = "contractexpires" value = "Maintenance Contract Expires:  " />
							<h:inputText styleClass="layoutField" id = "contractexpires" title = "Maintenance Expiration Date" value = "#{currentAsset.maintenanceContractExpires}" />
							
						</h:panelGrid>
					</h:panelGroup >
					
				</h:panelGrid >
				
				<p>
				
				<h:panelGrid columns = "2" styleClass="outerLayoutTable layoutLabel" >
					<%--
									<f:facet name = "header" >
											<h:outputText value = "General Information" styleClass="layoutHeader" />
									</f:facet>
					--%>
					<h:panelGroup id="misc1">
						<h:panelGrid columns = "2" styleClass="innerLayoutTable layoutLabel" >
							
							<h:outputLabel for = "admin" value = "Administrator: " />
							<h:inputText styleClass="layoutField" id = "admin" value = "#{currentAsset.administrator}" />
							
							<h:outputLabel for = "loghost" value = "Log Host: " />
							<h:inputText styleClass="layoutField" id = "loghost" value = "#{currentAsset.logHost}" />
						</h:panelGrid>
					</h:panelGroup>
					
					<h:panelGroup id="misc2">
						<h:panelGrid columns = "2" styleClass="innerLayoutTable layoutLabel" >
							<h:outputLabel for = "watchgroup" value = "EventWatch Group: " />
							<h:inputText styleClass="layoutField" id = "watchgroup" value = "#{currentAsset.watchGroup}" />
							
							<h:outputLabel for = "ts" value = "Terminal Server: " />
							<h:inputText styleClass="layoutField" id = "ts" value = "#{currentAsset.terminalServer}" />
						</h:panelGrid>
					</h:panelGroup >
					
				</h:panelGrid>
				
				<p>
				
				<h:panelGrid id="locgrid" columns = "3"  styleClass="outerLayoutTable" >
							<%--
														<f:facet name = "header">
															<h:panelGroup>
																<h:outputText value = "Location Information" style = "font-weight: bold" />
															</h:panelGroup>
														</f:facet >
							--%>
							<h:panelGroup id="loc1">
								<h:panelGrid id = "locationinfo" columns = "2" >
								<h:outputLabel styleClass="layoutLabel" for = "building" value = "Building " />
								<h:inputText styleClass="layoutField" id = "building" title = "Building" value = "#{currentAsset.building}" />
								
								<h:outputLabel styleClass="layoutLabel" for = "floor" value = "Floor " />
								<h:inputText styleClass="layoutField" id = "floor" title = "Floor" value = "#{currentAsset.floor}" />
								
								<h:outputLabel styleClass="layoutLabel" for = "rack" value = "Rack " />
								<h:inputText styleClass="layoutField" id = "rack" title = "Rack" value = "#{currentAsset.rack}" />
								
								<h:outputLabel styleClass="layoutLabel" for = "slot" value = "Slot " />
								<h:inputText styleClass="layoutField" id = "slot" title = "Slot" value = "#{currentAsset.slot}" />
								</h:panelGrid>						
							</h:panelGroup>
							
							<h:panelGroup id="loc2">
								<h:panelGrid id = "addrinfo" columns = "2" >

								<h:outputLabel styleClass="layoutLabel" for = "region" value = "Region " />
								<h:inputText styleClass="layoutField" id = "region" title = "Region" value = "#{currentAsset.region}" />
								
								<h:outputLabel styleClass="layoutLabel" for = "division" value = "Division " />
								<h:inputText styleClass="layoutField" id = "division" title = "Division" value = "#{currentAsset.division}" />
								
								<h:outputLabel styleClass="layoutLabel" for = "department" value = "Department " />
								<h:inputText styleClass="layoutField" id = "department" title = "Department" value = "#{currentAsset.department}" />
								
								</h:panelGrid >
							</h:panelGroup >
							
							<h:panelGroup id="loc3">
								<h:panelGrid id = "addr2info" columns = "2" >

								<h:outputLabel styleClass="layoutLabel" for = "address1" value = "Address 1 " />
								<h:inputText styleClass="layoutField" id = "address1" title = "Address 1" value = "#{currentAsset.address1}" />
								
								<h:outputLabel styleClass="layoutLabel" for = "address2" value = "Address 2 " />
								<h:inputText styleClass="layoutField" id = "address2" title = "Address 2" value = "#{currentAsset.address2}" />

								<h:outputLabel styleClass="layoutLabel" for = "city" value = "City " />
								<h:inputText styleClass="layoutField" id = "city" title = "City" value = "#{currentAsset.city}" />
								
								<h:outputLabel styleClass="layoutLabel" for = "state" value = "State " />
								<h:inputText styleClass="layoutField" id = "state" title = "State" value = "#{currentAsset.state}" />
								
								<h:outputLabel styleClass="layoutLabel" for = "zip" value = "Zip " />
								<h:inputText styleClass="layoutField" id = "zip" title = "Zip" value = "#{currentAsset.zip}" />
								</h:panelGrid >
							</h:panelGroup>
							
						</h:panelGrid>
					</h:panelGroup>
					
				</h:panelGrid>

				<p>
				
				<h:panelGrid id="bools" columns="12" styleClass="outerLayoutTable" >

				<h:outputLabel styleClass="layoutLabel" for = "syslog" value = "Syslog: " />
				<h:selectBooleanCheckbox id = "syslog" value = "#{currentAsset.syslog}" />
				
				<h:outputLabel styleClass="layoutLabel" for = "ciscoworks" value = "CiscoWorks: " />
				<h:selectBooleanCheckbox id = "ciscoworks" value = "#{currentAsset.ciscoworks}" />
				
				<h:outputLabel styleClass="layoutLabel" for = "ntp" value = "NTP: " />
				<h:selectBooleanCheckbox id = "ntp" value = "#{currentAsset.ntp}" />
				
				<h:outputLabel styleClass="layoutLabel" for = "endpoint" value = "End Point: " />
				<h:selectBooleanCheckbox id = "endpoint" value = "#{currentAsset.endPoint}" />
				
				<h:outputLabel styleClass="layoutLabel" for = "backup" value = "Backup: " />
				<h:selectBooleanCheckbox id = "backup" value = "#{currentAsset.backup}" />
				
				<h:outputLabel styleClass="layoutLabel" for = "nethealth" value = "Concord NetHealth: " />
				<h:selectBooleanCheckbox id = "nethealth" value = "#{currentAsset.netHealth}" />
				</h:panelGrid>
				
				<%--
						<h:panelGrid >
							<h:outputLabel for = "notifycategory" value = "Notification Category  " />
							<h:inputText styleClass="layoutField" id = "notifycategory" title = "Notification Category" value = "#{currentAsset.notifyCategory}" />
							<h:outputLabel for = "pollercategory" value = "Poller Category  " />
							<h:inputText styleClass="layoutField" id = "pollercategory" title = "Poller Category" value = "#{currentAsset.pollerCategory}" />
							<h:outputLabel for = "thresholdcategory" value = "Threshold Category  " />
							<h:inputText styleClass="layoutField" id = "thresholdcategory" title = "Threshold Category" value = "#{currentAsset.thresholdCategory}" />
						</h:panelGrid>
				--%>
				
				<p><hr>
				
				<h:commandButton value="Apply"  action="#{currentAsset.apply}"/>
				<h:commandButton value="Done"   action="#{currentAsset.done}"/>
				<h:commandButton value="Cancel" action="#{currentAsset.cancel}"/>
				
			</h:form>
		</f:view>
	</body>
</html>
