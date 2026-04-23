package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f13572y = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f13573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f13574b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f13575d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f13576f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13577h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13578q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13579s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13580t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.activity.e f13581u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f13582v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f13583w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public f f13584x;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f13578q = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f13575d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f13582v
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f13577h
            r3.setAlpha(r9)
            r13.f13582v = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            g.g r9 = r13.f13573a
            int r9 = r9.f13570y
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f13577h
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f13582v = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f13576f
            if (r9 == 0) goto L65
            long r10 = r13.f13583w
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f13576f = r0
            r13.f13583w = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            g.g r4 = r13.f13573a
            int r4 = r4.f13571z
            int r3 = r3 / r4
            int r4 = r13.f13577h
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f13583w = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            androidx.activity.e r14 = r13.f13581u
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        g gVar = this.f13573a;
        if (theme == null) {
            gVar.getClass();
            return;
        }
        gVar.c();
        int i10 = gVar.f13553h;
        Drawable[] drawableArr = gVar.f13552g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null && h0.b.b(drawable)) {
                h0.b.a(drawableArr[i11], theme);
                gVar.f13550e |= drawableArr[i11].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            gVar.f13547b = resources;
            int i12 = resources.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = 160;
            }
            int i13 = gVar.f13548c;
            gVar.f13548c = i12;
            if (i13 != i12) {
                gVar.f13558m = false;
                gVar.f13555j = false;
            }
        }
    }

    public final void b(Drawable drawable) {
        if (this.f13584x == null) {
            this.f13584x = new f();
        }
        f fVar = this.f13584x;
        fVar.f13545b = drawable.getCallback();
        drawable.setCallback(fVar);
        try {
            if (this.f13573a.f13570y <= 0 && this.f13578q) {
                drawable.setAlpha(this.f13577h);
            }
            g gVar = this.f13573a;
            if (gVar.C) {
                drawable.setColorFilter(gVar.B);
            } else {
                if (gVar.F) {
                    h0.b.h(drawable, gVar.D);
                }
                g gVar2 = this.f13573a;
                if (gVar2.G) {
                    h0.b.i(drawable, gVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f13573a.f13568w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                z.A(drawable, z.n(this));
            }
            h0.a.e(drawable, this.f13573a.A);
            Rect rect = this.f13574b;
            if (rect != null) {
                h0.b.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            f fVar2 = this.f13584x;
            Drawable.Callback callback = (Drawable.Callback) fVar2.f13545b;
            fVar2.f13545b = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            f fVar3 = this.f13584x;
            Drawable.Callback callback2 = (Drawable.Callback) fVar3.f13545b;
            fVar3.f13545b = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r10) {
        /*
            r9 = this;
            int r0 = r9.f13579s
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            g.g r0 = r9.f13573a
            int r0 = r0.f13571z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f13576f
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f13575d
            if (r0 == 0) goto L29
            r9.f13576f = r0
            g.g r0 = r9.f13573a
            int r0 = r0.f13571z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f13583w = r0
            goto L35
        L29:
            r9.f13576f = r4
            r9.f13583w = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f13575d
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            g.g r0 = r9.f13573a
            int r1 = r0.f13553h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f13575d = r0
            r9.f13579s = r10
            if (r0 == 0) goto L5a
            g.g r10 = r9.f13573a
            int r10 = r10.f13570y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f13582v = r2
        L51:
            r9.b(r0)
            goto L5a
        L55:
            r9.f13575d = r4
            r10 = -1
            r9.f13579s = r10
        L5a:
            long r0 = r9.f13582v
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f13583w
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L7a
        L67:
            androidx.activity.e r0 = r9.f13581u
            if (r0 != 0) goto L74
            androidx.activity.e r0 = new androidx.activity.e
            r1 = 2
            r0.<init>(r1, r9)
            r9.f13581u = r0
            goto L77
        L74:
            r9.unscheduleSelf(r0)
        L77:
            r9.a(r10)
        L7a:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g.h.c(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f13573a.canApplyTheme();
    }

    public abstract void d(b bVar);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f13575d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f13576f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f13577h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f13573a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        g gVar = this.f13573a;
        if (!gVar.f13566u) {
            gVar.c();
            gVar.f13566u = true;
            int i10 = gVar.f13553h;
            Drawable[] drawableArr = gVar.f13552g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    gVar.f13567v = false;
                    return null;
                }
            }
            gVar.f13567v = true;
        } else if (!gVar.f13567v) {
            return null;
        }
        this.f13573a.f13549d = getChangingConfigurations();
        return this.f13573a;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f13575d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f13574b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        g gVar = this.f13573a;
        if (gVar.f13557l) {
            if (!gVar.f13558m) {
                gVar.b();
            }
            return gVar.f13560o;
        }
        Drawable drawable = this.f13575d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        g gVar = this.f13573a;
        if (gVar.f13557l) {
            if (!gVar.f13558m) {
                gVar.b();
            }
            return gVar.f13559n;
        }
        Drawable drawable = this.f13575d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        g gVar = this.f13573a;
        if (gVar.f13557l) {
            if (!gVar.f13558m) {
                gVar.b();
            }
            return gVar.f13562q;
        }
        Drawable drawable = this.f13575d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        g gVar = this.f13573a;
        if (gVar.f13557l) {
            if (!gVar.f13558m) {
                gVar.b();
            }
            return gVar.f13561p;
        }
        Drawable drawable = this.f13575d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f13575d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        g gVar = this.f13573a;
        if (gVar.f13563r) {
            return gVar.f13564s;
        }
        gVar.c();
        int i10 = gVar.f13553h;
        Drawable[] drawableArr = gVar.f13552g;
        int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i11 = 1; i11 < i10; i11++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
        }
        gVar.f13564s = opacity;
        gVar.f13563r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f13575d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        g gVar = this.f13573a;
        boolean padding = false;
        Rect rect2 = null;
        if (!gVar.f13554i) {
            Rect rect3 = gVar.f13556k;
            if (rect3 != null || gVar.f13555j) {
                rect2 = rect3;
            } else {
                gVar.c();
                Rect rect4 = new Rect();
                int i10 = gVar.f13553h;
                Drawable[] drawableArr = gVar.f13552g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                gVar.f13555j = true;
                gVar.f13556k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f13575d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f13573a.A && z.n(this) == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        g gVar = this.f13573a;
        if (gVar != null) {
            gVar.f13563r = false;
            gVar.f13565t = false;
        }
        if (drawable != this.f13575d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f13573a.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z9;
        Drawable drawable = this.f13576f;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f13576f = null;
            z9 = true;
        } else {
            z9 = false;
        }
        Drawable drawable2 = this.f13575d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f13578q) {
                this.f13575d.setAlpha(this.f13577h);
            }
        }
        if (this.f13583w != 0) {
            this.f13583w = 0L;
        } else {
            z10 = z9;
        }
        if (this.f13582v != 0) {
            this.f13582v = 0L;
        } else if (!z10) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f13580t && super.mutate() == this) {
            e eVar = (e) this;
            b bVar = new b(eVar.B, eVar, null);
            bVar.I = bVar.I.clone();
            bVar.J = bVar.J.clone();
            d(bVar);
            this.f13580t = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13576f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f13575d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        g gVar = this.f13573a;
        int i11 = this.f13579s;
        int i12 = gVar.f13553h;
        Drawable[] drawableArr = gVar.f13552g;
        boolean z9 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean zA = Build.VERSION.SDK_INT >= 23 ? z.A(drawable, i10) : false;
                if (i13 == i11) {
                    z9 = zA;
                }
            }
        }
        gVar.f13569x = i10;
        return z9;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f13576f;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f13575d;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f13575d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f13578q && this.f13577h == i10) {
            return;
        }
        this.f13578q = true;
        this.f13577h = i10;
        Drawable drawable = this.f13575d;
        if (drawable != null) {
            if (this.f13582v == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        g gVar = this.f13573a;
        if (gVar.A != z9) {
            gVar.A = z9;
            Drawable drawable = this.f13575d;
            if (drawable != null) {
                h0.a.e(drawable, z9);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        g gVar = this.f13573a;
        gVar.C = true;
        if (gVar.B != colorFilter) {
            gVar.B = colorFilter;
            Drawable drawable = this.f13575d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z9) {
        g gVar = this.f13573a;
        if (gVar.f13568w != z9) {
            gVar.f13568w = z9;
            Drawable drawable = this.f13575d;
            if (drawable != null) {
                drawable.setDither(z9);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f13575d;
        if (drawable != null) {
            h0.b.e(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f13574b;
        if (rect == null) {
            this.f13574b = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f13575d;
        if (drawable != null) {
            h0.b.f(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        g gVar = this.f13573a;
        gVar.F = true;
        if (gVar.D != colorStateList) {
            gVar.D = colorStateList;
            z.D(this.f13575d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        g gVar = this.f13573a;
        gVar.G = true;
        if (gVar.E != mode) {
            gVar.E = mode;
            z.E(this.f13575d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        Drawable drawable = this.f13576f;
        if (drawable != null) {
            drawable.setVisible(z9, z10);
        }
        Drawable drawable2 = this.f13575d;
        if (drawable2 != null) {
            drawable2.setVisible(z9, z10);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f13575d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
