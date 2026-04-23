package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mz {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mz f7078b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bz0 f7079a;

    static {
        zy0 zy0Var = bz0.f3132b;
        f7078b = new mz(wz0.f10382h);
        Integer.toString(0, 36);
    }

    public mz(wz0 wz0Var) {
        this.f7079a = bz0.k(wz0Var);
    }

    public final boolean a(int i10) {
        int i11 = 0;
        while (true) {
            bz0 bz0Var = this.f7079a;
            if (i11 >= bz0Var.size()) {
                return false;
            }
            hz hzVar = (hz) bz0Var.get(i11);
            if (hzVar.b() && hzVar.a() == i10) {
                return true;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mz.class != obj.getClass()) {
            return false;
        }
        return this.f7079a.equals(((mz) obj).f7079a);
    }

    public final int hashCode() {
        return this.f7079a.hashCode();
    }
}
