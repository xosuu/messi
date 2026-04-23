package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class op extends NativeAd.AdChoicesInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7629a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7630b;

    public op(ji jiVar) {
        try {
            this.f7630b = jiVar.zzg();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            this.f7630b = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            for (Object obj : jiVar.zzh()) {
                pi piVarU1 = obj instanceof IBinder ? fi.u1((IBinder) obj) : null;
                if (piVarU1 != null) {
                    this.f7629a.add(new qp(piVarU1));
                }
            }
        } catch (RemoteException e11) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.f7629a;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f7630b;
    }
}
