package a9;

import b7.u;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Vector;
import l.a0;
import team.dev.epro.apkcustom.App;
import xyz.easypro.ecrypt.utils.Crypt;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Vector f72h = new Vector();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f73q = 7071;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f74a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ServerSocket f75b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z8.a f76d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f77f;

    public static void a(String str) {
        if (App.f17100w.f17415a.getBoolean(Crypt.a(Crypt.xrc("\u001a9?Jo?\u001af?MmjOf<\u001dh;\u001b=bA>>@<k\u001afnKj")), false)) {
            u.r(Crypt.a(Crypt.xrc("Imc\u001ejn\u0019g9\u001cn8L<?\u001d><@=?\u001ah<@okHonIk")), Crypt.a(Crypt.xrc("L;;\u0019k;L<iNh;Jg>\u001bjm\u001d>8\u001enmLkh@g;@<")) + new SimpleDateFormat(Crypt.a(Crypt.xrc("\u0019=?Ank\u001d=o\u001bnhAmn\u001a;hJobJ>cKncAfhJ=")), Locale.getDefault()).format(new Date()) + Crypt.a(Crypt.xrc("\u001dj>JghHmhAmjN9mK>8@<hNi;Nk8\u001ck>Hn")) + str);
        }
    }

    public static void b(Exception exc) {
        String string = exc.toString();
        for (StackTraceElement stackTraceElement : exc.getStackTrace()) {
            StringBuilder sbK = a0.k(string, Crypt.a(Crypt.xrc("JnbKfn@mlN9hI9n\u001bgiOkiJ9nKhn\u0019:?Kf")));
            sbK.append(stackTraceElement.toString());
            string = sbK.toString();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        String strA = Crypt.a(Crypt.xrc("K:nM:9\u0019i;\u001c<9\u00199c\u001e9?O:<Igl\u001cinAoj\u001df"));
        if (this.f76d == null) {
            this.f76d = new z8.a();
        }
        this.f76d.start();
        this.f74a = true;
        for (int i10 = 0; i10 < 5; i10++) {
            try {
                this.f75b = new ServerSocket(f73q);
            } catch (Exception unused) {
                if (i10 == 4) {
                    return;
                }
                try {
                    Thread.sleep(1000L);
                } catch (Exception unused2) {
                }
            }
        }
        while (!this.f75b.isClosed()) {
            try {
                Socket socketAccept = this.f75b.accept();
                PrintStream printStream = System.out;
                socketAccept.getInetAddress().getHostAddress();
                printStream.getClass();
                if (socketAccept.getInetAddress().getHostAddress() != null && (socketAccept.getInetAddress().getHostAddress().startsWith(App.f17101x.K().substring(0, App.f17101x.K().lastIndexOf(strA))) || socketAccept.getInetAddress().getHostAddress().startsWith(App.f17101x.L().substring(0, App.f17101x.L().lastIndexOf(strA))) || socketAccept.getInetAddress().getHostAddress().startsWith(App.f17101x.J().substring(0, App.f17101x.J().lastIndexOf(strA))) || socketAccept.getInetAddress().getHostAddress().startsWith(App.f17101x.M().substring(0, App.f17101x.M().lastIndexOf(strA))))) {
                    String hostAddress = socketAccept.getInetAddress().getHostAddress();
                    if (hostAddress.length() - hostAddress.replace(strA, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).length() == 3) {
                        if (f72h.size() == 0) {
                            this.f77f = 1;
                        }
                        int i11 = this.f77f;
                        a aVar = new a();
                        aVar.f68s = false;
                        aVar.f62a = socketAccept;
                        aVar.f70u = false;
                        aVar.f71v = i11;
                        aVar.start();
                        this.f77f++;
                    }
                }
            } catch (Exception e10) {
                b(e10);
                interrupt();
                return;
            }
        }
    }
}
