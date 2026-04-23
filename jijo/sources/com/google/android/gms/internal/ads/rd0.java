package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbg;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class rd0 extends zzbg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jp0 f8580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sd0 f8581b;

    public rd0(sd0 sd0Var, jp0 jp0Var) {
        this.f8580a = jp0Var;
        this.f8581b = sd0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() {
        long j10 = this.f8581b.f8844a;
        jp0 jp0Var = this.f8580a;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("interstitial");
        tl0Var.f9185a = Long.valueOf(j10);
        tl0Var.f9187d = "onAdClicked";
        ((jl) jp0Var.f6060b).zzb(tl0.e(tl0Var));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() {
        long j10 = this.f8581b.f8844a;
        jp0 jp0Var = this.f8580a;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("interstitial");
        tl0Var.f9185a = Long.valueOf(j10);
        tl0Var.f9187d = "onAdClosed";
        jp0Var.L(tl0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i10) {
        long j10 = this.f8581b.f8844a;
        jp0 jp0Var = this.f8580a;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("interstitial");
        tl0Var.f9185a = Long.valueOf(j10);
        tl0Var.f9187d = "onAdFailedToLoad";
        tl0Var.f9188f = Integer.valueOf(i10);
        jp0Var.L(tl0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(zze zzeVar) {
        long j10 = this.f8581b.f8844a;
        int i10 = zzeVar.zza;
        jp0 jp0Var = this.f8580a;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("interstitial");
        tl0Var.f9185a = Long.valueOf(j10);
        tl0Var.f9187d = "onAdFailedToLoad";
        tl0Var.f9188f = Integer.valueOf(i10);
        jp0Var.L(tl0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        long j10 = this.f8581b.f8844a;
        jp0 jp0Var = this.f8580a;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("interstitial");
        tl0Var.f9185a = Long.valueOf(j10);
        tl0Var.f9187d = "onAdLoaded";
        jp0Var.L(tl0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        long j10 = this.f8581b.f8844a;
        jp0 jp0Var = this.f8580a;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("interstitial");
        tl0Var.f9185a = Long.valueOf(j10);
        tl0Var.f9187d = "onAdOpened";
        jp0Var.L(tl0Var);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
    }
}
