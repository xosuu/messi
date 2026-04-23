package com.codetroopers.betterpickers.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.codetroopers.betterpickers.datepicker.DatePicker;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        DatePicker.SavedState savedState = new DatePicker.SavedState(parcel);
        savedState.f1637a = parcel.readInt();
        savedState.f1638b = parcel.readInt();
        parcel.readIntArray(savedState.f1639d);
        parcel.readIntArray(savedState.f1640f);
        savedState.f1641h = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new DatePicker.SavedState[i10];
    }
}
