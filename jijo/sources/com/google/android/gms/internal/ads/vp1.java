package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* JADX INFO: loaded from: classes.dex */
public final class vp1 implements Spatializer.OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aq1 f9938a;

    public vp1(aq1 aq1Var) {
        this.f9938a = aq1Var;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z9) {
        aq1 aq1Var = this.f9938a;
        ry0 ry0Var = aq1.f2769j;
        aq1Var.i();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z9) {
        aq1 aq1Var = this.f9938a;
        ry0 ry0Var = aq1.f2769j;
        aq1Var.i();
    }
}
