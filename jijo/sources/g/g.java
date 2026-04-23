package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import g4.z;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f13546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources f13547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SparseArray f13551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable[] f13552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13554i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13555j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f13556k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f13557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13559n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13560o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13561p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13562q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13563r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13564s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13565t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13566u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13567v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13568w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13569x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13570y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13571z;

    public g(g gVar, h hVar, Resources resources) {
        this.f13554i = false;
        this.f13557l = false;
        this.f13568w = true;
        this.f13570y = 0;
        this.f13571z = 0;
        this.f13546a = hVar;
        this.f13547b = resources != null ? resources : gVar != null ? gVar.f13547b : null;
        int i10 = gVar != null ? gVar.f13548c : 0;
        int i11 = h.f13572y;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f13548c = i10;
        if (gVar == null) {
            this.f13552g = new Drawable[10];
            this.f13553h = 0;
            return;
        }
        this.f13549d = gVar.f13549d;
        this.f13550e = gVar.f13550e;
        this.f13566u = true;
        this.f13567v = true;
        this.f13554i = gVar.f13554i;
        this.f13557l = gVar.f13557l;
        this.f13568w = gVar.f13568w;
        this.f13569x = gVar.f13569x;
        this.f13570y = gVar.f13570y;
        this.f13571z = gVar.f13571z;
        this.A = gVar.A;
        this.B = gVar.B;
        this.C = gVar.C;
        this.D = gVar.D;
        this.E = gVar.E;
        this.F = gVar.F;
        this.G = gVar.G;
        if (gVar.f13548c == i10) {
            if (gVar.f13555j) {
                this.f13556k = gVar.f13556k != null ? new Rect(gVar.f13556k) : null;
                this.f13555j = true;
            }
            if (gVar.f13558m) {
                this.f13559n = gVar.f13559n;
                this.f13560o = gVar.f13560o;
                this.f13561p = gVar.f13561p;
                this.f13562q = gVar.f13562q;
                this.f13558m = true;
            }
        }
        if (gVar.f13563r) {
            this.f13564s = gVar.f13564s;
            this.f13563r = true;
        }
        if (gVar.f13565t) {
            this.f13565t = true;
        }
        Drawable[] drawableArr = gVar.f13552g;
        this.f13552g = new Drawable[drawableArr.length];
        this.f13553h = gVar.f13553h;
        SparseArray sparseArray = gVar.f13551f;
        if (sparseArray != null) {
            this.f13551f = sparseArray.clone();
        } else {
            this.f13551f = new SparseArray(this.f13553h);
        }
        int i12 = this.f13553h;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    this.f13551f.put(i13, constantState);
                } else {
                    this.f13552g[i13] = drawableArr[i13];
                }
            }
        }
    }

    public final int a(Drawable drawable) {
        int i10 = this.f13553h;
        if (i10 >= this.f13552g.length) {
            int i11 = i10 + 10;
            j jVar = (j) this;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = jVar.f13552g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            jVar.f13552g = drawableArr;
            int[][] iArr = new int[i11][];
            System.arraycopy(jVar.H, 0, iArr, 0, i10);
            jVar.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f13546a);
        this.f13552g[i10] = drawable;
        this.f13553h++;
        this.f13550e = drawable.getChangingConfigurations() | this.f13550e;
        this.f13563r = false;
        this.f13565t = false;
        this.f13556k = null;
        this.f13555j = false;
        this.f13558m = false;
        this.f13566u = false;
        return i10;
    }

    public final void b() {
        this.f13558m = true;
        c();
        int i10 = this.f13553h;
        Drawable[] drawableArr = this.f13552g;
        this.f13560o = -1;
        this.f13559n = -1;
        this.f13562q = 0;
        this.f13561p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f13559n) {
                this.f13559n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f13560o) {
                this.f13560o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f13561p) {
                this.f13561p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f13562q) {
                this.f13562q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f13551f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = this.f13551f.keyAt(i10);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f13551f.valueAt(i10);
                Drawable[] drawableArr = this.f13552g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f13547b);
                if (Build.VERSION.SDK_INT >= 23) {
                    z.A(drawableNewDrawable, this.f13569x);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f13546a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f13551f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i10 = this.f13553h;
        Drawable[] drawableArr = this.f13552g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f13551f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (h0.b.b(drawable)) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i10) {
        int iIndexOfKey;
        Drawable drawable = this.f13552g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f13551f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f13551f.valueAt(iIndexOfKey)).newDrawable(this.f13547b);
        if (Build.VERSION.SDK_INT >= 23) {
            z.A(drawableNewDrawable, this.f13569x);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f13546a);
        this.f13552g[i10] = drawableMutate;
        this.f13551f.removeAt(iIndexOfKey);
        if (this.f13551f.size() == 0) {
            this.f13551f = null;
        }
        return drawableMutate;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f13549d | this.f13550e;
    }
}
