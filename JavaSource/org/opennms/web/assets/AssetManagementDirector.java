/*
 * Created on Aug 10, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.opennms.web.assets;

import javax.faces.context.FacesContext;

/**
 * @author david
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class AssetManagementDirector {
	
	public String showAssets() {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove(AssetSelector.CURRENT_CRITERIA);
		return "showAssets";
	}
	
	public String showCategories() {
		return "showCategories";
	}

	public String showManufacturers() {
		return "showManufacturers";
	}

	public String showOperatingSystems() {
		return "showOperatingSystems";
	}

	public String showVendors() {
		return "showVendors";
	}
	
	public String showNodes() {
		return "showNodes";
	}
    
	public String showAgents() {
		return "showAgents";
	}

	public String configureDatabase() {
        return "configureDatabase";
    }
	
}
