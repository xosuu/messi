package b0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f1211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1219i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1220j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f1221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f1222l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1223m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f1224n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1225o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f1226p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f1227q;

    public e() {
        super(-2, -2);
        this.f1212b = false;
        this.f1213c = 0;
        this.f1214d = 0;
        this.f1215e = -1;
        this.f1216f = -1;
        this.f1217g = 0;
        this.f1218h = 0;
        this.f1227q = new Rect();
    }

    public final boolean a(int i10) {
        if (i10 == 0) {
            return this.f1224n;
        }
        if (i10 != 1) {
            return false;
        }
        return this.f1225o;
    }

    public e(Context context, AttributeSet attributeSet) {
        b bVar;
        super(context, attributeSet);
        this.f1212b = false;
        this.f1213c = 0;
        this.f1214d = 0;
        this.f1215e = -1;
        this.f1216f = -1;
        this.f1217g = 0;
        this.f1218h = 0;
        this.f1227q = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f3b);
        this.f1213c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f1216f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f1214d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f1215e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f1217g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f1218h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f1212b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.F;
            if (TextUtils.isEmpty(string)) {
                bVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.F;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.H;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.G);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    bVar = (b) constructor.newInstance(context, attributeSet);
                } catch (Exception e10) {
                    throw new RuntimeException(g1.a.q("Could not inflate Behavior subclass ", string), e10);
                }
            }
            this.f1211a = bVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        b bVar2 = this.f1211a;
        if (bVar2 != null) {
            bVar2.c(this);
        }
    }

    public e(e eVar) {
        super((ViewGroup.MarginLayoutParams) eVar);
        this.f1212b = false;
        this.f1213c = 0;
        this.f1214d = 0;
        this.f1215e = -1;
        this.f1216f = -1;
        this.f1217g = 0;
        this.f1218h = 0;
        this.f1227q = new Rect();
    }

    public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1212b = false;
        this.f1213c = 0;
        this.f1214d = 0;
        this.f1215e = -1;
        this.f1216f = -1;
        this.f1217g = 0;
        this.f1218h = 0;
        this.f1227q = new Rect();
    }

    public e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1212b = false;
        this.f1213c = 0;
        this.f1214d = 0;
        this.f1215e = -1;
        this.f1216f = -1;
        this.f1217g = 0;
        this.f1218h = 0;
        this.f1227q = new Rect();
    }
}
