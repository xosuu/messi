package l;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f15037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15038b;

    public final void a(Canvas canvas) {
        this.f15037a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void jumpToCurrentState() {
        this.f15037a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onBoundsChange(Rect rect) {
        this.f15037a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void setAlpha(int i10) {
        this.f15037a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f15038b) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void setAutoMirrored(boolean z9) {
        h0.a.e(this.f15037a, z9);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void setChangingConfigurations(int i10) {
        this.f15037a.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f15037a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f15037a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f15037a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f15037a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f15037a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f15037a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f15037a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f15037a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f15037a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f15037a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f15037a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setDither(boolean z9) {
        this.f15037a.setDither(z9);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void setFilterBitmap(boolean z9) {
        this.f15037a.setFilterBitmap(z9);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return h0.a.d(this.f15037a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f15037a.isStateful();
    }

    public final void j(float f10, float f11) {
        h0.b.e(this.f15037a, f10, f11);
    }

    public final void k(int i10, int i11, int i12, int i13) {
        h0.b.f(this.f15037a, i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void setTint(int i10) {
        h0.b.g(this.f15037a, i10);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void setTintList(ColorStateList colorStateList) {
        h0.b.h(this.f15037a, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void setTintMode(PorterDuff.Mode mode) {
        h0.b.i(this.f15037a, mode);
    }

    public final boolean o(boolean z9, boolean z10) {
        return super.setVisible(z9, z10) || this.f15037a.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        return this.f15037a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        if (this.f15038b) {
            j(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        if (this.f15038b) {
            k(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f15038b) {
            return this.f15037a.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        if (this.f15038b) {
            return o(z9, z10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
