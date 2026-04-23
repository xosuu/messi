package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a1 f6473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f6475e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l3(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            if (r11 != 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            r2 = r2 ^ r3
            com.google.android.gms.internal.ads.tc1.K(r2)
            r4.f6471a = r5
            r4.f6472b = r6
            r4.f6474d = r7
            r4.f6475e = r11
            com.google.android.gms.internal.ads.a1 r5 = new com.google.android.gms.internal.ads.a1
            if (r6 != 0) goto L20
            goto L72
        L20:
            int r7 = r6.hashCode()
            r11 = 3
            r2 = 2
            switch(r7) {
                case 3046605: goto L47;
                case 3046671: goto L3d;
                case 3049879: goto L34;
                case 3049895: goto L2a;
                default: goto L29;
            }
        L29:
            goto L51
        L2a:
            java.lang.String r7 = "cens"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = 1
            goto L52
        L34:
            java.lang.String r7 = "cenc"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            goto L52
        L3d:
            java.lang.String r7 = "cbcs"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = 3
            goto L52
        L47:
            java.lang.String r7 = "cbc1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L51
            r0 = 2
            goto L52
        L51:
            r0 = -1
        L52:
            if (r0 == 0) goto L72
            if (r0 == r1) goto L72
            if (r0 == r2) goto L71
            if (r0 == r11) goto L71
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r11 = "Unsupported protection scheme type '"
            r7.<init>(r11)
            r7.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.google.android.gms.internal.ads.fg0.f(r6)
            goto L72
        L71:
            r1 = 2
        L72:
            r5.<init>(r1, r9, r10, r8)
            r4.f6473c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l3.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
