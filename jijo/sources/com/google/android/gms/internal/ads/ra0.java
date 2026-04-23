package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.ads.internal.util.zzbo f8554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3.a f8555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f8556c;

    public ra0(com.google.android.gms.ads.internal.util.zzbo zzboVar, y3.a aVar, mu muVar) {
        this.f8554a = zzboVar;
        this.f8555b = aVar;
        this.f8556c = muVar;
    }

    public final Bitmap a(byte[] bArr, BitmapFactory.Options options) {
        y3.b bVar = (y3.b) this.f8555b;
        bVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        bVar.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j10 = jElapsedRealtime2 - jElapsedRealtime;
            zze.zza("Decoded image w: " + bitmapDecodeByteArray.getWidth() + " h:" + bitmapDecodeByteArray.getHeight() + " bytes: " + bitmapDecodeByteArray.getAllocationByteCount() + " time: " + j10 + " on ui thread: " + (Looper.getMainLooper().getThread() == Thread.currentThread()));
        }
        return bitmapDecodeByteArray;
    }
}
