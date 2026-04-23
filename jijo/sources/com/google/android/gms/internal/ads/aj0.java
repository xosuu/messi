package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aj0 extends gs implements c50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public hs f2697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v3.d0 f2698b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fk0 f2699d;

    @Override // com.google.android.gms.internal.ads.hs
    public final synchronized void B() {
        hs hsVar = this.f2697a;
        if (hsVar != null) {
            ((gk0) hsVar).f4940d.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.hs
    public final synchronized void L(a4.a aVar) {
        hs hsVar = this.f2697a;
        if (hsVar != null) {
            ((gk0) hsVar).f4941f.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.hs
    public final synchronized void S0(a4.a aVar) {
        v3.d0 d0Var = this.f2698b;
        if (d0Var != null) {
            d0Var.j();
        }
    }

    @Override // com.google.android.gms.internal.ads.hs
    public final synchronized void c0(a4.a aVar) {
        hs hsVar = this.f2697a;
        if (hsVar != null) {
            hsVar.c0(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.hs
    public final synchronized void f0(a4.a aVar, zzbvz zzbvzVar) {
        hs hsVar = this.f2697a;
        if (hsVar != null) {
            ((gk0) hsVar).f4941f.e0(zzbvzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.hs
    public final synchronized void g1(a4.a aVar) {
        fk0 fk0Var = this.f2699d;
        if (fk0Var != null) {
            Executor executor = fk0Var.f4569d.f10917c;
            fi0 fi0Var = fk0Var.f4568c;
            executor.execute(new fd(fk0Var, fk0Var.f4566a, fk0Var.f4567b, fi0Var, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.hs
    public final synchronized void k0() {
        fk0 fk0Var = this.f2699d;
        if (fk0Var != null) {
            zzm.zzj("Fail to initialize adapter ".concat(String.valueOf(fk0Var.f4568c.f4534a)));
        }
    }

    @Override // com.google.android.gms.internal.ads.c50
    public final synchronized void t(v3.d0 d0Var) {
        this.f2698b = d0Var;
    }

    @Override // com.google.android.gms.internal.ads.hs
    public final synchronized void w0(a4.a aVar) {
        hs hsVar = this.f2697a;
        if (hsVar != null) {
            ((gk0) hsVar).f4940d.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.hs
    public final synchronized void zze(a4.a aVar) {
        hs hsVar = this.f2697a;
        if (hsVar != null) {
            ((gk0) hsVar).f4939b.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.hs
    public final synchronized void zzg(a4.a aVar, int i10) {
        v3.d0 d0Var = this.f2698b;
        if (d0Var != null) {
            d0Var.f(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.hs
    public final synchronized void zzj(a4.a aVar) {
        hs hsVar = this.f2697a;
        if (hsVar != null) {
            ((gk0) hsVar).f4938a.zzdr();
        }
    }
}
