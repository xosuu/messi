package com.codetroopers.betterpickers.calendardatepicker;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ViewAnimator;

/* JADX INFO: loaded from: classes.dex */
public class AccessibleDateAnimator extends ViewAnimator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1611a;

    public AccessibleDateAnimator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), this.f1611a, 22));
        return true;
    }

    public void setDateMillis(long j10) {
        this.f1611a = j10;
    }
}
