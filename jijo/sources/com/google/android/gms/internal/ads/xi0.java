package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class xi0 implements ci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10561a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z10 f10562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f10565e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f10566f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f10567g;

    public xi0(z10 z10Var, Context context, Executor executor, kc0 kc0Var, or0 or0Var, gx0 gx0Var) {
        this.f10563c = context;
        this.f10562b = z10Var;
        this.f10566f = executor;
        this.f10564d = kc0Var;
        this.f10565e = or0Var;
        this.f10567g = gx0Var;
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final n5.a a(kr0 kr0Var, fr0 fr0Var) {
        switch (this.f10561a) {
            case 0:
                return ((q11) ((p21) this.f10564d)).b(new u30(this, kr0Var, fr0Var, 3));
            default:
                return tc1.q0(tc1.d0(null), new v20(this, kr0Var, fr0Var, 2), this.f10566f);
        }
    }

    @Override // com.google.android.gms.internal.ads.ci0
    public final boolean b(kr0 kr0Var, fr0 fr0Var) {
        switch (this.f10561a) {
            case 0:
                ak akVarA = ((or0) kr0Var.f6382a.f6060b).a();
                boolean zB = ((xi0) this.f10563c).b(kr0Var, fr0Var);
                if (((Boolean) zzba.zzc().a(eg.Za)).booleanValue()) {
                    cd0 cd0Var = (cd0) this.f10567g;
                    cd0Var.f3253a.put("has_dbl", akVarA != null ? "1" : "0");
                    cd0Var.f3253a.put("crdb", true == zB ? "1" : "0");
                }
                if (akVarA == null || !zB) {
                }
                break;
            default:
                ir0 ir0Var = fr0Var.f4636s;
                if (ir0Var == null || ir0Var.f5679a == null) {
                }
                break;
        }
        return false;
    }

    public xi0(z10 z10Var, xi0 xi0Var, m40 m40Var, ScheduledExecutorService scheduledExecutorService, mu muVar, cd0 cd0Var) {
        this.f10562b = z10Var;
        this.f10563c = xi0Var;
        this.f10565e = m40Var;
        this.f10566f = scheduledExecutorService;
        this.f10564d = muVar;
        this.f10567g = cd0Var;
    }
}
