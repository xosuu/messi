package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.pb;
import com.google.android.gms.internal.ads.qb;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzcz extends pb implements zzda {
    public zzcz() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        zze zzeVar = (zze) qb.a(parcel, zze.CREATOR);
        qb.b(parcel);
        zze(zzeVar);
        parcel2.writeNoException();
        return true;
    }
}
