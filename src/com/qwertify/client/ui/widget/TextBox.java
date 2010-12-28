package com.qwertify.client.ui.widget;

import com.qwertify.client.ui.resources.Resources;

public class TextBox extends com.google.gwt.user.client.ui.TextBox {
	public TextBox() {
		setStylePrimaryName(Resources.INSTANCE.style().textbox());
	}
}
