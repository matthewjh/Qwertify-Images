package com.qwertify.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.qwertify.client.editor.EmployeeEditor;
import com.qwertify.client.presenter.HomePresenter.MyView;
import com.qwertify.client.ui.widget.Button;

/***
 * 
 * @author Matthew Hill
 *
 */
public class HomeView extends ViewImpl implements MyView {
	interface HomeViewUiBinder extends UiBinder<Widget, HomeView> {
	}

	private static HomeViewUiBinder uiBinder = GWT.create(HomeViewUiBinder.class);

	private final Widget widget;
	
	@UiField
	EmployeeEditor employeeEditor;
	
	@UiField
	Button saveButton;
	
	@UiField
	Button cancelButton;
	
	boolean last = true;

	public HomeView() {
		widget = uiBinder.createAndBindUi(this);
		saveButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				HomeView.this.cancelButton.setEnabled(!HomeView.this.last);
				HomeView.this.last = !HomeView.this.last;
			}
		});
		
		cancelButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("hi!");
			}
		});
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