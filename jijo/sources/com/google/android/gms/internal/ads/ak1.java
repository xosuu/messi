package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ak1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ak1 f2720c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2722b;

    static {
        ak1 ak1Var = new ak1(0L, 0L);
        new ak1(Long.MAX_VALUE, Long.MAX_VALUE);
        new ak1(Long.MAX_VALUE, 0L);
        new ak1(0L, Long.MAX_VALUE);
        f2720c = ak1Var;
    }

    public ak1(long j10, long j11) {
        tc1.K(j10 >= 0);
        tc1.K(j11 >= 0);
        this.f2721a = j10;
        this.f2722b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ak1.class == obj.getClass()) {
            ak1 ak1Var = (ak1) obj;
            if (this.f2721a == ak1Var.f2721a && this.f2722b == ak1Var.f2722b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f2721a) * 31) + ((int) this.f2722b);
    }
}
