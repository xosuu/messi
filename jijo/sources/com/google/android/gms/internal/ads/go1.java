package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class go1 extends wn1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qn1 f5014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hv f5016m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vu f5017n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public eo1 f5018o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public do1 f5019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5022s;

    public go1(qn1 qn1Var, boolean z9) {
        boolean z10;
        this.f5014k = qn1Var;
        if (z9) {
            qn1Var.q();
            z10 = true;
        } else {
            z10 = false;
        }
        this.f5015l = z10;
        this.f5016m = new hv();
        this.f5017n = new vu();
        qn1Var.d();
        this.f5018o = new eo1(new fo1(qn1Var.c()), hv.f5405m, eo1.f4265e);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void a(io1 io1Var) {
        do1 do1Var = (do1) io1Var;
        io1 io1Var2 = do1Var.f3712f;
        if (io1Var2 != null) {
            qn1 qn1Var = do1Var.f3711d;
            qn1Var.getClass();
            qn1Var.a(io1Var2);
        }
        if (io1Var == this.f5019p) {
            this.f5019p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final fg c() {
        return this.f5014k.c();
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void d() {
        this.f5014k.d();
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void j(va1 va1Var) {
        this.f10256j = va1Var;
        int i10 = yn0.f10944a;
        Looper looperMyLooper = Looper.myLooper();
        tc1.A(looperMyLooper);
        this.f10255i = new Handler(looperMyLooper, null);
        if (this.f5015l) {
            return;
        }
        this.f5020q = true;
        t(null, this.f5014k);
    }

    @Override // com.google.android.gms.internal.ads.wn1, com.google.android.gms.internal.ads.qn1
    public final void m() {
        this.f5021r = false;
        this.f5020q = false;
        super.m();
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void p(fg fgVar) {
        if (this.f5022s) {
            eo1 eo1Var = this.f5018o;
            this.f5018o = new eo1(new wj1(this.f5018o.f11279b, fgVar), eo1Var.f4266c, eo1Var.f4267d);
        } else {
            this.f5018o = new eo1(new fo1(fgVar), hv.f5405m, eo1.f4265e);
        }
        this.f5014k.p(fgVar);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void q() {
        this.f5014k.q();
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void r() {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    @Override // com.google.android.gms.internal.ads.wn1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.Object r13, com.google.android.gms.internal.ads.qn1 r14, com.google.android.gms.internal.ads.wv r15) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.go1.s(java.lang.Object, com.google.android.gms.internal.ads.qn1, com.google.android.gms.internal.ads.wv):void");
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final /* bridge */ /* synthetic */ void u(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final /* synthetic */ void v(Object obj, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.wn1
    public final jo1 w(Object obj, jo1 jo1Var) {
        Object obj2 = this.f5018o.f4267d;
        Object obj3 = jo1Var.f6052a;
        if (obj2 != null && obj2.equals(obj3)) {
            obj3 = eo1.f4265e;
        }
        return jo1Var.a(obj3);
    }

    @Override // com.google.android.gms.internal.ads.qn1
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final do1 b(jo1 jo1Var, iq1 iq1Var, long j10) {
        do1 do1Var = new do1(jo1Var, iq1Var, j10);
        tc1.W(do1Var.f3711d == null);
        qn1 qn1Var = this.f5014k;
        do1Var.f3711d = qn1Var;
        if (this.f5021r) {
            Object obj = this.f5018o.f4267d;
            Object obj2 = jo1Var.f6052a;
            if (obj != null && obj2.equals(eo1.f4265e)) {
                obj2 = this.f5018o.f4267d;
            }
            do1Var.i(jo1Var.a(obj2));
        } else {
            this.f5019p = do1Var;
            if (!this.f5020q) {
                this.f5020q = true;
                t(null, qn1Var);
            }
        }
        return do1Var;
    }

    public final boolean y(long j10) {
        do1 do1Var = this.f5019p;
        int iA = this.f5018o.a(do1Var.f3709a.f6052a);
        if (iA == -1) {
            return false;
        }
        eo1 eo1Var = this.f5018o;
        vu vuVar = this.f5017n;
        eo1Var.d(iA, vuVar, false);
        long j11 = vuVar.f9971d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        do1Var.f3714q = j10;
        return true;
    }
}
