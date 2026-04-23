package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1092a = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1093b = parcel.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1095f = parcel.readInt() == 1;
        int i10 = parcel.readInt();
        if (i10 > 0) {
            int[] iArr = new int[i10];
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1094d = iArr;
            parcel.readIntArray(iArr);
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i10];
    }
}
