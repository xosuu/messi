package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nj1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ok0 f7274b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pair f7275d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bo1 f7276f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gk1 f7277h;

    public /* synthetic */ nj1(ok0 ok0Var, Pair pair, bo1 bo1Var, gk1 gk1Var, int i10) {
        this.f7273a = i10;
        this.f7274b = ok0Var;
        this.f7275d = pair;
        this.f7276f = bo1Var;
        this.f7277h = gk1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7273a;
        gk1 gk1Var = this.f7277h;
        bo1 bo1Var = this.f7276f;
        Pair pair = this.f7275d;
        ok0 ok0Var = this.f7274b;
        switch (i10) {
            case 0:
                ((rj1) ok0Var.f7598d).f8623h.g(((Integer) pair.first).intValue(), (jo1) pair.second, bo1Var, gk1Var);
                break;
            case 1:
                ((rj1) ok0Var.f7598d).f8623h.R(((Integer) pair.first).intValue(), (jo1) pair.second, bo1Var, gk1Var);
                break;
            default:
                ((rj1) ok0Var.f7598d).f8623h.u(((Integer) pair.first).intValue(), (jo1) pair.second, bo1Var, gk1Var);
                break;
        }
    }
}
