package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class tt extends pb implements ut {
    public static ut zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof ut ? (ut) iInterfaceQueryLocalInterface : new st(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        rt qtVar = null;
        switch (i10) {
            case 1:
                a4.a aVarT = a4.b.t(parcel.readStrongBinder());
                zzbyq zzbyqVar = (zzbyq) qb.a(parcel, zzbyq.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    qtVar = iInterfaceQueryLocalInterface instanceof rt ? (rt) iInterfaceQueryLocalInterface : new qt(strongBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
                }
                qb.b(parcel);
                zzf(aVarT, zzbyqVar, qtVar);
                parcel2.writeNoException();
                return true;
            case 2:
                a4.a aVarT2 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zzk(aVarT2);
                parcel2.writeNoException();
                return true;
            case 3:
                a4.b.t(parcel.readStrongBinder());
                a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                parcel2.writeNoException();
                qb.e(parcel2, null);
                return true;
            case 4:
                a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                parcel2.writeNoException();
                qb.e(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                a4.a aVarT3 = a4.b.t(parcel.readStrongBinder());
                tq tqVarU1 = sq.u1(parcel.readStrongBinder());
                qb.b(parcel);
                zzm(arrayListCreateTypedArrayList, aVarT3, tqVarU1);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                a4.a aVarT4 = a4.b.t(parcel.readStrongBinder());
                tq tqVarU12 = sq.u1(parcel.readStrongBinder());
                qb.b(parcel);
                zzl(arrayListCreateTypedArrayList2, aVarT4, tqVarU12);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbtl zzbtlVar = (zzbtl) qb.a(parcel, zzbtl.CREATOR);
                qb.b(parcel);
                zzg(zzbtlVar);
                parcel2.writeNoException();
                return true;
            case 8:
                a4.a aVarT5 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zzj(aVarT5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                a4.a aVarT6 = a4.b.t(parcel.readStrongBinder());
                tq tqVarU13 = sq.u1(parcel.readStrongBinder());
                qb.b(parcel);
                zzi(arrayListCreateTypedArrayList3, aVarT6, tqVarU13);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                a4.a aVarT7 = a4.b.t(parcel.readStrongBinder());
                tq tqVarU14 = sq.u1(parcel.readStrongBinder());
                qb.b(parcel);
                zzh(arrayListCreateTypedArrayList4, aVarT7, tqVarU14);
                parcel2.writeNoException();
                return true;
            case 11:
                a4.a aVarT8 = a4.b.t(parcel.readStrongBinder());
                a4.a aVarT9 = a4.b.t(parcel.readStrongBinder());
                String string = parcel.readString();
                a4.a aVarT10 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                a4.a aVarZze = zze(aVarT8, aVarT9, string, aVarT10);
                parcel2.writeNoException();
                qb.e(parcel2, aVarZze);
                return true;
            default:
                return false;
        }
    }
}
