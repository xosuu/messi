package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class il1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cj0 f5638b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh1 f5639d;

    public /* synthetic */ il1(cj0 cj0Var, wh1 wh1Var, int i10) {
        this.f5637a = i10;
        this.f5638b = cj0Var;
        this.f5639d = wh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5637a) {
            case 0:
                cj0 cj0Var = this.f5638b;
                cj0Var.getClass();
                int i10 = yn0.f10944a;
                ((ri1) ((ol1) cj0Var.f3302d)).f8608a.f9512p.Q(this.f5639d);
                break;
            default:
                cj0 cj0Var2 = this.f5638b;
                wh1 wh1Var = this.f5639d;
                cj0Var2.getClass();
                synchronized (wh1Var) {
                }
                int i11 = yn0.f10944a;
                ((ri1) ((ol1) cj0Var2.f3302d)).f8608a.f9512p.i(wh1Var);
                break;
        }
    }
}
