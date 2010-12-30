package com.qwertify.client.ui.widget;

import com.google.gwt.core.client.GWT;

public class RedButton extends Button {
	
	interface Resources extends Button.Resources {
		@Source({Style.DEFAULT_CSS, "RedButton.css"})
		Style style();
	}
	
	interface Style extends Button.Style {
	}
	
	public RedButton() {
		super(GWT.<Resources> create(Resources.class));
	}
}
