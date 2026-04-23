package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class co0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3351a;

    public co0() {
        this.f3351a = 1;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        switch (this.f3351a) {
            case 0:
                return 52;
            case 1:
                return 47;
            default:
                return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        switch (this.f3351a) {
            case 0:
                return tc1.d0(new gm0(2));
            case 1:
                m21 m21VarD0 = tc1.d0(null);
                if (((Boolean) zzba.zzc().a(eg.f4028i5)).booleanValue()) {
                    m21VarD0 = tc1.d0(null);
                }
                m21 m21VarD02 = tc1.d0(null);
                wz0 wz0VarL = bz0.l(new n5.a[]{m21VarD0, m21VarD02});
                mg0 mg0Var = new mg0(m21VarD0, m21VarD02, 1);
                mu muVar = nu.f7383a;
                c21 c21Var = new c21(wz0VarL, true, false);
                c21Var.B = new b21(c21Var, mg0Var, muVar);
                c21Var.w();
                return c21Var;
            default:
                return tc1.d0(new gm0(5));
        }
    }

    public /* synthetic */ co0(int i10) {
        this.f3351a = i10;
    }
}
