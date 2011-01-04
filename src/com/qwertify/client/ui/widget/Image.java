package com.qwertify.client.ui.widget;

import com.qwertify.client.ui.resources.GlobalResources;

/***
 * 
 * @author Matthew Hill
 *
 */
public class Image extends com.google.gwt.user.client.ui.Image {
	
	public Image() {
		setStylePrimaryName(GlobalResources.INSTANCE.style().imageWidget());
	}
}
