package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lo1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pm1 f6683b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ no1 f6684d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bo1 f6685f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gk1 f6686h;

    public /* synthetic */ lo1(pm1 pm1Var, no1 no1Var, bo1 bo1Var, gk1 gk1Var, int i10) {
        this.f6682a = i10;
        this.f6683b = pm1Var;
        this.f6684d = no1Var;
        this.f6685f = bo1Var;
        this.f6686h = gk1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6682a;
        bo1 bo1Var = this.f6685f;
        no1 no1Var = this.f6684d;
        gk1 gk1Var = this.f6686h;
        pm1 pm1Var = this.f6683b;
        switch (i10) {
            case 0:
                no1Var.R(0, pm1Var.f7921a, bo1Var, gk1Var);
                break;
            case 1:
                no1Var.u(0, pm1Var.f7921a, bo1Var, gk1Var);
                break;
            default:
                no1Var.g(0, pm1Var.f7921a, bo1Var, gk1Var);
                break;
        }
    }
}
