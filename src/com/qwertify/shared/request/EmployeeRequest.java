package com.qwertify.shared.request;

import java.util.List;

import com.google.gwt.requestfactory.shared.InstanceRequest;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.requestfactory.shared.Service;
import com.qwertify.server.domain.Employee;
import com.qwertify.shared.dto.proxy.EmployeeProxy;

@Service(Employee.class)
public interface EmployeeRequest extends RequestContext {

	Request<Long> countEmployees();
	
	Request<List<EmployeeProxy>> findAllEmployees();
	
	Request<EmployeeProxy> findEmployee(String id);
	
	InstanceRequest<EmployeeProxy, Void> persist();
	
	InstanceRequest<EmployeeProxy, Void> remove();
}
