package j6;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.en1;
import de.blinkt.openvpn.core.NativeUtils;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.ExecutionException;
import team.dev.epro.apkcustom.App;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14408b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14409d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f14410f;

    public /* synthetic */ q(Object obj, String str, Object obj2, int i10) {
        this.f14407a = i10;
        this.f14410f = obj;
        this.f14408b = str;
        this.f14409d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InetAddress inetAddressG;
        InetAddress inetAddressG2;
        v8.d dVar;
        String path;
        switch (this.f14407a) {
            case 0:
                if (App.f17100w.f17415a.getBoolean("reqBlock", false) || App.f17100w.f17415a.getBoolean("enableSsl", false)) {
                    InetAddress inetAddressG3 = team.dev.epro.apkcustom.widgets.e.g(((OpenVPNService) this.f14410f).f12552s.f14126c0[0].f14357a);
                    if (inetAddressG3 != null) {
                        v8.d dVar2 = ((OpenVPNService) this.f14410f).I;
                        if (dVar2 != null) {
                            dVar2.m(inetAddressG3.getHostAddress());
                        }
                        w8.b bVar = ((OpenVPNService) this.f14410f).J;
                        if (bVar != null) {
                            bVar.f18188t = inetAddressG3.getHostAddress();
                        }
                    }
                    if (App.f17100w.f17415a.getBoolean("reqBlock", false)) {
                        if (!((String) this.f14408b).trim().split("@")[0].split(":")[0].isEmpty() && (inetAddressG2 = team.dev.epro.apkcustom.widgets.e.g(((String) this.f14408b).trim().split("@")[0].split(":")[0])) != null && (dVar = ((OpenVPNService) this.f14410f).I) != null) {
                            dVar.m(inetAddressG2.getHostAddress());
                        }
                        if (((OpenVPNService) this.f14410f).J != null && (inetAddressG = team.dev.epro.apkcustom.widgets.e.g((String) this.f14409d)) != null) {
                            ((OpenVPNService) this.f14410f).J.f18188t = inetAddressG.getHostAddress();
                        }
                    }
                }
                OpenVPNService openVPNService = (OpenVPNService) this.f14410f;
                boolean z9 = OpenVPNService.M;
                openVPNService.getClass();
                if (!App.f17100w.f17415a.getBoolean("reqBlock", false) && !App.f17100w.f17415a.getBoolean("enableSsl", false)) {
                    App.f17101x.w();
                }
                String str = openVPNService.getApplicationInfo().nativeLibraryDir;
                Vector vector = new Vector();
                String strA = NativeUtils.a();
                int i10 = 28;
                if (Build.VERSION.SDK_INT < 28) {
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (!strA.equals(strArr[0])) {
                        de.blinkt.openvpn.core.c.p(R.string.al, Arrays.toString(strArr), strA);
                        strArr = new String[]{strA};
                    }
                    for (String str2 : strArr) {
                        File file = new File(openVPNService.getCacheDir(), g1.a.q("c_pie_openvpn.", str2));
                        if (!file.exists() || !file.canExecute()) {
                            try {
                                InputStream inputStreamOpen = openVPNService.getAssets().open("pie_openvpn." + str2);
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                byte[] bArr = new byte[NotificationCompat.FLAG_BUBBLE];
                                for (int i11 = inputStreamOpen.read(bArr); i11 > 0; i11 = inputStreamOpen.read(bArr)) {
                                    try {
                                        fileOutputStream.write(bArr, 0, i11);
                                    } catch (IOException unused) {
                                        LinkedList linkedList = de.blinkt.openvpn.core.c.f12574a;
                                    }
                                }
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                                de.blinkt.openvpn.core.c.l("Failed getting assets for archicture " + str2);
                            }
                            if (!file.setExecutable(true)) {
                                de.blinkt.openvpn.core.c.j("Failed to make OpenVPN executable");
                            }
                        }
                        path = file.getPath();
                    }
                    throw new RuntimeException("Cannot find any execulte for this device's ABIs " + Arrays.toString(strArr));
                }
                path = new File(openVPNService.getApplicationInfo().nativeLibraryDir, "libovpnexec.so").getPath();
                vector.add(path);
                vector.add("--config");
                vector.add("stdin");
                String[] strArr2 = (String[]) vector.toArray(new String[0]);
                openVPNService.f12559z = true;
                openVPNService.D1();
                openVPNService.f12559z = false;
                en1.p(openVPNService).getBoolean("ovpn3", false);
                y yVar = new y(openVPNService.f12552s, openVPNService);
                String str3 = openVPNService.getCacheDir().getAbsolutePath() + "/mgmtsocket";
                yVar.f14440t = new LocalSocket();
                for (int i12 = 8; i12 > 0 && !yVar.f14440t.isBound(); i12--) {
                    try {
                        yVar.f14440t.bind(new LocalSocketAddress(str3, LocalSocketAddress.Namespace.FILESYSTEM));
                    } catch (IOException unused3) {
                        try {
                            Thread.sleep(300L);
                        } catch (InterruptedException unused4) {
                        }
                    }
                }
                try {
                    yVar.f14438q = new LocalServerSocket(yVar.f14440t.getFileDescriptor());
                    new Thread(yVar, "OpenVPNManagementThread").start();
                    openVPNService.B = yVar;
                    de.blinkt.openvpn.core.c.l("started Socket Thread");
                    w wVar = new w(openVPNService, strArr2, str);
                    openVPNService.H = wVar;
                    synchronized (openVPNService.f12549f) {
                        Thread thread = new Thread(wVar, "OpenVPNProcessThread");
                        openVPNService.f12551q = thread;
                        thread.start();
                        break;
                    }
                    try {
                        openVPNService.f12552s.n(openVPNService, (OutputStream) wVar.f14430t.get());
                        new Handler(openVPNService.getMainLooper()).post(new androidx.activity.e(i10, openVPNService));
                        if (App.f17100w.f17415a.getBoolean("autoIpHunter", false) && openVPNService.K == null) {
                            v8.a aVar = App.f17099v.f17110s;
                            if (aVar != null) {
                                aVar.e();
                            }
                            v8.a aVar2 = new v8.a(openVPNService);
                            openVPNService.K = aVar2;
                            aVar2.d();
                            App.f17099v.f17110s = openVPNService.K;
                            return;
                        }
                        return;
                    } catch (IOException | InterruptedException | ExecutionException unused5) {
                        LinkedList linkedList2 = de.blinkt.openvpn.core.c.f12574a;
                        openVPNService.w1();
                        return;
                    }
                } catch (IOException unused6) {
                    LinkedList linkedList3 = de.blinkt.openvpn.core.c.f12574a;
                    openVPNService.w1();
                    return;
                }
            default:
                ((o4.a) this.f14410f).e((View) this.f14408b, (FrameLayout) this.f14409d);
                return;
        }
    }
}
