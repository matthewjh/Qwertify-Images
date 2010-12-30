package com.qwertify.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Accessibility;
import com.google.gwt.user.client.ui.Widget;

public class Button extends InteractionHandlerComposite 
	implements FocusHandler, BlurHandler, MouseOverHandler, 
	MouseOutHandler, MouseDownHandler, MouseUpHandler, KeyDownHandler {
	
	interface Binder extends UiBinder<Widget, Button> {
	}
	
	interface Resources extends ClientBundle {
		@Source(Style.DEFAULT_CSS)
		Style style();
	}
	
	interface Style extends CssResource {
		String DEFAULT_CSS = "Button.css";
		
		String baseStyle();
		String hoverStyle();
		String focusStyle();
		String activeStyle();
	}
	
	@UiField
	DivElement buttonDiv;
	
	@UiField(provided = true)
	final Resources resources;

	public Button() {
		this(GWT.<Resources> create(Resources.class));
	}
	
	public Button(Resources resources) {
		this.resources = resources;
		resources.style().ensureInjected();
		
		initWidget(GWT.<Binder> create(Binder.class).createAndBindUi(this));
		Accessibility.setRole(getElement(), Accessibility.ROLE_BUTTON);
		getElement().setAttribute("tabindex", "0");
		
		addFocusHandler(this);
		addBlurHandler(this);
		addMouseOverHandler(this);
		addMouseOutHandler(this);
		addMouseDownHandler(this);
		addMouseUpHandler(this);
		addKeyDownHandler(this);
	}
	
	public void setLabel(String label) {
		buttonDiv.setInnerText(label);
	}
	
	@Override
	public void onFocus(FocusEvent event) {
		buttonDiv.addClassName(resources.style().focusStyle());
	}
	
	@Override
	public void onBlur(BlurEvent event) {
		buttonDiv.removeClassName(resources.style().focusStyle());
	}

	@Override
	public void onMouseOver(MouseOverEvent event) {
		buttonDiv.addClassName(resources.style().hoverStyle());
	}
	
	@Override
	public void onMouseOut(MouseOutEvent event) {
		buttonDiv.removeClassName(resources.style().hoverStyle());
		buttonDiv.removeClassName(resources.style().activeStyle());
	}

	@Override
	public void onMouseDown(MouseDownEvent event) {
		buttonDiv.addClassName(resources.style().activeStyle());
	}
	
	@Override
	public void onMouseUp(MouseUpEvent event) {
		buttonDiv.removeClassName(resources.style().activeStyle());
	}

	@Override
	public void onKeyDown(KeyDownEvent event) {
		// If the key was the enter key or the spacebar (keycode 32)
		if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER || event.getNativeKeyCode() == 32) {
			// Simulate a click event
			NativeEvent evt = Document.get().createClickEvent(1, 0, 0, 0, 0, false,
			        false, false, false);
			getElement().dispatchEvent(evt);
		}
	}
}
