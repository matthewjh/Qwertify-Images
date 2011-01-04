package com.qwertify.shared.dto.proxy;

import com.google.gwt.requestfactory.shared.EntityProxy;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.ProxyFor;
import com.qwertify.server.domain.Employee;

/***
 * 
 * @author Matthew Hill
 *
 */
@ProxyFor(Employee.class)
public interface EmployeeProxy extends EntityProxy {
	
	String getName();
	
	String getJobTitle();
	
	String getId();
	
	Integer getAge();
	
	void setName(String name);
	
	void setJobTitle(String jobTitle);
	
	void setAge(Integer age);
	
	EntityProxyId<EmployeeProxy> stableId();
}
