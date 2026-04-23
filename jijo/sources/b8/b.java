package b8;

import b7.u;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f1480f = new b(b.class.getSimpleName(), 999);

    public static HashSet a(LineNumberReader lineNumberReader) throws IOException {
        String hostAddress;
        HashSet hashSet = new HashSet(6);
        while (true) {
            String line = lineNumberReader.readLine();
            if (line == null) {
                return hashSet;
            }
            int iIndexOf = line.indexOf("]: [");
            if (iIndexOf != -1) {
                String strSubstring = line.substring(1, iIndexOf);
                int i10 = iIndexOf + 4;
                int length = line.length() - 1;
                if (length < i10) {
                    a.f1477d.warning("Malformed property detected: \"" + line + '\"');
                } else {
                    String strSubstring2 = line.substring(i10, length);
                    if (!strSubstring2.isEmpty() && (strSubstring.endsWith(".dns") || strSubstring.endsWith(".dns1") || strSubstring.endsWith(".dns2") || strSubstring.endsWith(".dns3") || strSubstring.endsWith(".dns4"))) {
                        InetAddress byName = InetAddress.getByName(strSubstring2);
                        if (byName != null && (hostAddress = byName.getHostAddress()) != null && hostAddress.length() != 0) {
                            hashSet.add(hostAddress);
                        }
                    }
                }
            }
        }
    }

    @Override // b8.d
    public final List b() {
        try {
            HashSet hashSetA = a(new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream(), StandardCharsets.UTF_8)));
            if (hashSetA.size() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(hashSetA.size());
            arrayList.addAll(hashSetA);
            return arrayList;
        } catch (IOException e10) {
            a.f1477d.log(Level.WARNING, "Exception in findDNSByExec", (Throwable) e10);
            return null;
        }
    }

    @Override // b8.d
    public final boolean c() {
        return u.s();
    }
}
