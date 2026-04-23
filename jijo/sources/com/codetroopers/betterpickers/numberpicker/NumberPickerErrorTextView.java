package com.codetroopers.betterpickers.numberpicker;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.activity.e;

/* JADX INFO: loaded from: classes.dex */
public class NumberPickerErrorTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f1715b;

    public NumberPickerErrorTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1714a = new e(16, this);
        this.f1715b = new Handler();
    }
}
