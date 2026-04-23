package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class dw extends zzb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pv f3756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lw f3757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f3759e;

    public dw(pv pvVar, lw lwVar, String str, String[] strArr) {
        this.f3756b = pvVar;
        this.f3757c = lwVar;
        this.f3758d = str;
        this.f3759e = strArr;
        zzu.zzy().f4313a.add(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        int i10 = 13;
        try {
            this.f3757c.s(this.f3758d, this.f3759e);
        } finally {
            zzt.zza.post(new s9(i10, this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final n5.a zzb() {
        return (((Boolean) zzba.zzc().a(eg.M1)).booleanValue() && (this.f3757c instanceof qw)) ? nu.f7387e.b(new du(1, this)) : super.zzb();
    }
}
