package com.google.android.material.checkbox;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        MaterialCheckBox$SavedState materialCheckBox$SavedState = new MaterialCheckBox$SavedState(parcel);
        materialCheckBox$SavedState.f11824a = ((Integer) parcel.readValue(MaterialCheckBox$SavedState.class.getClassLoader())).intValue();
        return materialCheckBox$SavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new MaterialCheckBox$SavedState[i10];
    }
}
