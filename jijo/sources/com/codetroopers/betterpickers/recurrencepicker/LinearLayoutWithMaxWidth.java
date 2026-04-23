package com.codetroopers.betterpickers.recurrencepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutWithMaxWidth extends LinearLayout {
    public LinearLayoutWithMaxWidth(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        WeekButton.setSuggestedWidth(View.MeasureSpec.getSize(i10) / 7);
        super.onMeasure(i10, i11);
    }
}
