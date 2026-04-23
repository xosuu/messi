package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class uq0 implements ql0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f9573b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gy f9574d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kl0 f9575f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wq0 f9576h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public og f9577q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gt0 f9578s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final nr0 f9579t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ts0 f9580u;

    public uq0(Context context, Executor executor, gy gyVar, kl0 kl0Var, wq0 wq0Var, nr0 nr0Var) {
        this.f9572a = context;
        this.f9573b = executor;
        this.f9574d = gyVar;
        this.f9575f = kl0Var;
        this.f9579t = nr0Var;
        this.f9576h = wq0Var;
        this.f9578s = gyVar.d();
    }

    @Override // com.google.android.gms.internal.ads.ql0
    public final boolean b(zzl zzlVar, String str, b4.f fVar, pl0 pl0Var) {
        lz lzVar;
        ft0 ft0Var;
        Executor executor = this.f9573b;
        if (str == null) {
            zzm.zzg("Ad unit ID should not be null for interstitial ad.");
            executor.execute(new yd0(11, this));
            return false;
        }
        if (zza()) {
            return false;
        }
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.f3942a8)).booleanValue();
        gy gyVar = this.f9574d;
        if (zBooleanValue && zzlVar.zzf) {
            ((le0) ((zy) gyVar).f11375w.zzb()).e(true);
        }
        zzq zzqVar = ((rq0) fVar).f8680c;
        ((y3.b) zzu.zzB()).getClass();
        Bundle bundleC = tc1.c(new Pair("api-call", Long.valueOf(zzlVar.zzz)), new Pair("dynamite-enter", Long.valueOf(System.currentTimeMillis())));
        nr0 nr0Var = this.f9579t;
        nr0Var.f7360c = str;
        nr0Var.f7359b = zzqVar;
        nr0Var.f7358a = zzlVar;
        nr0Var.f7377t = bundleC;
        or0 or0VarA = nr0Var.a();
        int iS = tc1.S(or0VarA);
        Context context = this.f9572a;
        bt0 bt0VarS = tc1.s(context, iS, 4, zzlVar);
        boolean zBooleanValue2 = ((Boolean) zzba.zzc().a(eg.f4121r7)).booleanValue();
        kl0 kl0Var = this.f9575f;
        if (zBooleanValue2) {
            zy zyVar = ((zy) gyVar).f11340c;
            tl0 tl0Var = new tl0();
            tl0Var.f9187d = context;
            tl0Var.f9185a = or0VarA;
            z30 z30Var = new z30(tl0Var);
            t60 t60Var = new t60();
            t60Var.b(kl0Var, executor);
            t60Var.c(kl0Var, executor);
            lzVar = new lz(zyVar, new u60(t60Var), z30Var, new i10(), new rk0(0, this.f9577q), null, null);
        } else {
            t60 t60Var2 = new t60();
            HashSet hashSet = t60Var2.f9066h;
            HashSet hashSet2 = t60Var2.f9063e;
            wq0 wq0Var = this.f9576h;
            if (wq0Var != null) {
                hashSet2.add(new n70(wq0Var, executor));
                hashSet.add(new n70(wq0Var, executor));
                t60Var2.a(wq0Var, executor);
            }
            zy zyVar2 = ((zy) gyVar).f11340c;
            tl0 tl0Var2 = new tl0();
            tl0Var2.f9187d = context;
            tl0Var2.f9185a = or0VarA;
            z30 z30Var2 = new z30(tl0Var2);
            t60Var2.b(kl0Var, executor);
            hashSet2.add(new n70(kl0Var, executor));
            hashSet.add(new n70(kl0Var, executor));
            t60Var2.a(kl0Var, executor);
            t60Var2.f9061c.add(new n70(kl0Var, executor));
            t60Var2.d(kl0Var, executor);
            t60Var2.c(kl0Var, executor);
            t60Var2.f9071m.add(new n70(kl0Var, executor));
            t60Var2.f9070l.add(new n70(kl0Var, executor));
            lzVar = new lz(zyVar2, new u60(t60Var2), z30Var2, new i10(), new rk0(0, this.f9577q), null, null);
        }
        lz lzVar2 = lzVar;
        if (((Boolean) eh.f4203c.k()).booleanValue()) {
            ft0 ft0Var2 = (ft0) lzVar2.f6749l0.zzb();
            ft0Var2.i(4);
            ft0Var2.b(zzlVar.zzp);
            ft0Var2.f(zzlVar.zzm);
            ft0Var = ft0Var2;
        } else {
            ft0Var = null;
        }
        f30 f30Var = (f30) lzVar2.f6777z0.zzb();
        ts0 ts0VarA = f30Var.a(f30Var.b());
        this.f9580u = ts0VarA;
        tc1.u0(ts0VarA, new qp0(this, pl0Var, ft0Var, bt0VarS, lzVar2, 6), executor);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ql0
    public final boolean zza() {
        ts0 ts0Var = this.f9580u;
        return (ts0Var == null || ts0Var.f9284d.isDone()) ? false : true;
    }
}
