package x4;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f18452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f18453b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Rect f18454d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18455f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18456h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18457q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f18458s;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f18453b == null || this.f18452a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z9 = this.f18455f;
        Rect rect = this.f18454d;
        if (z9) {
            rect.set(0, 0, width, this.f18453b.top);
            this.f18452a.setBounds(rect);
            this.f18452a.draw(canvas);
        }
        if (this.f18456h) {
            rect.set(0, height - this.f18453b.bottom, width, height);
            this.f18452a.setBounds(rect);
            this.f18452a.draw(canvas);
        }
        if (this.f18457q) {
            Rect rect2 = this.f18453b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f18452a.setBounds(rect);
            this.f18452a.draw(canvas);
        }
        if (this.f18458s) {
            Rect rect3 = this.f18453b;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.f18452a.setBounds(rect);
            this.f18452a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f18452a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f18452a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z9) {
        this.f18456h = z9;
    }

    public void setDrawLeftInsetForeground(boolean z9) {
        this.f18457q = z9;
    }

    public void setDrawRightInsetForeground(boolean z9) {
        this.f18458s = z9;
    }

    public void setDrawTopInsetForeground(boolean z9) {
        this.f18455f = z9;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f18452a = drawable;
    }
}
