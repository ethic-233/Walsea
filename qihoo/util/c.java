package com.qihoo.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class c {
  public static String a(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return ""; 
    char[] arrayOfChar = paramString.toCharArray();
    for (byte b = 0; b < arrayOfChar.length; b++)
      arrayOfChar[b] = (char)(char)(arrayOfChar[b] ^ 0x10); 
    return String.valueOf(arrayOfChar);
  }
  
  private static void a(Closeable paramCloseable) {
    if (paramCloseable != null)
      try {
        paramCloseable.close();
      } catch (IOException iOException) {} 
  }
  
  public static boolean a() {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: iconst_1
    //   3: istore_1
    //   4: getstatic android/os/Build.SUPPORTED_32_BIT_ABIS : [Ljava/lang/String;
    //   7: astore_2
    //   8: aload_2
    //   9: arraylength
    //   10: istore_3
    //   11: iconst_0
    //   12: istore #4
    //   14: iload #4
    //   16: iload_3
    //   17: if_icmpge -> 44
    //   20: aload_2
    //   21: iload #4
    //   23: aaload
    //   24: ldc 'x86'
    //   26: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   29: ifeq -> 38
    //   32: iload_1
    //   33: istore #5
    //   35: iload #5
    //   37: ireturn
    //   38: iinc #4, 1
    //   41: goto -> 14
    //   44: iload_1
    //   45: istore #5
    //   47: getstatic android/os/Build.CPU_ABI : Ljava/lang/String;
    //   50: ldc 'x86'
    //   52: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   55: ifne -> 35
    //   58: getstatic android/os/Build.CPU_ABI2 : Ljava/lang/String;
    //   61: ldc 'x86'
    //   63: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   66: istore #6
    //   68: iload_1
    //   69: istore #5
    //   71: iload #6
    //   73: ifne -> 35
    //   76: new java/io/RandomAccessFile
    //   79: astore_2
    //   80: aload_2
    //   81: ldc '/system/build.prop'
    //   83: ldc 'r'
    //   85: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   88: aload_2
    //   89: invokevirtual readLine : ()Ljava/lang/String;
    //   92: astore #7
    //   94: aload #7
    //   96: ifnull -> 149
    //   99: aload #7
    //   101: ldc 'ro.product.cpu.abi'
    //   103: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   106: ifeq -> 140
    //   109: aload #7
    //   111: ldc 'x86'
    //   113: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   116: istore #5
    //   118: iload #5
    //   120: ifeq -> 140
    //   123: aload_2
    //   124: invokevirtual close : ()V
    //   127: iload_1
    //   128: istore #5
    //   130: goto -> 35
    //   133: astore_2
    //   134: iload_1
    //   135: istore #5
    //   137: goto -> 35
    //   140: aload_2
    //   141: invokevirtual readLine : ()Ljava/lang/String;
    //   144: astore #7
    //   146: goto -> 94
    //   149: aload_2
    //   150: invokevirtual close : ()V
    //   153: new java/io/FileInputStream
    //   156: astore_2
    //   157: aload_2
    //   158: ldc '/system/bin/ls'
    //   160: invokespecial <init> : (Ljava/lang/String;)V
    //   163: bipush #20
    //   165: newarray byte
    //   167: astore #7
    //   169: aload_2
    //   170: aload #7
    //   172: invokevirtual read : ([B)I
    //   175: bipush #20
    //   177: if_icmpne -> 479
    //   180: aload #7
    //   182: iconst_0
    //   183: baload
    //   184: bipush #127
    //   186: if_icmpne -> 479
    //   189: aload #7
    //   191: iconst_1
    //   192: baload
    //   193: bipush #69
    //   195: if_icmpne -> 479
    //   198: aload #7
    //   200: iconst_2
    //   201: baload
    //   202: bipush #76
    //   204: if_icmpne -> 479
    //   207: aload #7
    //   209: iconst_3
    //   210: baload
    //   211: bipush #70
    //   213: if_icmpne -> 479
    //   216: aload #7
    //   218: bipush #18
    //   220: baload
    //   221: iconst_3
    //   222: if_icmpeq -> 239
    //   225: aload #7
    //   227: bipush #18
    //   229: baload
    //   230: istore #4
    //   232: iload #4
    //   234: bipush #62
    //   236: if_icmpne -> 479
    //   239: iload_1
    //   240: istore #5
    //   242: aload_2
    //   243: ifnull -> 35
    //   246: aload_2
    //   247: invokevirtual close : ()V
    //   250: iload_1
    //   251: istore #5
    //   253: goto -> 35
    //   256: astore_2
    //   257: iload_1
    //   258: istore #5
    //   260: goto -> 35
    //   263: astore_2
    //   264: aconst_null
    //   265: astore_2
    //   266: aload_2
    //   267: ifnull -> 153
    //   270: aload_2
    //   271: invokevirtual close : ()V
    //   274: goto -> 153
    //   277: astore_2
    //   278: goto -> 153
    //   281: astore_2
    //   282: aconst_null
    //   283: astore_2
    //   284: aload_2
    //   285: ifnull -> 153
    //   288: aload_2
    //   289: invokevirtual close : ()V
    //   292: goto -> 153
    //   295: astore_2
    //   296: goto -> 153
    //   299: astore_2
    //   300: aconst_null
    //   301: astore #7
    //   303: aload #7
    //   305: ifnull -> 313
    //   308: aload #7
    //   310: invokevirtual close : ()V
    //   313: aload_2
    //   314: athrow
    //   315: astore_2
    //   316: iload_1
    //   317: istore #5
    //   319: getstatic android/os/Build.CPU_ABI : Ljava/lang/String;
    //   322: ldc 'x86'
    //   324: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   327: ifne -> 35
    //   330: iload_1
    //   331: istore #5
    //   333: getstatic android/os/Build.CPU_ABI2 : Ljava/lang/String;
    //   336: ldc 'x86'
    //   338: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   341: ifne -> 35
    //   344: new java/io/RandomAccessFile
    //   347: astore_2
    //   348: aload_2
    //   349: ldc '/system/build.prop'
    //   351: ldc 'r'
    //   353: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
    //   356: aload_2
    //   357: invokevirtual readLine : ()Ljava/lang/String;
    //   360: astore #7
    //   362: aload #7
    //   364: ifnull -> 417
    //   367: aload #7
    //   369: ldc 'ro.product.cpu.abi'
    //   371: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   374: ifeq -> 408
    //   377: aload #7
    //   379: ldc 'x86'
    //   381: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   384: istore #5
    //   386: iload #5
    //   388: ifeq -> 408
    //   391: aload_2
    //   392: invokevirtual close : ()V
    //   395: iload_1
    //   396: istore #5
    //   398: goto -> 35
    //   401: astore_2
    //   402: iload_1
    //   403: istore #5
    //   405: goto -> 35
    //   408: aload_2
    //   409: invokevirtual readLine : ()Ljava/lang/String;
    //   412: astore #7
    //   414: goto -> 362
    //   417: aload_2
    //   418: invokevirtual close : ()V
    //   421: goto -> 153
    //   424: astore_2
    //   425: goto -> 153
    //   428: astore_2
    //   429: aconst_null
    //   430: astore_2
    //   431: aload_2
    //   432: ifnull -> 153
    //   435: aload_2
    //   436: invokevirtual close : ()V
    //   439: goto -> 153
    //   442: astore_2
    //   443: goto -> 153
    //   446: astore_2
    //   447: aconst_null
    //   448: astore_2
    //   449: aload_2
    //   450: ifnull -> 153
    //   453: aload_2
    //   454: invokevirtual close : ()V
    //   457: goto -> 153
    //   460: astore_2
    //   461: goto -> 153
    //   464: astore #7
    //   466: aconst_null
    //   467: astore_2
    //   468: aload_2
    //   469: ifnull -> 476
    //   472: aload_2
    //   473: invokevirtual close : ()V
    //   476: aload #7
    //   478: athrow
    //   479: aload_2
    //   480: ifnull -> 487
    //   483: aload_2
    //   484: invokevirtual close : ()V
    //   487: iconst_0
    //   488: istore #5
    //   490: goto -> 35
    //   493: astore_2
    //   494: aload_0
    //   495: astore_2
    //   496: aload_2
    //   497: ifnull -> 487
    //   500: aload_2
    //   501: invokevirtual close : ()V
    //   504: goto -> 487
    //   507: astore_2
    //   508: goto -> 487
    //   511: astore #7
    //   513: aconst_null
    //   514: astore_2
    //   515: aload_2
    //   516: ifnull -> 523
    //   519: aload_2
    //   520: invokevirtual close : ()V
    //   523: aload #7
    //   525: athrow
    //   526: astore_2
    //   527: goto -> 153
    //   530: astore #7
    //   532: goto -> 313
    //   535: astore_2
    //   536: goto -> 476
    //   539: astore_2
    //   540: goto -> 487
    //   543: astore_2
    //   544: goto -> 523
    //   547: astore #7
    //   549: goto -> 515
    //   552: astore #7
    //   554: goto -> 496
    //   557: astore #7
    //   559: goto -> 468
    //   562: astore #7
    //   564: goto -> 449
    //   567: astore #7
    //   569: goto -> 431
    //   572: astore #8
    //   574: aload_2
    //   575: astore #7
    //   577: aload #8
    //   579: astore_2
    //   580: goto -> 303
    //   583: astore #7
    //   585: goto -> 284
    //   588: astore #7
    //   590: goto -> 266
    // Exception table:
    //   from	to	target	type
    //   4	11	315	java/lang/NoSuchFieldError
    //   20	32	315	java/lang/NoSuchFieldError
    //   47	68	315	java/lang/NoSuchFieldError
    //   76	88	263	java/io/FileNotFoundException
    //   76	88	281	java/io/IOException
    //   76	88	299	finally
    //   88	94	588	java/io/FileNotFoundException
    //   88	94	583	java/io/IOException
    //   88	94	572	finally
    //   99	118	588	java/io/FileNotFoundException
    //   99	118	583	java/io/IOException
    //   99	118	572	finally
    //   123	127	133	java/lang/Exception
    //   123	127	315	java/lang/NoSuchFieldError
    //   140	146	588	java/io/FileNotFoundException
    //   140	146	583	java/io/IOException
    //   140	146	572	finally
    //   149	153	526	java/lang/Exception
    //   149	153	315	java/lang/NoSuchFieldError
    //   153	163	493	java/lang/Exception
    //   153	163	511	finally
    //   163	180	552	java/lang/Exception
    //   163	180	547	finally
    //   246	250	256	java/io/IOException
    //   270	274	277	java/lang/Exception
    //   270	274	315	java/lang/NoSuchFieldError
    //   288	292	295	java/lang/Exception
    //   288	292	315	java/lang/NoSuchFieldError
    //   308	313	530	java/lang/Exception
    //   308	313	315	java/lang/NoSuchFieldError
    //   313	315	315	java/lang/NoSuchFieldError
    //   344	356	428	java/io/FileNotFoundException
    //   344	356	446	java/io/IOException
    //   344	356	464	finally
    //   356	362	567	java/io/FileNotFoundException
    //   356	362	562	java/io/IOException
    //   356	362	557	finally
    //   367	386	567	java/io/FileNotFoundException
    //   367	386	562	java/io/IOException
    //   367	386	557	finally
    //   391	395	401	java/lang/Exception
    //   408	414	567	java/io/FileNotFoundException
    //   408	414	562	java/io/IOException
    //   408	414	557	finally
    //   417	421	424	java/lang/Exception
    //   435	439	442	java/lang/Exception
    //   453	457	460	java/lang/Exception
    //   472	476	535	java/lang/Exception
    //   483	487	539	java/io/IOException
    //   500	504	507	java/io/IOException
    //   519	523	543	java/io/IOException
  }
  
  public static boolean a(Context paramContext) {
    boolean bool;
    try {
      Class<?> clazz = Class.forName(a("q~tbyt>q``>QsdyfydiDxbuqt"));
      Method method2 = clazz.getDeclaredMethod(a("sebbu~dQsdyfydiDxbuqt"), new Class[0]);
      method2.setAccessible(true);
      Object object = method2.invoke((Object)null, new Object[0]);
      Method method1 = clazz.getDeclaredMethod(a("wud@bsucc^q}u"), new Class[0]);
      method1.setAccessible(true);
      String str = (String)method1.invoke(object, new Object[0]);
      bool = paramContext.getPackageName().equalsIgnoreCase(str);
    } catch (Throwable throwable) {
      bool = true;
    } 
    return bool;
  }
  
  public static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3) {
    boolean bool = true;
    paramString3 = paramString2 + "/" + paramString3;
    File file = new File(paramString2);
    if (!file.exists())
      file.mkdir(); 
    try {
      File file1 = new File();
      this(paramString3);
      if (file1.exists()) {
        boolean bool1;
        InputStream inputStream1 = paramContext.getResources().getAssets().open(paramString1);
        FileInputStream fileInputStream = new FileInputStream();
        this(file1);
        BufferedInputStream bufferedInputStream2 = new BufferedInputStream();
        this(inputStream1);
        BufferedInputStream bufferedInputStream1 = new BufferedInputStream();
        this(fileInputStream);
        if (a(bufferedInputStream2, bufferedInputStream1)) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        inputStream1.close();
        fileInputStream.close();
        bufferedInputStream2.close();
        bufferedInputStream1.close();
        if (bool1)
          return bool; 
      } 
      InputStream inputStream = paramContext.getResources().getAssets().open(paramString1);
      try {
        FileOutputStream fileOutputStream = new FileOutputStream();
        this(paramString3);
      } catch (Exception exception) {
      
      } finally {
        paramString1 = null;
      } 
      a((Closeable)file);
      a(inputStream);
      throw paramString1;
    } catch (Exception exception) {
    
    } finally {
      file = null;
      paramContext = null;
      a((Closeable)file);
      a((Closeable)paramContext);
    } 
    a((Closeable)paramString1);
    a((Closeable)paramContext);
    bool = false;
  }
  
  private static boolean a(BufferedInputStream paramBufferedInputStream1, BufferedInputStream paramBufferedInputStream2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: invokevirtual available : ()I
    //   6: istore_3
    //   7: aload_1
    //   8: invokevirtual available : ()I
    //   11: istore #4
    //   13: iload_2
    //   14: istore #5
    //   16: iload_3
    //   17: iload #4
    //   19: if_icmpne -> 80
    //   22: iload_3
    //   23: newarray byte
    //   25: astore #6
    //   27: iload #4
    //   29: newarray byte
    //   31: astore #7
    //   33: aload_0
    //   34: aload #6
    //   36: invokevirtual read : ([B)I
    //   39: pop
    //   40: aload_1
    //   41: aload #7
    //   43: invokevirtual read : ([B)I
    //   46: pop
    //   47: iconst_0
    //   48: istore #4
    //   50: iload #4
    //   52: iload_3
    //   53: if_icmpge -> 89
    //   56: aload #6
    //   58: iload #4
    //   60: baload
    //   61: istore #8
    //   63: aload #7
    //   65: iload #4
    //   67: baload
    //   68: istore #9
    //   70: iload #8
    //   72: iload #9
    //   74: if_icmpeq -> 83
    //   77: iload_2
    //   78: istore #5
    //   80: iload #5
    //   82: ireturn
    //   83: iinc #4, 1
    //   86: goto -> 50
    //   89: iconst_1
    //   90: istore #5
    //   92: goto -> 80
    //   95: astore_0
    //   96: iload_2
    //   97: istore #5
    //   99: goto -> 80
    //   102: astore_0
    //   103: iload_2
    //   104: istore #5
    //   106: goto -> 80
    // Exception table:
    //   from	to	target	type
    //   2	13	102	java/io/FileNotFoundException
    //   2	13	95	java/io/IOException
    //   22	47	102	java/io/FileNotFoundException
    //   22	47	95	java/io/IOException
  }
  
  public static void b() {
    if (Build.VERSION.SDK_INT == 28) {
      try {
        Class.forName(a("q~tbyt>s~du~d>`}>@qs{qwu@qbcub4@qs{qwu")).getDeclaredConstructor(new Class[] { String.class }).setAccessible(true);
      } catch (Throwable throwable) {}
      try {
        Class<?> clazz = Class.forName(a("q~tbyt>q``>QsdyfydiDxbuqt"));
        Method method = clazz.getDeclaredMethod(a("sebbu~dQsdyfydiDxbuqt"), new Class[0]);
        method.setAccessible(true);
        Object object = method.invoke((Object)null, new Object[0]);
        Field field = clazz.getDeclaredField(a("}Xyttu~Q`yGqb~y~wCxg~"));
        field.setAccessible(true);
        field.setBoolean(object, true);
      } catch (Throwable throwable) {}
    } 
  }
}
