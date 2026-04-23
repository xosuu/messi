package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import f.f;
import g4.d0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new a(28);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2474b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2475d;

    public Feature(int i10, String str, long j10) {
        this.f2473a = str;
        this.f2474b = i10;
        this.f2475d = j10;
    }

    public final long b() {
        long j10 = this.f2475d;
        return j10 == -1 ? this.f2474b : j10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.f2473a;
            if (((str != null && str.equals(feature.f2473a)) || (str == null && feature.f2473a == null)) && b() == feature.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2473a, Long.valueOf(b())});
    }

    public final String toString() {
        f fVar = new f(this);
        fVar.g(this.f2473a, "name");
        fVar.g(Long.valueOf(b()), "version");
        return fVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iT = d0.t(parcel, 20293);
        d0.o(parcel, 1, this.f2473a);
        d0.v(parcel, 2, 4);
        parcel.writeInt(this.f2474b);
        long jB = b();
        d0.v(parcel, 3, 8);
        parcel.writeLong(jB);
        d0.u(parcel, iT);
    }

    public Feature(String str) {
        this.f2473a = str;
        this.f2475d = 1L;
        this.f2474b = -1;
    }
}
