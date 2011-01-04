package com.qwertify.client.ui.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Resources_default_StaticClientBundleGenerator implements com.qwertify.client.ui.resources.Resources {
  public com.google.gwt.resources.client.ImageResource crossIcon() {
    return crossIcon;
  }
  public com.google.gwt.resources.client.ImageResource logoImage() {
    return logoImage;
  }
  public com.qwertify.client.ui.resources.Resources.ImageStyle iconStyle() {
    return iconStyle;
  }
  public com.qwertify.client.ui.resources.Resources.MainStyle style() {
    return style;
  }
  private void _init0() {
    crossIcon = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "crossIcon",
    bundledImage_None,
    180, 0, 12, 12, false, false
  );
    logoImage = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
    "logoImage",
    bundledImage_None,
    0, 0, 180, 41, false, false
  );
    iconStyle = new com.qwertify.client.ui.resources.Resources.ImageStyle() {
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
      return "iconStyle";
    }
    public String getText() {
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".Q2IF{height:" + ((Resources_default_StaticClientBundleGenerator.this.crossIcon()).getHeight() + "px")  + ";width:" + ((Resources_default_StaticClientBundleGenerator.this.crossIcon()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Resources_default_StaticClientBundleGenerator.this.crossIcon()).getURL() + "\") -" + (Resources_default_StaticClientBundleGenerator.this.crossIcon()).getLeft() + "px -" + (Resources_default_StaticClientBundleGenerator.this.crossIcon()).getTop() + "px  no-repeat")  + ";}")) : ((".Q2IF{height:" + ((Resources_default_StaticClientBundleGenerator.this.crossIcon()).getHeight() + "px")  + ";width:" + ((Resources_default_StaticClientBundleGenerator.this.crossIcon()).getWidth() + "px")  + ";overflow:" + ("hidden")  + ";background:" + ("url(\"" + (Resources_default_StaticClientBundleGenerator.this.crossIcon()).getURL() + "\") -" + (Resources_default_StaticClientBundleGenerator.this.crossIcon()).getLeft() + "px -" + (Resources_default_StaticClientBundleGenerator.this.crossIcon()).getTop() + "px  no-repeat")  + ";}"));
    }
    public java.lang.String cross(){
      return "Q2IF";
    }
  }
  ;
    style = new com.qwertify.client.ui.resources.Resources.MainStyle() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("body{margin:" + ("0")  + ";padding:" + ("0")  + ";font-family:" + ("\"lucida grande\""+ ","+ " " +"tahoma"+ ","+ " " +"verdana"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("0.8em")  + ";}a{text-decoration:" + ("none")  + ";color:" + ("#3b5998")  + ";}a:hover{text-decoration:" + ("underline")  + ";}.Q2OF{border:" + ("solid"+ " " +"1px"+ " " +"gray")  + ";}.Q2NF{position:" + ("relative")  + ";display:" + ("-moz-inline-box")  + ";display:") + (("inline-block")  + ";}* html .Q2NF,:first-child+html .Q2NF{display:" + ("inline")  + ";}.Q2PF{-moz-user-select:" + ("-moz-none")  + ";-webkit-user-select:" + ("none")  + ";user-select:" + ("none")  + ";}.Q2JF{float:" + ("right")  + ";}.Q2KF{float:" + ("left")  + ";}.Q2LF{display:" + ("none")  + ";}")) : (("body{margin:" + ("0")  + ";padding:" + ("0")  + ";font-family:" + ("\"lucida grande\""+ ","+ " " +"tahoma"+ ","+ " " +"verdana"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("0.8em")  + ";}a{text-decoration:" + ("none")  + ";color:" + ("#3b5998")  + ";}a:hover{text-decoration:" + ("underline")  + ";}.Q2OF{border:" + ("solid"+ " " +"1px"+ " " +"gray")  + ";}.Q2NF{position:" + ("relative")  + ";display:" + ("-moz-inline-box")  + ";display:") + (("inline-block")  + ";}* html .Q2NF,:first-child+html .Q2NF{display:" + ("inline")  + ";}.Q2PF{-moz-user-select:" + ("-moz-none")  + ";-webkit-user-select:" + ("none")  + ";user-select:" + ("none")  + ";}.Q2JF{float:" + ("left")  + ";}.Q2KF{float:" + ("right")  + ";}.Q2LF{display:" + ("none")  + ";}"));
    }
    public java.lang.String floatLeft(){
      return "Q2JF";
    }
    public java.lang.String floatRight(){
      return "Q2KF";
    }
    public java.lang.String hidden(){
      return "Q2LF";
    }
    public java.lang.String imageWidget(){
      return "Q2MF";
    }
    public java.lang.String inlineBlock(){
      return "Q2NF";
    }
    public java.lang.String textbox(){
      return "Q2OF";
    }
    public java.lang.String unselectable(){
      return "Q2PF";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "4F096DCDF44E03E16EB5E3C828C0A1B1.cache.png";
  private static com.google.gwt.resources.client.ImageResource crossIcon;
  private static com.google.gwt.resources.client.ImageResource logoImage;
  private static com.qwertify.client.ui.resources.Resources.ImageStyle iconStyle;
  private static com.qwertify.client.ui.resources.Resources.MainStyle style;
  
  static {
    new Resources_default_StaticClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      crossIcon(), 
      logoImage(), 
      iconStyle(), 
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("crossIcon", crossIcon());
        resourceMap.put("logoImage", logoImage());
        resourceMap.put("iconStyle", iconStyle());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'crossIcon': return this.@com.qwertify.client.ui.resources.Resources::crossIcon()();
      case 'logoImage': return this.@com.qwertify.client.ui.resources.Resources::logoImage()();
      case 'iconStyle': return this.@com.qwertify.client.ui.resources.Resources::iconStyle()();
      case 'style': return this.@com.qwertify.client.ui.resources.Resources::style()();
    }
    return null;
  }-*/;
}
