package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class mj0 extends nj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6977a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gy f6978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tl0 f6979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u60 f6980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tj0 f6981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gi0 f6982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f6983g;

    public mj0(gy gyVar, p80 p80Var, tl0 tl0Var, u60 u60Var, tj0 tj0Var, gi0 gi0Var) {
        this.f6978b = gyVar;
        this.f6983g = p80Var;
        this.f6979c = tl0Var;
        this.f6980d = u60Var;
        this.f6981e = tj0Var;
        this.f6982f = gi0Var;
    }

    @Override // com.google.android.gms.internal.ads.nj0
    public final ts0 c(or0 or0Var, Bundle bundle, fr0 fr0Var, kr0 kr0Var) {
        lr0 lr0Var;
        u60 u60Var = this.f6980d;
        int i10 = this.f6977a;
        gy gyVar = this.f6978b;
        gi0 gi0Var = this.f6982f;
        Object obj = this.f6983g;
        tl0 tl0Var = this.f6979c;
        switch (i10) {
            case 0:
                tl0Var.f9185a = or0Var;
                tl0Var.f9186b = bundle;
                tl0Var.f9189h = new ep(kr0Var, fr0Var, this.f6981e, 6, 0);
                if (((Boolean) zzba.zzc().a(eg.f4026i3)).booleanValue()) {
                    tl0Var.f9190q = gi0Var;
                }
                zy zyVar = ((zy) gyVar).f11340c;
                z30 z30Var = new z30(tl0Var);
                p80 p80Var = (p80) obj;
                i10 i10Var = new i10(0, null);
                tp1.h0(u60Var, u60.class);
                tp1.h0(p80Var, p80.class);
                f30 f30Var = (f30) new uy(zyVar, i10Var, p80Var, u60Var, z30Var, new i10(), null, null).f9676q0.zzb();
                return f30Var.a(f30Var.b());
            case 1:
                tl0Var.f9185a = or0Var;
                tl0Var.f9186b = bundle;
                tl0Var.f9189h = new ep(kr0Var, fr0Var, this.f6981e, 6, 0);
                if (((Boolean) zzba.zzc().a(eg.f4026i3)).booleanValue()) {
                    tl0Var.f9190q = gi0Var;
                }
                zy zyVar2 = ((zy) gyVar).f11340c;
                z30 z30Var2 = new z30(tl0Var);
                rk0 rk0Var = (rk0) obj;
                tp1.h0(u60Var, u60.class);
                tp1.h0(rk0Var, rk0.class);
                f30 f30Var2 = (f30) new lz(zyVar2, u60Var, z30Var2, new i10(), rk0Var, null, null).f6777z0.zzb();
                return f30Var2.a(f30Var2.b());
            default:
                tl0Var.f9185a = or0Var;
                tl0Var.f9186b = bundle;
                tl0Var.f9189h = new ep(kr0Var, fr0Var, this.f6981e, 6, 0);
                if (((Boolean) zzba.zzc().a(eg.f4015h3)).booleanValue() && (lr0Var = (lr0) obj) != null) {
                    tl0Var.f9188f = lr0Var;
                }
                if (((Boolean) zzba.zzc().a(eg.f4026i3)).booleanValue()) {
                    tl0Var.f9190q = gi0Var;
                }
                zy zyVar3 = ((zy) gyVar).f11340c;
                z30 z30Var3 = new z30(tl0Var);
                tp1.h0(u60Var, u60.class);
                f30 f30VarZzb = new oz(zyVar3, u60Var, z30Var3, new i10(), null, null).zzb();
                return f30VarZzb.a(f30VarZzb.b());
        }
    }

    public mj0(gy gyVar, tl0 tl0Var, u60 u60Var, lr0 lr0Var, tj0 tj0Var, gi0 gi0Var) {
        this.f6978b = gyVar;
        this.f6979c = tl0Var;
        this.f6980d = u60Var;
        this.f6983g = lr0Var;
        this.f6981e = tj0Var;
        this.f6982f = gi0Var;
    }

    public mj0(gy gyVar, tl0 tl0Var, rk0 rk0Var, u60 u60Var, tj0 tj0Var, gi0 gi0Var) {
        this.f6978b = gyVar;
        this.f6979c = tl0Var;
        this.f6983g = rk0Var;
        this.f6980d = u60Var;
        this.f6981e = tj0Var;
        this.f6982f = gi0Var;
    }
}
