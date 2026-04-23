package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f3531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3533e;

    public /* synthetic */ d1(byte[] bArr, int i10) {
        this.f3529a = 1;
        this.f3531c = bArr;
        this.f3533e = i10;
    }

    public int a() {
        switch (this.f3529a) {
            case 0:
                return (this.f3532d * 8) + this.f3533e;
            default:
                return ((this.f3533e - this.f3530b) * 8) - this.f3532d;
        }
    }

    public int b() {
        tc1.W(this.f3532d == 0);
        return this.f3530b;
    }

    public int c(int i10) {
        int i11 = this.f3532d;
        int i12 = 8 - this.f3533e;
        int i13 = i11 + 1;
        byte[] bArr = this.f3531c;
        int iMin = Math.min(i10, i12);
        int i14 = ((bArr[i11] & 255) >> this.f3533e) & (255 >> (8 - iMin));
        while (iMin < i10) {
            i14 |= (this.f3531c[i13] & 255) << iMin;
            iMin += 8;
            i13++;
        }
        int i15 = i14 & ((-1) >>> (32 - i10));
        d(i10);
        return i15;
    }

    public void d(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f3532d + i12;
        this.f3532d = i13;
        int i14 = (i10 - (i12 * 8)) + this.f3533e;
        this.f3533e = i14;
        if (i14 > 7) {
            i13++;
            this.f3532d = i13;
            i14 -= 8;
            this.f3533e = i14;
        }
        boolean z9 = false;
        if (i13 >= 0 && (i13 < (i11 = this.f3530b) || (i13 == i11 && i14 == 0))) {
            z9 = true;
        }
        tc1.W(z9);
    }

    public int e(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f3532d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f3532d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f3532d = i13;
            byte[] bArr = this.f3531c;
            int i14 = this.f3530b;
            this.f3530b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f3531c;
        int i15 = this.f3530b;
        int i16 = i12 | ((bArr2[i15] & 255) >> (8 - i11));
        int i17 = 32 - i10;
        if (i11 == 8) {
            this.f3532d = 0;
            this.f3530b = i15 + 1;
        }
        int i18 = ((-1) >>> i17) & i16;
        p();
        return i18;
    }

    public boolean f() {
        int i10 = (this.f3531c[this.f3532d] & 255) >> this.f3533e;
        d(1);
        return 1 == (i10 & 1);
    }

    public long g(int i10) {
        if (i10 <= 32) {
            int iE = e(i10);
            int i11 = yn0.f10944a;
            return 4294967295L & ((long) iE);
        }
        int iE2 = e(i10 - 32);
        int iE3 = e(32);
        int i12 = yn0.f10944a;
        return (4294967295L & ((long) iE3)) | ((((long) iE2) & 4294967295L) << 32);
    }

    public void h() {
        if (this.f3532d == 0) {
            return;
        }
        this.f3532d = 0;
        this.f3530b++;
        p();
    }

    public void i(byte[] bArr, int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = i10 >> 3;
            if (i12 >= i11) {
                break;
            }
            byte[] bArr2 = this.f3531c;
            int i13 = this.f3530b;
            int i14 = i13 + 1;
            this.f3530b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f3532d;
            byte b11 = (byte) (b10 << i15);
            bArr[i12] = b11;
            bArr[i12] = (byte) (((bArr2[i14] & 255) >> (8 - i15)) | b11);
            i12++;
        }
        int i16 = i10 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i11] & (255 >> i16));
        bArr[i11] = b12;
        int i17 = this.f3532d;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f3531c;
            int i18 = this.f3530b;
            this.f3530b = i18 + 1;
            b12 = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            bArr[i11] = b12;
            i17 -= 8;
        }
        int i19 = i17 + i16;
        this.f3532d = i19;
        byte[] bArr4 = this.f3531c;
        int i20 = this.f3530b;
        bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | b12);
        if (i19 == 8) {
            this.f3532d = 0;
            this.f3530b = i20 + 1;
        }
        p();
    }

    public void j(ik0 ik0Var) {
        byte[] bArr = ik0Var.f5633a;
        int i10 = ik0Var.f5635c;
        this.f3531c = bArr;
        this.f3530b = 0;
        this.f3532d = 0;
        this.f3533e = i10;
        k(ik0Var.f5634b * 8);
    }

    public void k(int i10) {
        int i11 = i10 / 8;
        this.f3530b = i11;
        this.f3532d = i10 - (i11 * 8);
        p();
    }

    public void l() {
        int i10 = this.f3532d + 1;
        this.f3532d = i10;
        if (i10 == 8) {
            this.f3532d = 0;
            this.f3530b++;
        }
        p();
    }

    public void m(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f3530b + i11;
        this.f3530b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f3532d;
        this.f3532d = i13;
        if (i13 > 7) {
            this.f3530b = i12 + 1;
            this.f3532d = i13 - 8;
        }
        p();
    }

    public void n(int i10) {
        tc1.W(this.f3532d == 0);
        this.f3530b += i10;
        p();
    }

    public boolean o() {
        int i10 = this.f3531c[this.f3530b] & (NotificationCompat.FLAG_HIGH_PRIORITY >> this.f3532d);
        l();
        return i10 != 0;
    }

    public void p() {
        int i10;
        int i11 = this.f3530b;
        boolean z9 = false;
        if (i11 >= 0 && (i11 < (i10 = this.f3533e) || (i11 == i10 && this.f3532d == 0))) {
            z9 = true;
        }
        tc1.W(z9);
    }

    public /* synthetic */ d1() {
        this.f3529a = 1;
        this.f3531c = yn0.f10949f;
    }

    public /* synthetic */ d1(byte[] bArr) {
        this.f3529a = 0;
        this.f3531c = bArr;
        this.f3530b = bArr.length;
    }
}
