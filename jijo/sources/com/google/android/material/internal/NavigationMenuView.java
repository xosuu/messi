package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import k.f0;
import k.o;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements f0 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // k.f0
    public final void d(o oVar) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
