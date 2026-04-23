package com.codetroopers.betterpickers.hmspicker;

import a3.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.codetroopers.betterpickers.widget.ZeroTopPaddingTextView;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class HmsView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZeroTopPaddingTextView f1689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ZeroTopPaddingTextView f1690b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ZeroTopPaddingTextView f1691d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ZeroTopPaddingTextView f1692f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ZeroTopPaddingTextView f1693h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Typeface f1694q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ZeroTopPaddingTextView f1695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f1696t;

    public HmsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1694q = Typeface.createFromAsset(context.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
        this.f1696t = getResources().getColorStateList(R.color.da);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1689a = (ZeroTopPaddingTextView) findViewById(R.id.kd);
        this.f1691d = (ZeroTopPaddingTextView) findViewById(R.id.nz);
        this.f1690b = (ZeroTopPaddingTextView) findViewById(R.id.nx);
        this.f1693h = (ZeroTopPaddingTextView) findViewById(R.id.t6);
        this.f1692f = (ZeroTopPaddingTextView) findViewById(R.id.t5);
        this.f1695s = (ZeroTopPaddingTextView) findViewById(R.id.nu);
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f1689a;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.getTypeface();
            this.f1689a.b();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f1691d;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.b();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f1690b;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.b();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView4 = this.f1693h;
        Typeface typeface = this.f1694q;
        if (zeroTopPaddingTextView4 != null) {
            zeroTopPaddingTextView4.setTypeface(typeface);
            this.f1693h.a();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView5 = this.f1692f;
        if (zeroTopPaddingTextView5 != null) {
            zeroTopPaddingTextView5.setTypeface(typeface);
            this.f1692f.a();
        }
    }

    public void setTheme(int i10) {
        if (i10 != -1) {
            this.f1696t = getContext().obtainStyledAttributes(i10, b.f17a).getColorStateList(7);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f1689a;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setTextColor(this.f1696t);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f1690b;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTextColor(this.f1696t);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f1691d;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTextColor(this.f1696t);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView4 = this.f1692f;
        if (zeroTopPaddingTextView4 != null) {
            zeroTopPaddingTextView4.setTextColor(this.f1696t);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView5 = this.f1693h;
        if (zeroTopPaddingTextView5 != null) {
            zeroTopPaddingTextView5.setTextColor(this.f1696t);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView6 = this.f1695s;
        if (zeroTopPaddingTextView6 != null) {
            zeroTopPaddingTextView6.setTextColor(this.f1696t);
        }
    }
}
