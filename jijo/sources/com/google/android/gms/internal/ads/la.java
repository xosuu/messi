package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public abstract class la {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f6543a = "0123456789abcdef".toCharArray();

    public static long a(double d10, DisplayMetrics displayMetrics) {
        return Math.round(d10 / ((double) displayMetrics.density));
    }

    public static boolean b(String str) {
        return str == null || str.isEmpty();
    }

    public static byte[] c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("String must be of even-length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i10 = 0; i10 < length; i10 += 2) {
            bArr[i10 / 2] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
        }
        return bArr;
    }
}
