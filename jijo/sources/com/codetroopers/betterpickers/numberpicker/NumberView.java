package com.codetroopers.betterpickers.numberpicker;

import a3.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.codetroopers.betterpickers.widget.ZeroTopPaddingTextView;
import com.google.android.gms.ads.RequestConfiguration;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class NumberView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZeroTopPaddingTextView f1716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ZeroTopPaddingTextView f1717b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ZeroTopPaddingTextView f1718d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ZeroTopPaddingTextView f1719f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Typeface f1720h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Typeface f1721q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f1722s;

    public NumberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1720h = Typeface.createFromAsset(context.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
        this.f1722s = getResources().getColorStateList(R.color.da);
    }

    public final void a() {
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f1716a;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setTextColor(this.f1722s);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f1717b;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTextColor(this.f1722s);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f1718d;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTextColor(this.f1722s);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView4 = this.f1719f;
        if (zeroTopPaddingTextView4 != null) {
            zeroTopPaddingTextView4.setTextColor(this.f1722s);
        }
    }

    public final void b(String str, String str2, boolean z9, boolean z10) {
        this.f1719f.setVisibility(z10 ? 0 : 8);
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f1716a;
        Typeface typeface = this.f1720h;
        if (zeroTopPaddingTextView != null) {
            if (str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                this.f1716a.setText("-");
                this.f1716a.setTypeface(typeface);
                this.f1716a.setEnabled(false);
                this.f1716a.a();
                this.f1716a.setVisibility(0);
            } else if (z9) {
                this.f1716a.setText(str);
                this.f1716a.setTypeface(this.f1721q);
                this.f1716a.setEnabled(true);
                this.f1716a.b();
                this.f1716a.setVisibility(0);
            } else {
                this.f1716a.setText(str);
                this.f1716a.setTypeface(typeface);
                this.f1716a.setEnabled(true);
                this.f1716a.a();
                this.f1716a.setVisibility(0);
            }
        }
        if (this.f1717b != null) {
            if (str2.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                this.f1717b.setVisibility(8);
            } else {
                this.f1717b.setText(str2);
                this.f1717b.setTypeface(typeface);
                this.f1717b.setEnabled(true);
                this.f1717b.a();
                this.f1717b.setVisibility(0);
            }
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f1718d;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setVisibility(z9 ? 0 : 8);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1716a = (ZeroTopPaddingTextView) findViewById(R.id.pz);
        this.f1717b = (ZeroTopPaddingTextView) findViewById(R.id.gv);
        this.f1718d = (ZeroTopPaddingTextView) findViewById(R.id.gw);
        this.f1719f = (ZeroTopPaddingTextView) findViewById(R.id.nu);
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f1716a;
        if (zeroTopPaddingTextView != null) {
            this.f1721q = zeroTopPaddingTextView.getTypeface();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f1716a;
        Typeface typeface = this.f1720h;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTypeface(typeface);
            this.f1716a.a();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f1717b;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTypeface(typeface);
            this.f1717b.a();
        }
        a();
    }

    public void setTheme(int i10) {
        if (i10 != -1) {
            this.f1722s = getContext().obtainStyledAttributes(i10, b.f17a).getColorStateList(7);
        }
        a();
    }
}
