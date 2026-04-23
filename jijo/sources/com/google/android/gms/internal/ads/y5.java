package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class y5 implements p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j6 f10770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b1 f10772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x5 f10773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10774e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10781l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f10775f = new boolean[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m1.v f10776g = new m1.v(32);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m1.v f10777h = new m1.v(33);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m1.v f10778i = new m1.v(34);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m1.v f10779j = new m1.v(39);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final m1.v f10780k = new m1.v(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10782m = -9223372036854775807L;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ik0 f10783n = new ik0();

    public y5(j6 j6Var) {
        this.f10770a = j6Var;
    }

    public final void a(int i10, byte[] bArr, int i11) {
        x5 x5Var = this.f10773d;
        if (x5Var.f10434f) {
            int i12 = x5Var.f10432d;
            int i13 = (i10 + 2) - i12;
            if (i13 < i11) {
                x5Var.f10435g = (bArr[i13] & 128) != 0;
                x5Var.f10434f = false;
            } else {
                x5Var.f10432d = (i11 - i10) + i12;
            }
        }
        if (!this.f10774e) {
            this.f10776g.e(i10, bArr, i11);
            this.f10777h.e(i10, bArr, i11);
            this.f10778i.e(i10, bArr, i11);
        }
        this.f10779j.e(i10, bArr, i11);
        this.f10780k.e(i10, bArr, i11);
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void b(boolean z9) {
        tc1.A(this.f10772c);
        int i10 = yn0.f10944a;
        if (z9) {
            x5 x5Var = this.f10773d;
            long j10 = this.f10781l;
            x5Var.f10441m = x5Var.f10431c;
            x5Var.a((int) (j10 - x5Var.f10430b));
            x5Var.f10439k = x5Var.f10430b;
            x5Var.f10430b = j10;
            x5Var.a(0);
            x5Var.f10437i = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0215 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.p5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.ik0 r38) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y5.c(com.google.android.gms.internal.ads.ik0):void");
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void d(i0 i0Var, q2.d dVar) {
        dVar.c();
        dVar.d();
        this.f10771b = dVar.f16416e;
        dVar.d();
        b1 b1VarJ = i0Var.j(dVar.f16414c, 2);
        this.f10772c = b1VarJ;
        this.f10773d = new x5(b1VarJ);
        this.f10770a.b(i0Var, dVar);
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void e(int i10, long j10) {
        this.f10782m = j10;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void zze() {
        this.f10781l = 0L;
        this.f10782m = -9223372036854775807L;
        ds0.e(this.f10775f);
        this.f10776g.f();
        this.f10777h.f();
        this.f10778i.f();
        this.f10779j.f();
        this.f10780k.f();
        x5 x5Var = this.f10773d;
        if (x5Var != null) {
            x5Var.f10434f = false;
            x5Var.f10435g = false;
            x5Var.f10436h = false;
            x5Var.f10437i = false;
            x5Var.f10438j = false;
        }
    }
}
