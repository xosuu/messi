package w3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import v3.g;
import v3.h;
import v3.l;

/* JADX INFO: loaded from: classes.dex */
public final class d extends h {
    public final l G;

    public d(Context context, Looper looper, g gVar, l lVar, u3.c cVar, u3.h hVar) {
        super(context, looper, 270, gVar, cVar, hVar);
        this.G = lVar;
    }

    @Override // v3.f
    public final IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // v3.f
    public final Bundle f() {
        l lVar = this.G;
        lVar.getClass();
        Bundle bundle = new Bundle();
        String str = lVar.f17778b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // v3.f
    public final Feature[] getApiFeatures() {
        return e4.c.f12717b;
    }

    @Override // v3.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // v3.f
    public final String h() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // v3.f
    public final String i() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // v3.f
    public final boolean j() {
        return true;
    }
}
