package com.qwertify.shared.request;

public class EmployeeRequestImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestContext implements com.qwertify.shared.request.EmployeeRequest {
  public EmployeeRequestImpl(com.google.gwt.requestfactory.client.impl.AbstractRequestFactory requestFactory) {super(requestFactory);}
  public  com.google.gwt.requestfactory.shared.Request<java.lang.Long> countEmployees() {
    class X extends com.google.gwt.requestfactory.client.impl.AbstractRequest<java.lang.Long> implements com.google.gwt.requestfactory.shared.Request<java.lang.Long> {
      public X() { super(EmployeeRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.client.impl.messages.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.client.impl.messages.RequestData("com.qwertify.shared.request.EmployeeRequest::countEmployees", new Object[] {}, propertyRefs);
      }
      @Override protected void handleResult(Object obj) {
        Object decoded;
        decoded = com.google.gwt.requestfactory.shared.ValueCodex.convertFromString(java.lang.Long.class, String.valueOf(obj));
        succeed((java.lang.Long) decoded);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<java.util.List<com.qwertify.shared.dto.proxy.EmployeeProxy>> findAllEmployees() {
    class X extends com.google.gwt.requestfactory.client.impl.AbstractRequest<java.util.List<com.qwertify.shared.dto.proxy.EmployeeProxy>> implements com.google.gwt.requestfactory.shared.Request<java.util.List<com.qwertify.shared.dto.proxy.EmployeeProxy>> {
      public X() { super(EmployeeRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.client.impl.messages.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.client.impl.messages.RequestData("com.qwertify.shared.request.EmployeeRequest::findAllEmployees", new Object[] {}, propertyRefs);
      }
      @Override protected void handleResult(Object obj) {
        Object decoded;
        decoded = new java.util.ArrayList();
        decodeReturnObjectList(com.qwertify.shared.dto.proxy.EmployeeProxy.class, obj, (java.util.ArrayList)decoded);
        succeed((java.util.List<com.qwertify.shared.dto.proxy.EmployeeProxy>) decoded);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.Request<com.qwertify.shared.dto.proxy.EmployeeProxy> findEmployee(final java.lang.String id) {
    class X extends com.google.gwt.requestfactory.client.impl.AbstractRequest<com.qwertify.shared.dto.proxy.EmployeeProxy> implements com.google.gwt.requestfactory.shared.Request<com.qwertify.shared.dto.proxy.EmployeeProxy> {
      public X() { super(EmployeeRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.client.impl.messages.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.client.impl.messages.RequestData("com.qwertify.shared.request.EmployeeRequest::findEmployee", new Object[] {id}, propertyRefs);
      }
      @Override protected void handleResult(Object obj) {
        Object decoded;
        decoded = decodeReturnObject(com.qwertify.shared.dto.proxy.EmployeeProxy.class, obj);
        succeed((com.qwertify.shared.dto.proxy.EmployeeProxy) decoded);
      }
    }
    X x = new X();
    addInvocation(x);
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<com.qwertify.shared.dto.proxy.EmployeeProxy, java.lang.Void> persist() {
    class X extends com.google.gwt.requestfactory.client.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<com.qwertify.shared.dto.proxy.EmployeeProxy, java.lang.Void> {
      public X() { super(EmployeeRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.client.impl.messages.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.client.impl.messages.RequestData("com.qwertify.shared.request.EmployeeRequest::persist", new Object[] {null}, propertyRefs);
      }
      @Override protected void handleResult(Object obj) {
        Object decoded;
        decoded = com.google.gwt.requestfactory.shared.ValueCodex.convertFromString(java.lang.Void.class, String.valueOf(obj));
        succeed((java.lang.Void) decoded);
      }
    }
    X x = new X();
    return x;
  }
  public  com.google.gwt.requestfactory.shared.InstanceRequest<com.qwertify.shared.dto.proxy.EmployeeProxy, java.lang.Void> remove() {
    class X extends com.google.gwt.requestfactory.client.impl.AbstractRequest<java.lang.Void> implements com.google.gwt.requestfactory.shared.InstanceRequest<com.qwertify.shared.dto.proxy.EmployeeProxy, java.lang.Void> {
      public X() { super(EmployeeRequestImpl.this);}
      @Override public X with(String... paths) {super.with(paths); return this;}
      @Override protected com.google.gwt.requestfactory.client.impl.messages.RequestData makeRequestData() {
        return new com.google.gwt.requestfactory.client.impl.messages.RequestData("com.qwertify.shared.request.EmployeeRequest::remove", new Object[] {null}, propertyRefs);
      }
      @Override protected void handleResult(Object obj) {
        Object decoded;
        decoded = com.google.gwt.requestfactory.shared.ValueCodex.convertFromString(java.lang.Void.class, String.valueOf(obj));
        succeed((java.lang.Void) decoded);
      }
    }
    X x = new X();
    return x;
  }
}
