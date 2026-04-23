package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.MuteThisAdListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzct extends zzcr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MuteThisAdListener f1976a;

    public zzct(MuteThisAdListener muteThisAdListener) {
        this.f1976a = muteThisAdListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcs
    public final void zze() {
        this.f1976a.onAdMuted();
    }
}
