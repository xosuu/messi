package team.dev.epro.apkcustom.sockets.udp;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.VpnService;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import androidx.core.app.NotificationCompat;
import java.io.File;
import javax.net.ssl.HttpsURLConnection;
import v8.a;
import xyz.easypro.ecrypt.NativeUtil;

/* JADX INFO: loaded from: classes.dex */
public class UDPService extends VpnService implements Handler.Callback {
    public static final /* synthetic */ int H = 0;
    public a A;
    public boolean B;
    public HttpsURLConnection C;
    public Process D;
    public File E;
    public File F;
    public File G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f17328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NotificationManager f17329b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NotificationCompat.Builder f17330d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public x4.a f17331f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ParcelFileDescriptor f17332h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PowerManager.WakeLock f17333q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m3.a f17334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public File f17335t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Process f17336u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b9.a f17337v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public b9.a f17338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Thread f17339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Thread f17340y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f17341z;

    static {
        NativeUtil.classesInit0(47);
    }

    public static native void a(UDPService uDPService);

    public final native PendingIntent b();

    public final native void c(int i10, String str, boolean z9);

    public final native void d(String str, String str2, String str3, String str4, String str5);

    public final native void e();

    @Override // android.os.Handler.Callback
    public final native boolean handleMessage(Message message);

    @Override // android.app.Service
    public final native void onCreate();

    @Override // android.app.Service
    public final native int onStartCommand(Intent intent, int i10, int i11);
}
