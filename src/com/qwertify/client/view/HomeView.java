package com.qwertify.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.qwertify.client.editor.EmployeeEditor;
import com.qwertify.client.presenter.HomePresenter.MyView;
import com.qwertify.client.ui.widget.Button;

public class HomeView extends ViewImpl implements MyView {
	interface HomeViewUiBinder extends UiBinder<Widget, HomeView> {
	}

	private static HomeViewUiBinder uiBinder = GWT.create(HomeViewUiBinder.class);

	private final Widget widget;
	
	@UiField
	EmployeeEditor employeeEditor;
	
	@UiField
	Button saveButton;

	public HomeView() {
		widget = uiBinder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@Override
	public EmployeeEditor getEmployeeEditor() {
		return employeeEditor;
	}

	@Override
	public HasClickHandlers getSaveButton() {
		return saveButton;
	}
}