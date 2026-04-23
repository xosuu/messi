package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: loaded from: classes.dex */
public final class um implements tu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9532a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tm f9533b;

    public um(tm tmVar) {
        this.f9533b = tmVar;
    }

    @Override // com.google.android.gms.internal.ads.tu, com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        int i10 = this.f9532a;
        tm tmVar = this.f9533b;
        switch (i10) {
            case 0:
                lm lmVar = (lm) obj;
                zze.zza("Getting a new session for JS Engine.");
                lmVar.getClass();
                ((qu) tmVar.f12845a).b(new an(lmVar));
                break;
            default:
                zze.zza("Releasing engine reference.");
                tmVar.f9192d.r();
                break;
        }
    }

    public um(tm tmVar, int i10) {
        this.f9533b = tmVar;
    }
}
