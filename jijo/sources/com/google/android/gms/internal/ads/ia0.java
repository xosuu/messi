package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ia0 implements w40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n90 f5548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p90 f5549b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f5550d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f5551f;

    public ia0(n90 n90Var, o90 o90Var, Executor executor, mu muVar) {
        this.f5548a = n90Var;
        this.f5549b = o90Var;
        this.f5550d = executor;
        this.f5551f = muVar;
    }

    @Override // com.google.android.gms.internal.ads.w40
    public final void zzr() {
        n5.a aVar;
        if (this.f5549b.c()) {
            n90 n90Var = this.f5548a;
            zh0 zh0VarQ = n90Var.Q();
            if (zh0VarQ == null) {
                synchronized (n90Var) {
                    aVar = n90Var.f7210m;
                }
                if (aVar != null && ((Boolean) zzba.zzc().a(eg.H4)).booleanValue()) {
                    n5.a aVarS = n90Var.S();
                    qu quVarL = n90Var.L();
                    if (aVarS == null || quVarL == null) {
                        return;
                    }
                    tc1.u0(new z11(bz0.l(new n5.a[]{aVarS, quVarL}), false), new jp0(13, this), this.f5551f);
                    return;
                }
            }
            if (zh0VarQ != null) {
                fx fxVarN = n90Var.N();
                fx fxVarO = n90Var.O();
                if (fxVarN == null) {
                    fxVarN = fxVarO != null ? fxVarO : null;
                }
                if (fxVarN != null) {
                    this.f5550d.execute(new mx(fxVarN, 4));
                }
            }
        }
    }
}
