package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3194d = 0;

    public c6(byte[] bArr, int i10, int i11) {
        this.f3191a = bArr;
        this.f3193c = i10;
        this.f3192b = i11;
        g();
    }

    public final int a(int i10) {
        int i11;
        byte[] bArr;
        this.f3194d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f3194d;
            bArr = this.f3191a;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f3194d = i13;
            int i14 = this.f3193c;
            i12 |= (bArr[i14] & 255) << i13;
            if (true != h(i14 + 1)) {
                i = 1;
            }
            this.f3193c = i14 + i;
        }
        int i15 = this.f3193c;
        int i16 = i12 | ((bArr[i15] & 255) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.f3194d = 0;
            this.f3193c = i15 + (true != h(i15 + 1) ? 1 : 2);
        }
        int i18 = ((-1) >>> i17) & i16;
        g();
        return i18;
    }

    public final int b() {
        int iF = f();
        int i10 = iF % 2;
        return ((iF + 1) / 2) * (i10 == 0 ? -1 : 1);
    }

    public final void c() {
        int i10 = this.f3194d + 1;
        this.f3194d = i10;
        if (i10 == 8) {
            this.f3194d = 0;
            int i11 = this.f3193c;
            this.f3193c = i11 + (true == h(i11 + 1) ? 2 : 1);
        }
        g();
    }

    public final void d(int i10) {
        int i11 = this.f3193c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f3193c = i13;
        int i14 = (i10 - (i12 * 8)) + this.f3194d;
        this.f3194d = i14;
        if (i14 > 7) {
            this.f3193c = i13 + 1;
            this.f3194d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f3193c) {
                g();
                return;
            } else if (h(i11)) {
                this.f3193c++;
                i11 += 2;
            }
        }
    }

    public final boolean e() {
        int i10 = this.f3191a[this.f3193c] & (NotificationCompat.FLAG_HIGH_PRIORITY >> this.f3194d);
        c();
        return i10 != 0;
    }

    public final int f() {
        int i10 = 0;
        while (!e()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? a(i10) : 0);
    }

    public final void g() {
        int i10;
        int i11 = this.f3193c;
        boolean z9 = false;
        if (i11 >= 0 && (i11 < (i10 = this.f3192b) || (i11 == i10 && this.f3194d == 0))) {
            z9 = true;
        }
        tc1.W(z9);
    }

    public final boolean h(int i10) {
        if (i10 < 2 || i10 >= this.f3192b) {
            return false;
        }
        byte[] bArr = this.f3191a;
        return bArr[i10] == 3 && bArr[i10 + (-2)] == 0 && bArr[i10 + (-1)] == 0;
    }
}
