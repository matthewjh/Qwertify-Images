package com.google.gwt.user.client.rpc.core.java.lang;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class NullPointerException_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer.deserialize(reader, (java.lang.NullPointerException)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer.serialize(writer, (java.lang.NullPointerException)object);
    }
  }
  public static Class<?> concreteType() {
    return java.lang.NullPointerException.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, java.lang.NullPointerException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static java.lang.NullPointerException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new java.lang.NullPointerException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, java.lang.NullPointerException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
