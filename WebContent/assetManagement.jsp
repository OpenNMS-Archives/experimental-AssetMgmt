<html>
	<head>
		<title>OpenNMS Asset Management using JSF Technology</title>
		<link rel="stylesheet" type="text/css" href="styles/styleSheet.css">
	</head>
	<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
	<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
	<body bgcolor="white">
	
	<jsp:include page="styles/header.html" />
	
	<f:view>
		<h:form>
			
			<h:commandButton value = "Assets" disabled="#{! dbconfig.configured}" action = "#{assetManagementDirector.showAssets}" />
			<h:commandButton value = "Categories" disabled="#{! dbconfig.configured}" action = "#{assetManagementDirector.showCategories}" />
			<h:commandButton value = "Manufacturers" disabled="#{! dbconfig.configured}" action = "#{assetManagementDirector.showManufacturers}" />
			<h:commandButton value = "Operating Systems" disabled="#{! dbconfig.configured}" action = "#{assetManagementDirector.showOperatingSystems}" />
			<h:commandButton value = "Vendors" disabled="#{! dbconfig.configured}" action = "#{assetManagementDirector.showVendors}" />
			<h:commandButton value = "Nodes" disabled="#{! dbconfig.configured}" action = "#{assetManagementDirector.showNodes}" />
			<h:commandButton value = "Agents" disabled="#{! dbconfig.configured}" action = "#{assetManagementDirector.showAgents}" />
			<h:commandButton value = "Database Configuration" rendered="#{!dbconfig.configured}" action = "#{assetManagementDirector.configureDatabase}" />
			
		</h:form>
	</f:view>
	</body>
</html>
