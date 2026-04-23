package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashSet f736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m0 f739h;

    public b1(int i10, int i11, m0 m0Var, k0.b bVar) {
        s sVar = m0Var.f836c;
        this.f735d = new ArrayList();
        this.f736e = new HashSet();
        this.f737f = false;
        this.f738g = false;
        this.f732a = i10;
        this.f733b = i11;
        this.f734c = sVar;
        bVar.b(new k(this));
        this.f739h = m0Var;
    }

    public final void a() {
        if (this.f737f) {
            return;
        }
        this.f737f = true;
        HashSet hashSet = this.f736e;
        if (hashSet.isEmpty()) {
            b();
            return;
        }
        Iterator it = new ArrayList(hashSet).iterator();
        while (it.hasNext()) {
            ((k0.b) it.next()).a();
        }
    }

    public final void b() {
        if (!this.f738g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            this.f738g = true;
            Iterator it = this.f735d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f739h.k();
    }

    public final void c(int i10, int i11) {
        if (i11 == 0) {
            throw null;
        }
        int i12 = i11 - 1;
        s sVar = this.f734c;
        if (i12 == 0) {
            if (this.f732a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(sVar);
                }
                this.f732a = i10;
                return;
            }
            return;
        }
        if (i12 != 1) {
            if (i12 != 2) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(sVar);
            }
            this.f732a = 1;
            this.f733b = 3;
            return;
        }
        if (this.f732a == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(sVar);
            }
            this.f732a = 2;
            this.f733b = 2;
        }
    }

    public final void d() {
        if (this.f733b == 2) {
            m0 m0Var = this.f739h;
            s sVar = m0Var.f836c;
            View viewFindFocus = sVar.S.findFocus();
            if (viewFindFocus != null) {
                sVar.i().f875o = viewFindFocus;
                if (Log.isLoggable("FragmentManager", 2)) {
                    viewFindFocus.toString();
                    sVar.toString();
                }
            }
            View viewU = this.f734c.U();
            if (viewU.getParent() == null) {
                m0Var.b();
                viewU.setAlpha(0.0f);
            }
            if (viewU.getAlpha() == 0.0f && viewU.getVisibility() == 0) {
                viewU.setVisibility(4);
            }
            q qVar = sVar.V;
            viewU.setAlpha(qVar == null ? 1.0f : qVar.f874n);
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + g1.a.A(this.f732a) + "} {mLifecycleImpact = " + g1.a.z(this.f733b) + "} {mFragment = " + this.f734c + "}";
    }
}
