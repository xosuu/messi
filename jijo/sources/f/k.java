package f;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Pair;
import de.blinkt.openvpn.core.LogItem;
import de.blinkt.openvpn.core.OpenVPNStatusService;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f12887b;

    public k(DialogInterface dialogInterface) {
        this.f12886a = 0;
        this.f12887b = new WeakReference(dialogInterface);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        j6.j jVar;
        switch (this.f12886a) {
            case 0:
                int i10 = message.what;
                if (i10 == -3 || i10 == -2 || i10 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f12887b.get(), message.what);
                    break;
                } else if (i10 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    break;
                }
                break;
            default:
                WeakReference weakReference = this.f12887b;
                if (weakReference != null && weakReference.get() != null) {
                    RemoteCallbackList remoteCallbackList = OpenVPNStatusService.f12560a;
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                        try {
                            jVar = (j6.j) remoteCallbackList.getBroadcastItem(i11);
                        } catch (RemoteException unused) {
                        }
                        switch (message.what) {
                            case 100:
                                jVar.Q0((LogItem) message.obj);
                                continue;
                                break;
                            case 101:
                                j6.u uVar = (j6.u) message.obj;
                                jVar.U0(uVar.f14417a, uVar.f14418b, uVar.f14421e, uVar.f14419c, uVar.f14420d);
                                continue;
                                break;
                            case 102:
                                Pair pair = (Pair) message.obj;
                                jVar.n0(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
                                continue;
                                break;
                            case 103:
                                jVar.r1((String) message.obj);
                                continue;
                                break;
                            default:
                                continue;
                                break;
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                    break;
                }
                break;
        }
    }

    public k() {
        this.f12886a = 1;
        this.f12887b = null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10) {
        this();
        this.f12886a = 1;
    }
}
