package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f41 extends rt0 implements w71 {
    public long A;
    public long B;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f4394h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4395q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f4397t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final yz f4398u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final yz f4399v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HttpURLConnection f4400w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public InputStream f4401x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4402y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4403z;

    public /* synthetic */ f41(String str, int i10, int i11, boolean z9, yz yzVar) {
        super(true);
        this.f4397t = str;
        this.f4395q = i10;
        this.f4396s = i11;
        this.f4394h = z9;
        this.f4398u = yzVar;
        this.f4399v = new yz();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: IOException -> 0x001f, TRY_LEAVE, TryCatch #0 {IOException -> 0x001f, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:12:0x0021, B:15:0x002c), top: B:19:0x0004 }] */
    @Override // com.google.android.gms.internal.ads.nl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r7, byte[] r8, int r9) throws com.google.android.gms.internal.ads.zzgl {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            goto L35
        L4:
            long r0 = r6.A     // Catch: java.io.IOException -> L1f
            r2 = -1
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L21
            long r2 = r6.B     // Catch: java.io.IOException -> L1f
            long r0 = r0 - r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L18
        L16:
            r7 = -1
            goto L35
        L18:
            long r2 = (long) r9     // Catch: java.io.IOException -> L1f
            long r0 = java.lang.Math.min(r2, r0)     // Catch: java.io.IOException -> L1f
            int r9 = (int) r0     // Catch: java.io.IOException -> L1f
            goto L21
        L1f:
            r7 = move-exception
            goto L36
        L21:
            java.io.InputStream r0 = r6.f4401x     // Catch: java.io.IOException -> L1f
            int r1 = com.google.android.gms.internal.ads.yn0.f10944a     // Catch: java.io.IOException -> L1f
            int r7 = r0.read(r8, r7, r9)     // Catch: java.io.IOException -> L1f
            if (r7 != r4) goto L2c
            goto L16
        L2c:
            long r8 = r6.B     // Catch: java.io.IOException -> L1f
            long r0 = (long) r7     // Catch: java.io.IOException -> L1f
            long r8 = r8 + r0
            r6.B = r8     // Catch: java.io.IOException -> L1f
            r6.c(r7)     // Catch: java.io.IOException -> L1f
        L35:
            return r7
        L36:
            int r8 = com.google.android.gms.internal.ads.yn0.f10944a
            r8 = 2
            com.google.android.gms.internal.ads.zzgl r7 = com.google.android.gms.internal.ads.zzgl.a(r7, r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f41.b(int, byte[], int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0177  */
    @Override // com.google.android.gms.internal.ads.hw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long g(com.google.android.gms.internal.ads.iz0 r24) throws com.google.android.gms.internal.ads.zzgl {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f41.g(com.google.android.gms.internal.ads.iz0):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection o(java.net.URL r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r4 = this;
            java.net.URLConnection r5 = r5.openConnection()
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5
            int r0 = r4.f4395q
            r5.setConnectTimeout(r0)
            int r0 = r4.f4396s
            r5.setReadTimeout(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.internal.ads.yz r1 = r4.f4398u
            java.util.Map r1 = r1.a()
            r0.putAll(r1)
            com.google.android.gms.internal.ads.yz r1 = r4.f4399v
            java.util.Map r1 = r1.a()
            r0.putAll(r1)
            r0.putAll(r12)
            java.util.Set r12 = r0.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L32:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r5.setRequestProperty(r1, r0)
            goto L32
        L4e:
            r0 = 0
            r2 = -1
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r12 != 0) goto L5d
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 != 0) goto L5c
            r6 = 0
            goto L79
        L5c:
            r6 = r0
        L5d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "bytes="
            r12.<init>(r0)
            r12.append(r6)
            java.lang.String r0 = "-"
            r12.append(r0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L75
            long r6 = r6 + r8
            long r6 = r6 + r2
            r12.append(r6)
        L75:
            java.lang.String r6 = r12.toString()
        L79:
            if (r6 == 0) goto L80
            java.lang.String r7 = "Range"
            r5.setRequestProperty(r7, r6)
        L80:
            java.lang.String r6 = r4.f4397t
            if (r6 == 0) goto L89
            java.lang.String r7 = "User-Agent"
            r5.setRequestProperty(r7, r6)
        L89:
            r6 = 1
            if (r6 == r10) goto L8f
            java.lang.String r6 = "identity"
            goto L91
        L8f:
            java.lang.String r6 = "gzip"
        L91:
            java.lang.String r7 = "Accept-Encoding"
            r5.setRequestProperty(r7, r6)
            r5.setInstanceFollowRedirects(r11)
            r6 = 0
            r5.setDoOutput(r6)
            int r6 = com.google.android.gms.internal.ads.iz0.f5729f
            java.lang.String r6 = "GET"
            r5.setRequestMethod(r6)
            r5.connect()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f41.o(java.net.URL, long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    public final URL p(URL url, String str) throws zzgl {
        if (str == null) {
            throw new zzgl("Null location redirect", 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzgl("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), 2001, 1);
            }
            if (this.f4394h || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzgl("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001, 1);
        } catch (MalformedURLException e10) {
            throw new zzgl(e10, 2001, 1);
        }
    }

    public final void q() {
        HttpURLConnection httpURLConnection = this.f4400w;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                fg0.d("Unexpected error while disconnecting", e10);
            }
            this.f4400w = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f4400w;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() {
        try {
            InputStream inputStream = this.f4401x;
            if (inputStream != null) {
                if (this.f4400w != null) {
                    int i10 = yn0.f10944a;
                }
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i11 = yn0.f10944a;
                    throw new zzgl(e10, 2000, 3);
                }
            }
        } finally {
            this.f4401x = null;
            q();
            if (this.f4402y) {
                this.f4402y = false;
                i();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rt0, com.google.android.gms.internal.ads.hw0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f4400w;
        return httpURLConnection == null ? b01.f2859s : new e31(httpURLConnection.getHeaderFields());
    }
}
