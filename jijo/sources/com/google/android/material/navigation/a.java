package com.google.android.material.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.navigation.NavigationView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        NavigationView.SavedState savedState = new NavigationView.SavedState(parcel, classLoader);
        savedState.f11929d = parcel.readBundle(classLoader);
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new NavigationView.SavedState[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        NavigationView.SavedState savedState = new NavigationView.SavedState(parcel, null);
        savedState.f11929d = parcel.readBundle(null);
        return savedState;
    }
}
