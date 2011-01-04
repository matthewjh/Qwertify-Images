package com.qwertify.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Button_LocalResources_default_StaticClientBundleGenerator implements com.qwertify.client.ui.widget.Button.LocalResources {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".Q2BG{font-size:" + ("0.9em")  + ";text-align:" + ("center")  + ";white-space:" + ("nowrap")  + ";position:" + ("relative")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";-webkit-border-radius:" + ("3px")  + ";border-radius:" + ("3px")  + ";-moz-border-radius:" + ("3px")  + ";padding:" + ("4px"+ " " +"6px")  + ";padding-bottom:") + (("5px")  + ";cursor:" + ("pointer")  + ";font-weight:" + ("bold")  + ";width:" + ("auto")  + ";overflow:" + ("visible")  + ";}.Q2GG{border:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#999")  + ";background:" + ("#f9f9f9")  + ";background:" + ("-moz-linear-gradient(top, #F9F9F9 0%, #E8E8E8 100%)")  + ";background:" + ("-webkit-gradient(linear, left top, left bottom, color-stop(0%,#F9F9F9), color-stop(100%,#E8E8E8))")  + ";background:" + ("filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#F9F9F9',endColorstr='#E8E8E8',GradientType=0)") ) + (";color:" + ("#333")  + ";font-weight:" + ("bold")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"#f0f0f0")  + ";}.Q2GG:hover{border-color:" + ("#666")  + ";}.Q2GG:active{background:" + ("#e4e4e4")  + ";}.Q2HG{position:" + ("relative")  + ";top:" + ("2px")  + ";right:" + ("1px")  + ";margin-left:" + ("5px")  + ";}.Q2IG{positon:" + ("relative")  + ";top:") + (("2px")  + ";left:" + ("1px")  + ";margin-right:" + ("2px")  + ";}.Q2EG{cursor:" + ("default")  + ";outline:" + ("none")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";background-color:" + ("#f4f4f4")  + ";color:" + ("#a7a7a7")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"#fff")  + ";}.Q2EG .Q2HG,.Q2EG .Q2IG{opacity:" + ("0.5")  + ";-ms-filter:" + ("'progid:DXImageTransform.Microsoft.Alpha(Opacity=50)'") ) + (";filter:" + ("alpha(opacity=50)")  + ";}.Q2EG .Q2FG{display:" + ("block")  + ";}.Q2FG{outline:" + ("none")  + ";background-color:" + ("#eee")  + ";position:" + ("absolute")  + ";bottom:" + ("1px")  + ";left:" + ("1px")  + ";right:" + ("1px")  + ";top:" + ("1px")  + ";-webkit-border-radius:" + ("3px")  + ";-moz-border-radius:") + (("3px")  + ";border-radius:" + ("3px")  + ";display:" + ("none")  + ";z-index:" + ("-5")  + ";}.Q2CG.Q2BG{margin-right:" + ("-2px")  + " !important;z-index:" + ("2")  + ";}.Q2CG.Q2EG.Q2BG{z-index:" + ("0")  + ";}.Q2CG.Q2BG:hover{z-index:" + ("2")  + ";}.Q2CG{-webkit-border-top-right-radius:" + ("0")  + " !important;-webkit-border-bottom-right-radius:" + ("0")  + " !important;-moz-border-radius-topleft:" + ("0") ) + (" !important;-moz-border-radius-bottomleft:" + ("0")  + " !important;border-top-right-radius:" + ("0")  + " !important;border-bottom-right-radius:" + ("0")  + " !important;}.Q2DG.Q2BG{margin-left:" + ("-1px")  + " !important;z-index:" + ("1")  + ";}.Q2DG.Q2EG.Q2BG{z-index:" + ("1")  + ";}.Q2DG.Q2BG:hover{z-index:" + ("3")  + ";}.Q2DG{-webkit-border-top-left-radius:" + ("0")  + " !important;-webkit-border-bottom-left-radius:" + ("0")  + " !important;-moz-border-radius-topright:" + ("0")  + " !important;-moz-border-radius-bottomright:") + (("0")  + " !important;border-top-left-radius:" + ("0")  + " !important;border-bottom-left-radius:" + ("0")  + " !important;}")) : ((".Q2BG{font-size:" + ("0.9em")  + ";text-align:" + ("center")  + ";white-space:" + ("nowrap")  + ";position:" + ("relative")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";-webkit-border-radius:" + ("3px")  + ";border-radius:" + ("3px")  + ";-moz-border-radius:" + ("3px")  + ";padding:" + ("4px"+ " " +"6px")  + ";padding-bottom:") + (("5px")  + ";cursor:" + ("pointer")  + ";font-weight:" + ("bold")  + ";width:" + ("auto")  + ";overflow:" + ("visible")  + ";}.Q2GG{border:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#999")  + ";background:" + ("#f9f9f9")  + ";background:" + ("-moz-linear-gradient(top, #F9F9F9 0%, #E8E8E8 100%)")  + ";background:" + ("-webkit-gradient(linear, left top, left bottom, color-stop(0%,#F9F9F9), color-stop(100%,#E8E8E8))")  + ";background:" + ("filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#F9F9F9',endColorstr='#E8E8E8',GradientType=0)") ) + (";color:" + ("#333")  + ";font-weight:" + ("bold")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"#f0f0f0")  + ";}.Q2GG:hover{border-color:" + ("#666")  + ";}.Q2GG:active{background:" + ("#e4e4e4")  + ";}.Q2HG{position:" + ("relative")  + ";top:" + ("2px")  + ";left:" + ("1px")  + ";margin-right:" + ("5px")  + ";}.Q2IG{positon:" + ("relative")  + ";top:") + (("2px")  + ";right:" + ("1px")  + ";margin-left:" + ("2px")  + ";}.Q2EG{cursor:" + ("default")  + ";outline:" + ("none")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";background-color:" + ("#f4f4f4")  + ";color:" + ("#a7a7a7")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"#fff")  + ";}.Q2EG .Q2HG,.Q2EG .Q2IG{opacity:" + ("0.5")  + ";-ms-filter:" + ("'progid:DXImageTransform.Microsoft.Alpha(Opacity=50)'") ) + (";filter:" + ("alpha(opacity=50)")  + ";}.Q2EG .Q2FG{display:" + ("block")  + ";}.Q2FG{outline:" + ("none")  + ";background-color:" + ("#eee")  + ";position:" + ("absolute")  + ";bottom:" + ("1px")  + ";right:" + ("1px")  + ";left:" + ("1px")  + ";top:" + ("1px")  + ";-webkit-border-radius:" + ("3px")  + ";-moz-border-radius:") + (("3px")  + ";border-radius:" + ("3px")  + ";display:" + ("none")  + ";z-index:" + ("-5")  + ";}.Q2CG.Q2BG{margin-left:" + ("-2px")  + " !important;z-index:" + ("2")  + ";}.Q2CG.Q2EG.Q2BG{z-index:" + ("0")  + ";}.Q2CG.Q2BG:hover{z-index:" + ("2")  + ";}.Q2CG{-webkit-border-top-left-radius:" + ("0")  + " !important;-webkit-border-bottom-left-radius:" + ("0")  + " !important;-moz-border-radius-topleft:" + ("0") ) + (" !important;-moz-border-radius-bottomleft:" + ("0")  + " !important;border-top-left-radius:" + ("0")  + " !important;border-bottom-left-radius:" + ("0")  + " !important;}.Q2DG.Q2BG{margin-right:" + ("-1px")  + " !important;z-index:" + ("1")  + ";}.Q2DG.Q2EG.Q2BG{z-index:" + ("1")  + ";}.Q2DG.Q2BG:hover{z-index:" + ("3")  + ";}.Q2DG{-webkit-border-top-right-radius:" + ("0")  + " !important;-webkit-border-bottom-right-radius:" + ("0")  + " !important;-moz-border-radius-topright:" + ("0")  + " !important;-moz-border-radius-bottomright:") + (("0")  + " !important;border-top-right-radius:" + ("0")  + " !important;border-bottom-right-radius:" + ("0")  + " !important;}"));
    }
    public java.lang.String buttonBaseStyle(){
      return "Q2BG";
    }
    public java.lang.String buttonCollapsedLeftBorderStyle(){
      return "Q2CG";
    }
    public java.lang.String buttonCollapsedRightBorderStyle(){
      return "Q2DG";
    }
    public java.lang.String buttonDisabledStyle(){
      return "Q2EG";
    }
    public java.lang.String buttonDisabledUnderlayStyle(){
      return "Q2FG";
    }
    public java.lang.String buttonEnabledStyle(){
      return "Q2GG";
    }
    public java.lang.String leftImagePlaceholderStyle(){
      return "Q2HG";
    }
    public java.lang.String rightImagePlaceholderStyle(){
      return "Q2IG";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.qwertify.client.ui.widget.Button.Style style;
  
  static {
    new Button_LocalResources_default_StaticClientBundleGenerator()._init0();
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
      case 'style': return this.@com.qwertify.client.ui.widget.Button.LocalResources::style()();
    }
    return null;
  }-*/;
}
