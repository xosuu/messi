package n1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class n extends Binder implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f15849b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f15850a;

    public n(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f15850a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    public final int a0(d dVar, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (this.f15850a.f1111d) {
            try {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.f15850a;
                int i10 = multiInstanceInvalidationService.f1109a + 1;
                multiInstanceInvalidationService.f1109a = i10;
                if (multiInstanceInvalidationService.f1111d.register(dVar, Integer.valueOf(i10))) {
                    this.f15850a.f1110b.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f15850a;
                multiInstanceInvalidationService2.f1109a--;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final void m(int i10, String[] strArr) {
        synchronized (this.f15850a.f1111d) {
            try {
                String str = (String) this.f15850a.f1110b.get(Integer.valueOf(i10));
                if (str == null) {
                    return;
                }
                int iBeginBroadcast = this.f15850a.f1111d.beginBroadcast();
                for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                    try {
                        int iIntValue = ((Integer) this.f15850a.f1111d.getBroadcastCookie(i11)).intValue();
                        String str2 = (String) this.f15850a.f1110b.get(Integer.valueOf(iIntValue));
                        if (i10 != iIntValue && str.equals(str2)) {
                            try {
                                ((d) this.f15850a.f1111d.getBroadcastItem(i11)).Y(strArr);
                            } catch (RemoteException unused) {
                            }
                        }
                    } finally {
                        this.f15850a.f1111d.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.Binder
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        d dVar = null;
        d dVar2 = null;
        if (i10 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.f15829a = strongBinder;
                    dVar = cVar;
                } else {
                    dVar = (d) iInterfaceQueryLocalInterface;
                }
            }
            int iA0 = a0(dVar, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iA0);
            return true;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                m(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof d)) {
                c cVar2 = new c();
                cVar2.f15829a = strongBinder2;
                dVar2 = cVar2;
            } else {
                dVar2 = (d) iInterfaceQueryLocalInterface2;
            }
        }
        u1(dVar2, parcel.readInt());
        parcel2.writeNoException();
        return true;
    }

    public final void u1(d dVar, int i10) {
        synchronized (this.f15850a.f1111d) {
            this.f15850a.f1111d.unregister(dVar);
            this.f15850a.f1110b.remove(Integer.valueOf(i10));
        }
    }
}
