package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class rj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vk1 f8616a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qj1 f8620e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dk1 f8623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ld0 f8624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public va1 f8626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public fp1 f8627l = new fp1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap f8618c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f8619d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8617b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f8621f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f8622g = new HashSet();

    public rj1(qj1 qj1Var, dk1 dk1Var, tm0 tm0Var, vk1 vk1Var) {
        this.f8616a = vk1Var;
        this.f8620e = qj1Var;
        this.f8623h = dk1Var;
        this.f8624i = tm0Var;
    }

    public final int a() {
        return this.f8617b.size();
    }

    public final wv b() {
        ArrayList arrayList = this.f8617b;
        if (arrayList.isEmpty()) {
            return wv.f10355a;
        }
        int iC = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            pj1 pj1Var = (pj1) arrayList.get(i10);
            pj1Var.f7903d = iC;
            iC += pj1Var.f7900a.f5018o.f11279b.c();
        }
        return new xj1(arrayList, this.f8627l);
    }

    public final wv c(int i10, int i11, List list) {
        ArrayList arrayList = this.f8617b;
        tc1.K(i10 >= 0 && i10 <= i11 && i11 <= arrayList.size());
        tc1.K(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((pj1) arrayList.get(i12)).f7900a.p((fg) list.get(i12 - i10));
        }
        return b();
    }

    public final void d(va1 va1Var) {
        tc1.W(!this.f8625j);
        this.f8626k = va1Var;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f8617b;
            if (i10 >= arrayList.size()) {
                this.f8625j = true;
                return;
            }
            pj1 pj1Var = (pj1) arrayList.get(i10);
            m(pj1Var);
            this.f8622g.add(pj1Var);
            i10++;
        }
    }

    public final void e(io1 io1Var) {
        IdentityHashMap identityHashMap = this.f8618c;
        pj1 pj1Var = (pj1) identityHashMap.remove(io1Var);
        pj1Var.getClass();
        pj1Var.f7900a.a(io1Var);
        pj1Var.f7902c.remove(((do1) io1Var).f3709a);
        if (!identityHashMap.isEmpty()) {
            k();
        }
        l(pj1Var);
    }

    public final boolean f() {
        return this.f8625j;
    }

    public final wv g(int i10, List list, fp1 fp1Var) {
        if (!list.isEmpty()) {
            this.f8627l = fp1Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                pj1 pj1Var = (pj1) list.get(i11 - i10);
                ArrayList arrayList = this.f8617b;
                if (i11 > 0) {
                    pj1 pj1Var2 = (pj1) arrayList.get(i11 - 1);
                    pj1Var.f7903d = pj1Var2.f7900a.f5018o.f11279b.c() + pj1Var2.f7903d;
                    pj1Var.f7904e = false;
                    pj1Var.f7902c.clear();
                } else {
                    pj1Var.f7903d = 0;
                    pj1Var.f7904e = false;
                    pj1Var.f7902c.clear();
                }
                int iC = pj1Var.f7900a.f5018o.f11279b.c();
                for (int i12 = i11; i12 < arrayList.size(); i12++) {
                    ((pj1) arrayList.get(i12)).f7903d += iC;
                }
                arrayList.add(i11, pj1Var);
                this.f8619d.put(pj1Var.f7901b, pj1Var);
                if (this.f8625j) {
                    m(pj1Var);
                    if (this.f8618c.isEmpty()) {
                        this.f8622g.add(pj1Var);
                    } else {
                        oj1 oj1Var = (oj1) this.f8621f.get(pj1Var);
                        if (oj1Var != null) {
                            oj1Var.f7591a.e(oj1Var.f7592b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final wv h(int i10, int i11, fp1 fp1Var) {
        boolean z9 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= this.f8617b.size()) {
            z9 = true;
        }
        tc1.K(z9);
        this.f8627l = fp1Var;
        n(i10, i11);
        return b();
    }

    public final wv i(List list, fp1 fp1Var) {
        ArrayList arrayList = this.f8617b;
        n(0, arrayList.size());
        return g(arrayList.size(), list, fp1Var);
    }

    public final wv j(fp1 fp1Var) {
        int size = this.f8617b.size();
        if (fp1Var.f4597b.length != size) {
            fp1Var = new fp1(new Random(fp1Var.f4596a.nextLong())).a(size);
        }
        this.f8627l = fp1Var;
        return b();
    }

    public final void k() {
        Iterator it = this.f8622g.iterator();
        while (it.hasNext()) {
            pj1 pj1Var = (pj1) it.next();
            if (pj1Var.f7902c.isEmpty()) {
                oj1 oj1Var = (oj1) this.f8621f.get(pj1Var);
                if (oj1Var != null) {
                    oj1Var.f7591a.e(oj1Var.f7592b);
                }
                it.remove();
            }
        }
    }

    public final void l(pj1 pj1Var) {
        if (pj1Var.f7904e && pj1Var.f7902c.isEmpty()) {
            oj1 oj1Var = (oj1) this.f8621f.remove(pj1Var);
            oj1Var.getClass();
            qn1 qn1Var = oj1Var.f7591a;
            qn1Var.l(oj1Var.f7592b);
            ok0 ok0Var = oj1Var.f7593c;
            qn1Var.o(ok0Var);
            qn1Var.n(ok0Var);
            this.f8622g.remove(pj1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.ko1, com.google.android.gms.internal.ads.lj1] */
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
    public final void m(pj1 pj1Var) {
        go1 go1Var = pj1Var.f7900a;
        ?? r12 = new ko1() { // from class: com.google.android.gms.internal.ads.lj1
            @Override // com.google.android.gms.internal.ads.ko1
            public final void a(qn1 qn1Var, wv wvVar) {
                tm0 tm0Var = ((aj1) this.f6647a.f8620e).f2711t;
                tm0Var.f9195a.removeMessages(2);
                tm0Var.c(22);
            }
        };
        ok0 ok0Var = new ok0(this, pj1Var, 6);
        this.f8621f.put(pj1Var, new oj1(go1Var, r12, ok0Var));
        int i10 = yn0.f10944a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(looperMyLooper, null);
        pm1 pm1Var = go1Var.f8231c;
        pm1Var.getClass();
        pm1Var.f7922b.add(new mo1(handler, ok0Var));
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        new Handler(looperMyLooper2, null);
        pm1 pm1Var2 = go1Var.f8232d;
        pm1Var2.getClass();
        pm1Var2.f7922b.add(new om1(ok0Var));
        go1Var.i(r12, this.f8626k, this.f8616a);
    }

    public final void n(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            ArrayList arrayList = this.f8617b;
            pj1 pj1Var = (pj1) arrayList.remove(i11);
            this.f8619d.remove(pj1Var.f7901b);
            int i12 = -pj1Var.f7900a.f5018o.f11279b.c();
            for (int i13 = i11; i13 < arrayList.size(); i13++) {
                ((pj1) arrayList.get(i13)).f7903d += i12;
            }
            pj1Var.f7904e = true;
            if (this.f8625j) {
                l(pj1Var);
            }
        }
    }
}
