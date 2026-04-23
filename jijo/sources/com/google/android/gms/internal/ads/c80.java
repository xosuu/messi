package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c80 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p80 f3230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f3231c;

    public /* synthetic */ c80(p80 p80Var, nh1 nh1Var, int i10) {
        this.f3229a = i10;
        this.f3230b = p80Var;
        this.f3231c = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f3229a;
        p80 p80Var = this.f3230b;
        qh1 qh1Var = this.f3231c;
        switch (i10) {
            case 0:
                Set setF = p80Var.f((r30) qh1Var.zzb());
                tp1.b0(setF);
                return setF;
            default:
                return new n70(new q10(1, (fx) p80Var.f7835d), (Executor) qh1Var.zzb());
        }
    }
}
