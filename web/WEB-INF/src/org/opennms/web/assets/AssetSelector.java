/*
 * Created on Aug 10, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.opennms.web.assets;

import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.faces.context.FacesContext;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;
import net.sf.hibernate.Transaction;

/**
 * @author brozow
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class AssetSelector implements Named {

    public static final String CURRENT_CRITERIA = "currentCriteria";
	private String typeName;
    private String assetRelationProperty;
    
    public AssetSelector(String typeName, String assetRelationProperty) {
        this.typeName = typeName;
        this.assetRelationProperty = assetRelationProperty;
    }

    public String edit() {
        System.err.println("Enter ("+this+").edit");
        putSessionVariable(getCurrentObjectKey(), this);
        String result = "edit"+getTypeName();
        System.err.println("Exit ("+this+").edit: result: "+result);
        return result;
    }

    public boolean isEditing() {
        return this.equals(getSessionVariable(getCurrentObjectKey()));
    
    }

    public String save() throws HibernateException {
        System.err.println("Enter ("+this+").save");
        
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.currentSession();
    
            tx= session.beginTransaction();
    
            System.err.println("Updating "+getTypeName()+" ("+this+") "+new Date());
            session.saveOrUpdate(this);
        
            tx.commit();
            
            removeSessionVariable(getCurrentObjectKey());
            System.err.println("Done updating "+getTypeName()+" ("+this+") "+new Date());
            String result = ""; // empty string means show same page
            System.err.println("Exit ("+this+").save: result: "+result);
            return result;
        
        }
        catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            throw e;
        }
        finally {
            if (session != null) HibernateUtil.closeSession();
        }
    }

    public String done() throws HibernateException {
        System.err.println("Enter ("+this+").done");
        save();
        String result = null;
        System.err.println("Exit ("+this+").done: result: "+result);
        return result;
    }

    public String cancel() {
        System.err.println("Enter ("+this+").cancel");
        String key = getCurrentObjectKey();
        removeSessionVariable(key);
        String result = null;
        System.err.println("Exit ("+this+").cancel: result: "+result);
        return result;
    }

    public boolean isSelected() {
        Set selectedObjects = (Set)getSessionVariable(getSelectionName());
        boolean selected;
        if (selectedObjects == null)
            selected = false;
        else 
            selected =  (selectedObjects.contains(this));
        
        System.err.println("("+this+").isSelected: "+selected);
        return selected;
    }

    public void setSelected(boolean selected) {
        System.err.println("("+this+").setSelected("+selected+")");
        if (selected) {
            Set selectedObjects = (Set)getSessionVariable(getSelectionName());
            if (selectedObjects == null) {
                selectedObjects = new HashSet();
                putSessionVariable(getSelectionName(), selectedObjects);
            }
            selectedObjects.add(this);   
        }
        else {
            Set selectedObjects = (Set)getSessionVariable(getSelectionName());
            if (selectedObjects != null) {
                selectedObjects.remove(this);
                if (selectedObjects.isEmpty()) {
                    removeSessionVariable(getSelectionName());
                }
            }
        }
    }

    public String showAssets() throws HibernateException {
    	List currentCriteria = new LinkedList();
    	currentCriteria.add(new AssetCriterion(getAssetRelationProperty(), AssetCriterion.EQUALS, this));
    	putSessionVariable(AssetSelector.CURRENT_CRITERIA, currentCriteria);
    	return "showAssets";
    }

    public String getTypeName() {
        return typeName;
    }

    public String getAssetRelationProperty() {
        return assetRelationProperty;
    }
    /**
     * @return
     */
    private String getCurrentObjectKey() {
        return "current"+getTypeName();
    }
    /**
     * @return
     */
    private String getSelectionName() {
        return computeSelectionName(getTypeName());
    }

    /**
     * @param key
     * @return
     */
    private Object getSessionVariable(String key) {
        Object value = FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(key);
        System.err.println("getSessionVariable("+key+") return "+value);
        return value;
    }

    /**
     * @param key
     * @param value
     */
    private void putSessionVariable(String key, Object value) {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(key, value);
    }

    /**
     * @param key
     */
    private void removeSessionVariable(String key) {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove(key);
    }


    public static String computeSelectionName(String typeName) {
        return "_selected"+typeName+"s";
        
    }

}
