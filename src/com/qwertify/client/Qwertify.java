package com.qwertify.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;

import com.gwtplatform.mvp.client.DelayedBindRegistry;
import com.qwertify.client.gin.ClientGinjector;
import com.qwertify.client.ui.resources.Resources;

public class Qwertify implements EntryPoint {
	public final ClientGinjector ginjector = GWT.create(ClientGinjector.class);

	@Override
	public void onModuleLoad() {
		// Inject the global stylesheet into the DOM
		Resources.INSTANCE.style().ensureInjected();
		
		// This is required for Gwt-Platform proxy's generator.
		DelayedBindRegistry.bind(ginjector);

		ginjector.getPlaceManager().revealCurrentPlace();
	}
}