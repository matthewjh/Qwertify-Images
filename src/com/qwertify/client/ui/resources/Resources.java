package com.qwertify.client.ui.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

public interface Resources extends ClientBundle {
	public final Resources INSTANCE = GWT.create(Resources.class);

	@Source("main.css")
	Style style();
	
	public interface Style extends CssResource {
		String inlineBlock();
		String unselectable();
		String textbox();
		String imageWidget();
	}
	
	@Source("logo.png")
	ImageResource logoImage();
}