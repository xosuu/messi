package com.google.android.material.appbar;

import android.view.View;
import android.widget.ScrollView;
import com.google.android.material.appbar.AppBarLayout;
import p0.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends o0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f11728d;

    public b(AppBarLayout.BaseBehavior baseBehavior) {
        this.f11728d = baseBehavior;
    }

    @Override // o0.c
    public final void d(View view, g gVar) {
        this.f16016a.onInitializeAccessibilityNodeInfo(view, gVar.f16195a);
        gVar.k(this.f11728d.f11713o);
        gVar.g(ScrollView.class.getName());
    }
}
