package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class yl extends pb implements zl {
    public yl() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.pb
    public final boolean a0(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbkv.CREATOR);
        qb.b(parcel);
        ((j3.s) this).r0(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
