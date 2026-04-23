package team.dev.epro.apkcustom.sockets.v2ray;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.LocalSocket;
import android.net.VpnService;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import androidx.core.app.NotificationCompat;
import com.google.gson.p;
import com.google.gson.q;
import dev.epro.v2ray.util.GuardProcess;
import j6.s;
import javax.net.ssl.HttpsURLConnection;
import libv2ray.V2RayPoint;
import libv2ray.V2RayVPNServiceSupportsSet;
import v8.d;
import v8.g;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class V2RayVpnService extends VpnService implements V2RayVPNServiceSupportsSet, Handler.Callback {
    public static final /* synthetic */ int M = 0;
    public LocalSocket A;
    public String B;
    public boolean C;
    public Handler D;
    public HttpsURLConnection E;
    public HttpsURLConnection F;
    public g G;
    public String H;
    public String I;
    public String J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ParcelFileDescriptor f17342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V2RayPoint f17343b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x4.a f17344d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s f17345f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Thread f17346h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f17347q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public NotificationManager f17348s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public NotificationCompat.Builder f17349t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public v8.a f17350u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public PowerManager.WakeLock f17351v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f17352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f17353x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public GuardProcess f17355z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f17354y = false;
    public boolean K = false;
    public boolean L = false;

    /* JADX INFO: renamed from: team.dev.epro.apkcustom.sockets.v2ray.V2RayVpnService$2, reason: invalid class name */
    class AnonymousClass2 implements q {
        static {
            NativeUtil.classesInit0(144);
        }

        @Override // com.google.gson.q
        public final native p a(Object obj);
    }

    static {
        NativeUtil.classesInit0(35);
    }

    public static native void a(V2RayVpnService v2RayVpnService);

    public final native void b(int i10, String str, boolean z9);

    public final native void c();

    public final native boolean d();

    @Override // android.os.Handler.Callback
    public final native boolean handleMessage(Message message);

    @Override // android.net.VpnService, android.app.Service
    public final native IBinder onBind(Intent intent);

    @Override // android.app.Service
    public final native void onCreate();

    @Override // libv2ray.V2RayVPNServiceSupportsSet
    public final native long onEmitStatus(long j10, String str);

    @Override // android.net.VpnService
    public final native void onRevoke();

    @Override // android.app.Service
    public final native int onStartCommand(Intent intent, int i10, int i11);

    @Override // libv2ray.V2RayVPNServiceSupportsSet
    public final native long prepare();

    @Override // libv2ray.V2RayVPNServiceSupportsSet
    public final native long protect(long j10);

    @Override // libv2ray.V2RayVPNServiceSupportsSet
    public final native long setup(String str);

    @Override // libv2ray.V2RayVPNServiceSupportsSet
    public final native long shutdown();
}
