package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzaa;
import com.google.android.gms.ads.internal.overlay.zzp;

/* JADX INFO: loaded from: classes.dex */
public class ob0 implements zza, pk, zzp, qk, zzaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zza f7549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public pk f7550b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzp f7551d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public qk f7552f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzaa f7553h;

    @Override // com.google.android.gms.internal.ads.qk
    public final synchronized void a(String str, String str2) {
        qk qkVar = this.f7552f;
        if (qkVar != null) {
            qkVar.a(str, str2);
        }
    }

    public final synchronized void b(j40 j40Var, i50 i50Var, l50 l50Var, j60 j60Var, pb0 pb0Var) {
        this.f7549a = j40Var;
        this.f7550b = i50Var;
        this.f7551d = l50Var;
        this.f7552f = j60Var;
        this.f7553h = pb0Var;
    }

    @Override // com.google.android.gms.internal.ads.pk
    public final synchronized void n(Bundle bundle, String str) {
        pk pkVar = this.f7550b;
        if (pkVar != null) {
            pkVar.n(bundle, str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zza zzaVar = this.f7549a;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdH() {
        zzp zzpVar = this.f7551d;
        if (zzpVar != null) {
            zzpVar.zzdH();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdk() {
        zzp zzpVar = this.f7551d;
        if (zzpVar != null) {
            zzpVar.zzdk();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdq() {
        zzp zzpVar = this.f7551d;
        if (zzpVar != null) {
            zzpVar.zzdq();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdr() {
        zzp zzpVar = this.f7551d;
        if (zzpVar != null) {
            zzpVar.zzdr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdt() {
        zzp zzpVar = this.f7551d;
        if (zzpVar != null) {
            zzpVar.zzdt();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final synchronized void zzdu(int i10) {
        zzp zzpVar = this.f7551d;
        if (zzpVar != null) {
            zzpVar.zzdu(i10);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final synchronized void zzg() {
        zzaa zzaaVar = this.f7553h;
        if (zzaaVar != null) {
            zzaaVar.zzg();
        }
    }
}
