package com.qwertify.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MainPageView_MainPageViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.qwertify.client.view.MainPageView_MainPageViewUiBinderImpl_GenBundle {
  public com.qwertify.client.view.MainPageView_MainPageViewUiBinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new com.qwertify.client.view.MainPageView_MainPageViewUiBinderImpl_GenCss_style() {
    private boolean injected;
    public boolean ensureInjected() {
      if (!injected) {
        injected = true;
        com.google.gwt.dom.client.StyleInjector.inject(getText());
        return true;
      }
      return false;
    }
    public String getName() {
      return "style";
    }
    public String getText() {
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".Q2HH{text-align:" + ("right")  + ";width:" + ("900px")  + ";margin:" + ("0"+ " " +"auto")  + ";}.Q2MH{text-align:" + ("center")  + ";}.Q2JH{height:" + ("50px")  + ";background-color:" + ("#405774")  + ";padding-top:" + ("10px")  + ";}.Q2KH:hover{opacity:" + ("0.7")  + ";}.Q2LH{height:" + ("30px")  + ";line-height:" + ("30px")  + ";background-color:") + (("#edeff4")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#d8dfea")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#d8dfea")  + ";margin-bottom:" + ("10px")  + ";padding-top:" + ("3px")  + ";text-align:" + ("right")  + ";display:" + ("none")  + ";}.Q2LH ul{list-style:" + ("none")  + ";display:" + ("inline")  + ";}.Q2LH li{float:" + ("right")  + ";margin-right:" + ("6px") ) + (";margin-left:" + ("6px")  + ";font-weight:" + ("bold")  + ";}.Q2IH a{padding-right:" + ("10px")  + ";padding-left:" + ("10px")  + ";line-height:" + ("10px")  + ";}.Q2IH{background-color:" + ("white")  + ";border:" + ("solid"+ " " +"1px"+ " " +"#d8dfea")  + ";border-bottom:" + ("0")  + ";padding:" + ("5px")  + ";padding-right:" + ("8px")  + ";padding-left:") + (("8px")  + ";padding-bottom:" + ("8px")  + ";color:" + ("#000")  + ";}.Q2IH:hover{text-decoration:" + ("none")  + ";}")) : ((".Q2HH{text-align:" + ("left")  + ";width:" + ("900px")  + ";margin:" + ("0"+ " " +"auto")  + ";}.Q2MH{text-align:" + ("center")  + ";}.Q2JH{height:" + ("50px")  + ";background-color:" + ("#405774")  + ";padding-top:" + ("10px")  + ";}.Q2KH:hover{opacity:" + ("0.7")  + ";}.Q2LH{height:" + ("30px")  + ";line-height:" + ("30px")  + ";background-color:") + (("#edeff4")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#d8dfea")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#d8dfea")  + ";margin-bottom:" + ("10px")  + ";padding-top:" + ("3px")  + ";text-align:" + ("left")  + ";display:" + ("none")  + ";}.Q2LH ul{list-style:" + ("none")  + ";display:" + ("inline")  + ";}.Q2LH li{float:" + ("left")  + ";margin-left:" + ("6px") ) + (";margin-right:" + ("6px")  + ";font-weight:" + ("bold")  + ";}.Q2IH a{padding-left:" + ("10px")  + ";padding-right:" + ("10px")  + ";line-height:" + ("10px")  + ";}.Q2IH{background-color:" + ("white")  + ";border:" + ("solid"+ " " +"1px"+ " " +"#d8dfea")  + ";border-bottom:" + ("0")  + ";padding:" + ("5px")  + ";padding-left:" + ("8px")  + ";padding-right:") + (("8px")  + ";padding-bottom:" + ("8px")  + ";color:" + ("#000")  + ";}.Q2IH:hover{text-decoration:" + ("none")  + ";}"));
    }
    public java.lang.String container(){
      return "Q2HH";
    }
    public java.lang.String currentTab(){
      return "Q2IH";
    }
    public java.lang.String homeBar(){
      return "Q2JH";
    }
    public java.lang.String logoLink(){
      return "Q2KH";
    }
    public java.lang.String navBar(){
      return "Q2LH";
    }
    public java.lang.String outerContainer(){
      return "Q2MH";
    }
    public java.lang.String tab(){
      return "Q2NH";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.qwertify.client.view.MainPageView_MainPageViewUiBinderImpl_GenCss_style style;
  
  static {
    new MainPageView_MainPageViewUiBinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.qwertify.client.view.MainPageView_MainPageViewUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
