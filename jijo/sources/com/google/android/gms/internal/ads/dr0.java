package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzr;

/* JADX INFO: loaded from: classes.dex */
public final class dr0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3723a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f3724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f3725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f3726d;

    public dr0(jy jyVar, ry ryVar, nh1 nh1Var) {
        this.f3724b = jyVar;
        this.f3725c = ryVar;
        this.f3726d = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        fn fnVar;
        switch (this.f3723a) {
            case 0:
                return new cr0((yq0) this.f3724b.zzb(), (wq0) this.f3725c.zzb(), (lr0) this.f3726d.zzb());
            case 1:
                Context contextA = ((jy) this.f3724b).a();
                VersionInfoParcel versionInfoParcelA = ((ry) this.f3725c).a();
                gt0 gt0Var = (gt0) this.f3726d.zzb();
                synchronized (new Object()) {
                    Context applicationContext = contextA.getApplicationContext();
                    if (applicationContext != null) {
                        contextA = applicationContext;
                    }
                    fnVar = new fn(contextA, versionInfoParcelA, (String) zzba.zzc().a(eg.f3933a), gt0Var);
                    break;
                }
                return fnVar;
            case 2:
                return new gt0(((jy) this.f3724b).a(), ((ry) this.f3725c).a(), (qc0) this.f3726d.zzb(), new pe(17));
            default:
                Context contextA2 = ((jy) this.f3724b).a();
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                return new vt0(contextA2, muVar, (zzr) this.f3725c.zzb(), (gt0) this.f3726d.zzb());
        }
    }

    public dr0(jy jyVar, ry ryVar, nh1 nh1Var, int i10) {
        this.f3724b = jyVar;
        this.f3725c = ryVar;
        this.f3726d = nh1Var;
    }

    public dr0(jy jyVar, nh1 nh1Var, nh1 nh1Var2) {
        this.f3724b = jyVar;
        this.f3725c = nh1Var;
        this.f3726d = nh1Var2;
    }

    public dr0(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3) {
        this.f3724b = nh1Var;
        this.f3725c = nh1Var2;
        this.f3726d = nh1Var3;
    }
}
