package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import m1.b0;
import m1.b1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ l F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l lVar, int i10, int i11) {
        super(i10);
        this.F = lVar;
        this.E = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m1.p0
    public final void s0(RecyclerView recyclerView, int i10) {
        b0 b0Var = new b0(1, recyclerView.getContext(), this);
        b0Var.f15663a = i10;
        t0(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void v0(b1 b1Var, int[] iArr) {
        int i10 = this.E;
        l lVar = this.F;
        if (i10 == 0) {
            iArr[0] = lVar.f11886o0.getWidth();
            iArr[1] = lVar.f11886o0.getWidth();
        } else {
            iArr[0] = lVar.f11886o0.getHeight();
            iArr[1] = lVar.f11886o0.getHeight();
        }
    }
}
