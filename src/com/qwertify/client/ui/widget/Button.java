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
	
	// The CSS rules which we'll need programmatic access to
	interface Style extends CssResource {
		String defaultStyleBase();
		String defaultStyleHover();
		String defaultStyleFocus();
		String defaultStyleActive();
	}
	
	public enum Skin {
		Default
	}
	
	@UiField
	Style style;
	
	@UiField
	DivElement buttonDiv;
	
	private String baseStyle;
	private String hoverStyle;
	private String focusStyle;
	private String activeStyle;
	
	public Button() {
		this(Skin.Default);
	}
	
	public Button(Skin skin) {
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

		setSkin(skin);
	}
	
	public void setLabel(String label) {
		buttonDiv.setInnerText(label);
	}

	public void setSkin(Skin skin) {
		switch (skin) {
		case Default:
			baseStyle =  style.defaultStyleBase();
			hoverStyle = style.defaultStyleHover();
			focusStyle = style.defaultStyleFocus();
			activeStyle = style.defaultStyleActive();
		}
		
		buttonDiv.addClassName(baseStyle);
	}
	
	@Override
	public void onFocus(FocusEvent event) {
		buttonDiv.addClassName(focusStyle);
	}
	
	@Override
	public void onBlur(BlurEvent event) {
		buttonDiv.removeClassName(focusStyle);
	}

	@Override
	public void onMouseOver(MouseOverEvent event) {
		buttonDiv.addClassName(hoverStyle);
	}
	
	@Override
	public void onMouseOut(MouseOutEvent event) {
		buttonDiv.removeClassName(hoverStyle);
		buttonDiv.removeClassName(activeStyle);
	}

	@Override
	public void onMouseDown(MouseDownEvent event) {
		buttonDiv.addClassName(activeStyle);
	}
	
	@Override
	public void onMouseUp(MouseUpEvent event) {
		buttonDiv.removeClassName(activeStyle);
	}

	@Override
	public void onKeyDown(KeyDownEvent event) {
		if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
			NativeEvent evt = Document.get().createClickEvent(1, 0, 0, 0, 0, false,
			        false, false, false);
			getElement().dispatchEvent(evt);
		}
	}
}
