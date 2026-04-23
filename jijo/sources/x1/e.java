package x1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import g4.z;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g implements Animatable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f18302s = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f18304d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l.d f18305f = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f18306h = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g.f f18307q = new g.f(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f18303b = new c();

    public e(Context context) {
        this.f18304d = context;
    }

    @Override // x1.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            h0.b.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            return h0.b.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f18303b;
        cVar.f18297a.draw(canvas);
        if (cVar.f18298b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f18309a;
        return drawable != null ? h0.a.a(drawable) : this.f18303b.f18297a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f18303b.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f18309a;
        return drawable != null ? h0.b.c(drawable) : this.f18303b.f18297a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f18309a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new d(this.f18309a.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f18309a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f18303b.f18297a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f18309a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f18303b.f18297a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f18309a;
        return drawable != null ? drawable.getOpacity() : this.f18303b.f18297a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0171, code lost:
    
        if (r8.f18298b != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0173, code lost:
    
        r8.f18298b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017a, code lost:
    
        r8.f18298b.playTogether(r8.f18299c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0181, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.e.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f18309a;
        return drawable != null ? h0.a.d(drawable) : this.f18303b.f18297a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f18309a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f18303b.f18298b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f18309a;
        return drawable != null ? drawable.isStateful() : this.f18303b.f18297a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f18303b.f18297a.setBounds(rect);
        }
    }

    @Override // x1.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f18309a;
        return drawable != null ? drawable.setLevel(i10) : this.f18303b.f18297a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f18309a;
        return drawable != null ? drawable.setState(iArr) : this.f18303b.f18297a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f18303b.f18297a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            h0.a.e(drawable, z9);
        } else {
            this.f18303b.f18297a.setAutoMirrored(z9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f18303b.f18297a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            z.C(drawable, i10);
        } else {
            this.f18303b.f18297a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            z.D(drawable, colorStateList);
        } else {
            this.f18303b.f18297a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            z.E(drawable, mode);
        } else {
            this.f18303b.f18297a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            return drawable.setVisible(z9, z10);
        }
        this.f18303b.f18297a.setVisible(z9, z10);
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f18303b;
        if (cVar.f18298b.isStarted()) {
            return;
        }
        cVar.f18298b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f18303b.f18298b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
