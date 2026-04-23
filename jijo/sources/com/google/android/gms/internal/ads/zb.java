package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzca;

/* JADX INFO: loaded from: classes.dex */
public final class zb extends zzca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppEventListener f11202a;

    public zb(AppEventListener appEventListener) {
        this.f11202a = appEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzc(String str, String str2) {
        this.f11202a.onAppEvent(str, str2);
    }
}
