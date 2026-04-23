package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.b;
import com.google.android.gms.internal.ads.fb1;
import g4.a0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.d;
import m4.a;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f11753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f11754e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ViewPropertyAnimator f11757h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f11750a = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11755f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11756g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // b0.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        this.f11755f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f11751b = a0.w(view.getContext(), R.attr.wp, 225);
        this.f11752c = a0.w(view.getContext(), R.attr.wv, 175);
        this.f11753d = a0.x(view.getContext(), R.attr.x5, a.f15743d);
        this.f11754e = a0.x(view.getContext(), R.attr.x5, a.f15742c);
        return false;
    }

    @Override // b0.b
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        int i13 = 4;
        LinkedHashSet linkedHashSet = this.f11750a;
        if (i10 > 0) {
            if (this.f11756g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f11757h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f11756g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                fb1.t(it.next());
                throw null;
            }
            this.f11757h = view.animate().translationY(this.f11755f).setInterpolator(this.f11754e).setDuration(this.f11752c).setListener(new d(i13, this));
            return;
        }
        if (i10 >= 0 || this.f11756g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f11757h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f11756g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            fb1.t(it2.next());
            throw null;
        }
        this.f11757h = view.animate().translationY(0).setInterpolator(this.f11753d).setDuration(this.f11751b).setListener(new d(i13, this));
    }

    @Override // b0.b
    public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
