package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class lw0 extends m11 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f6709t;

    @Override // com.google.android.gms.internal.ads.m11
    public final String d() {
        Object obj = this.f6709t;
        return obj == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final void e() {
        this.f6709t = null;
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final boolean f(Object obj) {
        return super.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final boolean g(Throwable th) {
        return super.g(th);
    }
}
