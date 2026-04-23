package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: loaded from: classes.dex */
public final class tm extends f.h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9191c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wm f9192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9193e;

    public tm(wm wmVar) {
        this.f9192d = wmVar;
    }

    public final void o() {
        zze.zza("release: Trying to acquire lock");
        synchronized (this.f9191c) {
            try {
                zze.zza("release: Lock acquired");
                if (this.f9193e) {
                    zze.zza("release: Lock already released");
                    return;
                }
                this.f9193e = true;
                n(new pe(8, 0), new pe(22));
                n(new um(this), new i10(7, this));
                zze.zza("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
