package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class bl1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bl1 f3054c = new bl1(bz0.n(al1.f2726d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wz0 f3055d = bz0.p(2, 5, 6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b01 f3056e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f3057a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3058b;

    static {
        xg xgVar = new xg(5, 0);
        xgVar.a(5, 6);
        xgVar.a(17, 6);
        xgVar.a(7, 6);
        xgVar.a(30, 10);
        xgVar.a(18, 6);
        xgVar.a(6, 8);
        xgVar.a(8, 8);
        xgVar.a(14, 8);
        f3056e = xgVar.g();
    }

    public bl1(wz0 wz0Var) {
        for (int i10 = 0; i10 < wz0Var.f10384f; i10++) {
            al1 al1Var = (al1) wz0Var.get(i10);
            this.f3057a.put(al1Var.f2727a, al1Var);
        }
        int iMax = 0;
        for (int i11 = 0; i11 < this.f3057a.size(); i11++) {
            iMax = Math.max(iMax, ((al1) this.f3057a.valueAt(i11)).f2728b);
        }
        this.f3058b = iMax;
    }

    public static bl1 b(Context context, ce1 ce1Var, fl1 fl1Var) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), ce1Var, fl1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.bl1 c(android.content.Context r5, android.content.Intent r6, com.google.android.gms.internal.ads.ce1 r7, com.google.android.gms.internal.ads.fl1 r8) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bl1.c(android.content.Context, android.content.Intent, com.google.android.gms.internal.ads.ce1, com.google.android.gms.internal.ads.fl1):com.google.android.gms.internal.ads.bl1");
    }

    public static wz0 d(int[] iArr, int i10) {
        Object[] objArrCopyOf = new Object[4];
        int i11 = 0;
        int i12 = 0;
        while (i11 < iArr.length) {
            al1 al1Var = new al1(iArr[i11], i10);
            int i13 = i12 + 1;
            int length = objArrCopyOf.length;
            if (length < i13) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, vy0.d(length, i13));
            }
            objArrCopyOf[i12] = al1Var;
            i11++;
            i12 = i13;
        }
        return bz0.j(i12, objArrCopyOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[PHI: r0
      0x003b: PHI (r0v3 int) = (r0v2 int), (r0v6 int) binds: [B:11:0x002e, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair a(com.google.android.gms.internal.ads.y1 r12, com.google.android.gms.internal.ads.ce1 r13) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bl1.a(com.google.android.gms.internal.ads.y1, com.google.android.gms.internal.ads.ce1):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof com.google.android.gms.internal.ads.bl1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.internal.ads.bl1 r9 = (com.google.android.gms.internal.ads.bl1) r9
            android.util.SparseArray r1 = r8.f3057a
            android.util.SparseArray r3 = r9.f3057a
            int r4 = com.google.android.gms.internal.ads.yn0.f10944a
            r5 = 31
            if (r4 < r5) goto L1d
            boolean r1 = com.google.android.gms.internal.ads.rk1.v(r1, r3)
            if (r1 == 0) goto L46
            goto L3f
        L1d:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 != r5) goto L46
            r5 = 0
        L28:
            if (r5 >= r4) goto L3f
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 == 0) goto L46
            int r5 = r5 + 1
            goto L28
        L3f:
            int r1 = r8.f3058b
            int r9 = r9.f3058b
            if (r1 != r9) goto L46
            return r0
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bl1.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iContentHashCode;
        int i10 = yn0.f10944a;
        SparseArray sparseArray = this.f3057a;
        if (i10 >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i11)) + ((sparseArray.keyAt(i11) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f3058b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f3058b + ", audioProfiles=" + this.f3057a.toString() + "]";
    }
}
