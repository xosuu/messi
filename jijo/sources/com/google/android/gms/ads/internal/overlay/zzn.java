package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.internal.ads.q70;

/* JADX INFO: loaded from: classes.dex */
public final class zzn {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z9) {
        if (adOverlayInfoParcel.zzk != 4 || adOverlayInfoParcel.zzc != null) {
            Intent intent = new Intent();
            intent.setClassName(context, AdActivity.CLASS_NAME);
            intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.isClientJar);
            intent.putExtra("shouldCallOnOverlayOpened", z9);
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
            intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            com.google.android.gms.ads.internal.zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzT(context, intent);
            return;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
        q70 q70Var = adOverlayInfoParcel.zzu;
        if (q70Var != null) {
            q70Var.L();
        }
        Activity activityZzi = adOverlayInfoParcel.zzd.zzi();
        zzc zzcVar = adOverlayInfoParcel.zza;
        if (zzcVar != null && zzcVar.zzj && activityZzi != null) {
            context = activityZzi;
        }
        com.google.android.gms.ads.internal.zzu.zzh();
        zzc zzcVar2 = adOverlayInfoParcel.zza;
        zza.zzb(context, zzcVar2, adOverlayInfoParcel.zzi, zzcVar2 != null ? zzcVar2.zzi : null);
    }
}
