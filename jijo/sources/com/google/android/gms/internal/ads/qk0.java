package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class qk0 implements ci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z10 f8206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final og f8207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p21 f8208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xs0 f8209e;

    public qk0(Context context, z10 z10Var, xs0 xs0Var, p21 p21Var, og ogVar) {
        this.f8205a = context;
        this.f8206b = z10Var;
        this.f8209e = xs0Var;
        this.f8208d = p21Var;
        this.f8207c = ogVar;
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final n5.a a(kr0 kr0Var, fr0 fr0Var) {
        pk0 pk0Var = new pk0(new View(this.f8205a), null, new k70(24), (gr0) fr0Var.f4640u.get(0));
        ep epVar = new ep(kr0Var, fr0Var, (String) null);
        fz fzVar = (fz) this.f8206b;
        ez ezVar = new ez(fzVar.f4692d, fzVar.f4694e, epVar, pk0Var);
        j40 j40Var = (j40) ezVar.f4338v.zzb();
        v40 v40Var = (v40) ezVar.f4341y.zzb();
        r70 r70Var = (r70) ezVar.A.zzb();
        o70 o70Var = (o70) ezVar.J.zzb();
        y00 y00Var = (y00) ezVar.f4326j.zzb();
        tl0 tl0Var = new tl0();
        tl0Var.f9190q = new AtomicBoolean(false);
        tl0Var.f9185a = j40Var;
        tl0Var.f9186b = v40Var;
        tl0Var.f9187d = r70Var;
        tl0Var.f9188f = o70Var;
        tl0Var.f9189h = y00Var;
        ir0 ir0Var = fr0Var.f4636s;
        mg mgVar = new mg(tl0Var, ir0Var.f5680b, ir0Var.f5679a);
        ws0 ws0Var = ws0.E;
        ok0 ok0Var = new ok0(this, 0, mgVar);
        return new tl0(this.f8209e, ws0Var, null, us0.f9603d, Collections.emptyList(), ((q11) this.f8208d).b(new du(29, ok0Var))).g(ws0.F).m(new va0(tc1.d0(ezVar.q0()), 3), nu.f7388f).d();
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final boolean b(kr0 kr0Var, fr0 fr0Var) {
        ir0 ir0Var;
        return (this.f8207c == null || (ir0Var = fr0Var.f4636s) == null || ir0Var.f5679a == null) ? false : true;
    }
}
