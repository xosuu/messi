package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;
import m1.p0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f11871b;

    public e(l lVar, int i10) {
        this.f11871b = lVar;
        this.f11870a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p0 p0Var;
        RecyclerView recyclerView = this.f11871b.f11886o0;
        if (recyclerView.G || (p0Var = recyclerView.f1074x) == null) {
            return;
        }
        p0Var.s0(recyclerView, this.f11870a);
    }
}
