<!--
 Copyright 2004 Blast Consulting, Inc. All Rights Reserved.
 -->

<html>
	<head>
		<title>OpenNMs Asset Management: Operating Systems</title>
		<link rel="stylesheet" type="text/css" href="styles/styleSheet.css">
	</head>
	<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
	<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
	<%@ taglib uri="http://myfaces.sourceforge.net/tld/myfaces_ext_0_9.tld" prefix="x"%>
	
	<body bgcolor="white">
		
		<jsp:include page="styles/header.html" />
		
		<f:view>
			<h:form>
				<h:dataTable id="osTable" rows="10" value = "#{operatingSystemManager.all}" var = "operatingSystem"
				styleClass="osTable table"
				headerClass="osTableHeader tableHeader" footerClass="osTableFooter tableFooter"
				rowClasses="osEvenRow evenRow, osOddRow oddRow"
				>
					
					<h:column >
						<h:selectBooleanCheckbox value = "#{operatingSystem.selected}"/>
					</h:column>
					<h:column >
						<f:facet name="header">
							<h:outputText value = "ID"/>
						</f:facet>
						<h:outputText value = "#{operatingSystem.id}"/>
					</h:column>
					
					<h:column id="os">
						<f:facet name="header">
							<h:outputText value = "Operating System"/>
						</f:facet>
						<h:commandLink rendered="#{! operatingSystem.editing}" action="#{operatingSystem.showAssets}" >
							<h:outputText value = "#{operatingSystem.name}"/>
						</h:commandLink>
						<h:inputText rendered="#{operatingSystem.editing}" value="#{operatingSystem.name}" />
					</h:column>
					
					<h:column >
						<h:commandButton rendered="#{! operatingSystem.editing}" value = "Edit" action = "#{operatingSystem.edit}" />
						<h:commandButton rendered="#{operatingSystem.editing}" value = "Cancel" action = "#{operatingSystem.cancel}" />
					</h:column>
					<h:column >
						<h:commandButton rendered="#{! operatingSystem.editing}" value = "Assets" action = "#{operatingSystem.showAssets}" />
						<h:commandButton rendered="#{operatingSystem.editing}" value = "Save" action = "#{operatingSystem.save}" />
					</h:column>
				</h:dataTable>
				<x:dataScroller id="osScroller"
				for="osTable"
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
				<x:dataScroller id="osPageCounter"
				for="osTable"
				pageCountVar="pageCount"
				pageIndexVar="pageIndex"
				>
					<h:outputFormat value="Page {0} of {1}" styleClass="standard" >
						<f:param value="#{pageIndex}" />
						<f:param value="#{pageCount}" />
					</h:outputFormat>
				</x:dataScroller>
				
				<h:commandButton value = "New OS" action = "#{operatingSystemManager.newItem}" />
				<h:commandButton value = "Delete Selected" action = "#{operatingSystemManager.deleteSelected}" />
				<h:commandButton value = "Clear Selected" action = "#{operatingSystemManager.clearSelected}" />
				<h:commandButton value = "Select All" action = "#{operatingSystemManager.selectAll}" />
				<h:commandButton value = "Done" action = "showAssetHome" />
				
			</h:form>
		</f:view>
	</body>
</html>
