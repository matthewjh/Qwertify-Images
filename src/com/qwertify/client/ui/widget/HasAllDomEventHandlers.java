/*
 * Copyright 2011 Matthew Hill
 *
 */

package com.qwertify.client.ui.widget;

import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.HasBlurHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.HasFocusHandlers;
import com.google.gwt.event.dom.client.HasKeyDownHandlers;
import com.google.gwt.event.dom.client.HasKeyUpHandlers;
import com.google.gwt.event.dom.client.HasMouseDownHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.event.dom.client.HasMouseUpHandlers;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpHandler;

/**
 * @author Matthew Hill
 * A widget which implements this interface provides registration
 * for many of the DOM event handlers which are needed for modern widgets.
 * 
 * Includes registration methods for:
 * <ul>
 * <li>{@link ClickHandler}</li>
 * <li>{@link FocusHandler}</li>
 * <li>{@link BlurHandler}</li>
 * <li>{@link MouseOverHandler}</li>
 * <li>{@link MouseOutHandler}</li>
 * <li>{@link MouseDownHandler}</li>
 * <li>{@link MouseUpHandler}</li>
 * <li>{@link KeyDownHandler}</li>
 * <li>{@link KeyUpHandler}</li>
 * </ul>
 */
public interface HasAllDomEventHandlers extends HasClickHandlers, 
	HasFocusHandlers, HasBlurHandlers, HasMouseOverHandlers, HasMouseOutHandlers, 
	HasMouseDownHandlers, HasMouseUpHandlers, HasKeyDownHandlers, HasKeyUpHandlers {

}
