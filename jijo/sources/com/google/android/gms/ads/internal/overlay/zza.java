package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.eg;

/* JADX INFO: loaded from: classes.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzaa zzaaVar, zzy zzyVar, boolean z9) {
        int iZzm;
        if (z9) {
            try {
                iZzm = com.google.android.gms.ads.internal.zzu.zzp().zzm(context, intent.getData());
                if (zzaaVar != null) {
                    zzaaVar.zzg();
                }
            } catch (ActivityNotFoundException e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj(e10.getMessage());
                iZzm = 6;
            }
            if (zzyVar != null) {
                zzyVar.zzb(iZzm);
            }
            return iZzm == 5;
        }
        try {
            com.google.android.gms.ads.internal.util.zze.zza("Launching an intent: " + intent.toURI());
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzT(context, intent);
            if (zzaaVar != null) {
                zzaaVar.zzg();
            }
            if (zzyVar != null) {
                zzyVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e11) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj(e11.getMessage());
            if (zzyVar != null) {
                zzyVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzaa zzaaVar, zzy zzyVar) {
        int i10 = 0;
        if (zzcVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("No intent data for launcher overlay.");
            return false;
        }
        eg.a(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzaaVar, zzyVar, zzcVar.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.zzb)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(zzcVar.zzc)) {
            intent2.setData(Uri.parse(zzcVar.zzb));
        } else {
            String str = zzcVar.zzb;
            intent2.setDataAndType(Uri.parse(str), zzcVar.zzc);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.zzd)) {
            intent2.setPackage(zzcVar.zzd);
        }
        if (!TextUtils.isEmpty(zzcVar.zze)) {
            String[] strArrSplit = zzcVar.zze.split("/", 2);
            if (strArrSplit.length < 2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(zzcVar.zze)));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str2 = zzcVar.zzf;
        if (!TextUtils.isEmpty(str2)) {
            try {
                i10 = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        if (((Boolean) zzba.zzc().a(eg.f3938a4)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzba.zzc().a(eg.Z3)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzo(context, intent2);
            }
        }
        return zza(context, intent2, zzaaVar, zzyVar, zzcVar.zzj);
    }
}
