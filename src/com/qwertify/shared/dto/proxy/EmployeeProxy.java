package com.qwertify.shared.dto.proxy;

import com.google.gwt.requestfactory.shared.EntityProxy;
import com.google.gwt.requestfactory.shared.EntityProxyId;
import com.google.gwt.requestfactory.shared.ProxyFor;
import com.qwertify.server.domain.Employee;

@ProxyFor(Employee.class)
public interface EmployeeProxy extends EntityProxy {
	
	String getName();
	
	String getJobTitle();
	
	String getId();
	
	int getAge();
	
	void setName(String name);
	
	void setJobTitle(String jobTitle);
	
	void setAge(int age);
	
	EntityProxyId<EmployeeProxy> stableId();
}
