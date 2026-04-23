package h6;

import android.content.Context;
import android.security.KeyChain;
import android.security.KeyChainException;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.en1;
import de.blinkt.openvpn.core.OpenVPNService;
import j6.a0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.UUID;
import java.util.Vector;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Serializable, Cloneable {
    public String A;
    public boolean B;
    public boolean C;
    public String D;
    public boolean E;
    public boolean F;
    public String G;
    public String H;
    public String I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public String N;
    public String O;
    public boolean P;
    public boolean Q;
    public String R;
    public boolean S;
    public String T;
    public String U;
    public String V;
    public String W;
    public int X;
    public String Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14122a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f14123a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14124b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f14125b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public j6.a[] f14126c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14127d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f14128d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public HashSet f14129e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14130f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f14131f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public String f14132g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f14133h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f14134h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f14135i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f14136j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f14137k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f14138l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f14139m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public transient PrivateKey f14140n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public UUID f14141o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f14142p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f14143q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f14144q0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f14145s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14146t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f14147u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14148v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f14149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f14150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f14151y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14152z;

    public static String b(String str) {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length == 1) {
            strArrSplit = str.concat("/32").split("/");
        }
        if (strArrSplit.length != 2) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(strArrSplit[1]);
            if (i10 >= 0 && i10 <= 32) {
                long j10 = 4294967295 << (32 - i10);
                return strArrSplit[0] + "  " + String.format(Locale.ENGLISH, "%d.%d.%d.%d", Long.valueOf((4278190080L & j10) >> 24), Long.valueOf((16711680 & j10) >> 16), Long.valueOf((65280 & j10) >> 8), Long.valueOf(j10 & 255));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Vector d(String str) {
        Vector vector = new Vector();
        if (str == null) {
            return vector;
        }
        for (String str2 : str.split("[\n \t]")) {
            if (!str2.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
                String strB = b(str2);
                if (strB == null) {
                    return vector;
                }
                vector.add(strB);
            }
        }
        return vector;
    }

    public static String e(String str) {
        return !str.contains("[[INLINE]]") ? str : str.substring(str.indexOf("[[INLINE]]") + 10);
    }

    public static void f() throws KeyChainException {
        throw new KeyChainException("Alias or external auth provider name not set");
    }

    public static String j(String str, String str2) {
        if (str2 == null) {
            return String.format("%s %s\n", str, "file missing in config profile");
        }
        if (!str2.startsWith("[[INLINE]]") && !str2.startsWith("[[NAME]]")) {
            return String.format(Locale.ENGLISH, "%s %s\n", str, k(str2));
        }
        return String.format(Locale.ENGLISH, "<%s>\n%s\n</%s>\n", str, e(str2), str);
    }

    public static String k(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n");
        if (strReplace.equals(str) && !strReplace.contains(" ") && !strReplace.contains("#") && !strReplace.contains(";") && !strReplace.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)) {
            return str;
        }
        return "\"" + strReplace + '\"';
    }

    public final int a(Context context) {
        String str;
        en1.p(context).getBoolean("ovpn3", false);
        int i10 = this.f14122a;
        if (i10 == 2 || i10 == 7 || i10 == 8) {
            return R.string.pp;
        }
        if ((i10 == 0 || i10 == 5) && TextUtils.isEmpty(this.f14145s)) {
            return R.string.pj;
        }
        if (this.E && this.X == 0) {
            return R.string.g6;
        }
        if ((!this.C || this.f14122a == 4) && ((str = this.f14151y) == null || b(str) == null)) {
            return R.string.kp;
        }
        if (!this.B && ((!TextUtils.isEmpty(this.D) && d(this.D).size() == 0) || (!TextUtils.isEmpty(this.f14123a0) && d(this.f14123a0).size() == 0))) {
            return R.string.fm;
        }
        if (this.f14148v && TextUtils.isEmpty(this.f14133h)) {
            return R.string.mv;
        }
        int i11 = this.f14122a;
        if ((i11 == 5 || i11 == 0) && (TextUtils.isEmpty(this.f14127d) || TextUtils.isEmpty(this.f14143q))) {
            return R.string.mu;
        }
        int i12 = this.f14122a;
        if ((i12 == 0 || i12 == 5) && TextUtils.isEmpty(this.f14145s)) {
            return R.string.mt;
        }
        boolean z9 = true;
        for (j6.a aVar : this.f14126c0) {
            if (aVar.f14362q) {
                z9 = false;
            }
        }
        if (z9) {
            return R.string.tn;
        }
        for (j6.a aVar2 : this.f14126c0) {
            if (aVar2.f14364t == 4) {
                if (m()) {
                    return R.string.hn;
                }
                if (!a0.a(context)) {
                    return R.string.pq;
                }
            }
        }
        return R.string.pn;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String c(android.content.ContextWrapper r18) {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.d.c(android.content.ContextWrapper):java.lang.String");
    }

    public final Object clone() {
        d dVar = (d) super.clone();
        dVar.f14141o0 = UUID.randomUUID();
        dVar.f14126c0 = new j6.a[this.f14126c0.length];
        j6.a[] aVarArr = this.f14126c0;
        int length = aVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            dVar.f14126c0[i11] = aVarArr[i10].a();
            i10++;
            i11++;
        }
        dVar.f14129e0 = (HashSet) this.f14129e0.clone();
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f14141o0.equals(((d) obj).f14141o0);
        }
        return false;
    }

    public final synchronized String[] g(Context context, int i10) {
        String string;
        String string2;
        String str;
        try {
            Context applicationContext = context.getApplicationContext();
            try {
                try {
                    if (this.f14122a == 8) {
                        f();
                        throw null;
                    }
                    X509Certificate[] x509CertificateArrH = h(applicationContext);
                    if (x509CertificateArrH == null) {
                        throw new c("No certificate returned from Keystore");
                    }
                    if (x509CertificateArrH.length > 1 || !TextUtils.isEmpty(this.f14145s)) {
                        StringWriter stringWriter = new StringWriter();
                        j8.b bVar = new j8.b(stringWriter);
                        for (int i11 = 1; i11 < x509CertificateArrH.length; i11++) {
                            bVar.a(new j8.a(x509CertificateArrH[i11].getEncoded()));
                        }
                        bVar.close();
                        string = stringWriter.toString();
                    } else {
                        de.blinkt.openvpn.core.c.n(applicationContext.getString(R.string.l1));
                        string = null;
                    }
                    if (TextUtils.isEmpty(this.f14145s)) {
                        string2 = null;
                    } else {
                        try {
                            Certificate[] certificateArrG = g4.a0.g(this.f14145s);
                            StringWriter stringWriter2 = new StringWriter();
                            j8.b bVar2 = new j8.b(stringWriter2);
                            for (Certificate certificate : certificateArrG) {
                                bVar2.a(new j8.a(certificate.getEncoded()));
                            }
                            bVar2.close();
                            string2 = stringWriter2.toString();
                        } catch (Exception e10) {
                            de.blinkt.openvpn.core.c.j("Could not read CA certificate" + e10.getLocalizedMessage());
                            string2 = null;
                        }
                    }
                    StringWriter stringWriter3 = new StringWriter();
                    if (x509CertificateArrH.length >= 1) {
                        X509Certificate x509Certificate = x509CertificateArrH[0];
                        j8.b bVar3 = new j8.b(stringWriter3);
                        bVar3.a(new j8.a(x509Certificate.getEncoded()));
                        bVar3.close();
                    }
                    String string3 = stringWriter3.toString();
                    if (string2 == null) {
                        str = null;
                    } else {
                        String str2 = string2;
                        str = string;
                        string = str2;
                    }
                    return new String[]{string, str, string3};
                } catch (AssertionError e11) {
                    if (i10 == 0) {
                        return null;
                    }
                    de.blinkt.openvpn.core.c.j(String.format("Failure getting Keystore Keys (%s), retrying", e11.getLocalizedMessage()));
                    try {
                        Thread.sleep(3000L);
                    } catch (InterruptedException unused) {
                        LinkedList linkedList = de.blinkt.openvpn.core.c.f12574a;
                    }
                    return g(applicationContext, i10 - 1);
                }
            } catch (KeyChainException e12) {
                e = e12;
                de.blinkt.openvpn.core.c.i(R.string.kz, e.getLocalizedMessage());
                de.blinkt.openvpn.core.c.h(R.string.l0);
                return null;
            } catch (c e13) {
                e = e13;
                de.blinkt.openvpn.core.c.i(R.string.kz, e.getLocalizedMessage());
                de.blinkt.openvpn.core.c.h(R.string.l0);
                return null;
            } catch (IOException e14) {
                e = e14;
                de.blinkt.openvpn.core.c.i(R.string.kz, e.getLocalizedMessage());
                de.blinkt.openvpn.core.c.h(R.string.l0);
                return null;
            } catch (IllegalArgumentException e15) {
                e = e15;
                de.blinkt.openvpn.core.c.i(R.string.kz, e.getLocalizedMessage());
                de.blinkt.openvpn.core.c.h(R.string.l0);
                return null;
            } catch (InterruptedException e16) {
                e = e16;
                de.blinkt.openvpn.core.c.i(R.string.kz, e.getLocalizedMessage());
                de.blinkt.openvpn.core.c.h(R.string.l0);
                return null;
            } catch (CertificateException e17) {
                e = e17;
                de.blinkt.openvpn.core.c.i(R.string.kz, e.getLocalizedMessage());
                de.blinkt.openvpn.core.c.h(R.string.l0);
                return null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final X509Certificate[] h(Context context) {
        this.f14140n0 = KeyChain.getPrivateKey(context, null);
        return KeyChain.getCertificateChain(context, null);
    }

    public final String i() {
        return this.f14141o0.toString().toLowerCase(Locale.ENGLISH);
    }

    public final void l() {
        switch (this.f14142p0) {
            case 0:
            case 1:
                this.Z = false;
            case 2:
            case 3:
                this.f14126c0 = new j6.a[]{aVar};
                j6.a aVar = new j6.a();
                aVar.f14357a = this.f14137k0;
                aVar.f14358b = this.f14138l0;
                aVar.f14359d = this.f14139m0;
                aVar.f14360f = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                this.f14131f0 = true;
                if (this.f14129e0 == null) {
                    this.f14129e0 = new HashSet();
                }
                if (this.f14126c0 == null) {
                    this.f14126c0 = new j6.a[0];
                    break;
                }
            case 4:
            case 5:
                TextUtils.isEmpty(null);
            case 6:
                for (j6.a aVar2 : this.f14126c0) {
                    if (aVar2.f14364t == 0) {
                        aVar2.f14364t = 1;
                    }
                }
                break;
        }
        this.f14142p0 = 8;
    }

    public final boolean m() {
        String str;
        if (this.M && (str = this.N) != null && str.contains("http-proxy-option ")) {
            return true;
        }
        for (j6.a aVar : this.f14126c0) {
            if (aVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final void n(OpenVPNService openVPNService, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write(c(openVPNService));
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }

    public final String toString() {
        return this.f14124b;
    }
}
