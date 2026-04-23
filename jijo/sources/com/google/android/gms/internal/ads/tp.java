package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: loaded from: classes.dex */
public final class tp extends qj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ up f9222a;

    @Override // com.google.android.gms.internal.ads.rj
    public final void k1(gj gjVar) {
        vp vpVar;
        up upVar = this.f9222a;
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener = upVar.f9556a;
        synchronized (upVar) {
            vpVar = upVar.f9558c;
            if (vpVar == null) {
                vpVar = new vp(gjVar);
                upVar.f9558c = vpVar;
            }
        }
        onCustomFormatAdLoadedListener.onCustomFormatAdLoaded(vpVar);
    }
}
