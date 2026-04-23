package p2;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16236a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Network f16237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConnectivityManager f16238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f16239d;

    public e(g gVar, ConnectivityManager connectivityManager) {
        this.f16239d = gVar;
        this.f16238c = connectivityManager;
    }

    public final void a(Network network) {
        if (this.f16236a) {
            this.f16236a = false;
            b(network);
        } else {
            if (network.equals(this.f16237b)) {
                return;
            }
            b(network);
            f fVar = this.f16239d.f16240a;
            if (fVar != null) {
                ((ca.psiphon.a) fVar).a();
            }
        }
    }

    public final void b(Network network) {
        ConnectivityManager connectivityManager = this.f16238c;
        this.f16237b = network;
        g gVar = this.f16239d;
        if (network == null) {
            gVar.f16242c.set("NONE");
            gVar.f16243d.set(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            ((PsiphonVPNService) gVar.f16244e).k("NetworkMonitor: clear current active network");
            return;
        }
        String str = "UNKNOWN";
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities.hasTransport(0)) {
                str = "MOBILE";
            } else if (networkCapabilities.hasTransport(1)) {
                str = "WIFI";
            }
        } catch (Exception unused) {
        }
        gVar.f16242c.set(str);
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<InetAddress> it = connectivityManager.getLinkProperties(network).getDnsServers().iterator();
            while (it.hasNext()) {
                String string = it.next().toString();
                if (string.startsWith("/")) {
                    string = string.substring(1);
                }
                arrayList.add(string);
            }
        } catch (Exception unused2) {
        }
        AtomicReference atomicReference = gVar.f16243d;
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                } else {
                    sb.append((CharSequence) ",");
                }
            }
        }
        atomicReference.set(sb.toString());
        String strConcat = "NetworkMonitor: set current active network ".concat(str);
        if (!arrayList.isEmpty()) {
            strConcat = g1.a.y(strConcat, " with DNS");
        }
        ((PsiphonVPNService) gVar.f16244e).k(strConcat);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        super.onAvailable(network);
        if (Build.VERSION.SDK_INT >= 26) {
            return;
        }
        a(network);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
        if (Build.VERSION.SDK_INT >= 23 && networkCapabilities.hasCapability(16)) {
            a(network);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
        if (network.equals(this.f16237b)) {
            b(null);
            f fVar = this.f16239d.f16240a;
            if (fVar != null) {
                ((ca.psiphon.a) fVar).a();
            }
        }
    }
}
