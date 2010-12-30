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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".Q2GG{text-align:" + ("right")  + ";width:" + ("900px")  + ";margin:" + ("0"+ " " +"auto")  + ";}.Q2LG{text-align:" + ("center")  + ";}.Q2IG{height:" + ("50px")  + ";background-color:" + ("#405774")  + ";padding-top:" + ("10px")  + ";}.Q2JG:hover{opacity:" + ("0.7")  + ";}.Q2KG{height:" + ("30px")  + ";line-height:" + ("30px")  + ";background-color:") + (("#edeff4")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#d8dfea")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#d8dfea")  + ";margin-bottom:" + ("10px")  + ";padding-top:" + ("3px")  + ";text-align:" + ("right")  + ";display:" + ("none")  + ";}.Q2KG ul{list-style:" + ("none")  + ";display:" + ("inline")  + ";}.Q2KG li{float:" + ("right")  + ";margin-right:" + ("6px") ) + (";margin-left:" + ("6px")  + ";font-weight:" + ("bold")  + ";}.Q2HG a{padding-right:" + ("10px")  + ";padding-left:" + ("10px")  + ";line-height:" + ("10px")  + ";}.Q2HG{background-color:" + ("white")  + ";border:" + ("solid"+ " " +"1px"+ " " +"#d8dfea")  + ";border-bottom:" + ("0")  + ";padding:" + ("5px")  + ";padding-right:" + ("8px")  + ";padding-left:") + (("8px")  + ";padding-bottom:" + ("8px")  + ";color:" + ("#000")  + ";}.Q2HG:hover{text-decoration:" + ("none")  + ";}")) : ((".Q2GG{text-align:" + ("left")  + ";width:" + ("900px")  + ";margin:" + ("0"+ " " +"auto")  + ";}.Q2LG{text-align:" + ("center")  + ";}.Q2IG{height:" + ("50px")  + ";background-color:" + ("#405774")  + ";padding-top:" + ("10px")  + ";}.Q2JG:hover{opacity:" + ("0.7")  + ";}.Q2KG{height:" + ("30px")  + ";line-height:" + ("30px")  + ";background-color:") + (("#edeff4")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#d8dfea")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#d8dfea")  + ";margin-bottom:" + ("10px")  + ";padding-top:" + ("3px")  + ";text-align:" + ("left")  + ";display:" + ("none")  + ";}.Q2KG ul{list-style:" + ("none")  + ";display:" + ("inline")  + ";}.Q2KG li{float:" + ("left")  + ";margin-left:" + ("6px") ) + (";margin-right:" + ("6px")  + ";font-weight:" + ("bold")  + ";}.Q2HG a{padding-left:" + ("10px")  + ";padding-right:" + ("10px")  + ";line-height:" + ("10px")  + ";}.Q2HG{background-color:" + ("white")  + ";border:" + ("solid"+ " " +"1px"+ " " +"#d8dfea")  + ";border-bottom:" + ("0")  + ";padding:" + ("5px")  + ";padding-left:" + ("8px")  + ";padding-right:") + (("8px")  + ";padding-bottom:" + ("8px")  + ";color:" + ("#000")  + ";}.Q2HG:hover{text-decoration:" + ("none")  + ";}"));
    }
    public java.lang.String container(){
      return "Q2GG";
    }
    public java.lang.String currentTab(){
      return "Q2HG";
    }
    public java.lang.String homeBar(){
      return "Q2IG";
    }
    public java.lang.String logoLink(){
      return "Q2JG";
    }
    public java.lang.String navBar(){
      return "Q2KG";
    }
    public java.lang.String outerContainer(){
      return "Q2LG";
    }
    public java.lang.String tab(){
      return "Q2MG";
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
