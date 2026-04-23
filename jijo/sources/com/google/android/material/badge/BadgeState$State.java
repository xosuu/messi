package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable;
import j4.b;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class BadgeState$State implements Parcelable {
    public static final Parcelable.Creator<BadgeState$State> CREATOR = new b(4);
    public Integer A;
    public Integer B;
    public Integer C;
    public Integer D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f11737b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f11738d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Locale f11742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f11743t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11744u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11745v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f11746w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Integer f11748y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Integer f11749z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11739f = 255;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11740h = -2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11741q = -2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f11747x = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11736a);
        parcel.writeSerializable(this.f11737b);
        parcel.writeSerializable(this.f11738d);
        parcel.writeInt(this.f11739f);
        parcel.writeInt(this.f11740h);
        parcel.writeInt(this.f11741q);
        CharSequence charSequence = this.f11743t;
        parcel.writeString(charSequence == null ? null : charSequence.toString());
        parcel.writeInt(this.f11744u);
        parcel.writeSerializable(this.f11746w);
        parcel.writeSerializable(this.f11748y);
        parcel.writeSerializable(this.f11749z);
        parcel.writeSerializable(this.A);
        parcel.writeSerializable(this.B);
        parcel.writeSerializable(this.C);
        parcel.writeSerializable(this.D);
        parcel.writeSerializable(this.f11747x);
        parcel.writeSerializable(this.f11742s);
    }
}
