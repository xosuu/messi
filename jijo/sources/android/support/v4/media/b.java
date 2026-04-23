package android.support.v4.media;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.internal.ads.aa;
import com.google.android.gms.internal.ads.cv0;
import com.google.android.gms.internal.ads.dv0;
import com.google.android.gms.internal.ads.fa;
import com.google.android.gms.internal.ads.gv0;
import com.google.android.gms.internal.ads.hv0;
import com.google.android.gms.internal.ads.iv0;
import com.google.android.gms.internal.ads.jp0;
import com.google.android.gms.internal.ads.jv0;
import com.google.android.gms.internal.ads.pa;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.ads.u;
import com.google.android.gms.internal.ads.x8;
import com.google.android.material.datepicker.l;
import de.blinkt.openvpn.core.ConfigParser$ConfigParseError;
import g4.a0;
import h6.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k4.i;
import l.j;
import l.q;
import team.dev.epro.apkcustom.App;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f93a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f94b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f95c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f96d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f97e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f98f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f99g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f100h;

    public b(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(a0.y(R.attr.u6, context, l.class.getCanonicalName()).data, l4.a.f15201n);
        this.f93a = q.d(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        this.f99g = q.d(context, typedArrayObtainStyledAttributes.getResourceId(1, 0));
        this.f94b = q.d(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        this.f95c = q.d(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        ColorStateList colorStateListG = tp1.g(context, typedArrayObtainStyledAttributes, 6);
        this.f96d = q.d(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.f97e = q.d(context, typedArrayObtainStyledAttributes.getResourceId(7, 0));
        this.f98f = q.d(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f100h = paint;
        paint.setColor(colorStateListG.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void a(d dVar, Vector vector, boolean z9) {
        boolean z10 = false;
        if (z9) {
            Iterator it = vector.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                Vector vector2 = (Vector) it.next();
                for (int i10 = 1; i10 < vector2.size(); i10++) {
                    if (((String) vector2.get(i10)).equals("block-local")) {
                        dVar.Z = false;
                    } else if (((String) vector2.get(i10)).equals("unblock-local")) {
                        dVar.Z = true;
                    } else if (((String) vector2.get(i10)).equals("!ipv4")) {
                        z11 = true;
                    } else if (((String) vector2.get(i10)).equals("ipv6")) {
                        dVar.Q = true;
                    }
                }
            }
            z10 = z11;
        }
        if (!z9 || z10) {
            return;
        }
        dVar.B = true;
    }

    public static void b(Vector vector, BufferedReader bufferedReader) throws ConfigParser$ConfigParseError, IOException {
        String strTrim = ((String) vector.get(0)).trim();
        if (!strTrim.startsWith("<") || !strTrim.endsWith(">")) {
            return;
        }
        String strSubstring = strTrim.substring(1, strTrim.length() - 1);
        String str = String.format("</%s>", strSubstring);
        String strSubstring2 = "[[INLINE]]";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                throw new ConfigParser$ConfigParseError(String.format("No endtag </%s> for starttag <%s> found", strSubstring, strSubstring));
            }
            if (line.trim().equals(str)) {
                if (strSubstring2.endsWith("\n")) {
                    strSubstring2 = strSubstring2.substring(0, strSubstring2.length() - 1);
                }
                vector.clear();
                vector.add(strSubstring);
                vector.add(strSubstring2);
                return;
            }
            strSubstring2 = g1.a.y(g1.a.y(strSubstring2, line), "\n");
        }
    }

    public static boolean h(String str) throws ConfigParser$ConfigParseError {
        if (str.equals("udp") || str.equals("udp4") || str.equals("udp6")) {
            return true;
        }
        if (str.equals("tcp-client") || str.equals("tcp") || str.equals("tcp4") || str.endsWith("tcp4-client") || str.equals("tcp6") || str.endsWith("tcp6-client")) {
            return false;
        }
        throw new ConfigParser$ConfigParseError("Unsupported option to --proto ".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Vector k(java.lang.String r17) throws de.blinkt.openvpn.core.ConfigParser$ConfigParseError {
        /*
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            int r1 = r17.length()
            if (r1 != 0) goto Lc
            return r0
        Lc:
            r1 = 1
            java.lang.String r2 = ""
            r8 = r2
            r4 = 0
            r5 = 0
            r6 = 1
            r7 = 0
        L14:
            int r9 = r17.length()
            if (r4 >= r9) goto L21
            r9 = r17
            char r10 = r9.charAt(r4)
            goto L24
        L21:
            r9 = r17
            r10 = 0
        L24:
            r11 = 92
            r12 = 2
            if (r5 != 0) goto L30
            if (r10 != r11) goto L30
            if (r6 == r12) goto L30
            r5 = 1
            goto L9a
        L30:
            r13 = 4
            r14 = 39
            r15 = 3
            r3 = 34
            r11 = 5
            if (r6 != r1) goto L5b
            boolean r16 = java.lang.Character.isWhitespace(r10)
            if (r16 != 0) goto L76
            if (r10 != 0) goto L42
            goto L76
        L42:
            r6 = 59
            if (r10 == r6) goto Lb4
            r6 = 35
            if (r10 != r6) goto L4c
            goto Lb4
        L4c:
            if (r5 != 0) goto L52
            if (r10 != r3) goto L52
            r6 = 3
            goto L76
        L52:
            if (r5 != 0) goto L58
            if (r10 != r14) goto L58
            r6 = 2
            goto L76
        L58:
            r7 = r10
            r6 = 4
            goto L76
        L5b:
            if (r6 != r13) goto L69
            if (r5 != 0) goto L75
            boolean r12 = java.lang.Character.isWhitespace(r10)
            if (r12 != 0) goto L67
            if (r10 != 0) goto L75
        L67:
            r6 = 5
            goto L76
        L69:
            if (r6 != r15) goto L70
            if (r5 != 0) goto L75
            if (r10 != r3) goto L75
            goto L67
        L70:
            if (r6 != r12) goto L76
            if (r10 != r14) goto L75
            goto L67
        L75:
            r7 = r10
        L76:
            if (r6 != r11) goto L7e
            r0.add(r8)
            r8 = r2
            r6 = 1
            r7 = 0
        L7e:
            if (r5 == 0) goto L99
            if (r7 == 0) goto L99
            r5 = 92
            if (r7 == r5) goto L99
            if (r7 == r3) goto L99
            boolean r3 = java.lang.Character.isWhitespace(r7)
            if (r3 != 0) goto L99
            if (r7 != 0) goto L91
            goto L99
        L91:
            de.blinkt.openvpn.core.ConfigParser$ConfigParseError r0 = new de.blinkt.openvpn.core.ConfigParser$ConfigParseError
            java.lang.String r1 = "Options warning: Bad backslash ('\\') usage"
            r0.<init>(r1)
            throw r0
        L99:
            r5 = 0
        L9a:
            if (r7 == 0) goto Lac
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r8)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r8 = r3
        Lac:
            int r3 = r4 + 1
            int r10 = r17.length()
            if (r4 < r10) goto Lb5
        Lb4:
            return r0
        Lb5:
            r4 = r3
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.b.k(java.lang.String):java.util.Vector");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.gv0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.google.android.gms.internal.ads.gv0] */
    public static b m(Context context, ExecutorService executorService, cv0 cv0Var, dv0 dv0Var) {
        hv0 hv0Var = new hv0();
        iv0 iv0Var = new iv0();
        final b bVar = new b();
        bVar.f93a = context;
        bVar.f94b = executorService;
        bVar.f95c = cv0Var;
        bVar.f96d = dv0Var;
        bVar.f97e = hv0Var;
        bVar.f98f = iv0Var;
        if (dv0Var.f3754b) {
            final int i10 = 0;
            bVar.f99g = bVar.o(new Callable(bVar) { // from class: com.google.android.gms.internal.ads.gv0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ android.support.v4.media.b f5085b;

                {
                    this.f5085b = bVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() throws PackageManager.NameNotFoundException {
                    int i11 = i10;
                    android.support.v4.media.b bVar2 = this.f5085b;
                    switch (i11) {
                        case 0:
                            bVar2.getClass();
                            j8 j8VarA0 = x8.a0();
                            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo((Context) bVar2.f93a);
                            String id = advertisingIdInfo.getId();
                            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                                UUID uuidFromString = UUID.fromString(id);
                                byte[] bArr = new byte[16];
                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                                id = Base64.encodeToString(bArr, 11);
                            }
                            if (id != null) {
                                j8VarA0.d();
                                x8.g0((x8) j8VarA0.f9462b, id);
                                boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                                j8VarA0.d();
                                x8.h0((x8) j8VarA0.f9462b, zIsLimitAdTrackingEnabled);
                                j8VarA0.d();
                                x8.t0((x8) j8VarA0.f9462b);
                            }
                            return (x8) j8VarA0.b();
                        default:
                            Context context2 = (Context) bVar2.f93a;
                            return en1.O(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                    }
                }
            });
        } else {
            x8 x8VarZza = hv0Var.zza();
            k4.l lVar = new k4.l();
            lVar.f(x8VarZza);
            bVar.f99g = lVar;
        }
        final int i11 = 1;
        bVar.f100h = bVar.o(new Callable(bVar) { // from class: com.google.android.gms.internal.ads.gv0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ android.support.v4.media.b f5085b;

            {
                this.f5085b = bVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() throws PackageManager.NameNotFoundException {
                int i112 = i11;
                android.support.v4.media.b bVar2 = this.f5085b;
                switch (i112) {
                    case 0:
                        bVar2.getClass();
                        j8 j8VarA0 = x8.a0();
                        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo((Context) bVar2.f93a);
                        String id = advertisingIdInfo.getId();
                        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                            UUID uuidFromString = UUID.fromString(id);
                            byte[] bArr = new byte[16];
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                            id = Base64.encodeToString(bArr, 11);
                        }
                        if (id != null) {
                            j8VarA0.d();
                            x8.g0((x8) j8VarA0.f9462b, id);
                            boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                            j8VarA0.d();
                            x8.h0((x8) j8VarA0.f9462b, zIsLimitAdTrackingEnabled);
                            j8VarA0.d();
                            x8.t0((x8) j8VarA0.f9462b);
                        }
                        return (x8) j8VarA0.b();
                    default:
                        Context context2 = (Context) bVar2.f93a;
                        return en1.O(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                }
            }
        });
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0458 A[PHI: r8
      0x0458: PHI (r8v62 int) = (r8v61 int), (r8v63 int) binds: [B:176:0x0456, B:173:0x0452] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final h6.d c() throws de.blinkt.openvpn.core.ConfigParser$ConfigParseError, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2119
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.b.c():h6.d");
    }

    public final Vector d(int i10, int i11, String str) throws ConfigParser$ConfigParseError {
        Vector<Vector> vector = (Vector) ((HashMap) this.f99g).get(str);
        if (vector == null) {
            return null;
        }
        for (Vector vector2 : vector) {
            if (vector2.size() < i10 + 1 || vector2.size() > i11 + 1) {
                throw new ConfigParser$ConfigParseError(String.format(Locale.getDefault(), "Option %s has %d parameters, expected between %d and %d", str, Integer.valueOf(vector2.size() - 1), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
        }
        ((HashMap) this.f99g).remove(str);
        return vector;
    }

    public final Vector e(int i10, int i11, String str) throws ConfigParser$ConfigParseError {
        Vector vectorD = d(i10, i11, str);
        if (vectorD == null) {
            return null;
        }
        return (Vector) vectorD.lastElement();
    }

    public final String f(Vector vector) {
        Iterator it = vector.iterator();
        String strY = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        while (it.hasNext()) {
            Vector<String> vector2 = (Vector) it.next();
            if (!g(vector2)) {
                if (vector2.size() == 2 && "extra-certs".equals(vector2.get(0))) {
                    StringBuilder sbS = g1.a.s(strY);
                    sbS.append(d.j((String) vector2.get(0), (String) vector2.get(1)));
                    strY = sbS.toString();
                } else {
                    for (String str : vector2) {
                        StringBuilder sbS2 = g1.a.s(strY);
                        sbS2.append(d.k(str));
                        sbS2.append(" ");
                        strY = sbS2.toString();
                    }
                    strY = g1.a.y(strY, "\n");
                }
            }
        }
        return strY;
    }

    public final boolean g(Vector vector) {
        for (String[] strArr : (String[][]) this.f96d) {
            if (vector.size() >= strArr.length) {
                boolean z9 = true;
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    if (!strArr[i10].equals(vector.get(i10))) {
                        z9 = false;
                    }
                }
                if (z9) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void i(Reader reader) throws ConfigParser$ConfigParseError, IOException {
        HashMap map = new HashMap();
        map.put("server-poll-timeout", "timeout-connect");
        BufferedReader bufferedReader = new BufferedReader(reader);
        int i10 = 0;
        while (true) {
            try {
                String line = bufferedReader.readLine();
                i10++;
                if (line == null) {
                    return;
                }
                if (i10 == 1) {
                    if (line.startsWith("PK\u0003\u0004") || line.startsWith("PK\u0007\u00008")) {
                        break;
                    } else if (line.startsWith("\ufeff")) {
                        line = line.substring(1);
                    }
                }
                if (line.startsWith("# OVPN_ACCESS_SERVER_")) {
                    String[] strArrSplit = line.split("#\\sOVPN_ACCESS_SERVER_", 2)[1].split("=", 2);
                    Vector vector = new Vector();
                    Collections.addAll(vector, strArrSplit);
                    ((HashMap) this.f100h).put((String) vector.get(0), vector);
                } else {
                    Vector vectorK = k(line);
                    if (vectorK.size() != 0) {
                        if (((String) vectorK.get(0)).startsWith("--")) {
                            vectorK.set(0, ((String) vectorK.get(0)).substring(2));
                        }
                        b(vectorK, bufferedReader);
                        String str = (String) vectorK.get(0);
                        if (map.get(str) != null) {
                            str = (String) map.get(str);
                        }
                        if (!((HashMap) this.f99g).containsKey(str)) {
                            ((HashMap) this.f99g).put(str, new Vector());
                        }
                        ((Vector) ((HashMap) this.f99g).get(str)).add(vectorK);
                    }
                }
            } catch (OutOfMemoryError e10) {
                throw new ConfigParser$ConfigParseError("File too large to parse: " + e10.getLocalizedMessage());
            }
        }
        throw new ConfigParser$ConfigParseError("Input looks like a ZIP Archive. Import is only possible for OpenVPN config files (.ovpn/.conf)");
    }

    public final n0.c j(j6.a aVar) throws ConfigParser$ConfigParseError {
        j6.a aVarA;
        if (aVar != null) {
            try {
                aVarA = aVar.a();
            } catch (CloneNotSupportedException unused) {
                return null;
            }
        } else {
            aVarA = new j6.a();
        }
        Vector vectorE = e(1, 1, "port");
        if (vectorE != null) {
            aVarA.f14358b = (String) vectorE.get(1);
        }
        Vector vectorE2 = e(1, 1, "rport");
        if (vectorE2 != null) {
            aVarA.f14358b = (String) vectorE2.get(1);
        }
        Vector vectorE3 = e(1, 1, "proto");
        if (vectorE3 != null) {
            aVarA.f14359d = h((String) vectorE3.get(1));
        }
        Vector vectorE4 = e(1, 1, "connect-timeout");
        int i10 = 0;
        if (vectorE4 != null) {
            try {
                aVarA.f14363s = Integer.parseInt((String) vectorE4.get(1));
            } catch (NumberFormatException e10) {
                throw new ConfigParser$ConfigParseError(String.format("Argument to connect-timeout (%s) must to be an integer: %s", vectorE4.get(1), e10.getLocalizedMessage()));
            }
        }
        Vector vectorE5 = e(1, 2, "socks-proxy");
        if (vectorE5 == null) {
            vectorE5 = e(2, 2, "http-proxy");
        }
        if (vectorE5 != null) {
            if (((String) vectorE5.get(0)).equals("socks-proxy")) {
                aVarA.f14364t = 3;
                aVarA.f14366v = "1080";
            } else {
                aVarA.f14364t = 2;
            }
            aVarA.f14365u = (String) vectorE5.get(1);
            if (vectorE5.size() >= 3) {
                aVarA.f14366v = (String) vectorE5.get(2);
            }
        }
        Vector vectorE6 = e(1, 1, "http-proxy-user-pass");
        if (vectorE6 != null) {
            String[] strArrSplit = d.e((String) vectorE6.get(1)).split("\n");
            if (strArrSplit.length >= 2) {
                aVarA.f14368x = strArrSplit[0];
                aVarA.f14369y = strArrSplit[1];
                aVarA.f14367w = true;
            }
        }
        Vector<Vector> vectorD = d(1, 3, "remote");
        Vector vector = new Vector();
        for (Map.Entry entry : ((HashMap) this.f99g).entrySet()) {
            if (aVar != null || ((HashSet) this.f98f).contains(entry.getKey())) {
                aVarA.f14360f += f((Vector) entry.getValue());
                vector.add((String) entry.getKey());
            }
        }
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            ((HashMap) this.f99g).remove((String) it.next());
        }
        String str = aVarA.f14360f;
        if (str != null && !RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(str.trim())) {
            aVarA.f14361h = true;
        }
        if (vectorD == null) {
            vectorD = new Vector();
        }
        j6.a[] aVarArr = new j6.a[vectorD.size()];
        for (Vector vector2 : vectorD) {
            try {
                aVarArr[i10] = aVarA.a();
            } catch (CloneNotSupportedException unused2) {
            }
            int size = vector2.size();
            if (size == 2) {
                aVarArr[i10].f14357a = (String) vector2.get(1);
            } else {
                if (size != 3) {
                    if (size == 4) {
                        aVarArr[i10].f14359d = h((String) vector2.get(3));
                    }
                }
                aVarArr[i10].f14358b = (String) vector2.get(2);
                aVarArr[i10].f14357a = (String) vector2.get(1);
            }
            i10++;
        }
        return new n0.c(aVarA, aVarArr);
    }

    public final HashMap l() {
        HashMap mapN = n();
        b bVar = (b) this.f94b;
        jv0 jv0Var = (jv0) bVar.f97e;
        k4.l lVar = (k4.l) bVar.f99g;
        x8 x8VarZza = jv0Var.zza();
        if (lVar.d()) {
            x8VarZza = (x8) lVar.b();
        }
        mapN.put("gai", Boolean.valueOf(((dv0) this.f93a).f3754b));
        mapN.put("did", x8VarZza.x0());
        mapN.put("dst", Integer.valueOf(x8VarZza.m0() - 1));
        mapN.put("doo", Boolean.valueOf(x8VarZza.j0()));
        aa aaVar = (aa) this.f97e;
        if (aaVar != null) {
            mapN.put("nt", Long.valueOf(aaVar.zza()));
        }
        pa paVar = (pa) this.f98f;
        if (paVar != null) {
            mapN.put("vs", Long.valueOf(paVar.f7843d ? paVar.f7841b - paVar.f7840a : -1L));
            pa paVar2 = (pa) this.f98f;
            long j10 = paVar2.f7842c;
            paVar2.f7842c = -1L;
            mapN.put("vf", Long.valueOf(j10));
        }
        return mapN;
    }

    public final HashMap n() {
        HashMap map = new HashMap();
        dv0 dv0Var = (dv0) this.f93a;
        b bVar = (b) this.f94b;
        jv0 jv0Var = (jv0) bVar.f98f;
        k4.l lVar = (k4.l) bVar.f100h;
        x8 x8VarZza = jv0Var.zza();
        if (lVar.d()) {
            x8VarZza = (x8) lVar.b();
        }
        map.put("v", dv0Var.f3753a);
        map.put("gms", Boolean.valueOf(((dv0) this.f93a).f3755c));
        map.put("int", x8VarZza.y0());
        map.put("up", Boolean.valueOf(((fa) this.f96d).f4434a));
        map.put("t", new Throwable());
        u uVar = (u) this.f99g;
        if (uVar != null) {
            map.put("tcq", Long.valueOf(uVar.f9321b));
            map.put("tpq", Long.valueOf(((u) this.f99g).f9322c));
            map.put("tcv", Long.valueOf(((u) this.f99g).f9323d));
            map.put("tpv", Long.valueOf(((u) this.f99g).f9324e));
            map.put("tchv", Long.valueOf(((u) this.f99g).f9325f));
            map.put("tphv", Long.valueOf(((u) this.f99g).f9326g));
            map.put("tcc", Long.valueOf(((u) this.f99g).f9327h));
            map.put("tpc", Long.valueOf(((u) this.f99g).f9328i));
        }
        return map;
    }

    public final k4.l o(gv0 gv0Var) {
        Executor executor = (Executor) this.f94b;
        z3.a.m(executor, "Executor must not be null");
        k4.l lVar = new k4.l();
        executor.execute(new j(lVar, gv0Var, 27));
        lVar.f14683b.e(new i((Executor) this.f94b, new jp0(29, this)));
        lVar.i();
        return lVar;
    }

    public b(int i10) {
        if (i10 != 5) {
            return;
        }
        this.f94b = new String[]{"config", "tls-server"};
        this.f95c = new String[]{"tls-client", "allow-recursive-routing", "askpass", "auth-nocache", "up", "down", "route-up", "ipchange", "route-pre-down", "auth-user-pass-verify", "block-outside-dns", "client-cert-not-required", "dhcp-release", "dhcp-renew", "dh", "group", "ip-win32", "ifconfig-nowarn", "management-hold", "management", "management-client", "management-query-remote", "management-query-passwords", "management-query-proxy", "management-external-key", "management-forget-disconnect", "management-signal", "management-log-cache", "management-up-down", "management-client-user", "management-client-group", "pause-exit", "preresolve", "plugin", "machine-readable-output", "persist-key", "push", "register-dns", "route-delay", "route-gateway", "route-metric", "route-method", NotificationCompat.CATEGORY_STATUS, "script-security", "show-net-up", "suppress-timestamps", "tap-sleep", "tmp-dir", "tun-ipv6", "topology", "user", "win-sys"};
        this.f96d = new String[][]{new String[]{"setenv", "IV_GUI_VER"}, new String[]{"setenv", "IV_SSO"}, new String[]{"setenv", "IV_PLAT_VER"}, new String[]{"setenv", "IV_OPENVPN_GUI_VERSION"}, new String[]{"engine", "dynamic"}, new String[]{"setenv", "CLIENT_CERT"}, new String[]{"resolv-retry", App.f17100w.f17415a.getInt("setTimeout", 10) + RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED}};
        this.f97e = new String[]{"local", "remote", "float", "port", "connect-retry", "connect-timeout", "connect-retry-max", "link-mtu", "tun-mtu", "tun-mtu-extra", "fragment", "mtu-disc", "local-port", "remote-port", "bind", "nobind", "proto", "http-proxy", "http-proxy-retry", "http-proxy-timeout", "http-proxy-option", "socks-proxy", "socks-proxy-retry", "http-proxy-user-pass", "explicit-exit-notify"};
        this.f98f = new HashSet(Arrays.asList((String[]) this.f97e));
        this.f99g = new HashMap();
        this.f100h = new HashMap();
    }
}
