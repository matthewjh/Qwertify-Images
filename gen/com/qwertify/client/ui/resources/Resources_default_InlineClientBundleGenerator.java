package com.qwertify.client.ui.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Resources_default_InlineClientBundleGenerator implements com.qwertify.client.ui.resources.Resources {
  public com.google.gwt.resources.client.ImageResource logoImage() {
    return logoImage;
  }
  public com.qwertify.client.ui.resources.Resources.Style style() {
    return style;
  }
  private void _init0() {
    logoImage = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "logoImage",
    externalImage,
    0, 0, 180, 41, false, false
  );
    style = new com.qwertify.client.ui.resources.Resources.Style() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("*,a:active{outline:" + ("none")  + ";}body{margin:" + ("0")  + ";padding:" + ("0")  + ";font-family:" + ("\"lucida grande\""+ ","+ " " +"tahoma"+ ","+ " " +"verdana"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("0.8em")  + ";}a{text-decoration:" + ("none")  + ";color:" + ("#3b5998")  + ";}a:hover{text-decoration:" + ("underline")  + ";}a:focus{-moz-outline-style:" + ("none")  + ";}.Q2KF{border:" + ("solid"+ " " +"1px"+ " " +"gray")  + ";}.Q2JF{position:") + (("relative")  + ";display:" + ("-moz-inline-box")  + ";display:" + ("inline-block")  + ";}* html .Q2JF,:first-child+html .Q2JF{display:" + ("inline")  + ";}.Q2LF{-moz-user-select:" + ("-moz-none")  + ";-webkit-user-select:" + ("none")  + ";user-select:" + ("none")  + ";}")) : (("*,a:active{outline:" + ("none")  + ";}body{margin:" + ("0")  + ";padding:" + ("0")  + ";font-family:" + ("\"lucida grande\""+ ","+ " " +"tahoma"+ ","+ " " +"verdana"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("0.8em")  + ";}a{text-decoration:" + ("none")  + ";color:" + ("#3b5998")  + ";}a:hover{text-decoration:" + ("underline")  + ";}a:focus{-moz-outline-style:" + ("none")  + ";}.Q2KF{border:" + ("solid"+ " " +"1px"+ " " +"gray")  + ";}.Q2JF{position:") + (("relative")  + ";display:" + ("-moz-inline-box")  + ";display:" + ("inline-block")  + ";}* html .Q2JF,:first-child+html .Q2JF{display:" + ("inline")  + ";}.Q2LF{-moz-user-select:" + ("-moz-none")  + ";-webkit-user-select:" + ("none")  + ";user-select:" + ("none")  + ";}"));
    }
    public java.lang.String imageWidget(){
      return "Q2IF";
    }
    public java.lang.String inlineBlock(){
      return "Q2JF";
    }
    public java.lang.String textbox(){
      return "Q2KF";
    }
    public java.lang.String unselectable(){
      return "Q2LF";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String externalImage = "data:image/png;base64,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";
  private static com.google.gwt.resources.client.ImageResource logoImage;
  private static com.qwertify.client.ui.resources.Resources.Style style;
  
  static {
    new Resources_default_InlineClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      logoImage(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("logoImage", logoImage());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'logoImage': return this.@com.qwertify.client.ui.resources.Resources::logoImage()();
      case 'style': return this.@com.qwertify.client.ui.resources.Resources::style()();
    }
    return null;
  }-*/;
}
