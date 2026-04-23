package j6;

import android.os.Binder;
import android.os.Parcel;
import de.blinkt.openvpn.core.OpenVPNService;

/* JADX INFO: loaded from: classes.dex */
public final class r extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OpenVPNService f14411a;

    public r(OpenVPNService openVPNService) {
        this.f14411a = openVPNService;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 16777215) {
            return super.onTransact(i10, parcel, parcel2, i11);
        }
        this.f14411a.onRevoke();
        return true;
    }
}
