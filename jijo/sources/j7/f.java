package j7;

import f7.b0;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    public static long a(b0 b0Var) {
        String strA = b0Var.f13224q.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean b(b0 b0Var) {
        if (b0Var.f13219a.f13397b.equals("HEAD")) {
            return false;
        }
        int i10 = b0Var.f13221d;
        return (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && a(b0Var) == -1 && !"chunked".equalsIgnoreCase(b0Var.a("Transfer-Encoding"))) ? false : true;
    }

    public static int c(int i10, String str) {
        try {
            long j10 = Long.parseLong(str);
            if (j10 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j10 < 0) {
                return 0;
            }
            return (int) j10;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0329 A[LOOP:10: B:209:0x0326->B:211:0x0329, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0268 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x01af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(f7.l r33, f7.q r34, f7.p r35) {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j7.f.d(f7.l, f7.q, f7.p):void");
    }

    public static int e(int i10, String str, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }
}
