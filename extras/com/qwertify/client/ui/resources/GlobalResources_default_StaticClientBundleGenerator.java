package com.qwertify.client.ui.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class GlobalResources_default_StaticClientBundleGenerator implements com.qwertify.client.ui.resources.GlobalResources {
  public com.google.gwt.resources.client.ImageResource crossIcon() {
    return crossIcon;
  }
  public com.google.gwt.resources.client.ImageResource logoImage() {
    return logoImage;
  }
  public com.qwertify.client.ui.resources.GlobalResources.MainStyle style() {
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
    style = new com.qwertify.client.ui.resources.GlobalResources.MainStyle() {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("body{margin:" + ("0")  + ";padding:" + ("0")  + ";font-family:" + ("\"lucida grande\""+ ","+ " " +"tahoma"+ ","+ " " +"verdana"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("0.8em")  + ";}a{text-decoration:" + ("none")  + ";color:" + ("#3b5998")  + ";}a:hover{text-decoration:" + ("underline")  + ";}.Q2PF{border:" + ("solid"+ " " +"1px"+ " " +"#8493a7")  + ";padding:" + ("3px")  + ";}.Q2NF{position:" + ("relative")  + ";display:") + (("-moz-inline-box")  + ";display:" + ("inline-block")  + ";}* html .Q2NF,:first-child+html .Q2NF{display:" + ("inline")  + ";}.Q2AG{-moz-user-select:" + ("-moz-none")  + ";-webkit-user-select:" + ("none")  + ";user-select:" + ("none")  + ";}.Q2JF{float:" + ("right")  + ";}.Q2KF{float:" + ("left")  + ";}.Q2LF{display:" + ("none")  + ";}.Q2OF{outline:" + ("none")  + ";}")) : (("body{margin:" + ("0")  + ";padding:" + ("0")  + ";font-family:" + ("\"lucida grande\""+ ","+ " " +"tahoma"+ ","+ " " +"verdana"+ ","+ " " +"arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("0.8em")  + ";}a{text-decoration:" + ("none")  + ";color:" + ("#3b5998")  + ";}a:hover{text-decoration:" + ("underline")  + ";}.Q2PF{border:" + ("solid"+ " " +"1px"+ " " +"#8493a7")  + ";padding:" + ("3px")  + ";}.Q2NF{position:" + ("relative")  + ";display:") + (("-moz-inline-box")  + ";display:" + ("inline-block")  + ";}* html .Q2NF,:first-child+html .Q2NF{display:" + ("inline")  + ";}.Q2AG{-moz-user-select:" + ("-moz-none")  + ";-webkit-user-select:" + ("none")  + ";user-select:" + ("none")  + ";}.Q2JF{float:" + ("left")  + ";}.Q2KF{float:" + ("right")  + ";}.Q2LF{display:" + ("none")  + ";}.Q2OF{outline:" + ("none")  + ";}"));
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
    public java.lang.String outlineNone(){
      return "Q2OF";
    }
    public java.lang.String textbox(){
      return "Q2PF";
    }
    public java.lang.String unselectable(){
      return "Q2AG";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "4F096DCDF44E03E16EB5E3C828C0A1B1.cache.png";
  private static com.google.gwt.resources.client.ImageResource crossIcon;
  private static com.google.gwt.resources.client.ImageResource logoImage;
  private static com.qwertify.client.ui.resources.GlobalResources.MainStyle style;
  
  static {
    new GlobalResources_default_StaticClientBundleGenerator()._init0();
  }
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      crossIcon(), 
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
        resourceMap.put("crossIcon", crossIcon());
        resourceMap.put("logoImage", logoImage());
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'crossIcon': return this.@com.qwertify.client.ui.resources.GlobalResources::crossIcon()();
      case 'logoImage': return this.@com.qwertify.client.ui.resources.GlobalResources::logoImage()();
      case 'style': return this.@com.qwertify.client.ui.resources.GlobalResources::style()();
    }
    return null;
  }-*/;
}
