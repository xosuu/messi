package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class f4 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f4385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4 f4386b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c4 f4391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y1 f4392h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4388d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4389e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f4390f = yn0.f10949f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ik0 f4387c = new ik0();

    public f4(b1 b1Var, a4 a4Var) {
        this.f4385a = b1Var;
        this.f4386b = a4Var;
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final void a(ik0 ik0Var, int i10, int i11) {
        if (this.f4391g == null) {
            this.f4385a.a(ik0Var, i10, i11);
            return;
        }
        g(i10);
        ik0Var.e(this.f4389e, this.f4390f, i10);
        this.f4389e += i10;
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final int b(nl1 nl1Var, int i10, boolean z9) throws EOFException {
        if (this.f4391g == null) {
            return this.f4385a.b(nl1Var, i10, z9);
        }
        g(i10);
        int iB = nl1Var.b(this.f4389e, this.f4390f, i10);
        if (iB != -1) {
            this.f4389e += iB;
            return iB;
        }
        if (z9) {
            return -1;
        }
        throw new EOFException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014d  */
    @Override // com.google.android.gms.internal.ads.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.google.android.gms.internal.ads.y1 r22) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f4.c(com.google.android.gms.internal.ads.y1):void");
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final int d(nl1 nl1Var, int i10, boolean z9) {
        return b(nl1Var, i10, z9);
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final void e(long j10, int i10, int i11, int i12, a1 a1Var) {
        if (this.f4391g == null) {
            this.f4385a.e(j10, i10, i11, i12, a1Var);
            return;
        }
        tc1.Q("DRM on subtitles is not supported", a1Var == null);
        int i13 = (this.f4389e - i12) - i11;
        this.f4391g.c(this.f4390f, i13, i11, new e4(this, j10, i10));
        int i14 = i13 + i11;
        this.f4388d = i14;
        if (i14 == this.f4389e) {
            this.f4388d = 0;
            this.f4389e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final void f(int i10, ik0 ik0Var) {
        a(ik0Var, i10, 0);
    }

    public final void g(int i10) {
        int length = this.f4390f.length;
        int i11 = this.f4389e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f4388d;
        int iMax = Math.max(i12 + i12, i10 + i12);
        byte[] bArr = this.f4390f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f4388d, bArr2, 0, i12);
        this.f4388d = 0;
        this.f4389e = i12;
        this.f4390f = bArr2;
    }
}
