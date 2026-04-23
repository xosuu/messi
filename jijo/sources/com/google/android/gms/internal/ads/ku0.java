package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ku0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bv0 f6389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final au0 f6391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6392d = "Ad overlay";

    public ku0(View view, au0 au0Var) {
        this.f6389a = new bv0(view);
        this.f6390b = view.getClass().getCanonicalName();
        this.f6391c = au0Var;
    }
}
