package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: loaded from: classes.dex */
public final class sp extends nj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ up f8936a;

    @Override // com.google.android.gms.internal.ads.oj
    public final void l0(gj gjVar, String str) {
        vp vpVar;
        up upVar = this.f8936a;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener = upVar.f9557b;
        if (onCustomClickListener == null) {
            return;
        }
        synchronized (upVar) {
            vpVar = upVar.f9558c;
            if (vpVar == null) {
                vpVar = new vp(gjVar);
                upVar.f9558c = vpVar;
            }
        }
        onCustomClickListener.onCustomClick(vpVar, str);
    }
}
