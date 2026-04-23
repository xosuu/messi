package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class sn1 implements io1, ho1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io1 f8930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ho1 f8931b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public rn1[] f8932d = new rn1[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8933f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8934h;

    public sn1(do1 do1Var, long j10) {
        this.f8930a = do1Var;
        this.f8934h = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // com.google.android.gms.internal.ads.io1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f8933f = r0
            com.google.android.gms.internal.ads.rn1[] r0 = r7.f8932d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f8667b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            com.google.android.gms.internal.ads.io1 r0 = r7.f8930a
            long r0 = r0.a(r8)
            r3 = 1
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L34
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L35
            long r8 = r7.f8934h
            r4 = -9223372036854775808
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L34
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 > 0) goto L35
        L34:
            r2 = 1
        L35:
            com.google.android.gms.internal.ads.tc1.W(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sn1.a(long):long");
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final void b(long j10) {
        this.f8930a.b(j10);
    }

    @Override // com.google.android.gms.internal.ads.ho1
    public final /* bridge */ /* synthetic */ void c(ep1 ep1Var) {
        ho1 ho1Var = this.f8931b;
        ho1Var.getClass();
        ho1Var.c(this);
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void d(long j10) {
        this.f8930a.d(j10);
    }

    @Override // com.google.android.gms.internal.ads.ho1
    public final void e(io1 io1Var) {
        ho1 ho1Var = this.f8931b;
        ho1Var.getClass();
        ho1Var.e(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    @Override // com.google.android.gms.internal.ads.io1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(com.google.android.gms.internal.ads.cq1[] r15, boolean[] r16, com.google.android.gms.internal.ads.dp1[] r17, boolean[] r18, long r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r17
            int r2 = r1.length
            com.google.android.gms.internal.ads.rn1[] r3 = new com.google.android.gms.internal.ads.rn1[r2]
            r0.f8932d = r3
            com.google.android.gms.internal.ads.dp1[] r2 = new com.google.android.gms.internal.ads.dp1[r2]
            r3 = 0
            r4 = 0
        Lc:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L21
            com.google.android.gms.internal.ads.rn1[] r5 = r0.f8932d
            r6 = r1[r4]
            com.google.android.gms.internal.ads.rn1 r6 = (com.google.android.gms.internal.ads.rn1) r6
            r5[r4] = r6
            if (r6 == 0) goto L1c
            com.google.android.gms.internal.ads.dp1 r11 = r6.f8666a
        L1c:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lc
        L21:
            com.google.android.gms.internal.ads.io1 r4 = r0.f8930a
            r5 = r15
            r6 = r16
            r7 = r2
            r8 = r18
            r9 = r19
            long r4 = r4.f(r5, r6, r7, r8, r9)
            boolean r6 = r14.i()
            r7 = 0
            if (r6 == 0) goto L3d
            int r6 = (r19 > r7 ? 1 : (r19 == r7 ? 0 : -1))
            if (r6 != 0) goto L3d
            r9 = r7
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f8933f = r12
            r6 = 1
            int r12 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 < 0) goto L5c
            long r7 = r0.f8934h
            r9 = -9223372036854775808
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L5d
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 > 0) goto L5c
            goto L5d
        L5c:
            r6 = 0
        L5d:
            com.google.android.gms.internal.ads.tc1.W(r6)
        L60:
            int r6 = r1.length
            if (r3 >= r6) goto L86
            r6 = r2[r3]
            if (r6 != 0) goto L6c
            com.google.android.gms.internal.ads.rn1[] r6 = r0.f8932d
            r6[r3] = r11
            goto L7d
        L6c:
            com.google.android.gms.internal.ads.rn1[] r7 = r0.f8932d
            r8 = r7[r3]
            if (r8 == 0) goto L76
            com.google.android.gms.internal.ads.dp1 r8 = r8.f8666a
            if (r8 == r6) goto L7d
        L76:
            com.google.android.gms.internal.ads.rn1 r8 = new com.google.android.gms.internal.ads.rn1
            r8.<init>(r14, r6)
            r7[r3] = r8
        L7d:
            com.google.android.gms.internal.ads.rn1[] r6 = r0.f8932d
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L60
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sn1.f(com.google.android.gms.internal.ads.cq1[], boolean[], com.google.android.gms.internal.ads.dp1[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean g(fj1 fj1Var) {
        return this.f8930a.g(fj1Var);
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void h(ho1 ho1Var, long j10) {
        this.f8931b = ho1Var;
        this.f8930a.h(this, j10);
    }

    public final boolean i() {
        return this.f8933f != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long k(long j10, ak1 ak1Var) {
        if (j10 == 0) {
            return 0L;
        }
        long jMax = Math.max(0L, Math.min(ak1Var.f2721a, j10));
        long j11 = this.f8934h;
        long j12 = j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j10;
        long j13 = ak1Var.f2722b;
        long jMax2 = Math.max(0L, Math.min(j13, j12));
        if (jMax != ak1Var.f2721a || jMax2 != j13) {
            ak1Var = new ak1(jMax, jMax2);
        }
        return this.f8930a.k(j10, ak1Var);
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzb() {
        long jZzb = this.f8930a.zzb();
        if (jZzb != Long.MIN_VALUE) {
            long j10 = this.f8934h;
            if (j10 == Long.MIN_VALUE || jZzb < j10) {
                return jZzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzc() {
        long jZzc = this.f8930a.zzc();
        if (jZzc != Long.MIN_VALUE) {
            long j10 = this.f8934h;
            if (j10 == Long.MIN_VALUE || jZzc < j10) {
                return jZzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long zzd() {
        if (i()) {
            long j10 = this.f8933f;
            this.f8933f = -9223372036854775807L;
            long jZzd = zzd();
            return jZzd != -9223372036854775807L ? jZzd : j10;
        }
        long jZzd2 = this.f8930a.zzd();
        if (jZzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        tc1.W(jZzd2 >= 0);
        long j11 = this.f8934h;
        tc1.W(j11 == Long.MIN_VALUE || jZzd2 <= j11);
        return jZzd2;
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final kp1 zzi() {
        return this.f8930a.zzi();
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void zzk() {
        this.f8930a.zzk();
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean zzp() {
        return this.f8930a.zzp();
    }
}
