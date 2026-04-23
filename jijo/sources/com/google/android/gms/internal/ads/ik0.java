package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ik0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f5630d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f5631e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fz0 f5632f = fz0.m(5, fx0.f4679a, fx0.f4681c, fx0.f4684f, fx0.f4682d, fx0.f4683e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f5633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5635c;

    public ik0(byte[] bArr, int i10) {
        this.f5633a = bArr;
        this.f5635c = i10;
    }

    public final long A() {
        byte[] bArr = this.f5633a;
        int i10 = this.f5634b;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 1];
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        long j14 = bArr[i10 + 4];
        long j15 = bArr[i10 + 5];
        long j16 = bArr[i10 + 6];
        this.f5634b = i10 + 8;
        long j17 = j15 & 255;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | ((j16 & 255) << 48) | ((j11 & 255) << 8) | (j10 & 255) | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((j14 & 255) << 32) | (j17 << 40);
    }

    public final long B() {
        byte[] bArr = this.f5633a;
        int i10 = this.f5634b;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 1];
        long j12 = bArr[i10 + 2];
        this.f5634b = i10 + 4;
        return ((((long) bArr[i10 + 3]) & 255) << 24) | (j10 & 255) | ((j11 & 255) << 8) | ((j12 & 255) << 16);
    }

    public final long C() {
        byte[] bArr = this.f5633a;
        int i10 = this.f5634b;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 1];
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        long j14 = bArr[i10 + 4];
        long j15 = bArr[i10 + 5];
        long j16 = bArr[i10 + 6];
        this.f5634b = i10 + 8;
        return (((long) bArr[i10 + 7]) & 255) | ((j10 & 255) << 56) | ((j11 & 255) << 48) | ((j12 & 255) << 40) | ((j13 & 255) << 32) | ((j14 & 255) << 24) | ((j15 & 255) << 16) | ((j16 & 255) << 8);
    }

    public final long D() {
        byte[] bArr = this.f5633a;
        int i10 = this.f5634b;
        long j10 = bArr[i10];
        long j11 = bArr[i10 + 1];
        long j12 = bArr[i10 + 2];
        this.f5634b = i10 + 4;
        return (((long) bArr[i10 + 3]) & 255) | ((j10 & 255) << 24) | ((j11 & 255) << 16) | ((j12 & 255) << 8);
    }

    public final long E() {
        long jC = C();
        if (jC >= 0) {
            return jC;
        }
        throw new IllegalStateException(l.a0.g("Top bit not zero: ", jC));
    }

    public final long F() {
        int i10;
        int i11;
        long j10 = this.f5633a[this.f5634b];
        int i12 = 7;
        while (true) {
            i10 = 0;
            if (i12 < 0) {
                break;
            }
            int i13 = 1 << i12;
            if ((((long) i13) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= (long) (i13 - 1);
                i10 = 7 - i12;
            } else if (i12 == 7) {
                i10 = 1;
            }
        }
        if (i10 == 0) {
            throw new NumberFormatException(l.a0.g("Invalid UTF-8 sequence first byte: ", j10));
        }
        for (i11 = 1; i11 < i10; i11++) {
            byte b10 = this.f5633a[this.f5634b + i11];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException(l.a0.g("Invalid UTF-8 sequence continuation byte: ", j10));
            }
            j10 = (j10 << 6) | ((long) (b10 & 63));
        }
        this.f5634b += i10;
        return j10;
    }

    public final String G() {
        int i10 = this.f5635c;
        int i11 = this.f5634b;
        if (i10 - i11 == 0) {
            return null;
        }
        while (i11 < this.f5635c && this.f5633a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.f5633a;
        int i12 = this.f5634b;
        int i13 = yn0.f10944a;
        String str = new String(bArr, i12, i11 - i12, fx0.f4681c);
        this.f5634b = i11;
        if (i11 < this.f5635c) {
            this.f5634b = i11 + 1;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String H(java.nio.charset.Charset r7) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ik0.H(java.nio.charset.Charset):java.lang.String");
    }

    public final String I(int i10) {
        if (i10 == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        int i11 = this.f5634b;
        int i12 = (i11 + i10) - 1;
        int i13 = (i12 >= this.f5635c || this.f5633a[i12] != 0) ? i10 : i10 - 1;
        byte[] bArr = this.f5633a;
        int i14 = yn0.f10944a;
        String str = new String(bArr, i11, i13, fx0.f4681c);
        this.f5634b += i10;
        return str;
    }

    public final String a(int i10, Charset charset) {
        byte[] bArr = this.f5633a;
        int i11 = this.f5634b;
        String str = new String(bArr, i11, i10, charset);
        this.f5634b = i11 + i10;
        return str;
    }

    public final Charset b() {
        int i10 = this.f5635c;
        int i11 = this.f5634b;
        int i12 = i10 - i11;
        if (i12 >= 3) {
            byte[] bArr = this.f5633a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f5634b = i11 + 3;
                return fx0.f4681c;
            }
        }
        if (i12 < 2) {
            return null;
        }
        byte[] bArr2 = this.f5633a;
        byte b10 = bArr2[i11];
        if (b10 == -2) {
            if (bArr2[i11 + 1] != -1) {
                return null;
            }
            this.f5634b = i11 + 2;
            return fx0.f4682d;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f5634b = i11 + 2;
        return fx0.f4683e;
    }

    public final short c() {
        byte[] bArr = this.f5633a;
        int i10 = this.f5634b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f5634b = i10 + 2;
        return (short) ((bArr[i11] & 255) | (i12 << 8));
    }

    public final void d(int i10) {
        byte[] bArr = this.f5633a;
        if (i10 > bArr.length) {
            this.f5633a = Arrays.copyOf(bArr, i10);
        }
    }

    public final void e(int i10, byte[] bArr, int i11) {
        System.arraycopy(this.f5633a, this.f5634b, bArr, i10, i11);
        this.f5634b += i11;
    }

    public final void f(int i10) {
        byte[] bArr = this.f5633a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        g(bArr, i10);
    }

    public final void g(byte[] bArr, int i10) {
        this.f5633a = bArr;
        this.f5635c = i10;
        this.f5634b = 0;
    }

    public final void h(int i10) {
        boolean z9 = false;
        if (i10 >= 0 && i10 <= this.f5633a.length) {
            z9 = true;
        }
        tc1.K(z9);
        this.f5635c = i10;
    }

    public final void i(int i10) {
        boolean z9 = false;
        if (i10 >= 0 && i10 <= this.f5635c) {
            z9 = true;
        }
        tc1.K(z9);
        this.f5634b = i10;
    }

    public final void j(int i10) {
        i(this.f5634b + i10);
    }

    public final byte[] k() {
        return this.f5633a;
    }

    public final char l(Charset charset, char[] cArr) {
        int iM = m(charset);
        if (iM != 0) {
            int i10 = iM >> 16;
            for (char c10 : cArr) {
                char c11 = (char) i10;
                if (c10 == c11) {
                    this.f5634b += (char) iM;
                    return c11;
                }
            }
        }
        return (char) 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m(java.nio.charset.Charset r10) {
        /*
            r9 = this;
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.fx0.f4681c
            boolean r0 = r10.equals(r0)
            java.lang.String r1 = "Out of range: %s"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L14
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.fx0.f4679a
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L32
        L14:
            int r0 = r9.f5635c
            int r4 = r9.f5634b
            int r0 = r0 - r4
            if (r0 <= 0) goto L32
            byte[] r10 = r9.f5633a
            r10 = r10[r4]
            r10 = r10 & 255(0xff, float:3.57E-43)
            long r4 = (long) r10
            int r10 = (int) r4
            char r10 = (char) r10
            long r6 = (long) r10
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            com.google.android.gms.internal.ads.en1.H0(r4, r1, r0)
            byte r10 = (byte) r10
            r4 = 1
            goto L73
        L32:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.fx0.f4684f
            boolean r0 = r10.equals(r0)
            r4 = 2
            if (r0 != 0) goto L43
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.fx0.f4682d
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L59
        L43:
            int r0 = r9.f5635c
            int r5 = r9.f5634b
            int r0 = r0 - r5
            if (r0 < r4) goto L59
            byte[] r10 = r9.f5633a
            r0 = r10[r5]
            int r5 = r5 + r3
            r10 = r10[r5]
            int r0 = r0 << 8
        L53:
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r10 | r0
            char r10 = (char) r10
            byte r10 = (byte) r10
            goto L73
        L59:
            java.nio.charset.Charset r0 = com.google.android.gms.internal.ads.fx0.f4683e
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L83
            int r10 = r9.f5635c
            int r0 = r9.f5634b
            int r10 = r10 - r0
            if (r10 < r4) goto L83
            byte[] r10 = r9.f5633a
            int r5 = r0 + 1
            r5 = r10[r5]
            r10 = r10[r0]
            int r0 = r5 << 8
            goto L53
        L73:
            long r5 = (long) r10
            int r10 = (int) r5
            char r10 = (char) r10
            long r7 = (long) r10
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L7c
            r2 = 1
        L7c:
            com.google.android.gms.internal.ads.en1.H0(r5, r1, r2)
            int r10 = r10 << 16
            int r10 = r10 + r4
            return r10
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ik0.m(java.nio.charset.Charset):int");
    }

    public final int n() {
        return this.f5635c - this.f5634b;
    }

    public final int o() {
        return this.f5634b;
    }

    public final int p() {
        return this.f5635c;
    }

    public final int q() {
        byte[] bArr = this.f5633a;
        int i10 = this.f5634b;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = i10 + 3;
        int i14 = bArr[i10 + 2] & 255;
        this.f5634b = i10 + 4;
        return (bArr[i13] & 255) | (i11 << 24) | (i12 << 16) | (i14 << 8);
    }

    public final int r() {
        byte[] bArr = this.f5633a;
        int i10 = this.f5634b;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        this.f5634b = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final int s() {
        int iR = r();
        if (iR >= 0) {
            return iR;
        }
        throw new IllegalStateException(fb1.g("Top bit not zero: ", iR));
    }

    public final int t() {
        byte[] bArr = this.f5633a;
        int i10 = this.f5634b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f5634b = i10 + 2;
        return ((bArr[i11] & 255) << 8) | i12;
    }

    public final int u() {
        return (v() << 21) | (v() << 14) | (v() << 7) | v();
    }

    public final int v() {
        byte[] bArr = this.f5633a;
        int i10 = this.f5634b;
        this.f5634b = i10 + 1;
        return bArr[i10] & 255;
    }

    public final int w() {
        byte[] bArr = this.f5633a;
        int i10 = this.f5634b;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        this.f5634b = i10 + 4;
        return i12 | (i11 << 8);
    }

    public final int x() {
        byte[] bArr = this.f5633a;
        int i10 = this.f5634b;
        int i11 = bArr[i10] & 255;
        int i12 = i10 + 2;
        int i13 = bArr[i10 + 1] & 255;
        this.f5634b = i10 + 3;
        return (bArr[i12] & 255) | (i11 << 16) | (i13 << 8);
    }

    public final int y() {
        int iQ = q();
        if (iQ >= 0) {
            return iQ;
        }
        throw new IllegalStateException(fb1.g("Top bit not zero: ", iQ));
    }

    public final int z() {
        byte[] bArr = this.f5633a;
        int i10 = this.f5634b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f5634b = i10 + 2;
        return (bArr[i11] & 255) | (i12 << 8);
    }

    public ik0() {
        this.f5633a = yn0.f10949f;
    }

    public ik0(int i10) {
        this.f5633a = new byte[i10];
        this.f5635c = i10;
    }

    public ik0(byte[] bArr) {
        this.f5633a = bArr;
        this.f5635c = bArr.length;
    }
}
