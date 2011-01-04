package com.qwertify.shared.dto.proxy;

public class EmployeeProxyAutoBean extends com.google.gwt.editor.client.impl.AbstractAutoBean<com.qwertify.shared.dto.proxy.EmployeeProxy> {
  private final com.qwertify.shared.dto.proxy.EmployeeProxy shim = new com.qwertify.shared.dto.proxy.EmployeeProxy() {
    public java.lang.Integer getAge()  {
      EmployeeProxyAutoBean.this.checkWrapped();
      java.lang.Integer toReturn = EmployeeProxyAutoBean.this.get("getAge", getWrapped().getAge());
      toReturn = com.google.gwt.requestfactory.client.impl.EntityProxyCategory.__intercept(EmployeeProxyAutoBean.this, toReturn);
      return toReturn;
    }
    public java.lang.String getId()  {
      EmployeeProxyAutoBean.this.checkWrapped();
      java.lang.String toReturn = EmployeeProxyAutoBean.this.get("getId", getWrapped().getId());
      toReturn = com.google.gwt.requestfactory.client.impl.EntityProxyCategory.__intercept(EmployeeProxyAutoBean.this, toReturn);
      return toReturn;
    }
    public java.lang.String getJobTitle()  {
      EmployeeProxyAutoBean.this.checkWrapped();
      java.lang.String toReturn = EmployeeProxyAutoBean.this.get("getJobTitle", getWrapped().getJobTitle());
      toReturn = com.google.gwt.requestfactory.client.impl.EntityProxyCategory.__intercept(EmployeeProxyAutoBean.this, toReturn);
      return toReturn;
    }
    public java.lang.String getName()  {
      EmployeeProxyAutoBean.this.checkWrapped();
      java.lang.String toReturn = EmployeeProxyAutoBean.this.get("getName", getWrapped().getName());
      toReturn = com.google.gwt.requestfactory.client.impl.EntityProxyCategory.__intercept(EmployeeProxyAutoBean.this, toReturn);
      return toReturn;
    }
    public void setAge(java.lang.Integer age)  {
      EmployeeProxyAutoBean.this.checkWrapped();
      EmployeeProxyAutoBean.this.checkFrozen();
      EmployeeProxyAutoBean.this.getWrapped().setAge(age);
      EmployeeProxyAutoBean.this.set("setAge", age);
    }
    public void setJobTitle(java.lang.String jobTitle)  {
      EmployeeProxyAutoBean.this.checkWrapped();
      EmployeeProxyAutoBean.this.checkFrozen();
      EmployeeProxyAutoBean.this.getWrapped().setJobTitle(jobTitle);
      EmployeeProxyAutoBean.this.set("setJobTitle", jobTitle);
    }
    public void setName(java.lang.String name)  {
      EmployeeProxyAutoBean.this.checkWrapped();
      EmployeeProxyAutoBean.this.checkFrozen();
      EmployeeProxyAutoBean.this.getWrapped().setName(name);
      EmployeeProxyAutoBean.this.set("setName", name);
    }
    public com.google.gwt.requestfactory.shared.EntityProxyId stableId()  {
      EmployeeProxyAutoBean.this.checkWrapped();
      com.google.gwt.requestfactory.shared.EntityProxyId toReturn = EmployeeProxyAutoBean.this.getWrapped().stableId();
      toReturn = com.google.gwt.requestfactory.client.impl.EntityProxyCategory.__intercept(EmployeeProxyAutoBean.this, toReturn);
      EmployeeProxyAutoBean.this.call("stableId", toReturn );
      return toReturn;
    }
    @Override public boolean equals(Object o) {
      return this == o || getWrapped().equals(o);
    }
    @Override public int hashCode() {
      return getWrapped().hashCode();
    }
    @Override public String toString() {
      return getWrapped().toString();
    }
  };
  { com.google.gwt.core.client.impl.WeakMapping.set(shim, com.google.gwt.editor.client.AutoBean.class.getName(), this); }
  public EmployeeProxyAutoBean() {}
  public EmployeeProxyAutoBean(EmployeeProxyAutoBean toClone, boolean deep) {
    super(toClone, deep);
  }
  public EmployeeProxyAutoBean(com.qwertify.shared.dto.proxy.EmployeeProxy wrapped) {
    super(wrapped);
  }
  public com.qwertify.shared.dto.proxy.EmployeeProxy as() {return shim;}
  public com.qwertify.shared.dto.proxy.EmployeeProxyAutoBean clone(boolean deep) {
    return new EmployeeProxyAutoBean(this, deep);
  }
  @Override protected com.qwertify.shared.dto.proxy.EmployeeProxy createSimplePeer() {
    return new com.qwertify.shared.dto.proxy.EmployeeProxy() {
      public java.lang.Integer getAge()  {
        return (java.lang.Integer) values.get("age");
      }
      public java.lang.String getId()  {
        return (java.lang.String) values.get("id");
      }
      public java.lang.String getJobTitle()  {
        return (java.lang.String) values.get("jobTitle");
      }
      public java.lang.String getName()  {
        return (java.lang.String) values.get("name");
      }
      public void setAge(java.lang.Integer age)  {
        values.put("age", age);
      }
      public void setJobTitle(java.lang.String jobTitle)  {
        values.put("jobTitle", jobTitle);
      }
      public void setName(java.lang.String name)  {
        values.put("name", name);
      }
      public com.google.gwt.requestfactory.shared.EntityProxyId stableId()  {
        return com.google.gwt.requestfactory.client.impl.EntityProxyCategory.stableId(EmployeeProxyAutoBean.this);
      }
      public boolean equals(java.lang.Object other)  {
        return com.google.gwt.requestfactory.client.impl.EntityProxyCategory.equals(EmployeeProxyAutoBean.this, other);
      }
      public int hashCode()  {
        return com.google.gwt.requestfactory.client.impl.EntityProxyCategory.hashCode(EmployeeProxyAutoBean.this);
      }
    };
  }
  @Override protected void traverseProperties(com.google.gwt.editor.client.AutoBeanVisitor visitor, com.google.gwt.editor.client.impl.AbstractAutoBean.OneShotContext ctx) {
    class agePropertyContext implements com.google.gwt.editor.client.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getElementType() { return null; }
      public Class<?> getType() { return java.lang.Integer.class; }
      public void set(Object obj) { 
        values.put("age", obj);
      }
    }
    agePropertyContext agePropertyContext = new agePropertyContext();
    visitor.visitValueProperty("age", as().getAge(), agePropertyContext);
    visitor.endVisitValueProperty("age", as().getAge(), agePropertyContext);
    class idPropertyContext implements com.google.gwt.editor.client.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getElementType() { return null; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("id", obj);
      }
    }
    idPropertyContext idPropertyContext = new idPropertyContext();
    visitor.visitValueProperty("id", as().getId(), idPropertyContext);
    visitor.endVisitValueProperty("id", as().getId(), idPropertyContext);
    class jobTitlePropertyContext implements com.google.gwt.editor.client.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getElementType() { return null; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("jobTitle", obj);
      }
    }
    jobTitlePropertyContext jobTitlePropertyContext = new jobTitlePropertyContext();
    visitor.visitValueProperty("jobTitle", as().getJobTitle(), jobTitlePropertyContext);
    visitor.endVisitValueProperty("jobTitle", as().getJobTitle(), jobTitlePropertyContext);
    class namePropertyContext implements com.google.gwt.editor.client.AutoBeanVisitor.PropertyContext {
      public boolean canSet() { return true; }
      public Class<?> getElementType() { return null; }
      public Class<?> getType() { return java.lang.String.class; }
      public void set(Object obj) { 
        values.put("name", obj);
      }
    }
    namePropertyContext namePropertyContext = new namePropertyContext();
    visitor.visitValueProperty("name", as().getName(), namePropertyContext);
    visitor.endVisitValueProperty("name", as().getName(), namePropertyContext);
  }
}
