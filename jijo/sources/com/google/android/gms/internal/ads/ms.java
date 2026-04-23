package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdc;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes.dex */
public abstract class ms extends pb implements ns {
    public ms() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static ns zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return iInterfaceQueryLocalInterface instanceof ns ? (ns) iInterfaceQueryLocalInterface : new ls(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z9;
        us ssVar = null;
        us ssVar2 = null;
        vs vsVar = null;
        qs osVar = null;
        switch (i10) {
            case 1:
                zzl zzlVar = (zzl) qb.a(parcel, zzl.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    ssVar = iInterfaceQueryLocalInterface instanceof us ? (us) iInterfaceQueryLocalInterface : new ss(strongBinder);
                }
                qb.b(parcel);
                zzf(zzlVar, ssVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    osVar = iInterfaceQueryLocalInterface2 instanceof qs ? (qs) iInterfaceQueryLocalInterface2 : new os(strongBinder2, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                }
                qb.b(parcel);
                zzk(osVar);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                ClassLoader classLoader = qb.f8146a;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 4:
                String strZze = zze();
                parcel2.writeNoException();
                parcel2.writeString(strZze);
                return true;
            case 5:
                a4.a aVarT = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zzm(aVarT);
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    vsVar = iInterfaceQueryLocalInterface3 instanceof vs ? (vs) iInterfaceQueryLocalInterface3 : new vs(strongBinder3, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                }
                qb.b(parcel);
                zzp(vsVar);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbwu zzbwuVar = (zzbwu) qb.a(parcel, zzbwu.CREATOR);
                qb.b(parcel);
                zzl(zzbwuVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzdd zzddVarZzb = zzdc.zzb(parcel.readStrongBinder());
                qb.b(parcel);
                zzi(zzddVarZzb);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleZzb = zzb();
                parcel2.writeNoException();
                qb.d(parcel2, bundleZzb);
                return true;
            case 10:
                a4.a aVarT2 = a4.b.t(parcel.readStrongBinder());
                ClassLoader classLoader2 = qb.f8146a;
                z9 = parcel.readInt() != 0;
                qb.b(parcel);
                zzn(aVarT2, z9);
                parcel2.writeNoException();
                return true;
            case 11:
                ks ksVarZzd = zzd();
                parcel2.writeNoException();
                qb.e(parcel2, ksVarZzd);
                return true;
            case 12:
                zzdn zzdnVarZzc = zzc();
                parcel2.writeNoException();
                qb.e(parcel2, zzdnVarZzc);
                return true;
            case 13:
                zzdg zzdgVarZzb = zzdf.zzb(parcel.readStrongBinder());
                qb.b(parcel);
                zzj(zzdgVarZzb);
                parcel2.writeNoException();
                return true;
            case 14:
                zzl zzlVar2 = (zzl) qb.a(parcel, zzl.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    ssVar2 = iInterfaceQueryLocalInterface4 instanceof us ? (us) iInterfaceQueryLocalInterface4 : new ss(strongBinder4);
                }
                qb.b(parcel);
                zzg(zzlVar2, ssVar2);
                parcel2.writeNoException();
                return true;
            case 15:
                ClassLoader classLoader3 = qb.f8146a;
                z9 = parcel.readInt() != 0;
                qb.b(parcel);
                zzh(z9);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
