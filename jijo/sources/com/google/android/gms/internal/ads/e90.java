package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e90 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i90 f3881b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ga0 f3882d;

    public /* synthetic */ e90(i90 i90Var, ga0 ga0Var, int i10) {
        this.f3880a = i10;
        this.f3881b = i90Var;
        this.f3882d = ga0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3880a;
        ga0 ga0Var = this.f3882d;
        i90 i90Var = this.f3881b;
        switch (i10) {
            case 0:
                i90Var.t(ga0Var);
                break;
            default:
                i90Var.u(ga0Var);
                break;
        }
    }
}
