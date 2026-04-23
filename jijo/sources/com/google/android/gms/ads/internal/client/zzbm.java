package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbm extends pb implements zzbn {
    public zzbm() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            zzl zzlVar = (zzl) qb.a(parcel, zzl.CREATOR);
            qb.b(parcel);
            zzg(zzlVar);
            parcel2.writeNoException();
        } else if (i10 == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
        } else if (i10 == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            ClassLoader classLoader = qb.f8146a;
            parcel2.writeInt(zZzi ? 1 : 0);
        } else if (i10 == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else {
            if (i10 != 5) {
                return false;
            }
            zzl zzlVar2 = (zzl) qb.a(parcel, zzl.CREATOR);
            int i11 = parcel.readInt();
            qb.b(parcel);
            zzh(zzlVar2, i11);
            parcel2.writeNoException();
        }
        return true;
    }
}
