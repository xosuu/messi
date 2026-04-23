package com.google.android.gms.ads.internal.client;

import a4.a;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.zl;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzey extends zzcn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zl f2047a;

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final float zze() {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z9) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzk() {
        com.google.android.gms.ads.internal.util.client.zzm.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzex
            @Override // java.lang.Runnable
            public final void run() {
                zl zlVar = this.zza.f2047a;
                if (zlVar != null) {
                    try {
                        zlVar.r0(Collections.emptyList());
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not notify onComplete event.", e10);
                    }
                }
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzl(String str, a aVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(zzda zzdaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzn(a aVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(rn rnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzp(boolean z9) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzq(float f10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzr(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zl zlVar) {
        this.f2047a = zlVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(zzff zzffVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final boolean zzv() {
        return false;
    }
}
