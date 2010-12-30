package com.qwertify.client.ui.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Resources_default_StaticClientBundleGenerator implements com.qwertify.client.ui.resources.Resources {
  public com.google.gwt.resources.client.ImageResource logoImage() {
    return logoImage;
  }
  public com.qwertify.client.ui.resources.Resources.Style style() {
    return style;
  }
  private void _init0() {
    logoImage = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "logoImage",
    bundledImage_None,
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
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "8CA063444CF99BFFF3F633FC4331C2C6.cache.png";
  private static com.google.gwt.resources.client.ImageResource logoImage;
  private static com.qwertify.client.ui.resources.Resources.Style style;
  
  static {
    new Resources_default_StaticClientBundleGenerator()._init0();
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
