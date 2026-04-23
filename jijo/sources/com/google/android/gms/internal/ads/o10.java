package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o10 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f7459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f7460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f7461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f7462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f7463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f7464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f7465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qh1 f7466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qh1 f7467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qh1 f7468j;

    public o10(l30 l30Var, nh1 nh1Var, t10 t10Var, nh1 nh1Var2, nh1 nh1Var3, u10 u10Var, s80 s80Var, nh1 nh1Var4, hh1 hh1Var, nh1 nh1Var5) {
        this.f7459a = l30Var;
        this.f7460b = nh1Var;
        this.f7461c = t10Var;
        this.f7462d = nh1Var2;
        this.f7463e = nh1Var3;
        this.f7464f = u10Var;
        this.f7465g = s80Var;
        this.f7466h = nh1Var4;
        this.f7467i = hh1Var;
        this.f7468j = nh1Var5;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n10 zzb() {
        jt jtVarZzb = ((l30) this.f7459a).zzb();
        Context context = (Context) this.f7460b.zzb();
        gr0 gr0Var = (gr0) ((t10) this.f7461c).f9030a.f10632f;
        tp1.b0(gr0Var);
        View view = (View) ((s10) this.f7462d).f8773a.f10631d;
        tp1.b0(view);
        fx fxVar = (fx) ((y10) this.f7463e).f10728a.f10633h;
        q20 q20Var = (q20) ((u10) this.f7464f).f9340a.f10630b;
        r90 r90Var = (r90) ((s80) this.f7465g).f8819a.f7834b;
        tp1.b0(r90Var);
        return new n10(jtVarZzb, context, gr0Var, view, fxVar, q20Var, r90Var, (r70) this.f7466h.zzb(), ih1.a(en1.Q(this.f7467i)), (Executor) this.f7468j.zzb());
    }
}
