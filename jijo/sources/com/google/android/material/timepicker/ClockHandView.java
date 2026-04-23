package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.ads.en1;
import g4.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import o0.d0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ValueAnimator f12028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12029b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12030d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12031f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f12032h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Paint f12033q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RectF f12034s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f12035t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f12036u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12037v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public double f12038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12039x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12040y;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ud);
        this.f12028a = new ValueAnimator();
        this.f12030d = new ArrayList();
        Paint paint = new Paint();
        this.f12033q = paint;
        this.f12034s = new RectF();
        this.f12040y = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l4.a.f15194g, R.attr.ud, R.style.a3c);
        a0.w(context, R.attr.wp, 200);
        a0.x(context, R.attr.x5, m4.a.f15741b);
        this.f12039x = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f12031f = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f12035t = getResources().getDimensionPixelSize(R.dimen.mr);
        this.f12032h = r4.getDimensionPixelSize(R.dimen.mp);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = v0.f16075a;
        d0.s(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i10) {
        return i10 == 2 ? Math.round(this.f12039x * 0.66f) : this.f12039x;
    }

    public final void b(float f10) {
        ValueAnimator valueAnimator = this.f12028a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f10);
    }

    public final void c(float f10) {
        float f11 = f10 % 360.0f;
        this.f12036u = f11;
        this.f12038w = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.f12040y);
        float fCos = (((float) Math.cos(this.f12038w)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.f12038w))) + height;
        float f12 = this.f12031f;
        this.f12034s.set(fCos - f12, fSin - f12, fCos + f12, fSin + f12);
        Iterator it = this.f12030d.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((d) it.next());
            if (Math.abs(clockFaceView.U - f11) > 0.001f) {
                clockFaceView.U = f11;
                clockFaceView.o();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f10 = width;
        float fA = a(this.f12040y);
        float fCos = (((float) Math.cos(this.f12038w)) * fA) + f10;
        float f11 = height;
        float fSin = (fA * ((float) Math.sin(this.f12038w))) + f11;
        Paint paint = this.f12033q;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f12031f, paint);
        double dSin = Math.sin(this.f12038w);
        paint.setStrokeWidth(this.f12035t);
        canvas.drawLine(f10, f11, width + ((int) (Math.cos(this.f12038w) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f10, f11, this.f12032h, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        if (this.f12028a.isRunning()) {
            return;
        }
        b(this.f12036u);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        float x9 = motionEvent.getX();
        float y8 = motionEvent.getY();
        boolean z11 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                z9 = this.f12037v;
                if (this.f12029b) {
                    this.f12040y = ((float) Math.hypot((double) (x9 - ((float) (getWidth() / 2))), (double) (y8 - ((float) (getHeight() / 2))))) <= ((float) a(2)) + en1.n(getContext(), 12) ? 2 : 1;
                }
            } else {
                z9 = false;
            }
            z10 = false;
        } else {
            this.f12037v = false;
            z9 = false;
            z10 = true;
        }
        boolean z12 = this.f12037v;
        int degrees = (int) Math.toDegrees(Math.atan2(y8 - (getHeight() / 2), x9 - (getWidth() / 2)));
        int i10 = degrees + 90;
        if (i10 < 0) {
            i10 = degrees + 450;
        }
        float f10 = i10;
        boolean z13 = this.f12036u != f10;
        if (z10 && z13) {
            z11 = true;
        } else if (z13 || z9) {
            b(f10);
            z11 = true;
        }
        this.f12037v = z12 | z11;
        return true;
    }
}
