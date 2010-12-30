package com.qwertify.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Button_Resources_default_StaticClientBundleGenerator implements com.qwertify.client.ui.widget.Button.Resources {
  public com.qwertify.client.ui.widget.Button.Style style() {
    return style;
  }
  private void _init0() {
    style = new com.qwertify.client.ui.widget.Button.Style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".Q2NF{color:" + ("gray")  + ";cursor:" + ("pointer")  + ";padding:" + ("3px"+ " " +"4px")  + ";border:" + ("solid"+ " " +"1px"+ " " +"navy")  + ";}.Q2PF{background-color:" + ("gray")  + ";color:" + ("black")  + ";}.Q2OF{border:" + ("solid"+ " " +"1px"+ " " +"black")  + ";}.Q2MF{background-color:" + ("navy")  + " !important;color:" + ("white")  + " !important;}")) : ((".Q2NF{color:" + ("gray")  + ";cursor:" + ("pointer")  + ";padding:" + ("3px"+ " " +"4px")  + ";border:" + ("solid"+ " " +"1px"+ " " +"navy")  + ";}.Q2PF{background-color:" + ("gray")  + ";color:" + ("black")  + ";}.Q2OF{border:" + ("solid"+ " " +"1px"+ " " +"black")  + ";}.Q2MF{background-color:" + ("navy")  + " !important;color:" + ("white")  + " !important;}"));
    }
    public java.lang.String activeStyle(){
      return "Q2MF";
    }
    public java.lang.String baseStyle(){
      return "Q2NF";
    }
    public java.lang.String focusStyle(){
      return "Q2OF";
    }
    public java.lang.String hoverStyle(){
      return "Q2PF";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.qwertify.client.ui.widget.Button.Style style;
  
  static {
    new Button_Resources_default_StaticClientBundleGenerator()._init0();
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
      case 'style': return this.@com.qwertify.client.ui.widget.Button.Resources::style()();
    }
    return null;
  }-*/;
}
