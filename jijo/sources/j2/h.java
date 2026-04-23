package j2;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.emoji2.text.w;
import b7.u;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import k.g0;
import k.o;
import k.x;
import l.a0;
import n1.p;
import n1.s;
import s.k;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import u.i;
import v3.b0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements j.a, k0.a, j9.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static h f14295h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static h f14296q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14298b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14299d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f14300f;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f14300f = obj;
        this.f14297a = obj2;
        this.f14298b = obj3;
        this.f14299d = obj4;
    }

    public static synchronized h n(Context context, o2.a aVar) {
        try {
            if (f14295h == null) {
                h hVar = new h();
                Context applicationContext = context.getApplicationContext();
                hVar.f14297a = new a(applicationContext, aVar);
                hVar.f14298b = new b(applicationContext, aVar);
                hVar.f14299d = new f(applicationContext, aVar);
                hVar.f14300f = new g(applicationContext, aVar);
                f14295h = hVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14295h;
    }

    @Override // j.a
    public final boolean a(j.b bVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f14297a).onActionItemClicked(m(bVar), new x((Context) this.f14298b, (i0.b) menuItem));
    }

    @Override // k0.a
    public final void b() {
        ((View) this.f14297a).clearAnimation();
        ((ViewGroup) this.f14298b).endViewTransition((View) this.f14297a);
        ((androidx.fragment.app.f) this.f14299d).b();
    }

    @Override // j.a
    public final boolean c(j.b bVar, o oVar) {
        return ((ActionMode.Callback) this.f14297a).onCreateActionMode(m(bVar), o(oVar));
    }

    @Override // j9.a
    public final void d() {
        if (!((String[]) this.f14297a)[0].isEmpty()) {
            ((MenuItem) this.f14299d).setChecked(false);
            fb1.s(App.f17100w.f17415a, "mVPNTether2", false);
            a9.b bVar = MainActivity.N0;
            StringBuilder sb = new StringBuilder("[");
            g1.a.w(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), sb, "] <font color=");
            sb.append(team.dev.epro.apkcustom.widgets.a.f17392e);
            sb.append(">VPN ShareNet stopped");
            u.h("MainActivity", sb.toString());
        }
        ((String[]) this.f14297a)[0] = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Override // j.a
    public final void e(j.b bVar) {
        ((ActionMode.Callback) this.f14297a).onDestroyActionMode(m(bVar));
    }

    @Override // j.a
    public final boolean f(j.b bVar, o oVar) {
        return ((ActionMode.Callback) this.f14297a).onPrepareActionMode(m(bVar), o(oVar));
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
        Object obj;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14 = " -j ACCEPT\niptables -t filter -D vpnhotspot_fwd_hc -o ";
        String str15 = " ! -o ";
        String str16 = "  priority 17900\niptables -t nat -D vpnhotspot_masquerade_hc -s ";
        if (App.f17101x.J().trim().equals("127.0.0.1")) {
            str = "8.8.4.4";
            str2 = "iptables -t nat -D PREROUTING -i ";
            str3 = " -m state --state ESTABLISHED,RELATED -j ACCEPT\niptables -t filter -D vpnhotspot_fwd_hc -i ";
            str4 = "/24 -o ";
            str5 = " unreachable priority 17980\niptables -t nat -D vpnhotspot_masquerade_hc -s ";
            str6 = " -j MASQUERADE\nip rule del  iif ";
            str7 = "  priority 17701\nip rule del  iif ";
            str8 = " -j ACCEPT\niptables -t filter -D FORWARD -j vpnhotspot_fwd_hc\niptables -X vpnhotspot_fwd_hc";
        } else {
            String[] strArr = (String[]) this.f14297a;
            StringBuilder sb = new StringBuilder("iptables -t nat -D PREROUTING -i ");
            str2 = "iptables -t nat -D PREROUTING -i ";
            fb1.w(App.f17101x, sb, " -p udp -d ");
            sb.append(App.f17101x.J());
            sb.append(" --dport 53 -j DNAT --to-destination ");
            fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb, "\niptables -t nat -D PREROUTING -i ");
            fb1.w(App.f17101x, sb, " -p tcp -d ");
            sb.append(App.f17101x.J());
            sb.append(" --dport 53 -j DNAT --to-destination ");
            fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb, "\nip rule del to ");
            fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb, " iif ");
            fb1.w(App.f17101x, sb, "  priority 17700\niptables -t nat -D PREROUTING -i ");
            fb1.w(App.f17101x, sb, " -p udp -d ");
            sb.append(App.f17101x.J());
            sb.append(" --dport 53 -j DNAT --to-destination ");
            fb1.r(App.f17100w.f17415a, "dns2", "8.8.4.4", sb, "\niptables -t nat -D PREROUTING -i ");
            fb1.w(App.f17101x, sb, " -p tcp -d ");
            sb.append(App.f17101x.J());
            sb.append(" --dport 53 -j DNAT --to-destination ");
            fb1.r(App.f17100w.f17415a, "dns2", "8.8.4.4", sb, "\nip rule del to ");
            fb1.r(App.f17100w.f17415a, "dns2", "8.8.4.4", sb, " iif ");
            fb1.w(App.f17101x, sb, "  priority 17701\nip rule del  iif ");
            fb1.w(App.f17101x, sb, " unreachable priority 17980\niptables -t nat -D vpnhotspot_masquerade_hc -s ");
            sb.append(App.f17101x.J());
            str4 = "/24 -o ";
            sb.append(str4);
            str5 = " unreachable priority 17980\niptables -t nat -D vpnhotspot_masquerade_hc -s ";
            sb.append(((MainActivity) this.f14300f).f17115c0);
            str6 = " -j MASQUERADE\nip rule del  iif ";
            sb.append(str6);
            str7 = "  priority 17701\nip rule del  iif ";
            str = "8.8.4.4";
            fb1.w(App.f17101x, sb, str16);
            sb.append(App.f17101x.J());
            sb.append(str4);
            a0.r(App.f17101x, sb, str6);
            sb.append(App.f17101x.C());
            sb.append("  priority 17800\niptables -t nat -D POSTROUTING -j vpnhotspot_masquerade_hc\niptables -t filter -D vpnhotspot_fwd_hc -i ");
            str16 = str16;
            fb1.w(App.f17101x, sb, str15);
            str15 = str15;
            fb1.w(App.f17101x, sb, str14);
            str14 = str14;
            str3 = " -m state --state ESTABLISHED,RELATED -j ACCEPT\niptables -t filter -D vpnhotspot_fwd_hc -i ";
            fb1.w(App.f17101x, sb, str3);
            sb.append(App.f17101x.C());
            str8 = " -j ACCEPT\niptables -t filter -D FORWARD -j vpnhotspot_fwd_hc\niptables -X vpnhotspot_fwd_hc";
            sb.append(str8);
            strArr[0] = sb.toString();
        }
        String str17 = str8;
        if (App.f17101x.L().trim().equals("127.0.0.1")) {
            obj = "127.0.0.1";
            str9 = "  priority 17700\niptables -t nat -D PREROUTING -i ";
            str10 = str17;
            str11 = str;
            str12 = "dns2";
            str13 = str14;
        } else {
            String[] strArr2 = (String[]) this.f14297a;
            obj = "127.0.0.1";
            StringBuilder sb2 = new StringBuilder(str2);
            a0.s(App.f17101x, sb2, " -p udp -d ");
            sb2.append(App.f17101x.L());
            sb2.append(" --dport 53 -j DNAT --to-destination ");
            fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb2, "\niptables -t nat -D PREROUTING -i ");
            a0.s(App.f17101x, sb2, " -p tcp -d ");
            sb2.append(App.f17101x.L());
            sb2.append(" --dport 53 -j DNAT --to-destination ");
            fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb2, "\nip rule del to ");
            fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb2, " iif ");
            a0.s(App.f17101x, sb2, "  priority 17700\niptables -t nat -D PREROUTING -i ");
            a0.s(App.f17101x, sb2, " -p udp -d ");
            sb2.append(App.f17101x.L());
            sb2.append(" --dport 53 -j DNAT --to-destination ");
            str9 = "  priority 17700\niptables -t nat -D PREROUTING -i ";
            str11 = str;
            fb1.r(App.f17100w.f17415a, "dns2", str11, sb2, "\niptables -t nat -D PREROUTING -i ");
            a0.s(App.f17101x, sb2, " -p tcp -d ");
            sb2.append(App.f17101x.L());
            sb2.append(" --dport 53 -j DNAT --to-destination ");
            fb1.r(App.f17100w.f17415a, "dns2", str11, sb2, "\nip rule del to ");
            fb1.r(App.f17100w.f17415a, "dns2", str11, sb2, " iif ");
            str12 = "dns2";
            String str18 = str7;
            a0.s(App.f17101x, sb2, str18);
            str7 = str18;
            String str19 = str5;
            a0.s(App.f17101x, sb2, str19);
            sb2.append(App.f17101x.L());
            sb2.append(str4);
            sb2.append(((MainActivity) this.f14300f).f17115c0);
            sb2.append(str6);
            str5 = str19;
            String str20 = str16;
            a0.s(App.f17101x, sb2, str20);
            sb2.append(App.f17101x.L());
            sb2.append(str4);
            a0.r(App.f17101x, sb2, str6);
            sb2.append(App.f17101x.F());
            sb2.append("  priority 17800\niptables -t nat -D POSTROUTING -j vpnhotspot_masquerade_hc\niptables -t filter -D vpnhotspot_fwd_hc -i ");
            str16 = str20;
            String str21 = str15;
            a0.s(App.f17101x, sb2, str21);
            str15 = str21;
            str13 = str14;
            a0.s(App.f17101x, sb2, str13);
            a0.s(App.f17101x, sb2, str3);
            sb2.append(App.f17101x.F());
            str10 = str17;
            sb2.append(str10);
            strArr2[0] = sb2.toString();
        }
        if (!App.f17101x.e0()) {
            String str22 = str10;
            if (!App.f17101x.K().equals(obj)) {
                String str23 = str3;
                fb1.z(App.f17100w.f17415a, "del_route_hotspot", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                String[] strArr3 = (String[]) this.f14297a;
                StringBuilder sb3 = new StringBuilder(str2);
                fb1.A(App.f17101x, sb3, " -p udp -d ");
                sb3.append(App.f17101x.K());
                sb3.append(" --dport 53 -j DNAT --to-destination ");
                fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb3, "\niptables -t nat -D PREROUTING -i ");
                fb1.A(App.f17101x, sb3, " -p tcp -d ");
                sb3.append(App.f17101x.K());
                sb3.append(" --dport 53 -j DNAT --to-destination ");
                fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb3, "\nip rule del to ");
                fb1.r(App.f17100w.f17415a, "dns1", "8.8.8.8", sb3, " iif ");
                fb1.A(App.f17101x, sb3, str9);
                fb1.A(App.f17101x, sb3, " -p udp -d ");
                sb3.append(App.f17101x.K());
                sb3.append(" --dport 53 -j DNAT --to-destination ");
                String str24 = str12;
                fb1.r(App.f17100w.f17415a, str24, str11, sb3, "\niptables -t nat -D PREROUTING -i ");
                fb1.A(App.f17101x, sb3, " -p tcp -d ");
                sb3.append(App.f17101x.K());
                sb3.append(" --dport 53 -j DNAT --to-destination ");
                fb1.r(App.f17100w.f17415a, str24, str11, sb3, "\nip rule del to ");
                fb1.r(App.f17100w.f17415a, str24, str11, sb3, " iif ");
                fb1.A(App.f17101x, sb3, str7);
                fb1.A(App.f17101x, sb3, str5);
                sb3.append(App.f17101x.K());
                sb3.append(str4);
                sb3.append(((MainActivity) this.f14300f).f17115c0);
                sb3.append(str6);
                fb1.A(App.f17101x, sb3, str16);
                sb3.append(App.f17101x.K());
                sb3.append(str4);
                a0.r(App.f17101x, sb3, str6);
                fb1.A(App.f17101x, sb3, "  priority 17800\niptables -t nat -D POSTROUTING -j vpnhotspot_masquerade_hc\niptables -t filter -D vpnhotspot_fwd_hc -i ");
                fb1.A(App.f17101x, sb3, str15);
                fb1.A(App.f17101x, sb3, str13);
                fb1.A(App.f17101x, sb3, str23);
                sb3.append(App.f17101x.D());
                sb3.append(str22);
                strArr3[0] = sb3.toString();
            }
        }
        App.f17101x.r0(((String[]) this.f14297a)[0]);
        ((String[][]) this.f14298b)[0] = ((String[]) this.f14297a)[0].split("\\n");
        int i10 = 0;
        while (true) {
            String[] strArr4 = ((String[][]) this.f14298b)[0];
            if (i10 >= strArr4.length) {
                return;
            }
            if (!strArr4[i10].isEmpty()) {
                a9.b bVar = MainActivity.N0;
                StringBuilder sb4 = new StringBuilder("[");
                g1.a.w(new SimpleDateFormat("HH:mm:ss", Locale.getDefault()), sb4, "] ");
                sb4.append(((String[][]) this.f14298b)[0][i10]);
                u.r("MainActivity", sb4.toString());
            }
            i10++;
        }
    }

    public final int h() {
        Object obj = this.f14298b;
        if (((b6.g) obj) != null) {
            int iA = ((b6.g) obj).a();
            return iA > 0 ? iA : ((b6.a) this.f14300f).f1357p ? -1 : 0;
        }
        throw new IllegalStateException("Output is being piped to " + ((OutputStream) this.f14299d));
    }

    public final void i(String str) {
        ((p) this.f14297a).b();
        s1.g gVarA = ((s) this.f14299d).a();
        if (str == null) {
            gVarA.u(1);
        } else {
            gVarA.A(1, str);
        }
        ((p) this.f14297a).c();
        try {
            gVarA.D();
            ((p) this.f14297a).h();
        } finally {
            ((p) this.f14297a).f();
            ((s) this.f14299d).c(gVarA);
        }
    }

    public final void j() {
        ((p) this.f14297a).b();
        s1.g gVarA = ((s) this.f14300f).a();
        ((p) this.f14297a).c();
        try {
            gVarA.D();
            ((p) this.f14297a).h();
        } finally {
            ((p) this.f14297a).f();
            ((s) this.f14300f).c(gVarA);
        }
    }

    public final void k(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((k) this.f14298b).getOrDefault(obj, null);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                k(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final void l() {
        b6.g gVar = (b6.g) this.f14298b;
        if (gVar == null) {
            try {
                ((OutputStream) this.f14299d).close();
                return;
            } catch (IOException unused) {
                return;
            }
        }
        synchronized (gVar.f1378a) {
            try {
                if (!gVar.f1383f) {
                    gVar.f1383f = true;
                    if (gVar.a() == 0) {
                        gVar.f1382e = null;
                        gVar.f1381d = null;
                    }
                    gVar.f1378a.notifyAll();
                }
            } finally {
            }
        }
    }

    public final j.g m(j.b bVar) {
        int size = ((ArrayList) this.f14299d).size();
        for (int i10 = 0; i10 < size; i10++) {
            j.g gVar = (j.g) ((ArrayList) this.f14299d).get(i10);
            if (gVar != null && gVar.f14234b == bVar) {
                return gVar;
            }
        }
        j.g gVar2 = new j.g((Context) this.f14298b, bVar);
        ((ArrayList) this.f14299d).add(gVar2);
        return gVar2;
    }

    public final Menu o(o oVar) {
        Menu menu = (Menu) ((k) this.f14300f).getOrDefault(oVar, null);
        if (menu != null) {
            return menu;
        }
        g0 g0Var = new g0((Context) this.f14298b, oVar);
        ((k) this.f14300f).put(oVar, g0Var);
        return g0Var;
    }

    public final void p(l2.g gVar) {
        ((p) this.f14297a).b();
        ((p) this.f14297a).c();
        try {
            ((n1.b) this.f14298b).e(gVar);
            ((p) this.f14297a).h();
        } finally {
            ((p) this.f14297a).f();
        }
    }

    public final void q() {
        synchronized (this.f14297a) {
            fb1.t(this.f14299d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r5 <= 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r7 = java.lang.Math.min(r5, r4.a());
        java.lang.System.arraycopy((byte[]) r4.f1375a.f20723b, r4.f1376b, r11, r6, r7);
        r4.f1376b += r7;
        r5 = r5 - r7;
        r6 = r6 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
    
        r4.getClass();
        r12 = r12 + r3;
        r13 = r13 - r3;
        r1 = r1 + r3;
        r0.f1379b -= r3;
        r0.f1378a.notifyAll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        r4 = r0.f1381d;
        r6 = r12;
        r5 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int r(byte[] r11, int r12, int r13) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f14298b
            b6.g r0 = (b6.g) r0
            r1 = 0
            if (r13 != 0) goto Lb
            r0.getClass()
            goto L64
        Lb:
            java.lang.Object r2 = r0.f1378a
            monitor-enter(r2)
        Le:
            int r3 = r0.a()     // Catch: java.lang.Throwable -> L4b
            int r3 = java.lang.Math.min(r13, r3)     // Catch: java.lang.Throwable -> L4b
            if (r3 <= 0) goto L4d
            b6.f r4 = r0.f1381d     // Catch: java.lang.Throwable -> L4b
            r6 = r12
            r5 = r3
        L1c:
            if (r5 <= 0) goto L39
            int r7 = r4.a()     // Catch: java.lang.Throwable -> L4b
            int r7 = java.lang.Math.min(r5, r7)     // Catch: java.lang.Throwable -> L4b
            z5.e r8 = r4.f1375a     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r8 = r8.f20723b     // Catch: java.lang.Throwable -> L4b
            byte[] r8 = (byte[]) r8     // Catch: java.lang.Throwable -> L4b
            int r9 = r4.f1376b     // Catch: java.lang.Throwable -> L4b
            java.lang.System.arraycopy(r8, r9, r11, r6, r7)     // Catch: java.lang.Throwable -> L4b
            int r8 = r4.f1376b     // Catch: java.lang.Throwable -> L4b
            int r8 = r8 + r7
            r4.f1376b = r8     // Catch: java.lang.Throwable -> L4b
            int r5 = r5 - r7
            int r6 = r6 + r7
            goto L1c
        L39:
            r4.getClass()     // Catch: java.lang.Throwable -> L4b
            int r12 = r12 + r3
            int r13 = r13 - r3
            int r1 = r1 + r3
            int r4 = r0.f1379b     // Catch: java.lang.Throwable -> L4b
            int r4 = r4 - r3
            r0.f1379b = r4     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r3 = r0.f1378a     // Catch: java.lang.Throwable -> L4b
            r3.notifyAll()     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            goto Lb
        L4b:
            r11 = move-exception
            goto L6b
        L4d:
            if (r1 <= 0) goto L51
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            goto L64
        L51:
            boolean r3 = r0.f1383f     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L65
            if (r3 == 0) goto L62
            int r11 = r0.a()     // Catch: java.lang.Throwable -> L4b
            if (r11 != 0) goto L62
            r11 = 0
            r0.f1382e = r11     // Catch: java.lang.Throwable -> L4b
            r0.f1381d = r11     // Catch: java.lang.Throwable -> L4b
        L62:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            r1 = -1
        L64:
            return r1
        L65:
            java.lang.Object r3 = r0.f1378a     // Catch: java.lang.Throwable -> L4b
            r3.wait()     // Catch: java.lang.Throwable -> L4b
            goto Le
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.h.r(byte[], int, int):int");
    }

    public final void s(byte[] bArr, int i10, int i11) throws IOException {
        Object obj = this.f14298b;
        if (((b6.g) obj) != null) {
            try {
                ((b6.g) obj).b(bArr, i10, i11);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            ((OutputStream) this.f14299d).write(bArr, i10, i11);
            ((b6.a) this.f14300f).b(i11, true);
        }
    }

    public h(int i10) {
        if (i10 == 3) {
            this.f14297a = new u.e(10, 1);
            this.f14298b = new k();
            this.f14299d = new ArrayList();
            this.f14300f = new HashSet();
            return;
        }
        if (i10 == 6) {
            this.f14297a = new s.b();
            this.f14298b = new SparseArray();
            this.f14299d = new s.e();
            this.f14300f = new s.b();
            return;
        }
        if (i10 == 8) {
            this.f14300f = Collections.emptyList();
            return;
        }
        if (i10 == 10) {
            this.f14297a = new Object();
            this.f14298b = new Handler(Looper.getMainLooper(), new b0(this));
        } else {
            this.f14297a = new u.e(NotificationCompat.FLAG_LOCAL_ONLY, 0);
            this.f14298b = new u.e(NotificationCompat.FLAG_LOCAL_ONLY, 0);
            this.f14299d = new u.e(NotificationCompat.FLAG_LOCAL_ONLY, 0);
            this.f14300f = new i[32];
        }
    }

    public h(Typeface typeface, y0.b bVar) {
        int i10;
        int i11;
        this.f14300f = typeface;
        this.f14297a = bVar;
        this.f14299d = new w(1024);
        y0.b bVar2 = (y0.b) this.f14297a;
        int iA = bVar2.a(6);
        if (iA != 0) {
            int i12 = iA + bVar2.f20432a;
            i10 = bVar2.f20433b.getInt(bVar2.f20433b.getInt(i12) + i12);
        } else {
            i10 = 0;
        }
        this.f14298b = new char[i10 * 2];
        y0.b bVar3 = (y0.b) this.f14297a;
        int iA2 = bVar3.a(6);
        if (iA2 != 0) {
            int i13 = iA2 + bVar3.f20432a;
            i11 = bVar3.f20433b.getInt(bVar3.f20433b.getInt(i13) + i13);
        } else {
            i11 = 0;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(this, i14);
            y0.a aVarC = pVar.c();
            int iA3 = aVarC.a(4);
            Character.toChars(iA3 != 0 ? aVarC.f20433b.getInt(iA3 + aVarC.f20432a) : 0, (char[]) this.f14298b, i14 * 2);
            u.a("invalid metadata codepoint length", pVar.b() > 0);
            ((w) this.f14299d).a(pVar, 0, pVar.b() - 1);
        }
    }

    public h(b6.a aVar) {
        this.f14300f = aVar;
        this.f14298b = new b6.g(aVar.f1342a, aVar);
    }
}
