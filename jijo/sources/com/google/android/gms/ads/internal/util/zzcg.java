package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.webkit.WebSettings;
import java.util.concurrent.atomic.AtomicBoolean;
import s3.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzcg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static zzcg f2163b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2164a;

    public static zzcg zza() {
        if (f2163b == null) {
            f2163b = new zzcg();
        }
        return f2163b;
    }

    public final void zzb(Context context) {
        Context contextCreatePackageContext;
        zze.zza("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(this.f2164a)) {
            AtomicBoolean atomicBoolean = f.f16689a;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context)).apply();
            }
            this.f2164a = defaultUserAgent;
        }
        zze.zza("User agent is updated.");
    }
}
