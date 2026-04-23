package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l2 implements g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i0 f6460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b1 f6461f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public zzbk f6464i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f6466k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f6467l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6468m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n2 f6469n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f6470o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik0 f6456a = new ik0(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t0 f6457b = new t0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f6458c = new o0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f6465j = -9223372036854775807L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f6459d = new r0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b1 f6462g = new f0();

    public final boolean a(h0 h0Var) {
        n2 n2Var = this.f6469n;
        if (n2Var != null) {
            long jZzd = n2Var.zzd();
            if (jZzd != -1 && h0Var.zze() > jZzd - 4) {
                return true;
            }
        }
        try {
            return !h0Var.m(this.f6456a.f5633a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean b(h0 h0Var, boolean z9) throws zzbo, EOFException {
        int i10;
        int iZze;
        int iB0;
        h0Var.zzj();
        if (h0Var.zzf() == 0) {
            zzbk zzbkVarA = this.f6459d.a(h0Var, null);
            this.f6464i = zzbkVarA;
            if (zzbkVarA != null) {
                this.f6458c.b(zzbkVarA);
            }
            iZze = (int) h0Var.zze();
            if (!z9) {
                ((a0) h0Var).j(iZze);
            }
            i10 = 0;
        } else {
            i10 = 0;
            iZze = 0;
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (!a(h0Var)) {
                ik0 ik0Var = this.f6456a;
                ik0Var.i(0);
                int iQ = ik0Var.q();
                if ((i10 == 0 || ((-128000) & iQ) == (((long) i10) & (-128000))) && (iB0 = en1.b0(iQ)) != -1) {
                    i11++;
                    if (i11 != 1) {
                        if (i11 == 4) {
                            break;
                        }
                    } else {
                        this.f6457b.a(iQ);
                        i10 = iQ;
                    }
                    ((a0) h0Var).i(iB0 - 4, false);
                } else {
                    int i13 = i12 + 1;
                    if (i12 == (true != z9 ? 131072 : 32768)) {
                        if (z9) {
                            return false;
                        }
                        throw zzbo.a("Searched too many bytes.", null);
                    }
                    if (z9) {
                        h0Var.zzj();
                        ((a0) h0Var).i(iZze + i13, false);
                    } else {
                        ((a0) h0Var).j(1);
                    }
                    i12 = i13;
                    i10 = 0;
                    i11 = 0;
                }
            } else if (i11 <= 0) {
                throw new EOFException();
            }
        }
        if (z9) {
            ((a0) h0Var).j(iZze + i12);
        } else {
            h0Var.zzj();
        }
        this.f6463h = i10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        this.f6463h = 0;
        this.f6465j = -9223372036854775807L;
        this.f6466k = 0L;
        this.f6468m = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0247  */
    @Override // com.google.android.gms.internal.ads.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(com.google.android.gms.internal.ads.h0 r36, com.google.android.gms.internal.ads.k0 r37) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l2.d(com.google.android.gms.internal.ads.h0, com.google.android.gms.internal.ads.k0):int");
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        this.f6460e = i0Var;
        b1 b1VarJ = i0Var.j(0, 1);
        this.f6461f = b1VarJ;
        this.f6462g = b1VarJ;
        this.f6460e.i();
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        return b(h0Var, true);
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final /* synthetic */ g0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final List zzd() {
        zy0 zy0Var = bz0.f3132b;
        return wz0.f10382h;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void zzf() {
    }
}
