package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;

/* JADX INFO: loaded from: classes.dex */
public final class hx implements zzp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx f5430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzp f5431b;

    public hx(fx fxVar, zzp zzpVar) {
        this.f5430a = fxVar;
        this.f5431b = zzpVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        zzp zzpVar = this.f5431b;
        if (zzpVar != null) {
            zzpVar.zzdq();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        zzp zzpVar = this.f5431b;
        if (zzpVar != null) {
            zzpVar.zzdr();
        }
        this.f5430a.zzaa();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        zzp zzpVar = this.f5431b;
        if (zzpVar != null) {
            zzpVar.zzdt();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
        zzp zzpVar = this.f5431b;
        if (zzpVar != null) {
            zzpVar.zzdu(i10);
        }
        this.f5430a.zzY();
    }
}
