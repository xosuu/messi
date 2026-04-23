package j6;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.ads.fb1;
import de.blinkt.openvpn.core.OpenVPNService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f14423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Process f14424b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14425d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final OpenVPNService f14426f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14427h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14428q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14429s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final FutureTask f14430t = new FutureTask(new Callable() { // from class: j6.v
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return this.f14422a.f14431u;
        }
    });

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public OutputStream f14431u;

    public w(OpenVPNService openVPNService, String[] strArr, String str) {
        this.f14423a = strArr;
        this.f14425d = str;
        this.f14426f = openVPNService;
    }

    public final void a(String[] strArr) {
        LinkedList linkedList = new LinkedList();
        Collections.addAll(linkedList, strArr);
        ProcessBuilder processBuilder = new ProcessBuilder(linkedList);
        String strReplaceFirst = strArr[0].replaceFirst("/cache/.*$", "/lib");
        String str = processBuilder.environment().get("LD_LIBRARY_PATH");
        String strX = str == null ? strReplaceFirst : fb1.x(strReplaceFirst, ":", str);
        String str2 = this.f14425d;
        if (!strReplaceFirst.equals(str2)) {
            strX = fb1.x(str2, ":", strX);
        }
        processBuilder.environment().put("LD_LIBRARY_PATH", strX);
        processBuilder.redirectErrorStream(true);
        try {
            Process processStart = processBuilder.start();
            this.f14424b = processStart;
            InputStream inputStream = processStart.getInputStream();
            OutputStream outputStream = this.f14424b.getOutputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            this.f14431u = outputStream;
            this.f14430t.run();
            do {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                if (line.startsWith("Dump path: ")) {
                    this.f14427h = line.substring(11);
                }
                if (line.startsWith("/data/data/xyz.easypro.httpcustom/cache/pievpn") || line.contains("syntax error")) {
                    this.f14428q = true;
                }
                Matcher matcher = Pattern.compile("(\\d+).(\\d+) ([0-9a-f])+ (.*)").matcher(line);
                if (matcher.matches()) {
                    int i10 = 3;
                    int i11 = Integer.parseInt(matcher.group(3), 16);
                    String strGroup = matcher.group(4);
                    int iMax = i11 & 15;
                    if ((i11 & 16) != 0) {
                        i10 = 2;
                    } else if ((i11 & 32) == 0 && (i11 & 64) == 0) {
                        i10 = (i11 & NotificationCompat.FLAG_HIGH_PRIORITY) != 0 ? 4 : 1;
                    }
                    if (strGroup.startsWith("MANAGEMENT: CMD")) {
                        iMax = Math.max(4, iMax);
                    }
                    boolean z9 = (strGroup.endsWith("md too weak") && strGroup.startsWith("OpenSSL: error")) || strGroup.contains("error:140AB18E");
                    de.blinkt.openvpn.core.c.o(i10, iMax, strGroup);
                    if (z9) {
                        de.blinkt.openvpn.core.c.j("OpenSSL reported a certificate with a weak hash, please the in app FAQ about weak hashes");
                    }
                } else {
                    de.blinkt.openvpn.core.c.l("P:" + line);
                }
            } while (!Thread.interrupted());
            throw new InterruptedException("OpenVpn process was killed form java code");
        } catch (IOException | InterruptedException unused) {
            LinkedList linkedList2 = de.blinkt.openvpn.core.c.f12574a;
            this.f14424b.destroy();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x029c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0231 A[Catch: InterruptedException -> 0x0236, IllegalThreadStateException -> 0x0238, TRY_LEAVE, TryCatch #12 {IllegalThreadStateException -> 0x0238, InterruptedException -> 0x0236, blocks: (B:78:0x022d, B:80:0x0231), top: B:120:0x022d }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0295  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.w.run():void");
    }
}
