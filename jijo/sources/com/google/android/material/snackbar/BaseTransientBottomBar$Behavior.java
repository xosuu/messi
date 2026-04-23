package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.material.behavior.SwipeDismissBehavior;
import f5.b;
import f5.d;
import j2.h;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f11952i = new b(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, b0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        b bVar = this.f11952i;
        bVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (h.f14296q == null) {
                    h.f14296q = new h(10);
                }
                h hVar = h.f14296q;
                fb1.t(bVar.f13091b);
                synchronized (hVar.f14297a) {
                    fb1.t(hVar.f14299d);
                }
            }
        } else if (coordinatorLayout.n(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (h.f14296q == null) {
                h.f14296q = new h(10);
            }
            h hVar2 = h.f14296q;
            fb1.t(bVar.f13091b);
            hVar2.q();
        }
        return super.g(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean s(View view) {
        this.f11952i.getClass();
        return view instanceof d;
    }
}
