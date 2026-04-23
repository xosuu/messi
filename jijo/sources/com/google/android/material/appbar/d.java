package com.google.android.material.appbar;

import android.view.View;
import p0.t;

/* JADX INFO: loaded from: classes.dex */
public final class d implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f11734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11735b;

    public d(AppBarLayout appBarLayout, boolean z9) {
        this.f11734a = appBarLayout;
        this.f11735b = z9;
    }

    @Override // p0.t
    public final boolean f(View view) {
        this.f11734a.setExpanded(this.f11735b);
        return true;
    }
}
