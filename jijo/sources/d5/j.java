package d5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.gms.internal.ads.en1;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b4.f f12411a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b4.f f12412b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b4.f f12413c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b4.f f12414d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f12415e = new a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f12416f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f12417g = new a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f12418h = new a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f12419i = en1.l();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f12420j = en1.l();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f12421k = en1.l();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f12422l = en1.l();

    public static g4.c a(Context context, int i10, int i11, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(l4.a.f15213z);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(3, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(2, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(1, i12);
            c cVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            c cVarC2 = c(typedArrayObtainStyledAttributes, 8, cVarC);
            c cVarC3 = c(typedArrayObtainStyledAttributes, 9, cVarC);
            c cVarC4 = c(typedArrayObtainStyledAttributes, 7, cVarC);
            c cVarC5 = c(typedArrayObtainStyledAttributes, 6, cVarC);
            g4.c cVar = new g4.c();
            b4.f fVarJ = en1.j(i13);
            cVar.f13696a = fVarJ;
            g4.c.b(fVarJ);
            cVar.f13700e = cVarC2;
            b4.f fVarJ2 = en1.j(i14);
            cVar.f13697b = fVarJ2;
            g4.c.b(fVarJ2);
            cVar.f13701f = cVarC3;
            b4.f fVarJ3 = en1.j(i15);
            cVar.f13698c = fVarJ3;
            g4.c.b(fVarJ3);
            cVar.f13702g = cVarC4;
            b4.f fVarJ4 = en1.j(i16);
            cVar.f13699d = fVarJ4;
            g4.c.b(fVarJ4);
            cVar.f13703h = cVarC5;
            return cVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static g4.c b(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l4.a.f15205r, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i10, c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i11 = typedValuePeekValue.type;
        return i11 == 5 ? new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new h(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z9 = this.f12422l.getClass().equals(e.class) && this.f12420j.getClass().equals(e.class) && this.f12419i.getClass().equals(e.class) && this.f12421k.getClass().equals(e.class);
        float fA = this.f12415e.a(rectF);
        return z9 && ((this.f12416f.a(rectF) > fA ? 1 : (this.f12416f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f12418h.a(rectF) > fA ? 1 : (this.f12418h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f12417g.a(rectF) > fA ? 1 : (this.f12417g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f12412b instanceof i) && (this.f12411a instanceof i) && (this.f12413c instanceof i) && (this.f12414d instanceof i));
    }

    public final g4.c e() {
        g4.c cVar = new g4.c();
        cVar.f13696a = new i();
        cVar.f13697b = new i();
        cVar.f13698c = new i();
        cVar.f13699d = new i();
        cVar.f13700e = new a(0.0f);
        cVar.f13701f = new a(0.0f);
        cVar.f13702g = new a(0.0f);
        cVar.f13703h = new a(0.0f);
        cVar.f13704i = en1.l();
        cVar.f13705j = en1.l();
        cVar.f13706k = en1.l();
        cVar.f13696a = this.f12411a;
        cVar.f13697b = this.f12412b;
        cVar.f13698c = this.f12413c;
        cVar.f13699d = this.f12414d;
        cVar.f13700e = this.f12415e;
        cVar.f13701f = this.f12416f;
        cVar.f13702g = this.f12417g;
        cVar.f13703h = this.f12418h;
        cVar.f13704i = this.f12419i;
        cVar.f13705j = this.f12420j;
        cVar.f13706k = this.f12421k;
        cVar.f13707l = this.f12422l;
        return cVar;
    }
}
