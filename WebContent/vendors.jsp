<!--
 Copyright 2004 Sun Microsystems, Inc. All Rights Reserved.
 
 Redistribution and use in source and binary forms, with or
 without modification, are permitted provided that the following
 conditions are met:
 
 - Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
 
 - Redistribution in binary form must reproduce the above
   copyright notice, this list of conditions and the following
   disclaimer in the documentation and/or other materials
   provided with the distribution.
    
 Neither the name of Sun Microsystems, Inc. or the names of
 contributors may be used to endorse or promote products derived
 from this software without specific prior written permission.
  
 This software is provided "AS IS," without a warranty of any
 kind. ALL EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND
 WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY
 EXCLUDED. SUN AND ITS LICENSORS SHALL NOT BE LIABLE FOR ANY
 DAMAGES OR LIABILITIES SUFFERED BY LICENSEE AS A RESULT OF OR
 RELATING TO USE, MODIFICATION OR DISTRIBUTION OF THIS SOFTWARE OR
 ITS DERIVATIVES. IN NO EVENT WILL SUN OR ITS LICENSORS BE LIABLE
 FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT, INDIRECT,
 SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER
 CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF
 THE USE OF OR INABILITY TO USE THIS SOFTWARE, EVEN IF SUN HAS
 BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
  
 You acknowledge that this software is not designed, licensed or
 intended for use in the design, construction, operation or
 maintenance of any nuclear facility.
-->

<HTML>
    <HEAD> 
       <title>OpenNMs Asset Management: Vendors</title> 
       <link rel="stylesheet" type="text/css" href="styles/styleSheet.css">
    </HEAD>
    <%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
    <%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
    <%@ taglib uri="http://myfaces.sourceforge.net/tld/myfaces_ext_0_9.tld" prefix="x"%>

    <body bgcolor="white">

		<jsp:include page="styles/header.html" />

    <f:view>
     <h:form>
         <h:dataTable id="vendorTable" rows="10" value = "#{vendorManager.all}" var = "vendor"
            styleClass="vendorTable table"
     	    headerClass="vendorTableHeader tableHeader" footerClass="vendorTableFooter tableFooter"
     	    rowClasses="vendorEvenRow evenRow, vendorOddRow oddRow"
         >
         
           <h:column >
           		<h:selectBooleanCheckbox value = "#{vendor.selected}"/>
           </h:column>
           <h:column >
           		<f:facet name="header">
           			<h:outputText value = "ID"/>
           		</f:facet>
           		<h:outputText value = "#{vendor.id}"/>
           </h:column>
           <h:column >
           		<f:facet name="header">
           			<h:outputText value = "Vendor"/>
           		</f:facet>
           		<h:inputText readonly="#{! vendor.editing}" value = "#{vendor.name}"/>
           </h:column>
           <h:column >
           		<f:facet name="header">
           			<h:outputText value = "Phone"/>
           		</f:facet>
           		<h:inputText readonly="#{! vendor.editing}" value = "#{vendor.vendorPhone}"/>
           </h:column>
           <h:column >
           		<f:facet name="header">
           			<h:outputText value = "Fax"/>
           		</f:facet>
           		<h:inputText readonly="#{! vendor.editing}" value = "#{vendor.vendorFax}"/>
           </h:column>
           <h:column >
           		<f:facet name="header">
           			<h:outputText value = "Asset Number"/>
           		</f:facet>
           		<h:inputText readonly="#{! vendor.editing}" value = "#{vendor.vendorAssetNumber}"/>
           </h:column>
           <h:column >
                <h:commandButton rendered="#{! vendor.editing}" value = "Assets" action = "#{vendor.showAssets}" />
           		<h:commandButton rendered="#{vendor.editing}" value = "Save" action = "#{vendor.save}" />
           </h:column>
           <h:column >
           		<h:commandButton rendered="#{! vendor.editing}" value = "Edit" action = "#{vendor.edit}" />
           		<h:commandButton rendered="#{vendor.editing}" value = "Cancel" action = "#{vendor.cancel}" />
           </h:column>
         </h:dataTable>
          <x:dataScroller id="vendorScroller"
                            for="vendorTable"
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
                    <x:dataScroller id="vendorPageCounter"
                            for="vendorTable"
                            pageCountVar="pageCount"
                            pageIndexVar="pageIndex"
                            >
                        <h:outputFormat value="Page {0} of {1}" styleClass="standard" >
                            <f:param value="#{pageIndex}" />
                            <f:param value="#{pageCount}" />
                        </h:outputFormat>
                    </x:dataScroller>
         
         <h:commandButton value = "New Vendor" action = "#{vendorManager.newItem}" />
         <h:commandButton value = "Delete Selected" action = "#{vendorManager.deleteSelected}" />
         <h:commandButton value = "Clear Selected" action = "#{vendorManager.clearSelected}" />
         <h:commandButton value = "Select All" action = "#{vendorManager.selectAll}" />
         <h:commandButton value = "Done" action = "showAssetHome" />
 
     </h:form>
    </f:view>
    </body>
</HTML>  
