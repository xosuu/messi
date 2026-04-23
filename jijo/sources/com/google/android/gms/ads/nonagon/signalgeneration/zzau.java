package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.jh1;
import com.google.android.gms.internal.ads.nu;
import com.google.android.gms.internal.ads.qh1;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.ts0;
import com.google.android.gms.internal.ads.v30;
import com.google.android.gms.internal.ads.w70;
import com.google.android.gms.internal.ads.ws0;
import com.google.android.gms.internal.ads.xs0;
import g4.c;
import java.util.concurrent.TimeUnit;
import k.q;

/* JADX INFO: loaded from: classes.dex */
public final class zzau implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f2387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f2388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f2389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f2390d;

    public zzau(qh1 qh1Var, qh1 qh1Var2, qh1 qh1Var3, qh1 qh1Var4) {
        this.f2387a = qh1Var;
        this.f2388b = qh1Var2;
        this.f2389c = qh1Var3;
        this.f2390d = qh1Var4;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final /* bridge */ /* synthetic */ Object zzb() {
        xs0 xs0Var = (xs0) this.f2387a.zzb();
        zzaw zzawVarZzb = ((zzax) this.f2388b).zzb();
        c cVarZzb = ((v30) this.f2389c).zzb();
        w70 w70Var = (w70) this.f2390d.zzb();
        ts0 ts0VarD = xs0Var.b(cVarZzb.e(), ws0.H).l(zzawVarZzb).q(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.U4)).intValue(), TimeUnit.SECONDS).d();
        tc1.u0(ts0VarD, new q(20, w70Var), nu.f7383a);
        return ts0VarD;
    }
}
