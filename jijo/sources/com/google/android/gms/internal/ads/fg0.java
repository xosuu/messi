package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes.dex */
public abstract class fg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f4523a = new Object();

    public static void a(String str, Throwable th) {
        String strReplace;
        String str2;
        if (th == null) {
            str2 = null;
        } else {
            synchronized (f4523a) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } finally {
                    }
                }
            }
            str2 = strReplace;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        str2.replace("\n", "\n  ");
    }

    public static void b(String str) {
        synchronized (f4523a) {
            a(str, null);
        }
    }

    public static void c(String str) {
        synchronized (f4523a) {
            a(str, null);
        }
    }

    public static void d(String str, Throwable th) {
        synchronized (f4523a) {
            a(str, th);
        }
    }

    public static void e(String str) {
        synchronized (f4523a) {
            a(str, null);
        }
    }

    public static void f(String str) {
        synchronized (f4523a) {
            a(str, null);
        }
    }

    public static void g(String str, Throwable th) {
        synchronized (f4523a) {
            a(str, th);
        }
    }
}
