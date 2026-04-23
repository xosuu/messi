package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class ud0 extends ps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wd0 f9463a;

    public ud0(wd0 wd0Var) {
        this.f9463a = wd0Var;
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void G0(zze zzeVar) {
        wd0 wd0Var = this.f9463a;
        jp0 jp0Var = wd0Var.f10157b;
        int i10 = zzeVar.zza;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("rewarded");
        tl0Var.f9185a = Long.valueOf(wd0Var.f10156a);
        tl0Var.f9187d = "onRewardedAdFailedToShow";
        tl0Var.f9188f = Integer.valueOf(i10);
        jp0Var.L(tl0Var);
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void Z(ks ksVar) {
        wd0 wd0Var = this.f9463a;
        jp0 jp0Var = wd0Var.f10157b;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("rewarded");
        tl0Var.f9185a = Long.valueOf(wd0Var.f10156a);
        tl0Var.f9187d = "onUserEarnedReward";
        tl0Var.f9189h = ksVar.zzf();
        tl0Var.f9190q = Integer.valueOf(ksVar.zze());
        jp0Var.L(tl0Var);
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void f(int i10) {
        wd0 wd0Var = this.f9463a;
        jp0 jp0Var = wd0Var.f10157b;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("rewarded");
        tl0Var.f9185a = Long.valueOf(wd0Var.f10156a);
        tl0Var.f9187d = "onRewardedAdFailedToShow";
        tl0Var.f9188f = Integer.valueOf(i10);
        jp0Var.L(tl0Var);
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void zze() {
        wd0 wd0Var = this.f9463a;
        jp0 jp0Var = wd0Var.f10157b;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("rewarded");
        tl0Var.f9185a = Long.valueOf(wd0Var.f10156a);
        tl0Var.f9187d = "onAdClicked";
        jp0Var.L(tl0Var);
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void zzf() {
        wd0 wd0Var = this.f9463a;
        jp0 jp0Var = wd0Var.f10157b;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("rewarded");
        tl0Var.f9185a = Long.valueOf(wd0Var.f10156a);
        tl0Var.f9187d = "onAdImpression";
        jp0Var.L(tl0Var);
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void zzg() {
        wd0 wd0Var = this.f9463a;
        jp0 jp0Var = wd0Var.f10157b;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("rewarded");
        tl0Var.f9185a = Long.valueOf(wd0Var.f10156a);
        tl0Var.f9187d = "onRewardedAdClosed";
        jp0Var.L(tl0Var);
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void zzj() {
        wd0 wd0Var = this.f9463a;
        jp0 jp0Var = wd0Var.f10157b;
        jp0Var.getClass();
        tl0 tl0Var = new tl0("rewarded");
        tl0Var.f9185a = Long.valueOf(wd0Var.f10156a);
        tl0Var.f9187d = "onRewardedAdOpened";
        jp0Var.L(tl0Var);
    }
}
