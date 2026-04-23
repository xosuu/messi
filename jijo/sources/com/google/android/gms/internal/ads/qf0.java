package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qf0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rf0 f8169b;

    public /* synthetic */ qf0(rf0 rf0Var, int i10) {
        this.f8168a = i10;
        this.f8169b = rf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8168a;
        rf0 rf0Var = this.f8169b;
        switch (i10) {
            case 0:
                rf0Var.a();
                break;
            default:
                rf0Var.a();
                break;
        }
    }
}
