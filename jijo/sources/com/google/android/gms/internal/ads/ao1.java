package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ao1 implements hw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw0 f2752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2753b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final to1 f2754d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f2755f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2756h;

    public ao1(ca1 ca1Var, int i10, to1 to1Var) {
        tc1.K(i10 > 0);
        this.f2752a = ca1Var;
        this.f2753b = i10;
        this.f2754d = to1Var;
        this.f2755f = new byte[1];
        this.f2756h = i10;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void a(va1 va1Var) {
        va1Var.getClass();
        this.f2752a.a(va1Var);
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) {
        int i12 = this.f2756h;
        hw0 hw0Var = this.f2752a;
        if (i12 == 0) {
            byte[] bArr2 = this.f2755f;
            if (hw0Var.b(0, bArr2, 1) != -1) {
                int i13 = (bArr2[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr3 = new byte[i13];
                    int i14 = i13;
                    int i15 = 0;
                    while (i14 > 0) {
                        int iB = hw0Var.b(i15, bArr3, i14);
                        if (iB != -1) {
                            i15 += iB;
                            i14 -= iB;
                        }
                    }
                    while (i13 > 0) {
                        int i16 = i13 - 1;
                        if (bArr3[i16] != 0) {
                            break;
                        }
                        i13 = i16;
                    }
                    if (i13 > 0) {
                        ik0 ik0Var = new ik0(bArr3, i13);
                        to1 to1Var = this.f2754d;
                        long jMax = !to1Var.f9220l ? to1Var.f9217i : Math.max(to1Var.f9221m.m(true), to1Var.f9217i);
                        int iN = ik0Var.n();
                        cp1 cp1Var = to1Var.f9219k;
                        cp1Var.getClass();
                        cp1Var.a(ik0Var, iN, 0);
                        cp1Var.e(jMax, 1, iN, 0, null);
                        to1Var.f9220l = true;
                    }
                }
                i12 = this.f2753b;
                this.f2756h = i12;
            }
            return -1;
        }
        int iB2 = hw0Var.b(i10, bArr, Math.min(i12, i11));
        if (iB2 != -1) {
            this.f2756h -= iB2;
        }
        return iB2;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final long g(iz0 iz0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        return this.f2752a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Map zze() {
        return this.f2752a.zze();
    }
}
