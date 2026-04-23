package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.b;
import java.util.WeakHashMap;
import o0.d0;
import o0.v0;
import p0.f;
import p4.a;
import v0.e;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f11758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11761d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11762e = 0.5f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f11763f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f11764g = 0.5f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f11765h = new a(this);

    @Override // b0.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zN = this.f11759b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zN = coordinatorLayout.n(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f11759b = zN;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f11759b = false;
        }
        if (!zN) {
            return false;
        }
        if (this.f11758a == null) {
            this.f11758a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f11765h);
        }
        return !this.f11760c && this.f11758a.q(motionEvent);
    }

    @Override // b0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        WeakHashMap weakHashMap = v0.f16075a;
        if (d0.c(view) == 0) {
            d0.s(view, 1);
            v0.n(view, 1048576);
            v0.i(view, 0);
            if (s(view)) {
                v0.o(view, f.f16187l, new m2.f(29, this));
            }
        }
        return false;
    }

    @Override // b0.b
    public final boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f11758a == null) {
            return false;
        }
        if (this.f11760c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f11758a.j(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
