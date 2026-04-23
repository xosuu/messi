package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yt0 f8872b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f8873d;

    public /* synthetic */ sh0(yt0 yt0Var, View view, int i10) {
        this.f8871a = i10;
        this.f8872b = yt0Var;
        this.f8873d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c8.a aVar = tp1.f9254v;
        int i10 = this.f8871a;
        yt0 yt0Var = this.f8872b;
        View view = this.f8873d;
        switch (i10) {
            case 0:
                if (((Boolean) zzba.zzc().a(eg.f4194z4)).booleanValue() && aVar.f1584b) {
                    au0 au0Var = au0.f2792a;
                    if (!yt0Var.f11035f) {
                        yt0Var.f11031b.a(view, au0Var);
                        break;
                    }
                }
                break;
            default:
                if (((Boolean) zzba.zzc().a(eg.f4194z4)).booleanValue() && aVar.f1584b) {
                    yt0Var.b(view);
                    break;
                }
                break;
        }
    }
}
