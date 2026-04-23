package v8;

import com.google.android.gms.ads.RequestConfiguration;
import de.blinkt.openvpn.core.OpenVPNService;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import org.bugs4u.proxyserver.core.Tun2Socks;
import team.dev.epro.apkcustom.App;
import team.dev.epro.apkcustom.sockets.SSHTunnelService;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Thread implements Tun2Socks.IProtectSocket {
    public u5.a D;
    public List E;
    public String F;
    public String G;
    public OpenVPNService K;
    public boolean L;
    public String M;
    public String N;
    public String O;
    public String P;
    public SSHTunnelService Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServerSocket f17920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f17921b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f17922d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Socket f17923f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Socket f17924h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Socket f17925q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f17926s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String[] f17927t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String[] f17928u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String[] f17929v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String[] f17930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17931x = App.f17100w.f17415a.getInt("countRotate2", 0);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f17932y = App.f17100w.f17415a.getInt("countRotate", 0);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f17933z = App.f17100w.f17415a.getInt("countRotate3", 0);
    public int A = App.f17100w.f17415a.getInt("countRotate4", 0);
    public int B = App.f17100w.f17415a.getInt("countRotateSNI", 0);
    public final int C = App.f17100w.f17415a.getInt("setTimeout", 10);
    public String H = "127.0.0.1";
    public String I = "127.0.0.1";
    public int J = 0;
    public String R = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        NativeUtil.classesInit0(21);
    }

    public static native String c(String str);

    public static native boolean f();

    public static native String h(String str);

    public static native String i(String str, String str2, String str3);

    public static native void k(Socket socket);

    public final native Socket a(String str, int i10, String[] strArr, String str2);

    public final native String b();

    public final native String d();

    @Override // org.bugs4u.proxyserver.core.Tun2Socks.IProtectSocket
    public final native boolean doVpnProtect(Socket socket);

    public final native String e(String str);

    public final native String[] g(String str);

    public final native String j(String str, String str2, String[] strArr);

    public final native void l();

    public final native void m(String str);

    public final native Socket n();

    public final native void o();

    public final native void p();

    @Override // java.lang.Thread, java.lang.Runnable
    public final native void run();
}
