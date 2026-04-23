package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vw implements hw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hw0 f9985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9986b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hw0 f9987d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9988f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f9989h;

    public vw(ru0 ru0Var, int i10, hw0 hw0Var) {
        this.f9985a = ru0Var;
        this.f9986b = i10;
        this.f9987d = hw0Var;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void a(va1 va1Var) {
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) {
        int i12;
        long j10 = this.f9988f;
        long j11 = this.f9986b;
        if (j10 < j11) {
            int iB = this.f9985a.b(i10, bArr, (int) Math.min(i11, j11 - j10));
            long j12 = this.f9988f + ((long) iB);
            this.f9988f = j12;
            i12 = iB;
            j10 = j12;
        } else {
            i12 = 0;
        }
        if (j10 < j11) {
            return i12;
        }
        int iB2 = this.f9987d.b(i10 + i12, bArr, i11 - i12);
        int i13 = i12 + iB2;
        this.f9988f += (long) iB2;
        return i13;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final long g(iz0 iz0Var) {
        iz0 iz0Var2;
        this.f9989h = iz0Var.f5730a;
        long j10 = iz0Var.f5732c;
        iz0 iz0Var3 = null;
        long j11 = iz0Var.f5733d;
        long j12 = this.f9986b;
        if (j10 >= j12) {
            iz0Var2 = null;
        } else {
            long jMin = j12 - j10;
            if (j11 != -1) {
                jMin = Math.min(j11, jMin);
            }
            iz0Var2 = new iz0(iz0Var.f5730a, j10, jMin);
        }
        long j13 = iz0Var.f5732c;
        if (j11 == -1 || j13 + j11 > j12) {
            iz0Var3 = new iz0(iz0Var.f5730a, Math.max(j12, j13), j11 != -1 ? Math.min(j11, (j13 + j11) - j12) : -1L);
        }
        long jG = iz0Var2 != null ? this.f9985a.g(iz0Var2) : 0L;
        long jG2 = iz0Var3 != null ? this.f9987d.g(iz0Var3) : 0L;
        this.f9988f = j13;
        if (jG == -1 || jG2 == -1) {
            return -1L;
        }
        return jG + jG2;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        return this.f9989h;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() {
        this.f9985a.zzd();
        this.f9987d.zzd();
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Map zze() {
        return b01.f2859s;
    }
}
