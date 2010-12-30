package com.qwertify.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class Button_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.qwertify.client.ui.widget.Button>, com.qwertify.client.ui.widget.Button.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.qwertify.client.ui.widget.Button owner) {

    com.qwertify.client.ui.widget.Button_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.qwertify.client.ui.widget.Button_BinderImpl_GenBundle) GWT.create(com.qwertify.client.ui.widget.Button_BinderImpl_GenBundle.class);
    com.qwertify.client.ui.resources.Resources global = (com.qwertify.client.ui.resources.Resources) GWT.create(com.qwertify.client.ui.resources.Resources.class);
    com.qwertify.client.ui.widget.Button.Resources resources = owner.resources;
    com.google.gwt.dom.client.DivElement buttonDiv = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("span", "<div class='" + "" + resources.style().baseStyle() + " " + global.style().inlineBlock() + " " + global.style().unselectable() + "" + "' id='" + domId0 + "' unselectable='on'></div>");


    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    buttonDiv = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    buttonDiv.removeAttribute("id");
    attachRecord0.detach();


    owner.buttonDiv = buttonDiv;

    return f_HTMLPanel1;
  }
}
