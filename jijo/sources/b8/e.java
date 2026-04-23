package b8;

import b7.u;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f1482f = new e(e.class.getSimpleName(), 2000);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f1483h = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Pattern f1484q = Pattern.compile("^nameserver\\s+(.*)$");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static ArrayList f1485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static long f1486t;

    /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // b8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List b() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "Could not close reader"
            java.util.logging.Logger r1 = b8.e.f1483h
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "/etc/resolv.conf"
            r2.<init>(r3)
            boolean r3 = r2.exists()
            r4 = 0
            if (r3 != 0) goto L13
            return r4
        L13:
            long r5 = r2.lastModified()
            long r7 = b8.e.f1486t
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L22
            java.util.ArrayList r3 = b8.e.f1485s
            if (r3 == 0) goto L22
            return r3
        L22:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            r8.<init>(r9, r2)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L79
        L38:
            java.lang.String r2 = r7.readLine()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a
            if (r2 == 0) goto L5c
            java.util.regex.Pattern r8 = b8.e.f1484q     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a
            java.util.regex.Matcher r2 = r8.matcher(r2)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a
            boolean r8 = r2.matches()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a
            if (r8 == 0) goto L38
            r8 = 1
            java.lang.String r2 = r2.group(r8)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a
            r3.add(r2)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L5a
            goto L38
        L57:
            r2 = move-exception
            r4 = r7
            goto L8f
        L5a:
            r2 = move-exception
            goto L7b
        L5c:
            r7.close()     // Catch: java.io.IOException -> L60
            goto L66
        L60:
            r2 = move-exception
            java.util.logging.Level r7 = java.util.logging.Level.WARNING
            r1.log(r7, r0, r2)
        L66:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L72
            java.lang.String r0 = "Could not find any nameservers in /etc/resolv.conf"
            r1.fine(r0)
            return r4
        L72:
            b8.e.f1485s = r3
            b8.e.f1486t = r5
            return r3
        L77:
            r2 = move-exception
            goto L8f
        L79:
            r2 = move-exception
            r7 = r4
        L7b:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch: java.lang.Throwable -> L57
            java.lang.String r5 = "Could not read from /etc/resolv.conf"
            r1.log(r3, r5, r2)     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L8e
            r7.close()     // Catch: java.io.IOException -> L88
            goto L8e
        L88:
            r2 = move-exception
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            r1.log(r3, r0, r2)
        L8e:
            return r4
        L8f:
            if (r4 == 0) goto L9b
            r4.close()     // Catch: java.io.IOException -> L95
            goto L9b
        L95:
            r3 = move-exception
            java.util.logging.Level r4 = java.util.logging.Level.WARNING
            r1.log(r4, r0, r3)
        L9b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.e.b():java.util.List");
    }

    @Override // b8.d
    public final boolean c() {
        if (u.s()) {
            return false;
        }
        try {
            return new File("/etc/resolv.conf").exists();
        } catch (SecurityException e10) {
            f1483h.log(Level.FINE, "Access to /etc/resolv.conf not possible", (Throwable) e10);
            return false;
        }
    }
}
