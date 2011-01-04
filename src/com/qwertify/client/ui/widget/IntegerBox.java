package com.qwertify.client.ui.widget;

import com.qwertify.client.ui.resources.GlobalResources;

/***
 * 
 * @author Matthew Hill
 *
 */
public class IntegerBox extends com.google.gwt.user.client.ui.IntegerBox {
	public IntegerBox() {
		setStylePrimaryName(GlobalResources.INSTANCE.style().textbox());
	}
}
