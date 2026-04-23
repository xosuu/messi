package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i50 extends oe1 implements pk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f5496b;

    public i50(Set set) {
        super(set);
        this.f5496b = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.pk
    public final synchronized void n(Bundle bundle, String str) {
        this.f5496b.putAll(bundle);
        I0(new m30(14));
    }
}
