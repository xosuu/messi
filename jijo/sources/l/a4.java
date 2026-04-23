package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class a4 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static a4 f14776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static a4 f14777x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f14778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f14779b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14780d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z3 f14781f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z3 f14782h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14783q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14784s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b4 f14785t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14786u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14787v;

    /* JADX WARN: Type inference failed for: r0v0, types: [l.z3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.z3] */
    public a4(View view, CharSequence charSequence) {
        final int i10 = 0;
        this.f14781f = new Runnable(this) { // from class: l.z3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a4 f15095b;

            {
                this.f15095b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                a4 a4Var = this.f15095b;
                switch (i11) {
                    case 0:
                        a4Var.c(false);
                        break;
                    default:
                        a4Var.a();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f14782h = new Runnable(this) { // from class: l.z3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a4 f15095b;

            {
                this.f15095b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i11;
                a4 a4Var = this.f15095b;
                switch (i112) {
                    case 0:
                        a4Var.c(false);
                        break;
                    default:
                        a4Var.a();
                        break;
                }
            }
        };
        this.f14778a = view;
        this.f14779b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = o0.y0.f16087a;
        this.f14780d = Build.VERSION.SDK_INT >= 28 ? o0.x0.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f14787v = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(a4 a4Var) {
        a4 a4Var2 = f14776w;
        if (a4Var2 != null) {
            a4Var2.f14778a.removeCallbacks(a4Var2.f14781f);
        }
        f14776w = a4Var;
        if (a4Var != null) {
            a4Var.f14778a.postDelayed(a4Var.f14781f, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        a4 a4Var = f14777x;
        View view = this.f14778a;
        if (a4Var == this) {
            f14777x = null;
            b4 b4Var = this.f14785t;
            if (b4Var != null) {
                if (((View) b4Var.f14810b).getParent() != null) {
                    ((WindowManager) ((Context) b4Var.f14809a).getSystemService("window")).removeView((View) b4Var.f14810b);
                }
                this.f14785t = null;
                this.f14787v = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f14776w == this) {
            b(null);
        }
        view.removeCallbacks(this.f14782h);
    }

    public final void c(boolean z9) {
        int height;
        int i10;
        long longPressTimeout;
        long j10;
        long j11;
        WeakHashMap weakHashMap = o0.v0.f16075a;
        View view = this.f14778a;
        if (o0.g0.b(view)) {
            b(null);
            a4 a4Var = f14777x;
            if (a4Var != null) {
                a4Var.a();
            }
            f14777x = this;
            this.f14786u = z9;
            Context context = view.getContext();
            b4 b4Var = new b4();
            b4Var.f14812f = new WindowManager.LayoutParams();
            b4Var.f14813h = new Rect();
            b4Var.f14814q = new int[2];
            b4Var.f14815s = new int[2];
            b4Var.f14809a = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.a1, (ViewGroup) null);
            b4Var.f14810b = viewInflate;
            b4Var.f14811d = (TextView) viewInflate.findViewById(R.id.nn);
            ((WindowManager.LayoutParams) b4Var.f14812f).setTitle(b4.class.getSimpleName());
            ((WindowManager.LayoutParams) b4Var.f14812f).packageName = ((Context) b4Var.f14809a).getPackageName();
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) b4Var.f14812f;
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.e;
            layoutParams.flags = 24;
            this.f14785t = b4Var;
            int width = this.f14783q;
            int i11 = this.f14784s;
            boolean z10 = this.f14786u;
            if (((View) b4Var.f14810b).getParent() != null && ((View) b4Var.f14810b).getParent() != null) {
                ((WindowManager) ((Context) b4Var.f14809a).getSystemService("window")).removeView((View) b4Var.f14810b);
            }
            ((TextView) b4Var.f14811d).setText(this.f14779b);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) b4Var.f14812f;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = ((Context) b4Var.f14809a).getResources().getDimensionPixelOffset(R.dimen.u9);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = ((Context) b4Var.f14809a).getResources().getDimensionPixelOffset(R.dimen.u8);
                height = i11 + dimensionPixelOffset2;
                i10 = i11 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i10 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = ((Context) b4Var.f14809a).getResources().getDimensionPixelOffset(z10 ? R.dimen.ub : R.dimen.ua);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    }
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            if (rootView != null) {
                rootView.getWindowVisibleDisplayFrame((Rect) b4Var.f14813h);
                Rect rect = (Rect) b4Var.f14813h;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = ((Context) b4Var.f14809a).getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    ((Rect) b4Var.f14813h).set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen((int[]) b4Var.f14815s);
                view.getLocationOnScreen((int[]) b4Var.f14814q);
                int[] iArr = (int[]) b4Var.f14814q;
                int i12 = iArr[0];
                int[] iArr2 = (int[]) b4Var.f14815s;
                int i13 = i12 - iArr2[0];
                iArr[0] = i13;
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams2.x = (i13 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                ((View) b4Var.f14810b).measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = ((View) b4Var.f14810b).getMeasuredHeight();
                int i14 = ((int[]) b4Var.f14814q)[1];
                int i15 = ((i10 + i14) - dimensionPixelOffset3) - measuredHeight;
                int i16 = i14 + height + dimensionPixelOffset3;
                if (z10) {
                    if (i15 >= 0) {
                        layoutParams2.y = i15;
                    } else {
                        layoutParams2.y = i16;
                    }
                } else if (measuredHeight + i16 <= ((Rect) b4Var.f14813h).height()) {
                    layoutParams2.y = i16;
                } else {
                    layoutParams2.y = i15;
                }
            }
            ((WindowManager) ((Context) b4Var.f14809a).getSystemService("window")).addView((View) b4Var.f14810b, (WindowManager.LayoutParams) b4Var.f14812f);
            view.addOnAttachStateChangeListener(this);
            if (this.f14786u) {
                j11 = 2500;
            } else {
                if ((o0.d0.g(view) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            z3 z3Var = this.f14782h;
            view.removeCallbacks(z3Var);
            view.postDelayed(z3Var, j11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            l.b4 r4 = r3.f14785t
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f14786u
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.f14778a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f14787v = r4
            r3.a()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            l.b4 r4 = r3.f14785t
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f14787v
            if (r1 != 0) goto L66
            int r1 = r3.f14783q
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f14780d
            if (r1 > r2) goto L66
            int r1 = r3.f14784s
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f14783q = r4
            r3.f14784s = r5
            r3.f14787v = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a4.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f14783q = view.getWidth() / 2;
        this.f14784s = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
