package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public abstract class wv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eu f10355a = new eu();

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract vu d(int i10, vu vuVar, boolean z9);

    public abstract hv e(int i10, hv hvVar, long j10);

    public final boolean equals(Object obj) {
        int iH;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv)) {
            return false;
        }
        wv wvVar = (wv) obj;
        if (wvVar.c() == c() && wvVar.b() == b()) {
            hv hvVar = new hv();
            vu vuVar = new vu();
            hv hvVar2 = new hv();
            vu vuVar2 = new vu();
            for (int i10 = 0; i10 < c(); i10++) {
                if (!e(i10, hvVar, 0L).equals(wvVar.e(i10, hvVar2, 0L))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < b(); i11++) {
                if (!d(i11, vuVar, true).equals(wvVar.d(i11, vuVar2, true))) {
                    return false;
                }
            }
            int iG = g(true);
            if (iG == wvVar.g(true) && (iH = h(true)) == wvVar.h(true)) {
                while (iG != iH) {
                    int iJ = j(iG, 0, true);
                    if (iJ != wvVar.j(iG, 0, true)) {
                        return false;
                    }
                    iG = iJ;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i10);

    public int g(boolean z9) {
        return o() ? -1 : 0;
    }

    public int h(boolean z9) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final int hashCode() {
        int i10;
        hv hvVar = new hv();
        vu vuVar = new vu();
        int iC = c() + 217;
        int i11 = 0;
        while (true) {
            i10 = iC * 31;
            if (i11 >= c()) {
                break;
            }
            iC = i10 + e(i11, hvVar, 0L).hashCode();
            i11++;
        }
        int iB = b() + i10;
        for (int i12 = 0; i12 < b(); i12++) {
            iB = (iB * 31) + d(i12, vuVar, true).hashCode();
        }
        int iG = g(true);
        while (iG != -1) {
            iB = (iB * 31) + iG;
            iG = j(iG, 0, true);
        }
        return iB;
    }

    public final int i(int i10, vu vuVar, hv hvVar, int i11, boolean z9) {
        int i12 = d(i10, vuVar, false).f9970c;
        if (e(i12, hvVar, 0L).f5418l != i10) {
            return i10 + 1;
        }
        int iJ = j(i12, i11, z9);
        if (iJ == -1) {
            return -1;
        }
        return e(iJ, hvVar, 0L).f5417k;
    }

    public int j(int i10, int i11, boolean z9) {
        if (i11 == 0) {
            if (i10 == h(z9)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == h(z9) ? g(z9) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public int k(int i10) {
        if (i10 == g(false)) {
            return -1;
        }
        return i10 - 1;
    }

    public final Pair l(hv hvVar, vu vuVar, int i10, long j10) {
        Pair pairM = m(hvVar, vuVar, i10, j10, 0L);
        pairM.getClass();
        return pairM;
    }

    public final Pair m(hv hvVar, vu vuVar, int i10, long j10, long j11) {
        tc1.h(i10, c());
        e(i10, hvVar, j11);
        if (j10 == -9223372036854775807L) {
            hvVar.getClass();
            j10 = 0;
        }
        int i11 = hvVar.f5417k;
        d(i11, vuVar, false);
        while (i11 < hvVar.f5418l) {
            vuVar.getClass();
            if (j10 == 0) {
                break;
            }
            int i12 = i11 + 1;
            d(i12, vuVar, false).getClass();
            if (j10 < 0) {
                break;
            }
            i11 = i12;
        }
        d(i11, vuVar, true);
        vuVar.getClass();
        long j12 = vuVar.f9971d;
        if (j12 != -9223372036854775807L) {
            j10 = Math.min(j10, j12 - 1);
        }
        long jMax = Math.max(0L, j10);
        Object obj = vuVar.f9969b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public vu n(Object obj, vu vuVar) {
        return d(a(obj), vuVar, true);
    }

    public final boolean o() {
        return c() == 0;
    }
}
