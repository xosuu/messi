package com.google.android.gms.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzb {
    public static int zza(AdSize adSize) {
        return adSize.f1878f;
    }

    public static int zzb(AdSize adSize) {
        return adSize.f1880h;
    }

    public static AdSize zzc(int i10, int i11, String str) {
        return new AdSize(i10, i11, str);
    }

    public static AdSize zzd(int i10, int i11) {
        AdSize adSize = new AdSize(i10, i11);
        adSize.f1877e = true;
        adSize.f1878f = i11;
        return adSize;
    }

    public static AdSize zze(int i10, int i11) {
        AdSize adSize = new AdSize(i10, i11);
        adSize.f1879g = true;
        adSize.f1880h = i11;
        return adSize;
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.f1876d;
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.f1877e;
    }

    public static boolean zzh(AdSize adSize) {
        return adSize.f1879g;
    }
}
