package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class i5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f5487c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5485a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5486b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5488d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f5489e = -3.4028235E38f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5490f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5491g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f5492h = -3.4028235E38f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5493i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f5494j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5495k = Integer.MIN_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.n50 a() {
        /*
            r13 = this;
            float r0 = r13.f5492h
            r1 = 0
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 5
            r4 = 4
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r7 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r7 == 0) goto L11
            goto L1e
        L11:
            int r0 = r13.f5488d
            if (r0 == r4) goto L1d
            if (r0 == r3) goto L1a
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L1e
        L1a:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            int r7 = r13.f5493i
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 3
            r10 = 2
            r11 = 1
            if (r7 == r8) goto L28
            goto L37
        L28:
            int r7 = r13.f5488d
            if (r7 == r11) goto L36
            if (r7 == r9) goto L34
            if (r7 == r4) goto L36
            if (r7 == r3) goto L34
            r7 = 1
            goto L37
        L34:
            r7 = 2
            goto L37
        L36:
            r7 = 0
        L37:
            com.google.android.gms.internal.ads.n50 r8 = new com.google.android.gms.internal.ads.n50
            r8.<init>()
            int r12 = r13.f5488d
            if (r12 == r11) goto L55
            if (r12 == r10) goto L52
            if (r12 == r9) goto L4f
            if (r12 == r4) goto L55
            if (r12 == r3) goto L4f
            java.lang.String r3 = "Unknown textAlignment: "
            com.google.android.gms.internal.ads.fb1.u(r3, r12)
            r3 = 0
            goto L57
        L4f:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L57
        L52:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L57
        L55:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L57:
            r8.f7162c = r3
            float r3 = r13.f5489e
            int r4 = r13.f5490f
            int r9 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r9 == 0) goto L6e
            if (r4 != 0) goto L6e
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L6b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L6e
        L6b:
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L74
        L6e:
            if (r9 != 0) goto L73
            if (r4 != 0) goto L74
            goto L6b
        L73:
            r6 = r3
        L74:
            r8.f7164e = r6
            r8.f7165f = r4
            int r1 = r13.f5491g
            r8.f7166g = r1
            r8.f7167h = r0
            r8.f7168i = r7
            float r1 = r13.f5494j
            if (r7 == 0) goto L9d
            if (r7 == r11) goto L93
            if (r7 != r10) goto L89
            goto L9f
        L89:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r7)
            r0.<init>(r1)
            throw r0
        L93:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L99
            float r0 = r0 + r0
            goto L9f
        L99:
            float r5 = r5 - r0
            float r0 = r5 + r5
            goto L9f
        L9d:
            float r0 = r5 - r0
        L9f:
            float r0 = java.lang.Math.min(r1, r0)
            r8.f7171l = r0
            int r0 = r13.f5495k
            r8.f7173n = r0
            java.lang.CharSequence r0 = r13.f5487c
            if (r0 == 0) goto Laf
            r8.f7160a = r0
        Laf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i5.a():com.google.android.gms.internal.ads.n50");
    }
}
