package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbuc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbuc> CREATOR = new ar(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApplicationInfo f11554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11555b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PackageInfo f11556d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11557f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11558h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f11559q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f11560s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f11561t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f11562u;

    public zzbuc(ApplicationInfo applicationInfo, String str, PackageInfo packageInfo, String str2, int i10, String str3, List list, boolean z9, boolean z10) {
        this.f11555b = str;
        this.f11554a = applicationInfo;
        this.f11556d = packageInfo;
        this.f11557f = str2;
        this.f11558h = i10;
        this.f11559q = str3;
        this.f11560s = list;
        this.f11561t = z9;
        this.f11562u = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.n(parcel, 1, this.f11554a, i10);
        g4.d0.o(parcel, 2, this.f11555b);
        g4.d0.n(parcel, 3, this.f11556d, i10);
        g4.d0.o(parcel, 4, this.f11557f);
        g4.d0.v(parcel, 5, 4);
        parcel.writeInt(this.f11558h);
        g4.d0.o(parcel, 6, this.f11559q);
        g4.d0.q(parcel, 7, this.f11560s);
        g4.d0.v(parcel, 8, 4);
        parcel.writeInt(this.f11561t ? 1 : 0);
        g4.d0.v(parcel, 9, 4);
        parcel.writeInt(this.f11562u ? 1 : 0);
        g4.d0.u(parcel, iT);
    }
}
