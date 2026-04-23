package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yt0 f9487b;

    public /* synthetic */ uh0(yt0 yt0Var, int i10) {
        this.f9486a = i10;
        this.f9487b = yt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9486a;
        yt0 yt0Var = this.f9487b;
        switch (i10) {
            case 0:
                yt0Var.c();
                break;
            default:
                if (((Boolean) zzba.zzc().a(eg.f4194z4)).booleanValue() && tp1.f9254v.f1584b) {
                    yt0Var.a();
                    break;
                }
                break;
        }
    }
}
