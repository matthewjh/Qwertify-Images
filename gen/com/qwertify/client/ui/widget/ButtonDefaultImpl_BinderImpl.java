package com.qwertify.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ButtonDefaultImpl_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.qwertify.client.ui.widget.ButtonDefaultImpl>, com.qwertify.client.ui.widget.ButtonDefaultImpl.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.qwertify.client.ui.widget.ButtonDefaultImpl owner) {

    com.qwertify.client.ui.widget.ButtonDefaultImpl_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.qwertify.client.ui.widget.ButtonDefaultImpl_BinderImpl_GenBundle) GWT.create(com.qwertify.client.ui.widget.ButtonDefaultImpl_BinderImpl_GenBundle.class);
    com.qwertify.client.ui.resources.GlobalResources global = (com.qwertify.client.ui.resources.GlobalResources) GWT.create(com.qwertify.client.ui.resources.GlobalResources.class);
    com.qwertify.client.ui.widget.ButtonDefaultImpl.LocalResources resources = owner.resources;
    com.google.gwt.dom.client.SpanElement buttonLeftImagePlaceholder = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.qwertify.client.ui.widget.Image buttonLeftImage = (com.qwertify.client.ui.widget.Image) GWT.create(com.qwertify.client.ui.widget.Image.class);
    com.google.gwt.dom.client.SpanElement buttonLabelSpan = null;
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.dom.client.SpanElement buttonRightImagePlaceholder = null;
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.qwertify.client.ui.widget.Image buttonRightImage = (com.qwertify.client.ui.widget.Image) GWT.create(com.qwertify.client.ui.widget.Image.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("button", "<span class='" + "" + resources.style().leftImagePlaceholderStyle() + " " + global.style().floatLeft() + " " + global.style().hidden() + "" + "' id='" + domId0 + "'> <span id='" + domId1 + "'></span> </span> <span id='" + domId2 + "' tabindex='0'></span> <span class='" + "" + global.style().inlineBlock() + " " + global.style().hidden() + " " + resources.style().rightImagePlaceholderStyle() + "" + "' id='" + domId3 + "'> <span id='" + domId4 + "'></span> </span>");

    f_HTMLPanel1.setStyleName("" + resources.style().buttonBaseStyle() + " " + resources.style().buttonEnabledStyle() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    buttonLeftImagePlaceholder = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    buttonLeftImagePlaceholder.removeAttribute("id");
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    buttonLabelSpan = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    buttonLabelSpan.removeAttribute("id");
    buttonRightImagePlaceholder = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    buttonRightImagePlaceholder.removeAttribute("id");
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(buttonLeftImage, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(buttonRightImage, domId4Element);


    owner.buttonLabelSpan = buttonLabelSpan;
    owner.buttonLeftImage = buttonLeftImage;
    owner.buttonLeftImagePlaceholder = buttonLeftImagePlaceholder;
    owner.buttonRightImage = buttonRightImage;
    owner.buttonRightImagePlaceholder = buttonRightImagePlaceholder;

    return f_HTMLPanel1;
  }
}
