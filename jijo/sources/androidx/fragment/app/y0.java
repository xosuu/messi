package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements androidx.lifecycle.h, q1.f, androidx.lifecycle.o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.n0 f928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.lifecycle.s f929b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q1.e f930d = null;

    public y0(androidx.lifecycle.n0 n0Var) {
        this.f928a = n0Var;
    }

    @Override // q1.f
    public final q1.d a() {
        c();
        return this.f930d.f16385b;
    }

    public final void b(androidx.lifecycle.k kVar) {
        this.f929b.e(kVar);
    }

    public final void c() {
        if (this.f929b == null) {
            this.f929b = new androidx.lifecycle.s(this);
            this.f930d = new q1.e(this);
        }
    }

    @Override // androidx.lifecycle.h
    public final c1.b d() {
        return c1.a.f1497b;
    }

    @Override // androidx.lifecycle.o0
    public final androidx.lifecycle.n0 f() {
        c();
        return this.f928a;
    }

    @Override // androidx.lifecycle.q
    public final androidx.lifecycle.s h() {
        c();
        return this.f929b;
    }
}
