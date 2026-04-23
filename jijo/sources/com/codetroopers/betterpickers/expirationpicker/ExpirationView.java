package com.codetroopers.betterpickers.expirationpicker;

import a3.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker;
import com.codetroopers.betterpickers.widget.ZeroTopPaddingTextView;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class ExpirationView extends f3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZeroTopPaddingTextView f1666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ZeroTopPaddingTextView f1667b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Typeface f1668d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public UnderlinePageIndicatorPicker f1669f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ZeroTopPaddingTextView f1670h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ColorStateList f1671q;

    public ExpirationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1668d = Typeface.createFromAsset(context.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
        Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Bold.ttf");
        this.f1671q = getResources().getColorStateList(R.color.da);
        setWillNotDraw(false);
    }

    @Override // f3.a
    public final View a(int i10) {
        int[] iArr = {0, 2};
        if (i10 > 2) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    public ZeroTopPaddingTextView getMonth() {
        return this.f1666a;
    }

    public ZeroTopPaddingTextView getYear() {
        return this.f1667b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1669f.setTitleView(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1666a = (ZeroTopPaddingTextView) findViewById(R.id.o0);
        this.f1667b = (ZeroTopPaddingTextView) findViewById(R.id.z1);
        this.f1670h = (ZeroTopPaddingTextView) findViewById(R.id.it);
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f1666a;
        Typeface typeface = this.f1668d;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setTypeface(typeface);
            this.f1666a.a();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f1667b;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTypeface(typeface);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f1670h;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTypeface(typeface);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView4 = this.f1666a;
        if (zeroTopPaddingTextView4 != null) {
            zeroTopPaddingTextView4.setTextColor(this.f1671q);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView5 = this.f1667b;
        if (zeroTopPaddingTextView5 != null) {
            zeroTopPaddingTextView5.setTextColor(this.f1671q);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView6 = this.f1670h;
        if (zeroTopPaddingTextView6 != null) {
            zeroTopPaddingTextView6.setTextColor(this.f1671q);
        }
    }

    public void setOnClick(View.OnClickListener onClickListener) {
        this.f1666a.setOnClickListener(onClickListener);
        this.f1667b.setOnClickListener(onClickListener);
    }

    public void setTheme(int i10) {
        if (i10 != -1) {
            this.f1671q = getContext().obtainStyledAttributes(i10, b.f17a).getColorStateList(8);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f1666a;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setTextColor(this.f1671q);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f1667b;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTextColor(this.f1671q);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f1670h;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTextColor(this.f1671q);
        }
    }

    public void setUnderlinePage(UnderlinePageIndicatorPicker underlinePageIndicatorPicker) {
        this.f1669f = underlinePageIndicatorPicker;
    }
}
