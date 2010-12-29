package com.qwertify.client.ui.widget;

import com.qwertify.client.ui.resources.Resources;

public class IntegerBox extends com.google.gwt.user.client.ui.IntegerBox {
	public IntegerBox() {
		setStylePrimaryName(Resources.INSTANCE.style().textbox());
	}
}
