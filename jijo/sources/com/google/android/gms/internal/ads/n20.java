package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class n20 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m20 f7113b;

    public /* synthetic */ n20(m20 m20Var, int i10) {
        this.f7112a = i10;
        this.f7113b = m20Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f7112a;
        m20 m20Var = this.f7113b;
        switch (i10) {
            case 0:
                k60 k60Var = (k60) m20Var.f6810d;
                return k60Var != null ? new n70(k60Var, nu.f7388f) : new n70(new l20(), nu.f7388f);
            default:
                return (k60) m20Var.f6810d;
        }
    }
}
