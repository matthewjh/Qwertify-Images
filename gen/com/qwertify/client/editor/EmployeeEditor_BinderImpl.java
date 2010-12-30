package com.qwertify.client.editor;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class EmployeeEditor_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.qwertify.client.editor.EmployeeEditor>, com.qwertify.client.editor.EmployeeEditor.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.qwertify.client.editor.EmployeeEditor owner) {

    com.qwertify.client.editor.EmployeeEditor_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.qwertify.client.editor.EmployeeEditor_BinderImpl_GenBundle) GWT.create(com.qwertify.client.editor.EmployeeEditor_BinderImpl_GenBundle.class);
    com.qwertify.client.ui.resources.Resources res = (com.qwertify.client.ui.resources.Resources) GWT.create(com.qwertify.client.ui.resources.Resources.class);
    com.qwertify.client.editor.EmployeeEditor_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.qwertify.client.ui.widget.TextBox f_TextBox2 = (com.qwertify.client.ui.widget.TextBox) GWT.create(com.qwertify.client.ui.widget.TextBox.class);
    com.google.gwt.editor.ui.client.ValueBoxEditorDecorator name = new com.google.gwt.editor.ui.client.ValueBoxEditorDecorator();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.qwertify.client.ui.widget.TextBox f_TextBox3 = (com.qwertify.client.ui.widget.TextBox) GWT.create(com.qwertify.client.ui.widget.TextBox.class);
    com.google.gwt.editor.ui.client.ValueBoxEditorDecorator jobTitle = new com.google.gwt.editor.ui.client.ValueBoxEditorDecorator();
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.qwertify.client.ui.widget.IntegerBox f_IntegerBox4 = (com.qwertify.client.ui.widget.IntegerBox) GWT.create(com.qwertify.client.ui.widget.IntegerBox.class);
    com.google.gwt.editor.ui.client.ValueBoxEditorDecorator age = new com.google.gwt.editor.ui.client.ValueBoxEditorDecorator();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel("Name: <span id='" + domId0 + "'></span> Job Title: <span id='" + domId1 + "'></span> Age: <span id='" + domId2 + "'></span>");

    name.setValueBox(f_TextBox2);
    jobTitle.setValueBox(f_TextBox3);
    age.setValueBox(f_IntegerBox4);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(name, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(jobTitle, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(age, domId2Element);


    owner.age = age;
    owner.jobTitle = jobTitle;
    owner.name = name;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
