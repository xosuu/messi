package com.codetroopers.betterpickers.expirationpicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.codetroopers.betterpickers.expirationpicker.ExpirationPicker;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ExpirationPicker.SavedState savedState = new ExpirationPicker.SavedState(parcel);
        savedState.f1663a = parcel.readInt();
        parcel.readIntArray(savedState.f1664b);
        savedState.f1665d = parcel.readInt();
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new ExpirationPicker.SavedState[i10];
    }
}
