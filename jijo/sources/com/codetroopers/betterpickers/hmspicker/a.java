package com.codetroopers.betterpickers.hmspicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.codetroopers.betterpickers.hmspicker.HmsPicker;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        HmsPicker.SavedState savedState = new HmsPicker.SavedState(parcel);
        savedState.f1686a = parcel.readInt();
        savedState.f1687b = parcel.createIntArray();
        savedState.f1688d = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new HmsPicker.SavedState[i10];
    }
}
