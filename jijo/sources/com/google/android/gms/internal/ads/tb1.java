package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f9109a;

    public tb1(byte[] bArr, int i10) {
        byte[] bArr2 = new byte[i10];
        this.f9109a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static tb1 a(byte[] bArr) {
        if (bArr != null) {
            return new tb1(bArr, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final byte[] b() {
        byte[] bArr = this.f9109a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tb1) {
            return Arrays.equals(((tb1) obj).f9109a, this.f9109a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9109a);
    }

    public final String toString() {
        byte[] bArr = this.f9109a;
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            sb.append("0123456789abcdef".charAt((b10 & 255) >> 4));
            sb.append("0123456789abcdef".charAt(b10 & 15));
        }
        return fb1.i("Bytes(", sb.toString(), ")");
    }
}
