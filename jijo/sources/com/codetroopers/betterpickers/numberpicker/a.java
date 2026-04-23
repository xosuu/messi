package com.codetroopers.betterpickers.numberpicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.codetroopers.betterpickers.numberpicker.NumberPicker;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        NumberPicker.SavedState savedState = new NumberPicker.SavedState(parcel);
        savedState.f1711a = parcel.readInt();
        int i10 = parcel.readInt();
        if (i10 > 0) {
            int[] iArr = new int[i10];
            savedState.f1712b = iArr;
            parcel.readIntArray(iArr);
        }
        savedState.f1713d = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new NumberPicker.SavedState[i10];
    }
}
