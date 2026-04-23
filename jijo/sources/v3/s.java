package v3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* JADX INFO: loaded from: classes.dex */
public final class s implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f17792a;

    public s(IBinder iBinder) {
        this.f17792a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17792a;
    }

    public final void m(v vVar, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(vVar);
            parcelObtain.writeInt(1);
            android.support.v4.media.a.a(getServiceRequest, parcelObtain, 0);
            this.f17792a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
