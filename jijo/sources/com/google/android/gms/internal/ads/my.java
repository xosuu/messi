package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class my implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hy f7075b;

    public /* synthetic */ my(hy hyVar, int i10) {
        this.f7074a = i10;
        this.f7075b = hyVar;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f7074a;
        hy hyVar = this.f7075b;
        switch (i10) {
            case 0:
                return new zzj(hyVar.f5433b, hyVar.f5432a);
            case 1:
                hyVar.getClass();
                String strZzc = zzu.zzp().zzc(hyVar.f5433b, hyVar.f5432a.afmaVersion);
                tp1.b0(strZzc);
                return strZzc;
            default:
                return Long.valueOf(hyVar.f5434c);
        }
    }
}
