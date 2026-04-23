package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzfqa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfqa> CREATOR = new ar(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f11640b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11641d;

    public zzfqa(int i10, byte[] bArr, int i11) {
        this.f11639a = i10;
        this.f11640b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f11641d = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.v(parcel, 1, 4);
        parcel.writeInt(this.f11639a);
        g4.d0.l(parcel, 2, this.f11640b);
        g4.d0.v(parcel, 3, 4);
        parcel.writeInt(this.f11641d);
        g4.d0.u(parcel, iT);
    }
}
