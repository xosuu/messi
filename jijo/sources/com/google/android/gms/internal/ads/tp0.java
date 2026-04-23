package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class tp0 implements ql0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f9224b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gy f9225d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sp0 f9226f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nq0 f9227h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final VersionInfoParcel f9228q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FrameLayout f9229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gt0 f9230t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final nr0 f9231u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n5.a f9232v;

    public tp0(Context context, Executor executor, gy gyVar, nq0 nq0Var, sp0 sp0Var, nr0 nr0Var, VersionInfoParcel versionInfoParcel) {
        this.f9223a = context;
        this.f9224b = executor;
        this.f9225d = gyVar;
        this.f9227h = nq0Var;
        this.f9226f = sp0Var;
        this.f9231u = nr0Var;
        this.f9228q = versionInfoParcel;
        new FrameLayout(context);
        this.f9230t = gyVar.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(com.google.android.gms.ads.internal.client.zzl r11, java.lang.String r12, com.google.android.gms.internal.ads.pl0 r13) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.tp0.a(com.google.android.gms.ads.internal.client.zzl, java.lang.String, com.google.android.gms.internal.ads.pl0):boolean");
    }

    @Override // com.google.android.gms.internal.ads.ql0
    public final synchronized /* bridge */ /* synthetic */ boolean b(zzl zzlVar, String str, b4.f fVar, pl0 pl0Var) {
        return a(zzlVar, str, pl0Var);
    }

    public final synchronized bz c(lq0 lq0Var) {
        rp0 rp0Var = (rp0) lq0Var;
        if (((Boolean) zzba.zzc().a(eg.f4111q7)).booleanValue()) {
            tl0 tl0Var = new tl0();
            tl0Var.f9187d = this.f9223a;
            tl0Var.f9185a = rp0Var.f8677a;
            z30 z30Var = new z30(tl0Var);
            t60 t60Var = new t60();
            t60Var.f9070l.add(new n70(this.f9226f, this.f9224b));
            t60Var.d(this.f9226f, this.f9224b);
            u60 u60Var = new u60(t60Var);
            bz bzVar = new bz(((zy) this.f9225d).f11340c, 0);
            bzVar.f3131q = z30Var;
            bzVar.f3130h = u60Var;
            return bzVar;
        }
        sp0 sp0Var = this.f9226f;
        sp0 sp0Var2 = new sp0(sp0Var.f8937a);
        sp0Var2.f8944t = sp0Var;
        t60 t60Var2 = new t60();
        t60Var2.a(sp0Var2, this.f9224b);
        t60Var2.f9065g.add(new n70(sp0Var2, this.f9224b));
        t60Var2.f9072n.add(new n70(sp0Var2, this.f9224b));
        t60Var2.f9071m.add(new n70(sp0Var2, this.f9224b));
        t60Var2.f9070l.add(new n70(sp0Var2, this.f9224b));
        t60Var2.d(sp0Var2, this.f9224b);
        t60Var2.f9073o = sp0Var2;
        tl0 tl0Var2 = new tl0();
        tl0Var2.f9187d = this.f9223a;
        tl0Var2.f9185a = rp0Var.f8677a;
        z30 z30Var2 = new z30(tl0Var2);
        u60 u60Var2 = new u60(t60Var2);
        bz bzVar2 = new bz(((zy) this.f9225d).f11340c, 0);
        bzVar2.f3131q = z30Var2;
        bzVar2.f3130h = u60Var2;
        return bzVar2;
    }

    @Override // com.google.android.gms.internal.ads.ql0
    public final boolean zza() {
        n5.a aVar = this.f9232v;
        return (aVar == null || aVar.isDone()) ? false : true;
    }
}
