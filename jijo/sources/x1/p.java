package x1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import b7.u;
import g4.z;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p7.q;

/* JADX INFO: loaded from: classes.dex */
public final class p extends g {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final PorterDuff.Mode f18366v = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f18367b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuffColorFilter f18368d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorFilter f18369f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18370h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18371q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float[] f18372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Matrix f18373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f18374u;

    public p() {
        this.f18371q = true;
        this.f18372s = new float[9];
        this.f18373t = new Matrix();
        this.f18374u = new Rect();
        n nVar = new n();
        nVar.f18355c = null;
        nVar.f18356d = f18366v;
        nVar.f18354b = new m();
        this.f18367b = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f18309a;
        if (drawable == null) {
            return false;
        }
        h0.b.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f18374u;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f18369f;
        if (colorFilter == null) {
            colorFilter = this.f18368d;
        }
        Matrix matrix = this.f18373t;
        canvas.getMatrix(matrix);
        float[] fArr = this.f18372s;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && z.n(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f18367b;
        Bitmap bitmap = nVar.f18358f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != nVar.f18358f.getHeight()) {
            nVar.f18358f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            nVar.f18363k = true;
        }
        if (this.f18371q) {
            n nVar2 = this.f18367b;
            if (nVar2.f18363k || nVar2.f18359g != nVar2.f18355c || nVar2.f18360h != nVar2.f18356d || nVar2.f18362j != nVar2.f18357e || nVar2.f18361i != nVar2.f18354b.getRootAlpha()) {
                n nVar3 = this.f18367b;
                nVar3.f18358f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f18358f);
                m mVar = nVar3.f18354b;
                mVar.a(mVar.f18344g, m.f18337p, canvas2, iMin, iMin2);
                n nVar4 = this.f18367b;
                nVar4.f18359g = nVar4.f18355c;
                nVar4.f18360h = nVar4.f18356d;
                nVar4.f18361i = nVar4.f18354b.getRootAlpha();
                nVar4.f18362j = nVar4.f18357e;
                nVar4.f18363k = false;
            }
        } else {
            n nVar5 = this.f18367b;
            nVar5.f18358f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f18358f);
            m mVar2 = nVar5.f18354b;
            mVar2.a(mVar2.f18344g, m.f18337p, canvas3, iMin, iMin2);
        }
        n nVar6 = this.f18367b;
        if (nVar6.f18354b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f18364l == null) {
                Paint paint2 = new Paint();
                nVar6.f18364l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f18364l.setAlpha(nVar6.f18354b.getRootAlpha());
            nVar6.f18364l.setColorFilter(colorFilter);
            paint = nVar6.f18364l;
        }
        canvas.drawBitmap(nVar6.f18358f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f18309a;
        return drawable != null ? h0.a.a(drawable) : this.f18367b.f18354b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f18309a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f18367b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f18309a;
        return drawable != null ? h0.b.c(drawable) : this.f18369f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f18309a != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.f18309a.getConstantState());
        }
        this.f18367b.f18353a = getChangingConfigurations();
        return this.f18367b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f18309a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f18367b.f18354b.f18346i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f18309a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f18367b.f18354b.f18345h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        m mVar;
        int i10;
        Paint.Join join;
        Paint.Cap cap;
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            h0.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f18367b;
        nVar.f18354b = new m();
        TypedArray typedArrayV = u.v(resources, theme, attributeSet, a.f18285a);
        n nVar2 = this.f18367b;
        m mVar2 = nVar2.f18354b;
        int i11 = !u.q(xmlPullParser, "tintMode") ? -1 : typedArrayV.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f18356d = mode;
        int i12 = 1;
        ColorStateList colorStateListA = null;
        if (u.q(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayV.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i13 < 28 || i13 > 31) {
                Resources resources2 = typedArrayV.getResources();
                int resourceId = typedArrayV.getResourceId(1, 0);
                ThreadLocal threadLocal = f0.c.f13012a;
                try {
                    colorStateListA = f0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            } else {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            nVar2.f18355c = colorStateList;
        }
        boolean z9 = nVar2.f18357e;
        if (u.q(xmlPullParser, "autoMirrored")) {
            z9 = typedArrayV.getBoolean(5, z9);
        }
        nVar2.f18357e = z9;
        float f10 = mVar2.f18347j;
        if (u.q(xmlPullParser, "viewportWidth")) {
            f10 = typedArrayV.getFloat(7, f10);
        }
        mVar2.f18347j = f10;
        float f11 = mVar2.f18348k;
        if (u.q(xmlPullParser, "viewportHeight")) {
            f11 = typedArrayV.getFloat(8, f11);
        }
        mVar2.f18348k = f11;
        if (mVar2.f18347j <= 0.0f) {
            throw new XmlPullParserException(typedArrayV.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 <= 0.0f) {
            throw new XmlPullParserException(typedArrayV.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        mVar2.f18345h = typedArrayV.getDimension(3, mVar2.f18345h);
        float dimension = typedArrayV.getDimension(2, mVar2.f18346i);
        mVar2.f18346i = dimension;
        if (mVar2.f18345h <= 0.0f) {
            throw new XmlPullParserException(typedArrayV.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayV.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = mVar2.getAlpha();
        if (u.q(xmlPullParser, "alpha")) {
            alpha = typedArrayV.getFloat(4, alpha);
        }
        mVar2.setAlpha(alpha);
        String string = typedArrayV.getString(0);
        if (string != null) {
            mVar2.f18350m = string;
            mVar2.f18352o.put(string, mVar2);
        }
        typedArrayV.recycle();
        nVar.f18353a = getChangingConfigurations();
        nVar.f18363k = true;
        n nVar3 = this.f18367b;
        m mVar3 = nVar3.f18354b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(mVar3.f18344g);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        for (int i14 = 3; eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != i14); i14 = 3) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                j jVar = (j) arrayDeque.peek();
                boolean zEquals = "path".equals(name);
                i10 = depth;
                s.b bVar = mVar3.f18352o;
                if (zEquals) {
                    i iVar = new i();
                    iVar.f18311f = 0.0f;
                    iVar.f18313h = 1.0f;
                    iVar.f18314i = 1.0f;
                    iVar.f18315j = 0.0f;
                    iVar.f18316k = 1.0f;
                    iVar.f18317l = 0.0f;
                    Paint.Cap cap2 = Paint.Cap.BUTT;
                    iVar.f18318m = cap2;
                    Paint.Join join2 = Paint.Join.MITER;
                    iVar.f18319n = join2;
                    mVar = mVar3;
                    iVar.f18320o = 4.0f;
                    TypedArray typedArrayV2 = u.v(resources, theme, attributeSet, a.f18287c);
                    if (u.q(xmlPullParser, "pathData")) {
                        String string2 = typedArrayV2.getString(0);
                        if (string2 != null) {
                            iVar.f18334b = string2;
                        }
                        String string3 = typedArrayV2.getString(2);
                        if (string3 != null) {
                            iVar.f18333a = q.c(string3);
                        }
                        iVar.f18312g = u.n(typedArrayV2, xmlPullParser, theme, "fillColor", 1);
                        float f12 = iVar.f18314i;
                        if (u.q(xmlPullParser, "fillAlpha")) {
                            f12 = typedArrayV2.getFloat(12, f12);
                        }
                        iVar.f18314i = f12;
                        int i15 = !u.q(xmlPullParser, "strokeLineCap") ? -1 : typedArrayV2.getInt(8, -1);
                        Paint.Cap cap3 = iVar.f18318m;
                        if (i15 != 0) {
                            join = join2;
                            cap = i15 != 1 ? i15 != 2 ? cap3 : Paint.Cap.SQUARE : Paint.Cap.ROUND;
                        } else {
                            join = join2;
                            cap = cap2;
                        }
                        iVar.f18318m = cap;
                        int i16 = !u.q(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayV2.getInt(9, -1);
                        iVar.f18319n = i16 != 0 ? i16 != 1 ? i16 != 2 ? iVar.f18319n : Paint.Join.BEVEL : Paint.Join.ROUND : join;
                        float f13 = iVar.f18320o;
                        if (u.q(xmlPullParser, "strokeMiterLimit")) {
                            f13 = typedArrayV2.getFloat(10, f13);
                        }
                        iVar.f18320o = f13;
                        iVar.f18310e = u.n(typedArrayV2, xmlPullParser, theme, "strokeColor", 3);
                        float f14 = iVar.f18313h;
                        if (u.q(xmlPullParser, "strokeAlpha")) {
                            f14 = typedArrayV2.getFloat(11, f14);
                        }
                        iVar.f18313h = f14;
                        float f15 = iVar.f18311f;
                        if (u.q(xmlPullParser, "strokeWidth")) {
                            f15 = typedArrayV2.getFloat(4, f15);
                        }
                        iVar.f18311f = f15;
                        float f16 = iVar.f18316k;
                        if (u.q(xmlPullParser, "trimPathEnd")) {
                            f16 = typedArrayV2.getFloat(6, f16);
                        }
                        iVar.f18316k = f16;
                        float f17 = iVar.f18317l;
                        if (u.q(xmlPullParser, "trimPathOffset")) {
                            f17 = typedArrayV2.getFloat(7, f17);
                        }
                        iVar.f18317l = f17;
                        float f18 = iVar.f18315j;
                        if (u.q(xmlPullParser, "trimPathStart")) {
                            f18 = typedArrayV2.getFloat(5, f18);
                        }
                        iVar.f18315j = f18;
                        int i17 = iVar.f18335c;
                        if (u.q(xmlPullParser, "fillType")) {
                            i17 = typedArrayV2.getInt(13, i17);
                        }
                        iVar.f18335c = i17;
                    }
                    typedArrayV2.recycle();
                    jVar.f18322b.add(iVar);
                    if (iVar.getPathName() != null) {
                        bVar.put(iVar.getPathName(), iVar);
                    }
                    nVar3.f18353a |= iVar.f18336d;
                    z10 = false;
                } else {
                    mVar = mVar3;
                    if ("clip-path".equals(name)) {
                        h hVar = new h();
                        if (u.q(xmlPullParser, "pathData")) {
                            TypedArray typedArrayV3 = u.v(resources, theme, attributeSet, a.f18288d);
                            String string4 = typedArrayV3.getString(0);
                            if (string4 != null) {
                                hVar.f18334b = string4;
                            }
                            String string5 = typedArrayV3.getString(1);
                            if (string5 != null) {
                                hVar.f18333a = q.c(string5);
                            }
                            hVar.f18335c = !u.q(xmlPullParser, "fillType") ? 0 : typedArrayV3.getInt(2, 0);
                            typedArrayV3.recycle();
                        }
                        jVar.f18322b.add(hVar);
                        if (hVar.getPathName() != null) {
                            bVar.put(hVar.getPathName(), hVar);
                        }
                        nVar3.f18353a = hVar.f18336d | nVar3.f18353a;
                    } else if ("group".equals(name)) {
                        j jVar2 = new j();
                        TypedArray typedArrayV4 = u.v(resources, theme, attributeSet, a.f18286b);
                        float f19 = jVar2.f18323c;
                        if (u.q(xmlPullParser, "rotation")) {
                            f19 = typedArrayV4.getFloat(5, f19);
                        }
                        jVar2.f18323c = f19;
                        jVar2.f18324d = typedArrayV4.getFloat(1, jVar2.f18324d);
                        jVar2.f18325e = typedArrayV4.getFloat(2, jVar2.f18325e);
                        float f20 = jVar2.f18326f;
                        if (u.q(xmlPullParser, "scaleX")) {
                            f20 = typedArrayV4.getFloat(3, f20);
                        }
                        jVar2.f18326f = f20;
                        float f21 = jVar2.f18327g;
                        if (u.q(xmlPullParser, "scaleY")) {
                            f21 = typedArrayV4.getFloat(4, f21);
                        }
                        jVar2.f18327g = f21;
                        float f22 = jVar2.f18328h;
                        if (u.q(xmlPullParser, "translateX")) {
                            f22 = typedArrayV4.getFloat(6, f22);
                        }
                        jVar2.f18328h = f22;
                        float f23 = jVar2.f18329i;
                        if (u.q(xmlPullParser, "translateY")) {
                            f23 = typedArrayV4.getFloat(7, f23);
                        }
                        jVar2.f18329i = f23;
                        String string6 = typedArrayV4.getString(0);
                        if (string6 != null) {
                            jVar2.f18332l = string6;
                        }
                        jVar2.c();
                        typedArrayV4.recycle();
                        jVar.f18322b.add(jVar2);
                        arrayDeque.push(jVar2);
                        if (jVar2.getGroupName() != null) {
                            bVar.put(jVar2.getGroupName(), jVar2);
                        }
                        nVar3.f18353a = jVar2.f18331k | nVar3.f18353a;
                    }
                }
            } else {
                mVar = mVar3;
                i10 = depth;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            depth = i10;
            mVar3 = mVar;
            i12 = 1;
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
        this.f18368d = a(nVar.f18355c, nVar.f18356d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f18309a;
        return drawable != null ? h0.a.d(drawable) : this.f18367b.f18357e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f18367b;
            if (nVar != null) {
                m mVar = nVar.f18354b;
                if (mVar.f18351n == null) {
                    mVar.f18351n = Boolean.valueOf(mVar.f18344g.a());
                }
                if (mVar.f18351n.booleanValue() || ((colorStateList = this.f18367b.f18355c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f18370h && super.mutate() == this) {
            n nVar = this.f18367b;
            n nVar2 = new n();
            nVar2.f18355c = null;
            nVar2.f18356d = f18366v;
            if (nVar != null) {
                nVar2.f18353a = nVar.f18353a;
                m mVar = new m(nVar.f18354b);
                nVar2.f18354b = mVar;
                if (nVar.f18354b.f18342e != null) {
                    mVar.f18342e = new Paint(nVar.f18354b.f18342e);
                }
                if (nVar.f18354b.f18341d != null) {
                    nVar2.f18354b.f18341d = new Paint(nVar.f18354b.f18341d);
                }
                nVar2.f18355c = nVar.f18355c;
                nVar2.f18356d = nVar.f18356d;
                nVar2.f18357e = nVar.f18357e;
            }
            this.f18367b = nVar2;
            this.f18370h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z9;
        PorterDuff.Mode mode;
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f18367b;
        ColorStateList colorStateList = nVar.f18355c;
        if (colorStateList == null || (mode = nVar.f18356d) == null) {
            z9 = false;
        } else {
            this.f18368d = a(colorStateList, mode);
            invalidateSelf();
            z9 = true;
        }
        m mVar = nVar.f18354b;
        if (mVar.f18351n == null) {
            mVar.f18351n = Boolean.valueOf(mVar.f18344g.a());
        }
        if (mVar.f18351n.booleanValue()) {
            boolean zB = nVar.f18354b.f18344g.b(iArr);
            nVar.f18363k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f18367b.f18354b.getRootAlpha() != i10) {
            this.f18367b.f18354b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            h0.a.e(drawable, z9);
        } else {
            this.f18367b.f18357e = z9;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f18369f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            z.C(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            h0.b.h(drawable, colorStateList);
            return;
        }
        n nVar = this.f18367b;
        if (nVar.f18355c != colorStateList) {
            nVar.f18355c = colorStateList;
            this.f18368d = a(colorStateList, nVar.f18356d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            h0.b.i(drawable, mode);
            return;
        }
        n nVar = this.f18367b;
        if (nVar.f18356d != mode) {
            nVar.f18356d = mode;
            this.f18368d = a(nVar.f18355c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f18309a;
        return drawable != null ? drawable.setVisible(z9, z10) : super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public p(n nVar) {
        this.f18371q = true;
        this.f18372s = new float[9];
        this.f18373t = new Matrix();
        this.f18374u = new Rect();
        this.f18367b = nVar;
        this.f18368d = a(nVar.f18355c, nVar.f18356d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f18309a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
