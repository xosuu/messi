package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class i2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f5457d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f5458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5460c;

    public i2() {
        this.f5458a = new byte[8];
    }

    public static long k(byte[] bArr, int i10, boolean z9) {
        long j10 = ((long) bArr[0]) & 255;
        if (z9) {
            j10 &= ~f5457d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j10 = (j10 << 8) | (((long) bArr[i11]) & 255);
        }
        return j10;
    }

    public boolean a() throws IOException {
        int i10 = this.f5459b;
        if (i10 >= this.f5460c) {
            throw new IOException("Packet too short.");
        }
        byte[] bArr = this.f5458a;
        this.f5459b = i10 + 1;
        return bArr[i10] != 0;
    }

    public int b() throws IOException {
        int i10 = this.f5459b;
        if (i10 >= this.f5460c) {
            throw new IOException("Packet too short.");
        }
        byte[] bArr = this.f5458a;
        this.f5459b = i10 + 1;
        return bArr[i10] & 255;
    }

    public byte[] c() throws IOException {
        int i10 = i();
        int i11 = this.f5459b;
        if (i10 + i11 > this.f5460c) {
            throw new IOException("Malformed SSH byte string.");
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f5458a, i11, bArr, 0, i10);
        this.f5459b += i10;
        return bArr;
    }

    public byte[] d(int i10) throws IOException {
        int i11 = this.f5459b;
        if (i11 + i10 > this.f5460c) {
            throw new IOException("Packet too short.");
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f5458a, i11, bArr, 0, i10);
        this.f5459b += i10;
        return bArr;
    }

    public BigInteger e() throws IOException {
        byte[] bArrC = c();
        return bArrC.length == 0 ? BigInteger.ZERO : new BigInteger(bArrC);
    }

    public String[] f() {
        return en1.z(g(), ',');
    }

    public String g() throws IOException {
        int i10 = i();
        int i11 = this.f5459b;
        if (i10 + i11 > this.f5460c) {
            throw new IOException("Malformed SSH string.");
        }
        String str = new String(this.f5458a, i11, i10, "ISO-8859-1");
        this.f5459b += i10;
        return str;
    }

    public String h(String str) throws IOException {
        int i10 = i();
        int i11 = this.f5459b;
        if (i10 + i11 > this.f5460c) {
            throw new IOException("Malformed SSH string.");
        }
        String str2 = new String(this.f5458a, i11, i10, str);
        this.f5459b += i10;
        return str2;
    }

    public int i() throws IOException {
        int i10 = this.f5459b;
        if (i10 + 4 > this.f5460c) {
            throw new IOException("Packet too short.");
        }
        byte[] bArr = this.f5458a;
        int i11 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24);
        int i12 = i10 + 3;
        int i13 = i11 | ((bArr[i10 + 2] & 255) << 8);
        this.f5459b = i10 + 4;
        return (bArr[i12] & 255) | i13;
    }

    public int j() {
        return this.f5460c - this.f5459b;
    }

    public long l(h0 h0Var, boolean z9, boolean z10, int i10) {
        int i11;
        int i12 = this.f5459b;
        byte[] bArr = this.f5458a;
        if (i12 == 0) {
            if (!h0Var.h(bArr, 0, 1, z9)) {
                return -1L;
            }
            int i13 = bArr[0] & 255;
            int i14 = 0;
            while (true) {
                if (i14 >= 8) {
                    i11 = -1;
                    break;
                }
                i11 = i14 + 1;
                if ((f5457d[i14] & ((long) i13)) != 0) {
                    break;
                }
                i14 = i11;
            }
            this.f5460c = i11;
            if (i11 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f5459b = 1;
        }
        int i15 = this.f5460c;
        if (i15 > i10) {
            this.f5459b = 0;
            return -2L;
        }
        if (i15 != 1) {
            ((a0) h0Var).h(bArr, 1, i15 - 1, false);
        }
        this.f5459b = 0;
        return k(bArr, this.f5460c, z10);
    }

    public /* synthetic */ i2(byte[] bArr, int i10) {
        if (i10 == 1) {
            this.f5460c = 0;
            this.f5458a = bArr;
            this.f5459b = 0;
            this.f5460c = bArr.length;
            return;
        }
        this.f5458a = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i11 = 0; i11 < 256; i11++) {
            this.f5458a[i11] = (byte) i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            byte[] bArr2 = this.f5458a;
            byte b10 = bArr2[i13];
            i12 = (i12 + b10 + bArr[i13 % bArr.length]) & 255;
            bArr2[i13] = bArr2[i12];
            bArr2[i12] = b10;
        }
        this.f5459b = 0;
        this.f5460c = 0;
    }

    public i2(byte[] bArr, int i10, int i11) {
        this.f5458a = bArr;
        this.f5459b = i10;
        int i12 = i11 + i10;
        this.f5460c = i12;
        if (i10 >= 0 && i10 <= bArr.length) {
            if (i12 < 0 || i12 > bArr.length) {
                throw new IllegalArgumentException("Illegal length.");
            }
            return;
        }
        throw new IllegalArgumentException("Illegal offset.");
    }
}
