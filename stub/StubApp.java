package com.stub;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import com.qihoo.util.c;
import dalvik.system.DexFile;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class StubApp extends Application {
  private static Application a = null;
  
  private static Application b;
  
  private static String c;
  
  private static Context d;
  
  private static String e;
  
  private static String f;
  
  private static String g;
  
  private static String h;
  
  private static String i;
  
  public static boolean isMcIsolated;
  
  private static Map<Integer, String> j;
  
  private static boolean loadFromLib;
  
  private static boolean needX86Bridge;
  
  private static boolean returnIntern;
  
  public static String strEntryApplication = "entryRunApplication";
  
  static {
    b = null;
    c = "libjiagu";
    loadFromLib = false;
    needX86Bridge = false;
    returnIntern = true;
    isMcIsolated = false;
    e = null;
    f = null;
    g = null;
    h = null;
    i = null;
    j = new ConcurrentHashMap<Integer, String>();
  }
  
  private static Application a(Context paramContext) {
    try {
      if (b == null) {
        ClassLoader classLoader = paramContext.getClassLoader();
        if (classLoader != null) {
          Class<?> clazz = classLoader.loadClass(strEntryApplication);
          if (clazz != null)
            b = (Application)clazz.newInstance(); 
        } 
      } 
    } catch (Exception exception) {}
    return b;
  }
  
  private static String a(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    String str1 = c;
    String str2 = str1;
    if (Build.VERSION.SDK_INT < 23) {
      int i = paramString.hashCode();
      str2 = str1 + i;
    } 
    return (paramBoolean1 && !paramBoolean2) ? (str2 + "_64.so") : (str2 + ".so");
  }
  
  public static Context getAppContext() {
    return d;
  }
  
  public static String getDir() {
    return h;
  }
  
  public static Context getOrigApplicationContext(Context paramContext) {
    Application application;
    Context context = paramContext;
    if (paramContext == a)
      application = b; 
    return (Context)application;
  }
  
  public static String getSoPath1() {
    return f;
  }
  
  public static String getSoPath2() {
    return g;
  }
  
  public static String getString2(int paramInt) {
    String str1 = j.get(Integer.valueOf(paramInt));
    String str2 = str1;
    if (str1 == null) {
      str2 = interface14(paramInt);
      j.put(Integer.valueOf(paramInt), str2);
    } 
    str1 = str2;
    if (str2 != null) {
      str1 = str2;
      if (returnIntern)
        str1 = str2.intern(); 
    } 
    return str1;
  }
  
  public static String getString2(String paramString) {
    try {
      paramString = getString2(Integer.parseInt(paramString));
    } catch (NumberFormatException numberFormatException) {
      numberFormatException.printStackTrace();
      numberFormatException = null;
    } 
    return (String)numberFormatException;
  }
  
  public static native void interface11(int paramInt);
  
  public static native Enumeration<String> interface12(DexFile paramDexFile);
  
  public static native long interface13(int paramInt1, long paramLong1, long paramLong2, long paramLong3, int paramInt2, int paramInt3, long paramLong4);
  
  public static native String interface14(int paramInt);
  
  public static native AssetFileDescriptor interface17(AssetManager paramAssetManager, String paramString);
  
  public static native InputStream interface18(Class paramClass, String paramString);
  
  public static native InputStream interface19(ClassLoader paramClassLoader, String paramString);
  
  public static native void interface20();
  
  public static native void interface21(Application paramApplication);
  
  public static native void interface22(int paramInt, String[] paramArrayOfString, int[] paramArrayOfint);
  
  public static native ZipEntry interface30(ZipFile paramZipFile, String paramString);
  
  public static native void interface5(Application paramApplication);
  
  public static native String interface6(String paramString);
  
  public static native boolean interface7(Application paramApplication, Context paramContext);
  
  public static native boolean interface8(Application paramApplication, Context paramContext);
  
  public static native Location mark(LocationManager paramLocationManager, String paramString);
  
  public static native void mark();
  
  public static native void mark(Location paramLocation);
  
  public static synchronized native void n0010();
  
  public static native Object n010333(Object paramObject1, Object paramObject2);
  
  public static native void n0110();
  
  public static native boolean n0111();
  
  public static native void n01110(int paramInt);
  
  public static native int n01111(int paramInt);
  
  public static native void n011110(int paramInt1, int paramInt2);
  
  public static native boolean n011111(boolean paramBoolean, int paramInt);
  
  public static native float n0111111(int paramInt1, int paramInt2, float paramFloat);
  
  public static native void n011111110(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public static native boolean n01111111111(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
  
  public static native long n011111111112(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, float paramFloat8);
  
  public static native long n0111111112(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  public static native void n011111111311113131310(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Object paramObject1, int paramInt7, int paramInt8, int paramInt9, int paramInt10, Object paramObject2, int paramInt11, Object paramObject3, int paramInt12, Object paramObject4, int paramInt13);
  
  public static native void n0111111113113131310(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Object paramObject1, int paramInt7, int paramInt8, Object paramObject2, int paramInt9, Object paramObject3, int paramInt10, Object paramObject4, int paramInt11);
  
  public static native long n011111112(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, boolean paramBoolean);
  
  public static native long n01111112(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean);
  
  public static native Object n01111113(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean);
  
  public static native long n0111112(float paramFloat1, float paramFloat2, float paramFloat3);
  
  public static native long n011112(int paramInt1, int paramInt2);
  
  public static native void n0111130(int paramInt1, int paramInt2, Object paramObject);
  
  public static native boolean n0111131(int paramInt1, int paramInt2, Object paramObject);
  
  public static native long n011113112(int paramInt1, int paramInt2, Object paramObject, boolean paramBoolean, int paramInt3);
  
  public static native long n01111332(int paramInt1, int paramInt2, Object paramObject1, Object paramObject2);
  
  public static native long n01112(float paramFloat);
  
  public static native void n011120(int paramInt, long paramLong);
  
  public static native void n0111210(int paramInt, long paramLong, boolean paramBoolean);
  
  public static native boolean n0111211(int paramInt1, long paramLong, int paramInt2);
  
  public static native void n01112110(int paramInt, long paramLong, float paramFloat1, float paramFloat2);
  
  public static native void n01112111110(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  public static native void n011121111110(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7);
  
  public static native boolean n0111211113111(int paramInt1, long paramLong, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, Object paramObject, boolean paramBoolean1, boolean paramBoolean2);
  
  public static native void n0111211130(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, Object paramObject);
  
  public static native Object n01112113(int paramInt1, long paramLong, int paramInt2, int paramInt3);
  
  public static native long n0111212(int paramInt1, long paramLong, int paramInt2);
  
  public static native Object n0111213(int paramInt, long paramLong, boolean paramBoolean);
  
  public static native long n011122(int paramInt, long paramLong);
  
  public static native void n0111220(int paramInt, long paramLong1, long paramLong2);
  
  public static native void n0111230(int paramInt, long paramLong, Object paramObject);
  
  public static native void n01112310(int paramInt1, long paramLong, Object paramObject, int paramInt2);
  
  public static native boolean n0111231131(int paramInt, long paramLong, Object paramObject1, boolean paramBoolean1, boolean paramBoolean2, Object paramObject2);
  
  public static native void n011123130(int paramInt1, long paramLong, Object paramObject1, int paramInt2, Object paramObject2);
  
  public static native void n011123210(int paramInt1, long paramLong1, Object paramObject, long paramLong2, int paramInt2);
  
  public static native void n01112330(int paramInt, long paramLong, Object paramObject1, Object paramObject2);
  
  public static native void n01112333111111110(int paramInt1, long paramLong, Object paramObject1, Object paramObject2, Object paramObject3, int paramInt2, int paramInt3, int paramInt4, float paramFloat, boolean paramBoolean, int paramInt5, int paramInt6, int paramInt7);
  
  public static native void n0111233330(int paramInt, long paramLong, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4);
  
  public static native Object n01113(boolean paramBoolean);
  
  public static native void n011130(int paramInt, Object paramObject);
  
  public static native boolean n0111311(int paramInt1, Object paramObject, int paramInt2);
  
  public static native boolean n0111313111(int paramInt1, Object paramObject1, int paramInt2, Object paramObject2, int paramInt3, int paramInt4);
  
  public static native Object n011133(boolean paramBoolean, Object paramObject);
  
  public static native void n0111330(int paramInt, Object paramObject1, Object paramObject2);
  
  public static native boolean n0111331(int paramInt, Object paramObject1, Object paramObject2);
  
  public static native Object n01113313(int paramInt1, Object paramObject1, Object paramObject2, int paramInt2);
  
  public static native Object n01113333(int paramInt, Object paramObject1, Object paramObject2, Object paramObject3);
  
  public static native int n0111333333333311111111111311111111(int paramInt1, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5, Object paramObject6, Object paramObject7, Object paramObject8, Object paramObject9, Object paramObject10, boolean paramBoolean1, boolean paramBoolean2, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, int paramInt5, Object paramObject11, boolean paramBoolean8, boolean paramBoolean9, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean10, boolean paramBoolean11);
  
  public static native long n0112();
  
  public static native void n01120(long paramLong);
  
  public static native boolean n01121(long paramLong);
  
  public static native void n011210(long paramLong, int paramInt);
  
  public static native boolean n011211(long paramLong, boolean paramBoolean);
  
  public static native void n0112110(long paramLong, int paramInt1, int paramInt2);
  
  public static native boolean n0112111(long paramLong, int paramInt1, int paramInt2);
  
  public static native void n01121110(long paramLong, int paramInt1, int paramInt2, int paramInt3);
  
  public static native int n01121111(long paramLong, boolean paramBoolean, int paramInt1, int paramInt2);
  
  public static native void n011211110(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public static native void n011211111111110(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, float paramFloat1, float paramFloat2, float paramFloat3);
  
  public static native void n0112111111111330(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Object paramObject1, Object paramObject2);
  
  public static native Object n011211123(long paramLong1, int paramInt1, int paramInt2, int paramInt3, long paramLong2);
  
  public static native void n011211130(long paramLong, int paramInt1, int paramInt2, int paramInt3, Object paramObject);
  
  public static native long n0112112(long paramLong, boolean paramBoolean1, boolean paramBoolean2);
  
  public static native void n011211213133310(long paramLong1, boolean paramBoolean, int paramInt1, long paramLong2, int paramInt2, Object paramObject1, int paramInt3, Object paramObject2, Object paramObject3, Object paramObject4, int paramInt4);
  
  public static native void n011211230(long paramLong1, int paramInt, boolean paramBoolean, long paramLong2, Object paramObject);
  
  public static native void n01121130(long paramLong, float paramFloat1, float paramFloat2, Object paramObject);
  
  public static native boolean n01121131(long paramLong, int paramInt1, int paramInt2, Object paramObject);
  
  public static native void n011211311330(long paramLong, int paramInt1, int paramInt2, Object paramObject1, int paramInt3, int paramInt4, Object paramObject2, Object paramObject3);
  
  public static native void n0112130(long paramLong, int paramInt, Object paramObject);
  
  public static native void n011213131310(long paramLong, int paramInt1, Object paramObject1, int paramInt2, Object paramObject2, int paramInt3, Object paramObject3, int paramInt4);
  
  public static native long n01122(long paramLong);
  
  public static native void n011220(long paramLong1, long paramLong2);
  
  public static native boolean n011221(long paramLong1, long paramLong2);
  
  public static native void n0112210(long paramLong1, long paramLong2, int paramInt);
  
  public static native long n011222(long paramLong1, long paramLong2);
  
  public static native void n0112220(long paramLong1, long paramLong2, long paramLong3);
  
  public static native void n01122210(long paramLong1, long paramLong2, long paramLong3, int paramInt);
  
  public static native void n0112230(long paramLong1, long paramLong2, Object paramObject);
  
  public static native Object n01123(long paramLong);
  
  public static native void n011230(long paramLong, Object paramObject);
  
  public static native boolean n011231(long paramLong, Object paramObject);
  
  public static native void n0112310(long paramLong, Object paramObject, boolean paramBoolean);
  
  public static native int n0112311(long paramLong, Object paramObject, int paramInt);
  
  public static native void n01123110(long paramLong, Object paramObject, int paramInt1, int paramInt2);
  
  public static native boolean n01123111(long paramLong, Object paramObject, int paramInt1, int paramInt2);
  
  public static native void n01123111111111113110(long paramLong, Object paramObject1, int paramInt1, float paramFloat1, int paramInt2, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Object paramObject2, int paramInt3, int paramInt4);
  
  public static native void n0112311211130(long paramLong1, Object paramObject1, int paramInt1, int paramInt2, long paramLong2, int paramInt3, int paramInt4, boolean paramBoolean, Object paramObject2);
  
  public static native void n011231330(long paramLong, Object paramObject1, int paramInt, Object paramObject2, Object paramObject3);
  
  public static native long n011232(long paramLong, Object paramObject);
  
  public static native void n0112320(long paramLong1, Object paramObject, long paramLong2);
  
  public static native long n0112322(long paramLong1, Object paramObject, long paramLong2);
  
  public static native void n0112330(long paramLong, Object paramObject1, Object paramObject2);
  
  public static native int n0112331(long paramLong, Object paramObject1, Object paramObject2);
  
  public static native void n011233111110(long paramLong, Object paramObject1, Object paramObject2, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3);
  
  public static native int n011233111221(long paramLong1, Object paramObject1, Object paramObject2, int paramInt1, int paramInt2, int paramInt3, long paramLong2, long paramLong3);
  
  public static native void n01123311130(long paramLong, Object paramObject1, Object paramObject2, int paramInt1, int paramInt2, float paramFloat, Object paramObject3);
  
  public static native long n011233232(long paramLong1, Object paramObject1, Object paramObject2, long paramLong2, Object paramObject3);
  
  public static native void n01123330(long paramLong, Object paramObject1, Object paramObject2, Object paramObject3);
  
  public static native void n011233311110(long paramLong, Object paramObject1, Object paramObject2, Object paramObject3, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2);
  
  public static native Object n0113();
  
  public static native void n01130(Object paramObject);
  
  public static native boolean n01131(Object paramObject);
  
  public static native void n011310(Object paramObject, int paramInt);
  
  public static native int n011311(Object paramObject, int paramInt);
  
  public static native void n0113111111111113110(Object paramObject1, int paramInt1, float paramFloat1, int paramInt2, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Object paramObject2, int paramInt3, int paramInt4);
  
  public static native long n01131112(Object paramObject, int paramInt1, int paramInt2, int paramInt3);
  
  public static native void n011311130(Object paramObject1, int paramInt1, int paramInt2, int paramInt3, Object paramObject2);
  
  public static native void n011311131313110(Object paramObject1, int paramInt1, float paramFloat, int paramInt2, Object paramObject2, int paramInt3, Object paramObject3, int paramInt4, Object paramObject4, int paramInt5, int paramInt6);
  
  public static native Object n011311133(Object paramObject1, int paramInt1, int paramInt2, int paramInt3, Object paramObject2);
  
  public static native long n0113112(Object paramObject, int paramInt1, int paramInt2);
  
  public static native void n011311313113110(Object paramObject1, int paramInt1, float paramFloat, Object paramObject2, int paramInt2, Object paramObject3, int paramInt3, int paramInt4, Object paramObject4, int paramInt5, int paramInt6);
  
  public static native long n011312(Object paramObject, int paramInt);
  
  public static native void n0113130(Object paramObject1, int paramInt, Object paramObject2);
  
  public static native int n0113131(Object paramObject1, int paramInt, Object paramObject2);
  
  public static native void n0113131110(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2, int paramInt3, int paramInt4);
  
  public static native void n011313131110(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2, Object paramObject3, int paramInt3, int paramInt4, int paramInt5);
  
  public static native int n01131313111111111(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2, Object paramObject3, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10);
  
  public static native void n0113131311111313131110(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2, Object paramObject3, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, Object paramObject4, int paramInt8, Object paramObject5, int paramInt9, Object paramObject6, int paramInt10, int paramInt11, int paramInt12);
  
  public static native int n011313131113111111(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2, Object paramObject3, int paramInt3, int paramInt4, int paramInt5, Object paramObject4, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10);
  
  public static native void n01131313131110(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2, Object paramObject3, int paramInt3, Object paramObject4, int paramInt4, int paramInt5, int paramInt6);
  
  public static native void n0113131313131110(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2, Object paramObject3, int paramInt3, Object paramObject4, int paramInt4, Object paramObject5, int paramInt5, int paramInt6, int paramInt7);
  
  public static native void n011313131313131110(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2, Object paramObject3, int paramInt3, Object paramObject4, int paramInt4, Object paramObject5, int paramInt5, Object paramObject6, int paramInt6, int paramInt7, int paramInt8);
  
  public static native void n0113131313131311110(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2, Object paramObject3, int paramInt3, Object paramObject4, int paramInt4, Object paramObject5, int paramInt5, Object paramObject6, int paramInt6, int paramInt7, int paramInt8, int paramInt9);
  
  public static native Object n0113133(Object paramObject1, int paramInt, Object paramObject2);
  
  public static native boolean n01131331(Object paramObject1, int paramInt, Object paramObject2, Object paramObject3);
  
  public static native long n01132(Object paramObject);
  
  public static native byte n011321(Object paramObject, long paramLong);
  
  public static native Object n011323(Object paramObject, long paramLong);
  
  public static native Object n0113233(Object paramObject1, long paramLong, Object paramObject2);
  
  public static native Object n01133(Object paramObject);
  
  public static native void n011330(Object paramObject1, Object paramObject2);
  
  public static native boolean n011331(Object paramObject1, Object paramObject2);
  
  public static native void n0113310(Object paramObject1, Object paramObject2, int paramInt);
  
  public static native boolean n0113311(Object paramObject1, Object paramObject2, int paramInt);
  
  public static native Object n01133113(Object paramObject1, Object paramObject2, int paramInt, boolean paramBoolean);
  
  public static native int n01133131(Object paramObject1, Object paramObject2, int paramInt, Object paramObject3);
  
  public static native long n011332(Object paramObject1, Object paramObject2);
  
  public static native Object n01133222332223(Object paramObject1, Object paramObject2, long paramLong1, long paramLong2, long paramLong3, Object paramObject3, Object paramObject4, long paramLong4, long paramLong5, long paramLong6);
  
  public static native Object n011333(Object paramObject1, Object paramObject2);
  
  public static native long n0113332(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public static native Object n0113333(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public static native void n01133330(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4);
  
  public static native long n011333311112(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2);
  
  public static native long n01133331112(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public static native Object n011333321133(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, long paramLong, boolean paramBoolean1, boolean paramBoolean2, Object paramObject5);
  
  public static native void pmark(Context paramContext);
  
  public static native void rmark();
  
  protected final void attachBaseContext(Context paramContext) {
    System.currentTimeMillis();
    super.attachBaseContext(paramContext);
    c.b();
    d = paramContext;
    if (a == null)
      a = this; 
    if (b == null) {
      Boolean bool1 = Boolean.valueOf(c.a());
      Boolean bool2 = Boolean.valueOf(false);
      Boolean bool3 = Boolean.valueOf(false);
      if (Build.CPU_ABI.contains("64") || Build.CPU_ABI2.contains("64"))
        bool2 = Boolean.valueOf(true); 
      if (Build.CPU_ABI.contains("mips") || Build.CPU_ABI2.contains("mips"))
        bool3 = Boolean.valueOf(true); 
      if (bool1.booleanValue() && needX86Bridge)
        System.loadLibrary("X86Bridge"); 
      if (loadFromLib) {
        if (bool1.booleanValue() && !needX86Bridge) {
          System.loadLibrary("jiagu_x86");
        } else {
          System.loadLibrary("jiagu");
        } 
      } else {
        String str = paramContext.getFilesDir().getParentFile().getAbsolutePath();
        try {
          String str1 = paramContext.getFilesDir().getParentFile().getCanonicalPath();
          str = str1;
        } catch (Exception exception) {}
        str = str + "/.jiagu";
        i = a(str, bool2.booleanValue(), bool3.booleanValue());
        e = a(str, false, false);
        f = str + File.separator + e;
        g = str + File.separator + i;
        h = str;
        if (bool3.booleanValue()) {
          c.a(paramContext, c + "_mips.so", str, e);
        } else if (bool1.booleanValue() && !needX86Bridge) {
          c.a(paramContext, c + "_x86.so", str, e);
        } else {
          c.a(paramContext, c + ".so", str, e);
        } 
        if (bool2.booleanValue() && !bool3.booleanValue()) {
          boolean bool;
          if (bool1.booleanValue() && !needX86Bridge) {
            bool = c.a(paramContext, c + "_x64.so", str, i);
          } else {
            bool = c.a(paramContext, c + "_a64.so", str, i);
          } 
          if (bool) {
            System.load(str + "/" + i);
          } else {
            System.load(str + "/" + e);
          } 
        } else {
          System.load(str + "/" + e);
        } 
      } 
    } 
    if (!isMcIsolated) {
      interface5(a);
      if (b == null) {
        b = a(paramContext);
        if (b != null)
          try {
            Method method = Application.class.getDeclaredMethod("attach", new Class[] { Context.class });
            if (method != null) {
              method.setAccessible(true);
              method.invoke(b, new Object[] { paramContext });
            } 
            interface8(b, paramContext);
            return;
          } catch (Exception exception) {
            throw new RuntimeException("Failed to call attachBaseContext.", exception);
          }  
      } else {
        return;
      } 
    } else {
      return;
    } 
    System.exit(1);
  }
  
  public native void n11030(Object paramObject);
  
  public native boolean n110331(Object paramObject1, Object paramObject2);
  
  public native void n1110();
  
  public native int n1111();
  
  public native void n11110(boolean paramBoolean);
  
  public native int n11111(int paramInt);
  
  public native void n111110(int paramInt1, int paramInt2);
  
  public native boolean n111111(int paramInt1, int paramInt2);
  
  public native void n11111110(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public native void n11111111111111120(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, boolean paramBoolean7, int paramInt4, int paramInt5, long paramLong);
  
  public native Object n1111113(int paramInt1, int paramInt2, int paramInt3);
  
  public native int n1111121(int paramInt1, int paramInt2, long paramLong);
  
  public native void n1111130(int paramInt1, int paramInt2, Object paramObject);
  
  public native int n11111313331(int paramInt1, int paramInt2, Object paramObject1, int paramInt3, Object paramObject2, Object paramObject3, Object paramObject4);
  
  public native long n11111332(int paramInt1, int paramInt2, Object paramObject1, Object paramObject2);
  
  public native long n11112(int paramInt);
  
  public native void n111120(int paramInt, long paramLong);
  
  public native int n111121(int paramInt, long paramLong);
  
  public native int n1111221(int paramInt, long paramLong1, long paramLong2);
  
  public native int n11112211(int paramInt, long paramLong1, long paramLong2, boolean paramBoolean);
  
  public native int n11112231(int paramInt, long paramLong1, long paramLong2, Object paramObject);
  
  public native Object n11113(int paramInt);
  
  public native void n111130(int paramInt, Object paramObject);
  
  public native int n111131(int paramInt, Object paramObject);
  
  public native int n11113111(int paramInt1, Object paramObject, int paramInt2, int paramInt3);
  
  public native boolean n111131131(int paramInt, Object paramObject1, boolean paramBoolean1, boolean paramBoolean2, Object paramObject2);
  
  public native boolean n11113131(int paramInt, Object paramObject1, boolean paramBoolean, Object paramObject2);
  
  public native boolean n11113231(int paramInt, Object paramObject1, long paramLong, Object paramObject2);
  
  public native void n111132330(int paramInt, Object paramObject1, long paramLong, Object paramObject2, Object paramObject3);
  
  public native void n1111330(int paramInt, Object paramObject1, Object paramObject2);
  
  public native boolean n1111331(int paramInt, Object paramObject1, Object paramObject2);
  
  public native boolean n11113311(int paramInt1, Object paramObject1, Object paramObject2, int paramInt2);
  
  public native void n1111331330(int paramInt, Object paramObject1, Object paramObject2, boolean paramBoolean, Object paramObject3, Object paramObject4);
  
  public native Object n1111333(int paramInt, Object paramObject1, Object paramObject2);
  
  public native void n11113330(int paramInt, Object paramObject1, Object paramObject2, Object paramObject3);
  
  public native int n11113331(int paramInt, Object paramObject1, Object paramObject2, Object paramObject3);
  
  public native void n111133310(int paramInt1, Object paramObject1, Object paramObject2, Object paramObject3, int paramInt2);
  
  public native void n111133320(int paramInt, Object paramObject1, Object paramObject2, Object paramObject3, long paramLong);
  
  public native void n111133330(int paramInt, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4);
  
  public native long n1112();
  
  public native void n11120(long paramLong);
  
  public native boolean n11121(long paramLong);
  
  public native void n111210(long paramLong, int paramInt);
  
  public native int n111211(long paramLong, int paramInt);
  
  public native void n1112110(long paramLong, int paramInt1, int paramInt2);
  
  public native int n1112111(long paramLong, int paramInt1, int paramInt2);
  
  public native void n11121110(long paramLong, float paramFloat1, float paramFloat2, boolean paramBoolean);
  
  public native void n111211110(long paramLong, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
  
  public native void n1112111110(long paramLong, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public native void n11121120(long paramLong, int paramInt1, int paramInt2, double paramDouble);
  
  public native Object n1112113(long paramLong, int paramInt1, int paramInt2);
  
  public native void n11121130(long paramLong, int paramInt1, int paramInt2, Object paramObject);
  
  public native void n1112120(long paramLong, int paramInt, double paramDouble);
  
  public native Object n111213(long paramLong, int paramInt);
  
  public native void n1112130(long paramLong, int paramInt, Object paramObject);
  
  public native void n111213221111111111110(long paramLong, int paramInt1, Object paramObject, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt2, int paramInt3);
  
  public native double n11122(long paramLong);
  
  public native void n111220(long paramLong1, long paramLong2);
  
  public native boolean n111221(long paramLong1, long paramLong2);
  
  public native void n1112210(long paramLong1, long paramLong2, boolean paramBoolean);
  
  public native void n11122110(long paramLong1, long paramLong2, int paramInt1, int paramInt2);
  
  public native void n1112221110(long paramLong, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, boolean paramBoolean);
  
  public native void n1112230(long paramLong1, long paramLong2, Object paramObject);
  
  public native void n11122310(long paramLong1, long paramLong2, Object paramObject, int paramInt);
  
  public native Object n11123(long paramLong);
  
  public native void n111230(long paramLong, Object paramObject);
  
  public native int n111231(long paramLong, Object paramObject);
  
  public native void n1112310(long paramLong, Object paramObject, int paramInt);
  
  public native int n1112311(long paramLong, Object paramObject, boolean paramBoolean);
  
  public native void n11123110(long paramLong, Object paramObject, int paramInt, boolean paramBoolean);
  
  public native void n111231110(long paramLong, Object paramObject, int paramInt1, int paramInt2, boolean paramBoolean);
  
  public native int n111231111(long paramLong, Object paramObject, int paramInt, boolean paramBoolean1, boolean paramBoolean2);
  
  public native void n1112311210(long paramLong1, Object paramObject, int paramInt1, int paramInt2, long paramLong2, int paramInt3);
  
  public native void n111231130(long paramLong, Object paramObject1, float paramFloat1, float paramFloat2, Object paramObject2);
  
  public native void n111231310(long paramLong, Object paramObject1, int paramInt1, Object paramObject2, int paramInt2);
  
  public native int n111231311(long paramLong, Object paramObject1, int paramInt1, Object paramObject2, int paramInt2);
  
  public native void n111231330(long paramLong, Object paramObject1, int paramInt, Object paramObject2, Object paramObject3);
  
  public native int n11123221111111111111(long paramLong, Object paramObject, double paramDouble1, double paramDouble2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt1, int paramInt2);
  
  public native void n111232230(long paramLong, Object paramObject1, double paramDouble1, double paramDouble2, Object paramObject2);
  
  public native int n11123231(long paramLong1, Object paramObject1, long paramLong2, Object paramObject2);
  
  public native Object n111233(long paramLong, Object paramObject);
  
  public native void n1112330(long paramLong, Object paramObject1, Object paramObject2);
  
  public native int n1112331(long paramLong, Object paramObject1, Object paramObject2);
  
  public native void n11123310(long paramLong, Object paramObject1, Object paramObject2, int paramInt);
  
  public native double n1112332(long paramLong, Object paramObject1, Object paramObject2);
  
  public native void n11123330(long paramLong, Object paramObject1, Object paramObject2, Object paramObject3);
  
  public native int n1112333111(long paramLong, Object paramObject1, Object paramObject2, Object paramObject3, int paramInt1, int paramInt2);
  
  public native int n11123333111111113313111(long paramLong, Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, float paramFloat1, int paramInt1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt2, boolean paramBoolean5, Object paramObject5, Object paramObject6, float paramFloat2, Object paramObject7, float paramFloat3, int paramInt3);
  
  public native Object n1113();
  
  public native void n11130(Object paramObject);
  
  public native boolean n11131(Object paramObject);
  
  public native void n111310(Object paramObject, int paramInt);
  
  public native boolean n111311(Object paramObject, boolean paramBoolean);
  
  public native boolean n1113111(Object paramObject, boolean paramBoolean1, boolean paramBoolean2);
  
  public native void n1113111310(Object paramObject1, int paramInt1, int paramInt2, boolean paramBoolean, Object paramObject2, int paramInt3);
  
  public native int n11131121(Object paramObject, int paramInt1, int paramInt2, long paramLong);
  
  public native Object n1113113(Object paramObject, boolean paramBoolean, int paramInt);
  
  public native void n11131130(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2);
  
  public native boolean n11131131(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2);
  
  public native void n1113113110(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2, boolean paramBoolean, int paramInt3);
  
  public native void n111311330(Object paramObject1, int paramInt, boolean paramBoolean, Object paramObject2, Object paramObject3);
  
  public native void n11131133323311111330(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2, Object paramObject3, Object paramObject4, long paramLong, Object paramObject5, Object paramObject6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, Object paramObject7, Object paramObject8);
  
  public native void n111311333233111330(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2, Object paramObject3, Object paramObject4, long paramLong, Object paramObject5, Object paramObject6, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, Object paramObject7, Object paramObject8);
  
  public native int n1113121(Object paramObject, int paramInt, long paramLong);
  
  public native int n111312111(Object paramObject, boolean paramBoolean, long paramLong, int paramInt1, int paramInt2);
  
  public native void n111312111330(Object paramObject1, int paramInt1, long paramLong, int paramInt2, int paramInt3, boolean paramBoolean, Object paramObject2, Object paramObject3);
  
  public native Object n1113121133(Object paramObject1, int paramInt1, long paramLong, int paramInt2, int paramInt3, Object paramObject2);
  
  public native void n1113121330(Object paramObject1, int paramInt1, long paramLong, int paramInt2, Object paramObject2, Object paramObject3);
  
  public native boolean n11131231(Object paramObject1, int paramInt, long paramLong, Object paramObject2);
  
  public native int n111312331(Object paramObject1, int paramInt, long paramLong, Object paramObject2, Object paramObject3);
  
  public native Object n111313(Object paramObject, int paramInt);
  
  public native void n1113130(Object paramObject1, int paramInt, Object paramObject2);
  
  public native boolean n1113131(Object paramObject1, int paramInt, Object paramObject2);
  
  public native void n11131310(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2);
  
  public native Object n1113131233(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2, long paramLong, Object paramObject3);
  
  public native Object n11131321133(Object paramObject1, int paramInt1, Object paramObject2, long paramLong, int paramInt2, boolean paramBoolean, Object paramObject3);
  
  public native Object n111313221133(Object paramObject1, int paramInt1, Object paramObject2, long paramLong1, long paramLong2, int paramInt2, int paramInt3, Object paramObject3);
  
  public native Object n1113132213(Object paramObject1, int paramInt1, Object paramObject2, long paramLong1, long paramLong2, int paramInt2);
  
  public native Object n1113133(Object paramObject1, int paramInt, Object paramObject2);
  
  public native void n11131330(Object paramObject1, int paramInt, Object paramObject2, Object paramObject3);
  
  public native int n11131331(Object paramObject1, int paramInt, Object paramObject2, Object paramObject3);
  
  public native long n11131332(Object paramObject1, int paramInt, Object paramObject2, Object paramObject3);
  
  public native Object n11131333(Object paramObject1, boolean paramBoolean, Object paramObject2, Object paramObject3);
  
  public native void n111313330(Object paramObject1, int paramInt, Object paramObject2, Object paramObject3, Object paramObject4);
  
  public native boolean n111313331(Object paramObject1, int paramInt, Object paramObject2, Object paramObject3, Object paramObject4);
  
  public native long n11131333111231311332(Object paramObject1, int paramInt1, Object paramObject2, Object paramObject3, Object paramObject4, boolean paramBoolean1, int paramInt2, int paramInt3, long paramLong, Object paramObject5, int paramInt4, Object paramObject6, boolean paramBoolean2, boolean paramBoolean3, Object paramObject7, Object paramObject8);
  
  public native void n1113133330(Object paramObject1, int paramInt, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5);
  
  public native long n11132(Object paramObject);
  
  public native void n111320(Object paramObject, long paramLong);
  
  public native boolean n111321(Object paramObject, long paramLong);
  
  public native void n1113211330(Object paramObject1, long paramLong, int paramInt1, int paramInt2, Object paramObject2, Object paramObject3);
  
  public native Object n11132133(Object paramObject1, long paramLong, int paramInt, Object paramObject2);
  
  public native void n1113230(Object paramObject1, long paramLong, Object paramObject2);
  
  public native Object n11133(Object paramObject);
  
  public native void n111330(Object paramObject1, Object paramObject2);
  
  public native boolean n111331(Object paramObject1, Object paramObject2);
  
  public native void n1113310(Object paramObject1, Object paramObject2, boolean paramBoolean);
  
  public native int n1113311(Object paramObject1, Object paramObject2, int paramInt);
  
  public native void n11133110(Object paramObject1, Object paramObject2, boolean paramBoolean, int paramInt);
  
  public native void n111331130(Object paramObject1, Object paramObject2, int paramInt1, int paramInt2, Object paramObject3);
  
  public native int n11133121(Object paramObject1, Object paramObject2, int paramInt, long paramLong);
  
  public native Object n11133123(Object paramObject1, Object paramObject2, int paramInt, long paramLong);
  
  public native void n11133130(Object paramObject1, Object paramObject2, int paramInt, Object paramObject3);
  
  public native void n1113313130(Object paramObject1, Object paramObject2, int paramInt, Object paramObject3, boolean paramBoolean, Object paramObject4);
  
  public native Object n11133133(Object paramObject1, Object paramObject2, int paramInt, Object paramObject3);
  
  public native void n111331330(Object paramObject1, Object paramObject2, boolean paramBoolean, Object paramObject3, Object paramObject4);
  
  public native long n111332(Object paramObject1, Object paramObject2);
  
  public native void n1113323330(Object paramObject1, Object paramObject2, long paramLong, Object paramObject3, Object paramObject4, Object paramObject5);
  
  public native Object n111333(Object paramObject1, Object paramObject2);
  
  public native void n1113330(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public native boolean n1113331(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public native void n11133310(Object paramObject1, Object paramObject2, Object paramObject3, int paramInt);
  
  public native int n11133311(Object paramObject1, Object paramObject2, Object paramObject3, int paramInt);
  
  public native long n1113331113112(Object paramObject1, Object paramObject2, Object paramObject3, float paramFloat1, int paramInt1, float paramFloat2, Object paramObject4, boolean paramBoolean, int paramInt2);
  
  public native Object n1113333(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public native void n11133330(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4);
  
  public native int n11133331(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4);
  
  public native void n1113333130(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, boolean paramBoolean, Object paramObject5);
  
  public native Object n11133333(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4);
  
  public native int n111333331(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5);
  
  public native boolean n1113333311(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4, Object paramObject5, int paramInt);
  
  public final void onCreate() {
    System.currentTimeMillis();
    super.onCreate();
    if (!isMcIsolated) {
      Context context1 = a.getBaseContext();
      try {
        interface7(b, context1);
      } catch (Exception exception) {}
      if (b != null)
        b.onCreate(); 
      interface21(b);
      Application application = this;
      if (b != null)
        application = b; 
      Context context2 = d;
      if (application != null && context2 != null && c.a(context2))
        try {
          Method method = Class.forName(c.a("s}>zw>rx>Bu`bdcDy}u")).getDeclaredMethod(c.a("BuwycdubQsdyfydiSq||Rqs{c"), new Class[] { Application.class });
          method.setAccessible(true);
          method.invoke((Object)null, new Object[] { application });
        } catch (Exception exception) {} 
    } 
  }
}
