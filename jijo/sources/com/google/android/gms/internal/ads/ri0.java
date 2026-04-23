package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ri0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f8602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f8603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f8604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f8605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f8606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f8607f;

    public ri0(kh1 kh1Var, nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, f40 f40Var, nh1 nh1Var4) {
        this.f8602a = kh1Var;
        this.f8603b = nh1Var;
        this.f8604c = nh1Var2;
        this.f8605d = nh1Var3;
        this.f8606e = f40Var;
        this.f8607f = nh1Var4;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xi0 zzb() {
        return new xi0((z10) this.f8602a.zzb(), (Context) this.f8603b.zzb(), (Executor) this.f8604c.zzb(), (kc0) this.f8605d.zzb(), ((f40) this.f8606e).a(), (gx0) this.f8607f.zzb());
    }
}
