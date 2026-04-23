package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final long zzd;

    public zzs(int i10, int i11, String str, long j10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = j10;
    }

    public static zzs zza(JSONObject jSONObject) {
        return new zzs(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString("currency"), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(i11);
        int i12 = this.zzb;
        d0.v(parcel, 2, 4);
        parcel.writeInt(i12);
        d0.o(parcel, 3, this.zzc);
        long j10 = this.zzd;
        d0.v(parcel, 4, 8);
        parcel.writeLong(j10);
        d0.u(parcel, iT);
    }
}
