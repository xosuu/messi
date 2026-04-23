package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class gp implements zzp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbre f5023a;

    public gp(zzbre zzbreVar) {
        this.f5023a = zzbreVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
        zzm.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
        zzm.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        zzm.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        zzm.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbre zzbreVar = this.f5023a;
        zzbreVar.f11518b.onAdOpened(zzbreVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
        zzm.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbre zzbreVar = this.f5023a;
        zzbreVar.f11518b.onAdClosed(zzbreVar);
    }
}
