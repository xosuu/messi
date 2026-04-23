package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class vu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zc f9973f = zc.f11204b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final long a(int i10, int i11) {
        a aVarA = this.f9973f.a(i10);
        if (aVarA.f2536a != -1) {
            return aVarA.f2540e[i11];
        }
        return -9223372036854775807L;
    }

    public final void b(Object obj, Object obj2, int i10, long j10, boolean z9) {
        zc zcVar = zc.f11204b;
        this.f9968a = obj;
        this.f9969b = obj2;
        this.f9970c = i10;
        this.f9971d = j10;
        this.f9973f = zcVar;
        this.f9972e = z9;
    }

    public final void c(int i10) {
        this.f9973f.a(i10).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vu.class.equals(obj.getClass())) {
            vu vuVar = (vu) obj;
            if (yn0.c(this.f9968a, vuVar.f9968a) && yn0.c(this.f9969b, vuVar.f9969b) && this.f9970c == vuVar.f9970c && this.f9971d == vuVar.f9971d && this.f9972e == vuVar.f9972e && yn0.c(this.f9973f, vuVar.f9973f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f9968a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f9969b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f9970c;
        long j10 = this.f9971d;
        return this.f9973f.hashCode() + (((((iHashCode2 * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 961) + (this.f9972e ? 1 : 0)) * 31);
    }
}
