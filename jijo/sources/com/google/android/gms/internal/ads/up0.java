package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class up0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wp0 f9560b;

    public /* synthetic */ up0(wp0 wp0Var, int i10) {
        this.f9559a = i10;
        this.f9560b = wp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9559a;
        wp0 wp0Var = this.f9560b;
        switch (i10) {
            case 0:
                wp0Var.u1(5);
                break;
            default:
                wp0Var.f10274a.a().execute(new up0(wp0Var, 0));
                break;
        }
    }
}
