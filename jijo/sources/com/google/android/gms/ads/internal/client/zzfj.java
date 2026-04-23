package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.VideoController;

/* JADX INFO: loaded from: classes.dex */
public final class zzfj extends zzds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VideoController.VideoLifecycleCallbacks f2050a;

    public zzfj(VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        this.f2050a = videoLifecycleCallbacks;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zze() {
        this.f2050a.onVideoEnd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzf(boolean z9) {
        this.f2050a.onVideoMute(z9);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzg() {
        this.f2050a.onVideoPause();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzh() {
        this.f2050a.onVideoPlay();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdt
    public final void zzi() {
        this.f2050a.onVideoStart();
    }
}
