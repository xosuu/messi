package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class si extends pb implements ti {
    public si() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static ti zzdA(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof ti ? (ti) iInterfaceQueryLocalInterface : new ri(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        ni liVar;
        switch (i10) {
            case 1:
                String string = parcel.readString();
                a4.a aVarT = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zzdv(string, aVarT);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                qb.b(parcel);
                a4.a aVarZzb = zzb(string2);
                parcel2.writeNoException();
                qb.e(parcel2, aVarZzb);
                return true;
            case 3:
                a4.a aVarT2 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zzdz(aVarT2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                a4.b.t(parcel.readStrongBinder());
                parcel.readInt();
                qb.b(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                a4.a aVarT3 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zzdw(aVarT3);
                parcel2.writeNoException();
                return true;
            case 7:
                a4.a aVarT4 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zzd(aVarT4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    liVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    liVar = iInterfaceQueryLocalInterface instanceof ni ? (ni) iInterfaceQueryLocalInterface : new li(strongBinder);
                }
                qb.b(parcel);
                zzdx(liVar);
                parcel2.writeNoException();
                return true;
            case 9:
                a4.a aVarT5 = a4.b.t(parcel.readStrongBinder());
                qb.b(parcel);
                zzdy(aVarT5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
