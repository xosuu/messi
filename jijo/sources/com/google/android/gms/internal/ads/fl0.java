package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbm;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes.dex */
public final class fl0 extends zzbm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ep f4570a;

    public fl0(Context context, gy gyVar, nr0 nr0Var, r90 r90Var, zzbh zzbhVar) {
        ep epVar = new ep(r90Var, (ed0) ((zy) gyVar).f11377y.zzb());
        ((kl0) epVar.f4270d).f6311a.set(zzbhVar);
        tl0 tl0Var = new tl0();
        tl0Var.f9186b = gyVar;
        tl0Var.f9187d = context;
        tl0Var.f9188f = epVar;
        tl0Var.f9185a = nr0Var;
        tl0Var.f9189h = gyVar.d();
        nr0Var.f7375r = (kl0) epVar.f4270d;
        this.f4570a = new ep(tl0Var, nr0Var.f7360c);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zze() {
        return this.f4570a.c();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        return this.f4570a.i();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzlVar) {
        this.f4570a.s(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzh(zzl zzlVar, int i10) {
        this.f4570a.s(zzlVar, i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzi() {
        return this.f4570a.v();
    }
}
