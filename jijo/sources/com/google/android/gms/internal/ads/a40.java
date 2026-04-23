package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class a40 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z30 f2575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f2576c;

    public /* synthetic */ a40(z30 z30Var, nh1 nh1Var, int i10) {
        this.f2574a = i10;
        this.f2575b = z30Var;
        this.f2576c = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f2574a;
        z30 z30Var = this.f2575b;
        qh1 qh1Var = this.f2576c;
        switch (i10) {
            case 0:
                String str = (String) qh1Var.zzb();
                gi0 gi0Var = z30Var.f11099f;
                return gi0Var != null ? gi0Var : new gi0(str);
            default:
                ((jy) qh1Var).a();
                Context context = z30Var.f11094a;
                tp1.b0(context);
                return context;
        }
    }
}
