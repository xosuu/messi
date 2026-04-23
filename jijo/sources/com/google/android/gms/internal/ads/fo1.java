package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class fo1 extends wv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg f4586b;

    public fo1(fg fgVar) {
        this.f4586b = fgVar;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int a(Object obj) {
        return obj == eo1.f4265e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final vu d(int i10, vu vuVar, boolean z9) {
        Integer num = z9 ? 0 : null;
        Object obj = z9 ? eo1.f4265e : null;
        zc zcVar = zc.f11204b;
        vuVar.b(num, obj, 0, -9223372036854775807L, true);
        return vuVar;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final hv e(int i10, hv hvVar, long j10) {
        Object obj = hv.f5405m;
        hvVar.a(this.f4586b, false, true, null, -9223372036854775807L);
        hvVar.f5415i = true;
        return hvVar;
    }

    @Override // com.google.android.gms.internal.ads.wv
    public final Object f(int i10) {
        return eo1.f4265e;
    }
}
