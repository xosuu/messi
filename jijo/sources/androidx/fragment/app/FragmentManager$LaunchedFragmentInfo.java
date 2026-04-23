package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator<FragmentManager$LaunchedFragmentInfo> CREATOR = new b(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f680b;

    public FragmentManager$LaunchedFragmentInfo(String str, int i10) {
        this.f679a = str;
        this.f680b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f679a);
        parcel.writeInt(this.f680b);
    }
}
