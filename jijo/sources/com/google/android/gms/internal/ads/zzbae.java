package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbae> CREATOR = new a2(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ParcelFileDescriptor f11461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11462b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11463d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11464f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f11465h;

    public zzbae(ParcelFileDescriptor parcelFileDescriptor, boolean z9, boolean z10, long j10, boolean z11) {
        this.f11461a = parcelFileDescriptor;
        this.f11462b = z9;
        this.f11463d = z10;
        this.f11464f = j10;
        this.f11465h = z11;
    }

    public final synchronized long b() {
        return this.f11464f;
    }

    public final synchronized ParcelFileDescriptor.AutoCloseInputStream c() {
        if (this.f11461a == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f11461a);
        this.f11461a = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean d() {
        return this.f11462b;
    }

    public final synchronized boolean e() {
        return this.f11461a != null;
    }

    public final synchronized boolean f() {
        return this.f11463d;
    }

    public final synchronized boolean g() {
        return this.f11465h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ParcelFileDescriptor parcelFileDescriptor;
        int iT = g4.d0.t(parcel, 20293);
        synchronized (this) {
            parcelFileDescriptor = this.f11461a;
        }
        g4.d0.n(parcel, 2, parcelFileDescriptor, i10);
        boolean zD = d();
        g4.d0.v(parcel, 3, 4);
        parcel.writeInt(zD ? 1 : 0);
        boolean zF = f();
        g4.d0.v(parcel, 4, 4);
        parcel.writeInt(zF ? 1 : 0);
        long jB = b();
        g4.d0.v(parcel, 5, 8);
        parcel.writeLong(jB);
        boolean zG = g();
        g4.d0.v(parcel, 6, 4);
        parcel.writeInt(zG ? 1 : 0);
        g4.d0.u(parcel, iT);
    }

    public zzbae() {
        this(null, false, false, 0L, false);
    }
}
