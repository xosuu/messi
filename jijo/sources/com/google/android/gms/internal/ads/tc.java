package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public abstract class tc extends pb implements uc {
    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        rc qcVar;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                qcVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                qcVar = iInterfaceQueryLocalInterface instanceof rc ? (rc) iInterfaceQueryLocalInterface : new qc(strongBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
            }
            qb.b(parcel);
            ((nc) this).Z0(qcVar);
        } else if (i10 == 2) {
            parcel.readInt();
            qb.b(parcel);
        } else {
            if (i10 != 3) {
                return false;
            }
            zze zzeVar = (zze) qb.a(parcel, zze.CREATOR);
            qb.b(parcel);
            ((nc) this).q0(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
