package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class js0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f6070a = new HashMap();

    public final is0 a(cs0 cs0Var, Context context, zr0 zr0Var, aa aaVar) {
        zzfhb zzfhbVar;
        HashMap map = this.f6070a;
        is0 is0Var = (is0) map.get(cs0Var);
        if (is0Var != null) {
            return is0Var;
        }
        if (cs0Var == cs0.f3406a) {
            zzfhbVar = new zzfhb(context, cs0Var, ((Integer) zzba.zzc().a(eg.I5)).intValue(), ((Integer) zzba.zzc().a(eg.O5)).intValue(), ((Integer) zzba.zzc().a(eg.Q5)).intValue(), (String) zzba.zzc().a(eg.S5), (String) zzba.zzc().a(eg.K5), (String) zzba.zzc().a(eg.M5));
        } else if (cs0Var == cs0.f3407b) {
            zzfhbVar = new zzfhb(context, cs0Var, ((Integer) zzba.zzc().a(eg.J5)).intValue(), ((Integer) zzba.zzc().a(eg.P5)).intValue(), ((Integer) zzba.zzc().a(eg.R5)).intValue(), (String) zzba.zzc().a(eg.T5), (String) zzba.zzc().a(eg.L5), (String) zzba.zzc().a(eg.N5));
        } else if (cs0Var == cs0.f3408d) {
            zzfhbVar = new zzfhb(context, cs0Var, ((Integer) zzba.zzc().a(eg.W5)).intValue(), ((Integer) zzba.zzc().a(eg.Y5)).intValue(), ((Integer) zzba.zzc().a(eg.Z5)).intValue(), (String) zzba.zzc().a(eg.U5), (String) zzba.zzc().a(eg.V5), (String) zzba.zzc().a(eg.X5));
        } else {
            zzfhbVar = null;
        }
        ep epVar = new ep(zzfhbVar);
        is0 is0Var2 = new is0(epVar, new ms0(epVar, zr0Var, aaVar));
        map.put(cs0Var, is0Var2);
        return is0Var2;
    }
}
