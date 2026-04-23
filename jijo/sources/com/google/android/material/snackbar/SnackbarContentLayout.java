package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import g4.a0;
import java.util.WeakHashMap;
import m4.a;
import o0.e0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f11953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Button f11954b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11955d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a0.x(context, R.attr.x5, a.f15741b);
    }

    public final boolean a(int i10, int i11, int i12) {
        boolean z9;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f11953a.getPaddingTop() == i11 && this.f11953a.getPaddingBottom() == i12) {
            return z9;
        }
        TextView textView = this.f11953a;
        WeakHashMap weakHashMap = v0.f16075a;
        if (e0.g(textView)) {
            e0.k(textView, e0.f(textView), i11, e0.e(textView), i12);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i11, textView.getPaddingRight(), i12);
        return true;
    }

    public Button getActionView() {
        return this.f11954b;
    }

    public TextView getMessageView() {
        return this.f11953a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f11953a = (TextView) findViewById(R.id.tt);
        this.f11954b = (Button) findViewById(R.id.ts);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.di);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dh);
        Layout layout = this.f11953a.getLayout();
        boolean z9 = layout != null && layout.getLineCount() > 1;
        if (!z9 || this.f11955d <= 0 || this.f11954b.getMeasuredWidth() <= this.f11955d) {
            if (!z9) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f11955d = i10;
    }
}
