package f;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.ads.fb1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.o1;
import l.u3;
import l.x3;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends b4.f implements l.f {
    public static final AccelerateInterpolator A = new AccelerateInterpolator();
    public static final DecelerateInterpolator B = new DecelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f12801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f12802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarOverlayLayout f12803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ActionBarContainer f12804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o1 f12805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ActionBarContextView f12806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f12807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c1 f12809k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c1 f12810l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public j.a f12811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f12813o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12814p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f12815q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12816r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f12817s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12818t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public j.l f12819u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12820v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12821w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b1 f12822x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b1 f12823y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final m2.f f12824z;

    public d1(Activity activity, boolean z9) {
        new ArrayList();
        this.f12813o = new ArrayList();
        this.f12814p = 0;
        this.f12815q = true;
        this.f12818t = true;
        this.f12822x = new b1(this, 0);
        this.f12823y = new b1(this, 1);
        this.f12824z = new m2.f(3, this);
        View decorView = activity.getWindow().getDecorView();
        r0(decorView);
        if (z9) {
            return;
        }
        this.f12807i = decorView.findViewById(R.id.content);
    }

    @Override // b4.f
    public final boolean C(int i10, KeyEvent keyEvent) {
        k.o oVar;
        c1 c1Var = this.f12809k;
        if (c1Var == null || (oVar = c1Var.f12797f) == null) {
            return false;
        }
        oVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return oVar.performShortcut(i10, keyEvent, 0);
    }

    @Override // b4.f
    public final void H(boolean z9) {
        if (this.f12808j) {
            return;
        }
        I(z9);
    }

    @Override // b4.f
    public final void I(boolean z9) {
        int i10 = z9 ? 4 : 0;
        x3 x3Var = (x3) this.f12805g;
        int i11 = x3Var.f15069b;
        this.f12808j = true;
        x3Var.a((i10 & 4) | (i11 & (-5)));
    }

    @Override // b4.f
    public final void J(int i10) {
        ((x3) this.f12805g).b(i10);
    }

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
    @Override // b4.f
    public final void K(g.i iVar) {
        x3 x3Var = (x3) this.f12805g;
        x3Var.f15073f = iVar;
        int i10 = x3Var.f15069b & 4;
        Toolbar toolbar = x3Var.f15068a;
        Drawable drawable = iVar;
        if (i10 == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (iVar == null) {
            drawable = x3Var.f15082o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // b4.f
    public final void L(boolean z9) {
        j.l lVar;
        this.f12820v = z9;
        if (z9 || (lVar = this.f12819u) == null) {
            return;
        }
        lVar.a();
    }

    @Override // b4.f
    public final void N(Spanned spanned) {
        x3 x3Var = (x3) this.f12805g;
        x3Var.f15074g = true;
        x3Var.f15075h = spanned;
        if ((x3Var.f15069b & 8) != 0) {
            Toolbar toolbar = x3Var.f15068a;
            toolbar.setTitle(spanned);
            if (x3Var.f15074g) {
                o0.v0.r(toolbar.getRootView(), spanned);
            }
        }
    }

    @Override // b4.f
    public final void O(CharSequence charSequence) {
        x3 x3Var = (x3) this.f12805g;
        if (x3Var.f15074g) {
            return;
        }
        x3Var.f15075h = charSequence;
        if ((x3Var.f15069b & 8) != 0) {
            Toolbar toolbar = x3Var.f15068a;
            toolbar.setTitle(charSequence);
            if (x3Var.f15074g) {
                o0.v0.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // b4.f
    public final j.b P(z zVar) {
        c1 c1Var = this.f12809k;
        if (c1Var != null) {
            c1Var.a();
        }
        this.f12803e.setHideOnContentScrollEnabled(false);
        this.f12806h.e();
        c1 c1Var2 = new c1(this, this.f12806h.getContext(), zVar);
        k.o oVar = c1Var2.f12797f;
        oVar.w();
        try {
            if (!c1Var2.f12798h.c(c1Var2, oVar)) {
                return null;
            }
            this.f12809k = c1Var2;
            c1Var2.g();
            this.f12806h.c(c1Var2);
            q0(true);
            return c1Var2;
        } finally {
            oVar.v();
        }
    }

    @Override // b4.f
    public final boolean f() {
        u3 u3Var;
        o1 o1Var = this.f12805g;
        if (o1Var == null || (u3Var = ((x3) o1Var).f15068a.f346b0) == null || u3Var.f15027b == null) {
            return false;
        }
        u3 u3Var2 = ((x3) o1Var).f15068a.f346b0;
        k.r rVar = u3Var2 == null ? null : u3Var2.f15027b;
        if (rVar == null) {
            return true;
        }
        rVar.collapseActionView();
        return true;
    }

    @Override // b4.f
    public final void j(boolean z9) {
        if (z9 == this.f12812n) {
            return;
        }
        this.f12812n = z9;
        ArrayList arrayList = this.f12813o;
        if (arrayList.size() <= 0) {
            return;
        }
        fb1.t(arrayList.get(0));
        throw null;
    }

    @Override // b4.f
    public final int o() {
        return ((x3) this.f12805g).f15069b;
    }

    public final void q0(boolean z9) {
        o0.d1 d1VarL;
        o0.d1 d1VarL2;
        if (z9) {
            if (!this.f12817s) {
                this.f12817s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f12803e;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                t0(false);
            }
        } else if (this.f12817s) {
            this.f12817s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12803e;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            t0(false);
        }
        ActionBarContainer actionBarContainer = this.f12804f;
        WeakHashMap weakHashMap = o0.v0.f16075a;
        if (!o0.g0.c(actionBarContainer)) {
            if (z9) {
                ((x3) this.f12805g).f15068a.setVisibility(4);
                this.f12806h.setVisibility(0);
                return;
            } else {
                ((x3) this.f12805g).f15068a.setVisibility(0);
                this.f12806h.setVisibility(8);
                return;
            }
        }
        if (z9) {
            x3 x3Var = (x3) this.f12805g;
            d1VarL = o0.v0.a(x3Var.f15068a);
            d1VarL.a(0.0f);
            d1VarL.c(100L);
            d1VarL.d(new j.k(x3Var, 4));
            d1VarL2 = this.f12806h.l(0, 200L);
        } else {
            x3 x3Var2 = (x3) this.f12805g;
            o0.d1 d1VarA = o0.v0.a(x3Var2.f15068a);
            d1VarA.a(1.0f);
            d1VarA.c(200L);
            d1VarA.d(new j.k(x3Var2, 0));
            d1VarL = this.f12806h.l(8, 100L);
            d1VarL2 = d1VarA;
        }
        j.l lVar = new j.l();
        ArrayList arrayList = lVar.f14274a;
        arrayList.add(d1VarL);
        View view = (View) d1VarL.f16019a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) d1VarL2.f16019a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(d1VarL2);
        lVar.b();
    }

    @Override // b4.f
    public final Context r() {
        if (this.f12802d == null) {
            TypedValue typedValue = new TypedValue();
            this.f12801c.getTheme().resolveAttribute(xyz.easypro.httpcustom.R.attr.m, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f12802d = new ContextThemeWrapper(this.f12801c, i10);
            } else {
                this.f12802d = this.f12801c;
            }
        }
        return this.f12802d;
    }

    public final void r0(View view) {
        o1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(xyz.easypro.httpcustom.R.id.gx);
        this.f12803e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(xyz.easypro.httpcustom.R.id.au);
        if (callbackFindViewById instanceof o1) {
            wrapper = (o1) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f12805g = wrapper;
        this.f12806h = (ActionBarContextView) view.findViewById(xyz.easypro.httpcustom.R.id.b4);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(xyz.easypro.httpcustom.R.id.aw);
        this.f12804f = actionBarContainer;
        o1 o1Var = this.f12805g;
        if (o1Var == null || this.f12806h == null || actionBarContainer == null) {
            throw new IllegalStateException(d1.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((x3) o1Var).f15068a.getContext();
        this.f12801c = context;
        if ((((x3) this.f12805g).f15069b & 4) != 0) {
            this.f12808j = true;
        }
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.f12805g.getClass();
        s0(context.getResources().getBoolean(xyz.easypro.httpcustom.R.bool.a));
        TypedArray typedArrayObtainStyledAttributes = this.f12801c.obtainStyledAttributes(null, e.a.f12594a, xyz.easypro.httpcustom.R.attr.h, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f12803e;
            if (!actionBarOverlayLayout2.f257t) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f12821w = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f12804f;
            WeakHashMap weakHashMap = o0.v0.f16075a;
            o0.j0.s(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void s0(boolean z9) {
        if (z9) {
            this.f12804f.setTabContainer(null);
            ((x3) this.f12805g).getClass();
        } else {
            ((x3) this.f12805g).getClass();
            this.f12804f.setTabContainer(null);
        }
        this.f12805g.getClass();
        ((x3) this.f12805g).f15068a.setCollapsible(false);
        this.f12803e.setHasNonEmbeddedTabs(false);
    }

    public final void t0(boolean z9) {
        boolean z10 = this.f12817s || !this.f12816r;
        m2.f fVar = this.f12824z;
        View view = this.f12807i;
        int i10 = 2;
        if (!z10) {
            if (this.f12818t) {
                this.f12818t = false;
                j.l lVar = this.f12819u;
                if (lVar != null) {
                    lVar.a();
                }
                int i11 = this.f12814p;
                b1 b1Var = this.f12822x;
                if (i11 != 0 || (!this.f12820v && !z9)) {
                    b1Var.a();
                    return;
                }
                this.f12804f.setAlpha(1.0f);
                this.f12804f.setTransitioning(true);
                j.l lVar2 = new j.l();
                float f10 = -this.f12804f.getHeight();
                if (z9) {
                    this.f12804f.getLocationInWindow(new int[]{0, 0});
                    f10 -= r13[1];
                }
                o0.d1 d1VarA = o0.v0.a(this.f12804f);
                d1VarA.e(f10);
                View view2 = (View) d1VarA.f16019a.get();
                if (view2 != null) {
                    o0.c1.a(view2.animate(), fVar != null ? new n4.a(fVar, i10, view2) : null);
                }
                boolean z11 = lVar2.f14278e;
                ArrayList arrayList = lVar2.f14274a;
                if (!z11) {
                    arrayList.add(d1VarA);
                }
                if (this.f12815q && view != null) {
                    o0.d1 d1VarA2 = o0.v0.a(view);
                    d1VarA2.e(f10);
                    if (!lVar2.f14278e) {
                        arrayList.add(d1VarA2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = A;
                boolean z12 = lVar2.f14278e;
                if (!z12) {
                    lVar2.f14276c = accelerateInterpolator;
                }
                if (!z12) {
                    lVar2.f14275b = 250L;
                }
                if (!z12) {
                    lVar2.f14277d = b1Var;
                }
                this.f12819u = lVar2;
                lVar2.b();
                return;
            }
            return;
        }
        if (this.f12818t) {
            return;
        }
        this.f12818t = true;
        j.l lVar3 = this.f12819u;
        if (lVar3 != null) {
            lVar3.a();
        }
        this.f12804f.setVisibility(0);
        int i12 = this.f12814p;
        b1 b1Var2 = this.f12823y;
        if (i12 == 0 && (this.f12820v || z9)) {
            this.f12804f.setTranslationY(0.0f);
            float f11 = -this.f12804f.getHeight();
            if (z9) {
                this.f12804f.getLocationInWindow(new int[]{0, 0});
                f11 -= r13[1];
            }
            this.f12804f.setTranslationY(f11);
            j.l lVar4 = new j.l();
            o0.d1 d1VarA3 = o0.v0.a(this.f12804f);
            d1VarA3.e(0.0f);
            View view3 = (View) d1VarA3.f16019a.get();
            if (view3 != null) {
                o0.c1.a(view3.animate(), fVar != null ? new n4.a(fVar, i10, view3) : null);
            }
            boolean z13 = lVar4.f14278e;
            ArrayList arrayList2 = lVar4.f14274a;
            if (!z13) {
                arrayList2.add(d1VarA3);
            }
            if (this.f12815q && view != null) {
                view.setTranslationY(f11);
                o0.d1 d1VarA4 = o0.v0.a(view);
                d1VarA4.e(0.0f);
                if (!lVar4.f14278e) {
                    arrayList2.add(d1VarA4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = B;
            boolean z14 = lVar4.f14278e;
            if (!z14) {
                lVar4.f14276c = decelerateInterpolator;
            }
            if (!z14) {
                lVar4.f14275b = 250L;
            }
            if (!z14) {
                lVar4.f14277d = b1Var2;
            }
            this.f12819u = lVar4;
            lVar4.b();
        } else {
            this.f12804f.setAlpha(1.0f);
            this.f12804f.setTranslationY(0.0f);
            if (this.f12815q && view != null) {
                view.setTranslationY(0.0f);
            }
            b1Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f12803e;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = o0.v0.f16075a;
            o0.h0.c(actionBarOverlayLayout);
        }
    }

    @Override // b4.f
    public final void z() {
        s0(this.f12801c.getResources().getBoolean(xyz.easypro.httpcustom.R.bool.a));
    }

    public d1(Dialog dialog) {
        new ArrayList();
        this.f12813o = new ArrayList();
        this.f12814p = 0;
        this.f12815q = true;
        this.f12818t = true;
        this.f12822x = new b1(this, 0);
        this.f12823y = new b1(this, 1);
        this.f12824z = new m2.f(3, this);
        r0(dialog.getWindow().getDecorView());
    }
}
