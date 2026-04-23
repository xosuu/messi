package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3810a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f3811b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2 f3812c = new i2();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f2 f3813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3815f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3816g;

    public final long a(h0 h0Var, int i10) {
        byte[] bArr = this.f3810a;
        ((a0) h0Var).h(bArr, 0, i10, false);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & 255));
        }
        return j10;
    }
}
