package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class in0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n5.a f5649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y3.a f5651c;

    public in0(n5.a aVar, long j10, y3.a aVar2) {
        this.f5649a = aVar;
        this.f5651c = aVar2;
        ((y3.b) aVar2).getClass();
        this.f5650b = SystemClock.elapsedRealtime() + j10;
    }
}
