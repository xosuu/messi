package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f91b;

    public RatingCompat(int i10, float f10) {
        this.f90a = i10;
        this.f91b = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f90a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f90a);
        sb.append(" rating=");
        float f10 = this.f91b;
        sb.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f90a);
        parcel.writeFloat(this.f91b);
    }
}
