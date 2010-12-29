package com.qwertify.client.presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.requestfactory.client.RequestFactoryEditorDriver;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.qwertify.client.NameTokens;
import com.qwertify.client.editor.EmployeeEditor;
import com.qwertify.shared.QwertifyRequestFactory;
import com.qwertify.shared.dto.proxy.EmployeeProxy;
import com.qwertify.shared.request.EmployeeRequest;

public class HomePresenter extends
	Presenter<HomePresenter.MyView, HomePresenter.MyProxy> {
	
	private QwertifyRequestFactory requestFactory;
	private EmployeeEditor employeeEditor;
	private MyView view;

	@ProxyStandard
	@NameToken(NameTokens.homePage)
	public interface MyProxy extends ProxyPlace<HomePresenter> {
	}

	public interface MyView extends View {
		EmployeeEditor getEmployeeEditor();
		HasClickHandlers getSaveButton();
	}

	@Inject
	public HomePresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy, final QwertifyRequestFactory requestFactory) {
		super(eventBus, view, proxy);
		this.requestFactory = requestFactory;
		this.view = view;
	}

	interface EditorDriver extends RequestFactoryEditorDriver<EmployeeProxy, EmployeeEditor> {
	}
	
	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, MainPagePresenter.TYPE_SetMainContent, this);
		
		final EmployeeRequest request = requestFactory.employeeRequest();
		EmployeeProxy newEmployee = request.create(EmployeeProxy.class);
		
		final EditorDriver driver = GWT.create(EditorDriver.class);
		driver.initialize(requestFactory, view.getEmployeeEditor());
		driver.edit(newEmployee, request);
		request.persist().using(newEmployee);
		
		view.getSaveButton().addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				driver.flush();
				request.fire(new Receiver<Void>() {
					
					@Override
					public void onSuccess(Void response) {
						// TODO Auto-generated method stub
						
					}
				});
			}
		});
		
	}
}