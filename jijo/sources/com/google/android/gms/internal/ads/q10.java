package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzm;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q10 implements f60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8084b;

    public /* synthetic */ q10(int i10, Object obj) {
        this.f8083a = i10;
        this.f8084b = obj;
    }

    @Override // com.google.android.gms.internal.ads.f60
    public final void zza() {
        zzm zzmVarS;
        int i10 = this.f8083a;
        Object obj = this.f8084b;
        switch (i10) {
            case 0:
                ((r50) obj).zza();
                break;
            default:
                fx fxVar = (fx) obj;
                if (fxVar != null && (zzmVarS = fxVar.s()) != null) {
                    zzmVarS.zzb();
                    break;
                }
                break;
        }
    }
}
