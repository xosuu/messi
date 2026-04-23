package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m20 f7439b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh1 f7440d;

    public /* synthetic */ o(m20 m20Var, wh1 wh1Var, int i10) {
        this.f7438a = i10;
        this.f7439b = m20Var;
        this.f7440d = wh1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7438a) {
            case 0:
                m20 m20Var = this.f7439b;
                m20Var.getClass();
                int i10 = yn0.f10944a;
                ((ri1) m20Var.f6810d).f8608a.f9512p.I(this.f7440d);
                break;
            default:
                m20 m20Var2 = this.f7439b;
                wh1 wh1Var = this.f7440d;
                m20Var2.getClass();
                synchronized (wh1Var) {
                }
                int i11 = yn0.f10944a;
                ((ri1) m20Var2.f6810d).f8608a.f9512p.U(wh1Var);
                break;
        }
    }
}
