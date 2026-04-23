package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rq extends ob implements tq {
    @Override // com.google.android.gms.internal.ads.tq
    public final void a(String str) {
        Parcel parcelM = m();
        parcelM.writeString(str);
        a0(parcelM, 2);
    }

    @Override // com.google.android.gms.internal.ads.tq
    public final void h0(List list) {
        Parcel parcelM = m();
        parcelM.writeTypedList(list);
        a0(parcelM, 1);
    }
}
