package com.google.android.gms.ads.internal.util;

import android.content.Context;
import c.a;
import com.google.android.gms.internal.ads.bw0;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.h7;
import com.google.android.gms.internal.ads.i7;
import com.google.android.gms.internal.ads.j7;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.s7;
import com.google.android.gms.internal.ads.zzapq;
import java.io.File;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends rk0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f2133f;

    public zzaz(Context context) {
        this.f2133f = context;
    }

    public static j7 zzb(Context context) {
        zzaz zzazVar = new zzaz(context);
        File cacheDir = context.getCacheDir();
        int i10 = bw0.f3121a;
        j7 j7Var = new j7(new s7(new File(new File(cacheDir, "admob_volley").getPath())), zzazVar);
        j7Var.c();
        return j7Var;
    }

    @Override // com.google.android.gms.internal.ads.rk0, com.google.android.gms.internal.ads.f7
    public final h7 zza(i7 i7Var) throws zzapq {
        if (i7Var.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(eg.X3), i7Var.zzk())) {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                Context context = this.f2133f;
                if (com.google.android.gms.ads.internal.util.client.zzf.zzt(context, 13400000)) {
                    h7 h7VarZza = new a(context).zza(i7Var);
                    if (h7VarZza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(i7Var.zzk())));
                        return h7VarZza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(i7Var.zzk())));
                }
            }
        }
        return super.zza(i7Var);
    }
}
