/*
 * Created on Aug 2, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.opennms.web.assets;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;
import net.sf.hibernate.Transaction;

/**
 * @author brozow
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class CategoryConverter implements Converter {

    public AssetCategory getCategoryById(String categoryName) throws HibernateException {
        Session session = null;
        Transaction tx = null;
        try {
            AssetCategory category = null;
            session = HibernateUtil.currentSession();

            tx = session.beginTransaction();

            Integer id = Integer.valueOf(categoryName);
            category = (AssetCategory)session.load(AssetCategory.class, id);

            tx.commit();

            HibernateUtil.closeSession();

            return category;

        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            throw e;
        } finally {
            if (session != null)
                HibernateUtil.closeSession();
        }

        
    }
	/* (non-Javadoc)
	 * @see javax.faces.convert.Converter#getAsObject(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.String)
	 */
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
	    try {
	        return getCategoryById(value);
        }
        catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
	}

	/* (non-Javadoc)
	 * @see javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.Object)
	 */
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		AssetCategory category = (AssetCategory)value;
		return (category == null ? "0" : ""+category.getId());
	}

}
