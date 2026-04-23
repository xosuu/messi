package com.codetroopers.betterpickers.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.codetroopers.betterpickers.timepicker.TimePicker;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        TimePicker.SavedState savedState = new TimePicker.SavedState(parcel);
        savedState.f1751a = parcel.readInt();
        parcel.readIntArray(savedState.f1752b);
        savedState.f1753d = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new TimePicker.SavedState[i10];
    }
}
