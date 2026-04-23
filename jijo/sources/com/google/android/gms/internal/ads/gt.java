package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: loaded from: classes.dex */
public final class gt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f5041a;

    public gt(zzg zzgVar) {
        this.f5041a = zzgVar;
    }

    public final void a(int i10, long j10) {
        if (((Boolean) zzba.zzc().a(eg.f4045k0)).booleanValue()) {
            return;
        }
        zzg zzgVar = this.f5041a;
        if (j10 - zzgVar.zzf() < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) zzba.zzc().a(eg.f4055l0)).booleanValue()) {
            zzgVar.zzM(i10);
            zzgVar.zzN(j10);
        } else {
            zzgVar.zzM(-1);
            zzgVar.zzN(j10);
        }
    }
}
