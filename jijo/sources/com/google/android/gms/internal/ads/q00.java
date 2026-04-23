package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s00 f8068b;

    public /* synthetic */ q00(s00 s00Var, int i10) {
        this.f8067a = i10;
        this.f8068b = s00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8067a;
        s00 s00Var = this.f8068b;
        switch (i10) {
            case 0:
                s00Var.getClass();
                s00Var.f8743b.execute(new q00(s00Var, 1));
                break;
            default:
                s00Var.h();
                break;
        }
    }
}
