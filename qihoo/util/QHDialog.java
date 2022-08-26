package com.qihoo.util;

import android.content.Context;
import android.os.Build;

public class QHDialog {
  public static void showDialog(Context paramContext, String paramString) {
    synchronized (new Thread(new a(paramContext, paramString))) {
      null.start();
      if (Build.VERSION.SDK_INT >= 19) {
        null.wait();
      } else {
        Thread.sleep(3000L);
      } 
      return;
    } 
  }
}
