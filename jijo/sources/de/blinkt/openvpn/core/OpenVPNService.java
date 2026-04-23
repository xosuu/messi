package de.blinkt.openvpn.core;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.UiModeManager;
import android.content.Intent;
import android.content.res.Resources;
import android.net.VpnService;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.PowerManager;
import android.os.Process;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import b7.u;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import h6.d;
import j6.c0;
import j6.f;
import j6.f0;
import j6.h0;
import j6.k;
import j6.o;
import j6.p;
import j6.r;
import j6.w;
import j6.y;
import java.lang.reflect.InvocationTargetException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Vector;
import l.a0;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.widgets.j;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class OpenVPNService extends VpnService implements h0, Handler.Callback, f0, f {
    public static boolean M;
    public long A;
    public y B;
    public String D;
    public String E;
    public Handler F;
    public Toast G;
    public w H;
    public w8.b J;
    public v8.a K;
    public PowerManager.WakeLock L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f12550h;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d f12552s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12555v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public j6.c f12557x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vector f12546a = new Vector();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x4.a f12547b = new x4.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x4.a f12548d = new x4.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f12549f = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Thread f12551q = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f12553t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l5.f f12554u = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f12556w = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f12558y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12559z = false;
    public final o C = new o(this);
    public v8.d I = null;

    public static boolean A1(String str) {
        return str != null && (str.startsWith("tun") || "(null)".equals(str) || "vpnservice-tun".equals(str));
    }

    public static void B1(int i10, Notification.Builder builder) {
        if (i10 != 0) {
            try {
                builder.getClass().getMethod("setPriority", Integer.TYPE).invoke(builder, Integer.valueOf(i10));
                builder.getClass().getMethod("setUsesChronometer", Boolean.TYPE).invoke(builder, Boolean.TRUE);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
                LinkedList linkedList = c.f12574a;
            }
        }
    }

    public static String z1(long j10, boolean z9, Resources resources) {
        if (z9) {
            j10 *= 8;
        }
        double d10 = j10;
        double d11 = z9 ? 1000 : 1024;
        int iMax = Math.max(0, Math.min((int) (Math.log(d10) / Math.log(d11)), 3));
        float fPow = (float) (d10 / Math.pow(d11, iMax));
        return z9 ? iMax != 0 ? iMax != 1 ? iMax != 2 ? resources.getString(R.string.j8, Float.valueOf(fPow)) : resources.getString(R.string.mf, Float.valueOf(fPow)) : resources.getString(R.string.kw, Float.valueOf(fPow)) : resources.getString(R.string.cg, Float.valueOf(fPow)) : iMax != 0 ? iMax != 1 ? iMax != 2 ? resources.getString(R.string.a02, Float.valueOf(fPow)) : resources.getString(R.string.a04, Float.valueOf(fPow)) : resources.getString(R.string.a03, Float.valueOf(fPow)) : resources.getString(R.string.a01, Float.valueOf(fPow));
    }

    public final void C1(String str, String str2, String str3, long j10, ConnectionStatus connectionStatus) {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        int iOrdinal = connectionStatus.ordinal();
        int i10 = iOrdinal != 0 ? iOrdinal != 1 ? (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? 2131231223 : 2131231222 : 2131231199 : R.drawable.fx;
        Notification.Builder builder = new Notification.Builder(this);
        int i11 = 0;
        int i12 = str3.equals("openvpn_bg") ? -2 : str3.equals("openvpn_userreq") ? 2 : 0;
        if (this.f12552s != null) {
            builder.setContentTitle(getString(R.string.bl));
        } else {
            builder.setContentTitle(getString(R.string.pz));
        }
        builder.setContentText(str);
        builder.setOnlyAlertOnce(true);
        builder.setOngoing(true);
        builder.setSmallIcon(i10);
        if (connectionStatus == ConnectionStatus.f12537u) {
            builder.setContentIntent(x1());
        } else {
            builder.setContentIntent(x1());
        }
        if (j10 != 0) {
            builder.setWhen(j10);
        }
        int i13 = Build.VERSION.SDK_INT;
        B1(i12, builder);
        builder.setCategory(NotificationCompat.CATEGORY_SERVICE);
        builder.setLocalOnly(true);
        if (i13 >= 26) {
            builder.setChannelId(str3);
            d dVar = this.f12552s;
            if (dVar != null) {
                builder.setShortcutId(dVar.i());
            }
        }
        if (str2 != null && !str2.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
            builder.setTicker(str2);
        }
        Notification notification = builder.getNotification();
        int iHashCode = str3.hashCode();
        notificationManager.notify(iHashCode, notification);
        startForeground(iHashCode, notification);
        String str4 = this.f12550h;
        if (str4 != null && !str3.equals(str4)) {
            notificationManager.cancel(this.f12550h.hashCode());
        }
        this.f12550h = str3;
        if (((UiModeManager) getSystemService("uimode")).getCurrentModeType() != 4 || i12 < 0) {
            return;
        }
        this.F.post(new p(this, i11, str));
    }

    public final void D1() {
        y yVar = this.B;
        if (yVar != null) {
            w wVar = this.H;
            if (wVar != null) {
                wVar.f14429s = true;
            }
            if (yVar.i()) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused) {
                }
            }
        }
        synchronized (this.f12549f) {
            Thread thread = this.f12551q;
            if (thread != null) {
                thread.interrupt();
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    public final synchronized void E1() {
        j6.c cVar = this.f12557x;
        if (cVar != null) {
            try {
                c.s(cVar);
                unregisterReceiver(this.f12557x);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.f12557x = null;
    }

    @Override // j6.f
    public final boolean I(boolean z9) {
        fb1.s(App.f17100w.f17415a, "isOpenVPNRun", false);
        if (this.B == null) {
            return false;
        }
        PowerManager.WakeLock wakeLock = this.L;
        if (wakeLock != null) {
            try {
                if (wakeLock.isHeld()) {
                    this.L.release();
                    u.r("OpenVPNService", "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] WakeLock release");
                }
            } catch (Exception unused) {
            }
        }
        w8.b bVar = this.J;
        if (bVar != null) {
            bVar.c();
            this.J = null;
        }
        v8.d dVar = this.I;
        if (dVar != null && (dVar.isAlive() || this.I.f17921b)) {
            v8.d dVar2 = this.I;
            dVar2.K = null;
            dVar2.m(null);
            this.I.p();
            this.I = null;
        }
        v8.a aVar = this.K;
        if (aVar != null) {
            aVar.e();
            this.K = null;
            App.f17099v.f17110s = null;
        }
        return this.B.i();
    }

    @Override // j6.h0
    public final void a0(String str) {
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.C;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Runnable callback = message.getCallback();
        if (callback == null) {
            return false;
        }
        callback.run();
        return true;
    }

    @Override // j6.f0
    public final void m(long j10, long j11, long j12, long j13) {
        if (this.f12558y) {
            C1(String.format(getString(R.string.xq), z1(j10, false, getResources()), z1(j12 / 2, true, getResources()), z1(j11, false, getResources()), z1(j13 / 2, true, getResources())), null, "openvpn_bg", this.A, ConnectionStatus.f12529a);
        }
        j jVar = App.f17101x;
        if (jVar.l0(jVar.i0())[4].equals("lifeTime")) {
            return;
        }
        try {
            if (Settings.Global.getInt(getContentResolver(), "auto_time") == 0 || Settings.Global.getInt(getContentResolver(), "auto_time_zone") == 0) {
                App.f17100w.f17415a.edit().putString(new String(App.f17101x.z(0)), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).commit();
                App.f17101x.o0();
                Toast.makeText(this, getString(R.string.ha), 1).show();
                Intent intent = new Intent("android.settings.DATE_SETTINGS");
                intent.addFlags(276856832);
                startActivity(intent);
                Process.killProcess(Process.myPid());
            }
        } catch (Settings.SettingNotFoundException | Exception unused) {
        }
        try {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", locale);
            String str = simpleDateFormat.format(new Date());
            ParsePosition parsePosition = new ParsePosition(0);
            j jVar2 = App.f17101x;
            Date date = simpleDateFormat.parse(jVar2.l0(jVar2.i0())[4], parsePosition);
            if (date == null) {
                simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
                j jVar3 = App.f17101x;
                date = simpleDateFormat.parse(jVar3.l0(jVar3.i0())[4]);
            }
            if (date == null || date.compareTo(simpleDateFormat.parse(str)) < 0) {
                App.f17101x.o0();
                u.h("TAG", "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] <font color=" + team.dev.epro.apkcustom.widgets.a.f17390c + ">" + getString(R.string.h5));
                if (c.e()) {
                    this.B.i();
                    w1();
                }
                b4.f.T(App.f17099v);
            }
        } catch (ParseException | Exception unused2) {
        }
    }

    @Override // android.net.VpnService, android.app.Service
    public final IBinder onBind(Intent intent) {
        String action = intent.getAction();
        return (action == null || !action.equals("xyz.easypro.httpcustom.START_SERVICE")) ? new r(this) : this.C;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        fb1.s(App.f17100w.f17415a, "showLog", true);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        fb1.s(App.f17100w.f17415a, "vpn_service", false);
        fb1.s(App.f17100w.f17415a, "isOpenVPNRun", false);
        PowerManager.WakeLock wakeLock = this.L;
        if (wakeLock != null) {
            try {
                if (wakeLock.isHeld()) {
                    this.L.release();
                    u.r("OpenVPNService", "[" + new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()) + "] WakeLock release");
                }
            } catch (Exception unused) {
            }
        }
        w8.b bVar = this.J;
        if (bVar != null) {
            bVar.c();
            this.J = null;
        }
        v8.d dVar = this.I;
        if (dVar != null && (dVar.isAlive() || this.I.f17921b)) {
            v8.d dVar2 = this.I;
            dVar2.K = null;
            dVar2.m(null);
            this.I.p();
            this.I = null;
        }
        v8.a aVar = this.K;
        if (aVar != null) {
            aVar.e();
            this.K = null;
            App.f17099v.f17110s = null;
        }
        synchronized (this.f12549f) {
            try {
                if (this.f12551q != null) {
                    this.B.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        j6.c cVar = this.f12557x;
        if (cVar != null) {
            unregisterReceiver(cVar);
        }
        c.t(this);
    }

    @Override // android.net.VpnService
    public final void onRevoke() {
        v8.d dVar = this.I;
        if (dVar != null) {
            dVar.p();
            this.I.Q = null;
            this.I = null;
        }
        w8.b bVar = this.J;
        if (bVar != null) {
            bVar.c();
            this.J = null;
        }
        v8.a aVar = this.K;
        if (aVar != null) {
            aVar.e();
            this.K = null;
            App.f17099v.f17110s = null;
        }
        try {
            I(true);
        } catch (RemoteException unused) {
        }
        c.h(R.string.rn);
        this.B.i();
        w1();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0314  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int onStartCommand(android.content.Intent r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: de.blinkt.openvpn.core.OpenVPNService.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // j6.h0
    public final void t(String str, String str2, int i10, ConnectionStatus connectionStatus, Intent intent) {
        String str3;
        Intent intent2 = new Intent();
        intent2.setAction("xyz.easypro.httpcustom.VPN_STATUS");
        intent2.putExtra(NotificationCompat.CATEGORY_STATUS, connectionStatus.toString());
        intent2.putExtra("detailstatus", str);
        sendBroadcast(intent2, "android.permission.ACCESS_NETWORK_STATE");
        if (this.f12551q != null || M) {
            str3 = "openvpn_newstat";
            if (connectionStatus == ConnectionStatus.f12529a) {
                fb1.s(App.f17100w.f17415a, "isOpenVPNRun", true);
                this.f12558y = true;
                this.A = System.currentTimeMillis();
                str3 = ((UiModeManager) getSystemService("uimode")).getCurrentModeType() != 4 ? "openvpn_bg" : "openvpn_newstat";
                if ((App.f17100w.f17415a.getBoolean("autoOnOff", false) || App.f17100w.f17415a.getBoolean("autoPing", false)) && this.K == null) {
                    v8.a aVar = App.f17099v.f17110s;
                    if (aVar != null) {
                        aVar.e();
                    }
                    v8.a aVar2 = new v8.a(this);
                    this.K = aVar2;
                    aVar2.d();
                    App.f17099v.f17110s = this.K;
                }
            } else {
                this.f12558y = false;
            }
            C1(c.c(this), c.c(this), str3, 0L, connectionStatus);
        }
    }

    public final void u1(String str, String str2, String str3, String str4) {
        l5.f fVar = new l5.f(str, str2);
        boolean zA1 = A1(str4);
        k kVar = new k(new l5.f(str3, 32), false);
        l5.f fVar2 = this.f12554u;
        if (fVar2 == null) {
            c.j("Local IP address unset and received. Neither pushed server config nor local config specifies an IP addresses. Opening tun device is most likely going to fail.");
            return;
        }
        if (new k(fVar2, true).a(kVar)) {
            zA1 = true;
        }
        if (str3 != null && (str3.equals("255.255.255.255") || str3.equals(this.E))) {
            zA1 = true;
        }
        if (fVar.f15223c == 32 && !str2.equals("255.255.255.255")) {
            c.p(R.string.u_, str, str2);
        }
        if (fVar.c()) {
            c.p(R.string.ua, str, Integer.valueOf(fVar.f15223c), fVar.f15222b);
        }
        this.f12547b.b(fVar, zA1);
    }

    public final void v1(String str, boolean z9) {
        String[] strArrSplit = str.split("/");
        try {
            this.f12548d.c((Inet6Address) InetAddress.getAllByName(strArrSplit[0])[0], Integer.parseInt(strArrSplit[1]), z9);
        } catch (UnknownHostException unused) {
            LinkedList linkedList = c.f12574a;
        }
    }

    public final void w1() {
        synchronized (this.f12549f) {
            this.f12551q = null;
        }
        c.s(this);
        E1();
        c0.k(this);
        this.H = null;
        if (this.f12559z) {
            return;
        }
        stopForeground(!M);
        if (M) {
            return;
        }
        stopSelf();
        c.t(this);
    }

    public final PendingIntent x1() {
        Intent intent = new Intent(getBaseContext(), (Class<?>) MainActivity.class);
        intent.setFlags(67108864);
        return PendingIntent.getActivity(this, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
    }

    public final String y1() {
        String string = "TUNCFG UNQIUE STRING ips:";
        if (this.f12554u != null) {
            string = "TUNCFG UNQIUE STRING ips:" + this.f12554u.toString();
        }
        if (this.f12556w != null) {
            StringBuilder sbS = g1.a.s(string);
            sbS.append(this.f12556w);
            string = sbS.toString();
        }
        StringBuilder sbK = a0.k(string, "routes: ");
        x4.a aVar = this.f12547b;
        sbK.append(TextUtils.join("|", aVar.i(true)));
        x4.a aVar2 = this.f12548d;
        sbK.append(TextUtils.join("|", aVar2.i(true)));
        StringBuilder sbK2 = a0.k(sbK.toString(), "excl. routes:");
        sbK2.append(TextUtils.join("|", aVar.i(false)));
        sbK2.append(TextUtils.join("|", aVar2.i(false)));
        StringBuilder sbK3 = a0.k(sbK2.toString(), "dns: ");
        sbK3.append(TextUtils.join("|", this.f12546a));
        StringBuilder sbK4 = a0.k(sbK3.toString(), "domain: ");
        sbK4.append(this.f12553t);
        StringBuilder sbK5 = a0.k(sbK4.toString(), "mtu: ");
        sbK5.append(this.f12555v);
        return sbK5.toString();
    }
}
