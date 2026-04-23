package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class x90 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f10490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f10491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f10492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f10493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f10494e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f10495f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f10496g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qh1 f10497h;

    public x90(iy iyVar, f40 f40Var, nh1 nh1Var, nh1 nh1Var2, jh1 jh1Var, jh1 jh1Var2, nh1 nh1Var3, nh1 nh1Var4) {
        this.f10490a = iyVar;
        this.f10491b = f40Var;
        this.f10492c = nh1Var;
        this.f10493d = nh1Var2;
        this.f10494e = jh1Var;
        this.f10495f = jh1Var2;
        this.f10496g = nh1Var3;
        this.f10497h = nh1Var4;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w90 zzb() {
        zzj zzjVarZzb = ((iy) this.f10490a).zzb();
        or0 or0VarA = ((f40) this.f10491b).a();
        p90 p90Var = (p90) this.f10492c.zzb();
        n90 n90VarA = ((t90) this.f10493d).a();
        ba0 ba0Var = (ba0) this.f10494e.zzb();
        ea0 ea0Var = (ea0) this.f10495f.zzb();
        Executor executor = (Executor) this.f10496g.zzb();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new w90(zzjVarZzb, or0VarA, p90Var, n90VarA, ba0Var, ea0Var, executor, muVar, (k90) this.f10497h.zzb());
    }
}
