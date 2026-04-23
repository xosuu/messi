package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class dn1 {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        androidx.core.app.n.j();
        r3 = androidx.core.app.n.f();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0097, code lost:
    
        if (r4 >= r5.size()) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        if (androidx.core.app.n.h(r5.get(r4)).covers(r3) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities r2, int r3, int r4, double r5) {
        /*
            java.util.List r2 = androidx.core.app.n.i(r2)
            r0 = 0
            if (r2 == 0) goto Lbc
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Lf
            goto Lbc
        Lf:
            int r5 = (int) r5
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = androidx.core.app.n.g(r3, r4, r5)
            r4 = 0
        L15:
            int r5 = r2.size()
            r6 = 1
            if (r4 >= r5) goto L2f
            java.lang.Object r5 = r2.get(r4)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r5 = androidx.core.app.n.h(r5)
            boolean r5 = androidx.core.app.n.y(r5, r3)
            if (r5 == 0) goto L2c
            r2 = 2
            goto L30
        L2c:
            int r4 = r4 + 1
            goto L15
        L2f:
            r2 = 1
        L30:
            if (r2 != r6) goto Lbb
            java.lang.Boolean r3 = com.google.android.gms.internal.ads.en1.f4248a
            if (r3 != 0) goto Lbb
            int r3 = com.google.android.gms.internal.ads.yn0.f10944a
            r4 = 35
            if (r3 < r4) goto L3f
        L3c:
            r6 = 0
            goto Lae
        L3f:
            com.google.android.gms.internal.ads.q0 r3 = new com.google.android.gms.internal.ads.q0     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            r3.<init>()     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            java.lang.String r4 = "video/avc"
            r3.f(r4)     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            com.google.android.gms.internal.ads.y1 r4 = new com.google.android.gms.internal.ads.y1     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            r4.<init>(r3)     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            java.lang.String r3 = r4.f10714m     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            if (r3 == 0) goto Lae
            com.google.android.gms.internal.ads.wz0 r3 = com.google.android.gms.internal.ads.pn1.d(r4, r0, r0)     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            r4 = 0
        L57:
            int r5 = r3.f10384f     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            if (r4 >= r5) goto Lae
            java.lang.Object r5 = r3.get(r4)     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            com.google.android.gms.internal.ads.cn1 r5 = (com.google.android.gms.internal.ads.cn1) r5     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            android.media.MediaCodecInfo$CodecCapabilities r5 = r5.f3346d     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            if (r5 == 0) goto Lab
            java.lang.Object r5 = r3.get(r4)     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            com.google.android.gms.internal.ads.cn1 r5 = (com.google.android.gms.internal.ads.cn1) r5     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            android.media.MediaCodecInfo$CodecCapabilities r5 = r5.f3346d     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            android.media.MediaCodecInfo$VideoCapabilities r5 = r5.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            if (r5 == 0) goto Lab
            java.lang.Object r5 = r3.get(r4)     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            com.google.android.gms.internal.ads.cn1 r5 = (com.google.android.gms.internal.ads.cn1) r5     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            android.media.MediaCodecInfo$CodecCapabilities r5 = r5.f3346d     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            android.media.MediaCodecInfo$VideoCapabilities r5 = r5.getVideoCapabilities()     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            java.util.List r5 = androidx.core.app.n.i(r5)     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            if (r5 == 0) goto Lab
            boolean r1 = r5.isEmpty()     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            if (r1 != 0) goto Lab
            androidx.core.app.n.j()     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r3 = androidx.core.app.n.f()     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            r4 = 0
        L93:
            int r1 = r5.size()     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            if (r4 >= r1) goto Lae
            java.lang.Object r1 = r5.get(r4)     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r1 = androidx.core.app.n.h(r1)     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            boolean r1 = androidx.core.app.n.y(r1, r3)     // Catch: com.google.android.gms.internal.ads.zzsw -> Lae
            if (r1 == 0) goto La8
            goto L3c
        La8:
            int r4 = r4 + 1
            goto L93
        Lab:
            int r4 = r4 + 1
            goto L57
        Lae:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            com.google.android.gms.internal.ads.en1.f4248a = r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lbb
            return r0
        Lbb:
            return r2
        Lbc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.dn1.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }
}
