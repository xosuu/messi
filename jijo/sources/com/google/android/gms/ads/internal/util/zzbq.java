package com.google.android.gms.ads.internal.util;

import a4.a;
import a4.b;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbq extends pb implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            a aVarT = b.t(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            qb.b(parcel);
            boolean zZzf = zzf(aVarT, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else if (i10 == 2) {
            a aVarT2 = b.t(parcel.readStrongBinder());
            qb.b(parcel);
            zze(aVarT2);
            parcel2.writeNoException();
        } else {
            if (i10 != 3) {
                return false;
            }
            a aVarT3 = b.t(parcel.readStrongBinder());
            zza zzaVar = (zza) qb.a(parcel, zza.CREATOR);
            qb.b(parcel);
            boolean zZzg = zzg(aVarT3, zzaVar);
            parcel2.writeNoException();
            parcel2.writeInt(zZzg ? 1 : 0);
        }
        return true;
    }
}
