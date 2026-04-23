package com.codetroopers.betterpickers.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class ZeroTopPaddingTextView extends TextView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Typeface f1773b = Typeface.create("san-serif", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Typeface f1774d = Typeface.create("sans-serif-condensed", 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1775a;

    public ZeroTopPaddingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1775a = 0;
        getResources().getString(R.string.q9);
        getResources().getString(R.string.yd);
        setIncludeFontPadding(false);
        a();
    }

    public final void a() {
        float f10;
        float f11;
        float f12 = 0.208f;
        if (getPaint().getTypeface() == null || !getPaint().getTypeface().equals(Typeface.DEFAULT_BOLD)) {
            f10 = 0.328f;
            f11 = 0.25f;
        } else {
            f10 = 0.208f;
            f11 = 0.208f;
        }
        if (getTypeface() != null && getTypeface().equals(f1773b)) {
            f10 = 0.208f;
            f11 = 0.208f;
        }
        if (getTypeface() == null || !getTypeface().equals(f1774d)) {
            f12 = f10;
        } else {
            f11 = 0.208f;
        }
        setPadding(0, (int) (getTextSize() * (-f12)), this.f1775a, (int) (getTextSize() * (-f11)));
    }

    public final void b() {
        setPadding(0, (int) (getTextSize() * (-0.208f)), this.f1775a, (int) (getTextSize() * (-0.208f)));
    }

    public void setPaddingRight(int i10) {
        this.f1775a = i10;
        a();
    }
}
