package com.qwertify.client.presenter;

import com.google.gwt.core.client.GWT;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.event.shared.EventBus;
import com.gwtplatform.common.client.StandardProvider;
import com.gwtplatform.common.client.CodeSplitProvider;
import com.gwtplatform.common.client.CodeSplitBundleProvider;
import com.gwtplatform.mvp.client.proxy.ProxyFailureHandler;
import com.gwtplatform.mvp.client.proxy.ProxyImpl;
import com.gwtplatform.mvp.client.proxy.ProxyPlaceImpl;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.DelayedBind;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlaceImpl;
import com.gwtplatform.mvp.client.DelayedBindRegistry;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.google.gwt.user.client.DeferredCommand;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.rpc.AsyncCallback;

public class MainPagePresenterMyProxyImpl extends com.gwtplatform.mvp.client.proxy.ProxyImpl<MainPagePresenter> implements com.qwertify.client.presenter.MainPagePresenter.MyProxy, com.gwtplatform.mvp.client.DelayedBind {
  
  private com.qwertify.client.gin.ClientGinjector ginjector;
  
  public MainPagePresenterMyProxyImpl() {
    DelayedBindRegistry.register(this);
  }
  
  @Override
  public void delayedBind(Ginjector baseGinjector) {
    ginjector = (com.qwertify.client.gin.ClientGinjector)baseGinjector;
    bind(ginjector.getProxyFailureHandler(),ginjector.getEventBus());
    presenter = new StandardProvider<MainPagePresenter>( ginjector.getMainPagePresenter() );
    
    
    RevealContentHandler<MainPagePresenter> revealContentHandler = new RevealContentHandler<MainPagePresenter>( failureHandler, this );
    getEventBus().addHandler( MainPagePresenter.TYPE_SetMainContent, revealContentHandler );
  }
}
