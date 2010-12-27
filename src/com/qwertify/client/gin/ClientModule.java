package com.qwertify.client.gin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.requestfactory.client.DefaultRequestTransport;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.gwtplatform.mvp.client.DefaultProxyFailureHandler;
import com.gwtplatform.mvp.client.RootPresenter;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyFailureHandler;
import com.gwtplatform.mvp.client.proxy.TokenFormatter;
import com.qwertify.client.NameTokens;
import com.qwertify.client.QwertifyPlaceManager;
import com.qwertify.client.QwertifyTokenFormatter;
import com.qwertify.client.presenter.AboutUsPresenter;
import com.qwertify.client.presenter.ContactPresenter;
import com.qwertify.client.presenter.HomePresenter;
import com.qwertify.client.presenter.MainPagePresenter;
import com.qwertify.client.view.AboutUsView;
import com.qwertify.client.view.ContactView;
import com.qwertify.client.view.HomeView;
import com.qwertify.client.view.MainPageView;
import com.qwertify.shared.QwertifyRequestFactory;

public class ClientModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		// Singletons
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
		bind(PlaceManager.class).to(QwertifyPlaceManager.class).in(Singleton.class);
		bind(TokenFormatter.class).to(QwertifyTokenFormatter.class).in(Singleton.class);
		bind(RootPresenter.class).asEagerSingleton();
		bind(ProxyFailureHandler.class).to(DefaultProxyFailureHandler.class).in(Singleton.class);

		// Constants
		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.homePage);

		// Presenters
		bindPresenter(MainPagePresenter.class, MainPagePresenter.MyView.class, MainPageView.class, MainPagePresenter.MyProxy.class);
		bindPresenter(HomePresenter.class, HomePresenter.MyView.class, HomeView.class, HomePresenter.MyProxy.class);
		bindPresenter(AboutUsPresenter.class, AboutUsPresenter.MyView.class, AboutUsView.class, AboutUsPresenter.MyProxy.class);
		bindPresenter(ContactPresenter.class, ContactPresenter.MyView.class, ContactView.class, ContactPresenter.MyProxy.class);
	}
	
	@Provides
	@Singleton
	protected QwertifyTokenFormatter provideQwertifyTokenFormatter() {
		return new QwertifyTokenFormatter("!/", "/", "&", "=");
	}
	
	@Provides
	@Singleton
	protected QwertifyRequestFactory provideQwertifyRequestFactory(EventBus eventBus) {
		QwertifyRequestFactory requestFactory = GWT.create(QwertifyRequestFactory.class);
		DefaultRequestTransport requestTransport = new DefaultRequestTransport(eventBus);
		requestTransport.setRequestUrl("request");

		requestFactory.initialize(eventBus, requestTransport);
		
		return requestFactory;
	}
}