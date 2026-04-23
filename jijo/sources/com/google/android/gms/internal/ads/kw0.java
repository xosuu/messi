package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class kw0 extends gw0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static kw0 f6409h;

    public static final kw0 g(Context context) {
        kw0 kw0Var;
        synchronized (kw0.class) {
            try {
                if (f6409h == null) {
                    f6409h = new kw0(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
                }
                kw0Var = f6409h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kw0Var;
    }

    public final x1 f(long j10, boolean z9) {
        synchronized (kw0.class) {
            try {
                if (this.f5103f.f5708b.getBoolean("paidv2_publisher_option", true)) {
                    return a(null, null, j10, z9);
                }
                return new x1(5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (kw0.class) {
            try {
                if (this.f5103f.f5708b.contains(this.f5098a)) {
                    d(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
