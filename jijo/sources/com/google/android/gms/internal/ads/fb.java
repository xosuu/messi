package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class fb extends ib {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile Long f4438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f4439i = new Object();

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        if (f4438h == null) {
            synchronized (f4439i) {
                try {
                    if (f4438h == null) {
                        f4438h = (Long) this.f5556e.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f5555d) {
            j8 j8Var = this.f5555d;
            long jLongValue = f4438h.longValue();
            j8Var.d();
            x8.A((x8) j8Var.f9462b, jLongValue);
        }
    }
}
