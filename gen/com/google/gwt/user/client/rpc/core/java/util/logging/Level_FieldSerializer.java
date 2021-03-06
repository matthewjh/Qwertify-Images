package com.google.gwt.user.client.rpc.core.java.util.logging;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class Level_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.google.gwt.user.client.rpc.core.java.util.logging.Level_CustomFieldSerializer.deserialize(reader, (java.util.logging.Level)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.google.gwt.user.client.rpc.core.java.util.logging.Level_CustomFieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.google.gwt.user.client.rpc.core.java.util.logging.Level_CustomFieldSerializer.serialize(writer, (java.util.logging.Level)object);
    }
  }
  public static Class<?> concreteType() {
    return java.util.logging.Level.class;
  }
  
}
