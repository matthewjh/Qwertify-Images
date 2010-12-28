package com.qwertify.client.editor;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.ui.client.ValueBoxEditorDecorator;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.qwertify.shared.dto.proxy.EmployeeProxy;

public class EmployeeEditor extends Composite implements Editor<EmployeeProxy> {
	interface Binder extends UiBinder<Widget, EmployeeEditor> {
	}

	@UiField
	ValueBoxEditorDecorator<String> name;

	@UiField
	ValueBoxEditorDecorator<String> jobTitle;

	@UiField
	ValueBoxEditorDecorator<Integer> age;

	public EmployeeEditor() {
		initWidget(GWT.<Binder> create(Binder.class).createAndBindUi(this));
	}
}
