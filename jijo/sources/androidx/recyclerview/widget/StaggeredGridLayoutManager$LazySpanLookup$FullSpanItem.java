package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> CREATOR = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1093b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f1094d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1095f;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f1092a + ", mGapDir=" + this.f1093b + ", mHasUnwantedGapAfter=" + this.f1095f + ", mGapPerSpan=" + Arrays.toString(this.f1094d) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f1092a);
        parcel.writeInt(this.f1093b);
        parcel.writeInt(this.f1095f ? 1 : 0);
        int[] iArr = this.f1094d;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f1094d);
        }
    }
}
