package team.dev.epro.apkcustom.sockets;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.VpnService;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import androidx.core.app.NotificationCompat;
import i3.b;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import l3.h;
import team.dev.epro.apkcustom.App;
import v8.d;
import v8.g;
import x4.a;
import xyz.easypro.ecrypt.NativeUtil;
import xyz.easypro.ecrypt.utils.Crypt;
import xyz.easypro.httpcustom.R;
import z5.c;
import z5.e;
import z5.i;

/* JADX INFO: loaded from: classes.dex */
public class SSHTunnelService extends VpnService implements i, c, Handler.Callback {
    public static volatile boolean W = false;
    public static volatile boolean X = false;
    public static volatile boolean Y = false;
    public static volatile boolean Z = false;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static volatile boolean f17279a0 = false;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static volatile boolean f17280b0 = true;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f17281c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f17282d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f17283e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static volatile String f17284f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f17285g0;
    public ParcelFileDescriptor B;
    public a C;
    public VpnService.Builder D;
    public Locale E;
    public b F;
    public Thread G;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public File Q;
    public File R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NotificationCompat.Builder f17286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NotificationManager f17287b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Intent f17288d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PendingIntent f17289f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SimpleDateFormat f17290h;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public z5.a f17292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Handler f17293t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public d f17294u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g f17295v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v8.a f17296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PowerManager.WakeLock f17297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h f17298y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m3.a f17299z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public e f17291q = null;
    public final String A = App.f17099v.getString(R.string.bl);
    public boolean H = false;
    public Process O = null;
    public File P = null;
    public final String S = Crypt.a(Crypt.xrc("N<8L9mMo;\u001bnh\u0019;<H;iH=jOg9LkkA<bA>8Hhn\u001ch8Njm\u001a;8I>;@;8\u001e>k@m;\u001a;9LgjKfbL<<A99\u001d9<\u001a;m@fk\u001ehm\u001clcJocIon@j<NijLn?\u001aj>H:h\u001ek>\u001eghJj9Mf?\u0019j8\u001dmhJn<\u001d9h\u001a<iM<j\u001c=8Kg;N;lNnb\u001efn\u001e<>Imn\u001e<n\u001en8Afm\u001eh9\u001dkhInbOlcLnnNib\u001eo;KjmInhOj8AolN<h\u0019ojKn<M>mIg8Noc\u001c;8O;"));
    public final String T = Crypt.a(Crypt.xrc("N<8L9mMo;\u001bnh\u0019;<H;iH=jOg9LkkA<bA>8Hhn\u001ch8Njm\u001a;8I>;@;8\u001e>k@m;\u001a;9LgjKfbL<<A99\u001d9<\u001a;m@fk\u001ehm\u001clcJocIon@j<NijLn?\u001aj>H:h\u001ek>\u001eghJj9Mf?\u0019j8\u001dmhJn<\u001d9h\u001a<iM<j\u001c=8Kg;N;lNnb\u001efn\u001e<>Imn\u001ehi\u001a;?\u0019k?L:?All\u0019loOl9@:o\u001c>cM9<\u001dlc"));
    public boolean U = false;
    public boolean V = false;

    static {
        NativeUtil.classesInit0(109);
        f17281c0 = App.f17099v.getFilesDir().getPath();
        f17282d0 = App.f17099v.getCacheDir().getPath();
        f17283e0 = App.f17099v.getFilesDir().getPath() + Crypt.a(Crypt.xrc("J=8\u0019nm\u001bfjK<?H<;Aii\u0019j8Oi?\u001e>oHio\u001ai"));
        f17285g0 = Crypt.a(Crypt.xrc("Oi?\u001c><\u001dhjLh;\u001dh;\u0019:;HmlHjk\u001dfoHkm\u001clkJ>;K9oHg;Jj9\u00199b\u001ank\u001dfkA;?\u0019hjNhnN=<\u001a<kH:c\u001ennK9l\u001bonHgc\u001dj?Jm8\u0019o8\u001elb"));
    }

    public final native void a();

    public final native boolean b();

    public final native void c(Throwable th);

    public final native void d();

    public final native void e();

    public final native void f();

    public final native PendingIntent g();

    public final native void h(int i10, String str);

    @Override // android.os.Handler.Callback
    public final native boolean handleMessage(Message message);

    public final native void i();

    public final native void j(String str, String str2, String str3, String str4, String str5);

    public final native void k();

    public final native void l();

    public final native void m();

    public final native void n(String str, byte[] bArr);

    @Override // android.net.VpnService, android.app.Service
    public final native IBinder onBind(Intent intent);

    @Override // android.app.Service
    public final native void onCreate();

    @Override // android.app.Service
    public final native void onDestroy();

    @Override // android.net.VpnService
    public final native void onRevoke();

    @Override // android.app.Service
    public final native int onStartCommand(Intent intent, int i10, int i11);
}
