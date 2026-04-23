package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbtl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtl> CREATOR = new ar(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f11520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f11521b;

    public zzbtl(IBinder iBinder, IBinder iBinder2) {
        this.f11520a = (View) a4.b.a0(a4.b.t(iBinder));
        this.f11521b = (Map) a4.b.a0(a4.b.t(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.m(parcel, 1, new a4.b(this.f11520a));
        g4.d0.m(parcel, 2, new a4.b(this.f11521b));
        g4.d0.u(parcel, iT);
    }
}
