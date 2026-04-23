package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class nc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mc1 f7244a;

    public nc1(mc1 mc1Var) {
        Charset charset = ed1.f3910a;
        if (mc1Var == null) {
            throw new NullPointerException("output");
        }
        this.f7244a = mc1Var;
        mc1Var.f6902c = this;
    }

    public final void a(int i10, int i11) {
        this.f7244a.H0(i10, (i11 >> 31) ^ (i11 + i11));
    }

    public final void b(int i10, long j10) {
        this.f7244a.J0(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void c(int i10, int i11) {
        this.f7244a.H0(i10, i11);
    }

    public final void d(int i10, long j10) {
        this.f7244a.J0(i10, j10);
    }

    public final void e(int i10, boolean z9) {
        this.f7244a.w0(i10, z9);
    }

    public final void f(int i10, ec1 ec1Var) {
        this.f7244a.x0(i10, ec1Var);
    }

    public final void g(int i10, double d10) {
        this.f7244a.A0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void h(int i10, int i11) {
        this.f7244a.C0(i10, i11);
    }

    public final void i(int i10, int i11) {
        this.f7244a.y0(i10, i11);
    }

    public final void j(int i10, long j10) {
        this.f7244a.A0(i10, j10);
    }

    public final void k(int i10, float f10) {
        this.f7244a.y0(i10, Float.floatToRawIntBits(f10));
    }

    public final void l(int i10, ge1 ge1Var, Object obj) {
        mc1 mc1Var = this.f7244a;
        mc1Var.G0(i10, 3);
        ge1Var.g((rd1) obj, mc1Var.f6902c);
        mc1Var.G0(i10, 4);
    }

    public final void m(int i10, int i11) {
        this.f7244a.C0(i10, i11);
    }

    public final void n(int i10, long j10) {
        this.f7244a.J0(i10, j10);
    }

    public final void o(int i10, ge1 ge1Var, Object obj) {
        this.f7244a.E0(i10, (rd1) obj, ge1Var);
    }

    public final void p(int i10, int i11) {
        this.f7244a.y0(i10, i11);
    }

    public final void q(int i10, long j10) {
        this.f7244a.A0(i10, j10);
    }
}
