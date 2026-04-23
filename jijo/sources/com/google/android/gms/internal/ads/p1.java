package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class p1 extends y {
    public static /* bridge */ /* synthetic */ int d(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
