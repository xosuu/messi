package com.google.android.gms.ads.internal.client;

import a4.a;
import a4.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.pn;
import com.google.android.gms.internal.ads.qb;
import com.google.android.gms.internal.ads.rn;
import com.google.android.gms.internal.ads.xl;
import com.google.android.gms.internal.ads.zl;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcn extends pb implements zzco {
    public zzcn() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        boolean z9;
        zl xlVar = null;
        zzda zzcyVar = null;
        switch (i10) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f10 = parcel.readFloat();
                qb.b(parcel);
                zzq(f10);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                qb.b(parcel);
                zzr(string);
                parcel2.writeNoException();
                return true;
            case 4:
                ClassLoader classLoader = qb.f8146a;
                z9 = parcel.readInt() != 0;
                qb.b(parcel);
                zzp(z9);
                parcel2.writeNoException();
                return true;
            case 5:
                a aVarT = b.t(parcel.readStrongBinder());
                String string2 = parcel.readString();
                qb.b(parcel);
                zzn(aVarT, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                a aVarT2 = b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zzl(string3, aVarT2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzv = zzv();
                parcel2.writeNoException();
                ClassLoader classLoader2 = qb.f8146a;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                qb.b(parcel);
                zzh(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                rn rnVarU1 = pn.u1(parcel.readStrongBinder());
                qb.b(parcel);
                zzo(rnVarU1);
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    xlVar = iInterfaceQueryLocalInterface instanceof zl ? (zl) iInterfaceQueryLocalInterface : new xl(strongBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                }
                qb.b(parcel);
                zzs(xlVar);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                zzff zzffVar = (zzff) qb.a(parcel, zzff.CREATOR);
                qb.b(parcel);
                zzu(zzffVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzcyVar = iInterfaceQueryLocalInterface2 instanceof zzda ? (zzda) iInterfaceQueryLocalInterface2 : new zzcy(strongBinder2, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                }
                qb.b(parcel);
                zzm(zzcyVar);
                parcel2.writeNoException();
                return true;
            case 17:
                ClassLoader classLoader3 = qb.f8146a;
                z9 = parcel.readInt() != 0;
                qb.b(parcel);
                zzj(z9);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                qb.b(parcel);
                zzt(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
