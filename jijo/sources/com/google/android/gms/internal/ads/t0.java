package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Serializable f9011g;

    public final boolean a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return false;
        }
        int i15 = i13 - 1;
        this.f9005a = i11;
        this.f9011g = en1.f4255t[3 - i12];
        int i16 = en1.f4256u[i14];
        this.f9007c = i16;
        if (i11 == 2) {
            i16 /= 2;
            this.f9007c = i16;
        } else if (i11 == 0) {
            i16 /= 4;
            this.f9007c = i16;
        }
        int i17 = (i10 >>> 9) & 1;
        int i18 = 1152;
        if (i12 != 1) {
            if (i12 != 2) {
                i18 = 384;
            }
        } else if (i11 != 3) {
            i18 = 576;
        }
        this.f9010f = i18;
        if (i12 == 3) {
            int i19 = i11 == 3 ? en1.f4257v[i15] : en1.f4258w[i15];
            this.f9009e = i19;
            this.f9006b = (((i19 * 12) / i16) + i17) * 4;
        } else {
            if (i11 == 3) {
                int i20 = i12 == 2 ? en1.f4259x[i15] : en1.f4260y[i15];
                this.f9009e = i20;
                this.f9006b = ((i20 * 144) / i16) + i17;
            } else {
                int i21 = en1.f4261z[i15];
                this.f9009e = i21;
                this.f9006b = (((i12 == 1 ? 72 : 144) * i21) / i16) + i17;
            }
        }
        this.f9008d = ((i10 >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
