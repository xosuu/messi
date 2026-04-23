package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new android.support.v4.media.a(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f106b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f107d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f108f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f109h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f105a);
        parcel.writeInt(this.f107d);
        parcel.writeInt(this.f108f);
        parcel.writeInt(this.f109h);
        parcel.writeInt(this.f106b);
    }
}
