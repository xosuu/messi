package j2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import c2.n;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.gu;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14290b;

    public /* synthetic */ e(int i10, Object obj) {
        this.f14289a = i10;
        this.f14290b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        switch (this.f14289a) {
            case 2:
                ((gu) this.f14290b).f5068o.set(true);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f14289a) {
            case 0:
                n nVarI = n.i();
                int i10 = f.f14291j;
                String.format("Network capabilities changed: %s", networkCapabilities);
                nVarI.g(new Throwable[0]);
                f fVar = (f) this.f14290b;
                fVar.c(fVar.f());
                return;
            case 1:
                synchronized (aa.class) {
                    ((aa) this.f14290b).f2626b = networkCapabilities;
                    break;
                }
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f14289a) {
            case 0:
                n nVarI = n.i();
                int i10 = f.f14291j;
                nVarI.g(new Throwable[0]);
                f fVar = (f) this.f14290b;
                fVar.c(fVar.f());
                return;
            case 1:
                synchronized (aa.class) {
                    ((aa) this.f14290b).f2626b = null;
                    break;
                }
                return;
            default:
                ((gu) this.f14290b).f5068o.set(false);
                return;
        }
    }
}
