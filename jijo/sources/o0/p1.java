package o0;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class p1 extends o1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g0.c f16058n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g0.c f16059o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g0.c f16060p;

    public p1(t1 t1Var, WindowInsets windowInsets) {
        super(t1Var, windowInsets);
        this.f16058n = null;
        this.f16059o = null;
        this.f16060p = null;
    }

    @Override // o0.r1
    public g0.c g() {
        if (this.f16059o == null) {
            this.f16059o = g0.c.b(this.f16047c.getMandatorySystemGestureInsets());
        }
        return this.f16059o;
    }

    @Override // o0.r1
    public g0.c i() {
        if (this.f16058n == null) {
            this.f16058n = g0.c.b(this.f16047c.getSystemGestureInsets());
        }
        return this.f16058n;
    }

    @Override // o0.r1
    public g0.c k() {
        if (this.f16060p == null) {
            this.f16060p = g0.c.b(this.f16047c.getTappableElementInsets());
        }
        return this.f16060p;
    }

    @Override // o0.m1, o0.r1
    public t1 l(int i10, int i11, int i12, int i13) {
        return t1.h(this.f16047c.inset(i10, i11, i12, i13), null);
    }

    @Override // o0.n1, o0.r1
    public void q(g0.c cVar) {
    }
}
