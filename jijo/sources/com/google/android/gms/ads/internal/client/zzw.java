package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();

    @AppOpenAd.AppOpenAdOrientation
    public final int zza;

    public zzw(@AppOpenAd.AppOpenAdOrientation int i10) {
        this.zza = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 2, 4);
        parcel.writeInt(i11);
        d0.u(parcel, iT);
    }
}
