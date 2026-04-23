package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.cd0;
import com.google.android.gms.internal.ads.v70;

/* JADX INFO: loaded from: classes.dex */
public final class zzm implements v70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd0 f2423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzl f2424b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2425d;

    public zzm(cd0 cd0Var, zzl zzlVar, String str) {
        this.f2423a = cd0Var;
        this.f2424b = zzlVar;
        this.f2425d = str;
    }

    @Override // com.google.android.gms.internal.ads.v70
    public final void zze(zzay zzayVar) {
        if (zzayVar == null) {
            return;
        }
        cd0 cd0Var = this.f2423a;
        this.f2424b.zzd(this.f2425d, zzayVar.zzb, cd0Var);
    }

    @Override // com.google.android.gms.internal.ads.v70
    public final void zzf(String str) {
    }
}
