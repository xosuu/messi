package com.google.android.gms.ads.internal.client;

import a4.a;
import a4.b;
import android.os.Parcel;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdi extends pb implements zzdj {
    public zzdi() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        String string = parcel.readString();
        a aVarT = b.t(parcel.readStrongBinder());
        a aVarT2 = b.t(parcel.readStrongBinder());
        qb.b(parcel);
        zze(string, aVarT, aVarT2);
        parcel2.writeNoException();
        return true;
    }
}
