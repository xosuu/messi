package g7;

import b0.g;
import com.google.android.gms.internal.ads.fb1;
import f7.c0;
import f7.q;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.jasypt.digest.StandardStringDigester;
import p7.e;
import p7.h;
import p7.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f13888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f13889b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f13890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f13891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final TimeZone f13892e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f13893f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f13894g;

    static {
        byte[] bArr = new byte[0];
        f13888a = bArr;
        e eVar = new e();
        eVar.H(0, bArr, 0);
        long j10 = 0;
        f13890c = new c0(j10, eVar);
        if ((j10 | j10) < 0 || j10 > j10 || j10 - j10 < j10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        h.d("efbbbf");
        h.d("feff");
        h.d("fffe");
        h.d("0000ffff");
        h.d("ffff0000");
        f13891d = Charset.forName(StandardStringDigester.MESSAGE_CHARSET);
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
        f13892e = TimeZone.getTimeZone("GMT");
        f13893f = new g(6);
        f13894g = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static AssertionError a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static String b(String str) {
        int i10 = -1;
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                while (i < lowerCase.length()) {
                    char cCharAt = lowerCase.charAt(i);
                    i = (cCharAt > 31 && cCharAt < 127 && " #%/:?@[\\]".indexOf(cCharAt) == -1) ? i + 1 : 0;
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressG = (str.startsWith("[") && str.endsWith("]")) ? g(1, str.length() - 1, str) : g(0, str.length(), str);
        if (inetAddressG == null) {
            return null;
        }
        byte[] address = inetAddressG.getAddress();
        if (address.length != 16) {
            throw new AssertionError(fb1.i("Invalid IPv6 address: '", str, "'"));
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < address.length) {
            int i13 = i11;
            while (i13 < 16 && address[i13] == 0 && address[i13 + 1] == 0) {
                i13 += 2;
            }
            int i14 = i13 - i11;
            if (i14 > i12 && i14 >= 4) {
                i10 = i11;
                i12 = i14;
            }
            i11 = i13 + 2;
        }
        e eVar = new e();
        while (i < address.length) {
            if (i == i10) {
                eVar.K(58);
                i += i12;
                if (i == 16) {
                    eVar.K(58);
                }
            } else {
                if (i > 0) {
                    eVar.K(58);
                }
                eVar.L(((address[i] & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return eVar.E();
    }

    public static int c(long j10, TimeUnit timeUnit) {
        if (j10 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.");
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.");
    }

    public static void d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static void e(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e10) {
                if (!o(e10)) {
                    throw e10;
                }
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static int f(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cd, code lost:
    
        if (r7 == 16) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00cf, code lost:
    
        if (r8 != (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d1, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d2, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e4, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ea, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088 A[LOOP:2: B:25:0x004e->B:50:0x0088, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0097 A[EDGE_INSN: B:90:0x0097->B:53:0x0097 BREAK  A[LOOP:2: B:25:0x004e->B:50:0x0088], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress g(int r16, int r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.b.g(int, int, java.lang.String):java.net.InetAddress");
    }

    public static int h(String str, int i10, int i11, char c10) {
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int i(String str, int i10, int i11, String str2) {
        while (i10 < i11) {
            if (str2.indexOf(str.charAt(i10)) != -1) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static boolean j(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String k(q qVar, boolean z9) {
        boolean zContains = qVar.f13327d.contains(":");
        String strI = qVar.f13327d;
        if (zContains) {
            strI = fb1.i("[", strI, "]");
        }
        int i10 = qVar.f13328e;
        if (!z9 && i10 == q.b(qVar.f13324a)) {
            return strI;
        }
        return strI + ":" + i10;
    }

    public static List l(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static List m(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static String[] n(g gVar, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (gVar.compare(str, strArr2[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean o(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean p(g gVar, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (gVar.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean q(t tVar, int i10, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jC = tVar.b().e() ? tVar.b().c() - jNanoTime : Long.MAX_VALUE;
        tVar.b().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            e eVar = new e();
            while (tVar.x(eVar, 8192L) != -1) {
                eVar.a();
            }
            if (jC == Long.MAX_VALUE) {
                tVar.b().a();
                return true;
            }
            tVar.b().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                tVar.b().a();
                return false;
            }
            tVar.b().d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            if (jC == Long.MAX_VALUE) {
                tVar.b().a();
            } else {
                tVar.b().d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static int r(int i10, int i11, String str) {
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int s(int i10, int i11, String str) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            char cCharAt = str.charAt(i12);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i12 + 1;
            }
        }
        return i10;
    }
}
