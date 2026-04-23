package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kk1 implements qe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y1 f6310b;

    public /* synthetic */ kk1(ek1 ek1Var, y1 y1Var, xh1 xh1Var, int i10) {
        this.f6309a = i10;
        this.f6310b = y1Var;
    }

    @Override // com.google.android.gms.internal.ads.qe0
    /* JADX INFO: renamed from: zza */
    public final void mo0zza(Object obj) {
        int i10 = this.f6309a;
        y1 y1Var = this.f6310b;
        switch (i10) {
            case 0:
                ((fk1) obj).g(y1Var);
                break;
            default:
                ((fk1) obj).j(y1Var);
                break;
        }
    }
}
