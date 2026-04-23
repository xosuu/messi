package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.hd0;
import com.google.android.gms.internal.ads.jh1;
import com.google.android.gms.internal.ads.jy;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.nu;
import com.google.android.gms.internal.ads.qh1;
import com.google.android.gms.internal.ads.tp1;

/* JADX INFO: loaded from: classes.dex */
public final class zzh implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f2412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f2413b;

    public zzh(qh1 qh1Var, qh1 qh1Var2, qh1 qh1Var3) {
        this.f2412a = qh1Var;
        this.f2413b = qh1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context contextA = ((jy) this.f2412a).a();
        hd0 hd0Var = (hd0) this.f2413b.zzb();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new zze(contextA, hd0Var, muVar);
    }
}
