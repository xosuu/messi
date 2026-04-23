package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.eq;
import com.google.android.gms.internal.ads.ik;
import com.google.android.gms.internal.ads.jk;
import com.google.android.gms.internal.ads.xs;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class zzay {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zzay f1962f = new zzay();
    public static final /* synthetic */ int zza = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.client.zzf f1963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzaw f1964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f1966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f1967e;

    public zzay() {
        com.google.android.gms.ads.internal.util.client.zzf zzfVar = new com.google.android.gms.ads.internal.util.client.zzf();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzeq(), new ik("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl"), new xs(), new eq("com.google.android.gms.ads.AdOverlayCreatorImpl"), new jk("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl"));
        String strZze = com.google.android.gms.ads.internal.util.client.zzf.zze();
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0, 242402000, true);
        Random random = new Random();
        this.f1963a = zzfVar;
        this.f1964b = zzawVar;
        this.f1965c = strZze;
        this.f1966d = versionInfoParcel;
        this.f1967e = random;
    }

    public static zzaw zza() {
        return f1962f.f1964b;
    }

    public static com.google.android.gms.ads.internal.util.client.zzf zzb() {
        return f1962f.f1963a;
    }

    public static VersionInfoParcel zzc() {
        return f1962f.f1966d;
    }

    public static String zzd() {
        return f1962f.f1965c;
    }

    public static Random zze() {
        return f1962f.f1967e;
    }
}
