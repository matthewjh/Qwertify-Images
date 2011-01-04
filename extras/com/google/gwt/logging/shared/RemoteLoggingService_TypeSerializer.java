package com.google.gwt.logging.shared;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;

public class RemoteLoggingService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, TypeHandler> methodMapJava;
  private static final MethodMap methodMapNative;
  private static final Map<Class<?>, String> signatureMapJava;
  private static final JsArrayString signatureMapNative;
  
  static {
    if (GWT.isScript()) {
      methodMapJava = null;
      methodMapNative = loadMethodsNative();
      signatureMapJava = null;
      signatureMapNative = loadSignaturesNative();
    } else {
      methodMapJava = loadMethodsJava();
      methodMapNative = null;
      signatureMapJava = loadSignaturesJava();
      signatureMapNative = null;
    }
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, TypeHandler> loadMethodsJava() {
    Map<String, TypeHandler> result = new HashMap<String, TypeHandler>();
    result.put("com.google.gwt.core.client.impl.SerializableThrowable/3336179259", new com.google.gwt.core.client.impl.SerializableThrowable_FieldSerializer.Handler());
    result.put("com.google.gwt.http.client.RequestException/190587325", new com.google.gwt.http.client.RequestException_FieldSerializer.Handler());
    result.put("com.google.gwt.json.client.JSONException/2941795468", new com.google.gwt.json.client.JSONException_FieldSerializer.Handler());
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", new com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.Handler());
    result.put("com.google.gwt.user.client.rpc.SerializableException/3047383460", new com.google.gwt.user.client.rpc.SerializableException_FieldSerializer.Handler());
    result.put("com.google.gwt.user.client.rpc.SerializationException/2836333220", new com.google.gwt.user.client.rpc.SerializationException_FieldSerializer.Handler());
    result.put("com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447", new com.google.gwt.user.client.rpc.ServiceDefTarget_NoServiceEntryPointSpecifiedException_FieldSerializer.Handler());
    result.put("com.gwtplatform.mvp.client.proxy.TokenFormatException/4290339928", new com.gwtplatform.mvp.client.proxy.TokenFormatException_FieldSerializer.Handler());
    result.put("java.io.IOException/1159940531", new com.google.gwt.user.client.rpc.core.java.io.IOException_FieldSerializer.Handler());
    result.put("java.io.UnsupportedEncodingException/1526756933", new com.google.gwt.user.client.rpc.core.java.io.UnsupportedEncodingException_FieldSerializer.Handler());
    result.put("java.lang.ArithmeticException/1539622151", new com.google.gwt.user.client.rpc.core.java.lang.ArithmeticException_FieldSerializer.Handler());
    result.put("java.lang.ArrayIndexOutOfBoundsException/600550433", new com.google.gwt.user.client.rpc.core.java.lang.ArrayIndexOutOfBoundsException_FieldSerializer.Handler());
    result.put("java.lang.ArrayStoreException/3540507190", new com.google.gwt.user.client.rpc.core.java.lang.ArrayStoreException_FieldSerializer.Handler());
    result.put("java.lang.AssertionError/3490171458", new com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer.Handler());
    result.put("java.lang.ClassCastException/702295179", new com.google.gwt.user.client.rpc.core.java.lang.ClassCastException_FieldSerializer.Handler());
    result.put("java.lang.Error/1331973429", new com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer.Handler());
    result.put("java.lang.Exception/1920171873", new com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.Handler());
    result.put("java.lang.IllegalArgumentException/1755012560", new com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer.Handler());
    result.put("java.lang.IllegalStateException/1972187323", new com.google.gwt.user.client.rpc.core.java.lang.IllegalStateException_FieldSerializer.Handler());
    result.put("java.lang.IndexOutOfBoundsException/2489527753", new com.google.gwt.user.client.rpc.core.java.lang.IndexOutOfBoundsException_FieldSerializer.Handler());
    result.put("java.lang.NegativeArraySizeException/3846860241", new com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer.Handler());
    result.put("java.lang.NullPointerException/1463492344", new com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer.Handler());
    result.put("java.lang.NumberFormatException/3305228476", new com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer.Handler());
    result.put("java.lang.RuntimeException/515124647", new com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.Handler());
    result.put("java.lang.StackTraceElement/1098092073", new com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_FieldSerializer.Handler());
    result.put("[Ljava.lang.StackTraceElement;/168204027", new com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_Array_Rank_1_FieldSerializer.Handler());
    result.put("java.lang.String/2004016611", new com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.Handler());
    result.put("java.lang.StringIndexOutOfBoundsException/500777603", new com.google.gwt.user.client.rpc.core.java.lang.StringIndexOutOfBoundsException_FieldSerializer.Handler());
    result.put("java.lang.Throwable/2953622131", new com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer.Handler());
    result.put("java.lang.UnsupportedOperationException/3744010015", new com.google.gwt.user.client.rpc.core.java.lang.UnsupportedOperationException_FieldSerializer.Handler());
    result.put("java.lang.annotation.AnnotationFormatError/2257184627", new com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationFormatError_FieldSerializer.Handler());
    result.put("java.lang.annotation.AnnotationTypeMismatchException/976205828", new com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationTypeMismatchException_FieldSerializer.Handler());
    result.put("java.security.DigestException/629316798", new com.google.gwt.user.client.rpc.core.java.security.DigestException_FieldSerializer.Handler());
    result.put("java.security.GeneralSecurityException/2669239907", new com.google.gwt.user.client.rpc.core.java.security.GeneralSecurityException_FieldSerializer.Handler());
    result.put("java.security.NoSuchAlgorithmException/2892037213", new com.google.gwt.user.client.rpc.core.java.security.NoSuchAlgorithmException_FieldSerializer.Handler());
    result.put("java.util.ConcurrentModificationException/2717383897", new com.google.gwt.user.client.rpc.core.java.util.ConcurrentModificationException_FieldSerializer.Handler());
    result.put("java.util.EmptyStackException/89438517", new com.google.gwt.user.client.rpc.core.java.util.EmptyStackException_FieldSerializer.Handler());
    result.put("java.util.NoSuchElementException/1559248883", new com.google.gwt.user.client.rpc.core.java.util.NoSuchElementException_FieldSerializer.Handler());
    result.put("java.util.TooManyListenersException/2023078032", new com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer.Handler());
    result.put("java.util.logging.Level/2839552483", new com.google.gwt.user.client.rpc.core.java.util.logging.Level_FieldSerializer.Handler());
    result.put("java.util.logging.LogRecord/2492345967", new com.google.gwt.user.client.rpc.core.java.util.logging.LogRecord_FieldSerializer.Handler());
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.google.gwt.core.client.impl.SerializableThrowable/3336179259"] = [
        ,
        ,
        @com.google.gwt.core.client.impl.SerializableThrowable_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/core/client/impl/SerializableThrowable;)
      ];
    
    result["com.google.gwt.http.client.RequestException/190587325"] = [
        ,
        ,
        @com.google.gwt.http.client.RequestException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/http/client/RequestException;)
      ];
    
    result["com.google.gwt.json.client.JSONException/2941795468"] = [
        ,
        ,
        @com.google.gwt.json.client.JSONException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/json/client/JSONException;)
      ];
    
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.google.gwt.user.client.rpc.SerializableException/3047383460"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.SerializableException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/SerializableException;)
      ];
    
    result["com.google.gwt.user.client.rpc.SerializationException/2836333220"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.SerializationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/SerializationException;)
      ];
    
    result["com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.ServiceDefTarget_NoServiceEntryPointSpecifiedException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/ServiceDefTarget$NoServiceEntryPointSpecifiedException;)
      ];
    
    result["com.gwtplatform.mvp.client.proxy.TokenFormatException/4290339928"] = [
        ,
        ,
        @com.gwtplatform.mvp.client.proxy.TokenFormatException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/gwtplatform/mvp/client/proxy/TokenFormatException;)
      ];
    
    result["java.io.IOException/1159940531"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.io.IOException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/io/IOException;)
      ];
    
    result["java.io.UnsupportedEncodingException/1526756933"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.io.UnsupportedEncodingException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/io/UnsupportedEncodingException;)
      ];
    
    result["java.lang.ArithmeticException/1539622151"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.ArithmeticException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ArithmeticException;)
      ];
    
    result["java.lang.ArrayIndexOutOfBoundsException/600550433"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayIndexOutOfBoundsException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ArrayIndexOutOfBoundsException;)
      ];
    
    result["java.lang.ArrayStoreException/3540507190"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.ArrayStoreException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ArrayStoreException;)
      ];
    
    result["java.lang.AssertionError/3490171458"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/AssertionError;)
      ];
    
    result["java.lang.ClassCastException/702295179"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.ClassCastException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/ClassCastException;)
      ];
    
    result["java.lang.Error/1331973429"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Error;)
      ];
    
    result["java.lang.Exception/1920171873"] = [
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Exception;),
        @com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Exception;)
      ];
    
    result["java.lang.IllegalArgumentException/1755012560"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/IllegalArgumentException;)
      ];
    
    result["java.lang.IllegalStateException/1972187323"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.IllegalStateException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/IllegalStateException;)
      ];
    
    result["java.lang.IndexOutOfBoundsException/2489527753"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.IndexOutOfBoundsException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/IndexOutOfBoundsException;)
      ];
    
    result["java.lang.NegativeArraySizeException/3846860241"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NegativeArraySizeException;)
      ];
    
    result["java.lang.NullPointerException/1463492344"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NullPointerException;)
      ];
    
    result["java.lang.NumberFormatException/3305228476"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/NumberFormatException;)
      ];
    
    result["java.lang.RuntimeException/515124647"] = [
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/RuntimeException;),
        @com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/RuntimeException;)
      ];
    
    result["java.lang.StackTraceElement/1098092073"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/StackTraceElement;)
      ];
    
    result["[Ljava.lang.StackTraceElement;/168204027"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/StackTraceElement;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["java.lang.StringIndexOutOfBoundsException/500777603"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.StringIndexOutOfBoundsException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/StringIndexOutOfBoundsException;)
      ];
    
    result["java.lang.Throwable/2953622131"] = [
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Throwable;),
        @com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Throwable;)
      ];
    
    result["java.lang.UnsupportedOperationException/3744010015"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.UnsupportedOperationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/UnsupportedOperationException;)
      ];
    
    result["java.lang.annotation.AnnotationFormatError/2257184627"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationFormatError_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/annotation/AnnotationFormatError;)
      ];
    
    result["java.lang.annotation.AnnotationTypeMismatchException/976205828"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationTypeMismatchException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/annotation/AnnotationTypeMismatchException;)
      ];
    
    result["java.security.DigestException/629316798"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.security.DigestException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/security/DigestException;)
      ];
    
    result["java.security.GeneralSecurityException/2669239907"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.security.GeneralSecurityException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/security/GeneralSecurityException;)
      ];
    
    result["java.security.NoSuchAlgorithmException/2892037213"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.security.NoSuchAlgorithmException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/security/NoSuchAlgorithmException;)
      ];
    
    result["java.util.ConcurrentModificationException/2717383897"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.ConcurrentModificationException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ConcurrentModificationException;)
      ];
    
    result["java.util.EmptyStackException/89438517"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.EmptyStackException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/EmptyStackException;)
      ];
    
    result["java.util.NoSuchElementException/1559248883"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.NoSuchElementException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/NoSuchElementException;)
      ];
    
    result["java.util.TooManyListenersException/2023078032"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TooManyListenersException;)
      ];
    
    result["java.util.logging.Level/2839552483"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.logging.Level_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/logging/Level;)
      ];
    
    result["java.util.logging.LogRecord/2492345967"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.logging.LogRecord_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/logging/LogRecord;)
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  private static Map<Class<?>, String> loadSignaturesJava() {
    Map<Class<?>, String> result = new HashMap<Class<?>, String>();
    result.put(com.google.gwt.core.client.impl.SerializableThrowable_FieldSerializer.concreteType(), "com.google.gwt.core.client.impl.SerializableThrowable/3336179259");
    result.put(com.google.gwt.http.client.RequestException_FieldSerializer.concreteType(), "com.google.gwt.http.client.RequestException/190587325");
    result.put(com.google.gwt.json.client.JSONException_FieldSerializer.concreteType(), "com.google.gwt.json.client.JSONException/2941795468");
    result.put(com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer.concreteType(), "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put(com.google.gwt.user.client.rpc.SerializableException_FieldSerializer.concreteType(), "com.google.gwt.user.client.rpc.SerializableException/3047383460");
    result.put(com.google.gwt.user.client.rpc.SerializationException_FieldSerializer.concreteType(), "com.google.gwt.user.client.rpc.SerializationException/2836333220");
    result.put(com.google.gwt.user.client.rpc.ServiceDefTarget_NoServiceEntryPointSpecifiedException_FieldSerializer.concreteType(), "com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447");
    result.put(com.gwtplatform.mvp.client.proxy.TokenFormatException_FieldSerializer.concreteType(), "com.gwtplatform.mvp.client.proxy.TokenFormatException/4290339928");
    result.put(com.google.gwt.user.client.rpc.core.java.io.IOException_FieldSerializer.concreteType(), "java.io.IOException/1159940531");
    result.put(com.google.gwt.user.client.rpc.core.java.io.UnsupportedEncodingException_FieldSerializer.concreteType(), "java.io.UnsupportedEncodingException/1526756933");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.ArithmeticException_FieldSerializer.concreteType(), "java.lang.ArithmeticException/1539622151");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.ArrayIndexOutOfBoundsException_FieldSerializer.concreteType(), "java.lang.ArrayIndexOutOfBoundsException/600550433");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.ArrayStoreException_FieldSerializer.concreteType(), "java.lang.ArrayStoreException/3540507190");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.AssertionError_FieldSerializer.concreteType(), "java.lang.AssertionError/3490171458");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.ClassCastException_FieldSerializer.concreteType(), "java.lang.ClassCastException/702295179");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.Error_FieldSerializer.concreteType(), "java.lang.Error/1331973429");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.concreteType(), "java.lang.Exception/1920171873");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.IllegalArgumentException_FieldSerializer.concreteType(), "java.lang.IllegalArgumentException/1755012560");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.IllegalStateException_FieldSerializer.concreteType(), "java.lang.IllegalStateException/1972187323");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.IndexOutOfBoundsException_FieldSerializer.concreteType(), "java.lang.IndexOutOfBoundsException/2489527753");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.NegativeArraySizeException_FieldSerializer.concreteType(), "java.lang.NegativeArraySizeException/3846860241");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.NullPointerException_FieldSerializer.concreteType(), "java.lang.NullPointerException/1463492344");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.NumberFormatException_FieldSerializer.concreteType(), "java.lang.NumberFormatException/3305228476");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.RuntimeException_FieldSerializer.concreteType(), "java.lang.RuntimeException/515124647");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_FieldSerializer.concreteType(), "java.lang.StackTraceElement/1098092073");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.StackTraceElement_Array_Rank_1_FieldSerializer.concreteType(), "[Ljava.lang.StackTraceElement;/168204027");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer.concreteType(), "java.lang.String/2004016611");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.StringIndexOutOfBoundsException_FieldSerializer.concreteType(), "java.lang.StringIndexOutOfBoundsException/500777603");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.Throwable_FieldSerializer.concreteType(), "java.lang.Throwable/2953622131");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.UnsupportedOperationException_FieldSerializer.concreteType(), "java.lang.UnsupportedOperationException/3744010015");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationFormatError_FieldSerializer.concreteType(), "java.lang.annotation.AnnotationFormatError/2257184627");
    result.put(com.google.gwt.user.client.rpc.core.java.lang.annotation.AnnotationTypeMismatchException_FieldSerializer.concreteType(), "java.lang.annotation.AnnotationTypeMismatchException/976205828");
    result.put(com.google.gwt.user.client.rpc.core.java.security.DigestException_FieldSerializer.concreteType(), "java.security.DigestException/629316798");
    result.put(com.google.gwt.user.client.rpc.core.java.security.GeneralSecurityException_FieldSerializer.concreteType(), "java.security.GeneralSecurityException/2669239907");
    result.put(com.google.gwt.user.client.rpc.core.java.security.NoSuchAlgorithmException_FieldSerializer.concreteType(), "java.security.NoSuchAlgorithmException/2892037213");
    result.put(com.google.gwt.user.client.rpc.core.java.util.ConcurrentModificationException_FieldSerializer.concreteType(), "java.util.ConcurrentModificationException/2717383897");
    result.put(com.google.gwt.user.client.rpc.core.java.util.EmptyStackException_FieldSerializer.concreteType(), "java.util.EmptyStackException/89438517");
    result.put(com.google.gwt.user.client.rpc.core.java.util.NoSuchElementException_FieldSerializer.concreteType(), "java.util.NoSuchElementException/1559248883");
    result.put(com.google.gwt.user.client.rpc.core.java.util.TooManyListenersException_FieldSerializer.concreteType(), "java.util.TooManyListenersException/2023078032");
    result.put(com.google.gwt.user.client.rpc.core.java.util.logging.Level_FieldSerializer.concreteType(), "java.util.logging.Level/2839552483");
    result.put(com.google.gwt.user.client.rpc.core.java.util.logging.LogRecord_FieldSerializer.concreteType(), "java.util.logging.LogRecord/2492345967");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.core.client.impl.SerializableThrowable::class)] = "com.google.gwt.core.client.impl.SerializableThrowable/3336179259";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.http.client.RequestException::class)] = "com.google.gwt.http.client.RequestException/190587325";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.json.client.JSONException::class)] = "com.google.gwt.json.client.JSONException/2941795468";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.SerializableException::class)] = "com.google.gwt.user.client.rpc.SerializableException/3047383460";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.SerializationException::class)] = "com.google.gwt.user.client.rpc.SerializationException/2836333220";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException::class)] = "com.google.gwt.user.client.rpc.ServiceDefTarget$NoServiceEntryPointSpecifiedException/3408313447";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.gwtplatform.mvp.client.proxy.TokenFormatException::class)] = "com.gwtplatform.mvp.client.proxy.TokenFormatException/4290339928";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.io.IOException::class)] = "java.io.IOException/1159940531";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.io.UnsupportedEncodingException::class)] = "java.io.UnsupportedEncodingException/1526756933";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ArithmeticException::class)] = "java.lang.ArithmeticException/1539622151";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ArrayIndexOutOfBoundsException::class)] = "java.lang.ArrayIndexOutOfBoundsException/600550433";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ArrayStoreException::class)] = "java.lang.ArrayStoreException/3540507190";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.AssertionError::class)] = "java.lang.AssertionError/3490171458";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.ClassCastException::class)] = "java.lang.ClassCastException/702295179";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Error::class)] = "java.lang.Error/1331973429";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Exception::class)] = "java.lang.Exception/1920171873";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.IllegalArgumentException::class)] = "java.lang.IllegalArgumentException/1755012560";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.IllegalStateException::class)] = "java.lang.IllegalStateException/1972187323";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.IndexOutOfBoundsException::class)] = "java.lang.IndexOutOfBoundsException/2489527753";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NegativeArraySizeException::class)] = "java.lang.NegativeArraySizeException/3846860241";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NullPointerException::class)] = "java.lang.NullPointerException/1463492344";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.NumberFormatException::class)] = "java.lang.NumberFormatException/3305228476";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.RuntimeException::class)] = "java.lang.RuntimeException/515124647";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.StackTraceElement::class)] = "java.lang.StackTraceElement/1098092073";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.StackTraceElement[]::class)] = "[Ljava.lang.StackTraceElement;/168204027";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.StringIndexOutOfBoundsException::class)] = "java.lang.StringIndexOutOfBoundsException/500777603";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Throwable::class)] = "java.lang.Throwable/2953622131";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.UnsupportedOperationException::class)] = "java.lang.UnsupportedOperationException/3744010015";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.annotation.AnnotationFormatError::class)] = "java.lang.annotation.AnnotationFormatError/2257184627";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.annotation.AnnotationTypeMismatchException::class)] = "java.lang.annotation.AnnotationTypeMismatchException/976205828";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.security.DigestException::class)] = "java.security.DigestException/629316798";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.security.GeneralSecurityException::class)] = "java.security.GeneralSecurityException/2669239907";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.security.NoSuchAlgorithmException::class)] = "java.security.NoSuchAlgorithmException/2892037213";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ConcurrentModificationException::class)] = "java.util.ConcurrentModificationException/2717383897";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.EmptyStackException::class)] = "java.util.EmptyStackException/89438517";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.NoSuchElementException::class)] = "java.util.NoSuchElementException/1559248883";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TooManyListenersException::class)] = "java.util.TooManyListenersException/2023078032";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.logging.Level::class)] = "java.util.logging.Level/2839552483";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.logging.LogRecord::class)] = "java.util.logging.LogRecord/2492345967";
    return result;
  }-*/;
  
  public RemoteLoggingService_TypeSerializer() {
    super(methodMapJava, methodMapNative, signatureMapJava, signatureMapNative);
  }
  
}
