package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g4.d0;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2480b;

    public Scope(int i10, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f2479a = i10;
        this.f2480b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2480b.equals(((Scope) obj).f2480b);
    }

    public final int hashCode() {
        return this.f2480b.hashCode();
    }

    public final String toString() {
        return this.f2480b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.v(parcel, 1, 4);
        parcel.writeInt(this.f2479a);
        d0.o(parcel, 2, this.f2480b);
        d0.u(parcel, iT);
    }
}
