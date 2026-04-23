package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class nu0 implements iu0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static nu0 f7389d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public eu0 f7391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hu0 f7392c;

    public static nu0 a() {
        if (f7389d == null) {
            nu0 nu0Var = new nu0();
            nu0Var.f7390a = 0.0f;
            f7389d = nu0Var;
        }
        return f7389d;
    }

    @Override // com.google.android.gms.internal.ads.iu0
    public final void b(boolean z9) {
        if (z9) {
            wu0.f10344g.getClass();
            wu0.b();
            return;
        }
        wu0.f10344g.getClass();
        Handler handler = wu0.f10346i;
        if (handler != null) {
            handler.removeCallbacks(wu0.f10348k);
            wu0.f10346i = null;
        }
    }
}
