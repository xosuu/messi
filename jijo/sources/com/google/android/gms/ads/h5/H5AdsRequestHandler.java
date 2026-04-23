package com.google.android.gms.ads.h5;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.ml;
import com.google.android.gms.internal.ads.pn;
import com.google.android.gms.internal.ads.ur0;

/* JADX INFO: loaded from: classes.dex */
public final class H5AdsRequestHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ur0 f1936a;

    public H5AdsRequestHandler(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        this.f1936a = new ur0(context, onH5AdsEventListener);
    }

    public void clearAdObjects() {
        this.f1936a.Q();
    }

    public boolean handleH5AdsRequest(String str) {
        ur0 ur0Var = this.f1936a;
        ur0Var.getClass();
        if (!ur0.R(str)) {
            return false;
        }
        if (((ml) ur0Var.f9602f) == null) {
            ur0Var.f9602f = zzay.zza().zzl((Context) ur0Var.f9600b, new pn(), (OnH5AdsEventListener) ur0Var.f9601d);
        }
        ml mlVar = (ml) ur0Var.f9602f;
        if (mlVar == null) {
            return false;
        }
        try {
            mlVar.zzf(str);
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
        return true;
    }

    public boolean shouldInterceptRequest(String str) {
        return ur0.R(str);
    }
}
