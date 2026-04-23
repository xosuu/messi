package com.google.android.gms.internal.ads;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xl extends ob implements zl {
    @Override // com.google.android.gms.internal.ads.zl
    public final void r0(List list) {
        Parcel parcelM = m();
        parcelM.writeTypedList(list);
        a0(parcelM, 1);
    }
}
