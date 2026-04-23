package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;
import j4.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zag> CREATOR = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11687b;

    public zag(String str, ArrayList arrayList) {
        this.f11686a = arrayList;
        this.f11687b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.q(parcel, 1, this.f11686a);
        d0.o(parcel, 2, this.f11687b);
        d0.u(parcel, iT);
    }
}
