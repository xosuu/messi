package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class cm0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3336a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p21 f3337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final or0 f3338c;

    public cm0(mu muVar, or0 or0Var) {
        this.f3337b = muVar;
        this.f3338c = or0Var;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        switch (this.f3336a) {
            case 0:
                return 5;
            default:
                return 21;
        }
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        int i10 = this.f3336a;
        p21 p21Var = this.f3337b;
        switch (i10) {
            case 0:
                return ((q11) p21Var).b(new du(6, this));
            default:
                return ((q11) p21Var).b(new du(16, this));
        }
    }

    public cm0(mu muVar, or0 or0Var, int i10) {
        this.f3337b = muVar;
        this.f3338c = or0Var;
    }
}
