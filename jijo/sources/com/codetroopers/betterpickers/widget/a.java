package com.codetroopers.betterpickers.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        UnderlinePageIndicatorPicker.SavedState savedState = new UnderlinePageIndicatorPicker.SavedState(parcel);
        savedState.f1772a = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new UnderlinePageIndicatorPicker.SavedState[i10];
    }
}
