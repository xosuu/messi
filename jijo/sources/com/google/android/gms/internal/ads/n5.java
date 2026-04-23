package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class n5 implements p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik0 f7144a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f7148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b1 f7149f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7152i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7153j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y1 f7154k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7155l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7156m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7150g = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f7159p = -9223372036854775807L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f7145b = new AtomicInteger();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7157n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7158o = -1;

    public n5(String str, int i10, int i11) {
        this.f7144a = new ik0(new byte[i11]);
        this.f7146c = str;
        this.f7147d = i10;
    }

    public final void a(e0 e0Var) {
        int i10;
        int i11 = e0Var.f3781b;
        if (i11 == -2147483647 || (i10 = e0Var.f3782c) == -1) {
            return;
        }
        y1 y1Var = this.f7154k;
        String str = e0Var.f3780a;
        if (y1Var != null && i10 == y1Var.f10727z && i11 == y1Var.A && yn0.c(str, y1Var.f10714m)) {
            return;
        }
        y1 y1Var2 = this.f7154k;
        q0 q0Var = y1Var2 == null ? new q0() : new q0(y1Var2);
        q0Var.f8041a = this.f7148e;
        q0Var.f(str);
        q0Var.f8065y = i10;
        q0Var.f8066z = i11;
        q0Var.f8044d = this.f7146c;
        q0Var.f8046f = this.f7147d;
        y1 y1Var3 = new y1(q0Var);
        this.f7154k = y1Var3;
        this.f7149f.c(y1Var3);
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void b(boolean z9) {
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x049c  */
    @Override // com.google.android.gms.internal.ads.p5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.ik0 r36) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instruction units count: 1365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.n5.c(com.google.android.gms.internal.ads.ik0):void");
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void d(i0 i0Var, q2.d dVar) {
        dVar.c();
        dVar.d();
        this.f7148e = dVar.f16416e;
        dVar.d();
        this.f7149f = i0Var.j(dVar.f16414c, 1);
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void e(int i10, long j10) {
        this.f7159p = j10;
    }

    public final boolean f(ik0 ik0Var, byte[] bArr, int i10) {
        int iMin = Math.min(ik0Var.n(), i10 - this.f7151h);
        ik0Var.e(this.f7151h, bArr, iMin);
        int i11 = this.f7151h + iMin;
        this.f7151h = i11;
        return i11 == i10;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void zze() {
        this.f7150g = 0;
        this.f7151h = 0;
        this.f7152i = 0;
        this.f7159p = -9223372036854775807L;
        this.f7145b.set(0);
    }
}
