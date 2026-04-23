package i6;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f14175a;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14175a;
    }

    public final byte[] m(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("de.blinkt.openvpn.api.ExternalCertificateProvider");
            parcelObtain.writeString(null);
            parcelObtain.writeByteArray(bArr);
            this.f14175a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createByteArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
