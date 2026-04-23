package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ll1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cj0 f6657b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk1 f6658d;

    public /* synthetic */ ll1(cj0 cj0Var, jk1 jk1Var, int i10) {
        this.f6656a = i10;
        this.f6657b = cj0Var;
        this.f6658d = jk1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6656a;
        jk1 jk1Var = this.f6658d;
        cj0 cj0Var = this.f6657b;
        switch (i10) {
            case 0:
                cj0Var.getClass();
                int i11 = yn0.f10944a;
                ((ri1) ((ol1) cj0Var.f3302d)).f8608a.f9512p.x(jk1Var);
                break;
            default:
                cj0Var.getClass();
                int i12 = yn0.f10944a;
                ((ri1) ((ol1) cj0Var.f3302d)).f8608a.f9512p.m(jk1Var);
                break;
        }
    }
}
