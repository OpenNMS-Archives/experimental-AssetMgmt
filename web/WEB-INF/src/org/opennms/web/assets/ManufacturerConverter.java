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
public class ManufacturerConverter implements Converter {

	public Manufacturer getManufacturerById(String idAsString)
			throws HibernateException {
		Session session = null;
		Transaction tx = null;
		try {
			Manufacturer manufacturer = null;
			session = HibernateUtil.currentSession();

			tx = session.beginTransaction();

            Integer id = Integer.valueOf(idAsString);
            manufacturer = (Manufacturer)session.load(Manufacturer.class, id);

			tx.commit();

			HibernateUtil.closeSession();

			return manufacturer;

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
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		try {
			Object retVal = getManufacturerById(value);
			return retVal;
		} catch (HibernateException e) {
			e.printStackTrace();
			return null;
		}
	}

	/* (non-Javadoc)
	 * @see javax.faces.convert.Converter#getAsString(javax.faces.context.FacesContext, javax.faces.component.UIComponent, java.lang.Object)
	 */
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		Manufacturer manufacturer = (Manufacturer) value;
		String retVal = ""+manufacturer.getId();
		return retVal;
	}

}