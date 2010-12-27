package com.qwertify.client.presenter;

import java.util.Set;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.requestfactory.shared.Receiver;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.ServerFailure;
import com.google.gwt.requestfactory.shared.Violation;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.qwertify.client.NameTokens;
import com.qwertify.shared.QwertifyRequestFactory;
import com.qwertify.shared.dto.proxy.EmployeeProxy;
import com.qwertify.shared.request.EmployeeRequest;

public class HomePresenter extends
	Presenter<HomePresenter.MyView, HomePresenter.MyProxy> {
	
	private QwertifyRequestFactory requestFactory;

	@ProxyStandard
	@NameToken(NameTokens.homePage)
	public interface MyProxy extends ProxyPlace<HomePresenter> {
	}

	public interface MyView extends View {
	}

	@Inject
	public HomePresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy, final QwertifyRequestFactory requestFactory) {
		super(eventBus, view, proxy);
		this.requestFactory = requestFactory;
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, MainPagePresenter.TYPE_SetMainContent, this);
		
		EmployeeRequest request = requestFactory.employeeRequest();
		EmployeeProxy newEmployee = request.create(EmployeeProxy.class);
		
		newEmployee.setName("Matthew Hill");
		newEmployee.setJobTitle("CEO");
		newEmployee.setAge(15);
		
		Request<Void> createReq = request.persist().using(newEmployee);
		createReq.fire(new Receiver<Void>() {
			@Override
			public void onSuccess(Void arg0) {
				
			}
			
			@Override
			public void onFailure(ServerFailure error) {
				Window.alert(error.getExceptionType());
			}
			
			@Override
			public void onViolation(Set<Violation> errors) {
				Window.alert(errors.toString());
			}
		});
	}
}