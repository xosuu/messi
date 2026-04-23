package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class al1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final al1 f2726d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fz0 f2729c;

    static {
        al1 al1Var;
        if (yn0.f10944a >= 33) {
            ez0 ez0Var = new ez0(4);
            for (int i10 = 1; i10 <= 10; i10++) {
                ez0Var.g(Integer.valueOf(yn0.o(i10)));
            }
            al1Var = new al1(2, ez0Var.i());
        } else {
            al1Var = new al1(2, 10);
        }
        f2726d = al1Var;
    }

    public al1(int i10, int i11) {
        this.f2727a = i10;
        this.f2728b = i11;
        this.f2729c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al1)) {
            return false;
        }
        al1 al1Var = (al1) obj;
        return this.f2727a == al1Var.f2727a && this.f2728b == al1Var.f2728b && yn0.c(this.f2729c, al1Var.f2729c);
    }

    public final int hashCode() {
        fz0 fz0Var = this.f2729c;
        return (((this.f2727a * 31) + this.f2728b) * 31) + (fz0Var == null ? 0 : fz0Var.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f2727a + ", maxChannelCount=" + this.f2728b + ", channelMasks=" + String.valueOf(this.f2729c) + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public al1(int r2, java.util.Set r3) {
        /*
            r1 = this;
            r1.<init>()
            r1.f2727a = r2
            int r2 = com.google.android.gms.internal.ads.fz0.f4738d
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.fz0
            if (r2 == 0) goto L19
            boolean r2 = r3 instanceof java.util.SortedSet
            if (r2 != 0) goto L19
            r2 = r3
            com.google.android.gms.internal.ads.fz0 r2 = (com.google.android.gms.internal.ads.fz0) r2
            boolean r0 = r2.g()
            if (r0 != 0) goto L19
            goto L22
        L19:
            java.lang.Object[] r2 = r3.toArray()
            int r3 = r2.length
            com.google.android.gms.internal.ads.fz0 r2 = com.google.android.gms.internal.ads.fz0.m(r3, r2)
        L22:
            r1.f2729c = r2
            com.google.android.gms.internal.ads.m01 r2 = r2.f()
            r3 = 0
        L29:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L42
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = java.lang.Integer.bitCount(r0)
            int r3 = java.lang.Math.max(r3, r0)
            goto L29
        L42:
            r1.f2728b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.al1.<init>(int, java.util.Set):void");
    }
}
