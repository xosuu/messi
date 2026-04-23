package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes.dex */
public final class sd0 implements od0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nl0 f8845b;

    public sd0(long j10, Context context, jp0 jp0Var, zy zyVar, String str) {
        this.f8844a = j10;
        gz gzVar = new gz(zyVar.f11340c);
        context.getClass();
        gzVar.f5113b = context;
        gzVar.f5115d = new zzq();
        str.getClass();
        gzVar.f5114c = str;
        nl0 nl0Var = (nl0) ((nh1) gzVar.a().f100h).zzb();
        this.f8845b = nl0Var;
        nl0Var.zzD(new rd0(this, jp0Var));
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void a(zzl zzlVar) {
        this.f8845b.zzab(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zza() {
        this.f8845b.zzx();
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzc() {
        this.f8845b.zzW(new a4.b(null));
    }
}
