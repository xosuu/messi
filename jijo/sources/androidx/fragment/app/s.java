package androidx.fragment.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.ur0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class s implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.q, androidx.lifecycle.o0, androidx.lifecycle.h, q1.f {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final Object f880g0 = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public j0 E;
    public v F;
    public s H;
    public int I;
    public int J;
    public String K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean Q;
    public ViewGroup R;
    public View S;
    public boolean T;
    public q V;
    public boolean W;
    public float X;
    public boolean Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bundle f883b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public y0 f884b0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SparseArray f886d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f889f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f891h;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f893s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public s f894t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f896v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f898x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f899y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f900z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f881a = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f892q = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f895u = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Boolean f897w = null;
    public j0 G = new j0();
    public boolean P = true;
    public boolean U = true;
    public androidx.lifecycle.l Z = androidx.lifecycle.l.f984h;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final androidx.lifecycle.x f885c0 = new androidx.lifecycle.x();

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final AtomicInteger f888e0 = new AtomicInteger();

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final ArrayList f890f0 = new ArrayList();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public androidx.lifecycle.s f882a0 = new androidx.lifecycle.s(this);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public q1.e f887d0 = new q1.e(this);

    public void A(Bundle bundle) {
        Parcelable parcelable;
        this.Q = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.G.Q(parcelable);
            j0 j0Var = this.G;
            j0Var.A = false;
            j0Var.B = false;
            j0Var.H.f815h = false;
            j0Var.s(1);
        }
        j0 j0Var2 = this.G;
        if (j0Var2.f796o >= 1) {
            return;
        }
        j0Var2.A = false;
        j0Var2.B = false;
        j0Var2.H.f815h = false;
        j0Var2.s(1);
    }

    public void B(Menu menu, MenuInflater menuInflater) {
    }

    public View C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void D() {
        this.Q = true;
    }

    public void E() {
        this.Q = true;
    }

    public void F() {
        this.Q = true;
    }

    public LayoutInflater G(Bundle bundle) {
        v vVar = this.F;
        if (vVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        w wVar = vVar.B;
        LayoutInflater layoutInflaterCloneInContext = wVar.getLayoutInflater().cloneInContext(wVar);
        layoutInflaterCloneInContext.setFactory2(this.G.f787f);
        return layoutInflaterCloneInContext;
    }

    public boolean H(MenuItem menuItem) {
        return false;
    }

    public void I() {
        this.Q = true;
    }

    public void J() {
        this.Q = true;
    }

    public void K(Bundle bundle) {
    }

    public void L() {
        this.Q = true;
    }

    public void M() {
        this.Q = true;
    }

    public void N(Bundle bundle) {
        this.Q = true;
    }

    public void O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.G.L();
        this.C = true;
        this.f884b0 = new y0(f());
        View viewC = C(layoutInflater, viewGroup, bundle);
        this.S = viewC;
        if (viewC == null) {
            if (this.f884b0.f929b != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f884b0 = null;
            return;
        }
        this.f884b0.c();
        this.S.setTag(R.id.yc, this.f884b0);
        this.S.setTag(R.id.yf, this.f884b0);
        View view = this.S;
        y0 y0Var = this.f884b0;
        g4.a0.f(view, "<this>");
        view.setTag(R.id.ye, y0Var);
        this.f885c0.e(this.f884b0);
    }

    public final void P() {
        this.G.s(1);
        if (this.S != null) {
            y0 y0Var = this.f884b0;
            y0Var.c();
            if (y0Var.f929b.f993e.a(androidx.lifecycle.l.f982d)) {
                this.f884b0.b(androidx.lifecycle.k.ON_DESTROY);
            }
        }
        this.f881a = 1;
        this.Q = false;
        E();
        if (!this.Q) {
            throw new d1(g1.a.p("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        ur0 ur0Var = new ur0(f(), d1.b.f12295d);
        String canonicalName = d1.b.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        s.l lVar = ((d1.b) ur0Var.t(d1.b.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).f12296c;
        if (lVar.f16630d <= 0) {
            this.C = false;
        } else {
            fb1.t(lVar.f16629b[0]);
            throw null;
        }
    }

    public final androidx.activity.result.c Q(androidx.activity.result.a aVar, t3.i iVar) {
        o oVar = new o(this);
        if (this.f881a > 1) {
            throw new IllegalStateException(g1.a.p("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        p pVar = new p(this, oVar, atomicReference, (d.b) iVar, aVar);
        if (this.f881a >= 0) {
            pVar.a();
        } else {
            this.f890f0.add(pVar);
        }
        return new androidx.activity.result.c(this, atomicReference, iVar, 2);
    }

    public final void R(int i10, String[] strArr) throws Exception {
        if (this.F == null) {
            throw new IllegalStateException(g1.a.p("Fragment ", this, " not attached to Activity"));
        }
        j0 j0VarP = p();
        if (j0VarP.f805x == null) {
            j0VarP.f797p.getClass();
            return;
        }
        j0VarP.f806y.addLast(new FragmentManager$LaunchedFragmentInfo(this.f892q, i10));
        j0VarP.f805x.a(strArr);
    }

    public final w S() {
        w wVarC = c();
        if (wVarC != null) {
            return wVarC;
        }
        throw new IllegalStateException(g1.a.p("Fragment ", this, " not attached to an activity."));
    }

    public final Context T() {
        Context contextL = l();
        if (contextL != null) {
            return contextL;
        }
        throw new IllegalStateException(g1.a.p("Fragment ", this, " not attached to a context."));
    }

    public final View U() {
        View view = this.S;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(g1.a.p("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void V(int i10, int i11, int i12, int i13) {
        if (this.V == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        i().f864d = i10;
        i().f865e = i11;
        i().f866f = i12;
        i().f867g = i13;
    }

    public final void W(Bundle bundle) {
        j0 j0Var = this.E;
        if (j0Var != null && j0Var != null && j0Var.I()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f893s = bundle;
    }

    public final void X(boolean z9) {
        if (this.P != z9) {
            this.P = z9;
            if (this.O && w() && !this.L) {
                ((f.q) this.F.B).q().c();
            }
        }
    }

    public final void Y(boolean z9) {
        boolean z10 = false;
        if (!this.U && z9 && this.f881a < 5 && this.E != null && w() && this.Y) {
            j0 j0Var = this.E;
            m0 m0VarF = j0Var.f(this);
            s sVar = m0VarF.f836c;
            if (sVar.T) {
                if (j0Var.f783b) {
                    j0Var.D = true;
                } else {
                    sVar.T = false;
                    m0VarF.k();
                }
            }
        }
        this.U = z9;
        if (this.f881a < 5 && !z9) {
            z10 = true;
        }
        this.T = z10;
        if (this.f883b != null) {
            this.f891h = Boolean.valueOf(z9);
        }
    }

    @Override // q1.f
    public final q1.d a() {
        return this.f887d0.f16385b;
    }

    @Override // androidx.lifecycle.h
    public final c1.b d() {
        return c1.a.f1497b;
    }

    public z3.a e() {
        return new n(this);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.lifecycle.o0
    public final androidx.lifecycle.n0 f() {
        if (this.E == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (n() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.E.H.f812e;
        androidx.lifecycle.n0 n0Var = (androidx.lifecycle.n0) map.get(this.f892q);
        if (n0Var != null) {
            return n0Var;
        }
        androidx.lifecycle.n0 n0Var2 = new androidx.lifecycle.n0();
        map.put(this.f892q, n0Var2);
        return n0Var2;
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.I));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.J));
        printWriter.print(" mTag=");
        printWriter.println(this.K);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f881a);
        printWriter.print(" mWho=");
        printWriter.print(this.f892q);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.D);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f898x);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f899y);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f900z);
        printWriter.print(" mInLayout=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.L);
        printWriter.print(" mDetached=");
        printWriter.print(this.M);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.P);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.O);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.N);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.U);
        if (this.E != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.E);
        }
        if (this.F != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.F);
        }
        if (this.H != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.H);
        }
        if (this.f893s != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f893s);
        }
        if (this.f883b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f883b);
        }
        if (this.f886d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f886d);
        }
        if (this.f889f != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f889f);
        }
        s sVarB = this.f894t;
        if (sVarB == null) {
            j0 j0Var = this.E;
            sVarB = (j0Var == null || (str2 = this.f895u) == null) ? null : j0Var.f784c.b(str2);
        }
        if (sVarB != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(sVarB);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f896v);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        q qVar = this.V;
        printWriter.println(qVar == null ? false : qVar.f863c);
        q qVar2 = this.V;
        if (qVar2 != null && qVar2.f864d != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            q qVar3 = this.V;
            printWriter.println(qVar3 == null ? 0 : qVar3.f864d);
        }
        q qVar4 = this.V;
        if (qVar4 != null && qVar4.f865e != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            q qVar5 = this.V;
            printWriter.println(qVar5 == null ? 0 : qVar5.f865e);
        }
        q qVar6 = this.V;
        if (qVar6 != null && qVar6.f866f != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            q qVar7 = this.V;
            printWriter.println(qVar7 == null ? 0 : qVar7.f866f);
        }
        q qVar8 = this.V;
        if (qVar8 != null && qVar8.f867g != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            q qVar9 = this.V;
            printWriter.println(qVar9 == null ? 0 : qVar9.f867g);
        }
        if (this.R != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.R);
        }
        if (this.S != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.S);
        }
        q qVar10 = this.V;
        if ((qVar10 == null ? null : qVar10.f861a) != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            q qVar11 = this.V;
            printWriter.println(qVar11 == null ? null : qVar11.f861a);
        }
        if (l() != null) {
            ur0 ur0Var = new ur0(f(), d1.b.f12295d);
            String canonicalName = d1.b.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            s.l lVar = ((d1.b) ur0Var.t(d1.b.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).f12296c;
            if (lVar.f16630d > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                if (lVar.f16630d > 0) {
                    fb1.t(lVar.f16629b[0]);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(lVar.f16628a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("Child " + this.G + ":");
        this.G.u(g1.a.y(str, "  "), fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.lifecycle.q
    public final androidx.lifecycle.s h() {
        return this.f882a0;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final q i() {
        if (this.V == null) {
            q qVar = new q();
            Object obj = f880g0;
            qVar.f871k = obj;
            qVar.f872l = obj;
            qVar.f873m = obj;
            qVar.f874n = 1.0f;
            qVar.f875o = null;
            this.V = qVar;
        }
        return this.V;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final w c() {
        v vVar = this.F;
        if (vVar == null) {
            return null;
        }
        return (w) vVar.f913x;
    }

    public final j0 k() {
        if (this.F != null) {
            return this.G;
        }
        throw new IllegalStateException(g1.a.p("Fragment ", this, " has not been attached yet."));
    }

    public final Context l() {
        v vVar = this.F;
        if (vVar == null) {
            return null;
        }
        return vVar.f914y;
    }

    public final int n() {
        androidx.lifecycle.l lVar = this.Z;
        return (lVar == androidx.lifecycle.l.f981b || this.H == null) ? lVar.ordinal() : Math.min(lVar.ordinal(), this.H.n());
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.Q = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        S().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.Q = true;
    }

    public final j0 p() {
        j0 j0Var = this.E;
        if (j0Var != null) {
            return j0Var;
        }
        throw new IllegalStateException(g1.a.p("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Object q() {
        Object obj;
        q qVar = this.V;
        if (qVar == null || (obj = qVar.f872l) == f880g0) {
            return null;
        }
        return obj;
    }

    public final Resources r() {
        return T().getResources();
    }

    public final Object s() {
        Object obj;
        q qVar = this.V;
        if (qVar == null || (obj = qVar.f871k) == f880g0) {
            return null;
        }
        return obj;
    }

    public final void startActivityForResult(Intent intent, int i10) throws Exception {
        if (this.F == null) {
            throw new IllegalStateException(g1.a.p("Fragment ", this, " not attached to Activity"));
        }
        j0 j0VarP = p();
        if (j0VarP.f803v != null) {
            j0VarP.f806y.addLast(new FragmentManager$LaunchedFragmentInfo(this.f892q, i10));
            j0VarP.f803v.a(intent);
        } else {
            v vVar = j0VarP.f797p;
            vVar.getClass();
            if (i10 != -1) {
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
            Object obj = d0.f.f12287a;
            d0.a.b(vVar.f914y, intent, null);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f892q);
        if (this.I != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.I));
        }
        if (this.K != null) {
            sb.append(" tag=");
            sb.append(this.K);
        }
        sb.append(")");
        return sb.toString();
    }

    public final Object u() {
        Object obj;
        q qVar = this.V;
        if (qVar == null || (obj = qVar.f873m) == f880g0) {
            return null;
        }
        return obj;
    }

    public final String v(int i10) {
        return r().getString(i10);
    }

    public final boolean w() {
        return this.F != null && this.f898x;
    }

    public final boolean x() {
        s sVar = this.H;
        return sVar != null && (sVar.f899y || sVar.x());
    }

    public void y(int i10, int i11, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void z(Context context) {
        this.Q = true;
        v vVar = this.F;
        if ((vVar == null ? null : vVar.f913x) != null) {
            this.Q = true;
        }
    }
}
