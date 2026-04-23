package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11110e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f11116k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11117l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f11120o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f11121p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u4 f11123r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11111f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11112g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11113h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11114i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11115j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11118m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11119n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11122q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f11124s = Float.MAX_VALUE;

    public final String a() {
        return this.f11117l;
    }

    public final void b(z4 z4Var) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (z4Var != null) {
            if (!this.f11108c && z4Var.f11108c) {
                this.f11107b = z4Var.f11107b;
                this.f11108c = true;
            }
            if (this.f11113h == -1) {
                this.f11113h = z4Var.f11113h;
            }
            if (this.f11114i == -1) {
                this.f11114i = z4Var.f11114i;
            }
            if (this.f11106a == null && (str = z4Var.f11106a) != null) {
                this.f11106a = str;
            }
            if (this.f11111f == -1) {
                this.f11111f = z4Var.f11111f;
            }
            if (this.f11112g == -1) {
                this.f11112g = z4Var.f11112g;
            }
            if (this.f11119n == -1) {
                this.f11119n = z4Var.f11119n;
            }
            if (this.f11120o == null && (alignment2 = z4Var.f11120o) != null) {
                this.f11120o = alignment2;
            }
            if (this.f11121p == null && (alignment = z4Var.f11121p) != null) {
                this.f11121p = alignment;
            }
            if (this.f11122q == -1) {
                this.f11122q = z4Var.f11122q;
            }
            if (this.f11115j == -1) {
                this.f11115j = z4Var.f11115j;
                this.f11116k = z4Var.f11116k;
            }
            if (this.f11123r == null) {
                this.f11123r = z4Var.f11123r;
            }
            if (this.f11124s == Float.MAX_VALUE) {
                this.f11124s = z4Var.f11124s;
            }
            if (!this.f11110e && z4Var.f11110e) {
                this.f11109d = z4Var.f11109d;
                this.f11110e = true;
            }
            if (this.f11118m != -1 || (i10 = z4Var.f11118m) == -1) {
                return;
            }
            this.f11118m = i10;
        }
    }
}
