package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzfd extends zzdc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnAdMetadataChangedListener f2048a;

    public zzfd(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f2048a = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.f2048a;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
