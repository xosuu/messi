package j6;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import de.blinkt.openvpn.core.ConnectionStatus;
import de.blinkt.openvpn.core.LogItem;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IBinder f14396a;

    @Override // j6.j
    public final void Q0(LogItem logItem) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
            if (logItem != null) {
                parcelObtain.writeInt(1);
                logItem.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f14396a.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // j6.j
    public final void U0(String str, String str2, int i10, ConnectionStatus connectionStatus, Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            parcelObtain.writeInt(i10);
            if (connectionStatus != null) {
                parcelObtain.writeInt(1);
                connectionStatus.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f14396a.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14396a;
    }

    @Override // j6.j
    public final void n0(long j10, long j11) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
            parcelObtain.writeLong(j10);
            parcelObtain.writeLong(j11);
            this.f14396a.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // j6.j
    public final void r1(String str) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("de.blinkt.openvpn.core.IStatusCallbacks");
            parcelObtain.writeString(str);
            this.f14396a.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
