package p7;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import l.a0;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public class h implements Serializable, Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char[] f16277f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f16278h = j(new byte[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f16279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int f16280b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient String f16281d;

    public h(byte[] bArr) {
        this.f16279a = bArr;
    }

    public static h d(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str));
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) (e(str.charAt(i11 + 1)) + (e(str.charAt(i11)) << 4));
        }
        return j(bArr);
    }

    public static int e(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 >= 'A' && c10 <= 'F') {
            return c10 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c10);
    }

    public static h g(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        h hVar = new h(str.getBytes(w.f16310a));
        hVar.f16281d = str;
        return hVar;
    }

    public static h j(byte... bArr) {
        if (bArr != null) {
            return new h((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        byte[] bArr = q.f16303c;
        byte[] bArr2 = this.f16279a;
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11 += 3) {
            bArr3[i10] = bArr[(bArr2[i11] & 255) >> 2];
            int i12 = i11 + 1;
            bArr3[i10 + 1] = bArr[((bArr2[i11] & 3) << 4) | ((bArr2[i12] & 255) >> 4)];
            int i13 = i10 + 3;
            int i14 = (bArr2[i12] & 15) << 2;
            int i15 = i11 + 2;
            bArr3[i10 + 2] = bArr[i14 | ((bArr2[i15] & 255) >> 6)];
            i10 += 4;
            bArr3[i13] = bArr[bArr2[i15] & 63];
        }
        int length2 = bArr2.length % 3;
        if (length2 == 1) {
            bArr3[i10] = bArr[(bArr2[length] & 255) >> 2];
            bArr3[i10 + 1] = bArr[(bArr2[length] & 3) << 4];
            bArr3[i10 + 2] = 61;
            bArr3[i10 + 3] = 61;
        } else if (length2 == 2) {
            bArr3[i10] = bArr[(bArr2[length] & 255) >> 2];
            int i16 = (bArr2[length] & 3) << 4;
            int i17 = length + 1;
            bArr3[i10 + 1] = bArr[((bArr2[i17] & 255) >> 4) | i16];
            bArr3[i10 + 2] = bArr[(bArr2[i17] & 15) << 2];
            bArr3[i10 + 3] = 61;
        }
        try {
            return new String(bArr3, StandardStringDigester.DIGEST_CHARSET);
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            p7.h r10 = (p7.h) r10
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L10:
            r5 = 1
            r6 = -1
            if (r4 >= r2) goto L2b
            byte r7 = r9.h(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.h(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L25
            int r4 = r4 + 1
            goto L10
        L25:
            if (r7 >= r8) goto L29
        L27:
            r3 = -1
            goto L31
        L29:
            r3 = 1
            goto L31
        L2b:
            if (r0 != r1) goto L2e
            goto L31
        L2e:
            if (r0 >= r1) goto L29
            goto L27
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.h.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            int size = hVar.size();
            byte[] bArr = this.f16279a;
            if (size == bArr.length && hVar.k(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public final h f(String str) {
        try {
            return j(MessageDigest.getInstance(str).digest(this.f16279a));
        } catch (NoSuchAlgorithmException e10) {
            throw new AssertionError(e10);
        }
    }

    public byte h(int i10) {
        return this.f16279a[i10];
    }

    public int hashCode() {
        int i10 = this.f16280b;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.f16279a);
        this.f16280b = iHashCode;
        return iHashCode;
    }

    public String i() {
        byte[] bArr = this.f16279a;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = f16277f;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public boolean k(int i10, int i11, int i12, byte[] bArr) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.f16279a;
        if (i10 > bArr2.length - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        Charset charset = w.f16310a;
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr2[i13 + i10] != bArr[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public boolean l(h hVar, int i10) {
        return hVar.k(0, 0, i10, this.f16279a);
    }

    public h m() {
        byte[] bArr = this.f16279a;
        if (64 > bArr.length) {
            throw new IllegalArgumentException(a0.h(new StringBuilder("endIndex > length("), bArr.length, ")"));
        }
        if (64 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 64);
        return new h(bArr2);
    }

    public h n() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f16279a;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b10 = bArr[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArr2.length; i11++) {
                    byte b11 = bArr2[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArr2[i11] = (byte) (b11 + 32);
                    }
                }
                return new h(bArr2);
            }
            i10++;
        }
    }

    public String o() {
        String str = this.f16281d;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f16279a, w.f16310a);
        this.f16281d = str2;
        return str2;
    }

    public void p(e eVar) {
        byte[] bArr = this.f16279a;
        eVar.H(0, bArr, bArr.length);
    }

    public int size() {
        return this.f16279a.length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        r4 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            byte[] r0 = r10.f16279a
            int r1 = r0.length
            if (r1 != 0) goto L8
            java.lang.String r0 = "[size=0]"
            return r0
        L8:
            java.lang.String r1 = r10.o()
            int r2 = r1.length()
            r3 = 0
            r4 = 0
            r5 = 0
        L13:
            r6 = -1
            r7 = 64
            if (r4 >= r2) goto L3c
            if (r5 != r7) goto L1b
            goto L40
        L1b:
            int r8 = r1.codePointAt(r4)
            boolean r9 = java.lang.Character.isISOControl(r8)
            if (r9 == 0) goto L2d
            r9 = 10
            if (r8 == r9) goto L2d
            r9 = 13
            if (r8 != r9) goto L32
        L2d:
            r9 = 65533(0xfffd, float:9.1831E-41)
            if (r8 != r9) goto L34
        L32:
            r4 = -1
            goto L40
        L34:
            int r5 = r5 + 1
            int r6 = java.lang.Character.charCount(r8)
            int r4 = r4 + r6
            goto L13
        L3c:
            int r4 = r1.length()
        L40:
            java.lang.String r2 = "…]"
            java.lang.String r5 = "[size="
            java.lang.String r8 = "]"
            if (r4 != r6) goto L82
            int r1 = r0.length
            if (r1 > r7) goto L61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[hex="
            r0.<init>(r1)
            java.lang.String r1 = r10.i()
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            goto L81
        L61:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            int r0 = r0.length
            r1.append(r0)
            java.lang.String r0 = " hex="
            r1.append(r0)
            p7.h r0 = r10.m()
            java.lang.String r0 = r0.i()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
        L81:
            return r0
        L82:
            java.lang.String r3 = r1.substring(r3, r4)
            java.lang.String r6 = "\\"
            java.lang.String r7 = "\\\\"
            java.lang.String r3 = r3.replace(r6, r7)
            java.lang.String r6 = "\n"
            java.lang.String r7 = "\\n"
            java.lang.String r3 = r3.replace(r6, r7)
            java.lang.String r6 = "\r"
            java.lang.String r7 = "\\r"
            java.lang.String r3 = r3.replace(r6, r7)
            int r1 = r1.length()
            if (r4 >= r1) goto Lbd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            int r0 = r0.length
            r1.append(r0)
            java.lang.String r0 = " text="
            r1.append(r0)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            goto Lc3
        Lbd:
            java.lang.String r0 = "[text="
            java.lang.String r0 = com.google.android.gms.internal.ads.fb1.i(r0, r3, r8)
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.h.toString():java.lang.String");
    }
}
