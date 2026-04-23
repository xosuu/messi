package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class k60 implements u50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6203b;

    @Override // com.google.android.gms.internal.ads.u50
    public final void J(zzbvb zzbvbVar) {
    }

    public final synchronized int a() {
        return this.f6202a;
    }

    @Override // com.google.android.gms.internal.ads.u50
    public final synchronized void b(kr0 kr0Var) {
        if (((Boolean) zzba.zzc().a(eg.Y0)).booleanValue()) {
            try {
                hr0 hr0Var = (hr0) kr0Var.f6383b.f10631d;
                this.f6202a = hr0Var.f5372c;
                this.f6203b = hr0Var.f5373d;
            } catch (NullPointerException unused) {
            }
        }
    }
}
