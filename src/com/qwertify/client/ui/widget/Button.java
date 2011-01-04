package com.qwertify.client.ui.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HasEnabled;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.qwertify.client.ui.resources.GlobalResources;

/***
 * 
 * @author Matthew Hill
 *
 */
public class Button extends UiWidget implements HasText, HasEnabled, HasAllDomEventHandlers {
	
	interface Binder extends UiBinder<Widget, Button> {
	}
	
	interface LocalResources extends ClientBundle {
		@Source(Style.DEFAULT_CSS)
		Style style();
	}
	
	interface Style extends CssResource {
		String DEFAULT_CSS = "css/Button.css";
		
		String buttonBaseStyle();
		String buttonEnabledStyle();
		String leftImagePlaceholderStyle();
		String rightImagePlaceholderStyle();
		String buttonDisabledStyle();
		String buttonDisabledUnderlayStyle();
		String buttonCollapsedLeftBorderStyle();
		String buttonCollapsedRightBorderStyle();
	}
	
	@UiField
	SpanElement buttonLabelSpan;
	
	@UiField
	Element buttonLeftImagePlaceholder;
	
	@UiField
	Element buttonRightImagePlaceholder;
	
	@UiField
	Image buttonLeftImage;
	
	@UiField
	Image buttonRightImage;
	
	@UiField(provided = true)
	final LocalResources resources;
	
	private boolean enabled = true;

	public Button() {
		this(GWT.<LocalResources> create(LocalResources.class));
	}
	
	public Button(LocalResources resources) {
		this.resources = resources;
		resources.style().ensureInjected();
		
		initWidget(GWT.<Binder> create(Binder.class).createAndBindUi(this));
	}

	/**
	 * Set the image on the left-hand side of the button.
	 * @param imageResource The {@link ImageResource} representing the image to be used.
	 */
	public void setLeftImage(ImageResource imageResource) {
		buttonLeftImagePlaceholder.removeClassName(GlobalResources.INSTANCE.style().hidden());
		buttonLeftImage.setResource(imageResource);
	}
	
	/**
	 * Set the image on the right-hand side of the button.
	 * @param imageResource The {@link ImageResource} representing the image to be used.
	 */
	public void setRightImage(ImageResource imageResource) {
		buttonRightImagePlaceholder.removeClassName(GlobalResources.INSTANCE.style().hidden());
		buttonRightImage.setResource(imageResource);
	}

	/**
	 * Get the text content of the button, aka the button's label.
	 */
	@Override
	public String getText() {
		return buttonLabelSpan.getInnerText();
	}

	/**
	 * Set the text content of the button, aka the button's label.
	 */
	@Override
	public void setText(String text) {
		buttonLabelSpan.setInnerText(text);
	}
	
	/**
	 * Enable/disable the button. Enabling it allows interactions,
	 * as usual, disabling prevents the button from firing click events.
	 */
	public void setEnabled(boolean enabled) {
		if (enabled) {
			this.enabled = enabled;
			getElement().removeAttribute("disabled");
			getElement().removeClassName(resources.style().buttonDisabledStyle());
			getElement().addClassName(resources.style().buttonEnabledStyle());
		} else {
			this.enabled = enabled;
			getElement().setAttribute("disabled", "true");
			getElement().addClassName(resources.style().buttonDisabledStyle());
			getElement().removeClassName(resources.style().buttonEnabledStyle());
		}
	}
	
	/**
	 * Returns <code>true</code> if the button is enabled, <code>false</code>
	 * if it is disabled.
	 */
	@Override
	public boolean isEnabled() {
		return this.enabled;
	}
	
	/**
	 * Set the collapsed state of the left border. Collapsing both removes any rounding
	 * of the borders and undoes any margins on that side. This makes it easier
	 * to use the button in certain UI widgets, such as a toolbar where buttons
	 * must be placed side-by-side, touching eachother.
	 * @param collapsed
	 */
	public void setCollapsedLeftBorder(boolean collapsed) {
		if (collapsed) {
			getElement().addClassName(resources.style().buttonCollapsedLeftBorderStyle());
		} else {
			getElement().removeClassName(resources.style().buttonCollapsedLeftBorderStyle());
		}
	}
	
	/**
	 * Set the collapsed state of the right border. Collapsing both removes any rounding
	 * of the borders and undoes any margins on that side. This makes it easier
	 * to use the button in certain UI widgets, such as a toolbar where buttons
	 * must be placed side-by-side, touching eachother.
	 * @param collapsed
	 */
	public void setCollapsedRightBorder(boolean collapsed) {
		if (collapsed) {
			getElement().addClassName(resources.style().buttonCollapsedRightBorderStyle());
		} else {
			getElement().removeClassName(resources.style().buttonCollapsedRightBorderStyle());
		}
	}
}
