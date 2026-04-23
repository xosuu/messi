package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.tc1;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    public final String zza;
    public final int zzb;

    public zzbb(String str, int i10) {
        this.zza = str == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : str;
        this.zzb = i10;
    }

    public static zzbb zzb(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarM = en1.M(th);
        return new zzbb(tc1.n(th.getMessage()) ? zzeVarM.zzb : th.getMessage(), zzeVarM.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iT = d0.t(parcel, 20293);
        d0.o(parcel, 1, str);
        int i11 = this.zzb;
        d0.v(parcel, 2, 4);
        parcel.writeInt(i11);
        d0.u(parcel, iT);
    }

    public final zzba zza() {
        return new zzba(this.zza, this.zzb);
    }
}
