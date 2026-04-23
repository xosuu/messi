package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class gx implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dt f5104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ix f5105b;

    public gx(ix ixVar, dt dtVar) {
        this.f5104a = dtVar;
        this.f5105b = ixVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) throws Throwable {
        this.f5105b.T(view, this.f5104a, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
