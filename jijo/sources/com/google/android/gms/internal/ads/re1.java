package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class re1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mb1 f8585a;

    static {
        if (pe1.f7868e && pe1.f7867d) {
            int i10 = xb1.f10533a;
        }
        f8585a = new mb1();
    }

    public static int a(int i10, byte[] bArr, int i11) {
        int i12;
        int i13 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i13 != 0) {
            if (i13 == 1) {
                byte b11 = bArr[i10];
                if (b10 <= -12 && b11 <= -65) {
                    i12 = (b11 << 8) ^ b10;
                    return i12;
                }
            } else {
                if (i13 != 2) {
                    throw new AssertionError();
                }
                byte b12 = bArr[i10];
                byte b13 = bArr[i10 + 1];
                if (b10 <= -12 && b12 <= -65 && b13 <= -65) {
                    i12 = (b13 << 16) ^ ((b12 << 8) ^ b10);
                    return i12;
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    public static int b(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char cCharAt;
        int length = str.length();
        int i15 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i15 >= length || (i14 = i15 + i10) >= i12 || (cCharAt = str.charAt(i15)) >= 128) {
                break;
            }
            bArr[i14] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 128 && i16 < i12) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < 2048 && i16 <= i12 - 2) {
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i16 + 1] = (byte) ((cCharAt2 & '?') | NotificationCompat.FLAG_HIGH_PRIORITY);
                i16 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i16 > i12 - 3) {
                    if (i16 > i12 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i13 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                            throw new qe1(i15, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                    }
                    int i17 = i15 + 1;
                    if (i17 != str.length()) {
                        char cCharAt3 = str.charAt(i17);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i18 = i16 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                            bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                            i16 += 4;
                            bArr[i18] = (byte) ((codePoint & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                            i15 = i17;
                        } else {
                            i15 = i17;
                        }
                    }
                    throw new qe1(i15 - 1, length);
                }
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | NotificationCompat.FLAG_HIGH_PRIORITY);
                bArr[i16 + 2] = (byte) ((cCharAt2 & '?') | NotificationCompat.FLAG_HIGH_PRIORITY);
                i16 += 3;
            }
            i15++;
        }
        return i16;
    }

    public static int c(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char cCharAt = str.charAt(i11);
            if (cCharAt < 2048) {
                i12 += (127 - cCharAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new qe1(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + 4294967296L));
    }

    public static String d(int i10, byte[] bArr, int i11) {
        f8585a.getClass();
        return mb1.e(i10, bArr, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(int r6, byte[] r7, int r8) {
        /*
            com.google.android.gms.internal.ads.mb1 r0 = com.google.android.gms.internal.ads.re1.f8585a
            r0.getClass()
        L5:
            if (r6 >= r8) goto Le
            r0 = r7[r6]
            if (r0 < 0) goto Le
            int r6 = r6 + 1
            goto L5
        Le:
            if (r6 < r8) goto L11
            goto L5e
        L11:
            if (r6 < r8) goto L14
            goto L5e
        L14:
            int r0 = r6 + 1
            r1 = r7[r6]
            if (r1 >= 0) goto L7d
            r2 = -32
            r3 = -65
            if (r1 >= r2) goto L2e
            if (r0 < r8) goto L23
            goto L5c
        L23:
            r2 = -62
            if (r1 < r2) goto L7b
            int r6 = r6 + 2
            r0 = r7[r0]
            if (r0 <= r3) goto L11
            goto L7b
        L2e:
            r4 = -16
            if (r1 >= r4) goto L54
            int r4 = r8 + (-1)
            if (r0 < r4) goto L3b
            int r1 = a(r0, r7, r8)
            goto L5c
        L3b:
            int r4 = r6 + 2
            r0 = r7[r0]
            if (r0 > r3) goto L7b
            r5 = -96
            if (r1 != r2) goto L47
            if (r0 < r5) goto L7b
        L47:
            r2 = -19
            if (r1 != r2) goto L4d
            if (r0 >= r5) goto L7b
        L4d:
            int r6 = r6 + 3
            r0 = r7[r4]
            if (r0 <= r3) goto L11
            goto L7b
        L54:
            int r2 = r8 + (-2)
            if (r0 < r2) goto L60
            int r1 = a(r0, r7, r8)
        L5c:
            if (r1 != 0) goto L7b
        L5e:
            r6 = 1
            return r6
        L60:
            int r2 = r6 + 2
            r0 = r7[r0]
            if (r0 > r3) goto L7b
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L7b
            int r0 = r6 + 3
            r1 = r7[r2]
            if (r1 > r3) goto L7b
            int r6 = r6 + 4
            r0 = r7[r0]
            if (r0 <= r3) goto L11
        L7b:
            r6 = 0
            return r6
        L7d:
            r6 = r0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.re1.e(int, byte[], int):boolean");
    }
}
