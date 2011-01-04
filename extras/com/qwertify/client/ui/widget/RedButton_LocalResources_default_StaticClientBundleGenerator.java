package com.qwertify.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class RedButton_LocalResources_default_StaticClientBundleGenerator implements com.qwertify.client.ui.widget.RedButton.LocalResources {
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
      return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".Q2JG{font-size:" + ("0.9em")  + ";text-align:" + ("center")  + ";white-space:" + ("nowrap")  + ";position:" + ("relative")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";-webkit-border-radius:" + ("3px")  + ";border-radius:" + ("3px")  + ";-moz-border-radius:" + ("3px")  + ";padding:" + ("4px"+ " " +"6px")  + ";padding-bottom:") + (("5px")  + ";cursor:" + ("pointer")  + ";font-weight:" + ("bold")  + ";width:" + ("auto")  + ";overflow:" + ("visible")  + ";}.Q2OG{border:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#999")  + ";background:" + ("#f9f9f9")  + ";background:" + ("-moz-linear-gradient(top, #F9F9F9 0%, #E8E8E8 100%)")  + ";background:" + ("-webkit-gradient(linear, left top, left bottom, color-stop(0%,#F9F9F9), color-stop(100%,#E8E8E8))")  + ";background:" + ("filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#F9F9F9',endColorstr='#E8E8E8',GradientType=0)") ) + (";color:" + ("#333")  + ";font-weight:" + ("bold")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"#f0f0f0")  + ";}.Q2OG:hover{border-color:" + ("#666")  + ";}.Q2OG:active{background:" + ("#e4e4e4")  + ";}.Q2PG{position:" + ("relative")  + ";top:" + ("2px")  + ";right:" + ("1px")  + ";margin-left:" + ("5px")  + ";}.Q2AH{positon:" + ("relative")  + ";top:") + (("2px")  + ";left:" + ("1px")  + ";margin-right:" + ("2px")  + ";}.Q2MG{cursor:" + ("default")  + ";outline:" + ("none")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";background-color:" + ("#f4f4f4")  + ";color:" + ("#a7a7a7")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"#fff")  + ";}.Q2MG .Q2PG,.Q2MG .Q2AH{opacity:" + ("0.5")  + ";-ms-filter:" + ("'progid:DXImageTransform.Microsoft.Alpha(Opacity=50)'") ) + (";filter:" + ("alpha(opacity=50)")  + ";}.Q2MG .Q2NG{display:" + ("block")  + ";}.Q2NG{outline:" + ("none")  + ";background-color:" + ("#eee")  + ";position:" + ("absolute")  + ";bottom:" + ("1px")  + ";left:" + ("1px")  + ";right:" + ("1px")  + ";top:" + ("1px")  + ";-webkit-border-radius:" + ("3px")  + ";-moz-border-radius:") + (("3px")  + ";border-radius:" + ("3px")  + ";display:" + ("none")  + ";z-index:" + ("-5")  + ";}.Q2KG.Q2JG{margin-right:" + ("-2px")  + " !important;z-index:" + ("2")  + ";}.Q2KG.Q2MG.Q2JG{z-index:" + ("0")  + ";}.Q2KG.Q2JG:hover{z-index:" + ("2")  + ";}.Q2KG{-webkit-border-top-right-radius:" + ("0")  + " !important;-webkit-border-bottom-right-radius:" + ("0")  + " !important;-moz-border-radius-topleft:" + ("0") ) + (" !important;-moz-border-radius-bottomleft:" + ("0")  + " !important;border-top-right-radius:" + ("0")  + " !important;border-bottom-right-radius:" + ("0")  + " !important;}.Q2LG.Q2JG{margin-left:" + ("-1px")  + " !important;z-index:" + ("1")  + ";}.Q2LG.Q2MG.Q2JG{z-index:" + ("1")  + ";}.Q2LG.Q2JG:hover{z-index:" + ("3")  + ";}.Q2LG{-webkit-border-top-left-radius:" + ("0")  + " !important;-webkit-border-bottom-left-radius:" + ("0")  + " !important;-moz-border-radius-topright:" + ("0")  + " !important;-moz-border-radius-bottomright:") + (("0")  + " !important;border-top-left-radius:" + ("0")  + " !important;border-bottom-left-radius:" + ("0")  + " !important;}")) : ((".Q2JG{font-size:" + ("0.9em")  + ";text-align:" + ("center")  + ";white-space:" + ("nowrap")  + ";position:" + ("relative")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";-webkit-border-radius:" + ("3px")  + ";border-radius:" + ("3px")  + ";-moz-border-radius:" + ("3px")  + ";padding:" + ("4px"+ " " +"6px")  + ";padding-bottom:") + (("5px")  + ";cursor:" + ("pointer")  + ";font-weight:" + ("bold")  + ";width:" + ("auto")  + ";overflow:" + ("visible")  + ";}.Q2OG{border:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#999")  + ";background:" + ("#f9f9f9")  + ";background:" + ("-moz-linear-gradient(top, #F9F9F9 0%, #E8E8E8 100%)")  + ";background:" + ("-webkit-gradient(linear, left top, left bottom, color-stop(0%,#F9F9F9), color-stop(100%,#E8E8E8))")  + ";background:" + ("filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#F9F9F9',endColorstr='#E8E8E8',GradientType=0)") ) + (";color:" + ("#333")  + ";font-weight:" + ("bold")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"#f0f0f0")  + ";}.Q2OG:hover{border-color:" + ("#666")  + ";}.Q2OG:active{background:" + ("#e4e4e4")  + ";}.Q2PG{position:" + ("relative")  + ";top:" + ("2px")  + ";left:" + ("1px")  + ";margin-right:" + ("5px")  + ";}.Q2AH{positon:" + ("relative")  + ";top:") + (("2px")  + ";right:" + ("1px")  + ";margin-left:" + ("2px")  + ";}.Q2MG{cursor:" + ("default")  + ";outline:" + ("none")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#bbb")  + ";background-color:" + ("#f4f4f4")  + ";color:" + ("#a7a7a7")  + ";text-shadow:" + ("0"+ " " +"1px"+ " " +"#fff")  + ";}.Q2MG .Q2PG,.Q2MG .Q2AH{opacity:" + ("0.5")  + ";-ms-filter:" + ("'progid:DXImageTransform.Microsoft.Alpha(Opacity=50)'") ) + (";filter:" + ("alpha(opacity=50)")  + ";}.Q2MG .Q2NG{display:" + ("block")  + ";}.Q2NG{outline:" + ("none")  + ";background-color:" + ("#eee")  + ";position:" + ("absolute")  + ";bottom:" + ("1px")  + ";right:" + ("1px")  + ";left:" + ("1px")  + ";top:" + ("1px")  + ";-webkit-border-radius:" + ("3px")  + ";-moz-border-radius:") + (("3px")  + ";border-radius:" + ("3px")  + ";display:" + ("none")  + ";z-index:" + ("-5")  + ";}.Q2KG.Q2JG{margin-left:" + ("-2px")  + " !important;z-index:" + ("2")  + ";}.Q2KG.Q2MG.Q2JG{z-index:" + ("0")  + ";}.Q2KG.Q2JG:hover{z-index:" + ("2")  + ";}.Q2KG{-webkit-border-top-left-radius:" + ("0")  + " !important;-webkit-border-bottom-left-radius:" + ("0")  + " !important;-moz-border-radius-topleft:" + ("0") ) + (" !important;-moz-border-radius-bottomleft:" + ("0")  + " !important;border-top-left-radius:" + ("0")  + " !important;border-bottom-left-radius:" + ("0")  + " !important;}.Q2LG.Q2JG{margin-right:" + ("-1px")  + " !important;z-index:" + ("1")  + ";}.Q2LG.Q2MG.Q2JG{z-index:" + ("1")  + ";}.Q2LG.Q2JG:hover{z-index:" + ("3")  + ";}.Q2LG{-webkit-border-top-right-radius:" + ("0")  + " !important;-webkit-border-bottom-right-radius:" + ("0")  + " !important;-moz-border-radius-topright:" + ("0")  + " !important;-moz-border-radius-bottomright:") + (("0")  + " !important;border-top-right-radius:" + ("0")  + " !important;border-bottom-right-radius:" + ("0")  + " !important;}"));
    }
    public java.lang.String buttonBaseStyle(){
      return "Q2JG";
    }
    public java.lang.String buttonCollapsedLeftBorderStyle(){
      return "Q2KG";
    }
    public java.lang.String buttonCollapsedRightBorderStyle(){
      return "Q2LG";
    }
    public java.lang.String buttonDisabledStyle(){
      return "Q2MG";
    }
    public java.lang.String buttonDisabledUnderlayStyle(){
      return "Q2NG";
    }
    public java.lang.String buttonEnabledStyle(){
      return "Q2OG";
    }
    public java.lang.String leftImagePlaceholderStyle(){
      return "Q2PG";
    }
    public java.lang.String rightImagePlaceholderStyle(){
      return "Q2AH";
    }
  }
  ;
  }
  
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.qwertify.client.ui.widget.RedButton.Style style;
  
  static {
    new RedButton_LocalResources_default_StaticClientBundleGenerator()._init0();
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
      case 'style': return this.@com.qwertify.client.ui.widget.RedButton.LocalResources::style()();
    }
    return null;
  }-*/;
}
