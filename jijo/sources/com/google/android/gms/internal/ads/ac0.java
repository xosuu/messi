package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class ac0 implements fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b50 f2653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbvz f2654b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2655d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2656f;

    public ac0(b50 b50Var, fr0 fr0Var) {
        this.f2653a = b50Var;
        this.f2654b = fr0Var.f4622l;
        this.f2655d = fr0Var.f4618j;
        this.f2656f = fr0Var.f4620k;
    }

    @Override // com.google.android.gms.internal.ads.fl
    public final void e0(zzbvz zzbvzVar) {
        int i10;
        String str;
        zzbvz zzbvzVar2 = this.f2654b;
        if (zzbvzVar2 != null) {
            zzbvzVar = zzbvzVar2;
        }
        if (zzbvzVar != null) {
            str = zzbvzVar.f11589a;
            i10 = zzbvzVar.f11590b;
        } else {
            i10 = 1;
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        yr yrVar = new yr(str, i10);
        b50 b50Var = this.f2653a;
        b50Var.getClass();
        b50Var.I0(new a50(yrVar, this.f2655d, this.f2656f, 0));
    }

    @Override // com.google.android.gms.internal.ads.fl
    public final void zzb() {
        this.f2653a.zze();
    }

    @Override // com.google.android.gms.internal.ads.fl
    public final void zzc() {
        b50 b50Var = this.f2653a;
        b50Var.getClass();
        b50Var.I0(new m30(11));
    }
}
