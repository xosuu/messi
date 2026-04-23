package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p0.t;

/* JADX INFO: loaded from: classes.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f11729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f11730b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f11731d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11732f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f11733h;

    public c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f11733h = baseBehavior;
        this.f11729a = coordinatorLayout;
        this.f11730b = appBarLayout;
        this.f11731d = view;
        this.f11732f = i10;
    }

    @Override // p0.t
    public final boolean f(View view) {
        this.f11733h.A(this.f11729a, this.f11730b, this.f11731d, this.f11732f, new int[]{0, 0});
        return true;
    }
}
