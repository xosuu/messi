package a5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;
import com.google.android.gms.internal.ads.tp1;
import f0.q;
import g4.a0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f29a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f33e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f34f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f35g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f36h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f37i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f38j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f39k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f40l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Typeface f42n;

    public d(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, l4.a.D);
        this.f39k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f38j = tp1.g(context, typedArrayObtainStyledAttributes, 3);
        tp1.g(context, typedArrayObtainStyledAttributes, 4);
        tp1.g(context, typedArrayObtainStyledAttributes, 5);
        this.f31c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f32d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i11 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f40l = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
        this.f30b = typedArrayObtainStyledAttributes.getString(i11);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f29a = tp1.g(context, typedArrayObtainStyledAttributes, 6);
        this.f33e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f34f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f35g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, l4.a.f15206s);
        this.f36h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f37i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f42n;
        int i10 = this.f31c;
        if (typeface == null && (str = this.f30b) != null) {
            this.f42n = Typeface.create(str, i10);
        }
        if (this.f42n == null) {
            int i11 = this.f32d;
            if (i11 == 1) {
                this.f42n = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f42n = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f42n = Typeface.DEFAULT;
            } else {
                this.f42n = Typeface.MONOSPACE;
            }
            this.f42n = Typeface.create(this.f42n, i10);
        }
    }

    public final Typeface b(Context context) {
        if (this.f41m) {
            return this.f42n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceB = q.b(context, this.f40l);
                this.f42n = typefaceB;
                if (typefaceB != null) {
                    this.f42n = Typeface.create(typefaceB, this.f31c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.f41m = true;
        return this.f42n;
    }

    public final void c(Context context, t.a aVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f40l;
        if (i10 == 0) {
            this.f41m = true;
        }
        if (this.f41m) {
            aVar.l(this.f42n, true);
            return;
        }
        try {
            b bVar = new b(this, aVar);
            ThreadLocal threadLocal = q.f13039a;
            if (context.isRestricted()) {
                bVar.c(-4);
            } else {
                q.c(context, i10, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f41m = true;
            aVar.k(1);
        } catch (Exception unused2) {
            this.f41m = true;
            aVar.k(-3);
        }
    }

    public final boolean d(Context context) {
        int i10 = this.f40l;
        Typeface typefaceC = null;
        if (i10 != 0) {
            ThreadLocal threadLocal = q.f13039a;
            if (!context.isRestricted()) {
                typefaceC = q.c(context, i10, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceC != null;
    }

    public final void e(Context context, TextPaint textPaint, t.a aVar) {
        f(context, textPaint, aVar);
        ColorStateList colorStateList = this.f38j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f29a;
        textPaint.setShadowLayer(this.f35g, this.f33e, this.f34f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, t.a aVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f42n);
        c(context, new c(this, context, textPaint, aVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceS = a0.s(context.getResources().getConfiguration(), typeface);
        if (typefaceS != null) {
            typeface = typefaceS;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f31c;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f39k);
        if (this.f36h) {
            textPaint.setLetterSpacing(this.f37i);
        }
    }
}
