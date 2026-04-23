package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class uo1 implements dp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wo1 f9555b;

    public uo1(wo1 wo1Var, int i10) {
        this.f9555b = wo1Var;
        this.f9554a = i10;
    }

    @Override // com.google.android.gms.internal.ads.dp1
    public final int a(long j10) {
        int iG;
        wo1 wo1Var = this.f9555b;
        int i10 = this.f9554a;
        if (wo1Var.v()) {
            return 0;
        }
        wo1Var.r(i10);
        cp1 cp1Var = wo1Var.B[i10];
        boolean z9 = wo1Var.U;
        synchronized (cp1Var) {
            int i11 = cp1Var.f3375q;
            int iH = cp1Var.h(i11);
            int i12 = cp1Var.f3375q;
            int i13 = cp1Var.f3372n;
            if (i12 != i13 && j10 >= cp1Var.f3370l[iH]) {
                if (j10 <= cp1Var.f3378t || !z9) {
                    iG = cp1Var.g(iH, i13 - i11, j10, true);
                    if (iG == -1) {
                    }
                } else {
                    iG = i13 - i11;
                }
            }
            iG = 0;
        }
        cp1Var.p(iG);
        if (iG != 0) {
            return iG;
        }
        wo1Var.s(i10);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.dp1
    public final int b(cj0 cj0Var, wf1 wf1Var, int i10) {
        int i11;
        int i12;
        wo1 wo1Var = this.f9555b;
        int i13 = this.f9554a;
        if (wo1Var.v()) {
            return -3;
        }
        wo1Var.r(i13);
        cp1 cp1Var = wo1Var.B[i13];
        boolean z9 = wo1Var.U;
        cp1Var.getClass();
        boolean z10 = (i10 & 2) != 0;
        e4 e4Var = cp1Var.f3360b;
        synchronized (cp1Var) {
            try {
                wf1Var.f10172f = false;
                int i14 = cp1Var.f3375q;
                i11 = -4;
                if (i14 != cp1Var.f3372n) {
                    y1 y1Var = ((ap1) cp1Var.f3361c.a(cp1Var.f3373o + i14)).f2763a;
                    if (!z10 && y1Var == cp1Var.f3364f) {
                        int iH = cp1Var.h(cp1Var.f3375q);
                        if (cp1Var.A != null) {
                            int i15 = cp1Var.f3369k[iH];
                            wf1Var.f10172f = true;
                            i12 = -3;
                        } else {
                            int i16 = cp1Var.f3369k[iH];
                            wf1Var.f9035b = i16;
                            if (cp1Var.f3375q == cp1Var.f3372n - 1 && (z9 || cp1Var.f3379u)) {
                                wf1Var.f9035b = 536870912 | i16;
                            }
                            wf1Var.f10173g = cp1Var.f3370l[iH];
                            e4Var.f3851b = cp1Var.f3368j[iH];
                            e4Var.f3852d = cp1Var.f3367i[iH];
                            e4Var.f3853f = cp1Var.f3371m[iH];
                            i12 = -4;
                        }
                    }
                    cp1Var.j(y1Var, cj0Var);
                    i12 = -5;
                } else {
                    if (!z9 && !cp1Var.f3379u) {
                        y1 y1Var2 = cp1Var.f3382x;
                        if (y1Var2 == null || (!z10 && y1Var2 == cp1Var.f3364f)) {
                            i12 = -3;
                        }
                        cp1Var.j(y1Var2, cj0Var);
                        i12 = -5;
                    }
                    wf1Var.f9035b = 4;
                    wf1Var.f10173g = Long.MIN_VALUE;
                    i12 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i12 != -4) {
            i11 = i12;
        } else if (!wf1Var.a(4)) {
            int i17 = i10 & 1;
            if ((i10 & 4) == 0) {
                if (i17 != 0) {
                    zo1 zo1Var = cp1Var.f3359a;
                    zo1.e(zo1Var.f11283c, wf1Var, cp1Var.f3360b, zo1Var.f11281a);
                } else {
                    zo1 zo1Var2 = cp1Var.f3359a;
                    zo1Var2.f11283c = zo1.e(zo1Var2.f11283c, wf1Var, cp1Var.f3360b, zo1Var2.f11281a);
                    cp1Var.f3375q++;
                }
            } else if (i17 == 0) {
                cp1Var.f3375q++;
            }
        }
        if (i11 == -3) {
            wo1Var.s(i13);
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.dp1
    public final void zzd() throws IOException {
        IOException iOException;
        wo1 wo1Var = this.f9555b;
        oi1 oi1Var = wo1Var.B[this.f9554a].A;
        if (oi1Var != null) {
            throw ((zzrb) oi1Var.f7585b);
        }
        int i10 = wo1Var.L == 7 ? 6 : 3;
        oq1 oq1Var = wo1Var.f10266t;
        IOException iOException2 = oq1Var.f7640c;
        if (iOException2 != null) {
            throw iOException2;
        }
        mq1 mq1Var = oq1Var.f7639b;
        if (mq1Var != null && (iOException = mq1Var.f7032f) != null && mq1Var.f7033h > i10) {
            throw iOException;
        }
    }

    @Override // com.google.android.gms.internal.ads.dp1
    public final boolean zze() {
        wo1 wo1Var = this.f9555b;
        return !wo1Var.v() && wo1Var.B[this.f9554a].q(wo1Var.U);
    }
}
