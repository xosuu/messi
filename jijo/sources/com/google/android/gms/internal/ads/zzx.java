package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class zzx implements Parcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new ar(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f11666b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11667d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11668f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f11669h;

    public zzx(Parcel parcel) {
        this.f11666b = new UUID(parcel.readLong(), parcel.readLong());
        this.f11667d = parcel.readString();
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        this.f11668f = string;
        this.f11669h = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzx)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzx zzxVar = (zzx) obj;
        return yn0.c(this.f11667d, zzxVar.f11667d) && yn0.c(this.f11668f, zzxVar.f11668f) && yn0.c(this.f11666b, zzxVar.f11666b) && Arrays.equals(this.f11669h, zzxVar.f11669h);
    }

    public final int hashCode() {
        int i10 = this.f11665a;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f11666b.hashCode() * 31;
        String str = this.f11667d;
        int iHashCode2 = Arrays.hashCode(this.f11669h) + ((this.f11668f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        this.f11665a = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f11666b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f11667d);
        parcel.writeString(this.f11668f);
        parcel.writeByteArray(this.f11669h);
    }

    public zzx(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f11666b = uuid;
        this.f11667d = null;
        this.f11668f = xm.e(str);
        this.f11669h = bArr;
    }
}
