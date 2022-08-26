package com.qihoo.util;

import dalvik.system.PathClassLoader;

public class QHClassLoader extends PathClassLoader {
  public QHClassLoader(String paramString, ClassLoader paramClassLoader) {
    super(paramString, paramClassLoader);
  }
  
  public QHClassLoader(String paramString1, String paramString2, ClassLoader paramClassLoader) {
    super(paramString1, paramString2, paramClassLoader);
  }
  
  public static native void interface23(String paramString);
  
  public Class<?> loadClass(String paramString) {
    try {
      interface23(paramString);
    } catch (Throwable throwable) {}
    return super.loadClass(paramString);
  }
  
  protected Class<?> loadClass(String paramString, boolean paramBoolean) {
    try {
      interface23(paramString);
    } catch (Throwable throwable) {}
    return super.loadClass(paramString, paramBoolean);
  }
}
