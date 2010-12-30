package com.qwertify.client.presenter;

public class HomePresenter_EditorDriverImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactoryEditorDriver<com.qwertify.shared.dto.proxy.EmployeeProxy, com.qwertify.client.editor.EmployeeEditor> implements com.qwertify.client.presenter.HomePresenter.EditorDriver {
  protected com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate createDelegate() {
    return new com.qwertify.client.editor.EmployeeEditor_RequestFactoryEditorDelegate();
  }
  protected void traverseEditors(java.util.List<String> paths) {
    com.qwertify.client.editor.EmployeeEditor_RequestFactoryEditorDelegate.traverseEditor(getEditor(), "", paths);
  }
}
