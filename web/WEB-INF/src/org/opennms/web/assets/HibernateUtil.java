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

import java.io.IOException;
import java.util.Properties;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;
import net.sf.hibernate.SessionFactory;
import net.sf.hibernate.cfg.Configuration;
import net.sf.hibernate.tool.hbm2ddl.SchemaUpdate;

/**
 * @author brozow
 * 
 * FIXME To change the template for this generated type comment go to Window - Preferences -
 * Java - Code Generation - Code and Comments
 */
public class HibernateUtil {

    public static final ThreadLocal session = new ThreadLocal();

    private static SessionFactory sessionFactory;

    public static void closeSession() throws HibernateException {
        Session s = (Session) session.get();
        session.set(null);
        if (s != null) s.close();
    }

    public static Session currentSession() throws HibernateException {
        Session s = (Session) session.get();
        // Open a new Session, if this Thread has none yet
        if (s == null) {
            s = getSessionFactory().openSession();
            session.set(s);
        }
        return s;
    }

    /**
     * @return Returns the sessionFactory.
     * @throws IOException
     * @throws HibernateException
     */
    public static SessionFactory getSessionFactory() throws HibernateException {
        if (sessionFactory == null) {
            // load the configuration properties
            Properties props;
            try {
                props = DbConfiguration.getConfigProperties();
            } catch(IOException e) {
                props = new Properties();
            }
            props.list(System.err);
 
            // Create the SessionFactory
            
            // TODO change to addProperties in hibernate 2.1
            Configuration cfg = new Configuration().configure().setProperties(props);
            //new SchemaExport(cfg).create(false,true);
            new SchemaUpdate(cfg).execute(true, true);
            sessionFactory = cfg.buildSessionFactory();
        }
        return sessionFactory;
    }
}