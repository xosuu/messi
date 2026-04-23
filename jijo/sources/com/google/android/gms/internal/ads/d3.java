package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f3543a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n3 f3546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a3 f3547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3551i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3554l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m3 f3544b = new m3();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ik0 f3545c = new ik0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ik0 f3552j = new ik0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ik0 f3553k = new ik0();

    public d3(b1 b1Var, n3 n3Var, a3 a3Var) {
        this.f3543a = b1Var;
        this.f3546d = n3Var;
        this.f3547e = a3Var;
        this.f3546d = n3Var;
        this.f3547e = a3Var;
        b1Var.c(n3Var.f7115a.f6157f);
        c();
    }

    public final int a(int i10, int i11) {
        ik0 ik0Var;
        l3 l3VarB = b();
        if (l3VarB == null) {
            return 0;
        }
        m3 m3Var = this.f3544b;
        int length = l3VarB.f6474d;
        if (length != 0) {
            ik0Var = m3Var.f6827n;
        } else {
            int i12 = yn0.f10944a;
            byte[] bArr = l3VarB.f6475e;
            length = bArr.length;
            ik0 ik0Var2 = this.f3553k;
            ik0Var2.g(bArr, length);
            ik0Var = ik0Var2;
        }
        boolean z9 = m3Var.f6824k && m3Var.f6825l[this.f3548f];
        boolean z10 = z9 || i11 != 0;
        int i13 = true != z10 ? 0 : NotificationCompat.FLAG_HIGH_PRIORITY;
        ik0 ik0Var3 = this.f3552j;
        ik0Var3.f5633a[0] = (byte) (i13 | length);
        ik0Var3.i(0);
        b1 b1Var = this.f3543a;
        b1Var.a(ik0Var3, 1, 1);
        b1Var.a(ik0Var, length, 1);
        if (!z10) {
            return length + 1;
        }
        ik0 ik0Var4 = this.f3545c;
        if (!z9) {
            ik0Var4.f(8);
            byte[] bArr2 = ik0Var4.f5633a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) i11;
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            b1Var.a(ik0Var4, 8, 1);
            return length + 9;
        }
        int i14 = length + 1;
        ik0 ik0Var5 = m3Var.f6827n;
        int iZ = ik0Var5.z();
        ik0Var5.j(-2);
        int i15 = (iZ * 6) + 2;
        if (i11 != 0) {
            ik0Var4.f(i15);
            byte[] bArr3 = ik0Var4.f5633a;
            ik0Var5.e(0, bArr3, i15);
            int i16 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i16 >> 8) & 255);
            bArr3[3] = (byte) (i16 & 255);
        } else {
            ik0Var4 = ik0Var5;
        }
        b1Var.a(ik0Var4, i15, 1);
        return i14 + i15;
    }

    public final l3 b() {
        if (!this.f3554l) {
            return null;
        }
        m3 m3Var = this.f3544b;
        a3 a3Var = m3Var.f6814a;
        int i10 = yn0.f10944a;
        int i11 = a3Var.f2568a;
        l3 l3Var = m3Var.f6826m;
        if (l3Var == null) {
            l3Var = this.f3546d.f7115a.f6162k[i11];
        }
        if (l3Var == null || !l3Var.f6471a) {
            return null;
        }
        return l3Var;
    }

    public final void c() {
        m3 m3Var = this.f3544b;
        m3Var.f6817d = 0;
        m3Var.f6829p = 0L;
        m3Var.f6830q = false;
        m3Var.f6824k = false;
        m3Var.f6828o = false;
        m3Var.f6826m = null;
        this.f3548f = 0;
        this.f3550h = 0;
        this.f3549g = 0;
        this.f3551i = 0;
        this.f3554l = false;
    }

    public final boolean d() {
        this.f3548f++;
        if (!this.f3554l) {
            return false;
        }
        int i10 = this.f3549g + 1;
        this.f3549g = i10;
        int[] iArr = this.f3544b.f6820g;
        int i11 = this.f3550h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f3550h = i11 + 1;
        this.f3549g = 0;
        return false;
    }
}
