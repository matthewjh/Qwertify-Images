package com.qwertify.client.ui.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

/***
 * 
 * @author Matthew Hill
 *
 */
public interface GlobalResources extends ClientBundle {
	public final GlobalResources INSTANCE = GWT.create(GlobalResources.class);

	@Source("main.css")
	MainStyle style();
	
	public interface MainStyle extends CssResource {
		String inlineBlock();
		String unselectable();
		String textbox();
		String imageWidget();
		String floatLeft();
		String floatRight();
		String outlineNone();
		String hidden();
	}
	
	public interface ImageStyle extends CssResource {
		String cross();
	}
	
	@Source("logo.png")
	ImageResource logoImage();
	
	@Source("cross.png")
	ImageResource crossIcon();
}