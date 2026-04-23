package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class m extends o0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11891d;

    @Override // o0.c
    public final void d(View view, p0.g gVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f16016a;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f16195a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(null);
    }
}
