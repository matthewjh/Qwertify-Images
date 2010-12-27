package com.qwertify.client.presenter;

import com.google.gwt.event.shared.EventBus;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.qwertify.client.NameTokens;

public class AboutUsPresenter extends
	Presenter<AboutUsPresenter.MyView, AboutUsPresenter.MyProxy> {

	@ProxyStandard
	@NameToken(NameTokens.aboutUsPage)
	public interface MyProxy extends ProxyPlace<AboutUsPresenter> {
	}

	public interface MyView extends View {
	}

	@Inject
	public AboutUsPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, MainPagePresenter.TYPE_SetMainContent, 
				this);
	}
}
