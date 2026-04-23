package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class kv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6394b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6393a = TimeUnit.MILLISECONDS.toNanos(((Long) zzba.zzc().a(eg.f4170x)).longValue());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6395c = true;

    public final void a(SurfaceTexture surfaceTexture, bv bvVar) {
        if (bvVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f6395c) {
            long j10 = timestamp - this.f6394b;
            if (Math.abs(j10) < this.f6393a) {
                return;
            }
        }
        this.f6395c = false;
        this.f6394b = timestamp;
        zzt.zza.post(new s9(12, bvVar));
    }
}
