package com.qwertify.client.ui.widget;

import com.qwertify.client.ui.resources.GlobalResources;

/***
 * 
 * @author Matthew Hill
 *
 */
public class TextBox extends com.google.gwt.user.client.ui.TextBox {
	public TextBox() {
		setStylePrimaryName(GlobalResources.INSTANCE.style().textbox());
	}
	
	public void setPlaceholder(String placeholder) {
		getElement().setAttribute("placeholder", placeholder);
	}
}
