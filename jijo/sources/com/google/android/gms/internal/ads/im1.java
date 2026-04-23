package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class im1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jm1 f5645a;

    public final void a(Exception exc) {
        fg0.d("Audio sink error", exc);
        cj0 cj0Var = this.f5645a.J0;
        Handler handler = (Handler) cj0Var.f3301b;
        if (handler != null) {
            handler.post(new ml1(cj0Var, exc, 1));
        }
    }
}
