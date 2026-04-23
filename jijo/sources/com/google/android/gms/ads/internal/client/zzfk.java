package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class zzfk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfk> CREATOR = new zzfl();
    public final boolean zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzfk(boolean z9, boolean z10, boolean z11) {
        this.zza = z9;
        this.zzb = z10;
        this.zzc = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z9 = this.zza;
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 2, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.zzb;
        d0.v(parcel, 3, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.zzc;
        d0.v(parcel, 4, 4);
        parcel.writeInt(z11 ? 1 : 0);
        d0.u(parcel, iT);
    }

    public zzfk(VideoOptions videoOptions) {
        this(videoOptions.getStartMuted(), videoOptions.getCustomControlsRequested(), videoOptions.getClickToExpandRequested());
    }
}
