package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ab extends ib {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Long f2629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f2630i = new Object();

    public ab(ja jaVar, j8 j8Var, int i10) {
        super(jaVar, "tnRfJM39LV6MDlXml8e8fAfi5JhKcsRyFSmagsP97rbE/0XgA5fRVLlLbAYUcu57", "TvLSh+Eka5RyCXMK4IvAvP4vfksx/KqJwxjzSKu7qQs=", j8Var, i10, 22);
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        if (f2629h == null) {
            synchronized (f2630i) {
                try {
                    if (f2629h == null) {
                        f2629h = (Long) this.f5556e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f5555d) {
            j8 j8Var = this.f5555d;
            long jLongValue = f2629h.longValue();
            j8Var.d();
            x8.L0((x8) j8Var.f9462b, jLongValue);
        }
    }
}
