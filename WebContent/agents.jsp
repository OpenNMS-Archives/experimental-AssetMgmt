<!--
 Copyright 2004 Blast Consulting, Inc. All Rights Reserved.
-->

<html>
	<head>
		<title>OpenNMS Asset Management: Agents</title>
		<link rel="stylesheet" type="text/css" href="styles/styleSheet.css">
	</head>
	<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
	<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
	<%@ taglib uri="http://myfaces.sourceforge.net/tld/myfaces_ext_0_9.tld" prefix="x"%>
	
	<body bgcolor="white">
		
		<jsp:include page="styles/header.html" />
		
		<f:view>
			<h:form>
				<h:dataTable id="agentTable" rows="10" value = "#{agentManager.all}" var = "agent" styleClass="categoryTable table"
				headerClass="categoryTableHeader tableHeader" footerClass="categoryTableFooter tableFooter"
				rowClasses="categoryEvenRow evenRow, categoryOddRow oddRow"
				>
					
					
					<h:column >
						<h:selectBooleanCheckbox value = "#{agent.selected}"/>
					</h:column>
					
					<h:column id="ID">
						<f:facet name="header">
							<h:outputText value = "ID"/>
						</f:facet>
						<h:outputText value = "#{agent.id}"/>
					</h:column>

					<h:column id="agent">
						<f:facet name="header">
							<h:outputText value = "Agent"/>
						</f:facet>
						<h:commandLink rendered="#{! agent.editing}" action="#{agent.showAssets}" >
							<h:outputText value = "#{agent.name}"/>
						</h:commandLink>
						<h:inputText rendered="#{agent.editing}" value="#{agent.name}" />
					</h:column>
					
					<h:column >
						<h:commandButton rendered="#{agent.editing}" value = "Save" action = "#{agent.save}" />
						<h:commandButton rendered="#{! agent.editing}" value = "Edit" action = "#{agent.edit}" />
						<h:commandButton rendered="#{agent.editing}" value = "Cancel" action = "#{agent.cancel}" />
					</h:column>
					<h:column >
					</h:column>
				</h:dataTable>
				<x:dataScroller id="agentScroller"
				for="agentTable"
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
				<x:dataScroller id="agentPageCounter"
				for="agentTable"
				pageCountVar="pageCount"
				pageIndexVar="pageIndex"
				>
					<h:outputFormat value="Page {0} of {1}" styleClass="standard" >
						<f:param value="#{pageIndex}" />
						<f:param value="#{pageCount}" />
					</h:outputFormat>
				</x:dataScroller>
				
				<h:commandButton value = "New Agent" action = "#{agentManager.newItem}" />
				<h:commandButton value = "Delete Selected" action = "#{agentManager.deleteSelected}" />
				<h:commandButton value = "Clear Selected" action = "#{agentManager.clearSelected}" />
				<h:commandButton value = "Select All" action = "#{agentManager.selectAll}" />
				<h:commandButton value = "Done" action = "showAssetHome" />
				
			</h:form>
		</f:view>
	</body>
</html>
