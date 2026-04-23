package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ex0 extends dx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f4315a;

    public ex0(char c10) {
        this.f4315a = c10;
    }

    public final String toString() {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i10 = this.f4315a;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        return fb1.i("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}
