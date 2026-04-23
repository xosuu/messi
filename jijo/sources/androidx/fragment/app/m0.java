package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.f f834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f837d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f838e = -1;

    public m0(f.f fVar, n0 n0Var, s sVar) {
        this.f834a = fVar;
        this.f835b = n0Var;
        this.f836c = sVar;
    }

    public final void a() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        s sVar = this.f836c;
        if (zIsLoggable) {
            Objects.toString(sVar);
        }
        Bundle bundle = sVar.f883b;
        sVar.G.L();
        sVar.f881a = 3;
        sVar.Q = true;
        if (Log.isLoggable("FragmentManager", 3)) {
            sVar.toString();
        }
        View view = sVar.S;
        if (view != null) {
            Bundle bundle2 = sVar.f883b;
            SparseArray<Parcelable> sparseArray = sVar.f886d;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                sVar.f886d = null;
            }
            if (sVar.S != null) {
                y0 y0Var = sVar.f884b0;
                y0Var.f930d.b(sVar.f889f);
                sVar.f889f = null;
            }
            sVar.Q = false;
            sVar.N(bundle2);
            if (!sVar.Q) {
                throw new d1(g1.a.p("Fragment ", sVar, " did not call through to super.onViewStateRestored()"));
            }
            if (sVar.S != null) {
                sVar.f884b0.b(androidx.lifecycle.k.ON_CREATE);
            }
        }
        sVar.f883b = null;
        j0 j0Var = sVar.G;
        j0Var.A = false;
        j0Var.B = false;
        j0Var.H.f815h = false;
        j0Var.s(4);
        this.f834a.j(false);
    }

    public final void b() {
        View view;
        View view2;
        n0 n0Var = this.f835b;
        n0Var.getClass();
        s sVar = this.f836c;
        ViewGroup viewGroup = sVar.R;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = n0Var.f840a;
            int iIndexOf = arrayList.indexOf(sVar);
            int i10 = iIndexOf - 1;
            while (true) {
                if (i10 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        s sVar2 = (s) arrayList.get(iIndexOf);
                        if (sVar2.R == viewGroup && (view = sVar2.S) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    s sVar3 = (s) arrayList.get(i10);
                    if (sVar3.R == viewGroup && (view2 = sVar3.S) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i10--;
                }
            }
        }
        sVar.R.addView(sVar.S, iIndexOfChild);
    }

    public final void c() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        s sVar = this.f836c;
        if (zIsLoggable) {
            Objects.toString(sVar);
        }
        s sVar2 = sVar.f894t;
        m0 m0Var = null;
        n0 n0Var = this.f835b;
        if (sVar2 != null) {
            m0 m0Var2 = (m0) n0Var.f841b.get(sVar2.f892q);
            if (m0Var2 == null) {
                throw new IllegalStateException("Fragment " + sVar + " declared target fragment " + sVar.f894t + " that does not belong to this FragmentManager!");
            }
            sVar.f895u = sVar.f894t.f892q;
            sVar.f894t = null;
            m0Var = m0Var2;
        } else {
            String str = sVar.f895u;
            if (str != null && (m0Var = (m0) n0Var.f841b.get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(sVar);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(g1.a.r(sb, sVar.f895u, " that does not belong to this FragmentManager!"));
            }
        }
        if (m0Var != null) {
            m0Var.k();
        }
        j0 j0Var = sVar.E;
        sVar.F = j0Var.f797p;
        sVar.H = j0Var.f799r;
        f.f fVar = this.f834a;
        fVar.s(false);
        ArrayList arrayList = sVar.f890f0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).a();
        }
        arrayList.clear();
        sVar.G.b(sVar.F, sVar.e(), sVar);
        sVar.f881a = 0;
        sVar.Q = false;
        sVar.z(sVar.F.f914y);
        if (!sVar.Q) {
            throw new d1(g1.a.p("Fragment ", sVar, " did not call through to super.onAttach()"));
        }
        Iterator it2 = sVar.E.f795n.iterator();
        while (it2.hasNext()) {
            ((l0) it2.next()).b();
        }
        j0 j0Var2 = sVar.G;
        j0Var2.A = false;
        j0Var2.B = false;
        j0Var2.H.f815h = false;
        j0Var2.s(0);
        fVar.m(false);
    }

    public final int d() {
        b1 b1Var;
        s sVar = this.f836c;
        if (sVar.E == null) {
            return sVar.f881a;
        }
        int iMin = this.f838e;
        int iOrdinal = sVar.Z.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (sVar.f900z) {
            if (sVar.A) {
                iMin = Math.max(this.f838e, 2);
                View view = sVar.S;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f838e < 4 ? Math.min(iMin, sVar.f881a) : Math.min(iMin, 1);
            }
        }
        if (!sVar.f898x) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = sVar.R;
        if (viewGroup != null) {
            c1 c1VarF = c1.f(viewGroup, sVar.p().D());
            c1VarF.getClass();
            b1 b1VarD = c1VarF.d(sVar);
            i = b1VarD != null ? b1VarD.f733b : 0;
            Iterator it = c1VarF.f748c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    b1Var = null;
                    break;
                }
                b1Var = (b1) it.next();
                if (b1Var.f734c.equals(sVar) && !b1Var.f737f) {
                    break;
                }
            }
            if (b1Var != null && (i == 0 || i == 1)) {
                i = b1Var.f733b;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (sVar.f899y) {
            iMin = sVar.D > 0 ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (sVar.T && sVar.f881a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(sVar);
        }
        return iMin;
    }

    public final void e() {
        Parcelable parcelable;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        final s sVar = this.f836c;
        if (zIsLoggable) {
            Objects.toString(sVar);
        }
        if (sVar.Y) {
            Bundle bundle = sVar.f883b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                sVar.G.Q(parcelable);
                j0 j0Var = sVar.G;
                j0Var.A = false;
                j0Var.B = false;
                j0Var.H.f815h = false;
                j0Var.s(1);
            }
            sVar.f881a = 1;
            return;
        }
        f.f fVar = this.f834a;
        fVar.t(false);
        Bundle bundle2 = sVar.f883b;
        sVar.G.L();
        sVar.f881a = 1;
        sVar.Q = false;
        sVar.f882a0.a(new androidx.lifecycle.o() { // from class: androidx.fragment.app.Fragment$5
            @Override // androidx.lifecycle.o
            public final void a(androidx.lifecycle.q qVar, androidx.lifecycle.k kVar) {
                View view;
                if (kVar != androidx.lifecycle.k.ON_STOP || (view = sVar.S) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        sVar.f887d0.b(bundle2);
        sVar.A(bundle2);
        sVar.Y = true;
        if (!sVar.Q) {
            throw new d1(g1.a.p("Fragment ", sVar, " did not call through to super.onCreate()"));
        }
        sVar.f882a0.e(androidx.lifecycle.k.ON_CREATE);
        fVar.n(false);
    }

    public final void f() {
        String resourceName;
        s sVar = this.f836c;
        if (sVar.f900z) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(sVar);
        }
        LayoutInflater layoutInflaterG = sVar.G(sVar.f883b);
        ViewGroup viewGroup = sVar.R;
        if (viewGroup == null) {
            int i10 = sVar.J;
            if (i10 == 0) {
                viewGroup = null;
            } else {
                if (i10 == -1) {
                    throw new IllegalArgumentException(g1.a.p("Cannot create fragment ", sVar, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) sVar.E.f798q.S(i10);
                if (viewGroup == null && !sVar.B) {
                    try {
                        resourceName = sVar.r().getResourceName(sVar.J);
                    } catch (Resources.NotFoundException unused) {
                        resourceName = "unknown";
                    }
                    throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(sVar.J) + " (" + resourceName + ") for fragment " + sVar);
                }
            }
        }
        sVar.R = viewGroup;
        sVar.O(layoutInflaterG, viewGroup, sVar.f883b);
        View view = sVar.S;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            sVar.S.setTag(R.id.jl, sVar);
            if (viewGroup != null) {
                b();
            }
            if (sVar.L) {
                sVar.S.setVisibility(8);
            }
            View view2 = sVar.S;
            WeakHashMap weakHashMap = o0.v0.f16075a;
            if (o0.g0.b(view2)) {
                o0.h0.c(sVar.S);
            } else {
                View view3 = sVar.S;
                view3.addOnAttachStateChangeListener(new b0(this, view3));
            }
            sVar.G.s(2);
            this.f834a.z(false);
            int visibility = sVar.S.getVisibility();
            sVar.i().f874n = sVar.S.getAlpha();
            if (sVar.R != null && visibility == 0) {
                View viewFindFocus = sVar.S.findFocus();
                if (viewFindFocus != null) {
                    sVar.i().f875o = viewFindFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        viewFindFocus.toString();
                        Objects.toString(sVar);
                    }
                }
                sVar.S.setAlpha(0.0f);
            }
        }
        sVar.f881a = 2;
    }

    public final void g() {
        s sVarB;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        s sVar = this.f836c;
        if (zIsLoggable) {
            Objects.toString(sVar);
        }
        boolean zIsChangingConfigurations = true;
        boolean z9 = sVar.f899y && sVar.D <= 0;
        n0 n0Var = this.f835b;
        if (!z9) {
            k0 k0Var = n0Var.f842c;
            if (k0Var.f810c.containsKey(sVar.f892q) && k0Var.f813f && !k0Var.f814g) {
                String str = sVar.f895u;
                if (str != null && (sVarB = n0Var.b(str)) != null && sVarB.N) {
                    sVar.f894t = sVarB;
                }
                sVar.f881a = 0;
                return;
            }
        }
        v vVar = sVar.F;
        if (vVar instanceof androidx.lifecycle.o0) {
            zIsChangingConfigurations = n0Var.f842c.f814g;
        } else {
            Context context = vVar.f914y;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z9 || zIsChangingConfigurations) {
            k0 k0Var2 = n0Var.f842c;
            if (Log.isLoggable("FragmentManager", 3)) {
                k0Var2.getClass();
                Objects.toString(sVar);
            }
            HashMap map = k0Var2.f811d;
            k0 k0Var3 = (k0) map.get(sVar.f892q);
            if (k0Var3 != null) {
                k0Var3.a();
                map.remove(sVar.f892q);
            }
            HashMap map2 = k0Var2.f812e;
            androidx.lifecycle.n0 n0Var2 = (androidx.lifecycle.n0) map2.get(sVar.f892q);
            if (n0Var2 != null) {
                n0Var2.a();
                map2.remove(sVar.f892q);
            }
        }
        sVar.G.k();
        sVar.f882a0.e(androidx.lifecycle.k.ON_DESTROY);
        sVar.f881a = 0;
        sVar.Q = false;
        sVar.Y = false;
        sVar.D();
        if (!sVar.Q) {
            throw new d1(g1.a.p("Fragment ", sVar, " did not call through to super.onDestroy()"));
        }
        this.f834a.p(false);
        for (m0 m0Var : n0Var.d()) {
            if (m0Var != null) {
                String str2 = sVar.f892q;
                s sVar2 = m0Var.f836c;
                if (str2.equals(sVar2.f895u)) {
                    sVar2.f894t = sVar;
                    sVar2.f895u = null;
                }
            }
        }
        String str3 = sVar.f895u;
        if (str3 != null) {
            sVar.f894t = n0Var.b(str3);
        }
        n0Var.h(this);
    }

    public final void h() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        s sVar = this.f836c;
        if (zIsLoggable) {
            Objects.toString(sVar);
        }
        ViewGroup viewGroup = sVar.R;
        if (viewGroup != null && (view = sVar.S) != null) {
            viewGroup.removeView(view);
        }
        sVar.P();
        this.f834a.A(false);
        sVar.R = null;
        sVar.S = null;
        sVar.f884b0 = null;
        sVar.f885c0.e(null);
        sVar.A = false;
    }

    public final void i() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        s sVar = this.f836c;
        if (zIsLoggable) {
            Objects.toString(sVar);
        }
        sVar.f881a = -1;
        sVar.Q = false;
        sVar.F();
        if (!sVar.Q) {
            throw new d1(g1.a.p("Fragment ", sVar, " did not call through to super.onDetach()"));
        }
        j0 j0Var = sVar.G;
        if (!j0Var.C) {
            j0Var.k();
            sVar.G = new j0();
        }
        this.f834a.q(false);
        sVar.f881a = -1;
        sVar.F = null;
        sVar.H = null;
        sVar.E = null;
        if (!sVar.f899y || sVar.D > 0) {
            k0 k0Var = this.f835b.f842c;
            if (k0Var.f810c.containsKey(sVar.f892q) && k0Var.f813f && !k0Var.f814g) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(sVar);
        }
        sVar.f882a0 = new androidx.lifecycle.s(sVar);
        sVar.f887d0 = new q1.e(sVar);
        sVar.f892q = UUID.randomUUID().toString();
        sVar.f898x = false;
        sVar.f899y = false;
        sVar.f900z = false;
        sVar.A = false;
        sVar.B = false;
        sVar.D = 0;
        sVar.E = null;
        sVar.G = new j0();
        sVar.F = null;
        sVar.I = 0;
        sVar.J = 0;
        sVar.K = null;
        sVar.L = false;
        sVar.M = false;
    }

    public final void j() {
        s sVar = this.f836c;
        if (sVar.f900z && sVar.A && !sVar.C) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(sVar);
            }
            sVar.O(sVar.G(sVar.f883b), null, sVar.f883b);
            View view = sVar.S;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                sVar.S.setTag(R.id.jl, sVar);
                if (sVar.L) {
                    sVar.S.setVisibility(8);
                }
                sVar.G.s(2);
                this.f834a.z(false);
                sVar.f881a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z9 = this.f837d;
        s sVar = this.f836c;
        if (z9) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(sVar);
                return;
            }
            return;
        }
        try {
            this.f837d = true;
            while (true) {
                int iD = d();
                int i10 = sVar.f881a;
                if (iD == i10) {
                    if (sVar.W) {
                        if (sVar.S != null && (viewGroup = sVar.R) != null) {
                            c1 c1VarF = c1.f(viewGroup, sVar.p().D());
                            if (sVar.L) {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    c1VarF.getClass();
                                    Objects.toString(sVar);
                                }
                                c1VarF.a(3, 1, this);
                            } else {
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    c1VarF.getClass();
                                    Objects.toString(sVar);
                                }
                                c1VarF.a(2, 1, this);
                            }
                        }
                        j0 j0Var = sVar.E;
                        if (j0Var != null && sVar.f898x && j0.F(sVar)) {
                            j0Var.f807z = true;
                        }
                        sVar.W = false;
                    }
                    this.f837d = false;
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            sVar.f881a = 1;
                            break;
                        case 2:
                            sVar.A = false;
                            sVar.f881a = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(sVar);
                            }
                            if (sVar.S != null && sVar.f886d == null) {
                                p();
                            }
                            if (sVar.S != null && (viewGroup3 = sVar.R) != null) {
                                c1 c1VarF2 = c1.f(viewGroup3, sVar.p().D());
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    c1VarF2.getClass();
                                    Objects.toString(sVar);
                                }
                                c1VarF2.a(1, 3, this);
                            }
                            sVar.f881a = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            sVar.f881a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (sVar.S != null && (viewGroup2 = sVar.R) != null) {
                                c1 c1VarF3 = c1.f(viewGroup2, sVar.p().D());
                                int iB = g1.a.b(sVar.S.getVisibility());
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    c1VarF3.getClass();
                                    Objects.toString(sVar);
                                }
                                c1VarF3.a(iB, 2, this);
                            }
                            sVar.f881a = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            sVar.f881a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f837d = false;
            throw th;
        }
    }

    public final void l() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        s sVar = this.f836c;
        if (zIsLoggable) {
            Objects.toString(sVar);
        }
        sVar.G.s(5);
        if (sVar.S != null) {
            sVar.f884b0.b(androidx.lifecycle.k.ON_PAUSE);
        }
        sVar.f882a0.e(androidx.lifecycle.k.ON_PAUSE);
        sVar.f881a = 6;
        sVar.Q = false;
        sVar.I();
        if (!sVar.Q) {
            throw new d1(g1.a.p("Fragment ", sVar, " did not call through to super.onPause()"));
        }
        this.f834a.r(false);
    }

    public final void m(ClassLoader classLoader) {
        s sVar = this.f836c;
        Bundle bundle = sVar.f883b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        sVar.f886d = sVar.f883b.getSparseParcelableArray("android:view_state");
        sVar.f889f = sVar.f883b.getBundle("android:view_registry_state");
        sVar.f895u = sVar.f883b.getString("android:target_state");
        if (sVar.f895u != null) {
            sVar.f896v = sVar.f883b.getInt("android:target_req_state", 0);
        }
        Boolean bool = sVar.f891h;
        if (bool != null) {
            sVar.U = bool.booleanValue();
            sVar.f891h = null;
        } else {
            sVar.U = sVar.f883b.getBoolean("android:user_visible_hint", true);
        }
        if (sVar.U) {
            return;
        }
        sVar.T = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            r6 = this;
            r0 = 3
            java.lang.String r1 = "FragmentManager"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            androidx.fragment.app.s r2 = r6.f836c
            if (r0 == 0) goto Le
            java.util.Objects.toString(r2)
        Le:
            androidx.fragment.app.q r0 = r2.V
            r3 = 0
            if (r0 != 0) goto L15
            r0 = r3
            goto L17
        L15:
            android.view.View r0 = r0.f875o
        L17:
            if (r0 == 0) goto L47
            android.view.View r4 = r2.S
            if (r0 != r4) goto L1e
            goto L28
        L1e:
            android.view.ViewParent r4 = r0.getParent()
        L22:
            if (r4 == 0) goto L47
            android.view.View r5 = r2.S
            if (r4 != r5) goto L42
        L28:
            r0.requestFocus()
            r4 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r4)
            if (r1 == 0) goto L47
            r0.toString()
            java.util.Objects.toString(r2)
            android.view.View r0 = r2.S
            android.view.View r0 = r0.findFocus()
            java.util.Objects.toString(r0)
            goto L47
        L42:
            android.view.ViewParent r4 = r4.getParent()
            goto L22
        L47:
            androidx.fragment.app.q r0 = r2.i()
            r0.f875o = r3
            androidx.fragment.app.j0 r0 = r2.G
            r0.L()
            androidx.fragment.app.j0 r0 = r2.G
            r1 = 1
            r0.x(r1)
            r0 = 7
            r2.f881a = r0
            r1 = 0
            r2.Q = r1
            r2.J()
            boolean r4 = r2.Q
            if (r4 == 0) goto L8e
            androidx.lifecycle.s r4 = r2.f882a0
            androidx.lifecycle.k r5 = androidx.lifecycle.k.ON_RESUME
            r4.e(r5)
            android.view.View r4 = r2.S
            if (r4 == 0) goto L75
            androidx.fragment.app.y0 r4 = r2.f884b0
            r4.b(r5)
        L75:
            androidx.fragment.app.j0 r4 = r2.G
            r4.A = r1
            r4.B = r1
            androidx.fragment.app.k0 r5 = r4.H
            r5.f815h = r1
            r4.s(r0)
            f.f r0 = r6.f834a
            r0.v(r1)
            r2.f883b = r3
            r2.f886d = r3
            r2.f889f = r3
            return
        L8e:
            androidx.fragment.app.d1 r0 = new androidx.fragment.app.d1
            java.lang.String r1 = "Fragment "
            java.lang.String r3 = " did not call through to super.onResume()"
            java.lang.String r1 = g1.a.p(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.m0.n():void");
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        s sVar = this.f836c;
        sVar.K(bundle);
        sVar.f887d0.c(bundle);
        Parcelable parcelableR = sVar.G.R();
        if (parcelableR != null) {
            bundle.putParcelable("android:support:fragments", parcelableR);
        }
        this.f834a.w(false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (sVar.S != null) {
            p();
        }
        if (sVar.f886d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", sVar.f886d);
        }
        if (sVar.f889f != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", sVar.f889f);
        }
        if (!sVar.U) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", sVar.U);
        }
        return bundle;
    }

    public final void p() {
        s sVar = this.f836c;
        if (sVar.S == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        sVar.S.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            sVar.f886d = sparseArray;
        }
        Bundle bundle = new Bundle();
        sVar.f884b0.f930d.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        sVar.f889f = bundle;
    }

    public final void q() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        s sVar = this.f836c;
        if (zIsLoggable) {
            Objects.toString(sVar);
        }
        sVar.G.L();
        sVar.G.x(true);
        sVar.f881a = 5;
        sVar.Q = false;
        sVar.L();
        if (!sVar.Q) {
            throw new d1(g1.a.p("Fragment ", sVar, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.s sVar2 = sVar.f882a0;
        androidx.lifecycle.k kVar = androidx.lifecycle.k.ON_START;
        sVar2.e(kVar);
        if (sVar.S != null) {
            sVar.f884b0.b(kVar);
        }
        j0 j0Var = sVar.G;
        j0Var.A = false;
        j0Var.B = false;
        j0Var.H.f815h = false;
        j0Var.s(5);
        this.f834a.x(false);
    }

    public final void r() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        s sVar = this.f836c;
        if (zIsLoggable) {
            Objects.toString(sVar);
        }
        j0 j0Var = sVar.G;
        j0Var.B = true;
        j0Var.H.f815h = true;
        j0Var.s(4);
        if (sVar.S != null) {
            sVar.f884b0.b(androidx.lifecycle.k.ON_STOP);
        }
        sVar.f882a0.e(androidx.lifecycle.k.ON_STOP);
        sVar.f881a = 4;
        sVar.Q = false;
        sVar.M();
        if (!sVar.Q) {
            throw new d1(g1.a.p("Fragment ", sVar, " did not call through to super.onStop()"));
        }
        this.f834a.y(false);
    }

    public m0(f.f fVar, n0 n0Var, ClassLoader classLoader, f0 f0Var, FragmentState fragmentState) {
        this.f834a = fVar;
        this.f835b = n0Var;
        s sVarA = f0Var.a(fragmentState.f689a);
        this.f836c = sVarA;
        Bundle bundle = fragmentState.f698v;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        sVarA.W(bundle);
        sVarA.f892q = fragmentState.f690b;
        sVarA.f900z = fragmentState.f691d;
        sVarA.B = true;
        sVarA.I = fragmentState.f692f;
        sVarA.J = fragmentState.f693h;
        sVarA.K = fragmentState.f694q;
        sVarA.N = fragmentState.f695s;
        sVarA.f899y = fragmentState.f696t;
        sVarA.M = fragmentState.f697u;
        sVarA.L = fragmentState.f699w;
        sVarA.Z = androidx.lifecycle.l.values()[fragmentState.f700x];
        Bundle bundle2 = fragmentState.f701y;
        if (bundle2 != null) {
            sVarA.f883b = bundle2;
        } else {
            sVarA.f883b = new Bundle();
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(sVarA);
        }
    }

    public m0(f.f fVar, n0 n0Var, s sVar, FragmentState fragmentState) {
        this.f834a = fVar;
        this.f835b = n0Var;
        this.f836c = sVar;
        sVar.f886d = null;
        sVar.f889f = null;
        sVar.D = 0;
        sVar.A = false;
        sVar.f898x = false;
        s sVar2 = sVar.f894t;
        sVar.f895u = sVar2 != null ? sVar2.f892q : null;
        sVar.f894t = null;
        Bundle bundle = fragmentState.f701y;
        if (bundle != null) {
            sVar.f883b = bundle;
        } else {
            sVar.f883b = new Bundle();
        }
    }
}
