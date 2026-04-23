package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class qn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8229a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f8230b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pm1 f8231c = new pm1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pm1 f8232d = new pm1(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f8233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public wv f8234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public vk1 f8235g;

    public abstract void a(io1 io1Var);

    public abstract io1 b(jo1 jo1Var, iq1 iq1Var, long j10);

    public abstract fg c();

    public void d() {
    }

    public final void e(ko1 ko1Var) {
        HashSet hashSet = this.f8230b;
        boolean z9 = !hashSet.isEmpty();
        hashSet.remove(ko1Var);
        if (z9 && hashSet.isEmpty()) {
            f();
        }
    }

    public void f() {
    }

    public final void g(ko1 ko1Var) {
        this.f8233e.getClass();
        HashSet hashSet = this.f8230b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(ko1Var);
        if (zIsEmpty) {
            h();
        }
    }

    public void h() {
    }

    public final void i(ko1 ko1Var, va1 va1Var, vk1 vk1Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f8233e;
        boolean z9 = true;
        if (looper != null && looper != looperMyLooper) {
            z9 = false;
        }
        tc1.K(z9);
        this.f8235g = vk1Var;
        wv wvVar = this.f8234f;
        this.f8229a.add(ko1Var);
        if (this.f8233e == null) {
            this.f8233e = looperMyLooper;
            this.f8230b.add(ko1Var);
            j(va1Var);
        } else if (wvVar != null) {
            g(ko1Var);
            ko1Var.a(this, wvVar);
        }
    }

    public abstract void j(va1 va1Var);

    public final void k(wv wvVar) {
        this.f8234f = wvVar;
        ArrayList arrayList = this.f8229a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ko1) arrayList.get(i10)).a(this, wvVar);
        }
    }

    public final void l(ko1 ko1Var) {
        ArrayList arrayList = this.f8229a;
        arrayList.remove(ko1Var);
        if (!arrayList.isEmpty()) {
            e(ko1Var);
            return;
        }
        this.f8233e = null;
        this.f8234f = null;
        this.f8235g = null;
        this.f8230b.clear();
        m();
    }

    public abstract void m();

    public final void n(qm1 qm1Var) {
        CopyOnWriteArrayList<om1> copyOnWriteArrayList = this.f8232d.f7922b;
        for (om1 om1Var : copyOnWriteArrayList) {
            if (om1Var.f7614a == qm1Var) {
                copyOnWriteArrayList.remove(om1Var);
            }
        }
    }

    public final void o(no1 no1Var) {
        CopyOnWriteArrayList<mo1> copyOnWriteArrayList = this.f8231c.f7922b;
        for (mo1 mo1Var : copyOnWriteArrayList) {
            if (mo1Var.f7025b == no1Var) {
                copyOnWriteArrayList.remove(mo1Var);
            }
        }
    }

    public abstract void p(fg fgVar);

    public void q() {
    }

    public abstract void r();
}
