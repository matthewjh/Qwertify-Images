package com.qwertify.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.qwertify.client.presenter.MainPagePresenter;
import com.qwertify.client.presenter.MainPagePresenter.MyView;

/***
 * 
 * @author Matthew Hill
 *
 */
public class MainPageView extends ViewImpl implements MyView {
	interface MainPageViewUiBinder extends UiBinder<Widget, MainPageView> {
	}

	private static MainPageViewUiBinder uiBinder = GWT.create(MainPageViewUiBinder.class);

	public final Widget widget;

	@UiField
	SimplePanel mainContentPanel;

	public MainPageView() {
		widget = uiBinder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@Override
	public void setInSlot(Object slot, Widget content) {
		if (slot == MainPagePresenter.TYPE_SetMainContent) {
			setMainContent(content);
		} else {
			super.setInSlot(slot, content);
		}
	}

	private void setMainContent(Widget content) {
		mainContentPanel.clear();

		if (content != null) {
			mainContentPanel.add(content);
		}
	}
}