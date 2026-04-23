package e4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f12713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12714b;

    public /* synthetic */ a(IBinder iBinder, String str, int i10) {
        this.f12713a = iBinder;
        this.f12714b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f12713a;
    }

    public final Parcel m(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f12713a.transact(i10, parcel, parcelObtain, 0);
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

    public final Parcel t() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f12714b);
        return parcelObtain;
    }
}
