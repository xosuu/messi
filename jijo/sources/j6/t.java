package j6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import de.blinkt.openvpn.core.LogItem;
import de.blinkt.openvpn.core.OpenVPNStatusService;
import de.blinkt.openvpn.core.TrafficHistory;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class t extends Binder implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14416a = 0;

    @Override // j6.h
    public final TrafficHistory H0() {
        return de.blinkt.openvpn.core.c.f12584k;
    }

    @Override // j6.h
    public final String K() {
        return de.blinkt.openvpn.core.c.f12582i;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 >= 1 && i10 <= 16777215) {
            parcel.enforceInterface("de.blinkt.openvpn.core.IServiceStatus");
        }
        if (i10 == 1598968902) {
            parcel2.writeString("de.blinkt.openvpn.core.IServiceStatus");
            return true;
        }
        j jVar = null;
        j jVar2 = null;
        if (i10 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("de.blinkt.openvpn.core.IStatusCallbacks");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j)) {
                    i iVar = new i();
                    iVar.f14396a = strongBinder;
                    jVar = iVar;
                } else {
                    jVar = (j) iInterfaceQueryLocalInterface;
                }
            }
            ParcelFileDescriptor parcelFileDescriptorS0 = s0(jVar);
            parcel2.writeNoException();
            if (parcelFileDescriptorS0 != null) {
                parcel2.writeInt(1);
                parcelFileDescriptorS0.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
        } else if (i10 == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("de.blinkt.openvpn.core.IStatusCallbacks");
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof j)) {
                    i iVar2 = new i();
                    iVar2.f14396a = strongBinder2;
                    jVar2 = iVar2;
                } else {
                    jVar2 = (j) iInterfaceQueryLocalInterface2;
                }
            }
            OpenVPNStatusService.f12560a.unregister(jVar2);
            parcel2.writeNoException();
        } else if (i10 == 3) {
            String str = de.blinkt.openvpn.core.c.f12582i;
            parcel2.writeNoException();
            parcel2.writeString(str);
        } else if (i10 == 4) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            d6.a aVarA = d6.a.a(UUID.fromString(string));
            if (i12 == 2) {
                aVarA.f12464b = string2;
            } else if (i12 == 3) {
                aVarA.f12465d = string2;
            }
            parcel2.writeNoException();
        } else {
            if (i10 != 5) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            TrafficHistory trafficHistory = de.blinkt.openvpn.core.c.f12584k;
            parcel2.writeNoException();
            if (trafficHistory != null) {
                parcel2.writeInt(1);
                trafficHistory.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
        }
        return true;
    }

    @Override // j6.h
    public final ParcelFileDescriptor s0(j jVar) throws RemoteException {
        LogItem[] logItemArrD = de.blinkt.openvpn.core.c.d();
        u uVar = OpenVPNStatusService.f12562d;
        if (uVar != null) {
            jVar.U0(uVar.f14417a, uVar.f14418b, uVar.f14421e, uVar.f14419c, uVar.f14420d);
        }
        OpenVPNStatusService.f12560a.register(jVar);
        try {
            ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
            new s(this, parcelFileDescriptorArrCreatePipe, logItemArrD).start();
            return parcelFileDescriptorArrCreatePipe[0];
        } catch (IOException e10) {
            throw new RemoteException(e10.getMessage());
        }
    }
}
