package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.hh;
import l3.f;
import n5.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        Object obj = com.google.android.gms.ads.internal.util.client.zzl.f2105b;
        if (((Boolean) hh.f5281a.k()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzl()) {
                    return;
                }
                a aVarZzb = new f(context).zzb();
                com.google.android.gms.ads.internal.util.client.zzm.zzi("Updating ad debug logging enablement.");
                b4.f.Z(aVarZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Fail to determine debug setting.", e10);
            }
        }
    }
}
