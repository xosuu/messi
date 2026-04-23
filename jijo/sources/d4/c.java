package d4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i12 = a.f12355a;
        Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        zzc zzcVarCreateFromParcel = parcel.readInt() == 0 ? null : zzc.CREATOR.createFromParcel(parcel);
        g gVar = (g) this;
        q3.b bVar = zzcVarCreateFromParcel != null ? new q3.b(zzcVarCreateFromParcel.f2453a, zzcVarCreateFromParcel.f2454b) : null;
        int i13 = statusCreateFromParcel.f2481a;
        k4.e eVar = gVar.f12360a;
        if (i13 <= 0) {
            eVar.f14669a.f(bVar);
            return true;
        }
        eVar.f14669a.e(new ApiException(statusCreateFromParcel));
        return true;
    }
}
