package com.qwertify.server.domain;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.bson.types.ObjectId;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.qwertify.server.guice.ServerModule;

/***
 * 
 * @author Matthew Hill
 *
 */

@Entity
public class Employee {
	
	@Id
	private ObjectId objectId;
	
	private int version;

	@NotNull
	@Size(min=3, max=40)
	private String name;
	
	@NotNull
	@Size(min=3, max=80)
	private String jobTitle;
	
	@NotNull
	@Min(13)
	@Max(150)
	private Integer age;

	public Employee()
	{
	}
	
	public ObjectId getObjectId() {
		return objectId;
	}

	public void setObjectId(ObjectId objectId) {
		this.objectId = objectId;
	}

	public String getId() {
		return this.objectId.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}


	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void persist() {
		Injector injector = Guice.createInjector(new ServerModule());
		Datastore ds = injector.getInstance(Datastore.class);
		ds.save(this);
	}
	
	public void remove() {
		Injector injector = Guice.createInjector(new ServerModule());
		Datastore ds = injector.getInstance(Datastore.class);
		ds.delete(this);
	}
	
	public static Long countEmployees() {
		Injector injector = Guice.createInjector(new ServerModule());
		Datastore ds = injector.getInstance(Datastore.class);
		return ds.getCount(Employee.class);
	}
	
	public static List<Employee> findAllEmployees() {
		Injector injector = Guice.createInjector(new ServerModule());
		Datastore ds = injector.getInstance(Datastore.class);
		return ds.find(Employee.class).asList();
	}
	
	public static Employee findEmployee(String id) {
		Injector injector = Guice.createInjector(new ServerModule());
		Datastore ds = injector.getInstance(Datastore.class);
		return ds.find(Employee.class, "id =", id).get();
	}
}
