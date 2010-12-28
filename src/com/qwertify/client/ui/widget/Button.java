package com.qwertify.client.ui.widget;

import com.qwertify.client.ui.resources.Resources;

public class Button extends com.google.gwt.user.client.ui.Button {
	public Button() {
		setStylePrimaryName(Resources.INSTANCE.style().button());
	}
}
