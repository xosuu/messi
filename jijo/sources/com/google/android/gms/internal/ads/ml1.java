package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ml1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cj0 f7004b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Exception f7005d;

    public /* synthetic */ ml1(cj0 cj0Var, Exception exc, int i10) {
        this.f7003a = i10;
        this.f7004b = cj0Var;
        this.f7005d = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7003a;
        Exception exc = this.f7005d;
        cj0 cj0Var = this.f7004b;
        switch (i10) {
            case 0:
                cj0Var.getClass();
                int i11 = yn0.f10944a;
                ((ri1) ((ol1) cj0Var.f3302d)).f8608a.f9512p.X(exc);
                break;
            default:
                cj0Var.getClass();
                int i12 = yn0.f10944a;
                ((ri1) ((ol1) cj0Var.f3302d)).f8608a.f9512p.V(exc);
                break;
        }
    }
}
