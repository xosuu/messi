package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class bz implements w30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zy f3127b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qq0 f3128d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public cq0 f3129f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u60 f3130h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z30 f3131q;

    public /* synthetic */ bz(zy zyVar, int i10) {
        this.f3126a = i10;
        this.f3127b = zyVar;
    }

    public final /* synthetic */ w30 a(cq0 cq0Var) {
        switch (this.f3126a) {
            case 0:
                this.f3129f = cq0Var;
                break;
            default:
                this.f3129f = cq0Var;
                break;
        }
        return this;
    }

    public final /* synthetic */ w30 b(qq0 qq0Var) {
        switch (this.f3126a) {
            case 0:
                this.f3128d = qq0Var;
                break;
            default:
                this.f3128d = qq0Var;
                break;
        }
        return this;
    }

    public final cz c() {
        tp1.h0(this.f3130h, u60.class);
        tp1.h0(this.f3131q, z30.class);
        return new cz(this.f3127b, this.f3130h, this.f3131q, new i10(), this.f3128d, this.f3129f);
    }

    public final oz d() {
        tp1.h0(this.f3130h, u60.class);
        tp1.h0(this.f3131q, z30.class);
        return new oz(this.f3127b, this.f3130h, this.f3131q, new i10(), this.f3128d, this.f3129f);
    }

    public final /* bridge */ /* synthetic */ Object e() {
        switch (this.f3126a) {
            case 0:
                return c();
            default:
                return d();
        }
    }
}
