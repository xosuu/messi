package d5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import g4.a0;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable implements h0.h, u {
    public static final Paint I;
    public final Paint A;
    public final c5.a B;
    public final k.q C;
    public final l D;
    public PorterDuffColorFilter E;
    public PorterDuffColorFilter F;
    public final RectF G;
    public final boolean H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f12396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s[] f12397b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s[] f12398d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BitSet f12399f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12400h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Matrix f12401q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Path f12402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Path f12403t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f12404u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final RectF f12405v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Region f12406w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Region f12407x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public j f12408y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Paint f12409z;

    static {
        Paint paint = new Paint(1);
        I = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new j());
    }

    public final void b(RectF rectF, Path path) {
        l lVar = this.D;
        f fVar = this.f12396a;
        lVar.a(fVar.f12375a, fVar.f12384j, rectF, this.C, path);
        if (this.f12396a.f12383i != 1.0f) {
            Matrix matrix = this.f12401q;
            matrix.reset();
            float f10 = this.f12396a.f12383i;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.G, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z9) {
        int color;
        int iD;
        if (colorStateList == null || mode == null) {
            return (!z9 || (iD = d((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z9) {
            colorForState = d(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int d(int i10) {
        int i11;
        f fVar = this.f12396a;
        float f10 = fVar.f12388n + fVar.f12389o + fVar.f12387m;
        w4.a aVar = fVar.f12376b;
        if (aVar == null || !aVar.f18156a || g0.a.d(i10, 255) != aVar.f18159d) {
            return i10;
        }
        float fMin = (aVar.f18160e <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i10);
        int iP = a0.p(fMin, g0.a.d(i10, 255), aVar.f18157b);
        if (fMin > 0.0f && (i11 = aVar.f18158c) != 0) {
            iP = g0.a.b(g0.a.d(i11, w4.a.f18155f), iP);
        }
        return g0.a.d(iP, iAlpha);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.g.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        this.f12399f.cardinality();
        int i10 = this.f12396a.f12392r;
        Path path = this.f12402s;
        c5.a aVar = this.B;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f1570a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            s sVar = this.f12397b[i11];
            int i12 = this.f12396a.f12391q;
            Matrix matrix = s.f12452b;
            sVar.a(matrix, aVar, i12, canvas);
            this.f12398d[i11].a(matrix, aVar, this.f12396a.f12391q, canvas);
        }
        if (this.H) {
            int iSin = (int) (Math.sin(Math.toRadians(r0.f12393s)) * ((double) this.f12396a.f12392r));
            int iCos = (int) (Math.cos(Math.toRadians(r2.f12393s)) * ((double) this.f12396a.f12392r));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, I);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, j jVar, RectF rectF) {
        if (!jVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = jVar.f12416f.a(rectF) * this.f12396a.f12384j;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void g(Canvas canvas) {
        Paint paint = this.A;
        Path path = this.f12403t;
        j jVar = this.f12408y;
        RectF rectF = this.f12405v;
        rectF.set(h());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        f(canvas, paint, path, jVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f12396a.f12386l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f12396a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        f fVar = this.f12396a;
        if (fVar.f12390p == 2) {
            return;
        }
        if (fVar.f12375a.d(h())) {
            outline.setRoundRect(getBounds(), this.f12396a.f12375a.f12415e.a(h()) * this.f12396a.f12384j);
            return;
        }
        RectF rectFH = h();
        Path path = this.f12402s;
        b(rectFH, path);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f12396a.f12382h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f12406w;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.f12402s;
        b(rectFH, path);
        Region region2 = this.f12407x;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.f12404u;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean i() {
        Paint.Style style = this.f12396a.f12395u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.A.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f12400h = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f12396a.f12380f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f12396a.f12379e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f12396a.f12378d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f12396a.f12377c) != null && colorStateList4.isStateful())));
    }

    public final void j(Context context) {
        this.f12396a.f12376b = new w4.a(context);
        o();
    }

    public final void k(float f10) {
        f fVar = this.f12396a;
        if (fVar.f12388n != f10) {
            fVar.f12388n = f10;
            o();
        }
    }

    public final void l(ColorStateList colorStateList) {
        f fVar = this.f12396a;
        if (fVar.f12377c != colorStateList) {
            fVar.f12377c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean m(int[] iArr) {
        boolean z9;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f12396a.f12377c == null || color2 == (colorForState2 = this.f12396a.f12377c.getColorForState(iArr, (color2 = (paint2 = this.f12409z).getColor())))) {
            z9 = false;
        } else {
            paint2.setColor(colorForState2);
            z9 = true;
        }
        if (this.f12396a.f12378d == null || color == (colorForState = this.f12396a.f12378d.getColorForState(iArr, (color = (paint = this.A).getColor())))) {
            return z9;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        f fVar = this.f12396a;
        f fVar2 = new f();
        fVar2.f12377c = null;
        fVar2.f12378d = null;
        fVar2.f12379e = null;
        fVar2.f12380f = null;
        fVar2.f12381g = PorterDuff.Mode.SRC_IN;
        fVar2.f12382h = null;
        fVar2.f12383i = 1.0f;
        fVar2.f12384j = 1.0f;
        fVar2.f12386l = 255;
        fVar2.f12387m = 0.0f;
        fVar2.f12388n = 0.0f;
        fVar2.f12389o = 0.0f;
        fVar2.f12390p = 0;
        fVar2.f12391q = 0;
        fVar2.f12392r = 0;
        fVar2.f12393s = 0;
        fVar2.f12394t = false;
        fVar2.f12395u = Paint.Style.FILL_AND_STROKE;
        fVar2.f12375a = fVar.f12375a;
        fVar2.f12376b = fVar.f12376b;
        fVar2.f12385k = fVar.f12385k;
        fVar2.f12377c = fVar.f12377c;
        fVar2.f12378d = fVar.f12378d;
        fVar2.f12381g = fVar.f12381g;
        fVar2.f12380f = fVar.f12380f;
        fVar2.f12386l = fVar.f12386l;
        fVar2.f12383i = fVar.f12383i;
        fVar2.f12392r = fVar.f12392r;
        fVar2.f12390p = fVar.f12390p;
        fVar2.f12394t = fVar.f12394t;
        fVar2.f12384j = fVar.f12384j;
        fVar2.f12387m = fVar.f12387m;
        fVar2.f12388n = fVar.f12388n;
        fVar2.f12389o = fVar.f12389o;
        fVar2.f12391q = fVar.f12391q;
        fVar2.f12393s = fVar.f12393s;
        fVar2.f12379e = fVar.f12379e;
        fVar2.f12395u = fVar.f12395u;
        if (fVar.f12382h != null) {
            fVar2.f12382h = new Rect(fVar.f12382h);
        }
        this.f12396a = fVar2;
        return this;
    }

    public final boolean n() {
        PorterDuffColorFilter porterDuffColorFilter = this.E;
        PorterDuffColorFilter porterDuffColorFilter2 = this.F;
        f fVar = this.f12396a;
        this.E = c(fVar.f12380f, fVar.f12381g, this.f12409z, true);
        f fVar2 = this.f12396a;
        this.F = c(fVar2.f12379e, fVar2.f12381g, this.A, false);
        f fVar3 = this.f12396a;
        if (fVar3.f12394t) {
            int colorForState = fVar3.f12380f.getColorForState(getState(), 0);
            c5.a aVar = this.B;
            aVar.getClass();
            aVar.f1573d = g0.a.d(colorForState, 68);
            aVar.f1574e = g0.a.d(colorForState, 20);
            aVar.f1575f = g0.a.d(colorForState, 0);
            aVar.f1570a.setColor(aVar.f1573d);
        }
        return (n0.b.a(porterDuffColorFilter, this.E) && n0.b.a(porterDuffColorFilter2, this.F)) ? false : true;
    }

    public final void o() {
        f fVar = this.f12396a;
        float f10 = fVar.f12388n + fVar.f12389o;
        fVar.f12391q = (int) Math.ceil(0.75f * f10);
        this.f12396a.f12392r = (int) Math.ceil(f10 * 0.25f);
        n();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f12400h = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z9 = m(iArr) || n();
        if (z9) {
            invalidateSelf();
        }
        return z9;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        f fVar = this.f12396a;
        if (fVar.f12386l != i10) {
            fVar.f12386l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12396a.getClass();
        super.invalidateSelf();
    }

    @Override // d5.u
    public final void setShapeAppearanceModel(j jVar) {
        this.f12396a.f12375a = jVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f12396a.f12380f = colorStateList;
        n();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f12396a;
        if (fVar.f12381g != mode) {
            fVar.f12381g = mode;
            n();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(j.b(context, attributeSet, i10, i11).a());
    }

    public g(j jVar) {
        f fVar = new f();
        fVar.f12377c = null;
        fVar.f12378d = null;
        fVar.f12379e = null;
        fVar.f12380f = null;
        fVar.f12381g = PorterDuff.Mode.SRC_IN;
        fVar.f12382h = null;
        fVar.f12383i = 1.0f;
        fVar.f12384j = 1.0f;
        fVar.f12386l = 255;
        fVar.f12387m = 0.0f;
        fVar.f12388n = 0.0f;
        fVar.f12389o = 0.0f;
        fVar.f12390p = 0;
        fVar.f12391q = 0;
        fVar.f12392r = 0;
        fVar.f12393s = 0;
        fVar.f12394t = false;
        fVar.f12395u = Paint.Style.FILL_AND_STROKE;
        fVar.f12375a = jVar;
        fVar.f12376b = null;
        this(fVar);
    }

    public g(f fVar) {
        l lVar;
        this.f12397b = new s[4];
        this.f12398d = new s[4];
        this.f12399f = new BitSet(8);
        this.f12401q = new Matrix();
        this.f12402s = new Path();
        this.f12403t = new Path();
        this.f12404u = new RectF();
        this.f12405v = new RectF();
        this.f12406w = new Region();
        this.f12407x = new Region();
        Paint paint = new Paint(1);
        this.f12409z = paint;
        Paint paint2 = new Paint(1);
        this.A = paint2;
        this.B = new c5.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            lVar = k.f12423a;
        } else {
            lVar = new l();
        }
        this.D = lVar;
        this.G = new RectF();
        this.H = true;
        this.f12396a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        n();
        m(getState());
        this.C = new k.q(29, this);
    }
}
