package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f6120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.text.v f6121b = new androidx.emoji2.text.v(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dn0 f6122c = new dn0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dn0 f6123d = new dn0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final iq1 f6124e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e10 f6125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e10 f6126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f6127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6128i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final mx0 f6129j;

    public k(mx0 mx0Var, e eVar) {
        this.f6129j = mx0Var;
        this.f6120a = eVar;
        iq1 iq1Var = new iq1();
        int i10 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i10 = iHighestOneBit + iHighestOneBit;
        }
        iq1Var.f5675a = 0;
        iq1Var.f5676b = 0;
        iq1Var.f5677c = new long[i10];
        iq1Var.f5678d = i10 - 1;
        this.f6124e = iq1Var;
        this.f6126g = e10.f3801d;
        this.f6128i = -9223372036854775807L;
    }

    public static Object b(dn0 dn0Var) {
        int i10;
        synchronized (dn0Var) {
            i10 = dn0Var.f3706d;
        }
        tc1.K(i10 > 0);
        while (dn0Var.a() > 1) {
            dn0Var.b();
        }
        Object objB = dn0Var.b();
        objB.getClass();
        return objB;
    }

    public final void a() {
        int i10;
        iq1 iq1Var = this.f6124e;
        iq1Var.f5675a = 0;
        iq1Var.f5676b = 0;
        this.f6128i = -9223372036854775807L;
        dn0 dn0Var = this.f6123d;
        synchronized (dn0Var) {
            i10 = dn0Var.f3706d;
        }
        if (i10 > 0) {
            dn0Var.d(0L, Long.valueOf(((Long) b(dn0Var)).longValue()));
        }
        e10 e10Var = this.f6125f;
        dn0 dn0Var2 = this.f6122c;
        if (e10Var != null) {
            dn0Var2.e();
        } else if (dn0Var2.a() > 0) {
            this.f6125f = (e10) b(dn0Var2);
        }
    }
}
