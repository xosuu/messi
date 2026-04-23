package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzbw extends zzb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.client.zzr f2153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2154c;

    public zzbw(Context context, String str, String str2) {
        this.f2153b = new com.google.android.gms.ads.internal.util.client.zzr(com.google.android.gms.ads.internal.zzu.zzp().zzc(context, str));
        this.f2154c = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.f2153b.zza(this.f2154c);
    }
}
