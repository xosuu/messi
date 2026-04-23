package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qp1 extends yp1 implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8256h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f8257q;

    public qp1(int i10, ow owVar, int i11, up1 up1Var, int i12) {
        super(i10, owVar, i11);
        this.f8256h = tp1.O(i12, up1Var.f9567q) ? 1 : 0;
        this.f8257q = this.f11003f.a();
    }

    @Override // com.google.android.gms.internal.ads.yp1
    public final int a() {
        return this.f8256h;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f8257q, ((qp1) obj).f8257q);
    }

    @Override // com.google.android.gms.internal.ads.yp1
    public final /* bridge */ /* synthetic */ boolean d(yp1 yp1Var) {
        return false;
    }
}
