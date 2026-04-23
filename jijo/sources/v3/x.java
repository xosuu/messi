package v3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class x extends q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f17801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f17802h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f fVar, int i10, IBinder iBinder, Bundle bundle) {
        super(fVar, i10, bundle);
        this.f17802h = fVar;
        this.f17801g = iBinder;
    }

    @Override // v3.q
    public final void b(ConnectionResult connectionResult) {
        f fVar = this.f17802h;
        c cVar = fVar.f17759v;
        if (cVar != null) {
            cVar.t(connectionResult);
        }
        fVar.f17741d = connectionResult.f2470b;
        fVar.f17742e = System.currentTimeMillis();
    }

    @Override // v3.q
    public final boolean c() {
        String interfaceDescriptor;
        f fVar;
        IBinder iBinder = this.f17801g;
        try {
            z3.a.l(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            fVar = this.f17802h;
        } catch (RemoteException unused) {
        }
        if (!fVar.h().equals(interfaceDescriptor)) {
            fVar.h();
            return false;
        }
        IInterface iInterfaceD = fVar.d(iBinder);
        if (iInterfaceD != null && (f.l(fVar, 2, 4, iInterfaceD) || f.l(fVar, 3, 4, iInterfaceD))) {
            fVar.f17763z = null;
            Bundle connectionHint = fVar.getConnectionHint();
            b bVar = fVar.f17758u;
            if (bVar == null) {
                return true;
            }
            bVar.r(connectionHint);
            return true;
        }
        return false;
    }
}
