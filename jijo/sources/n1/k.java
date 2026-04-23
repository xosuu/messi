package n1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.hc;
import de.blinkt.openvpn.core.LogItem;
import j6.e0;
import j6.t;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.LinkedList;
import t8.a0;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.activities.DisconnectVPN;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15847b;

    public /* synthetic */ k(int i10, Object obj) {
        this.f15846a = i10;
        this.f15847b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f fVar;
        int i10 = this.f15846a;
        j6.h hVar = null;
        Object obj = this.f15847b;
        switch (i10) {
            case 0:
                hc hcVar = (hc) obj;
                int i11 = n.f15849b;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof f)) {
                        e eVar = new e();
                        eVar.f15830a = iBinder;
                        fVar = eVar;
                    } else {
                        fVar = (f) iInterfaceQueryLocalInterface;
                    }
                } else {
                    fVar = null;
                }
                hcVar.f5252a = fVar;
                throw null;
            case 1:
                int i12 = t.f14416a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("de.blinkt.openvpn.core.IServiceStatus");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof j6.h)) {
                        j6.g gVar = new j6.g();
                        gVar.f14395a = iBinder;
                        hVar = gVar;
                    } else {
                        hVar = (j6.h) iInterfaceQueryLocalInterface2;
                    }
                }
                try {
                    if (iBinder.queryLocalInterface("de.blinkt.openvpn.core.IServiceStatus") == null) {
                        de.blinkt.openvpn.core.c.u(hVar.K());
                        de.blinkt.openvpn.core.c.f12584k = hVar.H0();
                        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(hVar.s0(((e0) obj).f14394b)));
                        byte[] bArr = new byte[65336];
                        for (short s9 = dataInputStream.readShort(); s9 != Short.MAX_VALUE; s9 = dataInputStream.readShort()) {
                            dataInputStream.readFully(bArr, 0, s9);
                            de.blinkt.openvpn.core.c.r(new LogItem(bArr, s9));
                        }
                        dataInputStream.close();
                        return;
                    }
                    return;
                } catch (RemoteException | IOException unused) {
                    LinkedList linkedList = de.blinkt.openvpn.core.c.f12574a;
                    return;
                }
            case 2:
                ((MainActivity) obj).K0 = j6.o.m(iBinder);
                return;
            case 3:
                ((DisconnectVPN) obj).f17139a = j6.o.m(iBinder);
                return;
            case 4:
                ((t8.m) obj).H0 = j6.o.m(iBinder);
                return;
            case 5:
                ((a0) obj).I0 = j6.o.m(iBinder);
                return;
            default:
                ((team.dev.epro.apkcustom.widgets.j) obj).f17434x = j6.o.m(iBinder);
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i10 = this.f15846a;
        Object obj = this.f15847b;
        switch (i10) {
            case 0:
                ((hc) obj).getClass();
                throw null;
            case 1:
                e0 e0Var = (e0) obj;
                LinkedList linkedList = de.blinkt.openvpn.core.c.f12574a;
                synchronized (de.blinkt.openvpn.core.c.class) {
                    de.blinkt.openvpn.core.c.f12575b.remove(e0Var);
                }
                return;
            case 2:
                ((MainActivity) obj).K0 = null;
                return;
            case 3:
                ((DisconnectVPN) obj).f17139a = null;
                return;
            case 4:
                ((t8.m) obj).H0 = null;
                return;
            case 5:
                ((a0) obj).I0 = null;
                return;
            default:
                ((team.dev.epro.apkcustom.widgets.j) obj).f17434x = null;
                return;
        }
    }
}
