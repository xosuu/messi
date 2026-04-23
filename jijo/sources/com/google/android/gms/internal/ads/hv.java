package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hv {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f5405m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final fg f5406n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5407a = f5405m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fg f5408b = f5406n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5413g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public da f5414h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f5416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5417k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5418l;

    static {
        zy0 zy0Var = bz0.f3132b;
        wz0 wz0Var = wz0.f10382h;
        List listEmptyList = Collections.emptyList();
        wz0 wz0Var2 = wz0.f10382h;
        ic icVar = ic.f5559a;
        String str = "androidx.media3.common.Timeline";
        Uri uri = Uri.EMPTY;
        f5406n = new fg(str, new d8(), uri != null ? new gb(uri, listEmptyList, wz0Var2) : null, new da(), fk.f4541y, icVar);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
    }

    public final void a(fg fgVar, boolean z9, boolean z10, da daVar, long j10) {
        this.f5407a = f5405m;
        if (fgVar == null) {
            fgVar = f5406n;
        }
        this.f5408b = fgVar;
        this.f5409c = -9223372036854775807L;
        this.f5410d = -9223372036854775807L;
        this.f5411e = -9223372036854775807L;
        this.f5412f = z9;
        this.f5413g = z10;
        this.f5414h = daVar;
        this.f5416j = j10;
        this.f5417k = 0;
        this.f5418l = 0;
        this.f5415i = false;
    }

    public final boolean b() {
        return this.f5414h != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hv.class.equals(obj.getClass())) {
            hv hvVar = (hv) obj;
            if (yn0.c(this.f5407a, hvVar.f5407a) && yn0.c(this.f5408b, hvVar.f5408b) && yn0.c(null, null) && yn0.c(this.f5414h, hvVar.f5414h) && this.f5409c == hvVar.f5409c && this.f5410d == hvVar.f5410d && this.f5411e == hvVar.f5411e && this.f5412f == hvVar.f5412f && this.f5413g == hvVar.f5413g && this.f5415i == hvVar.f5415i && this.f5416j == hvVar.f5416j && this.f5417k == hvVar.f5417k && this.f5418l == hvVar.f5418l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f5407a.hashCode() + 217) * 31) + this.f5408b.hashCode();
        da daVar = this.f5414h;
        int iHashCode2 = ((iHashCode * 961) + (daVar == null ? 0 : daVar.hashCode())) * 31;
        long j10 = this.f5409c;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f5410d;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f5411e;
        int i12 = ((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f5412f ? 1 : 0)) * 31) + (this.f5413g ? 1 : 0)) * 31) + (this.f5415i ? 1 : 0);
        long j13 = this.f5416j;
        return ((((((i12 * 961) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f5417k) * 31) + this.f5418l) * 31;
    }
}
