package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class og0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rk0 f7573b;

    public /* synthetic */ og0(rk0 rk0Var, int i10) {
        this.f7572a = i10;
        this.f7573b = rk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f7572a;
        rk0 rk0Var = this.f7573b;
        switch (i10) {
            case 0:
                rk0Var.zzb();
                break;
            default:
                rk0Var.zzb();
                break;
        }
    }
}
