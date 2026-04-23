package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes.dex */
public final class xp extends ck {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAd.UnconfirmedClickListener f10625a;

    public xp(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        super("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
        this.f10625a = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.dk
    public final void zze() {
        this.f10625a.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.dk
    public final void zzf(String str) {
        this.f10625a.onUnconfirmedClickReceived(str);
    }
}
