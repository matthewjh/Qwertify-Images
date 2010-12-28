package com.qwertify.client.editor.workflow;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.RequestContext;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.qwertify.client.editor.EmployeeEditor;
import com.qwertify.client.ui.widget.Button;
import com.qwertify.shared.QwertifyRequestFactory;
import com.qwertify.shared.dto.proxy.EmployeeProxy;
import com.qwertify.shared.request.EmployeeRequest;

public class EmployeeEditorWorkflow {
	interface Binder extends UiBinder<Widget, EmployeeEditorWorkflow> {
	}

	interface Driver extends RequestFactoryEditorDriver<EmployeeProxy, EmployeeEditor> {
	}
	
	@UiField(provided = true)
	EmployeeEditor editor;

	@UiField
	Button saveButton;
	
	private Driver driver = GWT.create(Driver.class);
	private QwertifyRequestFactory requestFactory;
	private EmployeeProxy employee;
	
	@Inject
	private EmployeeEditorWorkflow(QwertifyRequestFactory requestFactory, EmployeeProxy employee) {
		this.requestFactory = requestFactory;
		this.employee = employee;
	}
	
	private void edit(RequestContext context) {
		driver.initialize(requestFactory, editor);
		
		if (context == null) {
			fetchAndEdit();
			return;
		}
		
		driver.edit(employee, context);
	}
	
	private void fetchAndEdit() {
		Request<EmployeeProxy> request = requestFactory.find(employee.stableId());
		
		request.with(driver.getPaths());
		request.to(new Receiver<EmployeeProxy>() {

			@Override
			public void onSuccess(EmployeeProxy employee) {
				EmployeeEditorWorkflow.this.employee = employee;
				EmployeeRequest context = requestFactory.employeeRequest();
				
				edit(context);
				context.persist().using(employee);
			}
			
		}).fire();
	}
	
	@UiHandler("saveButton")
	protected void onSave(ClickEvent event) {
		RequestContext context = driver.flush();
		
		if (driver.hasErrors()) {
			Window.alert("errors");
		}
		
		context.fire(new Receiver<Void>() {
			@Override
			public void onSuccess(Void response) {
				Window.alert("success");
			}
		});
		
	}
}
