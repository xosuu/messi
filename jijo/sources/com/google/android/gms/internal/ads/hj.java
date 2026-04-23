package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class hj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gj f5309a;

    public hj(gj gjVar) {
        Context context;
        this.f5309a = gjVar;
        try {
            context = (Context) a4.b.a0(gjVar.zzh());
        } catch (RemoteException | NullPointerException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            context = null;
        }
        if (context != null) {
            try {
                this.f5309a.n(new a4.b(new MediaView(context)));
            } catch (RemoteException e11) {
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
            }
        }
    }
}
