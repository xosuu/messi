package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        StaggeredGridLayoutManager.SavedState savedState = new StaggeredGridLayoutManager.SavedState();
        savedState.f1096a = parcel.readInt();
        savedState.f1097b = parcel.readInt();
        int i10 = parcel.readInt();
        savedState.f1098d = i10;
        if (i10 > 0) {
            int[] iArr = new int[i10];
            savedState.f1099f = iArr;
            parcel.readIntArray(iArr);
        }
        int i11 = parcel.readInt();
        savedState.f1100h = i11;
        if (i11 > 0) {
            int[] iArr2 = new int[i11];
            savedState.f1101q = iArr2;
            parcel.readIntArray(iArr2);
        }
        savedState.f1103t = parcel.readInt() == 1;
        savedState.f1104u = parcel.readInt() == 1;
        savedState.f1105v = parcel.readInt() == 1;
        savedState.f1102s = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new StaggeredGridLayoutManager.SavedState[i10];
    }
}
