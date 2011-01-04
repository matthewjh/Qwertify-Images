package com.qwertify.client;

import com.google.gwt.event.shared.EventBus;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.proxy.PlaceManagerImpl;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.TokenFormatter;
import com.qwertify.client.gin.DefaultPlace;

/***
 * 
 * @author Matthew Hill
 *
 */
public class QwertifyPlaceManager extends PlaceManagerImpl {
	private final PlaceRequest defaultPlaceRequest;

	@Inject
	public QwertifyPlaceManager(final EventBus eventBus,
			final TokenFormatter tokenFormatter, @DefaultPlace String defaultNameToken) {
		super(eventBus, tokenFormatter);

		this.defaultPlaceRequest = new PlaceRequest(defaultNameToken).with("page", "1").with("fuck", "you");
	}

	@Override
	public void revealDefaultPlace() {
		revealPlace(defaultPlaceRequest);
	}
}