package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: loaded from: classes.dex */
public final class pp implements NativeCustomFormatAd.DisplayOpenMeasurement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gj f7937a;

    public pp(gj gjVar) {
        this.f7937a = gjVar;
        try {
            gjVar.zzm();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.f7937a.s1(new a4.b(view));
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.f7937a.zzt();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return false;
        }
    }
}
