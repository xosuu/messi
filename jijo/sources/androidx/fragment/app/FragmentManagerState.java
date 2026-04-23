package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new b(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f682b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BackStackState[] f683d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f684f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f685h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f686q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f688t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f681a);
        parcel.writeStringList(this.f682b);
        parcel.writeTypedArray(this.f683d, i10);
        parcel.writeInt(this.f684f);
        parcel.writeString(this.f685h);
        parcel.writeStringList(this.f686q);
        parcel.writeTypedList(this.f687s);
        parcel.writeTypedList(this.f688t);
    }
}
