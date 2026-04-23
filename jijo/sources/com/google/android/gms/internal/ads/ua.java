package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ua extends ib {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Long f9430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f9431i = new Object();

    public ua(ja jaVar, j8 j8Var, int i10) {
        super(jaVar, "KvkOAolI09ZSAixqGUOtipMDBdKXVlslzVnQOpfDZOEJW+xbFKrK173Gu3h1RVkI", "SkMlFTLt8H3eQLYvgf87g2pXBfp4xPpxL3RMs974XSU=", j8Var, i10, 44);
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        if (f9430h == null) {
            synchronized (f9431i) {
                try {
                    if (f9430h == null) {
                        f9430h = (Long) this.f5556e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f5555d) {
            j8 j8Var = this.f5555d;
            long jLongValue = f9430h.longValue();
            j8Var.d();
            x8.J((x8) j8Var.f9462b, jLongValue);
        }
    }
}
