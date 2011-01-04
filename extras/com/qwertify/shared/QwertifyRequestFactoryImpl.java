package com.qwertify.shared;

public class QwertifyRequestFactoryImpl extends com.google.gwt.requestfactory.client.impl.AbstractRequestFactory implements com.qwertify.shared.QwertifyRequestFactory {
  @com.google.gwt.editor.client.AutoBeanFactory.Category(com.google.gwt.requestfactory.client.impl.EntityProxyCategory.class)
  @com.google.gwt.editor.client.AutoBeanFactory.NoWrap(com.google.gwt.requestfactory.shared.EntityProxyId.class)
  interface Factory extends com.google.gwt.editor.client.AutoBeanFactory {
    com.google.gwt.editor.client.AutoBean<com.qwertify.shared.dto.proxy.EmployeeProxy> com_qwertify_shared_dto_proxy_EmployeeProxy();
  }
  public static final Factory FACTORY=com.google.gwt.core.client.GWT.create(Factory.class);
  @Override public Factory getAutoBeanFactory() { return FACTORY; }
  public com.qwertify.shared.request.EmployeeRequestImpl employeeRequest() {
    return new com.qwertify.shared.request.EmployeeRequestImpl(this);
  }
  private static final java.util.HashMap<String, Class<?>> tokensToTypes = new java.util.HashMap<String, Class<?>>();
  private static final java.util.HashMap<Class<?>, String> typesToTokens = new java.util.HashMap<Class<?>, String>();
  static {
    tokensToTypes.put("com.qwertify.shared.dto.proxy.EmployeeProxy", com.qwertify.shared.dto.proxy.EmployeeProxy.class);
    typesToTokens.put(com.qwertify.shared.dto.proxy.EmployeeProxy.class, "com.qwertify.shared.dto.proxy.EmployeeProxy");
  }
  @Override protected Class getTypeFromToken(String typeToken) {
    return tokensToTypes.get(typeToken);
  }
  @Override protected String getTypeToken(Class type) {
    return typesToTokens.get(type);
  }
}
