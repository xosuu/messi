package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class pq0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f7953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f7954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f7955c;

    public pq0(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3) {
        this.f7953a = nh1Var;
        this.f7954b = nh1Var2;
        this.f7955c = nh1Var3;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final nq0 zzb() {
        Context context = (Context) this.f7953a.zzb();
        zr0 zr0Var = (zr0) this.f7954b.zzb();
        js0 js0Var = (js0) this.f7955c.zzb();
        cu cuVarZzh = ((Boolean) zzba.zzc().a(eg.G5)).booleanValue() ? zzu.zzo().d().zzh() : zzu.zzo().d().zzi();
        boolean z9 = false;
        if (cuVarZzh != null && cuVarZzh.f3449j) {
            z9 = true;
        }
        if (((Integer) zzba.zzc().a(eg.I5)).intValue() > 0) {
            if (!((Boolean) zzba.zzc().a(eg.F5)).booleanValue() || z9) {
                is0 is0VarA = js0Var.a(cs0.f3406a, context, zr0Var, new aa(24, new zp0()));
                hq0 hq0Var = new hq0(new gq0());
                mu muVar = nu.f7383a;
                ep epVar = is0VarA.f5683a;
                return new tl0(hq0Var, new eq0(epVar, muVar), is0VarA.f5684b, ((zzfhb) epVar.f4270d).f11622s, muVar);
            }
        }
        return new gq0();
    }
}
