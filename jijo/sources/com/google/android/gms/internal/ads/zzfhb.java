package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfhb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfhb> CREATOR = new ar(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11617b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cs0 f11618d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11619f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11620h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f11621q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f11622s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f11623t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f11624u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f11625v;

    public zzfhb(int i10, int i11, int i12, int i13, String str, int i14, int i15) {
        cs0[] cs0VarArrValues = cs0.values();
        this.f11616a = null;
        this.f11617b = i10;
        this.f11618d = cs0VarArrValues[i10];
        this.f11619f = i11;
        this.f11620h = i12;
        this.f11621q = i13;
        this.f11622s = str;
        this.f11623t = i14;
        this.f11625v = new int[]{1, 2, 3}[i14];
        this.f11624u = i15;
        int i16 = new int[]{1}[i15];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.v(parcel, 1, 4);
        parcel.writeInt(this.f11617b);
        g4.d0.v(parcel, 2, 4);
        parcel.writeInt(this.f11619f);
        g4.d0.v(parcel, 3, 4);
        parcel.writeInt(this.f11620h);
        g4.d0.v(parcel, 4, 4);
        parcel.writeInt(this.f11621q);
        g4.d0.o(parcel, 5, this.f11622s);
        g4.d0.v(parcel, 6, 4);
        parcel.writeInt(this.f11623t);
        g4.d0.v(parcel, 7, 4);
        parcel.writeInt(this.f11624u);
        g4.d0.u(parcel, iT);
    }

    public zzfhb(Context context, cs0 cs0Var, int i10, int i11, int i12, String str, String str2, String str3) {
        int i13;
        cs0.values();
        this.f11616a = context;
        this.f11617b = cs0Var.ordinal();
        this.f11618d = cs0Var;
        this.f11619f = i10;
        this.f11620h = i11;
        this.f11621q = i12;
        this.f11622s = str;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else {
            i13 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.f11625v = i13;
        this.f11623t = i13 - 1;
        "onAdClosed".equals(str3);
        this.f11624u = 0;
    }
}
