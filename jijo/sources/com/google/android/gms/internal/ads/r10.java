package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r10 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f8352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f8353c;

    public /* synthetic */ r10(Object obj, oh1 oh1Var, int i10) {
        this.f8351a = i10;
        this.f8353c = obj;
        this.f8352b = oh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f8351a;
        Object obj = this.f8353c;
        qh1 qh1Var = this.f8352b;
        switch (i10) {
            case 0:
                return ((xq) obj).w(((oh1) qh1Var).zzb());
            default:
                Set setZzb = ((oh1) qh1Var).zzb();
                u60 u60Var = (u60) obj;
                if (u60Var.f9404p == null) {
                    u60Var.f9404p = new m40(setZzb);
                }
                m40 m40Var = u60Var.f9404p;
                tp1.b0(m40Var);
                return m40Var;
        }
    }
}
