package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class jn0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f6004a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y3.a f6005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final to0 f6006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6007d;

    public jn0(pm0 pm0Var, long j10, y3.a aVar) {
        this.f6005b = aVar;
        this.f6006c = pm0Var;
        this.f6007d = j10;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        return this.f6006c.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001b  */
    @Override // com.google.android.gms.internal.ads.to0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final n5.a zzb() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r7.f6004a
            java.lang.Object r1 = r0.get()
            com.google.android.gms.internal.ads.in0 r1 = (com.google.android.gms.internal.ads.in0) r1
            if (r1 == 0) goto L1b
            y3.a r2 = r1.f5651c
            y3.b r2 = (y3.b) r2
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r1.f5650b
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L2d
        L1b:
            com.google.android.gms.internal.ads.in0 r1 = new com.google.android.gms.internal.ads.in0
            com.google.android.gms.internal.ads.to0 r2 = r7.f6006c
            n5.a r2 = r2.zzb()
            long r3 = r7.f6007d
            y3.a r5 = r7.f6005b
            r1.<init>(r2, r3, r5)
            r0.set(r1)
        L2d:
            n5.a r0 = r1.f5649a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jn0.zzb():n5.a");
    }
}
