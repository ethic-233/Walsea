package com.qihoo.util;

import android.app.ZygotePreload;
import android.content.pm.ApplicationInfo;
import android.os.Build;

public class AppZygotePreload implements ZygotePreload {
  public void doPreload(ApplicationInfo paramApplicationInfo) {
    if (Build.VERSION.SDK_INT >= 29)
      System.loadLibrary("jg_mc"); 
  }
}
