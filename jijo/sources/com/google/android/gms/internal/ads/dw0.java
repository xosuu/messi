package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class dw0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qx0 f3760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ou f3761b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpURLConnection f3762d;

    public static dw0 a() {
        vq0 vq0Var = new vq0(11, 0);
        dw0 dw0Var = new dw0();
        dw0Var.f3760a = vq0Var;
        dw0Var.f3761b = null;
        return dw0Var;
    }

    public final HttpURLConnection c(ou ouVar) {
        this.f3760a = new b4.j(-1, 12);
        this.f3761b = ouVar;
        Integer num = 265;
        num.intValue();
        ((Integer) this.f3760a.mo3zza()).intValue();
        ou ouVar2 = this.f3761b;
        ouVar2.getClass();
        Set set = mw.f7065q;
        zzu.zzw();
        int iIntValue = ((Integer) zzba.zzc().a(eg.f4133t)).intValue();
        URL url = new URL(ouVar2.f7670a);
        int i10 = 0;
        while (true) {
            i10++;
            if (i10 > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
            uRLConnectionOpenConnection.setReadTimeout(iIntValue);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            zzl zzlVar = new zzl(null);
            zzlVar.zzc(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            zzlVar.zze(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f3762d = httpURLConnection;
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                throw new IOException("Protocol is null");
            }
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new IOException("Unsupported scheme: ".concat(protocol));
            }
            zzm.zze("Redirecting to ".concat(headerField));
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f3762d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
