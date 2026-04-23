package j6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class d implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f14390a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BlockingQueue f14391b;

    public d(LinkedBlockingQueue linkedBlockingQueue) {
        this.f14391b = linkedBlockingQueue;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        i6.d dVar;
        if (this.f14390a) {
            return;
        }
        this.f14390a = true;
        try {
            BlockingQueue blockingQueue = this.f14391b;
            int i10 = i6.c.f14176a;
            if (iBinder == null) {
                dVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("de.blinkt.openvpn.api.ExternalCertificateProvider");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof i6.d)) {
                    i6.b bVar = new i6.b();
                    bVar.f14175a = iBinder;
                    dVar = bVar;
                } else {
                    dVar = (i6.d) iInterfaceQueryLocalInterface;
                }
            }
            blockingQueue.put(dVar);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
