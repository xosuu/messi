package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new a(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Account f2523b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2524d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GoogleSignInAccount f2525f;

    public zat(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f2522a = i10;
        this.f2523b = account;
        this.f2524d = i11;
        this.f2525f = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f2522a);
        d0.n(parcel, 2, this.f2523b, i10);
        d0.v(parcel, 3, 4);
        parcel.writeInt(this.f2524d);
        d0.n(parcel, 4, this.f2525f, i10);
        d0.u(parcel, iT);
    }
}
