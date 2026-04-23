package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i60 implements s60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5508b;

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        ((AppEventListener) obj).onAppEvent(this.f5507a, this.f5508b);
    }
}
