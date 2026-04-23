package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.internal.ads.ks0;
import com.google.android.gms.internal.ads.px0;
import com.google.android.gms.internal.ads.vq0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class zzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ks0 f2110a = new ks0(new vq0(0));

    public static String a(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        return str + " @" + stackTrace[3].getLineNumber();
    }

    public static void zze(String str) {
        if (!zzm(3) || str == null || str.length() <= 4000) {
            return;
        }
        ks0 ks0Var = f2110a;
        Iterator itF = ((px0) ks0Var.f6384a).f(ks0Var, str);
        while (itF.hasNext()) {
        }
    }

    public static void zzf(String str, Throwable th) {
        zzm(3);
    }

    public static void zzg(String str) {
        if (!zzm(6) || str == null || str.length() <= 4000) {
            return;
        }
        ks0 ks0Var = f2110a;
        Iterator itF = ((px0) ks0Var.f6384a).f(ks0Var, str);
        while (itF.hasNext()) {
        }
    }

    public static void zzh(String str, Throwable th) {
        zzm(6);
    }

    public static void zzi(String str) {
        if (!zzm(4) || str == null || str.length() <= 4000) {
            return;
        }
        ks0 ks0Var = f2110a;
        Iterator itF = ((px0) ks0Var.f6384a).f(ks0Var, str);
        while (itF.hasNext()) {
        }
    }

    public static void zzj(String str) {
        if (!zzm(5) || str == null || str.length() <= 4000) {
            return;
        }
        ks0 ks0Var = f2110a;
        Iterator itF = ((px0) ks0Var.f6384a).f(ks0Var, str);
        while (itF.hasNext()) {
        }
    }

    public static void zzk(String str, Throwable th) {
        zzm(5);
    }

    public static void zzl(String str, Throwable th) {
        if (zzm(5)) {
            if (th != null) {
                zzk(a(str), th);
            } else {
                zzj(a(str));
            }
        }
    }

    public static boolean zzm(int i10) {
        return i10 >= 5 || Log.isLoggable("Ads", i10);
    }
}
