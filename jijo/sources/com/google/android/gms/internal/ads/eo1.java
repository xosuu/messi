package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class eo1 extends zn1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f4265e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4267d;

    public eo1(wv wvVar, Object obj, Object obj2) {
        super(wvVar);
        this.f4266c = obj;
        this.f4267d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.zn1, com.google.android.gms.internal.ads.wv
    public final int a(Object obj) {
        Object obj2;
        if (f4265e.equals(obj) && (obj2 = this.f4267d) != null) {
            obj = obj2;
        }
        return this.f11279b.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final vu d(int i10, vu vuVar, boolean z9) {
        this.f11279b.d(i10, vuVar, z9);
        if (yn0.c(vuVar.f9969b, this.f4267d) && z9) {
            vuVar.f9969b = f4265e;
        }
        return vuVar;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final hv e(int i10, hv hvVar, long j10) {
        this.f11279b.e(i10, hvVar, j10);
        if (yn0.c(hvVar.f5407a, this.f4266c)) {
            hvVar.f5407a = hv.f5405m;
        }
        return hvVar;
    }

    @Override // com.google.android.gms.internal.ads.zn1, com.google.android.gms.internal.ads.wv
    public final Object f(int i10) {
        Object objF = this.f11279b.f(i10);
        return yn0.c(objF, this.f4267d) ? f4265e : objF;
    }
}
