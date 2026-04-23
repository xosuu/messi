package d6;

import android.view.View;
import androidx.fragment.app.s;
import b7.u;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import f.g0;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import p7.h;
import t8.a0;
import t8.m;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.widgets.j;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class a implements j9.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static a f12462h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f12464b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12465d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Serializable f12466f;

    public /* synthetic */ a(int i10, s sVar, String str) {
        this.f12463a = i10;
        this.f12465d = sVar;
        this.f12464b = str;
        this.f12466f = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public static a a(UUID uuid) {
        a aVar = f12462h;
        if (aVar == null || !((UUID) aVar.f12466f).equals(uuid)) {
            f12462h = new a(uuid);
        }
        return f12462h;
    }

    public final Method b(Class cls) {
        Method method;
        Class cls2;
        String str = (String) this.f12464b;
        if (str == null) {
            return null;
        }
        try {
            method = cls.getMethod(str, (Class[]) this.f12465d);
        } catch (NoSuchMethodException unused) {
        }
        if ((method.getModifiers() & 1) == 0) {
            method = null;
        }
        if (method == null || (cls2 = (Class) this.f12466f) == null || cls2.isAssignableFrom(method.getReturnType())) {
            return method;
        }
        return null;
    }

    public final Object c(Object obj, Object... objArr) {
        Method methodB = b(obj.getClass());
        if (methodB == null) {
            throw new AssertionError("Method " + ((String) this.f12464b) + " not supported for object " + obj);
        }
        try {
            return methodB.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + methodB);
            assertionError.initCause(e10);
            throw assertionError;
        }
    }

    @Override // j9.a
    public final void d() {
        switch (this.f12463a) {
            case 7:
                if (!((String[]) this.f12466f)[0].isEmpty()) {
                    fb1.s(App.f17100w.f17415a, "mVPNTether2", false);
                    a9.b bVar = MainActivity.N0;
                    StringBuilder sb = new StringBuilder("[");
                    g1.a.w(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), sb, "] <font color=");
                    sb.append(team.dev.epro.apkcustom.widgets.a.f17392e);
                    sb.append(">VPN ShareNet stopped");
                    u.h("MainActivity", sb.toString());
                }
                ((String[]) this.f12466f)[0] = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                break;
            case 8:
                if (!((String) this.f12466f).isEmpty()) {
                    fb1.s(App.f17100w.f17415a, "mVPNTether2", false);
                    a9.b bVar2 = MainActivity.N0;
                    StringBuilder sb2 = new StringBuilder("[");
                    g1.a.w(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), sb2, "] <font color=");
                    sb2.append(team.dev.epro.apkcustom.widgets.a.f17392e);
                    sb2.append(">Delete last routing");
                    u.h("MainActivity", sb2.toString());
                    fb1.z(App.f17100w.f17415a, "del_route_hotspot", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                }
                ((MainActivity) ((g0) this.f12465d).f12842b).f17134v0 = false;
                break;
            case 9:
                if (!((String) this.f12466f).isEmpty()) {
                    j jVar = App.f17101x;
                    m mVar = (m) this.f12465d;
                    View view = mVar.S;
                    jVar.v0(mVar.v(R.string.u9), team.dev.epro.apkcustom.widgets.a.f17391d);
                } else {
                    j jVar2 = App.f17101x;
                    m mVar2 = (m) this.f12465d;
                    View view2 = mVar2.S;
                    jVar2.v0(mVar2.v(R.string.uc), team.dev.epro.apkcustom.widgets.a.f17393f);
                }
                break;
            default:
                if (!((String) this.f12466f).isEmpty()) {
                    j jVar3 = App.f17101x;
                    a0 a0Var = (a0) this.f12465d;
                    View view3 = a0Var.S;
                    jVar3.v0(a0Var.v(R.string.u9), team.dev.epro.apkcustom.widgets.a.f17391d);
                } else {
                    j jVar4 = App.f17101x;
                    a0 a0Var2 = (a0) this.f12465d;
                    View view4 = a0Var2.S;
                    jVar4.v0(a0Var2.v(R.string.uc), team.dev.epro.apkcustom.widgets.a.f17393f);
                }
                break;
        }
    }

    public final void e(Object obj, Object... objArr) {
        try {
            Method methodB = b(obj.getClass());
            if (methodB == null) {
                return;
            }
            try {
                methodB.invoke(obj, objArr);
            } catch (IllegalAccessException unused) {
            }
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    @Override // j9.a
    public final void g() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        switch (this.f12463a) {
            case 7:
                String str14 = "MainActivity";
                String str15 = "] ";
                String str16 = "HH:mm:ss";
                String str17 = "[";
                String str18 = " -j ACCEPT\niptables -t filter -D FORWARD -j vpnhotspot_fwd_hc\niptables -X vpnhotspot_fwd_hc";
                if (((MainActivity) ((g0) this.f12465d).f12842b).f17130r0.trim().equals("127.0.0.1")) {
                    str = "iptables -t nat -D PREROUTING -i ";
                    str2 = " -j MASQUERADE\nip rule del  iif ";
                    str3 = "/24 -o ";
                    str4 = "  priority 17701\nip rule del  iif ";
                    str5 = " unreachable priority 17980\niptables -t nat -D vpnhotspot_masquerade_hc -s ";
                    str6 = "127.0.0.1";
                } else {
                    String[] strArr = (String[]) this.f12466f;
                    StringBuilder sb = new StringBuilder("iptables -t nat -D PREROUTING -i ");
                    str = "iptables -t nat -D PREROUTING -i ";
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17133u0);
                    sb.append(" -p udp -d ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17130r0);
                    sb.append(" --dport 53 -j DNAT --to-destination ");
                    fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb, "\niptables -t nat -D PREROUTING -i ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17133u0);
                    sb.append(" -p tcp -d ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17130r0);
                    sb.append(" --dport 53 -j DNAT --to-destination ");
                    fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb, "\nip rule del to ");
                    fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb, " iif ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17133u0);
                    sb.append("  priority 17700\niptables -t nat -D PREROUTING -i ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17133u0);
                    sb.append(" -p udp -d ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17130r0);
                    sb.append(" --dport 53 -j DNAT --to-destination ");
                    fb1.r(App.f17100w.f17415a, "dns2", "8.8.4.4", sb, "\niptables -t nat -D PREROUTING -i ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17133u0);
                    sb.append(" -p tcp -d ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17130r0);
                    sb.append(" --dport 53 -j DNAT --to-destination ");
                    fb1.r(App.f17100w.f17415a, "dns2", "8.8.4.4", sb, "\nip rule del to ");
                    fb1.r(App.f17100w.f17415a, "dns2", "8.8.4.4", sb, " iif ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17133u0);
                    sb.append("  priority 17701\nip rule del  iif ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17133u0);
                    sb.append(" unreachable priority 17980\niptables -t nat -D vpnhotspot_masquerade_hc -s ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17130r0);
                    str3 = "/24 -o ";
                    sb.append(str3);
                    str5 = " unreachable priority 17980\niptables -t nat -D vpnhotspot_masquerade_hc -s ";
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17115c0);
                    sb.append(" -j MASQUERADE\nip rule del  iif ");
                    str4 = "  priority 17701\nip rule del  iif ";
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17133u0);
                    sb.append("  priority 17900\niptables -t nat -D vpnhotspot_masquerade_hc -s ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17130r0);
                    sb.append(str3);
                    l.a0.r(App.f17101x, sb, " -j MASQUERADE\nip rule del  iif ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17133u0);
                    sb.append("  priority 17800\niptables -t nat -D POSTROUTING -j vpnhotspot_masquerade_hc\niptables -t filter -D vpnhotspot_fwd_hc -i ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17133u0);
                    sb.append(" ! -o ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17133u0);
                    sb.append(" -j ACCEPT\niptables -t filter -D vpnhotspot_fwd_hc -o ");
                    sb.append(((MainActivity) ((g0) this.f12465d).f12842b).f17133u0);
                    sb.append(" -m state --state ESTABLISHED,RELATED -j ACCEPT\niptables -t filter -D vpnhotspot_fwd_hc -i ");
                    str2 = " -j MASQUERADE\nip rule del  iif ";
                    strArr[0] = g1.a.r(sb, ((MainActivity) ((g0) this.f12465d).f12842b).f17133u0, str18);
                    System.out.getClass();
                    MainActivity mainActivity = (MainActivity) ((g0) this.f12465d).f12842b;
                    str6 = "127.0.0.1";
                    mainActivity.f17130r0 = str6;
                    str18 = str18;
                    mainActivity.f17133u0 = null;
                }
                if (((MainActivity) ((g0) this.f12465d).f12842b).f17129q0.trim().equals(str6)) {
                    str7 = "8.8.4.4";
                    str8 = str6;
                    str9 = str18;
                } else {
                    String[] strArr2 = (String[]) this.f12466f;
                    String str19 = str6;
                    StringBuilder sb2 = new StringBuilder(str);
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17132t0);
                    sb2.append(" -p udp -d ");
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17129q0);
                    sb2.append(" --dport 53 -j DNAT --to-destination ");
                    fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb2, "\niptables -t nat -D PREROUTING -i ");
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17132t0);
                    sb2.append(" -p tcp -d ");
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17129q0);
                    sb2.append(" --dport 53 -j DNAT --to-destination ");
                    fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb2, "\nip rule del to ");
                    fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb2, " iif ");
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17132t0);
                    sb2.append("  priority 17700\niptables -t nat -D PREROUTING -i ");
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17132t0);
                    sb2.append(" -p udp -d ");
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17129q0);
                    sb2.append(" --dport 53 -j DNAT --to-destination ");
                    fb1.r(App.f17100w.f17415a, "dns2", "8.8.4.4", sb2, "\niptables -t nat -D PREROUTING -i ");
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17132t0);
                    sb2.append(" -p tcp -d ");
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17129q0);
                    sb2.append(" --dport 53 -j DNAT --to-destination ");
                    fb1.r(App.f17100w.f17415a, "dns2", "8.8.4.4", sb2, "\nip rule del to ");
                    fb1.r(App.f17100w.f17415a, "dns2", "8.8.4.4", sb2, " iif ");
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17132t0);
                    sb2.append(str4);
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17132t0);
                    sb2.append(str5);
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17129q0);
                    sb2.append(str3);
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17115c0);
                    String str20 = str2;
                    sb2.append(str20);
                    str7 = "8.8.4.4";
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17132t0);
                    sb2.append("  priority 17900\niptables -t nat -D vpnhotspot_masquerade_hc -s ");
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17129q0);
                    sb2.append(str3);
                    l.a0.r(App.f17101x, sb2, str20);
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17132t0);
                    sb2.append("  priority 17800\niptables -t nat -D POSTROUTING -j vpnhotspot_masquerade_hc\niptables -t filter -D vpnhotspot_fwd_hc -i ");
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17132t0);
                    sb2.append(" ! -o ");
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17132t0);
                    sb2.append(" -j ACCEPT\niptables -t filter -D vpnhotspot_fwd_hc -o ");
                    sb2.append(((MainActivity) ((g0) this.f12465d).f12842b).f17132t0);
                    sb2.append(" -m state --state ESTABLISHED,RELATED -j ACCEPT\niptables -t filter -D vpnhotspot_fwd_hc -i ");
                    str2 = str20;
                    str9 = str18;
                    strArr2[0] = g1.a.r(sb2, ((MainActivity) ((g0) this.f12465d).f12842b).f17132t0, str9);
                    System.out.getClass();
                    MainActivity mainActivity2 = (MainActivity) ((g0) this.f12465d).f12842b;
                    str8 = str19;
                    mainActivity2.f17129q0 = str8;
                    mainActivity2.f17132t0 = null;
                }
                if (!((MainActivity) ((g0) this.f12465d).f12842b).f17128p0.trim().equals(str8)) {
                    String str21 = str8;
                    fb1.z(App.f17100w.f17415a, "del_route_hotspot", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    String[] strArr3 = (String[]) this.f12466f;
                    StringBuilder sb3 = new StringBuilder(str);
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17131s0);
                    sb3.append(" -p udp -d ");
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17128p0);
                    sb3.append(" --dport 53 -j DNAT --to-destination ");
                    fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb3, "\niptables -t nat -D PREROUTING -i ");
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17131s0);
                    sb3.append(" -p tcp -d ");
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17128p0);
                    sb3.append(" --dport 53 -j DNAT --to-destination ");
                    fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb3, "\nip rule del to ");
                    fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb3, " iif ");
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17131s0);
                    sb3.append("  priority 17700\niptables -t nat -D PREROUTING -i ");
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17131s0);
                    sb3.append(" -p udp -d ");
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17128p0);
                    sb3.append(" --dport 53 -j DNAT --to-destination ");
                    String str22 = str7;
                    fb1.r(App.f17100w.f17415a, "dns2", str22, sb3, "\niptables -t nat -D PREROUTING -i ");
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17131s0);
                    sb3.append(" -p tcp -d ");
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17128p0);
                    sb3.append(" --dport 53 -j DNAT --to-destination ");
                    fb1.r(App.f17100w.f17415a, "dns2", str22, sb3, "\nip rule del to ");
                    sb3.append(App.f17100w.f17415a.getString("dns2", str22));
                    sb3.append(" iif ");
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17131s0);
                    sb3.append(str4);
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17131s0);
                    sb3.append(str5);
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17128p0);
                    sb3.append(str3);
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17115c0);
                    String str23 = str2;
                    sb3.append(str23);
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17131s0);
                    sb3.append("  priority 17900\niptables -t nat -D vpnhotspot_masquerade_hc -s ");
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17128p0);
                    sb3.append(str3);
                    l.a0.r(App.f17101x, sb3, str23);
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17131s0);
                    sb3.append("  priority 17800\niptables -t nat -D POSTROUTING -j vpnhotspot_masquerade_hc\niptables -t filter -D vpnhotspot_fwd_hc -i ");
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17131s0);
                    sb3.append(" ! -o ");
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17131s0);
                    sb3.append(" -j ACCEPT\niptables -t filter -D vpnhotspot_fwd_hc -o ");
                    sb3.append(((MainActivity) ((g0) this.f12465d).f12842b).f17131s0);
                    sb3.append(" -m state --state ESTABLISHED,RELATED -j ACCEPT\niptables -t filter -D vpnhotspot_fwd_hc -i ");
                    strArr3[0] = g1.a.r(sb3, ((MainActivity) ((g0) this.f12465d).f12842b).f17131s0, str9);
                    System.out.getClass();
                    MainActivity mainActivity3 = (MainActivity) ((g0) this.f12465d).f12842b;
                    mainActivity3.f17128p0 = str21;
                    mainActivity3.f17131s0 = null;
                }
                char c10 = 0;
                App.f17101x.r0(((String[]) this.f12466f)[0]);
                ((String[][]) this.f12464b)[0] = ((String[]) this.f12466f)[0].split("\\n");
                int i10 = 0;
                while (true) {
                    String[] strArr4 = ((String[][]) this.f12464b)[c10];
                    if (i10 < strArr4.length) {
                        if (strArr4[i10].isEmpty()) {
                            str10 = str14;
                            str11 = str15;
                            str12 = str16;
                            str13 = str17;
                        } else {
                            a9.b bVar = MainActivity.N0;
                            str13 = str17;
                            StringBuilder sb4 = new StringBuilder(str13);
                            str12 = str16;
                            str11 = str15;
                            g1.a.w(new SimpleDateFormat(str12, Locale.getDefault()), sb4, str11);
                            sb4.append(((String[][]) this.f12464b)[0][i10]);
                            str10 = str14;
                            u.r(str10, sb4.toString());
                        }
                        i10++;
                        str17 = str13;
                        str14 = str10;
                        str15 = str11;
                        str16 = str12;
                        c10 = 0;
                    }
                    break;
                }
                break;
            case 8:
                if (!((String) this.f12466f).isEmpty()) {
                    App.f17101x.r0((String) this.f12466f);
                    System.out.getClass();
                }
                for (String str24 : (String[]) this.f12464b) {
                    if (!str24.isEmpty()) {
                        a9.b bVar2 = MainActivity.N0;
                        u.r("MainActivity", "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] " + str24);
                    }
                }
                break;
            case 9:
                j jVar = App.f17101x;
                StringBuilder sb5 = new StringBuilder("ip route add ");
                String hostAddress = ((String) this.f12464b).trim().split("@")[0].split(":")[0];
                try {
                    hostAddress = InetAddress.getByName(hostAddress).getHostAddress();
                    break;
                } catch (UnknownHostException unused) {
                }
                sb5.append(hostAddress);
                sb5.append(" via ");
                sb5.append(App.f17101x.H());
                sb5.append(" dev ");
                sb5.append(App.f17101x.B());
                this.f12466f = jVar.s0(sb5.toString());
                int i11 = m.P0;
                StringBuilder sb6 = new StringBuilder("[");
                g1.a.w(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), sb6, "] ip route add ");
                String hostAddress2 = ((String) this.f12464b).trim().split("@")[0].split(":")[0];
                try {
                    hostAddress2 = InetAddress.getByName(hostAddress2).getHostAddress();
                    break;
                } catch (UnknownHostException unused2) {
                }
                sb6.append(hostAddress2);
                sb6.append(" via ");
                sb6.append(App.f17101x.H());
                sb6.append(" dev ");
                sb6.append(App.f17101x.B());
                u.g("m", sb6.toString());
                break;
            default:
                this.f12466f = App.f17101x.s0("ip route add " + ((String) this.f12464b).trim().split("@")[0].split(":")[0] + " via " + App.f17101x.H() + " dev " + App.f17101x.B());
                de.blinkt.openvpn.core.c.l("ip route add " + ((String) this.f12464b).trim().split("@")[0].split(":")[0] + " via " + App.f17101x.H() + " dev " + App.f17101x.B());
                break;
        }
    }

    public /* synthetic */ a(g0 g0Var, Serializable serializable, Serializable[] serializableArr, int i10) {
        this.f12463a = i10;
        this.f12465d = g0Var;
        this.f12466f = serializable;
        this.f12464b = serializableArr;
    }

    public a(UUID uuid) {
        this.f12463a = 2;
        this.f12466f = uuid;
    }

    public a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f12463a = 1;
        this.f12464b = bigInteger;
        this.f12465d = bigInteger2;
        this.f12466f = bigInteger3;
    }

    public a(Class cls, String str, Class[] clsArr) {
        this.f12463a = 5;
        this.f12466f = cls;
        this.f12464b = str;
        this.f12465d = clsArr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(int i10) {
        this();
        this.f12463a = i10;
        if (i10 != 4) {
        } else {
            this(UUID.randomUUID().toString());
        }
    }

    public a() {
        this.f12463a = 3;
        this.f12466f = new ArrayList();
        this.f12464b = new ArrayList();
        this.f12465d = null;
    }

    public a(String str) {
        this.f12463a = 4;
        this.f12464b = f7.u.f13336f;
        this.f12465d = new ArrayList();
        this.f12466f = h.g(str);
    }
}
