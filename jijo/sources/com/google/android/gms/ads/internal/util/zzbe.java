package com.google.android.gms.ads.internal.util;

import b7.u;
import f.f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public zzbe(String str, double d10, double d11, double d12, int i10) {
        this.zza = str;
        this.zzc = d10;
        this.zzb = d11;
        this.zzd = d12;
        this.zze = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbe)) {
            return false;
        }
        zzbe zzbeVar = (zzbe) obj;
        return u.i(this.zza, zzbeVar.zza) && this.zzb == zzbeVar.zzb && this.zzc == zzbeVar.zzc && this.zze == zzbeVar.zze && Double.compare(this.zzd, zzbeVar.zzd) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze)});
    }

    public final String toString() {
        f fVar = new f(this);
        fVar.g(this.zza, "name");
        fVar.g(Double.valueOf(this.zzc), "minBound");
        fVar.g(Double.valueOf(this.zzb), "maxBound");
        fVar.g(Double.valueOf(this.zzd), "percent");
        fVar.g(Integer.valueOf(this.zze), "count");
        return fVar.toString();
    }
}
