package com.codetroopers.betterpickers.timepicker;

import a3.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.codetroopers.betterpickers.widget.ZeroTopPaddingTextView;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class TimerView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZeroTopPaddingTextView f1754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ZeroTopPaddingTextView f1755b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ZeroTopPaddingTextView f1756d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ZeroTopPaddingTextView f1757f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Typeface f1758h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Typeface f1759q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ZeroTopPaddingTextView f1760s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f1761t;

    public TimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1758h = Typeface.createFromAsset(context.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
        this.f1761t = getResources().getColorStateList(R.color.da);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1756d = (ZeroTopPaddingTextView) findViewById(R.id.kf);
        this.f1757f = (ZeroTopPaddingTextView) findViewById(R.id.nz);
        this.f1754a = (ZeroTopPaddingTextView) findViewById(R.id.kd);
        this.f1755b = (ZeroTopPaddingTextView) findViewById(R.id.nx);
        this.f1760s = (ZeroTopPaddingTextView) findViewById(R.id.ke);
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f1754a;
        if (zeroTopPaddingTextView != null) {
            this.f1759q = zeroTopPaddingTextView.getTypeface();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f1757f;
        Typeface typeface = this.f1758h;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTypeface(typeface);
            this.f1757f.a();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f1755b;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTypeface(typeface);
            this.f1755b.a();
        }
    }

    public void setTheme(int i10) {
        if (i10 != -1) {
            this.f1761t = getContext().obtainStyledAttributes(i10, b.f17a).getColorStateList(7);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f1754a;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setTextColor(this.f1761t);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f1755b;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTextColor(this.f1761t);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f1756d;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTextColor(this.f1761t);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView4 = this.f1757f;
        if (zeroTopPaddingTextView4 != null) {
            zeroTopPaddingTextView4.setTextColor(this.f1761t);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView5 = this.f1760s;
        if (zeroTopPaddingTextView5 != null) {
            zeroTopPaddingTextView5.setTextColor(this.f1761t);
        }
    }
}
