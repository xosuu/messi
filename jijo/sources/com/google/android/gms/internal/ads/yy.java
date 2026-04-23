package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class yy implements nh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11072b;

    public /* synthetic */ yy(int i10, Object obj) {
        this.f11071a = i10;
        this.f11072b = obj;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f11071a;
        Object obj = this.f11072b;
        switch (i10) {
            case 0:
                return new p80(((zy) obj).f11340c);
            case 1:
                return new m20(((zy) obj).f11340c);
            default:
                return ((qh1) obj).zzb();
        }
    }
}
