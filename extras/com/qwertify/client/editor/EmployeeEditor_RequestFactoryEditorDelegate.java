package com.qwertify.client.editor;

public class EmployeeEditor_RequestFactoryEditorDelegate extends com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate {
  private com.qwertify.client.editor.EmployeeEditor editor;
  protected com.qwertify.client.editor.EmployeeEditor getEditor() {return editor;}
  protected void setEditor(com.google.gwt.editor.client.Editor editor) {this.editor=(com.qwertify.client.editor.EmployeeEditor)editor;}
  private com.qwertify.shared.dto.proxy.EmployeeProxy object;
  public com.qwertify.shared.dto.proxy.EmployeeProxy getObject() {return object;}
  protected void setObject(Object object) {this.object=(com.qwertify.shared.dto.proxy.EmployeeProxy)object;}
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate nameDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate nameDelegate0;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate jobTitleDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate jobTitleDelegate0;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate ageDelegate;
  com.google.gwt.requestfactory.client.impl.RequestFactoryEditorDelegate ageDelegate0;
  protected void attachSubEditors(com.google.gwt.editor.client.impl.DelegateMap delegateMap) {
    if (editor.name.asEditor() != null) {
      nameDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate();
      nameDelegate.initialize(eventBus, factory, appendPath("name"), getObject().getName(), editor.name.asEditor(), delegateMap, request);
      delegateMap.put(nameDelegate.getObject(), nameDelegate);
    }
    if (editor.name != null) {
      nameDelegate0 = new com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_java_lang_String_RequestFactoryEditorDelegate();
      nameDelegate0.initialize(eventBus, factory, appendPath("name"), getObject().getName(), editor.name, delegateMap, request);
      delegateMap.put(nameDelegate0.getObject(), nameDelegate0);
    }
    if (editor.jobTitle.asEditor() != null) {
      jobTitleDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate();
      jobTitleDelegate.initialize(eventBus, factory, appendPath("jobTitle"), getObject().getJobTitle(), editor.jobTitle.asEditor(), delegateMap, request);
      delegateMap.put(jobTitleDelegate.getObject(), jobTitleDelegate);
    }
    if (editor.jobTitle != null) {
      jobTitleDelegate0 = new com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_java_lang_String_RequestFactoryEditorDelegate();
      jobTitleDelegate0.initialize(eventBus, factory, appendPath("jobTitle"), getObject().getJobTitle(), editor.jobTitle, delegateMap, request);
      delegateMap.put(jobTitleDelegate0.getObject(), jobTitleDelegate0);
    }
    if (editor.age.asEditor() != null) {
      ageDelegate = new com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate();
      ageDelegate.initialize(eventBus, factory, appendPath("age"), getObject().getAge(), editor.age.asEditor(), delegateMap, request);
      delegateMap.put(ageDelegate.getObject(), ageDelegate);
    }
    if (editor.age != null) {
      ageDelegate0 = new com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_java_lang_Integer_RequestFactoryEditorDelegate();
      ageDelegate0.initialize(eventBus, factory, appendPath("age"), getObject().getAge(), editor.age, delegateMap, request);
      delegateMap.put(ageDelegate0.getObject(), ageDelegate0);
    }
  }
  protected void flushSubEditors(java.util.List errorAccumulator) {
    if (editor.name.asEditor() != null && true) {
      nameDelegate.flush(errorAccumulator);
      getObject().setName((java.lang.String)nameDelegate.getObject());
    }
    if (nameDelegate0 != null && true) {
      nameDelegate0.flush(errorAccumulator);
    }
    if (editor.jobTitle.asEditor() != null && true) {
      jobTitleDelegate.flush(errorAccumulator);
      getObject().setJobTitle((java.lang.String)jobTitleDelegate.getObject());
    }
    if (jobTitleDelegate0 != null && true) {
      jobTitleDelegate0.flush(errorAccumulator);
    }
    if (editor.age.asEditor() != null && true) {
      ageDelegate.flush(errorAccumulator);
      getObject().setAge((java.lang.Integer)ageDelegate.getObject());
    }
    if (ageDelegate0 != null && true) {
      ageDelegate0.flush(errorAccumulator);
    }
  }
  protected void flushSubEditorErrors(java.util.List errorAccumulator) {
    if (nameDelegate != null) nameDelegate.flushErrors(errorAccumulator);
    if (nameDelegate0 != null) nameDelegate0.flushErrors(errorAccumulator);
    if (jobTitleDelegate != null) jobTitleDelegate.flushErrors(errorAccumulator);
    if (jobTitleDelegate0 != null) jobTitleDelegate0.flushErrors(errorAccumulator);
    if (ageDelegate != null) ageDelegate.flushErrors(errorAccumulator);
    if (ageDelegate0 != null) ageDelegate0.flushErrors(errorAccumulator);
  }
  protected void refreshEditors() {
    if (nameDelegate != null) {
      if (true) {
        nameDelegate.refresh(getObject().getName());
      } else { nameDelegate.refresh(null); }
    }
    if (nameDelegate0 != null) {
      if (true) {
        nameDelegate0.refresh(getObject().getName());
      } else { nameDelegate0.refresh(null); }
    }
    if (jobTitleDelegate != null) {
      if (true) {
        jobTitleDelegate.refresh(getObject().getJobTitle());
      } else { jobTitleDelegate.refresh(null); }
    }
    if (jobTitleDelegate0 != null) {
      if (true) {
        jobTitleDelegate0.refresh(getObject().getJobTitle());
      } else { jobTitleDelegate0.refresh(null); }
    }
    if (ageDelegate != null) {
      if (true) {
        ageDelegate.refresh(getObject().getAge());
      } else { ageDelegate.refresh(null); }
    }
    if (ageDelegate0 != null) {
      if (true) {
        ageDelegate0.refresh(getObject().getAge());
      } else { ageDelegate0.refresh(null); }
    }
  }
  protected void traverse(java.util.List paths) {
    traverseEditor(getEditor(), "", paths);
  }
  public static void traverseEditor(com.qwertify.client.editor.EmployeeEditor editor, String prefix, java.util.List<String> paths) {
    if (editor.name.asEditor() != null) {
      String localPath = appendPath(prefix, "name");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.name.asEditor(), localPath, paths);
    }
    if (editor.name != null) {
      String localPath = appendPath(prefix, "name");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.name, localPath, paths);
    }
    if (editor.jobTitle.asEditor() != null) {
      String localPath = appendPath(prefix, "jobTitle");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.jobTitle.asEditor(), localPath, paths);
    }
    if (editor.jobTitle != null) {
      String localPath = appendPath(prefix, "jobTitle");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_java_lang_String_RequestFactoryEditorDelegate.traverseEditor(editor.jobTitle, localPath, paths);
    }
    if (editor.age.asEditor() != null) {
      String localPath = appendPath(prefix, "age");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.adapters.ValueBoxEditor_java_lang_Integer_RequestFactoryEditorDelegate.traverseEditor(editor.age.asEditor(), localPath, paths);
    }
    if (editor.age != null) {
      String localPath = appendPath(prefix, "age");
      paths.add(localPath);
      com.google.gwt.editor.ui.client.ValueBoxEditorDecorator_java_lang_Integer_RequestFactoryEditorDelegate.traverseEditor(editor.age, localPath, paths);
    }
  }
}
