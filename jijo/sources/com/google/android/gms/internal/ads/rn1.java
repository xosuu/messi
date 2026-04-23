package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class rn1 implements dp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp1 f8666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sn1 f8668c;

    public rn1(sn1 sn1Var, dp1 dp1Var) {
        this.f8668c = sn1Var;
        this.f8666a = dp1Var;
    }

    @Override // com.google.android.gms.internal.ads.dp1
    public final int a(long j10) {
        if (this.f8668c.i()) {
            return -3;
        }
        return this.f8666a.a(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    @Override // com.google.android.gms.internal.ads.dp1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(com.google.android.gms.internal.ads.cj0 r12, com.google.android.gms.internal.ads.wf1 r13, int r14) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.sn1 r0 = r11.f8668c
            boolean r1 = r0.i()
            r2 = -3
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r11.f8667b
            r3 = 4
            r4 = -4
            if (r1 == 0) goto L13
            r13.f9035b = r3
            return r4
        L13:
            long r5 = r0.zzb()
            com.google.android.gms.internal.ads.dp1 r1 = r11.f8666a
            int r14 = r1.b(r12, r13, r14)
            r1 = -5
            r7 = -9223372036854775808
            if (r14 != r1) goto L4c
            java.lang.Object r13 = r12.f3301b
            com.google.android.gms.internal.ads.y1 r13 = (com.google.android.gms.internal.ads.y1) r13
            r13.getClass()
            r14 = 0
            int r2 = r13.D
            int r3 = r13.C
            if (r3 != 0) goto L33
            if (r2 == 0) goto L4b
            r3 = 0
        L33:
            long r4 = r0.f8934h
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 == 0) goto L3a
            goto L3b
        L3a:
            r14 = r2
        L3b:
            com.google.android.gms.internal.ads.q0 r0 = new com.google.android.gms.internal.ads.q0
            r0.<init>(r13)
            r0.B = r3
            r0.C = r14
            com.google.android.gms.internal.ads.y1 r13 = new com.google.android.gms.internal.ads.y1
            r13.<init>(r0)
            r12.f3301b = r13
        L4b:
            return r1
        L4c:
            long r0 = r0.f8934h
            int r12 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r12 == 0) goto L6d
            if (r14 != r4) goto L5a
            long r9 = r13.f10173g
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 >= 0) goto L64
        L5a:
            if (r14 != r2) goto L6d
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 != 0) goto L6d
            boolean r12 = r13.f10172f
            if (r12 != 0) goto L6d
        L64:
            r13.d()
            r13.f9035b = r3
            r12 = 1
            r11.f8667b = r12
            return r4
        L6d:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rn1.b(com.google.android.gms.internal.ads.cj0, com.google.android.gms.internal.ads.wf1, int):int");
    }

    @Override // com.google.android.gms.internal.ads.dp1
    public final void zzd() {
        this.f8666a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.dp1
    public final boolean zze() {
        return !this.f8668c.i() && this.f8666a.zze();
    }
}
