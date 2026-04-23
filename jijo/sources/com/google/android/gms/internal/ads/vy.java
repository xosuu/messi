package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gp0 f9994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zy f9995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nh1 f9996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z00 f9997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z00 f9998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hp0 f9999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hp0 f10000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final on0 f10001h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final cf0 f10002i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z00 f10003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wg f10004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final nh1 f10005l;

    public vy(zy zyVar, gp0 gp0Var) {
        this.f9995b = zyVar;
        this.f9994a = gp0Var;
        this.f9996c = ih1.b(new hp0(zyVar.f11368q, 9));
        lp0 lp0Var = new lp0(gp0Var);
        mp0 mp0Var = new mp0(gp0Var);
        op0 op0Var = new op0(gp0Var);
        qs0 qs0Var = tc1.f9128z;
        jy jyVar = zyVar.f11350h;
        nh1 nh1Var = zyVar.f11344e;
        cf0 cf0Var = tp1.f9253u;
        this.f9997d = new z00(qs0Var, jyVar, nh1Var, cf0Var, lp0Var, mp0Var, op0Var, 10);
        kp0 kp0Var = new kp0(gp0Var);
        nh1 nh1Var2 = zyVar.N;
        this.f9998e = new z00(qs0Var, lp0Var, jyVar, nh1Var2, nh1Var, cf0Var, kp0Var, 11);
        int i10 = 0;
        this.f9999f = new hp0((jh1) jyVar, i10);
        this.f10000g = new hp0((jh1) kp0Var, 2);
        this.f10001h = new on0(nh1Var, (jh1) jyVar, 17);
        this.f10002i = new cf0(9, i10);
        this.f10003j = new z00(nh1Var2, new np0(gp0Var), op0Var, en1.C, cf0Var, kp0Var, nh1Var, 12);
        this.f10004k = new wg(kp0Var, tp1.f9238f, nh1Var2, nh1Var, 29);
        f80 f80Var = new f80(3, gp0Var);
        nh1 nh1VarB = ih1.b(tp1.f9246n);
        nh1 nh1VarB2 = ih1.b(en1.K);
        nh1 nh1VarB3 = ih1.b(tc1.H);
        nh1 nh1VarB4 = ih1.b(en1.L);
        int i11 = lh1.f6629b;
        LinkedHashMap linkedHashMapW = tp1.W(4);
        linkedHashMapW.put(ws0.f10332q, nh1VarB);
        linkedHashMapW.put(ws0.f10333s, nh1VarB2);
        linkedHashMapW.put(ws0.f10335u, nh1VarB3);
        linkedHashMapW.put(ws0.f10337w, nh1VarB4);
        nh1 nh1VarB5 = ih1.b(new wg((jh1) f80Var, (nh1) zyVar.f11350h, (nh1) new lh1(linkedHashMapW), 16));
        int i12 = oh1.f7580c;
        List listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(nh1VarB5);
        this.f10005l = ih1.b(new on0(zyVar.f11344e, (jh1) new zs0(new oh1(listEmptyList, arrayList)), 19));
    }
}
