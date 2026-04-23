package j6;

import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable, Cloneable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14367w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f14357a = "eprodev.org";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14358b = "80";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f14359d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f14360f = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14361h = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14362q = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14363s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14364t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f14365u = "eprodev.org";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f14366v = "80";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f14368x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f14369y = null;

    public final a a() {
        return (a) super.clone();
    }

    public final String b() {
        StringBuilder sbS = g1.a.s(g1.a.y("remote " + this.f14357a, " "));
        sbS.append(this.f14358b);
        String string = sbS.toString();
        String strY = this.f14359d ? g1.a.y(string, " udp\n") : g1.a.y(string, " tcp-client\n");
        if (this.f14363s != 0) {
            StringBuilder sbS2 = g1.a.s(strY);
            sbS2.append(String.format(Locale.US, " connect-timeout  %d\n", Integer.valueOf(this.f14363s)));
            strY = sbS2.toString();
        }
        if (c() && this.f14364t == 2) {
            StringBuilder sbS3 = g1.a.s(strY);
            Locale locale = Locale.US;
            sbS3.append(String.format(locale, "http-proxy %s %s\n", this.f14365u, this.f14366v));
            strY = sbS3.toString();
            if (this.f14367w) {
                StringBuilder sbS4 = g1.a.s(strY);
                sbS4.append(String.format(locale, "<http-proxy-user-pass>\n%s\n%s\n</http-proxy-user-pass>\n", this.f14368x, this.f14369y));
                strY = sbS4.toString();
            }
        }
        if (c() && this.f14364t == 3) {
            StringBuilder sbS5 = g1.a.s(strY);
            sbS5.append(String.format(Locale.US, "socks-proxy %s %s\n", this.f14365u, this.f14366v));
            strY = sbS5.toString();
        }
        if (TextUtils.isEmpty(this.f14360f) || !this.f14361h) {
            return strY;
        }
        StringBuilder sbS6 = g1.a.s(strY);
        sbS6.append(this.f14360f);
        return g1.a.y(sbS6.toString(), "\n");
    }

    public final boolean c() {
        return this.f14361h && this.f14360f.contains("http-proxy-option ");
    }

    public final Object clone() {
        return (a) super.clone();
    }
}
