package com.qwertify.server.guice;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.mongodb.Mongo;
import com.qwertify.server.domain.Employee;

public class ServerModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Mongo.class).in(Singleton.class);
		bind(Morphia.class).in(Singleton.class);
	}
	
	@Provides
	@Singleton
	protected Datastore provideDatastore(Mongo mongo, Morphia morphia) {
		morphia.map(Employee.class);
		Datastore ds = morphia.createDatastore(mongo, "qwertify_db");
		ds.ensureIndexes();
		ds.ensureCaps();
		
		return ds;
	}
	
}