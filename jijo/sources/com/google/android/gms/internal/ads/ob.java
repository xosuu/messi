package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class ob implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f7547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7548b;

    public ob(IBinder iBinder, String str) {
        this.f7547a = iBinder;
        this.f7548b = str;
    }

    public final void a0(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f7547a.transact(i10, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7547a;
    }

    public final Parcel m() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f7548b);
        return parcelObtain;
    }

    public final Parcel t(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f7547a.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e10) {
                parcelObtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    public final void u1(Parcel parcel, int i10) {
        try {
            this.f7547a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
