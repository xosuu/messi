package k8;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.fb1;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.sufficientlysecure.rootcommands.util.RootAccessDeniedException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f14752t = System.getenv("LD_LIBRARY_PATH");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Process f14753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BufferedReader f14754b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DataOutputStream f14755d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f14756f = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14757h = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a f14758q = new a(this, 0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a f14759s = new a(this, 1);

    public b(String str, ArrayList arrayList) throws IOException {
        String line;
        int i10 = 0;
        Map<String, String> map = System.getenv();
        String[] strArr = new String[arrayList.size() + map.size()];
        for (Map.Entry<String, String> entry : map.entrySet()) {
            strArr[i10] = entry.getKey() + "=" + entry.getValue();
            i10++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            strArr[i10] = (String) it.next();
            i10++;
        }
        Process processExec = Runtime.getRuntime().exec(str, strArr, (File) null);
        this.f14753a = processExec;
        this.f14754b = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
        DataOutputStream dataOutputStream = new DataOutputStream(processExec.getOutputStream());
        this.f14755d = dataOutputStream;
        dataOutputStream.write("echo Started\n".getBytes());
        dataOutputStream.flush();
        do {
            line = this.f14754b.readLine();
            if (line == null) {
                throw new RootAccessDeniedException("stdout line is null! Access was denied or this executeable is not a shell!");
            }
        } while (RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(line));
        if (!"Started".equals(line)) {
            Process process = this.f14753a;
            try {
                process.exitValue();
            } catch (IllegalThreadStateException unused) {
                process.destroy();
            }
            throw new IOException(fb1.i("Unable to start shell, unexpected output \"", line, "\""));
        }
        new Thread(this.f14758q, "Shell Input").start();
        new Thread(this.f14759s, "Shell Output").start();
    }

    public static void a(b bVar) {
        DataOutputStream dataOutputStream;
        bVar.getClass();
        int i10 = 0;
        while (true) {
            try {
                synchronized (bVar.f14756f) {
                    while (!bVar.f14757h && i10 >= bVar.f14756f.size()) {
                        try {
                            bVar.f14756f.wait();
                        } finally {
                        }
                    }
                    dataOutputStream = bVar.f14755d;
                }
                if (i10 < bVar.f14756f.size()) {
                    ((l8.a) bVar.f14756f.get(i10)).b(dataOutputStream);
                    dataOutputStream.write(("\necho F*D^W@#FGF " + i10 + " $?\n").getBytes());
                    dataOutputStream.flush();
                    i10++;
                } else {
                    if (bVar.f14757h) {
                        dataOutputStream.write("\nexit 0\n".getBytes());
                        dataOutputStream.flush();
                        bVar.f14753a.waitFor();
                        dataOutputStream.close();
                        return;
                    }
                    Thread.sleep(50L);
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public static void c(b bVar) {
        BufferedReader bufferedReader;
        ArrayList arrayList;
        l8.a aVar = null;
        int i10 = 0;
        while (true) {
            bufferedReader = bVar.f14754b;
            String line = bufferedReader.readLine();
            arrayList = bVar.f14756f;
            if (line == null) {
                break;
            }
            if (aVar == null) {
                if (i10 < arrayList.size()) {
                    aVar = (l8.a) arrayList.get(i10);
                } else if (bVar.f14757h) {
                    break;
                }
            }
            int iIndexOf = line.indexOf("F*D^W@#FGF");
            if (iIndexOf > 0) {
                String strSubstring = line.substring(0, iIndexOf);
                aVar.getClass();
                strSubstring.contains("Value too large for defined data type");
                StringBuilder sb = aVar.f15362b;
                sb.append(strSubstring);
                sb.append('\n');
            }
            if (iIndexOf >= 0) {
                line = line.substring(iIndexOf);
                String[] strArrSplit = line.split(" ");
                if (Integer.parseInt(strArrSplit[1]) == i10) {
                    Integer.parseInt(strArrSplit[2]);
                    aVar.a();
                    i10++;
                    aVar = null;
                }
            }
            aVar.getClass();
            line.contains("Value too large for defined data type");
            StringBuilder sb2 = aVar.f15362b;
            sb2.append(line);
            sb2.append('\n');
        }
        bVar.f14753a.waitFor();
        bufferedReader.close();
        Process process = bVar.f14753a;
        try {
            process.exitValue();
        } catch (IllegalThreadStateException unused) {
            process.destroy();
        }
        while (i10 < arrayList.size()) {
            if (aVar == null) {
                aVar = (l8.a) arrayList.get(i10);
            }
            synchronized (aVar) {
                aVar.notifyAll();
            }
            i10++;
            aVar = null;
        }
    }

    public static b u() {
        String absolutePath;
        ArrayList arrayList = new ArrayList();
        arrayList.add("LD_LIBRARY_PATH=" + f14752t);
        String[] strArr = m8.a.f15804a;
        int i10 = 0;
        while (true) {
            absolutePath = "su";
            if (i10 >= 9) {
                break;
            }
            File file = new File(g1.a.y(strArr[i10], "su"));
            if (file.exists()) {
                absolutePath = file.getAbsolutePath();
                break;
            }
            i10++;
        }
        return new b(absolutePath, arrayList);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f14756f) {
            this.f14757h = true;
            this.f14756f.notifyAll();
        }
    }

    public final void e(l8.a aVar) throws IOException {
        if (this.f14757h) {
            throw new IOException("Unable to add commands to a closed shell");
        }
        synchronized (this.f14756f) {
            this.f14756f.add(aVar);
            this.f14756f.size();
            this.f14756f.notifyAll();
        }
    }
}
