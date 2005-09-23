<!--
 Copyright 2004 Blast Consulting, Inc. All Rights Reserved.
 -->

<HTML>
    <HEAD> 
       <title>OpenNMS Asset Management: Manufacturers</title> 
       <link rel="stylesheet" type="text/css" href="styles/styleSheet.css">
    </HEAD>
    <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
    <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
    <%@ taglib uri="http://myfaces.sourceforge.net/tld/myfaces_ext_0_9.tld" prefix="x"%>
    
    <body bgcolor="white">

		<jsp:include page="styles/header.html" />

    <f:view>
     <h:form>
         <h:dataTable id="manufacturerTable" rows="10" value = "#{manufacturerManager.all}" var = "manufacturer"
            styleClass="manufacturerTable table"
     	    headerClass="manufacturerTableHeader tableHeader" footerClass="manufacturerTableFooter tableFooter"
     	    rowClasses="manufacturerEvenRow evenRow, manufacturerOddRow oddRow"
         >
         
           <h:column >
           		<h:selectBooleanCheckbox value = "#{manufacturer.selected}"/>
           </h:column>
           <h:column >
           		<f:facet name="header">
           			<h:outputText value = "ID"/>
           		</f:facet>
           		<h:outputText value = "#{manufacturer.id}"/>
           </h:column>
 
					<h:column id="manufacturername">
						<f:facet name="header">
							<h:outputText value = "Manufacturer"/>
						</f:facet>
						<h:commandLink rendered="#{! manufacturer.editing}" action="#{manufacturer.showAssets}" >
							<h:outputText value = "#{manufacturer.name}"/>
						</h:commandLink>
						<h:inputText rendered="#{manufacturer.editing}" value="#{manufacturer.name}" />
					</h:column>

           <h:column >
           		<h:commandButton rendered="#{! manufacturer.editing}" value = "Edit" action = "#{manufacturer.edit}" />
           		<h:commandButton rendered="#{manufacturer.editing}" value = "Cancel" action = "#{manufacturer.cancel}" />
           </h:column>
           <h:column >
           		<h:commandButton rendered="#{manufacturer.editing}" value = "Save" action = "#{manufacturer.save}" />
           </h:column>
         </h:dataTable>
         <x:dataScroller id="manufacturerScroller"
                            for="manufacturerTable"
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
                    <x:dataScroller id="manufacturerPageCounter"
                            for="manufacturerTable"
                            pageCountVar="pageCount"
                            pageIndexVar="pageIndex"
                            >
                        <h:outputFormat value="Page {0} of {1}" styleClass="standard" >
                            <f:param value="#{pageIndex}" />
                            <f:param value="#{pageCount}" />
                        </h:outputFormat>
                    </x:dataScroller>
         
         <h:commandButton value = "New Manufacturer" action = "#{manufacturerManager.newItem}" />
         <h:commandButton value = "Delete Selected" action = "#{manufacturerManager.deleteSelected}" />
         <h:commandButton value = "Clear Selected" action = "#{manufacturerManager.clearSelected}" />
         <h:commandButton value = "Select All" action = "#{manufacturerManager.selectAll}" />
         <h:commandButton value = "Done" action = "showAssetHome" />
 
     </h:form>
    </f:view>
    </body>
</HTML>  
