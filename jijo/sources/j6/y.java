package j6;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.os.Handler;
import android.system.Os;
import com.google.android.gms.ads.RequestConfiguration;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Objects;
import java.util.Vector;
import org.jasypt.digest.StandardStringDigester;
import team.dev.epro.apkcustom.App;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Runnable, m {
    public static final Vector A = new Vector();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f14433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocalSocket f14434b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h6.d f14435d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final OpenVPNService f14436f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public LocalServerSocket f14438q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public LocalSocket f14440t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l f14442v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14443w;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public transient a f14446z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedList f14437h = new LinkedList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14439s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f14441u = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final androidx.activity.e f14444x = new androidx.activity.e(29, this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x f14445y = new x(this);

    public y(h6.d dVar, OpenVPNService openVPNService) {
        this.f14435d = dVar;
        this.f14436f = openVPNService;
        this.f14433a = new Handler(openVPNService.getMainLooper());
    }

    public static void a(FileDescriptor fileDescriptor) {
        try {
            Os.close(fileDescriptor);
        } catch (Exception unused) {
            Objects.toString(fileDescriptor);
            LinkedList linkedList = de.blinkt.openvpn.core.c.f12574a;
        }
    }

    public static boolean h() {
        boolean z9;
        Vector<y> vector = A;
        synchronized (vector) {
            z9 = false;
            for (y yVar : vector) {
                boolean zB = yVar.b("signal SIGINT\n");
                try {
                    LocalSocket localSocket = yVar.f14434b;
                    if (localSocket != null) {
                        localSocket.close();
                    }
                } catch (IOException unused) {
                }
                z9 = zB;
            }
        }
        return z9;
    }

    public final boolean b(String str) {
        try {
            LocalSocket localSocket = this.f14434b;
            if (localSocket == null || localSocket.getOutputStream() == null) {
                return false;
            }
            this.f14434b.getOutputStream().write(str.getBytes());
            this.f14434b.getOutputStream().flush();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final void c(int i10) {
        this.f14441u = i10;
        if (this.f14439s) {
            de.blinkt.openvpn.core.c.w(i10);
        } else {
            b("signal SIGUSR1\n");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String d(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 1578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.y.d(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0601 A[Catch: Exception -> 0x0609, TryCatch #3 {Exception -> 0x0609, blocks: (B:246:0x05f9, B:249:0x0601, B:250:0x0608), top: B:309:0x05f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 2138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.y.e(java.lang.String):void");
    }

    public final void f(FileDescriptor fileDescriptor) {
        try {
            if (!this.f14436f.protect(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", new Class[0]).invoke(fileDescriptor, new Object[0])).intValue())) {
                de.blinkt.openvpn.core.c.q("Could not protect VPN socket");
            }
            a(fileDescriptor);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
            Objects.toString(fileDescriptor);
            LinkedList linkedList = de.blinkt.openvpn.core.c.f12574a;
            Objects.toString(fileDescriptor);
        }
    }

    public final void g(int i10, String str, String str2, boolean z9) {
        if (i10 == 1 || str == null) {
            b("proxy NONE\n");
            return;
        }
        de.blinkt.openvpn.core.c.k(R.string.zs, str, str2);
        String str3 = z9 ? " auto" : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[4];
        objArr[0] = i10 == 2 ? "HTTP" : "SOCKS";
        objArr[1] = str;
        objArr[2] = str2;
        objArr[3] = str3;
        b(String.format(locale, "proxy %s %s %s%s\n", objArr));
    }

    public final boolean i() {
        File file = new File(App.f17099v.getCacheDir().getAbsolutePath() + "/android.conf");
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
        }
        boolean zH = h();
        if (zH) {
            this.f14443w = true;
        }
        return zH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileDescriptor[] ancillaryFileDescriptors;
        byte[] bArr = new byte[2048];
        String strD = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        Vector vector = A;
        synchronized (vector) {
            vector.add(this);
        }
        try {
            LocalSocket localSocketAccept = this.f14438q.accept();
            this.f14434b = localSocketAccept;
            InputStream inputStream = localSocketAccept.getInputStream();
            try {
                this.f14438q.close();
            } catch (IOException unused) {
                LinkedList linkedList = de.blinkt.openvpn.core.c.f12574a;
            }
            b("version 3\n");
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1 || !App.f17100w.f17415a.getBoolean("vpn_service", false)) {
                    return;
                }
                try {
                    ancillaryFileDescriptors = this.f14434b.getAncillaryFileDescriptors();
                } catch (IOException unused2) {
                    LinkedList linkedList2 = de.blinkt.openvpn.core.c.f12574a;
                    ancillaryFileDescriptors = null;
                }
                if (ancillaryFileDescriptors != null) {
                    Collections.addAll(this.f14437h, ancillaryFileDescriptors);
                }
                strD = d(strD + new String(bArr, 0, i10, StandardStringDigester.MESSAGE_CHARSET));
            }
        } catch (IOException e10) {
            if (!e10.getMessage().equals("socket closed") && !e10.getMessage().equals("Connection reset by peer")) {
                LinkedList linkedList3 = de.blinkt.openvpn.core.c.f12574a;
            }
            Vector vector2 = A;
            synchronized (vector2) {
                vector2.remove(this);
            }
        }
    }
}
