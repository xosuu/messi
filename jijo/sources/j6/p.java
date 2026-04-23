package j6;

import android.widget.ArrayAdapter;
import android.widget.Toast;
import com.google.android.gms.internal.ads.tp1;
import de.blinkt.openvpn.core.OpenVPNService;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;
import team.dev.epro.apkcustom.widgets.logger.LogView;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14405b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14406d;

    public /* synthetic */ p(Object obj, int i10, Object obj2) {
        this.f14404a = i10;
        this.f14406d = obj;
        this.f14405b = obj2;
    }

    private void a() {
        try {
            for (InetAddress inetAddress : InetAddress.getAllByName((String) this.f14405b)) {
                if (inetAddress instanceof Inet4Address) {
                    synchronized (this) {
                        this.f14406d = inetAddress;
                    }
                    return;
                }
            }
        } catch (UnknownHostException unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.f14404a) {
            case 0:
                Toast toast = ((OpenVPNService) this.f14406d).G;
                if (toast != null) {
                    toast.cancel();
                }
                String str = String.format(Locale.getDefault(), "%s - %s", ((OpenVPNService) this.f14406d).f12552s.f14124b, (String) this.f14405b);
                OpenVPNService openVPNService = (OpenVPNService) this.f14406d;
                openVPNService.G = Toast.makeText(openVPNService.getBaseContext(), str, 0);
                ((OpenVPNService) this.f14406d).G.show();
                return;
            case 1:
                break;
            case 2:
                if (((String) this.f14405b).equals("vpngate.csv")) {
                    t8.a0 a0Var = (t8.a0) this.f14406d;
                    int i11 = t8.a0.Z0;
                    a0Var.u0(0, R.string.ff, 100);
                    return;
                } else {
                    t8.a0 a0Var2 = (t8.a0) this.f14406d;
                    int i12 = t8.a0.Z0;
                    a0Var2.u0(3, R.string.xv, 100);
                    return;
                }
            case 3:
                String string = ((V2RayVpnService) this.f14406d).getString(R.string.bl);
                StringBuilder sb = new StringBuilder("[");
                g1.a.w(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), sb, "] <font color=");
                sb.append(team.dev.epro.apkcustom.widgets.a.f17390c);
                sb.append(">");
                sb.append((String) this.f14405b);
                b7.u.r(string, sb.toString());
                App.f17101x.d(team.dev.epro.apkcustom.widgets.a.f17391d, (String) this.f14405b);
                return;
            case 4:
                a();
                return;
            case 5:
                try {
                    InetAddress[] allByName = InetAddress.getAllByName((String) this.f14405b);
                    synchronized (this) {
                        this.f14406d = allByName;
                    }
                    return;
                } catch (UnknownHostException unused) {
                    return;
                }
            default:
                LogView logView = (LogView) this.f14406d;
                String string2 = ((StringBuilder) this.f14405b).toString();
                ArrayList arrayList = logView.f17450a;
                if (arrayList.size() > 500) {
                    ArrayAdapter arrayAdapter = logView.f17451b;
                    arrayAdapter.clear();
                    logView.getAdapter();
                    arrayAdapter.notifyDataSetChanged();
                }
                arrayList.add(string2);
                logView.f17451b.notifyDataSetChanged();
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f14405b).run();
            } catch (Throwable th) {
                tp1.k(n6.k.f15981a, th);
            }
            d7.f fVar = (d7.f) this.f14406d;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d7.f.f12491s;
            Runnable runnableF = fVar.F();
            if (runnableF == null) {
                return;
            }
            this.f14405b = runnableF;
            i10++;
            if (i10 >= 16 && ((d7.f) this.f14406d).f12492d.E()) {
                d7.f fVar2 = (d7.f) this.f14406d;
                fVar2.f12492d.D(fVar2, this);
                return;
            }
        }
    }

    public /* synthetic */ p(String str, int i10) {
        this.f14404a = i10;
        this.f14405b = str;
    }
}
