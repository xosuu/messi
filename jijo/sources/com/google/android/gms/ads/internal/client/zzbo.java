package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.fm;
import com.google.android.gms.internal.ads.jj;
import com.google.android.gms.internal.ads.lj;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.oj;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rj;
import com.google.android.gms.internal.ads.uj;
import com.google.android.gms.internal.ads.xj;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzblh;

/* JADX INFO: loaded from: classes.dex */
public final class zzbo extends ob implements zzbq {
    public zzbo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final zzbn zze() {
        zzbn zzblVar;
        Parcel parcelT = t(m(), 1);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            zzblVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzblVar = iInterfaceQueryLocalInterface instanceof zzbn ? (zzbn) iInterfaceQueryLocalInterface : new zzbl(strongBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
        }
        parcelT.recycle();
        return zzblVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzf(jj jjVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzg(lj ljVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzh(String str, rj rjVar, oj ojVar) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        qb.e(parcelM, rjVar);
        qb.e(parcelM, ojVar);
        a0(parcelM, 5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzi(fm fmVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzj(uj ujVar, zzq zzqVar) {
        Parcel parcelM = m();
        qb.e(parcelM, ujVar);
        qb.c(parcelM, zzqVar);
        a0(parcelM, 8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzk(xj xjVar) {
        Parcel parcelM = m();
        qb.e(parcelM, xjVar);
        a0(parcelM, 10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzl(zzbh zzbhVar) {
        Parcel parcelM = m();
        qb.e(parcelM, zzbhVar);
        a0(parcelM, 2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        Parcel parcelM = m();
        qb.c(parcelM, adManagerAdViewOptions);
        a0(parcelM, 15);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzn(zzblh zzblhVar) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzo(zzbes zzbesVar) {
        Parcel parcelM = m();
        qb.c(parcelM, zzbesVar);
        a0(parcelM, 6);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbq
    public final void zzq(zzcf zzcfVar) {
        throw null;
    }
}
