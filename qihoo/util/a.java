package com.qihoo.util;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Looper;

final class a implements Runnable {
  a(Context paramContext, String paramString) {}
  
  public final void run() {
    Looper.prepare();
    AlertDialog alertDialog = (new AlertDialog.Builder(this.a)).setMessage(this.b).setCancelable(false).setPositiveButton("确定", new b(this)).create();
    alertDialog.getWindow().setType(2005);
    alertDialog.show();
    Looper.loop();
  }
}
