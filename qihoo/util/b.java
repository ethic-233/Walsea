package com.qihoo.util;

import android.content.DialogInterface;
import android.os.Build;

final class b implements DialogInterface.OnClickListener {
  b(a parama) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt) {
    synchronized (Thread.currentThread()) {
      if (Build.VERSION.SDK_INT >= 19)
        null.notify(); 
      return;
    } 
  }
}
