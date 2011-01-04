package com.google.gwt.editor.ui.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ValueBoxEditorDecorator_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.google.gwt.editor.ui.client.ValueBoxEditorDecorator<?>>, com.google.gwt.editor.ui.client.ValueBoxEditorDecorator.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.google.gwt.editor.ui.client.ValueBoxEditorDecorator<?> owner) {

    com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_BinderImpl_GenBundle) GWT.create(com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_BinderImpl_GenBundle.class);
    com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.dom.client.DivElement errorLabel = null;
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.SimplePanel contents = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("<div class='" + "" + style.errorLabel() + "" + "' id='" + domId0 + "'></div> <span id='" + domId1 + "'></span>");

    contents.setStylePrimaryName("" + style.contents() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    errorLabel = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    errorLabel.removeAttribute("id");
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(contents, domId1Element);


    owner.contents = contents;
    owner.errorLabel = errorLabel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
