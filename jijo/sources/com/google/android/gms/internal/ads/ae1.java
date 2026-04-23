package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ae1 implements pd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd1 f2669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f2671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2672d;

    public ae1(wc1 wc1Var, String str, Object[] objArr) {
        this.f2669a = wc1Var;
        this.f2670b = str;
        this.f2671c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f2672d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f2672d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    public final rd1 a() {
        return this.f2669a;
    }

    public final int b() {
        int i10 = this.f2672d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    public final String c() {
        return this.f2670b;
    }

    public final Object[] d() {
        return this.f2671c;
    }
}
