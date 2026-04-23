package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l6 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik0 f6507b = new ik0(new byte[9400], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseIntArray f6508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c1.d f6509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a4 f6510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f6511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseBooleanArray f6512g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseBooleanArray f6513h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e6 f6514i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p1 f6515j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i0 f6516k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6517l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6518m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f6519n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6520o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f6521p;

    public l6(qz qzVar, nn0 nn0Var, c1.d dVar) {
        this.f6509d = dVar;
        this.f6510e = qzVar;
        this.f6506a = Collections.singletonList(nn0Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f6512g = sparseBooleanArray;
        this.f6513h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f6511f = sparseArray;
        this.f6508c = new SparseIntArray();
        this.f6514i = new e6(0);
        this.f6516k = i0.f5449i;
        this.f6521p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6511f.put(sparseArray2.keyAt(i10), (o6) sparseArray2.valueAt(i10));
        }
        this.f6511f.put(0, new i6(new m20(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r11, long r13) {
        /*
            r10 = this;
            java.util.List r11 = r10.f6506a
            int r12 = r11.size()
            r0 = 0
            r1 = 0
        L8:
            r2 = 0
            if (r1 >= r12) goto L35
            java.lang.Object r4 = r11.get(r1)
            com.google.android.gms.internal.ads.nn0 r4 = (com.google.android.gms.internal.ads.nn0) r4
            long r5 = r4.e()
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L2f
            long r5 = r4.d()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L32
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 == 0) goto L32
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 == 0) goto L32
        L2f:
            r4.f(r13)
        L32:
            int r1 = r1 + 1
            goto L8
        L35:
            int r11 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r11 == 0) goto L40
            com.google.android.gms.internal.ads.p1 r11 = r10.f6515j
            if (r11 == 0) goto L40
            r11.b(r13)
        L40:
            com.google.android.gms.internal.ads.ik0 r11 = r10.f6507b
            r11.f(r0)
            android.util.SparseIntArray r11 = r10.f6508c
            r11.clear()
        L4a:
            android.util.SparseArray r11 = r10.f6511f
            int r12 = r11.size()
            if (r0 >= r12) goto L5e
            java.lang.Object r11 = r11.valueAt(r0)
            com.google.android.gms.internal.ads.o6 r11 = (com.google.android.gms.internal.ads.o6) r11
            r11.zzc()
            int r0 = r0 + 1
            goto L4a
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l6.c(long, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a5  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v3 */
    @Override // com.google.android.gms.internal.ads.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(com.google.android.gms.internal.ads.h0 r31, com.google.android.gms.internal.ads.k0 r32) {
        /*
            Method dump skipped, instruction units count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l6.d(com.google.android.gms.internal.ads.h0, com.google.android.gms.internal.ads.k0):int");
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        this.f6516k = new ur0(i0Var, this.f6510e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(com.google.android.gms.internal.ads.h0 r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.ik0 r0 = r6.f6507b
            byte[] r0 = r0.f5633a
            com.google.android.gms.internal.ads.a0 r7 = (com.google.android.gms.internal.ads.a0) r7
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.m(r0, r1, r2, r1)
            r2 = 0
        Ld:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L29
            r3 = 0
        L12:
            r4 = 5
            if (r3 >= r4) goto L24
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L21
            int r2 = r2 + 1
            goto Ld
        L21:
            int r3 = r3 + 1
            goto L12
        L24:
            r7.j(r2)
            r7 = 1
            return r7
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l6.f(com.google.android.gms.internal.ads.h0):boolean");
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final /* synthetic */ g0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final List zzd() {
        zy0 zy0Var = bz0.f3132b;
        return wz0.f10382h;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void zzf() {
    }
}
