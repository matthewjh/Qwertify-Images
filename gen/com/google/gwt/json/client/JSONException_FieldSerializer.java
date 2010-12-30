package com.google.gwt.json.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;

@SuppressWarnings("deprecation")
public class JSONException_FieldSerializer {
  public static class Handler implements com.google.gwt.user.client.rpc.impl.TypeHandler {
    public void deserialize(SerializationStreamReader reader, Object object) throws SerializationException {
      com.google.gwt.json.client.JSONException_FieldSerializer.deserialize(reader, (com.google.gwt.json.client.JSONException)object);
    }
    public Object instantiate(SerializationStreamReader reader) throws SerializationException {
      return com.google.gwt.json.client.JSONException_FieldSerializer.instantiate(reader);
    }
    public void serialize(SerializationStreamWriter writer, Object object) throws SerializationException {
      com.google.gwt.json.client.JSONException_FieldSerializer.serialize(writer, (com.google.gwt.json.client.JSONException)object);
    }
  }
  public static Class<?> concreteType() {
    return com.google.gwt.json.client.JSONException.class;
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.google.gwt.json.client.JSONException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.google.gwt.json.client.JSONException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.google.gwt.json.client.JSONException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.google.gwt.json.client.JSONException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
