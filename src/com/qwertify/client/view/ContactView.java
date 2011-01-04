package com.qwertify.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.qwertify.client.presenter.ContactPresenter.MyView;

/***
 * 
 * @author Matthew Hill
 *
 */
public class ContactView extends ViewImpl implements MyView {
	interface ContactViewUiBinder extends UiBinder<Widget, ContactView> {
	}

	private static ContactViewUiBinder uiBinder = GWT.create(ContactViewUiBinder.class);

	private final Widget widget;

	public ContactView() {
		widget = uiBinder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}
}