package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
public final class k6 implements h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6198b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6199d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f6200f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f6201h;

    public k6(t0 t0Var, jp0 jp0Var, byte[] bArr, c8.a[] aVarArr, int i10) {
        this.f6198b = t0Var;
        this.f6199d = jp0Var;
        this.f6200f = bArr;
        this.f6201h = aVarArr;
        this.f6197a = i10;
    }

    public final boolean a(k6 k6Var, int i10) {
        return k6Var != null && yn0.c(((zj1[]) this.f6198b)[i10], ((zj1[]) k6Var.f6198b)[i10]) && yn0.c(((cq1[]) this.f6199d)[i10], ((cq1[]) k6Var.f6199d)[i10]);
    }

    @Override // com.google.android.gms.internal.ads.h6
    public final void b(nn0 nn0Var, i0 i0Var, q2.d dVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0135 A[PHI: r22 r23
      0x0135: PHI (r22v3 java.lang.String) = (r22v2 java.lang.String), (r22v1 java.lang.String), (r22v1 java.lang.String) binds: [B:51:0x0126, B:44:0x0112, B:27:0x00e7] A[DONT_GENERATE, DONT_INLINE]
      0x0135: PHI (r23v3 int) = (r23v2 int), (r23v1 int), (r23v1 int) binds: [B:51:0x0126, B:44:0x0112, B:27:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ad  */
    @Override // com.google.android.gms.internal.ads.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.ik0 r32) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.k6.c(com.google.android.gms.internal.ads.ik0):void");
    }

    public final boolean d(int i10) {
        return ((zj1[]) this.f6198b)[i10] != null;
    }

    public k6(l6 l6Var, int i10) {
        this.f6201h = l6Var;
        this.f6198b = new d1(new byte[5], 5);
        this.f6199d = new SparseArray();
        this.f6200f = new SparseIntArray();
        this.f6197a = i10;
    }

    public k6(zj1[] zj1VarArr, cq1[] cq1VarArr, mz mzVar, qp0 qp0Var) {
        this.f6198b = zj1VarArr;
        this.f6199d = (cq1[]) cq1VarArr.clone();
        this.f6200f = mzVar;
        this.f6201h = qp0Var;
        this.f6197a = zj1VarArr.length;
    }
}
