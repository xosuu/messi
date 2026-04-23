package com.google.android.material.timepicker;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.k;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class c extends o0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f12043d;

    public c(ClockFaceView clockFaceView) {
        this.f12043d = clockFaceView;
    }

    @Override // o0.c
    public final void d(View view, p0.g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f16016a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f16195a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int iIntValue = ((Integer) view.getTag(R.id.nk)).intValue();
        if (iIntValue > 0) {
            View view2 = (View) this.f12043d.L.get(iIntValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(view2);
            }
        }
        gVar.h(k.f(0, 1, iIntValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        gVar.b(p0.f.f16182g);
    }

    @Override // o0.c
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.g(view, i10, bundle);
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        ClockFaceView clockFaceView = this.f12043d;
        view.getHitRect(clockFaceView.I);
        float fCenterX = clockFaceView.I.centerX();
        float fCenterY = clockFaceView.I.centerY();
        clockFaceView.H.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, fCenterX, fCenterY, 0));
        clockFaceView.H.onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 1, fCenterX, fCenterY, 0));
        return true;
    }
}
