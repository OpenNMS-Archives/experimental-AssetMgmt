<!--
 Copyright 2004 Blast Consulting, Inc. All Rights Reserved.
-->

<html>
	<head>
		<title>OpenNMS Asset Management:Asset List</title>
		<link rel="stylesheet" type="text/css" href="styles/styleSheet.css">
	</head>
	<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
	<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
	<%@ taglib uri="http://myfaces.sourceforge.net/tld/myfaces_ext_0_9.tld" prefix="x"%>
	<body bgcolor="white">
		
		<jsp:include page="styles/header.html" />
		
		<f:view>
			
			<h:form>
				<p>
				<h:panelGrid styleClass="table" columns="2"  >
					<h:outputText styleClass="layoutLabel" value="Displayed Assets matching: " />
					<h:outputText styleClass="layoutField" rendered = "#{empty currentCriteria}" value = "All" />
					<h:dataTable id="criteriaTable" rendered = "#{! empty currentCriteria}" value = "#{currentCriteria}" var = "criterion"
					>
						<h:column>
							<h:outputText styleClass="layoutField" value = "#{criterion.propertyName}" />
						</h:column>
						<h:column>
							<h:outputText styleClass="layoutField" value = "#{criterion.operation}" />
						</h:column>
						<h:column>
							<h:outputText styleClass="layoutField" value = "#{criterion.value.name}" />
						</h:column>
					</h:dataTable>
					<h:commandLink styleClass="layoutField" rendered = "#{! empty currentCriteria}" action = "#{assetManagementDirector.showAssets}" >
						<h:outputText value = "Show All" />
					</h:commandLink>
				</h:panelGrid>
				<p>
				<h:dataTable id="assetTable" rows="10" value = "#{assetManager.matchingAssets}" var = "asset"
				styleClass="assetTable table"
				headerClass="assetTableHeader tableHeader" footerClass="assetTableFooter tableFooter"
				rowClasses="assetEvenRow evenRow, assetOddRow oddRow" columnClasses="layoutField"
				>
					<h:column >
						<h:selectBooleanCheckbox value = "#{asset.selected}"/>
					</h:column>
					<h:column >
						<f:facet name="header">
							<h:outputText value = "ID"/>
						</f:facet>
						<h:outputText value = "#{asset.id}"/>
					</h:column>
					<h:column >
						<f:facet name="header">
							<h:outputText value = "Node"/>
						</f:facet>
						<h:outputText styleClass="layoutField" value = "#{asset.node.nodelabel}"/>
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value = "Category"/>
						</f:facet>
						<h:outputText value = "#{asset.assetCategory.name}"/>
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value = "Manufacturer"/>
						</f:facet>
						<h:outputText value = "#{asset.manufacturer.name}"/>
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value = "OS"/>
						</f:facet>
						<h:outputText value = "#{asset.operatingSystem.name}"/>
					</h:column>
					<h:column>
						<f:facet name="header">
							<h:outputText value = "Vendor"/>
						</f:facet>
						<h:outputText value = "#{asset.vendor.name}"/>
					</h:column>
					<h:column >
						<f:facet name="header">
							<h:outputText value = "Modified By"/>
						</f:facet>
						<h:outputText value = "#{asset.userLastModified}"/>
					</h:column>
					<h:column >
						<f:facet name="header">
							<h:outputText value = "Modified On"/>
						</f:facet>
						<h:outputText value = "#{asset.lastModifiedDate}"/>
					</h:column>
					<h:column >
						<f:facet name="header">
							<h:outputText value = "Edit"/>
						</f:facet>
						<h:commandButton value = "Edit" action = "#{asset.edit}" immediate = "true" />
					</h:column>
				</h:dataTable>
				<x:dataScroller id="assetScroller"
				for="assetTable"
				fastStep="5"
				pageCountVar="pageCount"
				pageIndexVar="pageIndex"
				styleClass="scroller"
				paginator="true"
				paginatorMaxPages="9"
				paginatorTableClass="paginator"
				paginatorActiveColumnStyle="font-weight:bold;"
				>
					<f:facet name="first" >
						<h:outputText value="|<" />
					</f:facet>
					<f:facet name="fastrewind">
						<h:outputText value="<<" />
					</f:facet>
					<f:facet name="previous">
						<h:outputText value="<" />
					</f:facet>
					<f:facet name="next">
						<h:outputText value=">" />
					</f:facet>
					<f:facet name="fastforward">
						<h:outputText value=">>" />
					</f:facet>
					<f:facet name="last">
						<h:outputText value=">|" />
					</f:facet>
				</x:dataScroller>
				<x:dataScroller id="pageCounter"
				for="assetTable"
				pageCountVar="pageCount"
				pageIndexVar="pageIndex"
				>
					<h:outputFormat value="Page {0} of {1}" styleClass="standard" >
						<f:param value="#{pageIndex}" />
						<f:param value="#{pageCount}" />
					</h:outputFormat>
				</x:dataScroller>
				
				
				<h:commandButton value = "New Asset" action = "#{assetManager.newAsset}" immediate = "true" />
				<h:commandButton value = "Delete Selected" action = "#{assetManager.deleteSelected}" />
				<h:commandButton value = "Clear Selected" action = "#{assetManager.clearSelected}" />
				<h:commandButton value = "Select All" action = "#{assetManager.selectAll}" />
				<h:commandButton value = "Done" action = "showAssetHome" />
				
			</h:form>
		</f:view>
	</body>
</html>
