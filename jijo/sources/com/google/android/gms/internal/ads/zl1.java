package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zl1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y1 f11268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w10 f11276i;

    public zl1(y1 y1Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, w10 w10Var) {
        this.f11268a = y1Var;
        this.f11269b = i10;
        this.f11270c = i11;
        this.f11271d = i12;
        this.f11272e = i13;
        this.f11273f = i14;
        this.f11274g = i15;
        this.f11275h = i16;
        this.f11276i = w10Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.media.AudioTrack a(int r12, com.google.android.gms.internal.ads.ce1 r13) {
        /*
            r11 = this;
            int r0 = r11.f11270c
            r1 = 0
            r2 = 1
            int r3 = com.google.android.gms.internal.ads.yn0.f10944a     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            r4 = 29
            int r5 = r11.f11274g
            int r6 = r11.f11273f
            int r7 = r11.f11272e
            if (r3 < r4) goto L4c
            android.media.AudioFormat r3 = com.google.android.gms.internal.ads.yn0.y(r7, r6, r5)     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            com.google.android.gms.internal.ads.aa r13 = r13.a()     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            java.lang.Object r13 = r13.f2626b     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            android.media.AudioAttributes r13 = (android.media.AudioAttributes) r13     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            com.google.android.gms.internal.ads.yl1.l()     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            android.media.AudioTrack$Builder r4 = android.support.v4.media.c.h()     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            android.media.AudioTrack$Builder r13 = android.support.v4.media.c.k(r4, r13)     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            android.media.AudioTrack$Builder r13 = android.support.v4.media.c.l(r13, r3)     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            android.media.AudioTrack$Builder r13 = android.support.v4.media.c.i(r13)     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            int r3 = r11.f11275h     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            android.media.AudioTrack$Builder r13 = android.support.v4.media.c.j(r13, r3)     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            android.media.AudioTrack$Builder r12 = android.support.v4.media.c.D(r13, r12)     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            if (r0 != r2) goto L3d
            r13 = 1
            goto L3e
        L3d:
            r13 = 0
        L3e:
            android.media.AudioTrack$Builder r12 = androidx.core.app.n.e(r12, r13)     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            android.media.AudioTrack r12 = android.support.v4.media.c.m(r12)     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            goto L64
        L47:
            r12 = move-exception
        L48:
            r10 = r12
            goto L83
        L4a:
            r12 = move-exception
            goto L48
        L4c:
            android.media.AudioTrack r9 = new android.media.AudioTrack     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            com.google.android.gms.internal.ads.aa r13 = r13.a()     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            java.lang.Object r13 = r13.f2626b     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            r4 = r13
            android.media.AudioAttributes r4 = (android.media.AudioAttributes) r4     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            android.media.AudioFormat r5 = com.google.android.gms.internal.ads.yn0.y(r7, r6, r5)     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            int r6 = r11.f11275h     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            r7 = 1
            r3 = r9
            r8 = r12
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalArgumentException -> L47 java.lang.UnsupportedOperationException -> L4a
            r12 = r9
        L64:
            int r4 = r12.getState()
            if (r4 != r2) goto L6b
            return r12
        L6b:
            r12.release()     // Catch: java.lang.Exception -> L6e
        L6e:
            int r5 = r11.f11272e
            int r6 = r11.f11273f
            int r7 = r11.f11275h
            com.google.android.gms.internal.ads.y1 r8 = r11.f11268a
            com.google.android.gms.internal.ads.zzph r12 = new com.google.android.gms.internal.ads.zzph
            if (r0 != r2) goto L7c
            r9 = 1
            goto L7d
        L7c:
            r9 = 0
        L7d:
            r10 = 0
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            throw r12
        L83:
            int r5 = r11.f11272e
            int r6 = r11.f11273f
            int r7 = r11.f11275h
            com.google.android.gms.internal.ads.y1 r8 = r11.f11268a
            com.google.android.gms.internal.ads.zzph r12 = new com.google.android.gms.internal.ads.zzph
            r4 = 0
            if (r0 != r2) goto L92
            r9 = 1
            goto L93
        L92:
            r9 = 0
        L93:
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zl1.a(int, com.google.android.gms.internal.ads.ce1):android.media.AudioTrack");
    }
}
