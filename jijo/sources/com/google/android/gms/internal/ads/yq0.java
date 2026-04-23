package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class yq0 implements ql0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f11007b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gy f11008d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wq0 f11009f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nq0 f11010h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lr0 f11011q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gt0 f11012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nr0 f11013t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public n5.a f11014u;

    public yq0(Context context, Executor executor, gy gyVar, nq0 nq0Var, wq0 wq0Var, nr0 nr0Var, lr0 lr0Var) {
        this.f11006a = context;
        this.f11007b = executor;
        this.f11008d = gyVar;
        this.f11010h = nq0Var;
        this.f11009f = wq0Var;
        this.f11013t = nr0Var;
        this.f11011q = lr0Var;
        this.f11012s = gyVar.d();
    }

    public final bz a(lq0 lq0Var) {
        bz bzVar = new bz(((zy) this.f11008d).f11340c, 1);
        tl0 tl0Var = new tl0();
        tl0Var.f9187d = this.f11006a;
        tl0Var.f9185a = ((xq0) lq0Var).f10634a;
        tl0Var.f9188f = this.f11011q;
        bzVar.f3131q = new z30(tl0Var);
        bzVar.f3130h = new u60(new t60());
        return bzVar;
    }

    @Override // com.google.android.gms.internal.ads.ql0
    public final boolean b(zzl zzlVar, String str, b4.f fVar, pl0 pl0Var) {
        ft0 ft0Var;
        Executor executor = this.f11007b;
        if (str == null) {
            zzm.zzg("Ad unit ID should not be null for rewarded video ad.");
            executor.execute(new yd0(12, this));
            return false;
        }
        n5.a aVar = this.f11014u;
        if (aVar != null && !aVar.isDone()) {
            return false;
        }
        boolean zBooleanValue = ((Boolean) eh.f4203c.k()).booleanValue();
        nq0 nq0Var = this.f11010h;
        if (!zBooleanValue || nq0Var.c() == null) {
            ft0Var = null;
        } else {
            ft0Var = (ft0) ((oz) ((ec0) nq0Var.c())).f7716g.zzb();
            ft0Var.i(5);
            ft0Var.b(zzlVar.zzp);
            ft0Var.f(zzlVar.zzm);
        }
        boolean z9 = zzlVar.zzf;
        Context context = this.f11006a;
        tp1.I(context, z9);
        if (((Boolean) zzba.zzc().a(eg.f3942a8)).booleanValue() && zzlVar.zzf) {
            ((le0) ((zy) this.f11008d).f11375w.zzb()).e(true);
        }
        ((y3.b) zzu.zzB()).getClass();
        Bundle bundleC = tc1.c(new Pair("api-call", Long.valueOf(zzlVar.zzz)), new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        nr0 nr0Var = this.f11013t;
        nr0Var.f7360c = str;
        nr0Var.f7359b = zzq.zzd();
        nr0Var.f7358a = zzlVar;
        nr0Var.f7377t = bundleC;
        or0 or0VarA = nr0Var.a();
        bt0 bt0VarS = tc1.s(context, tc1.S(or0VarA), 5, zzlVar);
        xq0 xq0Var = new xq0();
        xq0Var.f10634a = or0VarA;
        n5.a aVarA = nq0Var.a(new cj0(xq0Var, (Object) null, 3), new jp0(26, this));
        this.f11014u = aVarA;
        tc1.u0(aVarA, new qp0(this, pl0Var, ft0Var, bt0VarS, xq0Var, 1), executor);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ql0
    public final boolean zza() {
        throw null;
    }
}
