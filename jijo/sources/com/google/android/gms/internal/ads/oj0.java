package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class oj0 extends nj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gy f7586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl0 f7587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u60 f7588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tj0 f7589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gi0 f7590e;

    public oj0(gy gyVar, tl0 tl0Var, u60 u60Var, tj0 tj0Var, gi0 gi0Var) {
        this.f7586a = gyVar;
        this.f7587b = tl0Var;
        this.f7588c = u60Var;
        this.f7589d = tj0Var;
        this.f7590e = gi0Var;
    }

    @Override // com.google.android.gms.internal.ads.nj0
    public final ts0 c(or0 or0Var, Bundle bundle, fr0 fr0Var, kr0 kr0Var) {
        tl0 tl0Var = this.f7587b;
        tl0Var.f9185a = or0Var;
        tl0Var.f9186b = bundle;
        tl0Var.f9189h = new ep(kr0Var, fr0Var, this.f7589d, 6, 0);
        if (((Boolean) zzba.zzc().a(eg.f4026i3)).booleanValue()) {
            tl0Var.f9190q = this.f7590e;
        }
        zy zyVar = ((zy) this.f7586a).f11340c;
        z30 z30Var = new z30(tl0Var);
        u60 u60Var = this.f7588c;
        tp1.h0(u60Var, u60.class);
        f30 f30VarZzb = new cz(zyVar, u60Var, z30Var, new i10(), null, null).zzb();
        return f30VarZzb.a(f30VarZzb.b());
    }
}
