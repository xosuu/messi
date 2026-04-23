package com.google.android.gms.ads.internal.overlay;

import a4.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.gq;
import com.google.android.gms.internal.ads.q70;

/* JADX INFO: loaded from: classes.dex */
public final class zzz extends gq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdOverlayInfoParcel f2093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f2094b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2095d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2096f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2097h = false;

    public zzz(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f2093a = adOverlayInfoParcel;
        this.f2094b = activity;
    }

    public final synchronized void u1() {
        try {
            if (this.f2096f) {
                return;
            }
            zzp zzpVar = this.f2093a.zzc;
            if (zzpVar != null) {
                zzpVar.zzdu(4);
            }
            this.f2096f = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final boolean zzH() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzh(int i10, int i11, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzk(a aVar) {
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzl(Bundle bundle) {
        zzp zzpVar;
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.Y7)).booleanValue();
        Activity activity = this.f2094b;
        if (zBooleanValue && !this.f2097h) {
            activity.requestWindowFeature(1);
        }
        boolean z9 = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z9 = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2093a;
        if (adOverlayInfoParcel == null) {
            activity.finish();
            return;
        }
        if (z9) {
            activity.finish();
            return;
        }
        if (bundle == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            q70 q70Var = adOverlayInfoParcel.zzu;
            if (q70Var != null) {
                q70Var.L();
            }
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzpVar = adOverlayInfoParcel.zzc) != null) {
                zzpVar.zzdr();
            }
        }
        com.google.android.gms.ads.internal.zzu.zzh();
        zzc zzcVar = adOverlayInfoParcel.zza;
        if (zza.zzb(activity, zzcVar, adOverlayInfoParcel.zzi, zzcVar.zzi)) {
            return;
        }
        activity.finish();
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzm() {
        if (this.f2094b.isFinishing()) {
            u1();
        }
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzo() {
        zzp zzpVar = this.f2093a.zzc;
        if (zzpVar != null) {
            zzpVar.zzdk();
        }
        if (this.f2094b.isFinishing()) {
            u1();
        }
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzp(int i10, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzr() {
        if (this.f2095d) {
            this.f2094b.finish();
            return;
        }
        this.f2095d = true;
        zzp zzpVar = this.f2093a.zzc;
        if (zzpVar != null) {
            zzpVar.zzdH();
        }
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f2095d);
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzt() {
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzu() {
        if (this.f2094b.isFinishing()) {
            u1();
        }
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzv() {
        zzp zzpVar = this.f2093a.zzc;
        if (zzpVar != null) {
            zzpVar.zzdt();
        }
    }

    @Override // com.google.android.gms.internal.ads.hq
    public final void zzx() {
        this.f2097h = true;
    }
}
