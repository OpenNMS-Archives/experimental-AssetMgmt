<html>
	<head>
		<title>OpenNMS Asset Management:Node</title>
		<link rel="stylesheet" type="text/css" href="styles/styleSheet.css">
	</head>
	<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
	<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
	<body bgcolor="white">

		<jsp:include page="styles/header.html" />

		<f:view>
			<h:form >
				
				<h:panelGrid id = "grid3" columns = "2" >
					
					<h:panelGroup id = "locationgroup" >
						<h:panelGrid id = "locationinfo" columns = "4" >
							
							<f:facet name = "header">
								<h:panelGroup>
									<h:outputText value = "Location Information" style = "font-weight: bold" />
								</h:panelGroup>
							</f:facet >
							
							<h:outputLabel for = "rack" value = "Node ID: " />
							<h:inputText id = "rack" title = "Rack" value = "#{curretNode.nodeid}" />
							
							<h:outputLabel for = "slot" value = "Node Label: " />
							<h:inputText id = "slot" title = "Slot" value = "#{curretNode.nodelabel}" />
							
							<h:outputLabel for = "region" value = "Node Type: " />
							<h:inputText id = "region" title = "Region" value = "#{curretNode.nodetype}" />
							
							<h:outputLabel for = "department" value = "sysObjectID: " />
							<h:inputText id = "department" title = "Department" value = "#{curretNode.nodesysoid}" />
							
							<h:outputLabel for = "division" value = "sysName: " />
							<h:inputText id = "division" title = "Division" value = "#{curretNode.nodesysname}" />
							<%--
										<h:outputLabel for = "address1" value = "Address 1 " />
										<h:inputText id = "address1" title = "Address 1" value = "#{curretNode.address1}" />
										<h:outputLabel for = "address2" value = "Address 2 " />
										<h:inputText id = "address2" title = "Address 2" value = "#{curretNode.address2}" />
										<h:outputLabel for = "city" value = "City " />
										<h:inputText id = "city" title = "City" value = "#{curretNode.city}" />
										<h:outputLabel for = "state" value = "State " />
										<h:inputText id = "state" title = "State" value = "#{curretNode.state}" />
										<h:outputLabel for = "zip" value = "Zip " />
										<h:inputText id = "zip" title = "Zip" value = "#{curretNode.zip}" />
										<h:outputLabel for = "building" value = "Building " />
										<h:inputText id = "building" title = "Building" value = "#{curretNode.building}" />
										<h:outputLabel for = "floor" value = "Floor " />
										<h:inputText id = "floor" title = "Floor" value = "#{curretNode.floor}" />
							--%>
						</h:panelGrid>
					</h:panelGroup>
					
				</h:panelGrid>
				
				
				
				<%--
						<h:panelGrid >
							<h:outputLabel for = "notifycategory" value = "Notification Category  " />
							<h:inputText id = "notifycategory" title = "Notification Category" value = "#{curretNode.notifyCategory}" />
							<h:outputLabel for = "pollercategory" value = "Poller Category  " />
							<h:inputText id = "pollercategory" title = "Poller Category" value = "#{curretNode.pollerCategory}" />
							<h:outputLabel for = "thresholdcategory" value = "Threshold Category  " />
							<h:inputText id = "thresholdcategory" title = "Threshold Category" value = "#{curretNode.thresholdCategory}" />
						</h:panelGrid>
				--%>
				
				<p><hr>
				
				<h:commandButton value="Apply"  action="#{curretNode.apply}"/>
				<h:commandButton value="Done"   action="#{curretNode.done}"/>
				<h:commandButton value="Cancel" action="#{curretNode.cancel}"/>
				
			</h:form>
		</f:view>
	</body>
</html>
