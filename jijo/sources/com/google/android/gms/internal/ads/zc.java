package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zc f11204b = new zc(new a[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11205c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f11206a;

    static {
        a aVar = new a(-1, new int[0], new fg[0], new long[0]);
        int[] iArr = aVar.f2539d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = aVar.f2540e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f11205c = new a(0, iArrCopyOf, (fg[]) Arrays.copyOf(aVar.f2538c, 0), jArrCopyOf);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zc(a[] aVarArr) {
        this.f11206a = aVarArr;
    }

    public final a a(int i10) {
        return i10 < 0 ? f11205c : this.f11206a[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zc.class == obj.getClass()) {
            zc zcVar = (zc) obj;
            if (yn0.c(null, null) && Arrays.equals(this.f11206a, zcVar.f11206a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11206a) + (((int) (-9223372036854775807L)) * 961);
    }

    public final String toString() {
        return g1.a.q("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[", "])");
    }
}
