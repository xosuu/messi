package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: loaded from: classes.dex */
public final class af0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f2673a;

    public af0(nh1 nh1Var) {
        this.f2673a = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.f2673a.zzb()).getApplicationInfo();
        tp1.b0(applicationInfo);
        return applicationInfo;
    }
}
