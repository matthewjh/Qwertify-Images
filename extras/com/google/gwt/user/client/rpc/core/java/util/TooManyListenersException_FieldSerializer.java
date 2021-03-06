package com.google.gwt.user.client.rpc.core.java.util;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class TooManyListenersException_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer.deserialize(reader, (java.util.TooManyListenersException)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer.serialize(writer, (java.util.TooManyListenersException)object);
    }
  }
  public static Class<?> concreteType() {
    return java.util.TooManyListenersException.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, java.util.TooManyListenersException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static java.util.TooManyListenersException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new java.util.TooManyListenersException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, java.util.TooManyListenersException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
