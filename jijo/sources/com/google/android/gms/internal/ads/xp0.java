package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xp0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yp0 f10627b;

    public /* synthetic */ xp0(yp0 yp0Var, int i10) {
        this.f10626a = i10;
        this.f10627b = yp0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10626a;
        yp0 yp0Var = this.f10627b;
        switch (i10) {
            case 0:
                yp0Var.f10989f.t(yp0Var.f10999z);
                break;
            default:
                yp0Var.getClass();
                yp0Var.f10989f.t(en1.u0(6, null, null));
                break;
        }
    }
}
