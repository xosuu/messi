package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class oc extends AppOpenAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rc f7554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pc f7556c = new pc("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FullScreenContentCallback f7557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnPaidEventListener f7558e;

    public oc(rc rcVar, String str) {
        this.f7554a = rcVar;
        this.f7555b = str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        return this.f7555b;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f7557d;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f7558e;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVarZzf;
        try {
            zzdnVarZzf = this.f7554a.zzf();
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
            zzdnVarZzf = null;
        }
        return ResponseInfo.zzb(zzdnVarZzf);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f7557d = fullScreenContentCallback;
        this.f7556c.f7852a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z9) {
        try {
            this.f7554a.x(z9);
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f7558e = onPaidEventListener;
        try {
            this.f7554a.a1(new zzfe(onPaidEventListener));
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(Activity activity) {
        try {
            this.f7554a.V(new a4.b(activity), this.f7556c);
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }
}
