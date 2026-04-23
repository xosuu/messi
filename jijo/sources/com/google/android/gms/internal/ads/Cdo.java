package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.do, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public abstract class Cdo extends pb implements eo {
    public Cdo() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 2:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 3:
                List listZzv = zzv();
                parcel2.writeNoException();
                parcel2.writeList(listZzv);
                return true;
            case 4:
                String strZzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(strZzq);
                return true;
            case 5:
                pi piVarZzl = zzl();
                parcel2.writeNoException();
                qb.e(parcel2, piVarZzl);
                return true;
            case 6:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 7:
                String strZzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(strZzp);
                return true;
            case 8:
                double dZze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(dZze);
                return true;
            case 9:
                String strZzu = zzu();
                parcel2.writeNoException();
                parcel2.writeString(strZzu);
                return true;
            case 10:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzdq zzdqVarZzj = zzj();
                parcel2.writeNoException();
                qb.e(parcel2, zzdqVarZzj);
                return true;
            case 12:
                parcel2.writeNoException();
                qb.e(parcel2, null);
                return true;
            case 13:
                a4.a aVarZzm = zzm();
                parcel2.writeNoException();
                qb.e(parcel2, aVarZzm);
                return true;
            case 14:
                a4.a aVarZzn = zzn();
                parcel2.writeNoException();
                qb.e(parcel2, aVarZzn);
                return true;
            case 15:
                a4.a aVarZzo = zzo();
                parcel2.writeNoException();
                qb.e(parcel2, aVarZzo);
                return true;
            case 16:
                Bundle bundleZzi = zzi();
                parcel2.writeNoException();
                qb.d(parcel2, bundleZzi);
                return true;
            case 17:
                boolean zZzB = zzB();
                parcel2.writeNoException();
                ClassLoader classLoader = qb.f8146a;
                parcel2.writeInt(zZzB ? 1 : 0);
                return true;
            case 18:
                boolean zZzA = zzA();
                parcel2.writeNoException();
                ClassLoader classLoader2 = qb.f8146a;
                parcel2.writeInt(zZzA ? 1 : 0);
                return true;
            case 19:
                zzx();
                parcel2.writeNoException();
                return true;
            case 20:
                a4.a aVarT = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                d0(aVarT);
                parcel2.writeNoException();
                return true;
            case sf.zzm /* 21 */:
                a4.a aVarT2 = a4.b.t(parcel.readStrongBinder());
                a4.a aVarT3 = a4.b.t(parcel.readStrongBinder());
                a4.a aVarT4 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                c1(aVarT2, aVarT3, aVarT4);
                parcel2.writeNoException();
                return true;
            case 22:
                a4.a aVarT5 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                T0(aVarT5);
                parcel2.writeNoException();
                return true;
            case 23:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 25:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            default:
                return false;
        }
    }
}
