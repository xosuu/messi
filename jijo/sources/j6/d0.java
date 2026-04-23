package j6;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import de.blinkt.openvpn.core.ConnectionStatus;
import de.blinkt.openvpn.core.LogItem;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends Binder implements j {
    @Override // j6.j
    public final void Q0(LogItem logItem) {
        de.blinkt.openvpn.core.c.r(logItem);
    }

    @Override // j6.j
    public final void U0(String str, String str2, int i10, ConnectionStatus connectionStatus, Intent intent) {
        de.blinkt.openvpn.core.c.z(str, str2, i10, connectionStatus, intent);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("de.blinkt.openvpn.core.IStatusCallbacks");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("de.blinkt.openvpn.core.IStatusCallbacks");
            return true;
        }
        if (i10 == 1) {
            de.blinkt.openvpn.core.c.r((LogItem) (parcel.readInt() != 0 ? LogItem.CREATOR.createFromParcel(parcel) : null));
        } else if (i10 == 2) {
            de.blinkt.openvpn.core.c.z(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? ConnectionStatus.CREATOR.createFromParcel(parcel) : null, (Intent) (parcel.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcel) : null));
        } else if (i10 == 3) {
            de.blinkt.openvpn.core.c.v(parcel.readLong(), parcel.readLong());
        } else {
            if (i10 != 4) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            de.blinkt.openvpn.core.c.u(parcel.readString());
        }
        return true;
    }

    @Override // j6.j
    public final void n0(long j10, long j11) {
        de.blinkt.openvpn.core.c.v(j10, j11);
    }

    @Override // j6.j
    public final void r1(String str) {
        de.blinkt.openvpn.core.c.u(str);
    }
}
