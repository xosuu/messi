package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ki extends NativeAd.AdChoicesInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6297a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6298b;

    public ki(ji jiVar) {
        IBinder iBinder;
        try {
            this.f6298b = jiVar.zzg();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            this.f6298b = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        try {
            for (Object obj : jiVar.zzh()) {
                pi oiVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    oiVar = iInterfaceQueryLocalInterface instanceof pi ? (pi) iInterfaceQueryLocalInterface : new oi(iBinder);
                }
                if (oiVar != null) {
                    this.f6297a.add(new qi(oiVar));
                }
            }
        } catch (RemoteException e11) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List getImages() {
        return this.f6297a;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.f6298b;
    }
}
