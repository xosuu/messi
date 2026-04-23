package com.github.clans.fab;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.clans.fab.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        FloatingActionButton.ProgressSavedState progressSavedState = new FloatingActionButton.ProgressSavedState(parcel);
        progressSavedState.f1801a = parcel.readFloat();
        progressSavedState.f1802b = parcel.readFloat();
        progressSavedState.f1808t = parcel.readInt() != 0;
        progressSavedState.f1803d = parcel.readFloat();
        progressSavedState.f1804f = parcel.readInt();
        progressSavedState.f1805h = parcel.readInt();
        progressSavedState.f1806q = parcel.readInt();
        progressSavedState.f1807s = parcel.readInt();
        progressSavedState.f1809u = parcel.readInt() != 0;
        progressSavedState.f1810v = parcel.readInt() != 0;
        progressSavedState.f1811w = parcel.readInt() != 0;
        progressSavedState.f1812x = parcel.readInt() != 0;
        progressSavedState.f1813y = parcel.readInt() != 0;
        progressSavedState.f1814z = parcel.readInt() != 0;
        return progressSavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new FloatingActionButton.ProgressSavedState[i10];
    }
}
