package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ky implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy f6412a;

    public ky(hy hyVar) {
        this.f6412a = hyVar;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        WeakReference weakReference = this.f6412a.f5435d;
        tp1.b0(weakReference);
        return weakReference;
    }
}
