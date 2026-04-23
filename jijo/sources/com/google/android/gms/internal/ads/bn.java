package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3062a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3063b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fn f3064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fn f3065d;

    public final fn a(Context context, VersionInfoParcel versionInfoParcel, gt0 gt0Var) {
        fn fnVar;
        synchronized (this.f3062a) {
            try {
                if (this.f3064c == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f3064c = new fn(context, versionInfoParcel, (String) zzba.zzc().a(eg.f3933a), gt0Var);
                }
                fnVar = this.f3064c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fnVar;
    }

    public final fn b(Context context, VersionInfoParcel versionInfoParcel, gt0 gt0Var) {
        fn fnVar;
        synchronized (this.f3063b) {
            try {
                if (this.f3065d == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    this.f3065d = new fn(context, versionInfoParcel, (String) vh.f9844a.k(), gt0Var);
                }
                fnVar = this.f3065d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fnVar;
    }
}
