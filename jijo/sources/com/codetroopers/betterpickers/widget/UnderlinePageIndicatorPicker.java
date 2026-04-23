package com.codetroopers.betterpickers.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.internal.ads.fb1;
import z1.f;

/* JADX INFO: loaded from: classes.dex */
public class UnderlinePageIndicatorPicker extends View implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f1762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewPager f1763b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f1764d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1765f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1766h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f1767q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f1768s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1769t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1770u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public f3.a f1771v;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1772a;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1772a);
        }
    }

    public UnderlinePageIndicatorPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1762a = new Paint(1);
        this.f1768s = -1.0f;
        this.f1769t = -1;
        this.f1771v = null;
    }

    @Override // z1.f
    public final void a(int i10) {
        this.f1765f = i10;
        f fVar = this.f1764d;
        if (fVar != null) {
            fVar.a(i10);
        }
    }

    @Override // z1.f
    public final void b(int i10) {
        if (this.f1765f == 0) {
            this.f1766h = i10;
            this.f1767q = 0.0f;
            invalidate();
        }
        f fVar = this.f1764d;
        if (fVar != null) {
            fVar.b(i10);
        }
    }

    @Override // z1.f
    public final void c(float f10, int i10, int i11) {
        this.f1766h = i10;
        this.f1767q = f10;
        invalidate();
        f fVar = this.f1764d;
        if (fVar != null) {
            fVar.c(f10, i10, i11);
        }
    }

    public int getSelectedColor() {
        return this.f1762a.getColor();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        f3.a aVar;
        int i10;
        super.onDraw(canvas);
        int iC = this.f1763b.getAdapter().c();
        if (isInEditMode() || iC == 0 || (aVar = this.f1771v) == null) {
            return;
        }
        View viewA = aVar.a(this.f1766h);
        float left = viewA.getLeft();
        float right = viewA.getRight();
        if (this.f1767q > 0.0f && (i10 = this.f1766h) < iC - 1) {
            View viewA2 = this.f1771v.a(i10 + 1);
            float left2 = viewA2.getLeft();
            float right2 = viewA2.getRight();
            float f10 = this.f1767q;
            left = fb1.c(1.0f, f10, left, left2 * f10);
            right = fb1.c(1.0f, f10, right, right2 * f10);
        }
        canvas.drawRect(left, getPaddingBottom(), right, getHeight() - getPaddingBottom(), this.f1762a);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f1766h = savedState.f1772a;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1772a = this.f1766h;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentItem(int i10) {
        ViewPager viewPager = this.f1763b;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        viewPager.setCurrentItem(i10);
        this.f1766h = i10;
        invalidate();
    }

    public void setOnPageChangeListener(f fVar) {
        this.f1764d = fVar;
    }

    public void setSelectedColor(int i10) {
        this.f1762a.setColor(i10);
        invalidate();
    }

    public void setTitleView(f3.a aVar) {
        this.f1771v = aVar;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f1763b;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f1763b = viewPager;
        viewPager.setOnPageChangeListener(this);
        invalidate();
    }
}
