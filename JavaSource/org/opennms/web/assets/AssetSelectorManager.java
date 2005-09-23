/*
 * Created on Aug 11, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.opennms.web.assets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Query;
import net.sf.hibernate.Session;
import net.sf.hibernate.Transaction;

/**
 * @author david
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class AssetSelectorManager {

    private String allQueryString;
    private String selectionName;
    private Class selectionClass;

    public List getAll() throws HibernateException {
    	Session session = null;
    	Transaction tx = null;
    	try {
    		session = HibernateUtil.currentSession();
    
    		tx = session.beginTransaction();
    
    		Query query = session.createQuery(getAllQueryString());
    		List categories = new LinkedList(query.list());
    
    		tx.commit();
    
    		HibernateUtil.closeSession();
    
    		return categories;
    
    	} catch (HibernateException e) {
    		if (tx != null)
    			tx.rollback();
    		throw e;
    	} finally {
    		if (session != null)
    			HibernateUtil.closeSession();
    	}
    
    }

    /**
     * @return
     */
    private String getAllQueryString() {
    	return allQueryString;
    }

    public void setAllQueryString(String queryString) {
        System.err.println("Setting allQueryString to "+queryString);
    	allQueryString = queryString;
    }

    public SelectItem[] getSelections() throws HibernateException {
    		List options = getAll();
        List selectItems = new LinkedList();
    		for (Iterator it = options.iterator(); it.hasNext();) {
    			AssetSelector option = (AssetSelector) it.next();
             selectItems.add(new SelectItem(option, option.getName()));
    		}
    		return (SelectItem[]) selectItems.toArray(new SelectItem[selectItems.size()]);
    }

    public String newItem() throws HibernateException, InstantiationException, IllegalAccessException {
        AssetSelector newItem = createNewSelector();
        newItem.save();
        String result = newItem.edit();
        return result;
    }

    protected AssetSelector createNewSelector() throws InstantiationException, IllegalAccessException {
        AssetSelector newItem = (AssetSelector) selectionClass.newInstance();
        newItem.setName("");
        return newItem;
    }

    public String deleteSelected() throws HibernateException {
        Set selectedItems = (Set)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(getSelectionName());
        if (selectedItems == null)
            return null;
        
        
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.currentSession();
    
            tx= session.beginTransaction();
            
            for (Iterator it = selectedItems.iterator(); it.hasNext();) {
                AssetSelector cat = (AssetSelector) it.next();
                session.delete(cat);
            }
        
            tx.commit();
            
            clearSelected();
    
            return null;
        
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

    protected String getSelectionName() {
    	return this.selectionName;
    }

    public void setSelectionName(String selectionName) {
        System.err.println("Setting selectionName to "+selectionName);
    		this.selectionName = selectionName;
    }

    public Class getSelectionClass() {
        return this.selectionClass;
    }

    public void setSelectionClass(Class selectionClass) {
        System.err.println("Setting selectionClass to "+selectionClass);
        this.selectionClass = selectionClass;
    }

    public void clearSelected() {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove(getSelectionName());
    }

    public void selectAll() throws HibernateException {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(getSelectionName(), new HashSet(getAll()));
        
    }

}
