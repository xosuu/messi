package j4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.signin.internal.zak;
import l.j;
import u3.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends Binder implements e, IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* JADX INFO: renamed from: u1, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        switch (i10) {
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                return false;
            case 6:
                break;
            case 7:
                break;
            case 8:
                zak zakVar = (zak) e4.b.a(parcel, zak.CREATOR);
                y yVar = (y) this;
                yVar.f17632b.post(new j(yVar, 17, zakVar));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
