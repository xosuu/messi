package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class wd0 implements od0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jp0 f10157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final br0 f10158c;

    public wd0(long j10, Context context, jp0 jp0Var, zy zyVar, String str) {
        this.f10156a = j10;
        this.f10157b = jp0Var;
        dz dzVar = new dz(zyVar.f11340c);
        context.getClass();
        dzVar.f3765b = context;
        dzVar.f3766c = str;
        this.f10158c = (br0) ((nh1) dzVar.a().f6080i).zzb();
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void a(zzl zzlVar) {
        try {
            this.f10158c.zzf(zzlVar, new td0(this));
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void zzc() {
        br0 br0Var = this.f10158c;
        try {
            br0Var.zzk(new ud0(this));
            br0Var.zzm(new a4.b(null));
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }
}
