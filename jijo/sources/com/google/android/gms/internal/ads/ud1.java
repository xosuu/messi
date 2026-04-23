package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ud1 implements ge1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd1 f9464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qz f9465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qz f9466c;

    public ud1(qz qzVar, rd1 rd1Var) {
        qz qzVar2 = qc1.f8157a;
        this.f9465b = qzVar;
        this.f9466c = qzVar2;
        this.f9464a = rd1Var;
    }

    @Override // com.google.android.gms.internal.ads.ge1
    public final int a(Object obj) {
        return ((wc1) obj).zzt.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.ge1
    public final void b(Object obj) {
        this.f9465b.k(obj);
        this.f9466c.getClass();
        fb1.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.ge1
    public final boolean c(Object obj, Object obj2) {
        return ((wc1) obj).zzt.equals(((wc1) obj2).zzt);
    }

    @Override // com.google.android.gms.internal.ads.ge1
    public final void d(Object obj, Object obj2) {
        he1.x(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.ge1
    public final void e(Object obj, jc1 jc1Var, pc1 pc1Var) {
        this.f9465b.zza(obj);
        fb1.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.ge1
    public final boolean f(Object obj) {
        fb1.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.ge1
    public final void g(Object obj, nc1 nc1Var) {
        fb1.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.ge1
    public final void h(Object obj, byte[] bArr, int i10, int i11, s7 s7Var) {
        wc1 wc1Var = (wc1) obj;
        if (wc1Var.zzt == ke1.f6268f) {
            wc1Var.zzt = ke1.b();
        }
        fb1.t(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.ge1
    public final int zza(Object obj) {
        ke1 ke1Var = ((wc1) obj).zzt;
        int i10 = ke1Var.f6272d;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < ke1Var.f6269a; i11++) {
            int i12 = ke1Var.f6270b[i11] >>> 3;
            ec1 ec1Var = (ec1) ke1Var.f6271c[i11];
            int iS0 = mc1.s0(8);
            int iS02 = mc1.s0(i12) + mc1.s0(16);
            int iS03 = mc1.s0(24);
            int iF = ec1Var.f();
            iE = fb1.e(iS0 + iS0, iS02, fb1.d(iF, iF, iS03), iE);
        }
        ke1Var.f6272d = iE;
        return iE;
    }

    @Override // com.google.android.gms.internal.ads.ge1
    public final wc1 zze() {
        rd1 rd1Var = this.f9464a;
        return rd1Var instanceof wc1 ? ((wc1) rd1Var).q() : ((uc1) ((wc1) rd1Var).x(5, null)).c();
    }
}
