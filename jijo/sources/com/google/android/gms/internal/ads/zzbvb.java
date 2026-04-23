package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbvb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvb> CREATOR = new ar(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f11574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VersionInfoParcel f11575b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ApplicationInfo f11576d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11577f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f11578h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PackageInfo f11579q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f11580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f11581t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public zzfhb f11582u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f11583v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f11584w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f11585x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Bundle f11586y;

    public zzbvb(Bundle bundle, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzfhb zzfhbVar, String str4, boolean z9, boolean z10, Bundle bundle2) {
        this.f11574a = bundle;
        this.f11575b = versionInfoParcel;
        this.f11577f = str;
        this.f11576d = applicationInfo;
        this.f11578h = list;
        this.f11579q = packageInfo;
        this.f11580s = str2;
        this.f11581t = str3;
        this.f11582u = zzfhbVar;
        this.f11583v = str4;
        this.f11584w = z9;
        this.f11585x = z10;
        this.f11586y = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.k(parcel, 1, this.f11574a);
        g4.d0.n(parcel, 2, this.f11575b, i10);
        g4.d0.n(parcel, 3, this.f11576d, i10);
        g4.d0.o(parcel, 4, this.f11577f);
        g4.d0.q(parcel, 5, this.f11578h);
        g4.d0.n(parcel, 6, this.f11579q, i10);
        g4.d0.o(parcel, 7, this.f11580s);
        g4.d0.o(parcel, 9, this.f11581t);
        g4.d0.n(parcel, 10, this.f11582u, i10);
        g4.d0.o(parcel, 11, this.f11583v);
        g4.d0.v(parcel, 12, 4);
        parcel.writeInt(this.f11584w ? 1 : 0);
        g4.d0.v(parcel, 13, 4);
        parcel.writeInt(this.f11585x ? 1 : 0);
        g4.d0.k(parcel, 14, this.f11586y);
        g4.d0.u(parcel, iT);
    }
}
