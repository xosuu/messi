package com.google.android.gms.ads.internal.client;

import a4.a;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.cs;
import com.google.android.gms.internal.ads.gq;
import com.google.android.gms.internal.ads.hq;
import com.google.android.gms.internal.ads.jl;
import com.google.android.gms.internal.ads.kl;
import com.google.android.gms.internal.ads.ll;
import com.google.android.gms.internal.ads.ml;
import com.google.android.gms.internal.ads.ms;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.ob;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.si;
import com.google.android.gms.internal.ads.ti;
import com.google.android.gms.internal.ads.tt;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.yi;
import com.google.android.gms.internal.ads.yp;
import com.google.android.gms.internal.ads.zi;
import com.google.android.gms.internal.ads.zp;

/* JADX INFO: loaded from: classes.dex */
public final class zzcc extends ob implements zzce {
    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbq zzb(a aVar, String str, rn rnVar, int i10) {
        zzbq zzboVar;
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        parcelM.writeString(str);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 3);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            zzboVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzboVar = iInterfaceQueryLocalInterface instanceof zzbq ? (zzbq) iInterfaceQueryLocalInterface : new zzbo(strongBinder);
        }
        parcelT.recycle();
        return zzboVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzc(a aVar, zzq zzqVar, String str, rn rnVar, int i10) {
        zzbu zzbsVar;
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzqVar);
        parcelM.writeString(str);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 13);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelT.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzd(a aVar, zzq zzqVar, String str, rn rnVar, int i10) {
        zzbu zzbsVar;
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzqVar);
        parcelM.writeString(str);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 1);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelT.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zze(a aVar, zzq zzqVar, String str, rn rnVar, int i10) {
        zzbu zzbsVar;
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzqVar);
        parcelM.writeString(str);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 2);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelT.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzbu zzf(a aVar, zzq zzqVar, String str, int i10) {
        zzbu zzbsVar;
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.c(parcelM, zzqVar);
        parcelM.writeString(str);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 10);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelT.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzco zzg(a aVar, int i10) {
        zzco zzcmVar;
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 9);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            zzcmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcmVar = iInterfaceQueryLocalInterface instanceof zzco ? (zzco) iInterfaceQueryLocalInterface : new zzcm(strongBinder);
        }
        parcelT.recycle();
        return zzcmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zzdj zzh(a aVar, rn rnVar, int i10) {
        zzdj zzdhVar;
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 17);
        IBinder strongBinder = parcelT.readStrongBinder();
        if (strongBinder == null) {
            zzdhVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdhVar = iInterfaceQueryLocalInterface instanceof zzdj ? (zzdj) iInterfaceQueryLocalInterface : new zzdh(strongBinder);
        }
        parcelT.recycle();
        return zzdhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ti zzi(a aVar, a aVar2) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.e(parcelM, aVar2);
        Parcel parcelT = t(parcelM, 5);
        ti tiVarZzdA = si.zzdA(parcelT.readStrongBinder());
        parcelT.recycle();
        return tiVarZzdA;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final zi zzj(a aVar, a aVar2, a aVar3) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.e(parcelM, aVar2);
        qb.e(parcelM, aVar3);
        Parcel parcelT = t(parcelM, 11);
        zi ziVarZze = yi.zze(parcelT.readStrongBinder());
        parcelT.recycle();
        return ziVarZze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ml zzk(a aVar, rn rnVar, int i10, jl jlVar) {
        ml klVar;
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        qb.e(parcelM, jlVar);
        Parcel parcelT = t(parcelM, 16);
        IBinder strongBinder = parcelT.readStrongBinder();
        int i11 = ll.f6654a;
        if (strongBinder == null) {
            klVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            klVar = iInterfaceQueryLocalInterface instanceof ml ? (ml) iInterfaceQueryLocalInterface : new kl(strongBinder);
        }
        parcelT.recycle();
        return klVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final aq zzl(a aVar, rn rnVar, int i10) {
        aq ypVar;
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 15);
        IBinder strongBinder = parcelT.readStrongBinder();
        int i11 = zp.f11287a;
        if (strongBinder == null) {
            ypVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            ypVar = iInterfaceQueryLocalInterface instanceof aq ? (aq) iInterfaceQueryLocalInterface : new yp(strongBinder);
        }
        parcelT.recycle();
        return ypVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final hq zzm(a aVar) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        Parcel parcelT = t(parcelM, 8);
        hq hqVarZzI = gq.zzI(parcelT.readStrongBinder());
        parcelT.recycle();
        return hqVarZzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final cs zzn(a aVar, rn rnVar, int i10) {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ns zzo(a aVar, String str, rn rnVar, int i10) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        parcelM.writeString(str);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 12);
        ns nsVarZzq = ms.zzq(parcelT.readStrongBinder());
        parcelT.recycle();
        return nsVarZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final ut zzp(a aVar, rn rnVar, int i10) {
        Parcel parcelM = m();
        qb.e(parcelM, aVar);
        qb.e(parcelM, rnVar);
        parcelM.writeInt(242402000);
        Parcel parcelT = t(parcelM, 14);
        ut utVarZzb = tt.zzb(parcelT.readStrongBinder());
        parcelT.recycle();
        return utVarZzb;
    }
}
