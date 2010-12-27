package com.qwertify.shared;

import com.google.gwt.requestfactory.shared.RequestFactory;
import com.qwertify.shared.request.EmployeeRequest;

public interface QwertifyRequestFactory extends RequestFactory {
	EmployeeRequest employeeRequest();
}
