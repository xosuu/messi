package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import b4.d;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class zzq {
    public static Context zza(Context context) throws zzp {
        try {
            return d.c(context, d.f1312b, ModuleDescriptor.MODULE_ID).f1324a;
        } catch (Exception e10) {
            throw new zzp(e10);
        }
    }

    public static Object zzb(Context context, String str, zzo zzoVar) throws zzp {
        try {
            try {
                return zzoVar.zza(d.c(context, d.f1312b, ModuleDescriptor.MODULE_ID).b(str));
            } catch (Exception e10) {
                throw new zzp(e10);
            }
        } catch (Exception e11) {
            throw new zzp(e11);
        }
    }
}
