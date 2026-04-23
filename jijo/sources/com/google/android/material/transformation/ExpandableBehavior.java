package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.b;
import com.google.android.gms.internal.ads.fb1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0.g0;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends b {
    public ExpandableBehavior() {
    }

    @Override // b0.b
    public abstract boolean b(View view, View view2);

    @Override // b0.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        fb1.t(view2);
        throw null;
    }

    @Override // b0.b
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
        WeakHashMap weakHashMap = v0.f16075a;
        if (!g0.c(view)) {
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                View view2 = (View) arrayListJ.get(i11);
                if (b(view, view2)) {
                    fb1.n(view2);
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
