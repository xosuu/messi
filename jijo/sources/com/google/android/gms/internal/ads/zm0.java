package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class zm0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f11277a;

    public zm0(ry ryVar) {
        this.f11277a = ryVar;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        VersionInfoParcel versionInfoParcelA = ((ry) this.f11277a).a();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new am0(versionInfoParcelA, muVar);
    }
}
