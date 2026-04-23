package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class df0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f3643a;

    public df0(jy jyVar) {
        this.f3643a = jyVar;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        String packageName = ((jy) this.f3643a).a().getPackageName();
        tp1.b0(packageName);
        return packageName;
    }
}
