package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class zzcx implements MuteThisAdReason {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzcw f1978b;

    public zzcx(zzcw zzcwVar) {
        String strZze;
        this.f1978b = zzcwVar;
        try {
            strZze = zzcwVar.zze();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            strZze = null;
        }
        this.f1977a = strZze;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.f1977a;
    }

    public final String toString() {
        return this.f1977a;
    }

    public final zzcw zza() {
        return this.f1978b;
    }
}
