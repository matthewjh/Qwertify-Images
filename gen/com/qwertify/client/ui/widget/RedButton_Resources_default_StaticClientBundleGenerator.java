package com.qwertify.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class RedButton_Resources_default_StaticClientBundleGenerator implements com.qwertify.client.ui.widget.RedButton.Resources {
  public com.qwertify.client.ui.widget.RedButton.Style style() {
    return style;
  }
  private void _init0() {
    style = new com.qwertify.client.ui.widget.RedButton.Style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".Q2BG{color:" + ("gray")  + ";cursor:" + ("pointer")  + ";padding:" + ("3px"+ " " +"4px")  + ";border:" + ("solid"+ " " +"1px"+ " " +"navy")  + ";}.Q2DG{background-color:" + ("gray")  + ";color:" + ("black")  + ";}.Q2CG{border:" + ("solid"+ " " +"1px"+ " " +"black")  + ";}.Q2AG{background-color:" + ("navy")  + " !important;color:" + ("white")  + " !important;}.Q2BG{color:" + ("red")  + ";cursor:") + (("pointer")  + ";padding:" + ("3px"+ " " +"4px")  + ";border:" + ("solid"+ " " +"1px"+ " " +"navy")  + ";}.Q2DG{background-color:" + ("red")  + ";color:" + ("black")  + ";}.Q2CG{border:" + ("solid"+ " " +"1px"+ " " +"black")  + ";}")) : ((".Q2BG{color:" + ("gray")  + ";cursor:" + ("pointer")  + ";padding:" + ("3px"+ " " +"4px")  + ";border:" + ("solid"+ " " +"1px"+ " " +"navy")  + ";}.Q2DG{background-color:" + ("gray")  + ";color:" + ("black")  + ";}.Q2CG{border:" + ("solid"+ " " +"1px"+ " " +"black")  + ";}.Q2AG{background-color:" + ("navy")  + " !important;color:" + ("white")  + " !important;}.Q2BG{color:" + ("red")  + ";cursor:") + (("pointer")  + ";padding:" + ("3px"+ " " +"4px")  + ";border:" + ("solid"+ " " +"1px"+ " " +"navy")  + ";}.Q2DG{background-color:" + ("red")  + ";color:" + ("black")  + ";}.Q2CG{border:" + ("solid"+ " " +"1px"+ " " +"black")  + ";}"));
    }
    public java.lang.String activeStyle(){
      return "Q2AG";
    }
    public java.lang.String baseStyle(){
      return "Q2BG";
    }
    public java.lang.String focusStyle(){
      return "Q2CG";
    }
    public java.lang.String hoverStyle(){
      return "Q2DG";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.qwertify.client.ui.widget.RedButton.Style style;
  
  static {
    new RedButton_Resources_default_StaticClientBundleGenerator()._init0();
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
      case 'style': return this.@com.qwertify.client.ui.widget.RedButton.Resources::style()();
    }
    return null;
  }-*/;
}
