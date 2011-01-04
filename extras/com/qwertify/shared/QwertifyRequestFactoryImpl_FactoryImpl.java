package com.qwertify.shared;

public class QwertifyRequestFactoryImpl_FactoryImpl extends com.google.gwt.editor.client.impl.AbstractAutoBeanFactory implements com.qwertify.shared.QwertifyRequestFactoryImpl.Factory {
  {
    creators.put(com.qwertify.shared.dto.proxy.EmployeeProxy.class, new Creator() {
      public com.qwertify.shared.dto.proxy.EmployeeProxyAutoBean create() { return new com.qwertify.shared.dto.proxy.EmployeeProxyAutoBean(); }
      public com.qwertify.shared.dto.proxy.EmployeeProxyAutoBean create(Object delegate) { return new com.qwertify.shared.dto.proxy.EmployeeProxyAutoBean((com.qwertify.shared.dto.proxy.EmployeeProxy) delegate); }
    });
  }
  public com.google.gwt.editor.client.AutoBean com_qwertify_shared_dto_proxy_EmployeeProxy() {
    return new com.qwertify.shared.dto.proxy.EmployeeProxyAutoBean();
  }
}
