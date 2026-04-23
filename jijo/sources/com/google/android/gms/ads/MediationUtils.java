package com.google.android.gms.ads;

/* JADX INFO: loaded from: classes.dex */
public class MediationUtils {
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.AdSize findClosestSize(android.content.Context r10, com.google.android.gms.ads.AdSize r11, java.util.List<com.google.android.gms.ads.AdSize> r12) {
        /*
            r0 = 0
            if (r12 == 0) goto Lc2
            if (r11 != 0) goto L7
            goto Lc2
        L7:
            boolean r1 = r11.f1877e
            if (r1 != 0) goto L32
            boolean r1 = r11.f1879g
            if (r1 != 0) goto L32
            android.content.res.Resources r1 = r10.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r2 = r11.getWidthInPixels(r10)
            float r2 = (float) r2
            float r2 = r2 / r1
            int r2 = java.lang.Math.round(r2)
            int r10 = r11.getHeightInPixels(r10)
            float r10 = (float) r10
            float r10 = r10 / r1
            int r10 = java.lang.Math.round(r10)
            com.google.android.gms.ads.AdSize r11 = new com.google.android.gms.ads.AdSize
            r11.<init>(r2, r10)
        L32:
            java.util.Iterator r10 = r12.iterator()
        L36:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto Lc2
            java.lang.Object r12 = r10.next()
            com.google.android.gms.ads.AdSize r12 = (com.google.android.gms.ads.AdSize) r12
            if (r12 == 0) goto L36
            int r1 = r11.getWidth()
            int r2 = r12.getWidth()
            int r3 = r11.getHeight()
            double r4 = (double) r1
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r4 = r4 * r6
            double r6 = (double) r2
            int r8 = r12.getHeight()
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L36
            if (r1 < r2) goto L36
            boolean r1 = r11.f1879g
            if (r1 == 0) goto L8d
            int r1 = r11.f1880h
            com.google.android.gms.internal.ads.xf r3 = com.google.android.gms.internal.ads.eg.f3952b7
            com.google.android.gms.internal.ads.cg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 > r2) goto L36
            com.google.android.gms.internal.ads.xf r2 = com.google.android.gms.internal.ads.eg.f3963c7
            com.google.android.gms.internal.ads.cg r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 > r8) goto L36
            if (r1 < r8) goto L36
            goto La6
        L8d:
            boolean r1 = r11.f1877e
            if (r1 == 0) goto L96
            int r1 = r11.f1878f
            if (r1 < r8) goto L36
            goto La6
        L96:
            double r1 = (double) r3
            r4 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r1 = r1 * r4
            double r4 = (double) r8
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 > 0) goto L36
            if (r3 >= r8) goto La6
            goto L36
        La6:
            if (r0 != 0) goto La9
            goto Lbf
        La9:
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            int r2 = r2 * r1
            int r1 = r12.getWidth()
            int r3 = r12.getHeight()
            int r3 = r3 * r1
            if (r2 > r3) goto L36
        Lbf:
            r0 = r12
            goto L36
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.MediationUtils.findClosestSize(android.content.Context, com.google.android.gms.ads.AdSize, java.util.List):com.google.android.gms.ads.AdSize");
    }
}
