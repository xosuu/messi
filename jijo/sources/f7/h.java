package f7;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.text.Editable;
import android.widget.EditText;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.internal.ads.fb1;
import f.g0;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Vector;
import org.bugs4u.proxyserver.core.Tun2Socks;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.activities.GeneratedConfig;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.sockets.psiphon.PsiphonVPNService;
import team.dev.epro.apkcustom.sockets.socks.SocksVPNService;
import team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService;
import team.dev.epro.apkcustom.widgets.jsonhighlight.CodeView;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13287b;

    public /* synthetic */ h(int i10, Object obj) {
        this.f13286a = i10;
        this.f13287b = obj;
    }

    private void a() {
        while (true) {
            long jA = ((i) this.f13287b).a(System.nanoTime());
            if (jA == -1) {
                return;
            }
            if (jA > 0) {
                long j10 = jA / 1000000;
                long j11 = jA - (1000000 * j10);
                synchronized (((i) this.f13287b)) {
                    try {
                        ((i) this.f13287b).wait(j10, (int) j11);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    private void b() {
        String string;
        String string2;
        boolean z9;
        String strN0;
        String strN02;
        SSHTunnelService sSHTunnelService = (SSHTunnelService) this.f13287b;
        boolean z10 = SSHTunnelService.W;
        sSHTunnelService.getClass();
        try {
            if (App.f17100w.f17415a.getBoolean("reqBlock", false)) {
                try {
                    team.dev.epro.apkcustom.widgets.j jVar = App.f17101x;
                    z9 = Boolean.parseBoolean(jVar.l0(jVar.i0())[9]);
                } catch (IndexOutOfBoundsException unused) {
                    z9 = false;
                }
                team.dev.epro.apkcustom.widgets.j jVar2 = App.f17101x;
                if (jVar2.l0(jVar2.i0())[1].isEmpty()) {
                    strN0 = App.f17101x.n0();
                } else {
                    team.dev.epro.apkcustom.widgets.j jVar3 = App.f17101x;
                    strN0 = jVar3.l0(jVar3.i0())[1];
                }
                if (z9) {
                    if (App.f17101x.n0().isEmpty()) {
                        team.dev.epro.apkcustom.widgets.j jVar4 = App.f17101x;
                        strN02 = jVar4.l0(jVar4.i0())[1];
                    } else {
                        strN02 = App.f17101x.n0();
                    }
                    strN0 = strN02;
                }
                if (strN0.trim().split("@")[0].split(":")[0].isEmpty()) {
                    InetAddress[] inetAddressArrH = team.dev.epro.apkcustom.widgets.e.h(App.f17100w.f17415a.getString("ip_ssh", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).split("@")[0].split(":")[0]);
                    if (inetAddressArrH != null) {
                        for (InetAddress inetAddress : inetAddressArrH) {
                            if (inetAddress instanceof Inet4Address) {
                                sSHTunnelService.C.b(new l5.f(inetAddress.getHostAddress(), 32), false);
                            }
                        }
                    }
                } else {
                    InetAddress[] inetAddressArrH2 = team.dev.epro.apkcustom.widgets.e.h(strN0.split("//").length > 1 ? strN0.trim().split("//")[1].split("@")[0].split(":")[0] : strN0.trim().split("@")[0].split(":")[0]);
                    if (inetAddressArrH2 != null) {
                        for (InetAddress inetAddress2 : inetAddressArrH2) {
                            if (inetAddress2 instanceof Inet4Address) {
                                sSHTunnelService.C.b(new l5.f(inetAddress2.getHostAddress(), 32), false);
                            }
                        }
                    }
                }
            } else {
                InetAddress[] inetAddressArrH3 = team.dev.epro.apkcustom.widgets.e.h(App.f17100w.f17415a.getString("ip_ssh", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).split("@")[0].split(":")[0]);
                if (inetAddressArrH3 != null) {
                    for (InetAddress inetAddress3 : inetAddressArrH3) {
                        if (inetAddress3 instanceof Inet4Address) {
                            sSHTunnelService.C.b(new l5.f(inetAddress3.getHostAddress(), 32), false);
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        if (App.f17100w.f17415a.getBoolean("chk_slowDns", false)) {
            team.dev.epro.apkcustom.widgets.j jVar5 = App.f17101x;
            try {
                if (Integer.parseInt(jVar5.l0(jVar5.i0())[27]) >= Integer.parseInt("288") || App.f17101x.i0().isEmpty()) {
                    if (App.f17100w.f17415a.getString("dns_slowdns_edit", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                        team.dev.epro.apkcustom.widgets.j jVar6 = App.f17101x;
                        string = jVar6.l0(jVar6.i0())[31];
                        if (string.isEmpty()) {
                            string = App.f17100w.f17415a.getString("dns_slowdns", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                    } else {
                        string = App.f17100w.f17415a.getString("dns_slowdns_edit", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                    sSHTunnelService.I = string;
                    if (string.contains("://")) {
                        sSHTunnelService.V = true;
                        sSHTunnelService.J = string;
                        try {
                            string = new URL(string).getHost();
                        } catch (MalformedURLException unused3) {
                        }
                    } else {
                        sSHTunnelService.V = false;
                        String[] strArrSplit = string.split(":");
                        if (strArrSplit.length == 2) {
                            String str = strArrSplit[0];
                            sSHTunnelService.K = strArrSplit[1];
                            string = str;
                        } else {
                            string = strArrSplit[0];
                            sSHTunnelService.K = "53";
                        }
                        sSHTunnelService.J = string;
                        if (sSHTunnelService.K.trim().equals("443")) {
                            sSHTunnelService.V = true;
                        }
                    }
                    InetAddress[] inetAddressArrH4 = team.dev.epro.apkcustom.widgets.e.h(string);
                    if (inetAddressArrH4 != null) {
                        for (InetAddress inetAddress4 : inetAddressArrH4) {
                            if (inetAddress4 instanceof Inet4Address) {
                                if (!sSHTunnelService.V) {
                                    sSHTunnelService.J = inetAddress4.getHostAddress();
                                } else if (inetAddress4.getHostAddress() != null) {
                                    if (string.contains("cloudflare-dns.com")) {
                                        sSHTunnelService.J = sSHTunnelService.J.replace(string, "1.1.1.1");
                                    } else {
                                        sSHTunnelService.J = sSHTunnelService.J.replace(string, inetAddress4.getHostAddress());
                                    }
                                }
                                sSHTunnelService.C.b(new l5.f(inetAddress4.getHostAddress(), 32), false);
                            }
                        }
                    }
                } else {
                    if (App.f17100w.f17415a.getString("dns_slowdns_edit", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty()) {
                        string2 = App.f17100w.f17415a.getString("ip_ssh", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).split("@")[0].split(":")[0];
                        if (string2.isEmpty()) {
                            string2 = App.f17100w.f17415a.getString("dns_slowdns", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        }
                    } else {
                        string2 = App.f17100w.f17415a.getString("dns_slowdns_edit", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    }
                    InetAddress[] inetAddressArrH5 = team.dev.epro.apkcustom.widgets.e.h(string2);
                    if (inetAddressArrH5 != null) {
                        for (InetAddress inetAddress5 : inetAddressArrH5) {
                            if (inetAddress5 instanceof Inet4Address) {
                                sSHTunnelService.J = inetAddress5.getHostAddress();
                                sSHTunnelService.C.b(new l5.f(inetAddress5.getHostAddress(), 32), false);
                            }
                        }
                    }
                }
            } catch (Exception unused4) {
            }
        }
        sSHTunnelService.H = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SocksVPNService socksVPNService;
        switch (this.f13286a) {
            case 0:
                a();
                return;
            case 1:
                App.f17100w.f17415a.edit().putString(new String(App.f17101x.z(0)), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).commit();
                l.a0.o(App.f17100w.f17415a, "note", false);
                fb1.q(App.f17100w.f17415a, "server", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                fb1.q(App.f17100w.f17415a, "note_cfg", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                App.f17101x.o0();
                Object obj = this.f13287b;
                MainActivity mainActivity = (MainActivity) obj;
                a9.b bVar = MainActivity.N0;
                mainActivity.x(false);
                if (de.blinkt.openvpn.core.c.e()) {
                    j6.c0.k(mainActivity);
                    if (mainActivity.K0 != null) {
                        try {
                            ((MainActivity) obj).K0.I(false);
                        } catch (RemoteException unused) {
                            LinkedList linkedList = de.blinkt.openvpn.core.c.f12574a;
                        }
                    }
                    break;
                }
                if (App.f17101x.Y(App.f17099v, SSHTunnelService.class)) {
                    Intent intent = new Intent(App.f17099v, (Class<?>) SSHTunnelService.class);
                    intent.setAction("stop");
                    b4.f.Q(mainActivity, intent);
                }
                if (App.f17101x.Y(App.f17099v, PsiphonVPNService.class)) {
                    Intent intent2 = new Intent(App.f17099v, (Class<?>) PsiphonVPNService.class);
                    intent2.setAction("stop");
                    b4.f.Q(mainActivity, intent2);
                }
                if (App.f17101x.Y(App.f17099v, V2RayVpnService.class)) {
                    Intent intent3 = new Intent(App.f17099v, (Class<?>) V2RayVpnService.class);
                    intent3.setAction("stop");
                    b4.f.Q(mainActivity, intent3);
                }
                if (!App.f17100w.f17415a.getBoolean("mainFragment", true)) {
                    t8.a0 a0Var = mainActivity.P;
                    if (a0Var != null) {
                        a0Var.g0();
                        mainActivity.P.h0();
                        mainActivity.P.b0();
                        return;
                    }
                    return;
                }
                t8.m mVar = mainActivity.O;
                if (mVar != null) {
                    mVar.h0();
                    mainActivity.O.j0();
                    mainActivity.O.g0();
                    mainActivity.O.l0();
                    mainActivity.O.k0();
                    mainActivity.O.i0();
                    mainActivity.O.Z();
                    return;
                }
                return;
            case 2:
                boolean zIsEmpty = App.f17100w.f17415a.getString("generateCfgVPN", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).isEmpty();
                Object obj2 = this.f13287b;
                if (zIsEmpty) {
                    j6.s sVar = (j6.s) obj2;
                    ((EditText) sVar.f14414d).setText(((GeneratedConfig) sVar.f14415f).G);
                    return;
                } else if (App.f17100w.f17415a.getString("cfgVPN", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).equals(App.f17100w.f17415a.getString("generateCfgVPN", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED))) {
                    ((EditText) ((j6.s) obj2).f14414d).setText(App.f17100w.f17415a.getString("generateCfgVPN", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
                    return;
                } else {
                    j6.s sVar2 = (j6.s) obj2;
                    ((EditText) sVar2.f14414d).setText(((GeneratedConfig) sVar2.f14415f).G);
                    return;
                }
            case 3:
                if (SSHTunnelService.Y && SSHTunnelService.Z && !SSHTunnelService.X) {
                    ((t8.m) ((g0) this.f13287b).f12842b).f17079y0.setText(R.string.ar);
                    ((t8.m) ((g0) this.f13287b).f12842b).b0();
                    t8.m mVar2 = (t8.m) ((g0) this.f13287b).f12842b;
                    InterstitialAd interstitialAd = mVar2.C0;
                    if (interstitialAd != null) {
                        interstitialAd.show(mVar2.c());
                        return;
                    }
                    return;
                }
                if (SSHTunnelService.f17280b0 && !SSHTunnelService.Z) {
                    ((t8.m) ((g0) this.f13287b).f12842b).f17079y0.setText(R.string.aq);
                    ((t8.m) ((g0) this.f13287b).f12842b).c0();
                    return;
                } else if (SSHTunnelService.W) {
                    ((t8.m) ((g0) this.f13287b).f12842b).f17079y0.setText(R.string.cy);
                    ((t8.m) ((g0) this.f13287b).f12842b).b0();
                    return;
                } else {
                    if (SSHTunnelService.X) {
                        ((t8.m) ((g0) this.f13287b).f12842b).f17079y0.setText(R.string.cz);
                        ((t8.m) ((g0) this.f13287b).f12842b).b0();
                        return;
                    }
                    return;
                }
            case 4:
                t8.a0 a0Var2 = ((t8.v) this.f13287b).f17092d.f17093a;
                int i10 = t8.a0.Z0;
                a0Var2.u0(0, R.string.r7, 100);
                return;
            case 5:
                t8.a0 a0Var3 = (t8.a0) this.f13287b;
                int i11 = t8.a0.Z0;
                a0Var3.u0(3, R.string.xv, 100);
                return;
            case 6:
                b();
                return;
            case 7:
                Object obj3 = this.f13287b;
                try {
                    String strU0 = App.f17101x.u0();
                    int iQ = App.f17101x.Q(strU0);
                    String strR = App.f17101x.R(strU0);
                    ((SocksVPNService) obj3).f17318h.setSession(((SocksVPNService) obj3).f17315b);
                    ((SocksVPNService) obj3).f17318h.setConfigureIntent(((SocksVPNService) obj3).b());
                    ((SocksVPNService) obj3).f17318h.setMtu(1500);
                    ((SocksVPNService) obj3).f17318h.addAddress(strU0, iQ);
                    ((SocksVPNService) obj3).f17318h.addDnsServer("8.8.8.8");
                    ((SocksVPNService) obj3).f17318h.addDnsServer("8.8.4.4");
                    ((SocksVPNService) obj3).f17317f.b(new l5.f("8.8.8.8", 32), true);
                    ((SocksVPNService) obj3).f17317f.b(new l5.f("8.8.4.4", 32), true);
                    ((SocksVPNService) obj3).f17317f.b(new l5.f("0.0.0.0", 0), true);
                    ((SocksVPNService) obj3).f17317f.b(new l5.f("10.0.0.0", 8), false);
                    ((SocksVPNService) obj3).f17317f.b(new l5.f("172.16.0.0", 12), false);
                    ((SocksVPNService) obj3).f17317f.b(new l5.f("192.168.0.0", 16), false);
                    ((SocksVPNService) obj3).f17317f.b(new l5.f("169.254.1.0", 24), false);
                    if (((SocksVPNService) obj3).f17323v != null) {
                        ((SocksVPNService) obj3).f17317f.b(new l5.f(InetAddress.getByName(((SocksVPNService) obj3).f17323v.trim()).getHostAddress(), 32), false);
                    }
                    Vector<j6.k> vectorJ = ((SocksVPNService) obj3).f17317f.j();
                    j6.k kVar = new j6.k(new l5.f("224.0.0.0", 3), true);
                    for (j6.k kVar2 : vectorJ) {
                        try {
                            if (!kVar.a(kVar2)) {
                                ((SocksVPNService) obj3).f17318h.addRoute(kVar2.e(), kVar2.f14398b);
                            }
                        } catch (IllegalArgumentException unused2) {
                        }
                    }
                    try {
                        ((SocksVPNService) obj3).f17318h.addDisallowedApplication(((SocksVPNService) obj3).getPackageName());
                        break;
                    } catch (PackageManager.NameNotFoundException unused3) {
                    }
                    ((SocksVPNService) obj3).f17316d = ((SocksVPNService) obj3).f17318h.establish();
                    if (((SocksVPNService) obj3).f17316d == null) {
                        ((SocksVPNService) obj3).e();
                        StringBuilder sb = new StringBuilder();
                        sb.append("[");
                        sb.append(((SocksVPNService) obj3).f17320s.format(new Date()));
                        sb.append("] <font color=");
                        String str = team.dev.epro.apkcustom.widgets.a.f17390c;
                        sb.append(str);
                        sb.append(">VPNService can't establish, any 2 ways to fix it choose one of both");
                        b7.u.h("TAG", sb.toString());
                        b7.u.h("TAG", "[" + ((SocksVPNService) obj3).f17320s.format(new Date()) + "] <font color=" + str + ">1. restart device");
                        b7.u.h("TAG", "[" + ((SocksVPNService) obj3).f17320s.format(new Date()) + "] <font color=" + str + ">2. open another application that uses vpn service like openvpn, then back again to H.C");
                        socksVPNService = (SocksVPNService) obj3;
                    } else {
                        b7.u.r("TAG", "[" + ((SocksVPNService) obj3).f17320s.format(new Date()) + "] <font color=" + team.dev.epro.apkcustom.widgets.a.f17392e + ">" + ((SocksVPNService) obj3).getString(R.string.b0));
                        ((SocksVPNService) obj3).c(Crypt.a(Crypt.xrc("IncKgb\u001cg<@m?\u0019hbKf?K;8\u001a<hIgm\u001c<k@9")), App.f17100w.f17415a.getString("dns1", "8.8.8.8"), App.f17100w.f17415a.getString("dns2", "8.8.4.4"), SSHTunnelService.f17281c0, SSHTunnelService.f17282d0);
                        Tun2Socks.Start(((SocksVPNService) obj3).f17316d, 1500, strR, "255.255.255.0", "127.0.0.1:1082", strU0 + ":8091", "127.0.0.1:1082", true);
                        socksVPNService = (SocksVPNService) obj3;
                    }
                } catch (Exception unused4) {
                    socksVPNService = (SocksVPNService) obj3;
                } catch (Throwable th) {
                    Locale.setDefault(((SocksVPNService) obj3).f17319q);
                    throw th;
                }
                Locale.setDefault(socksVPNService.f17319q);
                return;
            default:
                CodeView codeView = (CodeView) this.f13287b;
                Editable text = codeView.getText();
                codeView.A = false;
                codeView.d(text);
                codeView.A = true;
                return;
        }
    }
}
