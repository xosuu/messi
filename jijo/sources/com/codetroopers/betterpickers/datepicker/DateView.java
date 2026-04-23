package com.codetroopers.betterpickers.datepicker;

import a3.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker;
import com.codetroopers.betterpickers.widget.ZeroTopPaddingTextView;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class DateView extends f3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZeroTopPaddingTextView f1642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ZeroTopPaddingTextView f1643b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ZeroTopPaddingTextView f1644d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Typeface f1645f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Typeface f1646h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public UnderlinePageIndicatorPicker f1647q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f1648s;

    public DateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1645f = Typeface.createFromAsset(context.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
        this.f1646h = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Bold.ttf");
        this.f1648s = getResources().getColorStateList(R.color.da);
        setWillNotDraw(false);
    }

    @Override // f3.a
    public final View a(int i10) {
        return getChildAt(i10);
    }

    public ZeroTopPaddingTextView getDate() {
        return this.f1643b;
    }

    public ZeroTopPaddingTextView getMonth() {
        return this.f1642a;
    }

    public ZeroTopPaddingTextView getYear() {
        return this.f1644d;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1647q.setTitleView(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1642a = (ZeroTopPaddingTextView) findViewById(R.id.o0);
        this.f1643b = (ZeroTopPaddingTextView) findViewById(R.id.gh);
        this.f1644d = (ZeroTopPaddingTextView) findViewById(R.id.z1);
        char[] dateFormatOrder = DateFormat.getDateFormatOrder(getContext());
        removeAllViews();
        for (char c10 : dateFormatOrder) {
            if (c10 == 'M') {
                addView(this.f1642a);
            } else if (c10 == 'd') {
                addView(this.f1643b);
            } else if (c10 == 'y') {
                addView(this.f1644d);
            }
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f1643b;
        Typeface typeface = this.f1645f;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setTypeface(typeface);
            this.f1643b.a();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f1642a;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTypeface(typeface);
            this.f1642a.a();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f1642a;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTextColor(this.f1648s);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView4 = this.f1643b;
        if (zeroTopPaddingTextView4 != null) {
            zeroTopPaddingTextView4.setTextColor(this.f1648s);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView5 = this.f1644d;
        if (zeroTopPaddingTextView5 != null) {
            zeroTopPaddingTextView5.setTextColor(this.f1648s);
        }
    }

    public void setOnClick(View.OnClickListener onClickListener) {
        this.f1643b.setOnClickListener(onClickListener);
        this.f1642a.setOnClickListener(onClickListener);
        this.f1644d.setOnClickListener(onClickListener);
    }

    public void setTheme(int i10) {
        if (i10 != -1) {
            this.f1648s = getContext().obtainStyledAttributes(i10, b.f17a).getColorStateList(8);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f1642a;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setTextColor(this.f1648s);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f1643b;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTextColor(this.f1648s);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f1644d;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTextColor(this.f1648s);
        }
    }

    public void setUnderlinePage(UnderlinePageIndicatorPicker underlinePageIndicatorPicker) {
        this.f1647q = underlinePageIndicatorPicker;
    }
}
