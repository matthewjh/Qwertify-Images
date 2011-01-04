package com.google.gwt.user.client.rpc.core.java.lang;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class AssertionError_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer.deserialize(reader, (java.lang.AssertionError)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer.serialize(writer, (java.lang.AssertionError)object);
    }
  }
  public static Class<?> concreteType() {
    return java.lang.AssertionError.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, java.lang.AssertionError instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static java.lang.AssertionError instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new java.lang.AssertionError();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, java.lang.AssertionError instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
