package team.dev.epro.apkcustom.sockets.socks;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.VpnService;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.core.app.NotificationCompat;
import b7.u;
import com.google.android.gms.ads.RequestConfiguration;
import f7.h;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.bugs4u.proxyserver.core.Tun2Socks;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.MainActivity;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import team.dev.epro.apkcustom.widgets.j;
import v8.d;
import w8.b;
import x4.a;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class SocksVPNService extends VpnService {
    public File A;
    public File B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Thread f17314a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ParcelFileDescriptor f17316d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f17317f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public VpnService.Builder f17318h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Locale f17319q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SimpleDateFormat f17320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public d f17321t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f17322u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f17323v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public NotificationCompat.Builder f17325x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17315b = Crypt.a(Crypt.xrc("N9lOjo\u0019i8\u0019:>M><NmoHo8\u0019llJ:cIfm\u001ch"));

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Process f17326y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public File f17327z = null;

    public final PendingIntent b() {
        Intent intent = new Intent(getBaseContext(), (Class<?>) MainActivity.class);
        intent.addFlags(131072);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        intent.addFlags(131072);
        return activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: team.dev.epro.apkcustom.sockets.socks.SocksVPNService.c(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void d() {
        String strN0;
        String str;
        String str2;
        String strN02;
        startForeground(R.string.bl, this.f17325x.setContentTitle(Crypt.a(Crypt.xrc("\u001c:mK;;\u001binO9oKhlAmk\u0019l?\u001ej<H99\u001cliIo<Ao9KgjOfb\u001a<;HjhIn?Jfb\u0019>jL:hOokN"))).setContentText(Crypt.a(Crypt.xrc("Hnc\u0019>hOnbJn8\u001a=?\u0019hjN<;I;j\u001e9hI;n\u001bjkH<m\u001djoHh9@ik\u001co9Oio\u001e<8\u001b9iIh9L:n\u001b"))).setPriority(-2).setSmallIcon(R.drawable.g6).setContentIntent(b()).build());
        if (this.f17322u == null) {
            Boolean boolValueOf = Boolean.FALSE;
            try {
                j jVar = App.f17101x;
                boolValueOf = Boolean.valueOf(jVar.l0(jVar.i0())[9]);
            } catch (IndexOutOfBoundsException | Exception unused) {
            }
            j jVar2 = App.f17101x;
            if (jVar2.l0(jVar2.i0())[1].isEmpty()) {
                strN0 = App.f17101x.n0();
            } else {
                j jVar3 = App.f17101x;
                strN0 = jVar3.l0(jVar3.i0())[1];
            }
            if (boolValueOf.booleanValue()) {
                if (App.f17101x.n0().isEmpty()) {
                    j jVar4 = App.f17101x;
                    strN02 = jVar4.l0(jVar4.i0())[1];
                } else {
                    strN02 = App.f17101x.n0();
                }
                strN0 = strN02;
            }
            String[] strArrSplit = strN0.split(Crypt.a(Crypt.xrc("\u0019=kLfo\u001b>>\u0019=b@i;LnkLk9M;>Nf>@f9\u001c=")));
            if (strArrSplit.length > 1) {
                String str3 = strArrSplit[1];
                String strA = Crypt.a(Crypt.xrc("\u001e:8K=j\u0019kcI>iA;i\u001dlm\u001e=cJgo\u001dim\u001ak8\u001cn"));
                String str4 = str3.split(strA)[0];
                String strA2 = Crypt.a(Crypt.xrc("\u0019nm\u001em9Lj>\u001a>lNl9@gjJ:c\u001eh>\u001a<iK9?\u0019m"));
                String str5 = str4.split(strA2)[0];
                int i10 = strArrSplit[1].split(strA2).length > 1 ? Integer.parseInt(strArrSplit[1].split(strA)[0].split(strA2)[1]) : 80;
                this.f17323v = str5;
                this.f17324w = i10;
                if (strArrSplit[0].startsWith(Crypt.a(Crypt.xrc("Im;\u0019m9\u001aobH=nN:bHjo\u001bfb\u001cimJ=m\u001boh\u0019=")))) {
                    String[] strArrSplit2 = strArrSplit[1].split(strA);
                    if (strArrSplit2.length > 1) {
                        str = strArrSplit2[1].split(strA2)[0];
                        str2 = strArrSplit2[1].split(strA2).length > 1 ? strArrSplit2[1].split(strA2)[1] : null;
                    } else {
                        str = strArrSplit[1].contains(strA) ? strArrSplit2[1].split(strA2)[0] : null;
                        str2 = str;
                    }
                    if (strArrSplit[0].equals(Crypt.a(Crypt.xrc("I<hMhj\u001bobHghN=9Aho\u001ajb\u001an>I>8K:;M:")))) {
                        d dVar = new d();
                        this.f17321t = dVar;
                        dVar.o();
                        this.f17322u = new b(1082, 8888, Crypt.a(Crypt.xrc("HllAhmO=bJ<l\u0019=>M:;\u001ej>\u0019m<\u001bmiH<n\u001eo")), str, str2, strArrSplit[0]);
                    } else {
                        this.f17322u = new b(1082, this.f17324w, this.f17323v, str, str2, strArrSplit[0]);
                    }
                    b bVar = this.f17322u;
                    bVar.getClass();
                    Thread thread = new Thread(bVar);
                    bVar.f18182b = thread;
                    thread.start();
                    z3.a.e(Crypt.a(Crypt.xrc("\u001dg9J:<AlbLhh\u001c><\u001b;j\u001ai?\u001eniM:nLmcAl;\u001dhnIinJg;Ah?\u001b<c\u001dh9\u001clc\u0019hl\u0019ol\u001a;cM")));
                }
            }
        }
        Thread thread2 = this.f17314a;
        if (thread2 == null || !thread2.isAlive()) {
            Locale.setDefault(new Locale(Crypt.a(Crypt.xrc("\u001eg9\u001eohJhbI9?I9;Hn;\u0019g<Ji?K<b@i?J>"))));
            Thread thread3 = new Thread(new h(7, this));
            this.f17314a = thread3;
            thread3.start();
        }
    }

    public final void e() {
        startForeground(R.string.bl, this.f17325x.setContentTitle(Crypt.a(Crypt.xrc("Ii>\u001e;nJfl\u001d:h\u001c9oIf;\u001do;\u001e:9Kk>Kfb\u001bl9K;o\u001d9oIh>O9h\u001afi\u0019n8Ngo@=kAi9N;8J"))).setContentText(getString(R.string.xr)).setPriority(-2).setSmallIcon(R.drawable.g6).setContentIntent(b()).build());
        ParcelFileDescriptor parcelFileDescriptor = this.f17316d;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
                this.f17316d = null;
            } catch (Exception unused) {
            }
        }
        Tun2Socks.Stop();
        c(Crypt.a(Crypt.xrc("Ll8\u001b;<Ig?MmbI;lHl8JfiMg8H=>\u001dfnAk")), App.f17100w.f17415a.getString(Crypt.a(Crypt.xrc("Nn?Nkb\u001e=?\u001e>m\u001ainJfoHn9\u001eic\u001dii\u001dh8J<")), Crypt.a(Crypt.xrc("Lo?\u001bmh\u001998JgnHolHimI>nMhh\u001dfj\u001aj<Aj"))), App.f17100w.f17415a.getString(Crypt.a(Crypt.xrc("@liM98\u001c9b\u001bmh\u0019:mIl>I>;Ll9\u0019ll@<i\u001bl")), Crypt.a(Crypt.xrc("I9cNmbL<hJn<I>>\u001c>?\u001d9<MkbImiO9kMk"))), SSHTunnelService.f17281c0, SSHTunnelService.f17282d0);
        Thread thread = this.f17314a;
        if (thread != null) {
            thread.interrupt();
            this.f17314a = null;
        }
        StringBuilder sb = new StringBuilder(Crypt.a(Crypt.xrc("L;;\u0019k;L<iNh;Jg>\u001bjm\u001d>8\u001enmLkh@g;@<")));
        g1.a.w(this.f17320s, sb, Crypt.a(Crypt.xrc("\u001b99\u001ekcMl>\u001d9kA=lL=;@ijNgj\u0019:lIo<Nj")));
        sb.append(team.dev.epro.apkcustom.widgets.a.f17392e);
        sb.append(Crypt.a(Crypt.xrc("OohKf;@><\u001ahoMl8\u001c<b\u001a>nJlkNl<Jk;\u0019j")));
        sb.append(getString(R.string.b1));
        u.r(Crypt.a(Crypt.xrc("O:<A;mKnc\u001b>iA>c\u00199bJgl\u0019fh@=jJ>8O9")), sb.toString());
        App.f17100w.f17415a.edit().putBoolean(Crypt.a(Crypt.xrc("\u001cn?\u001cmiH:oMg>IilLk>\u001aghH:9\u001a<l\u001cgc\u001b9")), false).apply();
        stopForeground(true);
        stopSelf();
    }

    @Override // android.net.VpnService
    public final void onRevoke() {
        e();
        super.onRevoke();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        this.f17317f = new a();
        this.f17319q = Locale.getDefault();
        this.f17318h = new VpnService.Builder(this);
        this.f17320s = new SimpleDateFormat(Crypt.a(Crypt.xrc("\u0019=?Ank\u001d=o\u001bnhAmn\u001a;hJobJ>cKncAfhJ=")), Locale.getDefault());
        NotificationManager notificationManager = (NotificationManager) getSystemService(Crypt.a(Crypt.xrc("\u001bl8\u001e>;JhlAjc\u001ai>@<>\u001bikN;lA=mAlc\u0019>")));
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannelO = p8.a.o(getString(R.string.bl));
            notificationChannelO.setDescription(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            notificationManager.createNotificationChannel(notificationChannelO);
        }
        this.f17325x = new NotificationCompat.Builder(this, Crypt.a(Crypt.xrc("M9;Ml>\u001c;mO9;Ji?\u0019=o@<h\u001dfiKlcNic@g<\u001c;9N=?\u0019>>Ih8H:l\u001emc\u001cicHkkIk;MioI")));
        ((WifiManager) getApplicationContext().getSystemService(Crypt.a(Crypt.xrc("Hkn@jcIjlMg>Og;LkjI<hJjjKo?HmiO:")))).getDhcpInfo();
        if (intent == null) {
            d();
            return 1;
        }
        String action = intent.getAction();
        if (action.equals(Crypt.a(Crypt.xrc("IncKgb\u001cg<@m?\u0019hbKf?K;8\u001a<hIgm\u001c<k@9")))) {
            d();
            return 1;
        }
        if (!action.equals(Crypt.a(Crypt.xrc("Ll8\u001b;<Ig?MmbI;lHl8JfiMg8H=>\u001dfnAk")))) {
            d();
            return 1;
        }
        e();
        b bVar = this.f17322u;
        if (bVar != null) {
            bVar.c();
            this.f17322u = null;
        }
        d dVar = this.f17321t;
        if (dVar == null) {
            return 1;
        }
        dVar.p();
        this.f17321t = null;
        return 1;
    }
}
