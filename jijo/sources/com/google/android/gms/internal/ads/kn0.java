package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class kn0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p21 f6340b;

    public kn0(mu muVar) {
        this.f6339a = 4;
        this.f6340b = muVar;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        switch (this.f6339a) {
            case 0:
                return 55;
            case 1:
                return 19;
            case 2:
                return 20;
            case 3:
                return 24;
            case 4:
                return 45;
            default:
                return 51;
        }
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        int i10 = 0;
        int i11 = this.f6339a;
        p21 p21Var = this.f6340b;
        switch (i11) {
            case 0:
                return ((q11) p21Var).b(new wf(1, i10));
            case 1:
                return ((q11) p21Var).b(new wf(2, i10));
            case 2:
                return ((q11) p21Var).b(new wf(3));
            case 3:
                return ((q11) p21Var).b(new wf(4));
            case 4:
                return ((q11) p21Var).b(new wf(5, i10));
            default:
                return ((q11) p21Var).b(new wf(6));
        }
    }

    public kn0(mu muVar, int i10) {
        this.f6339a = 1;
        this.f6340b = muVar;
    }

    public /* synthetic */ kn0(mu muVar, int i10, int i11) {
        this.f6339a = i10;
        this.f6340b = muVar;
    }
}
