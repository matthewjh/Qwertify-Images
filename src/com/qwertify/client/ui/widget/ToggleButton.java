/*
 * Copyright 2011 Matthew Hill
 *
 */

package com.qwertify.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

/**
 * A button which can be toggled and kept pressed down or up.
 * @author Matthew Hill
 *
 */
public class ToggleButton extends Button implements ClickHandler {
	
	interface LocalResources extends ClientBundle {
		@Source(Style.DEFAULT_CSS)
		Style style();
	}
	
	interface Style extends CssResource {
		String DEFAULT_CSS = "css/ToggleButton.css";
		
		String toggledStyle();
	}
	
	private final LocalResources resources;
	private boolean isToggled;
	
	public ToggleButton() {
		this(GWT.<LocalResources> create(LocalResources.class));
	}
	
	public ToggleButton(LocalResources resources) {
		this.resources = resources;
		resources.style().ensureInjected();
		
		addClickHandler(this);
	}

	/***
	 * Click Handler implementation to set the toggled state when the button
	 * is pressed.
	 */
	@Override
	public void onClick(ClickEvent event) {
		if (isToggled()) {
			getElement().removeClassName(resources.style().toggledStyle());
			setToggled(false);
		} else {
			getElement().addClassName(resources.style().toggledStyle());
			setToggled(true);
		}
	}
	
	/***
	 * Returns <code>true</code> if the button's state is toggled,
	 * <code>false</code> if it isn't.
	 * @return
	 */
	public boolean isToggled() {
		return isToggled;
	}

	/***
	 * Set the toggled state of the button.
	 * @param isToggled
	 */
	public void setToggled(boolean isToggled) {
		this.isToggled = isToggled;
	}	
}
