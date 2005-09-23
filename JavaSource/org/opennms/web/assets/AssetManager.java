//
// This file is part of the OpenNMS(R) Application.
//
// OpenNMS(R) is Copyright (C) 2002-2004 Blast Internet Services, Inc.  All rights reserved.
// OpenNMS(R) is a derivative work, containing both original code, included code and modified
// code that was published under the GNU General Public License. Copyrights for modified 
// and included code are below.
//
// OpenNMS(R) is a registered trademark of Blast Internet Services, Inc.
//
// Modifications:
//
// Jun 16, 2004: Created this file.
//
// Original code base Copyright (C) 1999-2001 Oculan Corp.  All rights reserved.
//
// This program is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.                                                            
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
//       
// For more information contact: 
//      OpenNMS Licensing       <license@opennms.org>
//      http://www.opennms.org/
//      http://www.blast.com/
//
// Tab Size = 8
//

package org.opennms.web.assets;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.faces.context.FacesContext;

import net.sf.hibernate.Criteria;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;
import net.sf.hibernate.Transaction;
import net.sf.hibernate.expression.Criterion;
import net.sf.hibernate.expression.Expression;

/**
 * @author brozow
 * 
 * FIXME To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Generation - Code and Comments
 */
public class AssetManager {

	public AssetManager() {
	}
    
    public List getAssets() throws HibernateException {
        return getAssets(null);
    }

	public List getAssets(Criterion criterion) throws HibernateException {

		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.currentSession();

			tx = session.beginTransaction();

//			Query query = session.createQuery("select a from Asset as a");
//			List assets = new LinkedList(query.list());

             Criteria crit = session.createCriteria(Asset.class);
             if (criterion != null)
                 crit.add(criterion);
             List assets = new LinkedList(crit.list());
            
			tx.commit();

			HibernateUtil.closeSession();

			return assets;
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (session != null)
				HibernateUtil.closeSession();
		}

	}
    
	public List getMatchingAssets() throws HibernateException {
		List currentCriteria = (List)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get(AssetSelector.CURRENT_CRITERIA);
		Criterion criteria = null;
		if(currentCriteria != null) {
			for (Iterator it = currentCriteria.iterator(); it.hasNext();) {
				AssetCriterion criterion = (AssetCriterion) it.next();
				if (criteria == null)
					criteria = criterion.getCriteria();
				else
					criteria = Expression.and(criteria, criterion.getCriteria());
			}
		}
		return getAssets(criteria);
	}

	public String newAsset() {
		System.err.println("Enter AssetMgr.newAsset");
		Asset newAsset = new Asset();
		newAsset.setUserLastModified(FacesContext.getCurrentInstance().getExternalContext().getRemoteUser());
		String result = newAsset.edit();
		System.err.println("Exit AssetMgr.newAsset: return " + result);
		return result;
	}

	public String deleteSelected() throws HibernateException {
		System.err.println("Enter AssetMgr.deleteSelected");
		Set selectedAssets = (Set) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get("_selectedAssets");
		if (selectedAssets == null)
			return null;

		Session session = null;
		Transaction tx = null;
		try {
			session = HibernateUtil.currentSession();

			tx = session.beginTransaction();

			for (Iterator it = selectedAssets.iterator(); it.hasNext();) {
				Asset asset = (Asset) it.next();
				System.err.println("Deleting asset (" + asset + ") "
						+ new Date());
				//session.lock(asset, LockMode.NONE);
				session.delete(asset);
				System.err.println("Done deleting asset (" + asset + ") "
						+ new Date());
			}

			tx.commit();

			clearSelected();

			System.err.println("Exit AssetMgr.deleteSelected");
			return null;

		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			if (session != null)
				HibernateUtil.closeSession();
		}

	}

	public void clearSelected() {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.remove("_selectedAssets");
	}

	/*
	 * TODO: This should only select the matching items
	 */
	public void selectAll() throws HibernateException {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
				.put("_selectedAssets", new HashSet(getAssets()));

	}

}