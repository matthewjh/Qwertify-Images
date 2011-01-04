package com.qwertify.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ToggleButton_LocalResources_default_StaticClientBundleGenerator implements com.qwertify.client.ui.widget.ToggleButton.LocalResources {
  public com.qwertify.client.ui.widget.ToggleButton.Style style() {
    return style;
  }
  private void _init0() {
    style = new com.qwertify.client.ui.widget.ToggleButton.Style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".Q2BH{background:" + ("#000")  + ";}")) : ((".Q2BH{background:" + ("#000")  + ";}"));
    }
    public java.lang.String toggledStyle(){
      return "Q2BH";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.qwertify.client.ui.widget.ToggleButton.Style style;
  
  static {
    new ToggleButton_LocalResources_default_StaticClientBundleGenerator()._init0();
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
      case 'style': return this.@com.qwertify.client.ui.widget.ToggleButton.LocalResources::style()();
    }
    return null;
  }-*/;
}
