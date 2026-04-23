package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.ks0;
import com.google.android.gms.internal.ads.nh;
import com.google.android.gms.internal.ads.px0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zze extends com.google.android.gms.ads.internal.util.client.zzm {
    public static void zza(String str) {
        if (!zzc() || str == null || str.length() <= 4000) {
            return;
        }
        ks0 ks0Var = com.google.android.gms.ads.internal.util.client.zzm.f2110a;
        Iterator itF = ((px0) ks0Var.f6384a).f(ks0Var, str);
        while (itF.hasNext()) {
        }
    }

    public static void zzb(String str, Throwable th) {
        zzc();
    }

    public static boolean zzc() {
        return com.google.android.gms.ads.internal.util.client.zzm.zzm(2) && ((Boolean) nh.f7263a.k()).booleanValue();
    }
}
