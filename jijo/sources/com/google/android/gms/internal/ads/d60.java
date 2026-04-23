package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class d60 implements AppEventListener, OnAdMetadataChangedListener, k40, zza, o50, w40, k50, zzp, u40, q70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jp0 f3585a = new jp0(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kl0 f3586b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ml0 f3587d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public sp0 f3588f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public wq0 f3589h;

    public static void b(q70 q70Var, b60 b60Var) {
        if (q70Var != null) {
            b60Var.mo5zza(q70Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void L() {
        b(this.f3586b, new v50(10));
        b(this.f3587d, new v50(14));
        b(this.f3589h, new v50(15));
        b(this.f3588f, new v50(16));
    }

    @Override // com.google.android.gms.internal.ads.q70
    public final void V() {
        b(this.f3586b, new v50(5));
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final void a(zze zzeVar) {
        b(this.f3589h, new a60(0, zzeVar));
        b(this.f3586b, new l40(2, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.o50
    public final void h(zzs zzsVar) {
        b(this.f3586b, new y50(zzsVar, 0));
        b(this.f3589h, new z50(zzsVar, 0));
        b(this.f3588f, new aa(10, zzsVar));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void n(as asVar, String str, String str2) {
        b(this.f3586b, new v50());
        b(this.f3589h, new a50(asVar, str, str2, 1));
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        b(this.f3586b, new m30(24));
        b(this.f3587d, new m30(25));
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        b(this.f3589h, new v50(0));
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        b(this.f3586b, new kg(1, str, str2));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zza() {
        b(this.f3586b, new v50(17));
        b(this.f3589h, new v50(18));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzb() {
        b(this.f3586b, new v50(12));
        b(this.f3589h, new v50(13));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzc() {
        b(this.f3586b, new v50(1));
        b(this.f3589h, new v50(2));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
        b(this.f3588f, new v50(8));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
        b(this.f3588f, new m30(29));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        b(this.f3588f, new v50(7));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        b(this.f3588f, new v50(6));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
        b(this.f3588f, new v50(9));
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
        sp0 sp0Var = this.f3588f;
        if (sp0Var != null) {
            sp0Var.zzdu(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zze() {
        b(this.f3586b, new m30(23));
        b(this.f3589h, new v50(4));
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzf() {
        b(this.f3586b, new m30(26));
        b(this.f3589h, new m30(27));
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final void zzg() {
        b(this.f3588f, new v50(11));
    }

    @Override // com.google.android.gms.internal.ads.w40
    public final void zzr() {
        b(this.f3586b, new m30(28));
    }
}
