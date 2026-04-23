package h0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends Drawable implements Drawable.Callback, i, h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final PorterDuff.Mode f13915s = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PorterDuff.Mode f13917b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13918d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l f13919f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13920h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f13921q;

    public j(l lVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f13919f = lVar;
        if (lVar == null || (constantState = lVar.f13924b) == null) {
            return;
        }
        c(constantState.newDrawable(resources));
    }

    public abstract boolean a();

    public final l b() {
        l lVar = this.f13919f;
        l lVar2 = new l();
        lVar2.f13925c = null;
        lVar2.f13926d = f13915s;
        if (lVar != null) {
            lVar2.f13923a = lVar.f13923a;
            lVar2.f13924b = lVar.f13924b;
            lVar2.f13925c = lVar.f13925c;
            lVar2.f13926d = lVar.f13926d;
        }
        return lVar2;
    }

    public final void c(Drawable drawable) {
        Drawable drawable2 = this.f13921q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f13921q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            l lVar = this.f13919f;
            if (lVar != null) {
                lVar.f13924b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean d(int[] iArr) {
        if (!a()) {
            return false;
        }
        l lVar = this.f13919f;
        ColorStateList colorStateList = lVar.f13925c;
        PorterDuff.Mode mode = lVar.f13926d;
        if (colorStateList == null || mode == null) {
            this.f13918d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f13918d || colorForState != this.f13916a || mode != this.f13917b) {
                setColorFilter(colorForState, mode);
                this.f13916a = colorForState;
                this.f13917b = mode;
                this.f13918d = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f13921q.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        l lVar = this.f13919f;
        return changingConfigurations | (lVar != null ? lVar.getChangingConfigurations() : 0) | this.f13921q.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        l lVar = this.f13919f;
        if (lVar == null || lVar.f13924b == null) {
            return null;
        }
        lVar.f13923a = getChangingConfigurations();
        return this.f13919f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f13921q.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f13921q.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f13921q.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return z.n(this.f13921q);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f13921q.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f13921q.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f13921q.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f13921q.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f13921q.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f13921q.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return a.d(this.f13921q);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        l lVar;
        ColorStateList colorStateList = (!a() || (lVar = this.f13919f) == null) ? null : lVar.f13925c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f13921q.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f13921q.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f13920h && super.mutate() == this) {
            this.f13919f = b();
            Drawable drawable = this.f13921q;
            if (drawable != null) {
                drawable.mutate();
            }
            l lVar = this.f13919f;
            if (lVar != null) {
                Drawable drawable2 = this.f13921q;
                lVar.f13924b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f13920h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13921q;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        return z.A(this.f13921q, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        return this.f13921q.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f13921q.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        a.e(this.f13921q, z9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i10) {
        this.f13921q.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13921q.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z9) {
        this.f13921q.setDither(z9);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z9) {
        this.f13921q.setFilterBitmap(z9);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return d(iArr) || this.f13921q.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f13919f.f13925c = colorStateList;
        d(this.f13921q.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f13919f.f13926d = mode;
        d(this.f13921q.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        return super.setVisible(z9, z10) || this.f13921q.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public j(Drawable drawable) {
        this.f13919f = b();
        c(drawable);
    }
}
