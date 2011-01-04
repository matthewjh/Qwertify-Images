package com.qwertify.client.gin;

import com.google.gwt.core.client.GWT;

public class ClientGinjectorImpl implements com.qwertify.client.gin.ClientGinjector {
  public com.google.inject.Provider<com.qwertify.client.presenter.AboutUsPresenter> getAboutUsPresenter() {
    return get_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$AboutUsPresenter$$_annotation$$none$$();
  }
  
  public com.google.inject.Provider<com.qwertify.client.presenter.ContactPresenter> getContactPresenter() {
    return get_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$ContactPresenter$$_annotation$$none$$();
  }
  
  public com.google.gwt.event.shared.EventBus getEventBus() {
    return get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$();
  }
  
  public com.google.inject.Provider<com.qwertify.client.presenter.HomePresenter> getHomePresenter() {
    return get_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$HomePresenter$$_annotation$$none$$();
  }
  
  public com.google.inject.Provider<com.qwertify.client.presenter.MainPagePresenter> getMainPagePresenter() {
    return get_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$MainPagePresenter$$_annotation$$none$$();
  }
  
  public com.gwtplatform.mvp.client.proxy.PlaceManager getPlaceManager() {
    return get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$();
  }
  
  public com.gwtplatform.mvp.client.proxy.ProxyFailureHandler getProxyFailureHandler() {
    return get_Key$type$com$gwtplatform$mvp$client$proxy$ProxyFailureHandler$_annotation$$none$$();
  }
  
  private void memberInject_Key$type$com$qwertify$client$QwertifyPlaceManager$_annotation$$none$$(com.qwertify.client.QwertifyPlaceManager injectee) {
    
  }
  
  private com.qwertify.client.QwertifyPlaceManager com$qwertify$client$QwertifyPlaceManager_QwertifyPlaceManager_methodInjection(com.google.gwt.event.shared.EventBus _0, com.gwtplatform.mvp.client.proxy.TokenFormatter _1, java.lang.String _2) {
    return new com.qwertify.client.QwertifyPlaceManager(_0, _1, _2);
  }
  
  private com.qwertify.client.QwertifyPlaceManager create_Key$type$com$qwertify$client$QwertifyPlaceManager$_annotation$$none$$() {
    com.qwertify.client.QwertifyPlaceManager result = com$qwertify$client$QwertifyPlaceManager_QwertifyPlaceManager_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$(), get_Key$type$java$lang$String$_annotation$$com$qwertify$client$gin$DefaultPlace$());
    memberInject_Key$type$com$qwertify$client$QwertifyPlaceManager$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.QwertifyPlaceManager get_Key$type$com$qwertify$client$QwertifyPlaceManager$_annotation$$none$$() {
    return create_Key$type$com$qwertify$client$QwertifyPlaceManager$_annotation$$none$$();
  }
  
  
  private com.google.gwt.event.shared.EventBus create_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$() {
    return get_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$();
  }
  
  private com.google.gwt.event.shared.EventBus singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ = null;
  
  private com.google.gwt.event.shared.EventBus get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$() {
    if (singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ == null) {
      singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$ = create_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$();
    }
    return singleton_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$;
  }
  
  private void memberInject_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyProxy$_annotation$$none$$(com.qwertify.client.presenter.AboutUsPresenter.MyProxy injectee) {
    
  }
  
  private com.qwertify.client.presenter.AboutUsPresenter.MyProxy create_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyProxy$_annotation$$none$$() {
    com.qwertify.client.presenter.AboutUsPresenter.MyProxy result = GWT.create(com.qwertify.client.presenter.AboutUsPresenter.MyProxy.class);
    memberInject_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyProxy$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.presenter.AboutUsPresenter.MyProxy singleton_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyProxy$_annotation$$none$$ = null;
  
  private com.qwertify.client.presenter.AboutUsPresenter.MyProxy get_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyProxy$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyProxy$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyProxy$_annotation$$none$$ = create_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyProxy$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyProxy$_annotation$$none$$;
  }
  
  private void memberInject_Key$type$com$qwertify$client$view$MainPageView$_annotation$$none$$(com.qwertify.client.view.MainPageView injectee) {
    
  }
  
  private com.qwertify.client.view.MainPageView create_Key$type$com$qwertify$client$view$MainPageView$_annotation$$none$$() {
    com.qwertify.client.view.MainPageView result = GWT.create(com.qwertify.client.view.MainPageView.class);
    memberInject_Key$type$com$qwertify$client$view$MainPageView$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.view.MainPageView singleton_Key$type$com$qwertify$client$view$MainPageView$_annotation$$none$$ = null;
  
  private com.qwertify.client.view.MainPageView get_Key$type$com$qwertify$client$view$MainPageView$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$view$MainPageView$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$view$MainPageView$_annotation$$none$$ = create_Key$type$com$qwertify$client$view$MainPageView$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$view$MainPageView$_annotation$$none$$;
  }
  
  private void memberInject_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$(com.gwtplatform.mvp.client.RootPresenter.RootView injectee) {
    
  }
  
  private com.gwtplatform.mvp.client.RootPresenter.RootView create_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$() {
    com.gwtplatform.mvp.client.RootPresenter.RootView result = GWT.create(com.gwtplatform.mvp.client.RootPresenter.RootView.class);
    memberInject_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$(result);
    return result;
  }
  
  private com.gwtplatform.mvp.client.RootPresenter.RootView get_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$() {
    return create_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$();
  }
  
  
  private void memberInject_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyProxy$_annotation$$none$$(com.qwertify.client.presenter.MainPagePresenter.MyProxy injectee) {
    
  }
  
  private com.qwertify.client.presenter.MainPagePresenter.MyProxy create_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyProxy$_annotation$$none$$() {
    com.qwertify.client.presenter.MainPagePresenter.MyProxy result = GWT.create(com.qwertify.client.presenter.MainPagePresenter.MyProxy.class);
    memberInject_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyProxy$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.presenter.MainPagePresenter.MyProxy singleton_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyProxy$_annotation$$none$$ = null;
  
  private com.qwertify.client.presenter.MainPagePresenter.MyProxy get_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyProxy$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyProxy$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyProxy$_annotation$$none$$ = create_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyProxy$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyProxy$_annotation$$none$$;
  }
  
  private void memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(com.google.gwt.event.shared.SimpleEventBus injectee) {
    
  }
  
  private com.google.gwt.event.shared.SimpleEventBus create_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$() {
    com.google.gwt.event.shared.SimpleEventBus result = GWT.create(com.google.gwt.event.shared.SimpleEventBus.class);
    memberInject_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$(result);
    return result;
  }
  
  private com.google.gwt.event.shared.SimpleEventBus get_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$() {
    return create_Key$type$com$google$gwt$event$shared$SimpleEventBus$_annotation$$none$$();
  }
  
  
  private com.gwtplatform.mvp.client.proxy.TokenFormatter create_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$() {
    return get_Key$type$com$qwertify$client$QwertifyTokenFormatter$_annotation$$none$$();
  }
  
  private com.gwtplatform.mvp.client.proxy.TokenFormatter singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ = null;
  
  private com.gwtplatform.mvp.client.proxy.TokenFormatter get_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$;
  }
  
  private com.google.inject.Provider<com.qwertify.client.presenter.AboutUsPresenter> create_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$AboutUsPresenter$$_annotation$$none$$() {
    return new com.google.inject.Provider<com.qwertify.client.presenter.AboutUsPresenter>() { 
      public com.qwertify.client.presenter.AboutUsPresenter get() { 
        return get_Key$type$com$qwertify$client$presenter$AboutUsPresenter$_annotation$$none$$();
      }
    };
  }
  
  private com.google.inject.Provider<com.qwertify.client.presenter.AboutUsPresenter> get_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$AboutUsPresenter$$_annotation$$none$$() {
    return create_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$AboutUsPresenter$$_annotation$$none$$();
  }
  
  
  private com.google.inject.Provider<com.qwertify.client.presenter.HomePresenter> create_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$HomePresenter$$_annotation$$none$$() {
    return new com.google.inject.Provider<com.qwertify.client.presenter.HomePresenter>() { 
      public com.qwertify.client.presenter.HomePresenter get() { 
        return get_Key$type$com$qwertify$client$presenter$HomePresenter$_annotation$$none$$();
      }
    };
  }
  
  private com.google.inject.Provider<com.qwertify.client.presenter.HomePresenter> get_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$HomePresenter$$_annotation$$none$$() {
    return create_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$HomePresenter$$_annotation$$none$$();
  }
  
  
  private com.gwtplatform.mvp.client.proxy.PlaceManager create_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$() {
    return get_Key$type$com$qwertify$client$QwertifyPlaceManager$_annotation$$none$$();
  }
  
  private com.gwtplatform.mvp.client.proxy.PlaceManager singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ = null;
  
  private com.gwtplatform.mvp.client.proxy.PlaceManager get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$;
  }
  
  private com.google.inject.Provider<com.qwertify.client.presenter.ContactPresenter> create_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$ContactPresenter$$_annotation$$none$$() {
    return new com.google.inject.Provider<com.qwertify.client.presenter.ContactPresenter>() { 
      public com.qwertify.client.presenter.ContactPresenter get() { 
        return get_Key$type$com$qwertify$client$presenter$ContactPresenter$_annotation$$none$$();
      }
    };
  }
  
  private com.google.inject.Provider<com.qwertify.client.presenter.ContactPresenter> get_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$ContactPresenter$$_annotation$$none$$() {
    return create_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$ContactPresenter$$_annotation$$none$$();
  }
  
  
  private void memberInject_Key$type$com$gwtplatform$mvp$client$DefaultProxyFailureHandler$_annotation$$none$$(com.gwtplatform.mvp.client.DefaultProxyFailureHandler injectee) {
    
  }
  
  private com.gwtplatform.mvp.client.DefaultProxyFailureHandler com$gwtplatform$mvp$client$DefaultProxyFailureHandler_DefaultProxyFailureHandler_methodInjection() {
    return new com.gwtplatform.mvp.client.DefaultProxyFailureHandler();
  }
  
  private com.gwtplatform.mvp.client.DefaultProxyFailureHandler create_Key$type$com$gwtplatform$mvp$client$DefaultProxyFailureHandler$_annotation$$none$$() {
    com.gwtplatform.mvp.client.DefaultProxyFailureHandler result = com$gwtplatform$mvp$client$DefaultProxyFailureHandler_DefaultProxyFailureHandler_methodInjection();
    memberInject_Key$type$com$gwtplatform$mvp$client$DefaultProxyFailureHandler$_annotation$$none$$(result);
    return result;
  }
  
  private com.gwtplatform.mvp.client.DefaultProxyFailureHandler get_Key$type$com$gwtplatform$mvp$client$DefaultProxyFailureHandler$_annotation$$none$$() {
    return create_Key$type$com$gwtplatform$mvp$client$DefaultProxyFailureHandler$_annotation$$none$$();
  }
  
  
  private void memberInject_Key$type$com$qwertify$client$view$HomeView$_annotation$$none$$(com.qwertify.client.view.HomeView injectee) {
    
  }
  
  private com.qwertify.client.view.HomeView create_Key$type$com$qwertify$client$view$HomeView$_annotation$$none$$() {
    com.qwertify.client.view.HomeView result = GWT.create(com.qwertify.client.view.HomeView.class);
    memberInject_Key$type$com$qwertify$client$view$HomeView$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.view.HomeView singleton_Key$type$com$qwertify$client$view$HomeView$_annotation$$none$$ = null;
  
  private com.qwertify.client.view.HomeView get_Key$type$com$qwertify$client$view$HomeView$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$view$HomeView$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$view$HomeView$_annotation$$none$$ = create_Key$type$com$qwertify$client$view$HomeView$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$view$HomeView$_annotation$$none$$;
  }
  
  private com.gwtplatform.mvp.client.proxy.ProxyFailureHandler create_Key$type$com$gwtplatform$mvp$client$proxy$ProxyFailureHandler$_annotation$$none$$() {
    return get_Key$type$com$gwtplatform$mvp$client$DefaultProxyFailureHandler$_annotation$$none$$();
  }
  
  private com.gwtplatform.mvp.client.proxy.ProxyFailureHandler singleton_Key$type$com$gwtplatform$mvp$client$proxy$ProxyFailureHandler$_annotation$$none$$ = null;
  
  private com.gwtplatform.mvp.client.proxy.ProxyFailureHandler get_Key$type$com$gwtplatform$mvp$client$proxy$ProxyFailureHandler$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$proxy$ProxyFailureHandler$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$proxy$ProxyFailureHandler$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$proxy$ProxyFailureHandler$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$proxy$ProxyFailureHandler$_annotation$$none$$;
  }
  
  private java.lang.String create_Key$type$java$lang$String$_annotation$$com$qwertify$client$gin$DefaultPlace$() {
    return "homePage";
  }
  
  private java.lang.String get_Key$type$java$lang$String$_annotation$$com$qwertify$client$gin$DefaultPlace$() {
    return create_Key$type$java$lang$String$_annotation$$com$qwertify$client$gin$DefaultPlace$();
  }
  
  
  private com.qwertify.client.presenter.MainPagePresenter.MyView create_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyView$_annotation$$none$$() {
    return get_Key$type$com$qwertify$client$view$MainPageView$_annotation$$none$$();
  }
  
  private com.qwertify.client.presenter.MainPagePresenter.MyView get_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyView$_annotation$$none$$() {
    return create_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyView$_annotation$$none$$();
  }
  
  
  private void memberInject_Key$type$com$qwertify$client$presenter$ContactPresenter$MyProxy$_annotation$$none$$(com.qwertify.client.presenter.ContactPresenter.MyProxy injectee) {
    
  }
  
  private com.qwertify.client.presenter.ContactPresenter.MyProxy create_Key$type$com$qwertify$client$presenter$ContactPresenter$MyProxy$_annotation$$none$$() {
    com.qwertify.client.presenter.ContactPresenter.MyProxy result = GWT.create(com.qwertify.client.presenter.ContactPresenter.MyProxy.class);
    memberInject_Key$type$com$qwertify$client$presenter$ContactPresenter$MyProxy$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.presenter.ContactPresenter.MyProxy singleton_Key$type$com$qwertify$client$presenter$ContactPresenter$MyProxy$_annotation$$none$$ = null;
  
  private com.qwertify.client.presenter.ContactPresenter.MyProxy get_Key$type$com$qwertify$client$presenter$ContactPresenter$MyProxy$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$presenter$ContactPresenter$MyProxy$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$presenter$ContactPresenter$MyProxy$_annotation$$none$$ = create_Key$type$com$qwertify$client$presenter$ContactPresenter$MyProxy$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$presenter$ContactPresenter$MyProxy$_annotation$$none$$;
  }
  
  private com.qwertify.client.presenter.HomePresenter.MyView create_Key$type$com$qwertify$client$presenter$HomePresenter$MyView$_annotation$$none$$() {
    return get_Key$type$com$qwertify$client$view$HomeView$_annotation$$none$$();
  }
  
  private com.qwertify.client.presenter.HomePresenter.MyView get_Key$type$com$qwertify$client$presenter$HomePresenter$MyView$_annotation$$none$$() {
    return create_Key$type$com$qwertify$client$presenter$HomePresenter$MyView$_annotation$$none$$();
  }
  
  
  private void memberInject_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$(com.gwtplatform.mvp.client.AutobindDisable injectee) {
    
  }
  
  private native com.gwtplatform.mvp.client.AutobindDisable com$gwtplatform$mvp$client$AutobindDisable_AutobindDisable_methodInjection() /*-{
    return @com.gwtplatform.mvp.client.AutobindDisable::new()();
  }-*/;
  
  private com.gwtplatform.mvp.client.AutobindDisable create_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$() {
    com.gwtplatform.mvp.client.AutobindDisable result = com$gwtplatform$mvp$client$AutobindDisable_AutobindDisable_methodInjection();
    memberInject_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$(result);
    return result;
  }
  
  private com.gwtplatform.mvp.client.AutobindDisable singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$ = null;
  
  private com.gwtplatform.mvp.client.AutobindDisable get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$;
  }
  
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private void memberInject_Key$type$com$qwertify$client$presenter$ContactPresenter$_annotation$$none$$(com.qwertify.client.presenter.ContactPresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  private com.qwertify.client.presenter.ContactPresenter com$qwertify$client$presenter$ContactPresenter_ContactPresenter_methodInjection(com.google.gwt.event.shared.EventBus _0, com.qwertify.client.presenter.ContactPresenter.MyView _1, com.qwertify.client.presenter.ContactPresenter.MyProxy _2) {
    return new com.qwertify.client.presenter.ContactPresenter(_0, _1, _2);
  }
  
  private com.qwertify.client.presenter.ContactPresenter create_Key$type$com$qwertify$client$presenter$ContactPresenter$_annotation$$none$$() {
    com.qwertify.client.presenter.ContactPresenter result = com$qwertify$client$presenter$ContactPresenter_ContactPresenter_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$qwertify$client$presenter$ContactPresenter$MyView$_annotation$$none$$(), get_Key$type$com$qwertify$client$presenter$ContactPresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$com$qwertify$client$presenter$ContactPresenter$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.presenter.ContactPresenter singleton_Key$type$com$qwertify$client$presenter$ContactPresenter$_annotation$$none$$ = null;
  
  private com.qwertify.client.presenter.ContactPresenter get_Key$type$com$qwertify$client$presenter$ContactPresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$presenter$ContactPresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$presenter$ContactPresenter$_annotation$$none$$ = create_Key$type$com$qwertify$client$presenter$ContactPresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$presenter$ContactPresenter$_annotation$$none$$;
  }
  
  private com.google.inject.Provider<com.qwertify.client.presenter.MainPagePresenter> create_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$MainPagePresenter$$_annotation$$none$$() {
    return new com.google.inject.Provider<com.qwertify.client.presenter.MainPagePresenter>() { 
      public com.qwertify.client.presenter.MainPagePresenter get() { 
        return get_Key$type$com$qwertify$client$presenter$MainPagePresenter$_annotation$$none$$();
      }
    };
  }
  
  private com.google.inject.Provider<com.qwertify.client.presenter.MainPagePresenter> get_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$MainPagePresenter$$_annotation$$none$$() {
    return create_Key$type$com$google$inject$Provider$com$qwertify$client$presenter$MainPagePresenter$$_annotation$$none$$();
  }
  
  
  private void memberInject_Key$type$com$qwertify$client$view$ContactView$_annotation$$none$$(com.qwertify.client.view.ContactView injectee) {
    
  }
  
  private com.qwertify.client.view.ContactView create_Key$type$com$qwertify$client$view$ContactView$_annotation$$none$$() {
    com.qwertify.client.view.ContactView result = GWT.create(com.qwertify.client.view.ContactView.class);
    memberInject_Key$type$com$qwertify$client$view$ContactView$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.view.ContactView singleton_Key$type$com$qwertify$client$view$ContactView$_annotation$$none$$ = null;
  
  private com.qwertify.client.view.ContactView get_Key$type$com$qwertify$client$view$ContactView$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$view$ContactView$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$view$ContactView$_annotation$$none$$ = create_Key$type$com$qwertify$client$view$ContactView$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$view$ContactView$_annotation$$none$$;
  }
  
  private void memberInject_Key$type$com$qwertify$client$presenter$HomePresenter$MyProxy$_annotation$$none$$(com.qwertify.client.presenter.HomePresenter.MyProxy injectee) {
    
  }
  
  private com.qwertify.client.presenter.HomePresenter.MyProxy create_Key$type$com$qwertify$client$presenter$HomePresenter$MyProxy$_annotation$$none$$() {
    com.qwertify.client.presenter.HomePresenter.MyProxy result = GWT.create(com.qwertify.client.presenter.HomePresenter.MyProxy.class);
    memberInject_Key$type$com$qwertify$client$presenter$HomePresenter$MyProxy$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.presenter.HomePresenter.MyProxy singleton_Key$type$com$qwertify$client$presenter$HomePresenter$MyProxy$_annotation$$none$$ = null;
  
  private com.qwertify.client.presenter.HomePresenter.MyProxy get_Key$type$com$qwertify$client$presenter$HomePresenter$MyProxy$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$presenter$HomePresenter$MyProxy$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$presenter$HomePresenter$MyProxy$_annotation$$none$$ = create_Key$type$com$qwertify$client$presenter$HomePresenter$MyProxy$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$presenter$HomePresenter$MyProxy$_annotation$$none$$;
  }
  
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private void memberInject_Key$type$com$qwertify$client$presenter$MainPagePresenter$_annotation$$none$$(com.qwertify.client.presenter.MainPagePresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  private com.qwertify.client.presenter.MainPagePresenter com$qwertify$client$presenter$MainPagePresenter_MainPagePresenter_methodInjection(com.google.gwt.event.shared.EventBus _0, com.qwertify.client.presenter.MainPagePresenter.MyView _1, com.qwertify.client.presenter.MainPagePresenter.MyProxy _2) {
    return new com.qwertify.client.presenter.MainPagePresenter(_0, _1, _2);
  }
  
  private com.qwertify.client.presenter.MainPagePresenter create_Key$type$com$qwertify$client$presenter$MainPagePresenter$_annotation$$none$$() {
    com.qwertify.client.presenter.MainPagePresenter result = com$qwertify$client$presenter$MainPagePresenter_MainPagePresenter_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyView$_annotation$$none$$(), get_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$com$qwertify$client$presenter$MainPagePresenter$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.presenter.MainPagePresenter singleton_Key$type$com$qwertify$client$presenter$MainPagePresenter$_annotation$$none$$ = null;
  
  private com.qwertify.client.presenter.MainPagePresenter get_Key$type$com$qwertify$client$presenter$MainPagePresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$presenter$MainPagePresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$presenter$MainPagePresenter$_annotation$$none$$ = create_Key$type$com$qwertify$client$presenter$MainPagePresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$presenter$MainPagePresenter$_annotation$$none$$;
  }
  
  private void memberInject_Key$type$com$qwertify$client$gin$ClientModule$_annotation$$none$$(com.qwertify.client.gin.ClientModule injectee) {
    
  }
  
  private com.qwertify.client.gin.ClientModule create_Key$type$com$qwertify$client$gin$ClientModule$_annotation$$none$$() {
    com.qwertify.client.gin.ClientModule result = GWT.create(com.qwertify.client.gin.ClientModule.class);
    memberInject_Key$type$com$qwertify$client$gin$ClientModule$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.gin.ClientModule singleton_Key$type$com$qwertify$client$gin$ClientModule$_annotation$$none$$ = null;
  
  private com.qwertify.client.gin.ClientModule get_Key$type$com$qwertify$client$gin$ClientModule$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$gin$ClientModule$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$gin$ClientModule$_annotation$$none$$ = create_Key$type$com$qwertify$client$gin$ClientModule$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$gin$ClientModule$_annotation$$none$$;
  }
  
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private void memberInject_Key$type$com$qwertify$client$presenter$AboutUsPresenter$_annotation$$none$$(com.qwertify.client.presenter.AboutUsPresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection__(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  private com.qwertify.client.presenter.AboutUsPresenter com$qwertify$client$presenter$AboutUsPresenter_AboutUsPresenter_methodInjection(com.google.gwt.event.shared.EventBus _0, com.qwertify.client.presenter.AboutUsPresenter.MyView _1, com.qwertify.client.presenter.AboutUsPresenter.MyProxy _2) {
    return new com.qwertify.client.presenter.AboutUsPresenter(_0, _1, _2);
  }
  
  private com.qwertify.client.presenter.AboutUsPresenter create_Key$type$com$qwertify$client$presenter$AboutUsPresenter$_annotation$$none$$() {
    com.qwertify.client.presenter.AboutUsPresenter result = com$qwertify$client$presenter$AboutUsPresenter_AboutUsPresenter_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyView$_annotation$$none$$(), get_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$com$qwertify$client$presenter$AboutUsPresenter$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.presenter.AboutUsPresenter singleton_Key$type$com$qwertify$client$presenter$AboutUsPresenter$_annotation$$none$$ = null;
  
  private com.qwertify.client.presenter.AboutUsPresenter get_Key$type$com$qwertify$client$presenter$AboutUsPresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$presenter$AboutUsPresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$presenter$AboutUsPresenter$_annotation$$none$$ = create_Key$type$com$qwertify$client$presenter$AboutUsPresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$presenter$AboutUsPresenter$_annotation$$none$$;
  }
  
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection___(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private void memberInject_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$(com.gwtplatform.mvp.client.RootPresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection___(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  private com.gwtplatform.mvp.client.RootPresenter com$gwtplatform$mvp$client$RootPresenter_RootPresenter_methodInjection(com.google.gwt.event.shared.EventBus _0, com.gwtplatform.mvp.client.RootPresenter.RootView _1) {
    return new com.gwtplatform.mvp.client.RootPresenter(_0, _1);
  }
  
  private com.gwtplatform.mvp.client.RootPresenter create_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$() {
    com.gwtplatform.mvp.client.RootPresenter result = com$gwtplatform$mvp$client$RootPresenter_RootPresenter_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwtplatform$mvp$client$RootPresenter$RootView$_annotation$$none$$());
    memberInject_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$(result);
    return result;
  }
  
  private com.gwtplatform.mvp.client.RootPresenter singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$ = null;
  
  private com.gwtplatform.mvp.client.RootPresenter get_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$ = create_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$;
  }
  
  private native com.qwertify.client.QwertifyTokenFormatter com$qwertify$client$gin$ClientModule_provideQwertifyTokenFormatter_methodInjection(com.qwertify.client.gin.ClientModule injectee) /*-{
    return injectee.@com.qwertify.client.gin.ClientModule::provideQwertifyTokenFormatter()();
  }-*/;
  
  private com.qwertify.client.QwertifyTokenFormatter create_Key$type$com$qwertify$client$QwertifyTokenFormatter$_annotation$$none$$() {
    return com$qwertify$client$gin$ClientModule_provideQwertifyTokenFormatter_methodInjection(new com.qwertify.client.gin.ClientModule());
  }
  
  private com.qwertify.client.QwertifyTokenFormatter singleton_Key$type$com$qwertify$client$QwertifyTokenFormatter$_annotation$$none$$ = null;
  
  private com.qwertify.client.QwertifyTokenFormatter get_Key$type$com$qwertify$client$QwertifyTokenFormatter$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$QwertifyTokenFormatter$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$QwertifyTokenFormatter$_annotation$$none$$ = create_Key$type$com$qwertify$client$QwertifyTokenFormatter$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$QwertifyTokenFormatter$_annotation$$none$$;
  }
  
  private void memberInject_Key$type$com$qwertify$client$view$AboutUsView$_annotation$$none$$(com.qwertify.client.view.AboutUsView injectee) {
    
  }
  
  private com.qwertify.client.view.AboutUsView create_Key$type$com$qwertify$client$view$AboutUsView$_annotation$$none$$() {
    com.qwertify.client.view.AboutUsView result = GWT.create(com.qwertify.client.view.AboutUsView.class);
    memberInject_Key$type$com$qwertify$client$view$AboutUsView$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.view.AboutUsView singleton_Key$type$com$qwertify$client$view$AboutUsView$_annotation$$none$$ = null;
  
  private com.qwertify.client.view.AboutUsView get_Key$type$com$qwertify$client$view$AboutUsView$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$view$AboutUsView$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$view$AboutUsView$_annotation$$none$$ = create_Key$type$com$qwertify$client$view$AboutUsView$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$view$AboutUsView$_annotation$$none$$;
  }
  
  private com.qwertify.client.presenter.ContactPresenter.MyView create_Key$type$com$qwertify$client$presenter$ContactPresenter$MyView$_annotation$$none$$() {
    return get_Key$type$com$qwertify$client$view$ContactView$_annotation$$none$$();
  }
  
  private com.qwertify.client.presenter.ContactPresenter.MyView get_Key$type$com$qwertify$client$presenter$ContactPresenter$MyView$_annotation$$none$$() {
    return create_Key$type$com$qwertify$client$presenter$ContactPresenter$MyView$_annotation$$none$$();
  }
  
  
  private native void com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection____(com.gwtplatform.mvp.client.HandlerContainerImpl injectee, com.gwtplatform.mvp.client.AutobindDisable _0) /*-{
    injectee.@com.gwtplatform.mvp.client.HandlerContainerImpl::automaticBind(Lcom/gwtplatform/mvp/client/AutobindDisable;)(_0);
  }-*/;
  
  private void memberInject_Key$type$com$qwertify$client$presenter$HomePresenter$_annotation$$none$$(com.qwertify.client.presenter.HomePresenter injectee) {
    com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection____(injectee, get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  private com.qwertify.client.presenter.HomePresenter com$qwertify$client$presenter$HomePresenter_HomePresenter_methodInjection(com.google.gwt.event.shared.EventBus _0, com.qwertify.client.presenter.HomePresenter.MyView _1, com.qwertify.client.presenter.HomePresenter.MyProxy _2, com.qwertify.shared.QwertifyRequestFactory _3) {
    return new com.qwertify.client.presenter.HomePresenter(_0, _1, _2, _3);
  }
  
  private com.qwertify.client.presenter.HomePresenter create_Key$type$com$qwertify$client$presenter$HomePresenter$_annotation$$none$$() {
    com.qwertify.client.presenter.HomePresenter result = com$qwertify$client$presenter$HomePresenter_HomePresenter_methodInjection(get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$qwertify$client$presenter$HomePresenter$MyView$_annotation$$none$$(), get_Key$type$com$qwertify$client$presenter$HomePresenter$MyProxy$_annotation$$none$$(), get_Key$type$com$qwertify$shared$QwertifyRequestFactory$_annotation$$none$$());
    memberInject_Key$type$com$qwertify$client$presenter$HomePresenter$_annotation$$none$$(result);
    return result;
  }
  
  private com.qwertify.client.presenter.HomePresenter singleton_Key$type$com$qwertify$client$presenter$HomePresenter$_annotation$$none$$ = null;
  
  private com.qwertify.client.presenter.HomePresenter get_Key$type$com$qwertify$client$presenter$HomePresenter$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$client$presenter$HomePresenter$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$client$presenter$HomePresenter$_annotation$$none$$ = create_Key$type$com$qwertify$client$presenter$HomePresenter$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$client$presenter$HomePresenter$_annotation$$none$$;
  }
  
  private com.qwertify.client.presenter.AboutUsPresenter.MyView create_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyView$_annotation$$none$$() {
    return get_Key$type$com$qwertify$client$view$AboutUsView$_annotation$$none$$();
  }
  
  private com.qwertify.client.presenter.AboutUsPresenter.MyView get_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyView$_annotation$$none$$() {
    return create_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyView$_annotation$$none$$();
  }
  
  
  private native com.qwertify.shared.QwertifyRequestFactory com$qwertify$client$gin$ClientModule_provideQwertifyRequestFactory_methodInjection(com.qwertify.client.gin.ClientModule injectee, com.google.gwt.event.shared.EventBus _0) /*-{
    return injectee.@com.qwertify.client.gin.ClientModule::provideQwertifyRequestFactory(Lcom/google/gwt/event/shared/EventBus;)(_0);
  }-*/;
  
  private com.qwertify.shared.QwertifyRequestFactory create_Key$type$com$qwertify$shared$QwertifyRequestFactory$_annotation$$none$$() {
    return com$qwertify$client$gin$ClientModule_provideQwertifyRequestFactory_methodInjection(new com.qwertify.client.gin.ClientModule(), get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$());
  }
  
  private com.qwertify.shared.QwertifyRequestFactory singleton_Key$type$com$qwertify$shared$QwertifyRequestFactory$_annotation$$none$$ = null;
  
  private com.qwertify.shared.QwertifyRequestFactory get_Key$type$com$qwertify$shared$QwertifyRequestFactory$_annotation$$none$$() {
    if (singleton_Key$type$com$qwertify$shared$QwertifyRequestFactory$_annotation$$none$$ == null) {
      singleton_Key$type$com$qwertify$shared$QwertifyRequestFactory$_annotation$$none$$ = create_Key$type$com$qwertify$shared$QwertifyRequestFactory$_annotation$$none$$();
    }
    return singleton_Key$type$com$qwertify$shared$QwertifyRequestFactory$_annotation$$none$$;
  }
  
  public ClientGinjectorImpl() {
    get_Key$type$com$qwertify$client$presenter$AboutUsPresenter$MyProxy$_annotation$$none$$();
    get_Key$type$com$qwertify$client$presenter$MainPagePresenter$MyProxy$_annotation$$none$$();
    get_Key$type$com$qwertify$client$presenter$ContactPresenter$MyProxy$_annotation$$none$$();
    get_Key$type$com$qwertify$client$presenter$HomePresenter$MyProxy$_annotation$$none$$();
    get_Key$type$com$gwtplatform$mvp$client$RootPresenter$_annotation$$none$$();
    
  }
  
}
