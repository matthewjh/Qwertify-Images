package com.qwertify.client.gin;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.inject.Provider;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyFailureHandler;
import com.qwertify.client.presenter.AboutUsPresenter;
import com.qwertify.client.presenter.ContactPresenter;
import com.qwertify.client.presenter.HomePresenter;
import com.qwertify.client.presenter.MainPagePresenter;

/**
 * 
 * @author Matthew Hill
 *
 */

@GinModules({ClientModule.class})
public interface ClientGinjector extends Ginjector {
	Provider<AboutUsPresenter> getAboutUsPresenter();
	Provider<ContactPresenter> getContactPresenter();
	Provider<HomePresenter> getHomePresenter();
	Provider<MainPagePresenter> getMainPagePresenter();
	EventBus getEventBus();
	PlaceManager getPlaceManager();
	ProxyFailureHandler getProxyFailureHandler();
}