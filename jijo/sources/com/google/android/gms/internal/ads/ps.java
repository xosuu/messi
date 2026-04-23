package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public abstract class ps extends pb implements qs {
    public ps() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        ks jsVar;
        switch (i10) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    jsVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    jsVar = iInterfaceQueryLocalInterface instanceof ks ? (ks) iInterfaceQueryLocalInterface : new js(strongBinder);
                }
                qb.b(parcel);
                Z(jsVar);
                break;
            case 4:
                int i11 = parcel.readInt();
                qb.b(parcel);
                f(i11);
                break;
            case 5:
                zze zzeVar = (zze) qb.a(parcel, zze.CREATOR);
                qb.b(parcel);
                G0(zzeVar);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
