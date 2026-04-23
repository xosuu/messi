package com.google.android.material.search;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11930g;

    public SearchBar$ScrollingViewBehavior() {
        this.f11930g = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, b0.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.d(coordinatorLayout, view, view2);
        if (!this.f11930g && (view2 instanceof AppBarLayout)) {
            this.f11930g = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT == 21) {
                appBarLayout.setOutlineProvider(null);
            } else {
                appBarLayout.setTargetElevation(0.0f);
            }
        }
        return false;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11930g = false;
    }
}
