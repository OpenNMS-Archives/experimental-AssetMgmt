<!--
 Copyright 2004 Blast Consulting, Inc. All Rights Reserved.

-->

<html>
	<head>
		<title>OpenNMS Asset Management:Node List</title>
		<link rel="stylesheet" type="text/css" href="styles/styleSheet.css">
	</head>
	<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
	<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
	<%@ taglib uri="http://myfaces.sourceforge.net/tld/myfaces_ext_0_9.tld" prefix="x"%>
	<body bgcolor="white">

		<jsp:include page="styles/header.html" />

		<f:view>
			
			<h:form>
				<h:dataTable id="nodeTable" rows="10" value = "#{nodeManager.all}" var = "node"
				styleClass="nodeTable table"
				headerClass="nodeTableHeader tableHeader" footerClass="nodeTableFooter tableFooter"
				rowClasses="nodeEvenRow evenRow, nodeOddRow oddRow"
				>
				
					<h:column >
						<h:selectBooleanCheckbox value = "#{node.selected}"/>
					</h:column>

					<h:column >
						<f:facet name="header">
							<h:outputText value = "ID"/>
						</f:facet>
						<h:outputText value = "#{node.nodeid}"/>
					</h:column>

					<h:column >
						<f:facet name="header">
							<h:outputText value = "Node Label"/>
						</f:facet>
						<h:commandLink action = "#{node.showAssets}" >
							<h:outputText value = "#{node.nodelabel}"/>
						</h:commandLink>
					</h:column>

				</h:dataTable>

				<x:dataScroller id="nodeScroller"
				for="nodeTable"
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
				for="nodeTable"
				pageCountVar="pageCount"
				pageIndexVar="pageIndex"
				>
					<h:outputFormat value="Page {0} of {1}" styleClass="standard" >
						<f:param value="#{pageIndex}" />
						<f:param value="#{pageCount}" />
					</h:outputFormat>
				</x:dataScroller>

				<h:commandButton value = "Delete Selected" action = "#{nodeManager.deleteSelected}" />
				<h:commandButton value = "Clear Selected" action = "#{nodeManager.clearSelected}" />
				<h:commandButton value = "Select All" action = "#{nodeManager.selectAll}" />
				<h:commandButton value = "Done" action = "showAssetHome" />

				
			</h:form>
		</f:view>
	</body>
</html>
