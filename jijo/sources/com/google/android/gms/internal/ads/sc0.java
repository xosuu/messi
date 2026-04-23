package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sc0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tc0 f8843b;

    public /* synthetic */ sc0(tc0 tc0Var, int i10) {
        this.f8842a = i10;
        this.f8843b = tc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8842a;
        tc0 tc0Var = this.f8843b;
        switch (i10) {
            case 0:
                tc0Var.getClass();
                tc0Var.f9112c.execute(new sc0(tc0Var, 2));
                break;
            case 1:
                tc0Var.a();
                break;
            default:
                tc0Var.a();
                break;
        }
    }
}
