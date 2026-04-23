package com.codetroopers.betterpickers.calendardatepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class TextViewWithCircularIndicator extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f1619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1620b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1621d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1622f;

    public TextViewWithCircularIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1619a = new Paint();
        Resources resources = context.getResources();
        this.f1620b = resources.getColor(R.color.a9);
        resources.getDimensionPixelOffset(R.dimen.nx);
        this.f1621d = context.getResources().getString(R.string.kt);
        a();
    }

    public final void a() {
        Paint paint = this.f1619a;
        paint.setFakeBoldText(true);
        paint.setAntiAlias(true);
        paint.setColor(this.f1620b);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.FILL);
        paint.setAlpha(60);
    }

    @Override // android.view.View
    public CharSequence getContentDescription() {
        CharSequence text = getText();
        return this.f1622f ? String.format(this.f1621d, text) : text;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1622f) {
            int width = getWidth();
            int height = getHeight();
            canvas.drawCircle(width / 2, height / 2, Math.min(width, height) / 2, this.f1619a);
        }
    }

    public void setCircleColor(int i10) {
        this.f1620b = i10;
        a();
    }
}
