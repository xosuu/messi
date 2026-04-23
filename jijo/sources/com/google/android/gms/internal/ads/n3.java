package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3 f7115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f7117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f7118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f7120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f7121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7122h;

    public n3(k3 k3Var, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        int length = iArr.length;
        int length2 = jArr2.length;
        tc1.K(length == length2);
        int length3 = jArr.length;
        tc1.K(length3 == length2);
        int length4 = iArr2.length;
        tc1.K(length4 == length2);
        this.f7115a = k3Var;
        this.f7117c = jArr;
        this.f7118d = iArr;
        this.f7119e = i10;
        this.f7120f = jArr2;
        this.f7121g = iArr2;
        this.f7122h = j10;
        this.f7116b = length3;
        if (length4 > 0) {
            int i11 = length4 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int a(long j10) {
        int i10;
        int i11 = yn0.f10944a;
        long[] jArr = this.f7120f;
        int iBinarySearch = Arrays.binarySearch(jArr, j10);
        if (iBinarySearch < 0) {
            i10 = ~iBinarySearch;
        } else {
            while (true) {
                int i12 = iBinarySearch + 1;
                if (i12 >= jArr.length || jArr[i12] != j10) {
                    break;
                }
                iBinarySearch = i12;
            }
            i10 = iBinarySearch;
        }
        while (i10 < jArr.length) {
            if ((this.f7121g[i10] & 1) != 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
