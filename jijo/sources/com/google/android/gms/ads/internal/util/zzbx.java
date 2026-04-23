package com.google.android.gms.ads.internal.util;

import android.os.SystemClock;
import y3.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzbx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f2156b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2157c = new Object();

    public zzbx(long j10) {
        this.f2155a = j10;
    }

    public final void zza(long j10) {
        synchronized (this.f2157c) {
            this.f2155a = j10;
        }
    }

    public final boolean zzb() {
        synchronized (this.f2157c) {
            try {
                ((b) com.google.android.gms.ads.internal.zzu.zzB()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f2156b + this.f2155a > jElapsedRealtime) {
                    return false;
                }
                this.f2156b = jElapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
