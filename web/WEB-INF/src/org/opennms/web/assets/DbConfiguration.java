/*
 * Created on Aug 18, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.opennms.web.assets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import net.sf.hibernate.HibernateException;
import net.sf.hibernate.SessionFactory;

/**
 * @author brozow
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class DbConfiguration {
    
    
    private static Properties configProperties;
    private boolean configured;

    public static final String CONFIGURED = "org.opennms.assets.configured"; 

    public static final String CONNECTION_DRIVER_CLASS = "hibernate.connection.driver_class";
    public static final String CONNECTION_URL = "hibernate.connection.url";
    public static final String CONNECTION_USERNAME = "hibernate.connection.username";
    public static final String CONNECTION_PASSWORD = "hibernate.connection.password";
    public static final String DIALECT = "hibernate.dialect";

    public static final String defaultConnectionUrl = "jdbc:hsqldb:database/assets.db";
    public static final String defaultConnectionDriverClass = "org.hsqldb.jdbcDriver";
    public static final String defaultConnectionUsername = "SA";
    public static final String defaultConnectionPassword = "";
    public static final String defaultDialect = "net.sf.hibernate.dialect.HSQLDialect";
    
    public boolean isConfigured() throws IOException {
        return "true".equals(getConfigProperties().getProperty(CONFIGURED));
    }
    
    public void setConfigured(boolean configured) throws IOException {
        getConfigProperties().put(CONFIGURED, configured ? "true" : "false");
    }
    
    /**
     * @return Returns the connectionDriverClass.
     * @throws IOException
     */
    public String getConnectionDriverClass() throws IOException {
        return getConfigProperties().getProperty(CONNECTION_DRIVER_CLASS, defaultConnectionDriverClass);
    }
    /**
     * @param connectionDriverClass The connectionDriverClass to set.
     * @throws IOException
     */
    public void setConnectionDriverClass(String connectionDriverClass) throws IOException {
        getConfigProperties().put(CONNECTION_DRIVER_CLASS, connectionDriverClass);
    }
    /**
     * @return Returns the connectionPassword.
     * @throws IOException
     */
    public String getConnectionPassword() throws IOException {
        return getConfigProperties().getProperty(CONNECTION_PASSWORD, defaultConnectionPassword);
    }
    /**
     * @param connectionPassword The connectionPassword to set.
     * @throws IOException
     */
    public void setConnectionPassword(String connectionPassword) throws IOException {
        getConfigProperties().put(CONNECTION_PASSWORD, connectionPassword);
    }
    /**
     * @return Returns the connectionUrl.
     * @throws IOException
     */
    public String getConnectionURL() throws IOException {
        return getConfigProperties().getProperty(CONNECTION_URL, defaultConnectionUrl);
    }
    /**
     * @param connectionUrl The connectionUrl to set.
     * @throws IOException
     */
    public void setConnectionURL(String connectionUrl) throws IOException {
        getConfigProperties().put(CONNECTION_URL, connectionUrl);
    }
    /**
     * @return Returns the connectionUsername.
     * @throws IOException
     */
    public String getConnectionUsername() throws IOException {
        return getConfigProperties().getProperty(CONNECTION_USERNAME, defaultConnectionUsername);
    }
    /**
     * @param connectionUsername The connectionUsername to set.
     * @throws IOException
     */
    public void setConnectionUsername(String connectionUsername) throws IOException {
        getConfigProperties().put(CONNECTION_USERNAME, connectionUsername);
    }
    /**
     * @return Returns the dialect.
     * @throws IOException
     */
    public String getDialect() throws IOException {
        return getConfigProperties().getProperty(DIALECT, defaultDialect);
    }
    /**
     * @param dialect The dialect to set.
     * @throws IOException
     */
    public void setDialect(String dialect) throws IOException {
        getConfigProperties().put(DIALECT, dialect);
    }
    
    public static String getConfigurationFilePath() throws IOException {
        ServletContext context = (ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext();
        String path = context.getRealPath("/WEB-INF/conf/dbconfig.properties");
        if (path == null) {
            throw new IOException("Unable to locate configuration file");
        }
        return path;
        
    }
    
    public String save() {
        
        try {
            
            String path = getConfigurationFilePath();
            File configFile = new File(path);
            File configDir = configFile.getParentFile();
            if (!configDir.isDirectory()) {
                configDir.mkdirs();
            }
            
            
            
            SessionFactory factory = HibernateUtil.getSessionFactory();
            
            System.err.println("DBCONFIG: Setting configured to True");
            setConfigured(true);
            
            System.err.println("DBCONFIG: Saving config properties in "+configFile);
            OutputStream out = new FileOutputStream(configFile);
            getConfigProperties().store(out, "Configuration file for Assets webapp");
            out.close();
            
            return "showAssetHome";
            
        } catch (HibernateException e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Unable to connect to the database", e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return "";
        } catch (IOException e) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_FATAL, "Unable to save database configuration", e.getMessage());
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return "";
        }
    }
    
    public String cancel() throws IOException {
        return "";
    }

    /**
     * @return Returns the configProperties.
     * @throws IOException
     */
    public static Properties getConfigProperties() throws IOException {
        if (configProperties == null) {
            configProperties = new Properties();
            String path = getConfigurationFilePath();
            File configFile = new File(path);
            System.err.println("DBCONFIG: Loading properties from: "+configFile);
            if (configFile.canRead()) {
                InputStream in = new FileInputStream(configFile);
                configProperties.load(in);
                in.close();
            }
            else {
                System.err.println("DBCONFIG: Unable to read properties from: "+configFile);
            }
        }
        return configProperties;
    }
    
}
