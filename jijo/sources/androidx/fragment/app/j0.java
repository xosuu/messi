package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.g11;
import com.google.android.gms.internal.ads.ur0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public k0 H;
    public final x I;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f783b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f786e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.activity.p f788g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d0 f793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.f f794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f795n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f796o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public v f797p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public z3.a f798q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public s f799r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public s f800s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f0 f801t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final d0 f802u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.activity.result.c f803v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public androidx.activity.result.c f804w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public androidx.activity.result.c f805x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ArrayDeque f806y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f807z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f782a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f784c = new n0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f787f = new c0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f789h = new e0(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f790i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f791j = Collections.synchronizedMap(new HashMap());

    public j0() {
        Collections.synchronizedMap(new HashMap());
        this.f792k = Collections.synchronizedMap(new HashMap());
        int i10 = 3;
        this.f793l = new d0(this, i10);
        this.f794m = new f.f(this);
        this.f795n = new CopyOnWriteArrayList();
        this.f796o = -1;
        this.f801t = new f0(this);
        this.f802u = new d0(this, 4);
        this.f806y = new ArrayDeque();
        this.I = new x(i10, this);
    }

    public static boolean F(s sVar) {
        if (!sVar.O || !sVar.P) {
            boolean zF = false;
            for (s sVar2 : sVar.G.f784c.e()) {
                if (sVar2 != null) {
                    zF = F(sVar2);
                }
                if (zF) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean G(s sVar) {
        if (sVar == null) {
            return true;
        }
        return sVar.P && (sVar.E == null || G(sVar.H));
    }

    public static boolean H(s sVar) {
        if (sVar == null) {
            return true;
        }
        j0 j0Var = sVar.E;
        return sVar.equals(j0Var.f800s) && H(j0Var.f799r);
    }

    public final s A(String str) {
        n0 n0Var = this.f784c;
        if (str != null) {
            ArrayList arrayList = n0Var.f840a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                s sVar = (s) arrayList.get(size);
                if (sVar != null && str.equals(sVar.K)) {
                    return sVar;
                }
            }
        }
        if (str != null) {
            for (m0 m0Var : n0Var.f841b.values()) {
                if (m0Var != null) {
                    s sVar2 = m0Var.f836c;
                    if (str.equals(sVar2.K)) {
                        return sVar2;
                    }
                }
            }
        } else {
            n0Var.getClass();
        }
        return null;
    }

    public final ViewGroup B(s sVar) {
        ViewGroup viewGroup = sVar.R;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (sVar.J > 0 && this.f798q.T()) {
            View viewS = this.f798q.S(sVar.J);
            if (viewS instanceof ViewGroup) {
                return (ViewGroup) viewS;
            }
        }
        return null;
    }

    public final f0 C() {
        s sVar = this.f799r;
        return sVar != null ? sVar.E.C() : this.f801t;
    }

    public final d0 D() {
        s sVar = this.f799r;
        return sVar != null ? sVar.E.D() : this.f802u;
    }

    public final void E(s sVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(sVar);
        }
        if (sVar.L) {
            return;
        }
        sVar.L = true;
        sVar.W = true ^ sVar.W;
        W(sVar);
    }

    public final boolean I() {
        return this.A || this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(int r18, androidx.fragment.app.s r19) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j0.J(int, androidx.fragment.app.s):void");
    }

    public final void K(int i10, boolean z9) {
        HashMap map;
        v vVar;
        if (this.f797p == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z9 || i10 != this.f796o) {
            this.f796o = i10;
            n0 n0Var = this.f784c;
            Iterator it = n0Var.f840a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = n0Var.f841b;
                if (!zHasNext) {
                    break;
                }
                m0 m0Var = (m0) map.get(((s) it.next()).f892q);
                if (m0Var != null) {
                    m0Var.k();
                }
            }
            for (m0 m0Var2 : map.values()) {
                if (m0Var2 != null) {
                    m0Var2.k();
                    s sVar = m0Var2.f836c;
                    if (sVar.f899y && sVar.D <= 0) {
                        n0Var.h(m0Var2);
                    }
                }
            }
            X();
            if (this.f807z && (vVar = this.f797p) != null && this.f796o == 7) {
                ((f.q) vVar.B).q().c();
                this.f807z = false;
            }
        }
    }

    public final void L() {
        if (this.f797p == null) {
            return;
        }
        this.A = false;
        this.B = false;
        this.H.f815h = false;
        for (s sVar : this.f784c.f()) {
            if (sVar != null) {
                sVar.G.L();
            }
        }
    }

    public final boolean M() {
        x(false);
        w(true);
        s sVar = this.f800s;
        if (sVar != null && sVar.k().M()) {
            return true;
        }
        boolean zN = N(this.E, this.F, -1, 0);
        if (zN) {
            this.f783b = true;
            try {
                P(this.E, this.F);
            } finally {
                d();
            }
        }
        a0();
        t();
        this.f784c.f841b.values().removeAll(Collections.singleton(null));
        return zN;
    }

    public final boolean N(ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        int size;
        a aVar;
        ArrayList arrayList3 = this.f785d;
        if (arrayList3 == null) {
            return false;
        }
        if (i10 >= 0 || (i11 & 1) != 0) {
            if (i10 >= 0) {
                size = arrayList3.size() - 1;
                while (size >= 0) {
                    a aVar2 = (a) this.f785d.get(size);
                    if (i10 >= 0 && i10 == aVar2.f719r) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    do {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        aVar = (a) this.f785d.get(size);
                        if (i10 < 0) {
                            break;
                        }
                    } while (i10 == aVar.f719r);
                }
            } else {
                size = -1;
            }
            if (size == this.f785d.size() - 1) {
                return false;
            }
            for (int size2 = this.f785d.size() - 1; size2 > size; size2--) {
                arrayList.add(this.f785d.remove(size2));
                arrayList2.add(Boolean.TRUE);
            }
        } else {
            int size3 = arrayList3.size() - 1;
            if (size3 < 0) {
                return false;
            }
            arrayList.add(this.f785d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void O(s sVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(sVar);
        }
        boolean z9 = !(sVar.D > 0);
        if (!sVar.M || z9) {
            n0 n0Var = this.f784c;
            synchronized (n0Var.f840a) {
                n0Var.f840a.remove(sVar);
            }
            sVar.f898x = false;
            if (F(sVar)) {
                this.f807z = true;
            }
            sVar.f899y = true;
            W(sVar);
        }
    }

    public final void P(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!((a) arrayList.get(i10)).f716o) {
                if (i11 != i10) {
                    y(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                    while (i11 < size && ((Boolean) arrayList2.get(i11)).booleanValue() && !((a) arrayList.get(i11)).f716o) {
                        i11++;
                    }
                }
                y(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            y(arrayList, arrayList2, i11, size);
        }
    }

    public final void Q(Parcelable parcelable) {
        f.f fVar;
        int i10;
        m0 m0Var;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f681a == null) {
            return;
        }
        n0 n0Var = this.f784c;
        n0Var.f841b.clear();
        Iterator it = fragmentManagerState.f681a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fVar = this.f794m;
            if (!zHasNext) {
                break;
            }
            FragmentState fragmentState = (FragmentState) it.next();
            if (fragmentState != null) {
                s sVar = (s) this.H.f810c.get(fragmentState.f690b);
                if (sVar != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        sVar.toString();
                    }
                    m0Var = new m0(fVar, n0Var, sVar, fragmentState);
                } else {
                    m0Var = new m0(this.f794m, this.f784c, this.f797p.f914y.getClassLoader(), C(), fragmentState);
                }
                s sVar2 = m0Var.f836c;
                sVar2.E = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    sVar2.toString();
                }
                m0Var.m(this.f797p.f914y.getClassLoader());
                n0Var.g(m0Var);
                m0Var.f838e = this.f796o;
            }
        }
        k0 k0Var = this.H;
        k0Var.getClass();
        for (s sVar3 : new ArrayList(k0Var.f810c.values())) {
            if (!(n0Var.f841b.get(sVar3.f892q) != null)) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    sVar3.toString();
                    Objects.toString(fragmentManagerState.f681a);
                }
                this.H.b(sVar3);
                sVar3.E = this;
                m0 m0Var2 = new m0(fVar, n0Var, sVar3);
                m0Var2.f838e = 1;
                m0Var2.k();
                sVar3.f899y = true;
                m0Var2.k();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f682b;
        n0Var.f840a.clear();
        if (arrayList != null) {
            for (String str : arrayList) {
                s sVarB = n0Var.b(str);
                if (sVarB == null) {
                    throw new IllegalStateException(fb1.i("No instantiated fragment for (", str, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    sVarB.toString();
                }
                n0Var.a(sVarB);
            }
        }
        s sVar4 = null;
        if (fragmentManagerState.f683d != null) {
            this.f785d = new ArrayList(fragmentManagerState.f683d.length);
            int i11 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f683d;
                if (i11 >= backStackStateArr.length) {
                    break;
                }
                BackStackState backStackState = backStackStateArr[i11];
                backStackState.getClass();
                a aVar = new a(this);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    int[] iArr = backStackState.f659a;
                    if (i12 >= iArr.length) {
                        break;
                    }
                    o0 o0Var = new o0();
                    int i14 = i12 + 1;
                    o0Var.f844a = iArr[i12];
                    if (Log.isLoggable("FragmentManager", 2)) {
                        aVar.toString();
                        int i15 = iArr[i14];
                    }
                    String str2 = (String) backStackState.f660b.get(i13);
                    if (str2 != null) {
                        o0Var.f845b = n0Var.b(str2);
                    } else {
                        o0Var.f845b = sVar4;
                    }
                    o0Var.f850g = androidx.lifecycle.l.values()[backStackState.f661d[i13]];
                    o0Var.f851h = androidx.lifecycle.l.values()[backStackState.f662f[i13]];
                    int i16 = iArr[i14];
                    o0Var.f846c = i16;
                    int i17 = iArr[i12 + 2];
                    o0Var.f847d = i17;
                    int i18 = i12 + 4;
                    int i19 = iArr[i12 + 3];
                    o0Var.f848e = i19;
                    i12 += 5;
                    int i20 = iArr[i18];
                    o0Var.f849f = i20;
                    aVar.f703b = i16;
                    aVar.f704c = i17;
                    aVar.f705d = i19;
                    aVar.f706e = i20;
                    aVar.b(o0Var);
                    i13++;
                    sVar4 = null;
                }
                aVar.f707f = backStackState.f663h;
                aVar.f709h = backStackState.f664q;
                aVar.f719r = backStackState.f665s;
                aVar.f708g = true;
                aVar.f710i = backStackState.f666t;
                aVar.f711j = backStackState.f667u;
                aVar.f712k = backStackState.f668v;
                aVar.f713l = backStackState.f669w;
                aVar.f714m = backStackState.f670x;
                aVar.f715n = backStackState.f671y;
                aVar.f716o = backStackState.f672z;
                aVar.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    aVar.toString();
                    PrintWriter printWriter = new PrintWriter(new z0());
                    aVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f785d.add(aVar);
                i11++;
                sVar4 = null;
            }
            i10 = 0;
        } else {
            i10 = 0;
            this.f785d = null;
        }
        this.f790i.set(fragmentManagerState.f684f);
        String str3 = fragmentManagerState.f685h;
        if (str3 != null) {
            s sVarB2 = n0Var.b(str3);
            this.f800s = sVarB2;
            p(sVarB2);
        }
        ArrayList arrayList2 = fragmentManagerState.f686q;
        if (arrayList2 != null) {
            while (i10 < arrayList2.size()) {
                Bundle bundle = (Bundle) fragmentManagerState.f687s.get(i10);
                bundle.setClassLoader(this.f797p.f914y.getClassLoader());
                this.f791j.put(arrayList2.get(i10), bundle);
                i10++;
            }
        }
        this.f806y = new ArrayDeque(fragmentManagerState.f688t);
    }

    public final Parcelable R() {
        int i10;
        ArrayList arrayList;
        BackStackState[] backStackStateArr;
        int size;
        Iterator it = e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c1 c1Var = (c1) it.next();
            if (c1Var.f750e) {
                c1Var.f750e = false;
                c1Var.c();
            }
        }
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((c1) it2.next()).e();
        }
        x(true);
        this.A = true;
        this.H.f815h = true;
        n0 n0Var = this.f784c;
        n0Var.getClass();
        HashMap map = n0Var.f841b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (m0 m0Var : map.values()) {
            if (m0Var != null) {
                s sVar = m0Var.f836c;
                FragmentState fragmentState = new FragmentState(sVar);
                if (sVar.f881a <= -1 || fragmentState.f701y != null) {
                    fragmentState.f701y = sVar.f883b;
                } else {
                    Bundle bundleO = m0Var.o();
                    fragmentState.f701y = bundleO;
                    if (sVar.f895u != null) {
                        if (bundleO == null) {
                            fragmentState.f701y = new Bundle();
                        }
                        fragmentState.f701y.putString("android:target_state", sVar.f895u);
                        int i11 = sVar.f896v;
                        if (i11 != 0) {
                            fragmentState.f701y.putInt("android:target_req_state", i11);
                        }
                    }
                }
                arrayList2.add(fragmentState);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(sVar);
                    Objects.toString(fragmentState.f701y);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        n0 n0Var2 = this.f784c;
        synchronized (n0Var2.f840a) {
            try {
                if (n0Var2.f840a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(n0Var2.f840a.size());
                    for (s sVar2 : n0Var2.f840a) {
                        arrayList.add(sVar2.f892q);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            sVar2.toString();
                        }
                    }
                }
            } finally {
            }
        }
        ArrayList arrayList3 = this.f785d;
        if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
            backStackStateArr = null;
        } else {
            backStackStateArr = new BackStackState[size];
            for (i10 = 0; i10 < size; i10++) {
                backStackStateArr[i10] = new BackStackState((a) this.f785d.get(i10));
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(this.f785d.get(i10));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f685h = null;
        ArrayList arrayList4 = new ArrayList();
        fragmentManagerState.f686q = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        fragmentManagerState.f687s = arrayList5;
        fragmentManagerState.f681a = arrayList2;
        fragmentManagerState.f682b = arrayList;
        fragmentManagerState.f683d = backStackStateArr;
        fragmentManagerState.f684f = this.f790i.get();
        s sVar3 = this.f800s;
        if (sVar3 != null) {
            fragmentManagerState.f685h = sVar3.f892q;
        }
        arrayList4.addAll(this.f791j.keySet());
        arrayList5.addAll(this.f791j.values());
        fragmentManagerState.f688t = new ArrayList(this.f806y);
        return fragmentManagerState;
    }

    public final void S() {
        synchronized (this.f782a) {
            try {
                if (this.f782a.size() == 1) {
                    this.f797p.f915z.removeCallbacks(this.I);
                    this.f797p.f915z.post(this.I);
                    a0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void T(s sVar, boolean z9) {
        ViewGroup viewGroupB = B(sVar);
        if (viewGroupB == null || !(viewGroupB instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupB).setDrawDisappearingViewsLast(!z9);
    }

    public final void U(s sVar, androidx.lifecycle.l lVar) {
        if (sVar.equals(this.f784c.b(sVar.f892q)) && (sVar.F == null || sVar.E == this)) {
            sVar.Z = lVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + sVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void V(s sVar) {
        if (sVar != null) {
            if (!sVar.equals(this.f784c.b(sVar.f892q)) || (sVar.F != null && sVar.E != this)) {
                throw new IllegalArgumentException("Fragment " + sVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        s sVar2 = this.f800s;
        this.f800s = sVar;
        p(sVar2);
        p(this.f800s);
    }

    public final void W(s sVar) {
        ViewGroup viewGroupB = B(sVar);
        if (viewGroupB != null) {
            q qVar = sVar.V;
            if ((qVar == null ? 0 : qVar.f867g) + (qVar == null ? 0 : qVar.f866f) + (qVar == null ? 0 : qVar.f865e) + (qVar == null ? 0 : qVar.f864d) > 0) {
                if (viewGroupB.getTag(R.id.yi) == null) {
                    viewGroupB.setTag(R.id.yi, sVar);
                }
                s sVar2 = (s) viewGroupB.getTag(R.id.yi);
                q qVar2 = sVar.V;
                boolean z9 = qVar2 != null ? qVar2.f863c : false;
                if (sVar2.V == null) {
                    return;
                }
                sVar2.i().f863c = z9;
            }
        }
    }

    public final void X() {
        for (m0 m0Var : this.f784c.d()) {
            s sVar = m0Var.f836c;
            if (sVar.T) {
                if (this.f783b) {
                    this.D = true;
                } else {
                    sVar.T = false;
                    m0Var.k();
                }
            }
        }
    }

    public final void Y(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new z0());
        v vVar = this.f797p;
        try {
            if (vVar != null) {
                vVar.B.dump("  ", null, printWriter, new String[0]);
            } else {
                u("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        StringBuilder sb = new StringBuilder(NotificationCompat.FLAG_HIGH_PRIORITY);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        s sVar = this.f799r;
        if (sVar != null) {
            sb.append(sVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f799r)));
            sb.append("}");
        } else {
            v vVar = this.f797p;
            if (vVar != null) {
                sb.append(vVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f797p)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final m0 a(s sVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(sVar);
        }
        m0 m0VarF = f(sVar);
        sVar.E = this;
        n0 n0Var = this.f784c;
        n0Var.g(m0VarF);
        if (!sVar.M) {
            n0Var.a(sVar);
            sVar.f899y = false;
            if (sVar.S == null) {
                sVar.W = false;
            }
            if (F(sVar)) {
                this.f807z = true;
            }
        }
        return m0VarF;
    }

    public final void a0() {
        synchronized (this.f782a) {
            try {
                if (!this.f782a.isEmpty()) {
                    e0 e0Var = this.f789h;
                    e0Var.f764a = true;
                    n0.a aVar = e0Var.f766c;
                    if (aVar != null) {
                        aVar.a(Boolean.TRUE);
                    }
                    return;
                }
                e0 e0Var2 = this.f789h;
                ArrayList arrayList = this.f785d;
                boolean z9 = arrayList != null && arrayList.size() > 0 && H(this.f799r);
                e0Var2.f764a = z9;
                n0.a aVar2 = e0Var2.f766c;
                if (aVar2 != null) {
                    aVar2.a(Boolean.valueOf(z9));
                }
            } finally {
            }
        }
    }

    public final void b(v vVar, z3.a aVar, s sVar) {
        if (this.f797p != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f797p = vVar;
        this.f798q = aVar;
        this.f799r = sVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f795n;
        if (sVar != null) {
            copyOnWriteArrayList.add(new g0(sVar));
        } else if (vVar instanceof l0) {
            copyOnWriteArrayList.add(vVar);
        }
        if (this.f799r != null) {
            a0();
        }
        if (vVar instanceof androidx.activity.q) {
            androidx.activity.p pVar = vVar.B.f151s;
            this.f788g = pVar;
            pVar.a(sVar != null ? sVar : vVar, this.f789h);
        }
        int i10 = 0;
        if (sVar != null) {
            k0 k0Var = sVar.E.H;
            HashMap map = k0Var.f811d;
            k0 k0Var2 = (k0) map.get(sVar.f892q);
            if (k0Var2 == null) {
                k0Var2 = new k0(k0Var.f813f);
                map.put(sVar.f892q, k0Var2);
            }
            this.H = k0Var2;
        } else if (vVar instanceof androidx.lifecycle.o0) {
            ur0 ur0Var = new ur0(vVar.B.f(), k0.f809i);
            String canonicalName = k0.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.H = (k0) ur0Var.t(k0.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        } else {
            this.H = new k0(false);
        }
        this.H.f815h = I();
        this.f784c.f842c = this.H;
        v vVar2 = this.f797p;
        if (vVar2 instanceof androidx.activity.result.g) {
            androidx.activity.f fVar = vVar2.B.f153u;
            String strQ = g1.a.q("FragmentManager:", sVar != null ? g1.a.r(new StringBuilder(), sVar.f892q, ":") : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            this.f803v = fVar.d(g1.a.y(strQ, "StartActivityForResult"), new g11(), new d0(this, 2));
            int i11 = 1;
            this.f804w = fVar.d(g1.a.y(strQ, "StartIntentSenderForResult"), new d.b(i11), new d0(this, i10));
            this.f805x = fVar.d(g1.a.y(strQ, "RequestPermissions"), new d.a(), new d0(this, i11));
        }
    }

    public final void c(s sVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(sVar);
        }
        if (sVar.M) {
            sVar.M = false;
            if (sVar.f898x) {
                return;
            }
            this.f784c.a(sVar);
            if (Log.isLoggable("FragmentManager", 2)) {
                sVar.toString();
            }
            if (F(sVar)) {
                this.f807z = true;
            }
        }
    }

    public final void d() {
        this.f783b = false;
        this.F.clear();
        this.E.clear();
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f784c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((m0) it.next()).f836c.R;
            if (viewGroup != null) {
                hashSet.add(c1.f(viewGroup, D()));
            }
        }
        return hashSet;
    }

    public final m0 f(s sVar) {
        String str = sVar.f892q;
        n0 n0Var = this.f784c;
        m0 m0Var = (m0) n0Var.f841b.get(str);
        if (m0Var != null) {
            return m0Var;
        }
        m0 m0Var2 = new m0(this.f794m, n0Var, sVar);
        m0Var2.m(this.f797p.f914y.getClassLoader());
        m0Var2.f838e = this.f796o;
        return m0Var2;
    }

    public final void g(s sVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(sVar);
        }
        if (sVar.M) {
            return;
        }
        sVar.M = true;
        if (sVar.f898x) {
            if (Log.isLoggable("FragmentManager", 2)) {
                sVar.toString();
            }
            n0 n0Var = this.f784c;
            synchronized (n0Var.f840a) {
                n0Var.f840a.remove(sVar);
            }
            sVar.f898x = false;
            if (F(sVar)) {
                this.f807z = true;
            }
            W(sVar);
        }
    }

    public final void h(Configuration configuration) {
        for (s sVar : this.f784c.f()) {
            if (sVar != null) {
                sVar.onConfigurationChanged(configuration);
                sVar.G.h(configuration);
            }
        }
    }

    public final boolean i() {
        if (this.f796o < 1) {
            return false;
        }
        for (s sVar : this.f784c.f()) {
            if (sVar != null && !sVar.L && sVar.G.i()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Menu menu, MenuInflater menuInflater) {
        boolean z9;
        if (this.f796o < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (s sVar : this.f784c.f()) {
            if (sVar != null && G(sVar) && !sVar.L) {
                if (sVar.O && sVar.P) {
                    sVar.B(menu, menuInflater);
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 | sVar.G.j(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(sVar);
                    z10 = true;
                }
            }
        }
        if (this.f786e != null) {
            for (int i10 = 0; i10 < this.f786e.size(); i10++) {
                s sVar2 = (s) this.f786e.get(i10);
                if (arrayList == null || !arrayList.contains(sVar2)) {
                    sVar2.getClass();
                }
            }
        }
        this.f786e = arrayList;
        return z10;
    }

    public final void k() {
        this.C = true;
        x(true);
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((c1) it.next()).e();
        }
        s(-1);
        this.f797p = null;
        this.f798q = null;
        this.f799r = null;
        if (this.f788g != null) {
            Iterator it2 = this.f789h.f765b.iterator();
            while (it2.hasNext()) {
                ((androidx.activity.a) it2.next()).cancel();
            }
            this.f788g = null;
        }
        androidx.activity.result.c cVar = this.f803v;
        if (cVar != null) {
            cVar.b();
            this.f804w.b();
            this.f805x.b();
        }
    }

    public final void l() {
        for (s sVar : this.f784c.f()) {
            if (sVar != null) {
                sVar.onLowMemory();
                sVar.G.l();
            }
        }
    }

    public final void m(boolean z9) {
        for (s sVar : this.f784c.f()) {
            if (sVar != null) {
                sVar.G.m(z9);
            }
        }
    }

    public final boolean n(MenuItem menuItem) {
        if (this.f796o < 1) {
            return false;
        }
        for (s sVar : this.f784c.f()) {
            if (sVar != null && !sVar.L && ((sVar.O && sVar.P && sVar.H(menuItem)) || sVar.G.n(menuItem))) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        if (this.f796o < 1) {
            return;
        }
        for (s sVar : this.f784c.f()) {
            if (sVar != null && !sVar.L) {
                sVar.G.o();
            }
        }
    }

    public final void p(s sVar) {
        if (sVar != null) {
            if (sVar.equals(this.f784c.b(sVar.f892q))) {
                sVar.E.getClass();
                boolean zH = H(sVar);
                Boolean bool = sVar.f897w;
                if (bool == null || bool.booleanValue() != zH) {
                    sVar.f897w = Boolean.valueOf(zH);
                    j0 j0Var = sVar.G;
                    j0Var.a0();
                    j0Var.p(j0Var.f800s);
                }
            }
        }
    }

    public final void q(boolean z9) {
        for (s sVar : this.f784c.f()) {
            if (sVar != null) {
                sVar.G.q(z9);
            }
        }
    }

    public final boolean r() {
        if (this.f796o < 1) {
            return false;
        }
        boolean z9 = false;
        for (s sVar : this.f784c.f()) {
            if (sVar != null && G(sVar) && !sVar.L) {
                if (sVar.G.r() | (sVar.O && sVar.P)) {
                    z9 = true;
                }
            }
        }
        return z9;
    }

    public final void s(int i10) {
        try {
            this.f783b = true;
            for (m0 m0Var : this.f784c.f841b.values()) {
                if (m0Var != null) {
                    m0Var.f838e = i10;
                }
            }
            K(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((c1) it.next()).e();
            }
            this.f783b = false;
            x(true);
        } catch (Throwable th) {
            this.f783b = false;
            throw th;
        }
    }

    public final void t() {
        if (this.D) {
            this.D = false;
            X();
        }
    }

    public final void u(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String strY = g1.a.y(str, "    ");
        n0 n0Var = this.f784c;
        n0Var.getClass();
        String str2 = str + "    ";
        HashMap map = n0Var.f841b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (m0 m0Var : map.values()) {
                printWriter.print(str);
                if (m0Var != null) {
                    s sVar = m0Var.f836c;
                    printWriter.println(sVar);
                    sVar.g(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = n0Var.f840a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                s sVar2 = (s) arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(sVar2.toString());
            }
        }
        ArrayList arrayList2 = this.f786e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                s sVar3 = (s) this.f786e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(sVar3.toString());
            }
        }
        ArrayList arrayList3 = this.f785d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                a aVar = (a) this.f785d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(strY, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f790i.get());
        synchronized (this.f782a) {
            try {
                int size4 = this.f782a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (h0) this.f782a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f797p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f798q);
        if (this.f799r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f799r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f796o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.A);
        printWriter.print(" mStopped=");
        printWriter.print(this.B);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.C);
        if (this.f807z) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f807z);
        }
    }

    public final void v(h0 h0Var, boolean z9) {
        if (!z9) {
            if (this.f797p == null) {
                if (!this.C) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (I()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f782a) {
            try {
                if (this.f797p == null) {
                    if (!z9) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f782a.add(h0Var);
                    S();
                }
            } finally {
            }
        }
    }

    public final void w(boolean z9) {
        if (this.f783b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f797p == null) {
            if (!this.C) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f797p.f915z.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z9 && I()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.E == null) {
            this.E = new ArrayList();
            this.F = new ArrayList();
        }
        this.f783b = false;
    }

    public final boolean x(boolean z9) {
        w(z9);
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.E;
            ArrayList arrayList2 = this.F;
            synchronized (this.f782a) {
                try {
                    if (this.f782a.isEmpty()) {
                        break;
                    }
                    int size = this.f782a.size();
                    boolean zA = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        zA |= ((h0) this.f782a.get(i10)).a(arrayList, arrayList2);
                    }
                    this.f782a.clear();
                    this.f797p.f915z.removeCallbacks(this.I);
                    if (!zA) {
                        break;
                    }
                    z10 = true;
                    this.f783b = true;
                    try {
                        P(this.E, this.F);
                    } finally {
                        d();
                    }
                } finally {
                }
            }
        }
        a0();
        t();
        this.f784c.f841b.values().removeAll(Collections.singleton(null));
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.util.ArrayList r21, java.util.ArrayList r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.j0.y(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final s z(int i10) {
        n0 n0Var = this.f784c;
        ArrayList arrayList = n0Var.f840a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s sVar = (s) arrayList.get(size);
            if (sVar != null && sVar.I == i10) {
                return sVar;
            }
        }
        for (m0 m0Var : n0Var.f841b.values()) {
            if (m0Var != null) {
                s sVar2 = m0Var.f836c;
                if (sVar2.I == i10) {
                    return sVar2;
                }
            }
        }
        return null;
    }
}
