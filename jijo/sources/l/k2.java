package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class k2 implements k.h0 {
    public static final Method M;
    public static final Method N;
    public static final Method O;
    public View A;
    public AdapterView.OnItemClickListener B;
    public AdapterView.OnItemSelectedListener C;
    public final Handler H;
    public Rect J;
    public boolean K;
    public final d0 L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f14909b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x1 f14910d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14913q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14914s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14916u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14917v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14918w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h2 f14921z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14911f = -2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14912h = -2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14915t = 1002;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14919x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f14920y = Integer.MAX_VALUE;
    public final d2 D = new d2(this, 2);
    public final j2 E = new j2(0, this);
    public final i2 F = new i2(this);
    public final d2 G = new d2(this, 1);
    public final Rect I = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                M = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                O = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                N = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public k2(Context context, AttributeSet attributeSet, int i10, int i11) {
        int resourceId;
        this.f14908a = context;
        this.H = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a.f12609p, i10, i11);
        this.f14913q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f14914s = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f14916u = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        d0 d0Var = new d0(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e.a.f12613t, i10, i11);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            z3.a.U(d0Var, typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        d0Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : p7.q.g(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.L = d0Var;
        d0Var.setInputMethodMode(1);
    }

    @Override // k.h0
    public final boolean a() {
        return this.L.isShowing();
    }

    public final int b() {
        return this.f14913q;
    }

    public final Drawable d() {
        return this.L.getBackground();
    }

    @Override // k.h0
    public final void dismiss() {
        d0 d0Var = this.L;
        d0Var.dismiss();
        d0Var.setContentView(null);
        this.f14910d = null;
        this.H.removeCallbacks(this.D);
    }

    @Override // k.h0
    public final void e() {
        int i10;
        int iA;
        int paddingBottom;
        x1 x1Var;
        x1 x1Var2 = this.f14910d;
        d0 d0Var = this.L;
        Context context = this.f14908a;
        if (x1Var2 == null) {
            x1 x1VarQ = q(context, !this.K);
            this.f14910d = x1VarQ;
            x1VarQ.setAdapter(this.f14909b);
            this.f14910d.setOnItemClickListener(this.B);
            this.f14910d.setFocusable(true);
            this.f14910d.setFocusableInTouchMode(true);
            this.f14910d.setOnItemSelectedListener(new e2(0, this));
            this.f14910d.setOnScrollListener(this.F);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.C;
            if (onItemSelectedListener != null) {
                this.f14910d.setOnItemSelectedListener(onItemSelectedListener);
            }
            d0Var.setContentView(this.f14910d);
        }
        Drawable background = d0Var.getBackground();
        Rect rect = this.I;
        if (background != null) {
            background.getPadding(rect);
            int i11 = rect.top;
            i10 = rect.bottom + i11;
            if (!this.f14916u) {
                this.f14914s = -i11;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        boolean z9 = d0Var.getInputMethodMode() == 2;
        View view = this.A;
        int i12 = this.f14914s;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = N;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(d0Var, view, Integer.valueOf(i12), Boolean.valueOf(z9))).intValue();
                } catch (Exception unused) {
                    iA = d0Var.getMaxAvailableHeight(view, i12);
                }
            } else {
                iA = d0Var.getMaxAvailableHeight(view, i12);
            }
        } else {
            iA = f2.a(d0Var, view, i12, z9);
        }
        int i13 = this.f14911f;
        if (i13 == -1) {
            paddingBottom = iA + i10;
        } else {
            int i14 = this.f14912h;
            int iA2 = this.f14910d.a(i14 != -2 ? i14 != -1 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f14910d.getPaddingBottom() + this.f14910d.getPaddingTop() + i10 : 0);
        }
        boolean z10 = this.L.getInputMethodMode() == 2;
        z3.a.V(d0Var, this.f14915t);
        if (d0Var.isShowing()) {
            View view2 = this.A;
            WeakHashMap weakHashMap = o0.v0.f16075a;
            if (o0.g0.b(view2)) {
                int width = this.f14912h;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.A.getWidth();
                }
                if (i13 == -1) {
                    i13 = z10 ? paddingBottom : -1;
                    if (z10) {
                        d0Var.setWidth(this.f14912h == -1 ? -1 : 0);
                        d0Var.setHeight(0);
                    } else {
                        d0Var.setWidth(this.f14912h == -1 ? -1 : 0);
                        d0Var.setHeight(-1);
                    }
                } else if (i13 == -2) {
                    i13 = paddingBottom;
                }
                d0Var.setOutsideTouchable(true);
                View view3 = this.A;
                int i15 = this.f14913q;
                int i16 = this.f14914s;
                if (width < 0) {
                    width = -1;
                }
                d0Var.update(view3, i15, i16, width, i13 < 0 ? -1 : i13);
                return;
            }
            return;
        }
        int width2 = this.f14912h;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.A.getWidth();
        }
        if (i13 == -1) {
            i13 = -1;
        } else if (i13 == -2) {
            i13 = paddingBottom;
        }
        d0Var.setWidth(width2);
        d0Var.setHeight(i13);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = M;
            if (method2 != null) {
                try {
                    method2.invoke(d0Var, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            g2.b(d0Var, true);
        }
        d0Var.setOutsideTouchable(true);
        d0Var.setTouchInterceptor(this.E);
        if (this.f14918w) {
            z3.a.U(d0Var, this.f14917v);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = O;
            if (method3 != null) {
                try {
                    method3.invoke(d0Var, this.J);
                } catch (Exception unused3) {
                }
            }
        } else {
            g2.a(d0Var, this.J);
        }
        s0.l.a(d0Var, this.A, this.f14913q, this.f14914s, this.f14919x);
        this.f14910d.setSelection(-1);
        if ((!this.K || this.f14910d.isInTouchMode()) && (x1Var = this.f14910d) != null) {
            x1Var.setListSelectionHidden(true);
            x1Var.requestLayout();
        }
        if (this.K) {
            return;
        }
        this.H.post(this.G);
    }

    public final void h(Drawable drawable) {
        this.L.setBackgroundDrawable(drawable);
    }

    @Override // k.h0
    public final x1 i() {
        return this.f14910d;
    }

    public final void j(int i10) {
        this.f14914s = i10;
        this.f14916u = true;
    }

    public final void l(int i10) {
        this.f14913q = i10;
    }

    public final int n() {
        if (this.f14916u) {
            return this.f14914s;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        h2 h2Var = this.f14921z;
        if (h2Var == null) {
            this.f14921z = new h2(0, this);
        } else {
            ListAdapter listAdapter2 = this.f14909b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(h2Var);
            }
        }
        this.f14909b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f14921z);
        }
        x1 x1Var = this.f14910d;
        if (x1Var != null) {
            x1Var.setAdapter(this.f14909b);
        }
    }

    public x1 q(Context context, boolean z9) {
        return new x1(context, z9);
    }

    public final void r(int i10) {
        Drawable background = this.L.getBackground();
        if (background == null) {
            this.f14912h = i10;
            return;
        }
        Rect rect = this.I;
        background.getPadding(rect);
        this.f14912h = rect.left + rect.right + i10;
    }
}
