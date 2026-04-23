package com.codetroopers.betterpickers.recurrencepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public class WeekButton extends ToggleButton {
    public WeekButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void setSuggestedWidth(int i10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            super.onMeasure(r4, r5)
            int r4 = r3.getMeasuredHeight()
            int r5 = r3.getMeasuredWidth()
            if (r4 <= 0) goto L31
            if (r5 <= 0) goto L31
            r0 = 1073741824(0x40000000, float:2.0)
            if (r5 >= r4) goto L21
            java.util.WeakHashMap r1 = o0.v0.f16075a
            int r1 = r3.getMeasuredHeightAndState()
            int r1 = android.view.View.MeasureSpec.getMode(r1)
            if (r1 == r0) goto L31
            r4 = r5
            goto L34
        L21:
            if (r4 >= r5) goto L31
            java.util.WeakHashMap r1 = o0.v0.f16075a
            int r1 = r3.getMeasuredWidthAndState()
            int r1 = android.view.View.MeasureSpec.getMode(r1)
            if (r1 == r0) goto L31
            r5 = r4
            goto L34
        L31:
            r2 = r5
            r5 = r4
            r4 = r2
        L34:
            r3.setMeasuredDimension(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codetroopers.betterpickers.recurrencepicker.WeekButton.onMeasure(int, int):void");
    }
}
