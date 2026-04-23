package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f10688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f10689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f10690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10691d;

    public y(v vVar, x xVar, long j10, long j11, long j12, long j13, long j14, int i10) {
        this.f10689b = xVar;
        this.f10691d = i10;
        this.f10688a = new t(vVar, j10, j11, j12, j13, j14);
    }

    public static final int c(h0 h0Var, long j10, k0 k0Var) {
        if (j10 == h0Var.zzf()) {
            return 0;
        }
        k0Var.f6130a = j10;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
    
        return c(r18, r8, r19);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(com.google.android.gms.internal.ads.h0 r18, com.google.android.gms.internal.ads.k0 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
        L6:
            com.google.android.gms.internal.ads.u r3 = r0.f10690c
            com.google.android.gms.internal.ads.tc1.A(r3)
            long r4 = r3.f9326g
            long r6 = r3.f9327h
            long r6 = r6 - r4
            long r8 = r3.f9328i
            int r10 = r0.f10691d
            long r10 = (long) r10
            r12 = 0
            com.google.android.gms.internal.ads.x r13 = r0.f10689b
            int r14 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r14 > 0) goto L26
            r0.f10690c = r12
            r13.zzb()
            int r1 = c(r1, r4, r2)
            return r1
        L26:
            long r4 = r18.zzf()
            long r4 = r8 - r4
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto L98
            r10 = 262144(0x40000, double:1.295163E-318)
            int r14 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r14 > 0) goto L98
            int r5 = (int) r4
            r4 = r1
            com.google.android.gms.internal.ads.a0 r4 = (com.google.android.gms.internal.ads.a0) r4
            r4.j(r5)
            r18.zzj()
            long r4 = r3.f9322c
            com.google.android.gms.internal.ads.w r4 = r13.d(r1, r4)
            int r5 = r4.f10011a
            r14 = -3
            if (r5 == r14) goto L8b
            r8 = -2
            long r14 = r4.f10012b
            r16 = r13
            long r12 = r4.f10013c
            if (r5 == r8) goto L82
            r4 = -1
            if (r5 == r4) goto L7a
            long r3 = r18.zzf()
            long r3 = r12 - r3
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 < 0) goto L6f
            int r5 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r5 > 0) goto L6f
            int r4 = (int) r3
            r3 = r1
            com.google.android.gms.internal.ads.a0 r3 = (com.google.android.gms.internal.ads.a0) r3
            r3.j(r4)
        L6f:
            r3 = 0
            r0.f10690c = r3
            r16.zzb()
            int r1 = c(r1, r12, r2)
            return r1
        L7a:
            r3.f9325f = r14
            r3.f9327h = r12
            r3.b()
            goto L6
        L82:
            r3.f9324e = r14
            r3.f9326g = r12
            r3.b()
            goto L6
        L8b:
            r3 = r12
            r16 = r13
            r0.f10690c = r3
            r16.zzb()
            int r1 = c(r1, r8, r2)
            return r1
        L98:
            int r1 = c(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.y.a(com.google.android.gms.internal.ads.h0, com.google.android.gms.internal.ads.k0):int");
    }

    public final void b(long j10) {
        u uVar = this.f10690c;
        if (uVar == null || uVar.f9321b != j10) {
            t tVar = this.f10688a;
            this.f10690c = new u(j10, tVar.f8999a.f(j10), tVar.f9001c, tVar.f9002d, tVar.f9003e, tVar.f9004f);
        }
    }
}
