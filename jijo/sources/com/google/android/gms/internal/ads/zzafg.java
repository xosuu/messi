package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzafg implements zzbj {
    public static final Parcelable.Creator<zzafg> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11391b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11392d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11393f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f11394h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11395q;

    static {
        q0 q0Var = new q0();
        q0Var.f("application/id3");
        q0Var.h();
        q0 q0Var2 = new q0();
        q0Var2.f("application/x-scte35");
        q0Var2.h();
        CREATOR = new a2(0);
    }

    public zzafg(Parcel parcel) {
        String string = parcel.readString();
        int i10 = yn0.f10944a;
        this.f11390a = string;
        this.f11391b = parcel.readString();
        this.f11392d = parcel.readLong();
        this.f11393f = parcel.readLong();
        this.f11394h = parcel.createByteArray();
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void a(mi miVar) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafg.class == obj.getClass()) {
            zzafg zzafgVar = (zzafg) obj;
            if (this.f11392d == zzafgVar.f11392d && this.f11393f == zzafgVar.f11393f && yn0.c(this.f11390a, zzafgVar.f11390a) && yn0.c(this.f11391b, zzafgVar.f11391b) && Arrays.equals(this.f11394h, zzafgVar.f11394h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f11395q;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f11390a;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f11391b;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j10 = this.f11393f;
        long j11 = this.f11392d;
        int iHashCode3 = Arrays.hashCode(this.f11394h) + ((((((((iHashCode + 527) * 31) + iHashCode2) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        this.f11395q = iHashCode3;
        return iHashCode3;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f11390a + ", id=" + this.f11393f + ", durationMs=" + this.f11392d + ", value=" + this.f11391b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f11390a);
        parcel.writeString(this.f11391b);
        parcel.writeLong(this.f11392d);
        parcel.writeLong(this.f11393f);
        parcel.writeByteArray(this.f11394h);
    }
}
