package k;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.x0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.UUID;
import team.dev.epro.apkcustom.App;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14509b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14510d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f14511f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f14512h;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f14508a = i10;
        this.f14512h = obj;
        this.f14509b = obj2;
        this.f14510d = obj3;
        this.f14511f = obj4;
    }

    public final void a() throws IOException {
        ((Socket) this.f14509b).setSoTimeout(180000);
        this.f14510d = ((Socket) this.f14509b).getInputStream();
        OutputStream outputStream = ((Socket) this.f14509b).getOutputStream();
        this.f14511f = outputStream;
        l.q qVar = new l.q((InputStream) this.f14510d, outputStream);
        try {
            if (qVar.a()) {
                if (qVar.k()) {
                    if (((r7.a) qVar.f14973e) != r7.a.CONNECT) {
                        qVar.l(8);
                        return;
                    }
                    String hostAddress = (String) qVar.f14975g;
                    if (hostAddress == null) {
                        hostAddress = ((InetAddress) qVar.f14974f).getHostAddress();
                    }
                    if (((Socket) this.f14509b).getInetAddress().getHostAddress() != null && ((((Socket) this.f14509b).getInetAddress().getHostAddress().startsWith(App.f17101x.K().substring(0, App.f17101x.K().lastIndexOf("."))) || ((Socket) this.f14509b).getInetAddress().getHostAddress().startsWith(App.f17101x.L().substring(0, App.f17101x.L().lastIndexOf("."))) || ((Socket) this.f14509b).getInetAddress().getHostAddress().startsWith(App.f17101x.J().substring(0, App.f17101x.J().lastIndexOf("."))) || ((Socket) this.f14509b).getInetAddress().getHostAddress().startsWith(App.f17101x.M().substring(0, App.f17101x.M().lastIndexOf(".")))) && !((Socket) this.f14509b).getInetAddress().getHostAddress().equals("127.0.0.1") && App.f17100w.f17415a.getBoolean("log_tether", false))) {
                        StringBuilder sb = new StringBuilder("[");
                        g1.a.w(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), sb, "] <font color=");
                        sb.append(team.dev.epro.apkcustom.widgets.a.f17392e);
                        sb.append(">");
                        sb.append(App.f17099v.getString(R.string.bl));
                        sb.append("</font>: Socks5 ");
                        sb.append(((r7.a) qVar.f14973e).toString().toLowerCase());
                        sb.append(" to ");
                        sb.append(hostAddress);
                        sb.append(" port ");
                        sb.append(qVar.f14970b);
                        sb.append(" from client ");
                        sb.append(((Socket) this.f14509b).getInetAddress().getHostAddress());
                        b7.u.r("TAG", sb.toString());
                    }
                    try {
                        try {
                            try {
                                b6.a aVarS = ((b6.e) this.f14512h).f1373a.s(hostAddress, qVar.f14970b);
                                qVar.l(1);
                                try {
                                    b6.j jVar = new b6.j(aVarS, null, (Socket) this.f14509b, (b6.b) aVarS.f1345d.f14297a, (OutputStream) this.f14511f, "RemoteToLocal");
                                    b6.j jVar2 = new b6.j(aVarS, jVar, (Socket) this.f14509b, (InputStream) this.f14510d, aVarS.f1344c, "LocalToRemote");
                                    jVar.setDaemon(true);
                                    jVar2.setDaemon(true);
                                    jVar.start();
                                    jVar2.start();
                                } catch (IOException e10) {
                                    aVarS.f1343b.e(aVarS, "Weird error during creation of StreamForwarder (" + e10.getMessage() + ")");
                                }
                            } catch (IOException unused) {
                                ((Socket) this.f14509b).close();
                            }
                        } catch (IOException unused2) {
                        }
                    } catch (IOException unused3) {
                        qVar.l(2);
                        ((Socket) this.f14509b).close();
                    }
                }
            }
        } catch (IOException unused4) {
            qVar.l(2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        l2.j jVarH;
        int i10 = this.f14508a;
        Object obj = this.f14512h;
        switch (i10) {
            case 0:
                h hVar = (h) this.f14509b;
                if (hVar != null) {
                    m2.f fVar = (m2.f) obj;
                    ((i) fVar.f15701b).M = true;
                    hVar.f14515b.c(false);
                    ((i) fVar.f15701b).M = false;
                }
                if (((MenuItem) this.f14510d).isEnabled() && ((MenuItem) this.f14510d).hasSubMenu()) {
                    ((o) this.f14511f).q((MenuItem) this.f14510d, null, 4);
                    return;
                }
                return;
            case 1:
                x0 x0Var = (x0) this.f14509b;
                View view = (View) this.f14510d;
                Rect rect = (Rect) this.f14511f;
                x0Var.getClass();
                x0.g(view, rect);
                return;
            case 2:
                try {
                    boolean booleanExtra = ((Intent) this.f14509b).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = ((Intent) this.f14509b).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) this.f14509b).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) this.f14509b).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    c2.n nVarI = c2.n.i();
                    int i11 = ConstraintProxyUpdateReceiver.f1188a;
                    String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4));
                    nVarI.g(new Throwable[0]);
                    m2.g.a((Context) this.f14510d, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    m2.g.a((Context) this.f14510d, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    m2.g.a((Context) this.f14510d, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    m2.g.a((Context) this.f14510d, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) this.f14511f).finish();
                }
            case 3:
                String string = ((UUID) this.f14509b).toString();
                c2.n nVarI2 = c2.n.i();
                int i12 = m2.p.f15729c;
                String.format("Updating progress for %s (%s)", (UUID) this.f14509b, (c2.f) this.f14510d);
                nVarI2.g(new Throwable[0]);
                m2.p pVar = (m2.p) obj;
                WorkDatabase workDatabase = pVar.f15730a;
                WorkDatabase workDatabase2 = pVar.f15730a;
                workDatabase.c();
                try {
                    jVarH = ((m2.p) obj).f15730a.n().h(string);
                } finally {
                    try {
                    } finally {
                    }
                    break;
                }
                if (jVarH == null) {
                    throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                if (jVarH.f15143b == c2.w.f1548b) {
                    ((m2.p) obj).f15730a.m().p(new l2.g(string, (c2.f) this.f14510d));
                } else {
                    c2.n nVarI3 = c2.n.i();
                    String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string);
                    nVarI3.n(new Throwable[0]);
                }
                ((n2.i) this.f14511f).j(null);
                ((m2.p) obj).f15730a.h();
                return;
            default:
                try {
                    try {
                        a();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } catch (IOException unused2) {
                    ((Socket) this.f14509b).close();
                    return;
                }
        }
    }

    public g(b6.e eVar, Socket socket) {
        this.f14508a = 4;
        this.f14512h = eVar;
        this.f14509b = socket;
        eVar.setName("DynamicAcceptRunnable");
    }
}
