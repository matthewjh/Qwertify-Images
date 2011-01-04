package com.qwertify.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.qwertify.client.presenter.AboutUsPresenter.MyView;

/***
 * 
 * @author Matthew Hill
 *
 */
public class AboutUsView extends ViewImpl implements MyView {
	interface AboutUsViewUiBinder extends UiBinder<Widget, AboutUsView> {
	}

	private static AboutUsViewUiBinder uiBinder = GWT.create(AboutUsViewUiBinder.class);

	private final Widget widget;

	public AboutUsView() {
		widget = uiBinder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}