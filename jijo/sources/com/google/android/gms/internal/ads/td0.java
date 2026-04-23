package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class td0 extends ts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd0 f9129a;

    public td0(wd0 wd0Var) {
        this.f9129a = wd0Var;
    }

    @Override // com.google.android.gms.internal.ads.us
    public final void zze(int i10) {
        wd0 wd0Var = this.f9129a;
        jp0 jp0Var = wd0Var.f10157b;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("rewarded");
        tl0Var.f9185a = Long.valueOf(wd0Var.f10156a);
        tl0Var.f9187d = "onRewardedAdFailedToLoad";
        tl0Var.f9188f = Integer.valueOf(i10);
        jp0Var.L(tl0Var);
    }

    @Override // com.google.android.gms.internal.ads.us
    public final void zzf(zze zzeVar) {
        wd0 wd0Var = this.f9129a;
        jp0 jp0Var = wd0Var.f10157b;
        int i10 = zzeVar.zza;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("rewarded");
        tl0Var.f9185a = Long.valueOf(wd0Var.f10156a);
        tl0Var.f9187d = "onRewardedAdFailedToLoad";
        tl0Var.f9188f = Integer.valueOf(i10);
        jp0Var.L(tl0Var);
    }

    @Override // com.google.android.gms.internal.ads.us
    public final void zzg() {
        wd0 wd0Var = this.f9129a;
        jp0 jp0Var = wd0Var.f10157b;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("rewarded");
        tl0Var.f9185a = Long.valueOf(wd0Var.f10156a);
        tl0Var.f9187d = "onRewardedAdLoaded";
        jp0Var.L(tl0Var);
    }
}
