package o4;

import a5.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.badge.BadgeState$State;
import d5.g;
import g4.c;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import o0.e0;
import o0.v0;
import x4.v;
import x4.w;
import x4.y;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f16092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f16093b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f16094d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f16095f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f16096h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f16097q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f16098s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f16099t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f16100u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f16101v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f16102w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WeakReference f16103x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public WeakReference f16104y;

    public a(Context context) {
        d dVar;
        Context context2;
        WeakReference weakReference = new WeakReference(context);
        this.f16092a = weakReference;
        y.c(context, y.f18482b, "Theme.MaterialComponents");
        this.f16095f = new Rect();
        g gVar = new g();
        this.f16093b = gVar;
        w wVar = new w(this);
        this.f16094d = wVar;
        TextPaint textPaint = wVar.f18475a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        Context context3 = (Context) weakReference.get();
        if (context3 != null && wVar.f18480f != (dVar = new d(context3, R.style.na)) && (context2 = (Context) weakReference.get()) != null) {
            wVar.b(dVar, context2);
            f();
        }
        b bVar = new b(context);
        this.f16096h = bVar;
        BadgeState$State badgeState$State = bVar.f16106b;
        this.f16099t = ((int) Math.pow(10.0d, ((double) badgeState$State.f11741q) - 1.0d)) - 1;
        wVar.f18478d = true;
        f();
        invalidateSelf();
        wVar.f18478d = true;
        f();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(badgeState$State.f11737b.intValue());
        if (gVar.f12396a.f12377c != colorStateListValueOf) {
            gVar.l(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(badgeState$State.f11738d.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f16103x;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f16103x.get();
            WeakReference weakReference3 = this.f16104y;
            e(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        f();
        setVisible(badgeState$State.f11747x.booleanValue(), false);
    }

    @Override // x4.v
    public final void a() {
        invalidateSelf();
    }

    public final String b() {
        int iC = c();
        int i10 = this.f16099t;
        b bVar = this.f16096h;
        if (iC <= i10) {
            return NumberFormat.getInstance(bVar.f16106b.f11742s).format(c());
        }
        Context context = (Context) this.f16092a.get();
        return context == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : String.format(bVar.f16106b.f11742s, context.getString(R.string.nh), Integer.valueOf(this.f16099t), "+");
    }

    public final int c() {
        if (d()) {
            return this.f16096h.f16106b.f11740h;
        }
        return 0;
    }

    public final boolean d() {
        return this.f16096h.f16106b.f11740h != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f16093b.draw(canvas);
        if (d()) {
            Rect rect = new Rect();
            String strB = b();
            w wVar = this.f16094d;
            wVar.f18475a.getTextBounds(strB, 0, strB.length(), rect);
            canvas.drawText(strB, this.f16097q, this.f16098s + (rect.height() / 2), wVar.f18475a);
        }
    }

    public final void e(View view, FrameLayout frameLayout) {
        this.f16103x = new WeakReference(view);
        this.f16104y = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        f();
        invalidateSelf();
    }

    public final void f() {
        Context context = (Context) this.f16092a.get();
        WeakReference weakReference = this.f16103x;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f16095f;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference2 = this.f16104y;
        ViewGroup viewGroup = weakReference2 != null ? (ViewGroup) weakReference2.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean zD = d();
        b bVar = this.f16096h;
        int iIntValue = bVar.f16106b.D.intValue() + (zD ? bVar.f16106b.B.intValue() : bVar.f16106b.f11749z.intValue());
        BadgeState$State badgeState$State = bVar.f16106b;
        int iIntValue2 = badgeState$State.f11746w.intValue();
        if (iIntValue2 == 8388691 || iIntValue2 == 8388693) {
            this.f16098s = rect3.bottom - iIntValue;
        } else {
            this.f16098s = rect3.top + iIntValue;
        }
        int iC = c();
        float f10 = bVar.f16108d;
        if (iC <= 9) {
            if (!d()) {
                f10 = bVar.f16107c;
            }
            this.f16100u = f10;
            this.f16102w = f10;
            this.f16101v = f10;
        } else {
            this.f16100u = f10;
            this.f16102w = f10;
            this.f16101v = (this.f16094d.a(b()) / 2.0f) + bVar.f16109e;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(d() ? R.dimen.o6 : R.dimen.o3);
        int iIntValue3 = badgeState$State.C.intValue() + (d() ? badgeState$State.A.intValue() : badgeState$State.f11748y.intValue());
        int iIntValue4 = badgeState$State.f11746w.intValue();
        if (iIntValue4 == 8388659 || iIntValue4 == 8388691) {
            WeakHashMap weakHashMap = v0.f16075a;
            this.f16097q = e0.d(view) == 0 ? (rect3.left - this.f16101v) + dimensionPixelSize + iIntValue3 : ((rect3.right + this.f16101v) - dimensionPixelSize) - iIntValue3;
        } else {
            WeakHashMap weakHashMap2 = v0.f16075a;
            this.f16097q = e0.d(view) == 0 ? ((rect3.right + this.f16101v) - dimensionPixelSize) - iIntValue3 : (rect3.left - this.f16101v) + dimensionPixelSize + iIntValue3;
        }
        float f11 = this.f16097q;
        float f12 = this.f16098s;
        float f13 = this.f16101v;
        float f14 = this.f16102w;
        rect2.set((int) (f11 - f13), (int) (f12 - f14), (int) (f11 + f13), (int) (f12 + f14));
        float f15 = this.f16100u;
        g gVar = this.f16093b;
        c cVarE = gVar.f12396a.f12375a.e();
        cVarE.f13700e = new d5.a(f15);
        cVarE.f13701f = new d5.a(f15);
        cVarE.f13702g = new d5.a(f15);
        cVarE.f13703h = new d5.a(f15);
        gVar.setShapeAppearanceModel(cVarE.a());
        if (rect.equals(rect2)) {
            return;
        }
        gVar.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16096h.f16106b.f11739f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f16095f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f16095f.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, x4.v
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        b bVar = this.f16096h;
        bVar.f16105a.f11739f = i10;
        bVar.f16106b.f11739f = i10;
        this.f16094d.f18475a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
