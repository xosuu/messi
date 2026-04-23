package v3;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f17800b;

    public w(f fVar, int i10) {
        this.f17800b = fVar;
        this.f17799a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f fVar = this.f17800b;
        if (iBinder == null) {
            f.k(fVar);
            return;
        }
        synchronized (fVar.f17751n) {
            try {
                f fVar2 = this.f17800b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                fVar2.f17752o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof s)) ? new s(iBinder) : (s) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar3 = this.f17800b;
        int i10 = this.f17799a;
        fVar3.getClass();
        y yVar = new y(fVar3, 0);
        u uVar = fVar3.f17749l;
        uVar.sendMessage(uVar.obtainMessage(7, i10, -1, yVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        f fVar;
        synchronized (this.f17800b.f17751n) {
            fVar = this.f17800b;
            fVar.f17752o = null;
        }
        int i10 = this.f17799a;
        u uVar = fVar.f17749l;
        uVar.sendMessage(uVar.obtainMessage(6, i10, 1));
    }
}
