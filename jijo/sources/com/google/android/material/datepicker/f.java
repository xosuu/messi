package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class f extends o0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f11873e;

    public /* synthetic */ f(l lVar, int i10) {
        this.f11872d = i10;
        this.f11873e = lVar;
    }

    @Override // o0.c
    public final void d(View view, p0.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f16195a;
        int i10 = this.f11872d;
        View.AccessibilityDelegate accessibilityDelegate = this.f16016a;
        switch (i10) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                gVar.k(false);
                break;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                l lVar = this.f11873e;
                gVar.j(lVar.f11890s0.getVisibility() == 0 ? lVar.v(R.string.oh) : lVar.v(R.string.of));
                break;
        }
    }
}
