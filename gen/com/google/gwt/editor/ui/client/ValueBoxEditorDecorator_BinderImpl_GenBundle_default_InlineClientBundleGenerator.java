package com.google.gwt.editor.ui.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ValueBoxEditorDecorator_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_BinderImpl_GenBundle {
  public com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_BinderImpl_GenCss_style style() {
    return style;
  }
  private void _init0() {
    style = new com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_BinderImpl_GenCss_style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".Q2FH{display:" + ("inline")  + ";}.Q2GH{display:" + ("none")  + ";white-space:" + ("pre")  + ";}")) : ((".Q2FH{display:" + ("inline")  + ";}.Q2GH{display:" + ("none")  + ";white-space:" + ("pre")  + ";}"));
    }
    public java.lang.String contents(){
      return "Q2FH";
    }
    public java.lang.String errorLabel(){
      return "Q2GH";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_BinderImpl_GenCss_style style;
  
  static {
    new ValueBoxEditorDecorator_BinderImpl_GenBundle_default_InlineClientBundleGenerator()._init0();
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
      case 'style': return this.@com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
