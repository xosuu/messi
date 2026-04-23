package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11898a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f11898a) {
            case 0:
                return Month.d(parcel.readInt(), parcel.readInt());
            default:
                return new DateValidatorPointForward(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f11898a) {
            case 0:
                return new Month[i10];
            default:
                return new DateValidatorPointForward[i10];
        }
    }
}
