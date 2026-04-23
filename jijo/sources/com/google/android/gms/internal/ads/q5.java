package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class q5 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f8109e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f8113d;

    public final void a(int i10, byte[] bArr, int i11) {
        if (this.f8110a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f8113d;
            int length = bArr2.length;
            int i13 = this.f8111b + i12;
            if (length < i13) {
                this.f8113d = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.f8113d, this.f8111b, i12);
            this.f8111b += i12;
        }
    }
}
