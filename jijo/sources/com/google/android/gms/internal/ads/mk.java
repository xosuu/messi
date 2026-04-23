package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzg;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class mk extends pb implements uj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnAdManagerAdViewLoadedListener f6991a;

    public mk(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener) {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        this.f6991a = onAdManagerAdViewLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        zzbu zzbuVarZzad = zzbt.zzad(parcel.readStrongBinder());
        a4.a aVarT = a4.b.t(parcel.readStrongBinder());
        qb.b(parcel);
        e1(zzbuVarZzad, aVarT);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.uj
    public final void e1(zzbu zzbuVar, a4.a aVar) {
        if (zzbuVar == null || aVar == null) {
            return;
        }
        AdManagerAdView adManagerAdView = new AdManagerAdView((Context) a4.b.a0(aVar));
        try {
            if (zzbuVar.zzi() instanceof zzg) {
                zzg zzgVar = (zzg) zzbuVar.zzi();
                adManagerAdView.setAdListener(zzgVar != null ? zzgVar.zzb() : null);
            }
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
        try {
            if (zzbuVar.zzj() instanceof zb) {
                zb zbVar = (zb) zzbuVar.zzj();
                adManagerAdView.setAppEventListener(zbVar != null ? zbVar.f11202a : null);
            }
        } catch (RemoteException e11) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
        }
        zzf.zza.post(new l0.a(this, adManagerAdView, zzbuVar, 13));
    }
}
