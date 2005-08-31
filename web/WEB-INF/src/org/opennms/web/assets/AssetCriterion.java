/*
 * Created on Aug 10, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package org.opennms.web.assets;

import java.util.Collection;

import net.sf.hibernate.expression.Criterion;
import net.sf.hibernate.expression.Expression;

/**
 * @author david
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class AssetCriterion {
	
	public static final String EQUALS = "=";
	public static final String IN = "IN";
	
	private String propertyName;
	private String operation;
	private Named value;
	

	/**
	 * @param propertyName
	 * @param operation
	 * @param value
	 */
	public AssetCriterion(String propertyName, String operation, Named value) {
		this.propertyName = propertyName;
		this.operation = operation;
		this.value = value;
	}
	/**
	 * @return Returns the operation.
	 */
	public String getOperation() {
		return operation;
	}
	/**
	 * @param operation The operation to set.
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
	/**
	 * @return Returns the propertyName.
	 */
	public String getPropertyName() {
		return propertyName;
	}
	/**
	 * @param propertyName The propertyName to set.
	 */
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	/**
	 * @return Returns the value.
	 */
	public Named getValue() {
		return value;
	}
	/**
	 * @param value The value to set.
	 */
	public void setValue(Named value) {
		this.value = value;
	}
	
	public Criterion getCriteria() {
		if(operation.equals(EQUALS)) {
			return Expression.eq(propertyName, value);
		} else if(operation.equals(IN)) {
			return Expression.in(propertyName, (Collection) value);
		}
		throw new UnsupportedOperationException("Operation "+operation+" is not yet supported by AssetCriterion");
	}
    
    public String toString() {
        return "["+propertyName+" "+operation+" "+value+"]";
    }
}
