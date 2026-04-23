package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class o00 implements k40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fr0 f7444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ju f7445b;

    public o00(fr0 fr0Var, ju juVar) {
        this.f7444a = fr0Var;
        this.f7445b = juVar;
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void n(as asVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zza() {
        if (this.f7444a.f4635r0) {
            ju juVar = this.f7445b;
            synchronized (juVar.f6081a) {
                juVar.f6084d.f();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzf() {
    }
}
