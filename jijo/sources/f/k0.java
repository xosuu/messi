package f;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import com.google.android.gms.internal.ads.ur0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.e4;
import l.n1;
import l.x3;
import o0.t1;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends u implements k.m, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final s.k f12888t0 = new s.k();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int[] f12889u0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final boolean f12890v0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final boolean f12891w0 = true;
    public b4.f A;
    public j.j B;
    public CharSequence C;
    public n1 D;
    public w E;
    public x F;
    public j.b G;
    public ActionBarContextView H;
    public PopupWindow I;
    public v J;
    public boolean L;
    public ViewGroup M;
    public TextView N;
    public View O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public j0[] X;
    public j0 Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f12892a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f12893b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f12894c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Configuration f12895d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f12896e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f12897f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f12898g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f12899h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public f0 f12900i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public f0 f12901j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f12902k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f12903l0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f12905n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public Rect f12906o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Rect f12907p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public p0 f12908q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public OnBackInvokedDispatcher f12909r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public OnBackInvokedCallback f12910s0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f12911v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f12912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Window f12913x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e0 f12914y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final r f12915z;
    public o0.d1 K = null;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final v f12904m0 = new v(this, 0);

    public k0(Context context, Window window, r rVar, Object obj) {
        q qVar;
        this.f12896e0 = -100;
        this.f12912w = context;
        this.f12915z = rVar;
        this.f12911v = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof q)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    qVar = (q) context;
                    break;
                }
            }
            qVar = null;
            if (qVar != null) {
                this.f12896e0 = ((k0) qVar.q()).f12896e0;
            }
        }
        if (this.f12896e0 == -100) {
            s.k kVar = f12888t0;
            Integer num = (Integer) kVar.getOrDefault(this.f12911v.getClass().getName(), null);
            if (num != null) {
                this.f12896e0 = num.intValue();
                kVar.remove(this.f12911v.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        l.v.d();
    }

    public static k0.h C(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? c0.b(configuration) : k0.h.b(b0.a(configuration.locale));
    }

    public static k0.h r(Context context) {
        k0.h hVar;
        k0.h hVarB;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (hVar = u.f12971d) == null) {
            return null;
        }
        k0.h hVarC = C(context.getApplicationContext().getResources().getConfiguration());
        int i11 = 0;
        k0.j jVar = hVar.f14632a;
        if (i10 < 24) {
            hVarB = jVar.isEmpty() ? k0.h.f14631b : k0.h.b(jVar.get(0).toString());
        } else if (jVar.isEmpty()) {
            hVarB = k0.h.f14631b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i11 < hVarC.f14632a.size() + jVar.size()) {
                Locale locale = i11 < jVar.size() ? jVar.get(i11) : hVarC.f14632a.get(i11 - jVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i11++;
            }
            hVarB = k0.h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return hVarB.f14632a.isEmpty() ? hVarC : hVarB;
    }

    public static Configuration v(Context context, int i10, k0.h hVar, Configuration configuration, boolean z9) {
        int i11 = i10 != 1 ? i10 != 2 ? z9 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                c0.d(configuration2, hVar);
            } else {
                k0.j jVar = hVar.f14632a;
                a0.b(configuration2, jVar.get(0));
                a0.a(configuration2, jVar.get(0));
            }
        }
        return configuration2;
    }

    public final Context A() {
        E();
        b4.f fVar = this.A;
        Context contextR = fVar != null ? fVar.r() : null;
        return contextR == null ? this.f12912w : contextR;
    }

    public final h0 B(Context context) {
        if (this.f12900i0 == null) {
            if (ur0.f9598q == null) {
                Context applicationContext = context.getApplicationContext();
                ur0.f9598q = new ur0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f12900i0 = new f0(this, ur0.f9598q);
        }
        return this.f12900i0;
    }

    public final j0 D(int i10) {
        j0[] j0VarArr = this.X;
        if (j0VarArr == null || j0VarArr.length <= i10) {
            j0[] j0VarArr2 = new j0[i10 + 1];
            if (j0VarArr != null) {
                System.arraycopy(j0VarArr, 0, j0VarArr2, 0, j0VarArr.length);
            }
            this.X = j0VarArr2;
            j0VarArr = j0VarArr2;
        }
        j0 j0Var = j0VarArr[i10];
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0();
        j0Var2.f12870a = i10;
        j0Var2.f12883n = false;
        j0VarArr[i10] = j0Var2;
        return j0Var2;
    }

    public final void E() {
        y();
        if (this.R && this.A == null) {
            Object obj = this.f12911v;
            if (obj instanceof Activity) {
                this.A = new d1((Activity) obj, this.S);
            } else if (obj instanceof Dialog) {
                this.A = new d1((Dialog) obj);
            }
            b4.f fVar = this.A;
            if (fVar != null) {
                fVar.H(this.f12905n0);
            }
        }
    }

    public final void F(int i10) {
        this.f12903l0 = (1 << i10) | this.f12903l0;
        if (this.f12902k0) {
            return;
        }
        View decorView = this.f12913x.getDecorView();
        WeakHashMap weakHashMap = o0.v0.f16075a;
        o0.d0.m(decorView, this.f12904m0);
        this.f12902k0 = true;
    }

    public final int G(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return B(context).d();
                }
                return -1;
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f12901j0 == null) {
                    this.f12901j0 = new f0(this, context);
                }
                return this.f12901j0.d();
            }
        }
        return i10;
    }

    public final boolean H() {
        boolean z9 = this.Z;
        this.Z = false;
        j0 j0VarD = D(0);
        if (j0VarD.f12882m) {
            if (!z9) {
                u(j0VarD, true);
            }
            return true;
        }
        j.b bVar = this.G;
        if (bVar != null) {
            bVar.a();
            return true;
        }
        E();
        b4.f fVar = this.A;
        return fVar != null && fVar.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0161, code lost:
    
        if (r15.f14551q.getCount() > 0) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(f.j0 r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.k0.I(f.j0, android.view.KeyEvent):void");
    }

    public final boolean J(j0 j0Var, int i10, KeyEvent keyEvent) {
        k.o oVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((j0Var.f12880k || K(j0Var, keyEvent)) && (oVar = j0Var.f12877h) != null) {
            return oVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    public final boolean K(j0 j0Var, KeyEvent keyEvent) {
        n1 n1Var;
        n1 n1Var2;
        Resources.Theme themeNewTheme;
        n1 n1Var3;
        n1 n1Var4;
        if (this.f12894c0) {
            return false;
        }
        if (j0Var.f12880k) {
            return true;
        }
        j0 j0Var2 = this.Y;
        if (j0Var2 != null && j0Var2 != j0Var) {
            u(j0Var2, false);
        }
        Window.Callback callback = this.f12913x.getCallback();
        int i10 = j0Var.f12870a;
        if (callback != null) {
            j0Var.f12876g = callback.onCreatePanelView(i10);
        }
        boolean z9 = i10 == 0 || i10 == 108;
        if (z9 && (n1Var4 = this.D) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) n1Var4;
            actionBarOverlayLayout.k();
            ((x3) actionBarOverlayLayout.f254h).f15079l = true;
        }
        if (j0Var.f12876g == null && (!z9 || !(this.A instanceof y0))) {
            k.o oVar = j0Var.f12877h;
            if (oVar == null || j0Var.f12884o) {
                if (oVar == null) {
                    Context context = this.f12912w;
                    if ((i10 == 0 || i10 == 108) && this.D != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(xyz.easypro.httpcustom.R.attr.l, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(xyz.easypro.httpcustom.R.attr.m, typedValue, true);
                        } else {
                            theme.resolveAttribute(xyz.easypro.httpcustom.R.attr.m, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            j.e eVar = new j.e(context, 0);
                            eVar.getTheme().setTo(themeNewTheme);
                            context = eVar;
                        }
                    }
                    k.o oVar2 = new k.o(context);
                    oVar2.f14563e = this;
                    k.o oVar3 = j0Var.f12877h;
                    if (oVar2 != oVar3) {
                        if (oVar3 != null) {
                            oVar3.r(j0Var.f12878i);
                        }
                        j0Var.f12877h = oVar2;
                        k.k kVar = j0Var.f12878i;
                        if (kVar != null) {
                            oVar2.b(kVar, oVar2.f14559a);
                        }
                    }
                    if (j0Var.f12877h == null) {
                        return false;
                    }
                }
                if (z9 && (n1Var2 = this.D) != null) {
                    if (this.E == null) {
                        this.E = new w(this);
                    }
                    ((ActionBarOverlayLayout) n1Var2).l(j0Var.f12877h, this.E);
                }
                j0Var.f12877h.w();
                if (!callback.onCreatePanelMenu(i10, j0Var.f12877h)) {
                    k.o oVar4 = j0Var.f12877h;
                    if (oVar4 != null) {
                        if (oVar4 != null) {
                            oVar4.r(j0Var.f12878i);
                        }
                        j0Var.f12877h = null;
                    }
                    if (z9 && (n1Var = this.D) != null) {
                        ((ActionBarOverlayLayout) n1Var).l(null, this.E);
                    }
                    return false;
                }
                j0Var.f12884o = false;
            }
            j0Var.f12877h.w();
            Bundle bundle = j0Var.f12885p;
            if (bundle != null) {
                j0Var.f12877h.s(bundle);
                j0Var.f12885p = null;
            }
            if (!callback.onPreparePanel(0, j0Var.f12876g, j0Var.f12877h)) {
                if (z9 && (n1Var3 = this.D) != null) {
                    ((ActionBarOverlayLayout) n1Var3).l(null, this.E);
                }
                j0Var.f12877h.v();
                return false;
            }
            j0Var.f12877h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            j0Var.f12877h.v();
        }
        j0Var.f12880k = true;
        j0Var.f12881l = false;
        this.Y = j0Var;
        return true;
    }

    public final void L() {
        if (this.L) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void M() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z9 = false;
            if (this.f12909r0 != null && (D(0).f12882m || this.G != null)) {
                z9 = true;
            }
            if (z9 && this.f12910s0 == null) {
                this.f12910s0 = d0.b(this.f12909r0, this);
            } else {
                if (z9 || (onBackInvokedCallback = this.f12910s0) == null) {
                    return;
                }
                d0.c(this.f12909r0, onBackInvokedCallback);
            }
        }
    }

    public final int N(t1 t1Var, Rect rect) {
        boolean z9;
        boolean z10;
        int iD = t1Var != null ? t1Var.d() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.H;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z9 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.H.getLayoutParams();
            if (this.H.isShown()) {
                if (this.f12906o0 == null) {
                    this.f12906o0 = new Rect();
                    this.f12907p0 = new Rect();
                }
                Rect rect2 = this.f12906o0;
                Rect rect3 = this.f12907p0;
                if (t1Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(t1Var.b(), t1Var.d(), t1Var.c(), t1Var.a());
                }
                ViewGroup viewGroup = this.M;
                Method method = e4.f14850a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception unused) {
                    }
                }
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                ViewGroup viewGroup2 = this.M;
                WeakHashMap weakHashMap = o0.v0.f16075a;
                t1 t1VarA = Build.VERSION.SDK_INT >= 23 ? o0.k0.a(viewGroup2) : o0.j0.j(viewGroup2);
                int iB = t1VarA == null ? 0 : t1VarA.b();
                int iC = t1VarA == null ? 0 : t1VarA.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z10 = true;
                }
                Context context = this.f12912w;
                if (i10 <= 0 || this.O != null) {
                    View view = this.O;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            this.O.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(context);
                    this.O = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    this.M.addView(this.O, -1, layoutParams);
                }
                View view3 = this.O;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.O;
                    view4.setBackgroundColor((o0.d0.g(view4) & 8192) != 0 ? d0.f.b(context, xyz.easypro.httpcustom.R.color.g) : d0.f.b(context, xyz.easypro.httpcustom.R.color.f));
                }
                if (!this.T && z) {
                    iD = 0;
                }
                z9 = z;
                z = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z9 = false;
            } else {
                z9 = false;
                z = false;
            }
            if (z) {
                this.H.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.O;
        if (view5 != null) {
            view5.setVisibility(z9 ? 0 : 8);
        }
        return iD;
    }

    @Override // f.u
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        ((ViewGroup) this.M.findViewById(R.id.content)).addView(view, layoutParams);
        this.f12914y.a(this.f12913x.getCallback());
    }

    @Override // f.u
    public final void b() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f12912w);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            boolean z9 = layoutInflaterFrom.getFactory2() instanceof k0;
        }
    }

    @Override // f.u
    public final void c() {
        if (this.A != null) {
            E();
            if (this.A.t()) {
                return;
            }
            F(0);
        }
    }

    @Override // f.u
    public final void e(Configuration configuration) throws IllegalAccessException {
        if (this.R && this.L) {
            E();
            b4.f fVar = this.A;
            if (fVar != null) {
                fVar.z();
            }
        }
        l.v vVarA = l.v.a();
        Context context = this.f12912w;
        synchronized (vVarA) {
            vVarA.f15031a.k(context);
        }
        this.f12895d0 = new Configuration(this.f12912w.getResources().getConfiguration());
        o(false, false);
    }

    @Override // f.u
    public final void f() throws IllegalAccessException {
        String strJ;
        this.f12892a0 = true;
        o(false, true);
        z();
        Object obj = this.f12911v;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strJ = p7.q.j(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                strJ = null;
            }
            if (strJ != null) {
                b4.f fVar = this.A;
                if (fVar == null) {
                    this.f12905n0 = true;
                } else {
                    fVar.H(true);
                }
            }
            synchronized (u.f12976t) {
                u.h(this);
                u.f12975s.add(new WeakReference(this));
            }
        }
        this.f12895d0 = new Configuration(this.f12912w.getResources().getConfiguration());
        this.f12893b0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // f.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f12911v
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = f.u.f12976t
            monitor-enter(r0)
            f.u.h(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f12902k0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f12913x
            android.view.View r0 = r0.getDecorView()
            f.v r1 = r3.f12904m0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f12894c0 = r0
            int r0 = r3.f12896e0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f12911v
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            s.k r0 = f.k0.f12888t0
            java.lang.Object r1 = r3.f12911v
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f12896e0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            s.k r0 = f.k0.f12888t0
            java.lang.Object r1 = r3.f12911v
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            b4.f r0 = r3.A
            if (r0 == 0) goto L63
            r0.A()
        L63:
            f.f0 r0 = r3.f12900i0
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            f.f0 r0 = r3.f12901j0
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.k0.g():void");
    }

    @Override // f.u
    public final boolean i(int i10) {
        if (i10 == 8) {
            i10 = 108;
        } else if (i10 == 9) {
            i10 = 109;
        }
        if (this.V && i10 == 108) {
            return false;
        }
        if (this.R && i10 == 1) {
            this.R = false;
        }
        if (i10 == 1) {
            L();
            this.V = true;
            return true;
        }
        if (i10 == 2) {
            L();
            this.P = true;
            return true;
        }
        if (i10 == 5) {
            L();
            this.Q = true;
            return true;
        }
        if (i10 == 10) {
            L();
            this.T = true;
            return true;
        }
        if (i10 == 108) {
            L();
            this.R = true;
            return true;
        }
        if (i10 != 109) {
            return this.f12913x.requestFeature(i10);
        }
        L();
        this.S = true;
        return true;
    }

    @Override // f.u
    public final void j(int i10) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f12912w).inflate(i10, viewGroup);
        this.f12914y.a(this.f12913x.getCallback());
    }

    @Override // f.u
    public final void k(View view) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f12914y.a(this.f12913x.getCallback());
    }

    @Override // f.u
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.M.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f12914y.a(this.f12913x.getCallback());
    }

    @Override // f.u
    public final void m(CharSequence charSequence) {
        this.C = charSequence;
        n1 n1Var = this.D;
        if (n1Var != null) {
            n1Var.setWindowTitle(charSequence);
            return;
        }
        b4.f fVar = this.A;
        if (fVar != null) {
            fVar.O(charSequence);
            return;
        }
        TextView textView = this.N;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // k.m
    public final boolean n(k.o oVar, MenuItem menuItem) {
        j0 j0Var;
        Window.Callback callback = this.f12913x.getCallback();
        if (callback != null && !this.f12894c0) {
            k.o oVarK = oVar.k();
            j0[] j0VarArr = this.X;
            int length = j0VarArr != null ? j0VarArr.length : 0;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    j0Var = j0VarArr[i10];
                    if (j0Var != null && j0Var.f12877h == oVarK) {
                        break;
                    }
                    i10++;
                } else {
                    j0Var = null;
                    break;
                }
            }
            if (j0Var != null) {
                return callback.onMenuItemSelected(j0Var.f12870a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean o(boolean r18, boolean r19) throws java.lang.IllegalAccessException {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.k0.o(boolean, boolean):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.k0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(android.view.Window r8) {
        /*
            r7 = this;
            android.view.Window r0 = r7.f12913x
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L80
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof f.e0
            if (r2 != 0) goto L7a
            f.e0 r1 = new f.e0
            r1.<init>(r7, r0)
            r7.f12914y = r1
            r8.setCallback(r1)
            int[] r0 = f.k0.f12889u0
            android.content.Context r1 = r7.f12912w
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r3 = 0
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r0.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            l.v r4 = l.v.a()
            monitor-enter(r4)
            l.u2 r5 = r4.f15031a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r1 = r5.g(r1, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)
            throw r8
        L3f:
            r1 = r2
        L40:
            if (r1 == 0) goto L45
            r8.setBackgroundDrawable(r1)
        L45:
            r0.recycle()
            r7.f12913x = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f12909r0
            if (r8 != 0) goto L79
            if (r8 == 0) goto L5f
            android.window.OnBackInvokedCallback r0 = r7.f12910s0
            if (r0 == 0) goto L5f
            f.d0.c(r8, r0)
            r7.f12910s0 = r2
        L5f:
            java.lang.Object r8 = r7.f12911v
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L74
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = f.d0.a(r8)
            r7.f12909r0 = r8
            goto L76
        L74:
            r7.f12909r0 = r2
        L76:
            r7.M()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f.k0.p(android.view.Window):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.i() != false) goto L20;
     */
    @Override // k.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(k.o r6) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.k0.q(k.o):void");
    }

    public final void s(int i10, j0 j0Var, k.o oVar) {
        if (oVar == null) {
            if (j0Var == null && i10 >= 0) {
                j0[] j0VarArr = this.X;
                if (i10 < j0VarArr.length) {
                    j0Var = j0VarArr[i10];
                }
            }
            if (j0Var != null) {
                oVar = j0Var.f12877h;
            }
        }
        if ((j0Var == null || j0Var.f12882m) && !this.f12894c0) {
            e0 e0Var = this.f12914y;
            Window.Callback callback = this.f12913x.getCallback();
            e0Var.getClass();
            try {
                e0Var.f12829h = true;
                callback.onPanelClosed(i10, oVar);
            } finally {
                e0Var.f12829h = false;
            }
        }
    }

    public final void t(k.o oVar) {
        androidx.appcompat.widget.b bVar;
        if (this.W) {
            return;
        }
        this.W = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.D;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((x3) actionBarOverlayLayout.f254h).f15068a.f343a;
        if (actionMenuView != null && (bVar = actionMenuView.F) != null) {
            bVar.e();
            l.h hVar = bVar.G;
            if (hVar != null && hVar.b()) {
                hVar.f14498j.dismiss();
            }
        }
        Window.Callback callback = this.f12913x.getCallback();
        if (callback != null && !this.f12894c0) {
            callback.onPanelClosed(108, oVar);
        }
        this.W = false;
    }

    public final void u(j0 j0Var, boolean z9) {
        i0 i0Var;
        n1 n1Var;
        if (z9 && j0Var.f12870a == 0 && (n1Var = this.D) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) n1Var;
            actionBarOverlayLayout.k();
            if (((x3) actionBarOverlayLayout.f254h).f15068a.p()) {
                t(j0Var.f12877h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f12912w.getSystemService("window");
        if (windowManager != null && j0Var.f12882m && (i0Var = j0Var.f12874e) != null) {
            windowManager.removeView(i0Var);
            if (z9) {
                s(j0Var.f12870a, j0Var, null);
            }
        }
        j0Var.f12880k = false;
        j0Var.f12881l = false;
        j0Var.f12882m = false;
        j0Var.f12875f = null;
        j0Var.f12883n = true;
        if (this.Y == j0Var) {
            this.Y = null;
        }
        if (j0Var.f12870a == 0) {
            M();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f.k0.w(android.view.KeyEvent):boolean");
    }

    public final void x(int i10) {
        j0 j0VarD = D(i10);
        if (j0VarD.f12877h != null) {
            Bundle bundle = new Bundle();
            j0VarD.f12877h.t(bundle);
            if (bundle.size() > 0) {
                j0VarD.f12885p = bundle;
            }
            j0VarD.f12877h.w();
            j0VarD.f12877h.clear();
        }
        j0VarD.f12884o = true;
        j0VarD.f12883n = true;
        if ((i10 == 108 || i10 == 0) && this.D != null) {
            j0 j0VarD2 = D(0);
            j0VarD2.f12880k = false;
            K(j0VarD2, null);
        }
    }

    public final void y() {
        ViewGroup viewGroup;
        if (this.L) {
            return;
        }
        int[] iArr = e.a.f12603j;
        Context context = this.f12912w;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            i(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            i(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            i(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            i(10);
        }
        this.U = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        z();
        this.f12913x.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.V) {
            viewGroup = this.T ? (ViewGroup) layoutInflaterFrom.inflate(xyz.easypro.httpcustom.R.layout.w, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(xyz.easypro.httpcustom.R.layout.v, (ViewGroup) null);
        } else if (this.U) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(xyz.easypro.httpcustom.R.layout.m, (ViewGroup) null);
            this.S = false;
            this.R = false;
        } else if (this.R) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(xyz.easypro.httpcustom.R.attr.l, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new j.e(context, typedValue.resourceId) : context).inflate(xyz.easypro.httpcustom.R.layout.x, (ViewGroup) null);
            n1 n1Var = (n1) viewGroup.findViewById(xyz.easypro.httpcustom.R.id.gx);
            this.D = n1Var;
            n1Var.setWindowCallback(this.f12913x.getCallback());
            if (this.S) {
                ((ActionBarOverlayLayout) this.D).j(109);
            }
            if (this.P) {
                ((ActionBarOverlayLayout) this.D).j(2);
            }
            if (this.Q) {
                ((ActionBarOverlayLayout) this.D).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.R + ", windowActionBarOverlay: " + this.S + ", android:windowIsFloating: " + this.U + ", windowActionModeOverlay: " + this.T + ", windowNoTitle: " + this.V + " }");
        }
        w wVar = new w(this);
        WeakHashMap weakHashMap = o0.v0.f16075a;
        o0.j0.u(viewGroup, wVar);
        if (this.D == null) {
            this.N = (TextView) viewGroup.findViewById(xyz.easypro.httpcustom.R.id.x0);
        }
        Method method = e4.f14850a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(xyz.easypro.httpcustom.R.id.av);
        ViewGroup viewGroup2 = (ViewGroup) this.f12913x.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f12913x.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new w(this));
        this.M = viewGroup;
        Object obj = this.f12911v;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.C;
        if (!TextUtils.isEmpty(title)) {
            n1 n1Var2 = this.D;
            if (n1Var2 != null) {
                n1Var2.setWindowTitle(title);
            } else {
                b4.f fVar = this.A;
                if (fVar != null) {
                    fVar.O(title);
                } else {
                    TextView textView = this.N;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.M.findViewById(R.id.content);
        View decorView = this.f12913x.getDecorView();
        contentFrameLayout2.f290s.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = o0.v0.f16075a;
        if (o0.g0.c(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.L = true;
        j0 j0VarD = D(0);
        if (this.f12894c0 || j0VarD.f12877h != null) {
            return;
        }
        F(108);
    }

    public final void z() {
        if (this.f12913x == null) {
            Object obj = this.f12911v;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.f12913x == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
