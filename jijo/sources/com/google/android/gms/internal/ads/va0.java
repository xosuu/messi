package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class va0 implements y11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n5.a f9817b;

    public /* synthetic */ va0(n5.a aVar, int i10) {
        this.f9816a = i10;
        this.f9817b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final n5.a zza(Object obj) throws zzeir {
        int i10 = this.f9816a;
        n5.a aVar = this.f9817b;
        switch (i10) {
            case 0:
                fx fxVar = (fx) obj;
                if (fxVar == null || fxVar.zzq() == null) {
                    throw new zzeir(1, "Retrieve video view in html5 ad response failed.");
                }
                return aVar;
            case 1:
                if (((fx) obj) != null) {
                    return aVar;
                }
                throw new zzeir(1, "Retrieve Web View from image ad response failed.");
            case 2:
                return obj != null ? aVar : tc1.Z(new zzeir(1, "Retrieve required value in native ad response failed."));
            default:
                return aVar;
        }
    }
}
