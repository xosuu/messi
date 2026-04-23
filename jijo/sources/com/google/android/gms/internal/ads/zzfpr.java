package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfpr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfpr> CREATOR = new ar(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x8 f11632b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f11633d;

    public zzfpr(byte[] bArr, int i10) {
        this.f11631a = i10;
        this.f11633d = bArr;
        b();
    }

    public final void b() {
        x8 x8Var = this.f11632b;
        if (x8Var != null || this.f11633d == null) {
            if (x8Var == null || this.f11633d != null) {
                if (x8Var != null && this.f11633d != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (x8Var != null || this.f11633d != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.v(parcel, 1, 4);
        parcel.writeInt(this.f11631a);
        byte[] bArrD = this.f11633d;
        if (bArrD == null) {
            bArrD = this.f11632b.d();
        }
        g4.d0.l(parcel, 2, bArrD);
        g4.d0.u(parcel, iT);
    }
}
