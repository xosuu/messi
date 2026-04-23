package com.google.android.gms.ads.internal.client;

import a4.a;
import a4.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.aq;
import com.google.android.gms.internal.ads.cs;
import com.google.android.gms.internal.ads.hq;
import com.google.android.gms.internal.ads.il;
import com.google.android.gms.internal.ads.jl;
import com.google.android.gms.internal.ads.ml;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.pn;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.ti;
import com.google.android.gms.internal.ads.ut;
import com.google.android.gms.internal.ads.zi;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcd extends pb implements zzce {
    public zzcd() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        jl ilVar = null;
        switch (i10) {
            case 1:
                a aVarT = b.t(parcel.readStrongBinder());
                zzq zzqVar = (zzq) qb.a(parcel, zzq.CREATOR);
                String string = parcel.readString();
                rn rnVarU1 = pn.u1(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                qb.b(parcel);
                zzbu zzbuVarZzd = zzd(aVarT, zzqVar, string, rnVarU1, i11);
                parcel2.writeNoException();
                qb.e(parcel2, zzbuVarZzd);
                return true;
            case 2:
                a aVarT2 = b.t(parcel.readStrongBinder());
                zzq zzqVar2 = (zzq) qb.a(parcel, zzq.CREATOR);
                String string2 = parcel.readString();
                rn rnVarU12 = pn.u1(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                qb.b(parcel);
                zzbu zzbuVarZze = zze(aVarT2, zzqVar2, string2, rnVarU12, i12);
                parcel2.writeNoException();
                qb.e(parcel2, zzbuVarZze);
                return true;
            case 3:
                a aVarT3 = b.t(parcel.readStrongBinder());
                String string3 = parcel.readString();
                rn rnVarU13 = pn.u1(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                qb.b(parcel);
                zzbq zzbqVarZzb = zzb(aVarT3, string3, rnVarU13, i13);
                parcel2.writeNoException();
                qb.e(parcel2, zzbqVarZzb);
                return true;
            case 4:
                b.t(parcel.readStrongBinder());
                qb.b(parcel);
                parcel2.writeNoException();
                qb.e(parcel2, null);
                return true;
            case 5:
                a aVarT4 = b.t(parcel.readStrongBinder());
                a aVarT5 = b.t(parcel.readStrongBinder());
                qb.b(parcel);
                ti tiVarZzi = zzi(aVarT4, aVarT5);
                parcel2.writeNoException();
                qb.e(parcel2, tiVarZzi);
                return true;
            case 6:
                a aVarT6 = b.t(parcel.readStrongBinder());
                rn rnVarU14 = pn.u1(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                qb.b(parcel);
                cs csVarZzn = zzn(aVarT6, rnVarU14, i14);
                parcel2.writeNoException();
                qb.e(parcel2, csVarZzn);
                return true;
            case 7:
                b.t(parcel.readStrongBinder());
                qb.b(parcel);
                parcel2.writeNoException();
                qb.e(parcel2, null);
                return true;
            case 8:
                a aVarT7 = b.t(parcel.readStrongBinder());
                qb.b(parcel);
                hq hqVarZzm = zzm(aVarT7);
                parcel2.writeNoException();
                qb.e(parcel2, hqVarZzm);
                return true;
            case 9:
                a aVarT8 = b.t(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                qb.b(parcel);
                zzco zzcoVarZzg = zzg(aVarT8, i15);
                parcel2.writeNoException();
                qb.e(parcel2, zzcoVarZzg);
                return true;
            case 10:
                a aVarT9 = b.t(parcel.readStrongBinder());
                zzq zzqVar3 = (zzq) qb.a(parcel, zzq.CREATOR);
                String string4 = parcel.readString();
                int i16 = parcel.readInt();
                qb.b(parcel);
                zzbu zzbuVarZzf = zzf(aVarT9, zzqVar3, string4, i16);
                parcel2.writeNoException();
                qb.e(parcel2, zzbuVarZzf);
                return true;
            case 11:
                a aVarT10 = b.t(parcel.readStrongBinder());
                a aVarT11 = b.t(parcel.readStrongBinder());
                a aVarT12 = b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zi ziVarZzj = zzj(aVarT10, aVarT11, aVarT12);
                parcel2.writeNoException();
                qb.e(parcel2, ziVarZzj);
                return true;
            case 12:
                a aVarT13 = b.t(parcel.readStrongBinder());
                String string5 = parcel.readString();
                rn rnVarU15 = pn.u1(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                qb.b(parcel);
                ns nsVarZzo = zzo(aVarT13, string5, rnVarU15, i17);
                parcel2.writeNoException();
                qb.e(parcel2, nsVarZzo);
                return true;
            case 13:
                a aVarT14 = b.t(parcel.readStrongBinder());
                zzq zzqVar4 = (zzq) qb.a(parcel, zzq.CREATOR);
                String string6 = parcel.readString();
                rn rnVarU16 = pn.u1(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                qb.b(parcel);
                zzbu zzbuVarZzc = zzc(aVarT14, zzqVar4, string6, rnVarU16, i18);
                parcel2.writeNoException();
                qb.e(parcel2, zzbuVarZzc);
                return true;
            case 14:
                a aVarT15 = b.t(parcel.readStrongBinder());
                rn rnVarU17 = pn.u1(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                qb.b(parcel);
                ut utVarZzp = zzp(aVarT15, rnVarU17, i19);
                parcel2.writeNoException();
                qb.e(parcel2, utVarZzp);
                return true;
            case 15:
                a aVarT16 = b.t(parcel.readStrongBinder());
                rn rnVarU18 = pn.u1(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                qb.b(parcel);
                aq aqVarZzl = zzl(aVarT16, rnVarU18, i20);
                parcel2.writeNoException();
                qb.e(parcel2, aqVarZzl);
                return true;
            case 16:
                a aVarT17 = b.t(parcel.readStrongBinder());
                rn rnVarU19 = pn.u1(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    ilVar = iInterfaceQueryLocalInterface instanceof jl ? (jl) iInterfaceQueryLocalInterface : new il(strongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                }
                qb.b(parcel);
                ml mlVarZzk = zzk(aVarT17, rnVarU19, i21, ilVar);
                parcel2.writeNoException();
                qb.e(parcel2, mlVarZzk);
                return true;
            case 17:
                a aVarT18 = b.t(parcel.readStrongBinder());
                rn rnVarU110 = pn.u1(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                qb.b(parcel);
                zzdj zzdjVarZzh = zzh(aVarT18, rnVarU110, i22);
                parcel2.writeNoException();
                qb.e(parcel2, zzdjVarZzh);
                return true;
            default:
                return false;
        }
    }
}
