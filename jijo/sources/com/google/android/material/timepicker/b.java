package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f12042a;

    public b(ClockFaceView clockFaceView) {
        this.f12042a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f12042a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.H.f12031f) - clockFaceView.P;
        if (height != clockFaceView.F) {
            clockFaceView.F = height;
            clockFaceView.n();
            int i10 = clockFaceView.F;
            ClockHandView clockHandView = clockFaceView.H;
            clockHandView.f12039x = i10;
            clockHandView.invalidate();
        }
        return true;
    }
}
