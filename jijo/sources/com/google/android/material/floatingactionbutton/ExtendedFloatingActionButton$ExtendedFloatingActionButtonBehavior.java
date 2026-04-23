package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.b;
import b0.e;
import g1.a;

/* JADX INFO: loaded from: classes.dex */
public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends b {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    @Override // b0.b
    public final /* bridge */ /* synthetic */ boolean a(View view) {
        a.u(view);
        throw null;
    }

    @Override // b0.b
    public final void c(e eVar) {
        if (eVar.f1218h == 0) {
            eVar.f1218h = 80;
        }
    }

    @Override // b0.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        a.u(view);
        throw null;
    }

    @Override // b0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        a.u(view);
        throw null;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l4.a.f15195h);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
