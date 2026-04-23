package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f7522a = Log.isLoggable("Volley", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f7523b = o7.class.getName();

    public static void a(String str, Object... objArr) {
        if (f7522a) {
            b(str, objArr);
        }
    }

    public static void b(String str, Object... objArr) {
        String strX;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                strX = "<unknown>";
                break;
            } else {
                if (!stackTrace[i10].getClassName().equals(f7523b)) {
                    String className = stackTrace[i10].getClassName();
                    String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                    strX = fb1.x(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".", stackTrace[i10].getMethodName());
                    break;
                }
                i10++;
            }
        }
        String.format(Locale.US, "[%d] %s: %s", Long.valueOf(Thread.currentThread().getId()), strX, str2);
    }
}
