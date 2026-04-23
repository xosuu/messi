package l7;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p7.h f15260a = p7.h.g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f15261b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f15262c = new String[64];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f15263d = new String[NotificationCompat.FLAG_LOCAL_ONLY];

    static {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = f15263d;
            if (i11 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i11)};
            byte[] bArr = g7.b.f13888a;
            strArr[i11] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i11++;
        }
        String[] strArr2 = f15262c;
        strArr2[0] = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = iArr[0];
        strArr2[i12 | 8] = g1.a.r(new StringBuilder(), strArr2[i12], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            int i15 = iArr[0];
            String[] strArr3 = f15262c;
            int i16 = i15 | i14;
            strArr3[i16] = strArr3[i15] + '|' + strArr3[i14];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i15]);
            sb.append('|');
            strArr3[i16 | 8] = g1.a.r(sb, strArr3[i14], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f15262c;
            if (i10 >= strArr4.length) {
                return;
            }
            if (strArr4[i10] == null) {
                strArr4[i10] = f15263d[i10];
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(boolean r10, int r11, int r12, byte r13, byte r14) {
        /*
            java.lang.String[] r0 = l7.e.f15261b
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r13 >= r1) goto La
            r0 = r0[r13]
            goto L1c
        La:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r13)
            r0[r2] = r1
            byte[] r1 = g7.b.f13888a
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r4 = "0x%02x"
            java.lang.String r0 = java.lang.String.format(r1, r4, r0)
        L1c:
            r1 = 5
            r4 = 3
            r5 = 2
            r6 = 4
            if (r14 != 0) goto L25
            java.lang.String r13 = ""
            goto L6b
        L25:
            java.lang.String[] r7 = l7.e.f15263d
            if (r13 == r5) goto L69
            if (r13 == r4) goto L69
            if (r13 == r6) goto L61
            r8 = 6
            if (r13 == r8) goto L61
            r8 = 7
            if (r13 == r8) goto L69
            r8 = 8
            if (r13 == r8) goto L69
            java.lang.String[] r8 = l7.e.f15262c
            int r9 = r8.length
            if (r14 >= r9) goto L3f
            r7 = r8[r14]
            goto L41
        L3f:
            r7 = r7[r14]
        L41:
            if (r13 != r1) goto L50
            r8 = r14 & 4
            if (r8 == 0) goto L50
            java.lang.String r13 = "HEADERS"
            java.lang.String r14 = "PUSH_PROMISE"
            java.lang.String r13 = r7.replace(r13, r14)
            goto L6b
        L50:
            if (r13 != 0) goto L5f
            r13 = r14 & 32
            if (r13 == 0) goto L5f
            java.lang.String r13 = "PRIORITY"
            java.lang.String r14 = "COMPRESSED"
            java.lang.String r13 = r7.replace(r13, r14)
            goto L6b
        L5f:
            r13 = r7
            goto L6b
        L61:
            if (r14 != r3) goto L66
            java.lang.String r13 = "ACK"
            goto L6b
        L66:
            r13 = r7[r14]
            goto L6b
        L69:
            r13 = r7[r14]
        L6b:
            java.lang.Object[] r14 = new java.lang.Object[r1]
            if (r10 == 0) goto L72
            java.lang.String r10 = "<<"
            goto L74
        L72:
            java.lang.String r10 = ">>"
        L74:
            r14[r2] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r14[r3] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            r14[r5] = r10
            r14[r4] = r0
            r14[r6] = r13
            byte[] r10 = g7.b.f13888a
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r11 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r10 = java.lang.String.format(r10, r11, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.e.a(boolean, int, int, byte, byte):java.lang.String");
    }

    public static void b(String str, Object... objArr) {
        byte[] bArr = g7.b.f13888a;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static void c(String str, Object... objArr) throws IOException {
        byte[] bArr = g7.b.f13888a;
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
