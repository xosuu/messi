package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbtz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtz> CREATOR = new ar(1);
    public final Bundle A;
    public final boolean B;
    public final int C;
    public final int D;
    public final float E;
    public final String F;
    public final long G;
    public final String H;
    public final List I;
    public final String J;
    public final zzbes K;
    public final List L;
    public final long M;
    public final String N;
    public final float O;
    public final int P;
    public final int Q;
    public final boolean R;
    public final String S;
    public final boolean T;
    public final String U;
    public final boolean V;
    public final int W;
    public final Bundle X;
    public final String Y;
    public final zzdu Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11522a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f11523a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f11524b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Bundle f11525b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final String f11526c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzl f11527d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final String f11528d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final String f11529e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final zzq f11530f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final boolean f11531f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final List f11532g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11533h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final String f11534h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final List f11535i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final int f11536j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final boolean f11537k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final boolean f11538l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final boolean f11539m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final ArrayList f11540n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final String f11541o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final zzblh f11542p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ApplicationInfo f11543q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f11544q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Bundle f11545r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final PackageInfo f11546s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f11547t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f11548u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f11549v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final VersionInfoParcel f11550w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Bundle f11551x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f11552y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List f11553z;

    public zzbtz(int i10, Bundle bundle, zzl zzlVar, zzq zzqVar, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, VersionInfoParcel versionInfoParcel, Bundle bundle2, int i11, ArrayList arrayList, Bundle bundle3, boolean z9, int i12, int i13, float f10, String str5, long j10, String str6, ArrayList arrayList2, String str7, zzbes zzbesVar, ArrayList arrayList3, long j11, String str8, float f11, boolean z10, int i14, int i15, boolean z11, String str9, String str10, boolean z12, int i16, Bundle bundle4, String str11, zzdu zzduVar, boolean z13, Bundle bundle5, String str12, String str13, String str14, boolean z14, ArrayList arrayList4, String str15, ArrayList arrayList5, int i17, boolean z15, boolean z16, boolean z17, ArrayList arrayList6, String str16, zzblh zzblhVar, String str17, Bundle bundle6) {
        this.f11522a = i10;
        this.f11524b = bundle;
        this.f11527d = zzlVar;
        this.f11530f = zzqVar;
        this.f11533h = str;
        this.f11543q = applicationInfo;
        this.f11546s = packageInfo;
        this.f11547t = str2;
        this.f11548u = str3;
        this.f11549v = str4;
        this.f11550w = versionInfoParcel;
        this.f11551x = bundle2;
        this.f11552y = i11;
        this.f11553z = arrayList;
        this.L = arrayList3 == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList3);
        this.A = bundle3;
        this.B = z9;
        this.C = i12;
        this.D = i13;
        this.E = f10;
        this.F = str5;
        this.G = j10;
        this.H = str6;
        this.I = arrayList2 == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList2);
        this.J = str7;
        this.K = zzbesVar;
        this.M = j11;
        this.N = str8;
        this.O = f11;
        this.T = z10;
        this.P = i14;
        this.Q = i15;
        this.R = z11;
        this.S = str9;
        this.U = str10;
        this.V = z12;
        this.W = i16;
        this.X = bundle4;
        this.Y = str11;
        this.Z = zzduVar;
        this.f11523a0 = z13;
        this.f11525b0 = bundle5;
        this.f11526c0 = str12;
        this.f11528d0 = str13;
        this.f11529e0 = str14;
        this.f11531f0 = z14;
        this.f11532g0 = arrayList4;
        this.f11534h0 = str15;
        this.f11535i0 = arrayList5;
        this.f11536j0 = i17;
        this.f11537k0 = z15;
        this.f11538l0 = z16;
        this.f11539m0 = z17;
        this.f11540n0 = arrayList6;
        this.f11541o0 = str16;
        this.f11542p0 = zzblhVar;
        this.f11544q0 = str17;
        this.f11545r0 = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = g4.d0.t(parcel, 20293);
        g4.d0.v(parcel, 1, 4);
        parcel.writeInt(this.f11522a);
        g4.d0.k(parcel, 2, this.f11524b);
        g4.d0.n(parcel, 3, this.f11527d, i10);
        g4.d0.n(parcel, 4, this.f11530f, i10);
        g4.d0.o(parcel, 5, this.f11533h);
        g4.d0.n(parcel, 6, this.f11543q, i10);
        g4.d0.n(parcel, 7, this.f11546s, i10);
        g4.d0.o(parcel, 8, this.f11547t);
        g4.d0.o(parcel, 9, this.f11548u);
        g4.d0.o(parcel, 10, this.f11549v);
        g4.d0.n(parcel, 11, this.f11550w, i10);
        g4.d0.k(parcel, 12, this.f11551x);
        g4.d0.v(parcel, 13, 4);
        parcel.writeInt(this.f11552y);
        g4.d0.q(parcel, 14, this.f11553z);
        g4.d0.k(parcel, 15, this.A);
        g4.d0.v(parcel, 16, 4);
        parcel.writeInt(this.B ? 1 : 0);
        g4.d0.v(parcel, 18, 4);
        parcel.writeInt(this.C);
        g4.d0.v(parcel, 19, 4);
        parcel.writeInt(this.D);
        g4.d0.v(parcel, 20, 4);
        parcel.writeFloat(this.E);
        g4.d0.o(parcel, 21, this.F);
        g4.d0.v(parcel, 25, 8);
        parcel.writeLong(this.G);
        g4.d0.o(parcel, 26, this.H);
        g4.d0.q(parcel, 27, this.I);
        g4.d0.o(parcel, 28, this.J);
        g4.d0.n(parcel, 29, this.K, i10);
        g4.d0.q(parcel, 30, this.L);
        g4.d0.v(parcel, 31, 8);
        parcel.writeLong(this.M);
        g4.d0.o(parcel, 33, this.N);
        g4.d0.v(parcel, 34, 4);
        parcel.writeFloat(this.O);
        g4.d0.v(parcel, 35, 4);
        parcel.writeInt(this.P);
        g4.d0.v(parcel, 36, 4);
        parcel.writeInt(this.Q);
        g4.d0.v(parcel, 37, 4);
        parcel.writeInt(this.R ? 1 : 0);
        g4.d0.o(parcel, 39, this.S);
        g4.d0.v(parcel, 40, 4);
        parcel.writeInt(this.T ? 1 : 0);
        g4.d0.o(parcel, 41, this.U);
        g4.d0.v(parcel, 42, 4);
        parcel.writeInt(this.V ? 1 : 0);
        g4.d0.v(parcel, 43, 4);
        parcel.writeInt(this.W);
        g4.d0.k(parcel, 44, this.X);
        g4.d0.o(parcel, 45, this.Y);
        g4.d0.n(parcel, 46, this.Z, i10);
        g4.d0.v(parcel, 47, 4);
        parcel.writeInt(this.f11523a0 ? 1 : 0);
        g4.d0.k(parcel, 48, this.f11525b0);
        g4.d0.o(parcel, 49, this.f11526c0);
        g4.d0.o(parcel, 50, this.f11528d0);
        g4.d0.o(parcel, 51, this.f11529e0);
        g4.d0.v(parcel, 52, 4);
        parcel.writeInt(this.f11531f0 ? 1 : 0);
        List list = this.f11532g0;
        if (list != null) {
            int iT2 = g4.d0.t(parcel, 53);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(((Integer) list.get(i11)).intValue());
            }
            g4.d0.u(parcel, iT2);
        }
        g4.d0.o(parcel, 54, this.f11534h0);
        g4.d0.q(parcel, 55, this.f11535i0);
        g4.d0.v(parcel, 56, 4);
        parcel.writeInt(this.f11536j0);
        g4.d0.v(parcel, 57, 4);
        parcel.writeInt(this.f11537k0 ? 1 : 0);
        g4.d0.v(parcel, 58, 4);
        parcel.writeInt(this.f11538l0 ? 1 : 0);
        g4.d0.v(parcel, 59, 4);
        parcel.writeInt(this.f11539m0 ? 1 : 0);
        g4.d0.q(parcel, 60, this.f11540n0);
        g4.d0.o(parcel, 61, this.f11541o0);
        g4.d0.n(parcel, 63, this.f11542p0, i10);
        g4.d0.o(parcel, 64, this.f11544q0);
        g4.d0.k(parcel, 65, this.f11545r0);
        g4.d0.u(parcel, iT);
    }
}
