package com.qwertify.client.ui.widget;

import com.google.gwt.core.client.GWT;

/***
 * 
 * @author Matthew Hill
 *
 */
public class RedButton extends Button {
	
	interface LocalResources extends Button.LocalResources {
		@Source({Style.DEFAULT_CSS, "css/RedButton.css"})
		Style style();
	}
	
	interface Style extends Button.Style {
	}
	
	public RedButton() {
		super(GWT.<LocalResources> create(LocalResources.class));
	}
}
