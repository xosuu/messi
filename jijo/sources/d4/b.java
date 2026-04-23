package d4;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class b extends v3.h {
    @Override // v3.f
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder);
    }

    @Override // v3.f
    public final Feature[] getApiFeatures() {
        return q3.c.f16429b;
    }

    @Override // v3.f
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // v3.f
    public final String h() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // v3.f
    public final String i() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // v3.f
    public final boolean j() {
        return true;
    }

    @Override // v3.f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
