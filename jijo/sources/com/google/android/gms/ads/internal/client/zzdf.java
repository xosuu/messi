package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdf extends pb implements zzdg {
    public zzdf() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof zzdg ? (zzdg) iInterfaceQueryLocalInterface : new zzde(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            zzs zzsVar = (zzs) qb.a(parcel, zzs.CREATOR);
            qb.b(parcel);
            zze(zzsVar);
            parcel2.writeNoException();
        } else {
            if (i10 != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            ClassLoader classLoader = qb.f8146a;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }
}
