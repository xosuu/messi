package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j90 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f5831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f5832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f5833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f5834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f5835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f5836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f5837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qh1 f5838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qh1 f5839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qh1 f5840j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qh1 f5841k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qh1 f5842l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qh1 f5843m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qh1 f5844n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qh1 f5845o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qh1 f5846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qh1 f5847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qh1 f5848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qh1 f5849s;

    public j90(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, jh1 jh1Var, x90 x90Var, nh1 nh1Var4, s80 s80Var, nh1 nh1Var5, nh1 nh1Var6, nh1 nh1Var7, nh1 nh1Var8, nh1 nh1Var9, s90 s90Var, nh1 nh1Var10, ry ryVar, jy jyVar, nh1 nh1Var11, nh1 nh1Var12, nh1 nh1Var13) {
        this.f5831a = nh1Var;
        this.f5832b = nh1Var2;
        this.f5833c = nh1Var3;
        this.f5834d = jh1Var;
        this.f5835e = x90Var;
        this.f5836f = nh1Var4;
        this.f5837g = s80Var;
        this.f5838h = nh1Var5;
        this.f5839i = nh1Var6;
        this.f5840j = nh1Var7;
        this.f5841k = nh1Var8;
        this.f5842l = nh1Var9;
        this.f5843m = s90Var;
        this.f5844n = nh1Var10;
        this.f5845o = ryVar;
        this.f5846p = jyVar;
        this.f5847q = nh1Var11;
        this.f5848r = nh1Var12;
        this.f5849s = nh1Var13;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        jt jtVarZzb = ((l30) this.f5831a).zzb();
        Executor executor = (Executor) this.f5832b.zzb();
        n90 n90VarA = ((t90) this.f5833c).a();
        q90 q90Var = (q90) this.f5834d.zzb();
        w90 w90VarA = ((x90) this.f5835e).zzb();
        p90 p90Var = (p90) this.f5836f.zzb();
        r90 r90Var = (r90) ((s80) this.f5837g).f8819a.f7834b;
        tp1.b0(r90Var);
        eh1 eh1VarA = ih1.a(en1.Q(this.f5838h));
        eh1 eh1VarA2 = ih1.a(en1.Q(this.f5839i));
        eh1 eh1VarA3 = ih1.a(en1.Q(this.f5840j));
        eh1 eh1VarA4 = ih1.a(en1.Q(this.f5841k));
        eh1 eh1VarA5 = ih1.a(en1.Q(this.f5842l));
        s90 s90Var = (s90) this.f5843m;
        kt ktVar = new kt(((jy) s90Var.f8822a).a(), ((f40) s90Var.f8823b).a().f7646f);
        y9 y9Var = (y9) this.f5844n.zzb();
        VersionInfoParcel versionInfoParcelA = ((ry) this.f5845o).a();
        Context contextA = ((jy) this.f5846p).a();
        k90 k90Var = (k90) this.f5847q.zzb();
        ll0 ll0Var = (ll0) this.f5848r.zzb();
        return new i90(jtVarZzb, executor, n90VarA, q90Var, w90VarA, p90Var, r90Var, eh1VarA, eh1VarA2, eh1VarA3, eh1VarA4, eh1VarA5, ktVar, y9Var, versionInfoParcelA, contextA, k90Var, ll0Var);
    }
}
