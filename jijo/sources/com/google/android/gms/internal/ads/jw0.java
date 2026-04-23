package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class jw0 extends gw0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static jw0 f6096h;

    public static final jw0 f(Context context) {
        jw0 jw0Var;
        synchronized (jw0.class) {
            try {
                if (f6096h == null) {
                    f6096h = new jw0(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
                }
                jw0Var = f6096h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jw0Var;
    }

    public final void g() {
        synchronized (jw0.class) {
            d(false);
        }
    }
}
