package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class wn1 extends qn1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f10254h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f10255i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public va1 f10256j;

    @Override // com.google.android.gms.internal.ads.qn1
    public final void f() {
        for (vn1 vn1Var : this.f10254h.values()) {
            vn1Var.f9927a.e(vn1Var.f9928b);
        }
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public final void h() {
        for (vn1 vn1Var : this.f10254h.values()) {
            vn1Var.f9927a.g(vn1Var.f9928b);
        }
    }

    @Override // com.google.android.gms.internal.ads.qn1
    public void m() {
        HashMap map = this.f10254h;
        for (vn1 vn1Var : map.values()) {
            vn1Var.f9927a.l(vn1Var.f9928b);
            qn1 qn1Var = vn1Var.f9927a;
            un1 un1Var = vn1Var.f9929c;
            qn1Var.o(un1Var);
            qn1Var.n(un1Var);
        }
        map.clear();
    }

    public abstract void s(Object obj, qn1 qn1Var, wv wvVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.ko1, com.google.android.gms.internal.ads.tn1] */
    public final void t(final Integer num, qn1 qn1Var) {
        HashMap map = this.f10254h;
        tc1.K(!map.containsKey(num));
        ?? r12 = new ko1() { // from class: com.google.android.gms.internal.ads.tn1
            @Override // com.google.android.gms.internal.ads.ko1
            public final void a(qn1 qn1Var2, wv wvVar) {
                this.f9203a.s(num, qn1Var2, wvVar);
            }
        };
        un1 un1Var = new un1(this, num);
        map.put(num, new vn1(qn1Var, r12, un1Var));
        Handler handler = this.f10255i;
        handler.getClass();
        pm1 pm1Var = qn1Var.f8231c;
        pm1Var.getClass();
        pm1Var.f7922b.add(new mo1(handler, un1Var));
        this.f10255i.getClass();
        pm1 pm1Var2 = qn1Var.f8232d;
        pm1Var2.getClass();
        pm1Var2.f7922b.add(new om1(un1Var));
        va1 va1Var = this.f10256j;
        vk1 vk1Var = this.f8235g;
        tc1.A(vk1Var);
        qn1Var.i(r12, va1Var, vk1Var);
        if (!this.f8230b.isEmpty()) {
            return;
        }
        qn1Var.e(r12);
    }

    public void u(Object obj) {
    }

    public void v(Object obj, long j10) {
    }

    public abstract jo1 w(Object obj, jo1 jo1Var);
}
