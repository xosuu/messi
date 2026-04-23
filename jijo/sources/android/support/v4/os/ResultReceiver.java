package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import b.b;
import b.c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f125a;

    public ResultReceiver(Parcel parcel) {
        b bVar;
        IBinder strongBinder = parcel.readStrongBinder();
        int i10 = c.f1204b;
        if (strongBinder == null) {
            bVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) {
                b.a aVar = new b.a();
                aVar.f1203a = strongBinder;
                bVar = aVar;
            } else {
                bVar = (b) iInterfaceQueryLocalInterface;
            }
        }
        this.f125a = bVar;
    }

    public void b(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f125a == null) {
                    this.f125a = new c(this);
                }
                parcel.writeStrongBinder(this.f125a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
