package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.atomic.AtomicBoolean;
import y3.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QueryInfo f2407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2411e = new AtomicBoolean(false);

    public zzg(QueryInfo queryInfo, String str, long j10, int i10) {
        this.f2407a = queryInfo;
        this.f2408b = str;
        this.f2409c = j10;
        this.f2410d = i10;
    }

    public final int zza() {
        return this.f2410d;
    }

    public final QueryInfo zzb() {
        return this.f2407a;
    }

    public final String zzc() {
        return this.f2408b;
    }

    public final void zzd() {
        this.f2411e.set(true);
    }

    public final boolean zze() {
        ((b) com.google.android.gms.ads.internal.zzu.zzB()).getClass();
        return this.f2409c <= System.currentTimeMillis();
    }

    public final boolean zzf() {
        return this.f2411e.get();
    }
}
